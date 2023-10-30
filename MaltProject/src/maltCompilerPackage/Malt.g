grammar Malt;

// i campi delle classi sono automaticamente private
// i metodi delle classi sono automaticamente public (accesso con dot notation)

options {
	language = Java;
}

@lexer::header {
	package maltCompilerPackage;
}

@header {
	package maltCompilerPackage;
	
	import java.util.Vector;
}

@members {

	MaltHandler h;
	
	public MaltHandler getMaltHandler () {
		return h;
	}

	// Override e delega nella gestione degli errori sintattici
	public void displayRecognitionError(String[] tokenNames,
	RecognitionException e) {
		// recupero alcune meta informazioni relative all'errore
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// recuperoil token corrente  
		Token tk = input.LT(1);
		
		// lascio gestire il messaggio all'handler
		h.handleError(tk, hdr, msg);
	}
	
	void initMaltHandler () {
	h = new MaltHandler(input);
	}
}



parseJava
@init{initMaltHandler();}
	:
		(/*instrRule |*/ functionRule[null] | fieldRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF 
		{h.printTable();
		System.out.println("    - Ho riconosciuto un documento Malt");}
; // TODO: aggiungere instrRule


instrRule
	:	((titleRule 
		|  textDeclRule 
		|  blockquoteRule 
		|  olistRule
		|  ulistRule 
		|  tlistRule 
		|  codeBlockRule 
		|  tableRule 
		|  imageRule
		|  linkRule 
		|  listRule[null,null, false]
		|  formatText 
		| quickLinkRule
		| horizontalRule
		) SE) | forRule[null, null]
		
;	


titleRule 
	:
		t=titleTypeRule STRING refRule?
		{System.out.println("    - Ho riconosciuto un titolo");}
;


titleTypeRule returns [Token type]
	:
		(t=TITLE | t=S1TITLE | t=S2TITLE | t=S3TITLE | t=S4TITLE | t=S5TITLE) {type = $t;}
;


refRule
	:
		LCB HA VAR RCB
;


textDeclRule
	:
		t=TEXT STRING 
		{System.out.println("    - Ho riconosciuto un testo");}
;


blockquoteRule
	:
		t=BLOCKQUOTE STRING
		{System.out.println("    - Ho riconosciuto un BLOCKQUOTE");}
;


olistRule
	:
		t=OLIST textListRule
		{System.out.println("    - Ho riconosciuto un OLIST");}
;


textListRule returns [String value]
	:	v1=LP v2=STRING {String cicle = $v2.getText();} (t1=CM t2=STRING {cicle = cicle + $t1.getText() + $t2.getText();})+ v3=RP {value = $v1.getText() + $v2.getText() + cicle + $v3.getText();}
;


ulistRule
	:
		t=ULIST textListRule
		{System.out.println("    - Ho riconosciuto un ULIST");}
;


tlistRule 
	:
		t=TLIST textListRule
		{System.out.println("    - Ho riconosciuto un TLIST");}
;


codeBlockRule 
	:
		t=CODEBLOCK STRING? STRING
		{System.out.println("    - Ho riconosciuto un BLOCKCODE");}
;


horizontalRule
	:
		HRULE
		{System.out.println("    - Ho riconosciuto un HORIZ");}
;


linkRule 
	:
		t=LINK LP (STRING | imageRule) CM STRING RP
		{System.out.println("    - Ho riconosciuto un link");}
;


imageRule returns [String value]
	:
		v1=IMG v2=LP v3=STRING {String cycle = $v3.getText();} (t1=CM t2=STRING {cycle = cycle + $t1.getText() + $t2.getText();})? v4=RP {value = $v1.getText() + $v2.getText() + cycle + $v4.getText();}
		{System.out.println("    - Ho riconosciuto un'immagine");}
;


quickLinkRule
	:
		LAB STRING RAB
		{System.out.println("    - Ho riconosciuto un quicklink");}
;


tableRule
	:
		t=TABLE talignmentRule? LP trowRule (CM trowRule)* RP
		{System.out.println("    - Ho riconosciuto una tabella");}
;


talignmentRule returns [String value]
	:
		v1=LSB v2=alignRule {String cycle = v2;} (t1=CM t2=alignRule {cycle = cycle + $t1.getText() + t2;})* v3=RSB {value = $v1.getText() + cycle + $v3.getText();}
;


alignRule returns [String value]
	:
		(v=L | v=C | v=R) {value = $v.getText();}
;


trowRule returns [String value]
	:
		v1=LSB v2=STRING {String cycle = $v2.getText();} (v3=CM v4=STRING {cycle = cycle + $v3.getText() + $v4.getText();})* v5=RSB {value = $v1.getText() + cycle + $v5.getText();}
;


formatText
	:
		t=FORMATTEXT STRING
		{System.out.println("    - Ho riconosciuto formattext");}
;


functionRule [Token className]
	:
		f=FUN n=VAR {h.declareFunCl(className,$n);} LP (argumentsRule[className, $n])? RP LCB ((fieldRule[className,$n, false]) | (assignRule[className, $n, false]))+ RCB
		{System.out.println("    - Ho riconosciuto una funzione");}
; //TODO: Aggiungere il ritorno dei valori (es. return "pino")
  //TODO: eseguire le istruzioni nella funzione/metodi alla chiamata e non durante la dichiarazione della funzione
  //	  stessa cosa anche per il ciclo for (per iterare più volte)


argumentsRule [Token className, Token functionName]
	: 	
		t=argumentTypeRule n=VAR {h.declareArg($className, $functionName, t, $n);} (CM t=argumentTypeRule n=VAR {h.declareArg($className, $functionName, t, $n);})*
;


argumentTypeRule returns [Token type]
	:
		(res=titleTypeRule {t = res;} | t=TEXT | t=BLOCKQUOTE | t=OLIST | t=ULIST | t=TLIST | t=CODEBLOCK | t=LINK | t=IMG | t=TABLE | t=FORMATTEXT | t=LIST) {type = $t;}
;

functionCallRule [Token className, Token functionName]
	:
		(v1=VAR | v1=DOTVAR) LP {Vector<Token> vct = new Vector<Token>();} (t1=VAR {vct.add($t1);} (CM t2=VAR {vct.add($t2);})*)? RP {h.functionCall(className, functionName, $v1, vct);}
;


forRule [Token className, Token functionName]
	:	forInRule [className, functionName] | forIncrRule[className, functionName]
		
;

forInRule [Token className, Token functionName]
	:	FOR LP n=VAR IN i=VAR RP LCB {h.declareFor($className, $functionName, false, $n, $i);} (/*instrRule |*/ fieldRule[className, functionName, true] | assignRule[className, functionName, true])+ RCB
		{System.out.println("    - Ho riconosciuto un for in");}
;

forIncrRule [Token className, Token functionName]
	:	FOR LP n=VAR CM i=INTEGER RP LCB {h.declareFor($className, $functionName, true, $n, $i);} (/*instrRule |*/ fieldRule[className, functionName, true] | assignRule[className, functionName, true])+ RCB
		{System.out.println("    - Ho riconosciuto un for incr");}
;



classRule
	:
		f=CLASS n=VAR {h.declareFunCl($n, null);} LCB (fieldRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false])* RCB
		{System.out.println("    - Ho riconosciuto una classe");}
;


fieldRule [Token className, Token functionName, boolean inFor]
	:
		(( fieldTitleRule [className, functionName, inFor] 
		| fieldText [className, functionName, inFor] 
		| fieldBlockQuoteRule [className, functionName, inFor] 
		| fieldOlistRule [className, functionName, inFor] 
		| fieldUlistRule [className, functionName, inFor]
		| fieldTlistRule [className, functionName, inFor]
		| fieldCodeBlockRule [className, functionName, inFor]
		| fieldTableRule [className, functionName, inFor] 
		| fieldImageRule [className, functionName, inFor]
		| fieldLinkRule [className, functionName, inFor] 
		| listRule [className, functionName, inFor] 
		| functionCallRule[className, functionName]
		| formatRule[className, functionName, inFor] ) SE) | forRule[className, functionName]
;


fieldTitleRule [Token className, Token functionName, boolean inFor]
	:
		t=titleTypeRule n=VAR {h.declareNew($className, $functionName, inFor, t, $n);} (assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldText [Token className, Token functionName, boolean inFor] 
	:
		t=TEXT n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldBlockQuoteRule [Token className, Token functionName, boolean inFor]
	:
		t=BLOCKQUOTE n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}  (assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldOlistRule [Token className, Token functionName, boolean inFor]
	:
		t=OLIST n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])? 
;


fieldUlistRule [Token className, Token functionName, boolean inFor]
	:
		t=ULIST n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])? 
;


fieldTlistRule [Token className, Token functionName, boolean inFor]
	:
		t=TLIST n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldCodeBlockRule [Token className, Token functionName, boolean inFor]
	:
		t=CODEBLOCK (LP (~(LP | RP | '"'))* RP)? n=VAR  {h.declareNew(className, functionName, inFor, $t, $n);} (assignString[$className, $functionName, $inFor, $n]| assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldTableRule [Token className, Token functionName, boolean inFor]
	:
		t=TABLE n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldImageRule [Token className, Token functionName, boolean inFor]
	:
		t=IMG n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;


fieldLinkRule [Token className, Token functionName, boolean inFor] returns [Token name, Token type]
	:
		t=LINK n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n])?
;



listRule [Token className, Token functionName, boolean inFor]
	:
		t=LIST n=VAR {h.declareNew(className, functionName, inFor, $t, $n);} (assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ])?
		{System.out.println("    - Ho riconosciuto una lista");}
;


assignRule [Token className, Token functionName, boolean inFor]
	:
		n=VAR (assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n]  | assignTableRule[$className, $functionName, inFor, $n]
	     	| assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
;

assignVariableRule [Token className, Token functionName, boolean inFor, Token name]
	:  	EQ v1=VAR {h.assignVarToVar($className, $functionName, $inFor, $name, $v1);}
;


assignTitleRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ v=STRING refRule? {h.assignVarValue($className, $functionName, $inFor, $name, $v.getText());}
;


assignString [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ v=STRING {h.assignVarValue($className, $functionName, $inFor, $name, $v.getText());}
;


assignTextListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ v=textListRule {h.assignVarValue($className, $functionName, $inFor, $name, v);}
;


assignTableRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ v1=talignmentRule? v2=LP v3=trowRule {String cycle = v3;} (t1=CM t2=trowRule {cycle = cycle + $t1.getText() + t2;})* v4=RP {h.assignVarValue($className, $functionName, $inFor, $name, v1 + $v2.getText() + cycle + $v4.getText());}
;


assignImageRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQI v1=LP v2=STRING {String opt="";} (o1=CM o2=STRING {opt = $o1.getText() + $o2.getText();})? v3=RP {h.assignVarValue($className, $functionName, $inFor, $name, $v1.getText() + v2.getText() + opt + $v3.getText());}
;


assignLinkRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQL v1=LP {String v2 = "";} (t=STRING {v2=$t.getText();} | ir=imageRule {v2 = ir;}) v3=CM v4=STRING v5=RP {h.assignVarValue($className, $functionName, $inFor, $name, $v1.getText() + v2 + $v3.getText() 
																	+ $v4.getText() + $v5.getText());}
;


assignListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		{Vector<Token> vct = new Vector<Token>();} EQ LSB  (v=STRING {vct.add($v);}  (CM t=STRING {vct.add($t);})*)? RSB {h.assignListValue($className, $functionName, $inFor, $name, vct);}
;


formatRule [Token className, Token functionName, boolean inFor]
	:	v1=VAR EQ FORMAT LP v2=VAR {Vector<Token> vct = new Vector<Token>();} ( CM v3=VAR {vct.add($v3);} (CM v4=VAR {vct.add($v4);} )+)? RP {h.handleFormat($className, $functionName, $inFor, $v1, $v2, vct );}
;



fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'%'|'\"'|'\''|'\\'|'*')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment 
LETTER : 'a'..'z'|'A'..'Z';

fragment 
DIGIT : '0'..'9';


DO : '.';
CM :',';
SE : ';';
CL :':';
LP : '(';
RP : ')';
LSB : '[';
RSB : ']';
LCB : '{';
RCB : '}';
LAB : '<';
RAB : '>';
HA : '#';
IT		: '*';
BOLD		: '**';
ITBOLD		: '***';
ST		: '~~';
HL		: '==';
SUBS		: '~';
SUPS		: '^';
CODE		: '\'';
HRULE		: '___';
US : '_';
SL : '/';
EX : '!';
QU : '"';
EQ : '=';
GET : '>=';
LET : '<=';

TITLE : 'title';
S1TITLE : 's1title';
S2TITLE : 's2title';
S3TITLE : 's3title';
S4TITLE : 's4title';
S5TITLE : 's5title';
TEXT : 'text';
BLOCKQUOTE : 'blockquote';
OLIST : 'olist';
ULIST : 'ulist';
TLIST : 'tlist';
CODEBLOCK : 'codeblock';
LINK : 'link';
IMG : 'img';
TABLE : 'table';
L : '$l';
C : '$c';
R : '$r';
FORMAT 	: 'format';
FORMATTEXT : 'formattext';
FUN : 'fun';
FOR : 'for';
IN : 'in';
CLASS : 'class';
LIST : 'list';
EQI : '=i';
EQL : '=l';


fragment
G : '%g';
fragment
I : '%i';

VAR	:	(LETTER) (LETTER | DIGIT |'_')*;

DOTVAR	:	VAR ('.' VAR)?;

INTEGER :	DIGIT+;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 		{$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;



//STR 	:	LP (~(LP | RP | '"'))* RP;

STRING	: 	'"' ( ESC_SEQ | ~('\\'|'"'|'['|']'|'*') )* '"';

ERROR_TK  :	. ;