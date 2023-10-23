grammar Malt;

options {
	language = Java;
}

@lexer::header {
	package compilerPackage;
}

@header {
	package compilerPackage;
}

@members {
	Handler h;
	
	void initHandler () {
	h = new Handler();
	}
}



parseJava
@init{initHandler();}
	:
		(/*instrRule |*/ functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF 
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
		|  listRule[null,null]
		|  formatText 
		| quickLinkRule
		| horizontalRule
		) SE) | forRule 
		
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
		f=FUN n=VAR {h.declareFunCl(className,$n);} LP (argumentsRule[className, $n])? RP LCB ((fieldRule[className,$n]) | (assignRule[className, $n]))+ RCB
		{System.out.println("    - Ho riconosciuto una funzione");}
;


argumentsRule [Token className, Token funcName]
	: 	
		t=argumentTypeRule n=VAR {h.declareArg($className, $funcName, t, $n);} (CM t=argumentTypeRule n=VAR {h.declareArg($className, $funcName, t, $n);})*
;


argumentTypeRule returns [Token type]
	:
		(res=titleTypeRule {t = res;} | t=TEXT | t=BLOCKQUOTE | t=OLIST | t=ULIST | t=TLIST | t=CODEBLOCK | t=LINK | t=IMG | t=TABLE | t=FORMATTEXT | t=LIST) {type = $t;}
;


forRule
	:
		FOR LP VAR IN VAR RP LCB (/*instrRule |*/ fieldRule[null,null])+ RCB
		{System.out.println("    - Ho riconosciuto un for");}
; // TODO: sistemare instrRule e fieldRule + inserire parametri ereditati


classRule
	:
		f=CLASS n=VAR {h.declareFunCl($n, null);} LCB fieldRule[$n,null]* (functionRule[$n])* RCB
		{System.out.println("    - Ho riconosciuto una classe");}
;


fieldRule [Token className, Token functionName]
	:
		(( fieldTitleRule [className, functionName] 
		| fieldText [className, functionName] 
		| fieldBlockQuoteRule [className, functionName] 
		| fieldOlistRule [className, functionName] 
		| fieldUlistRule [className, functionName]
		| fieldTlistRule [className, functionName]
		| fieldCodeBlockRule [className, functionName]
		| fieldTableRule [className, functionName] 
		| fieldImageRule [className, functionName]
		| fieldLinkRule [className, functionName] 
		| listRule [className, functionName] 
		| fieldFormatText [className, functionName]) SE) | forRule
; // TODO: sistemare forRule


fieldTitleRule [Token className, Token functionName]
	:
		t=titleTypeRule n=VAR {h.declareNew($className, $functionName, t, $n);} (assignTitleRule[$className, $functionName, $n])? 
;


fieldText [Token className, Token functionName] 
	:
		t=TEXT n=VAR {h.declareNew(className, functionName, $t, $n);} (assignString[$className, $functionName, $n])?
;


fieldBlockQuoteRule [Token className, Token functionName]
	:
		t=BLOCKQUOTE n=VAR {h.declareNew(className, functionName, $t, $n);}  (assignString[$className, $functionName, $n])?
;


fieldOlistRule [Token className, Token functionName]
	:
		t=OLIST n=VAR {h.declareNew(className, functionName, $t, $n);} (assignTextListRule[$className, $functionName, $n])? 
;


fieldUlistRule [Token className, Token functionName]
	:
		t=ULIST n=VAR {h.declareNew(className, functionName, $t, $n);} (assignTextListRule[$className, $functionName, $n])? 
;


fieldTlistRule [Token className, Token functionName]
	:
		t=TLIST n=VAR {h.declareNew(className, functionName, $t, $n);} (assignTextListRule[$className, $functionName, $n])?
;


fieldCodeBlockRule [Token className, Token functionName]
	:
		t=CODEBLOCK (LP (~(LP | RP | '"'))* RP)? n=VAR  {h.declareNew(className, functionName, $t, $n);} (assignString[$className, $functionName, $n])?
;


fieldTableRule [Token className, Token functionName]
	:
		t=TABLE n=VAR {h.declareNew(className, functionName, $t, $n);} (assignTableRule[$className, $functionName, $n])?
;


fieldImageRule [Token className, Token functionName]
	:
		t=IMG n=VAR {h.declareNew(className, functionName, $t, $n);} (assignImageRule[$className, $functionName, $n])?
;


fieldLinkRule [Token className, Token functionName] returns [Token name, Token type]
	:
		t=LINK n=VAR {h.declareNew(className, functionName, $t, $n);} (assignLinkRule[$className, $functionName, $n])?
;


fieldFormatText [Token className, Token functionName]
	:
		t=FORMATTEXT n=VAR {h.declareNew(className, functionName, $t, $n);} (assignString[$className, $functionName, $n])?
;


listRule [Token className, Token functionName]
	:
		t=LIST n=VAR {h.declareNew(className, functionName, $t, $n);} (assignListRule[$className, $functionName, $n])? 
		{System.out.println("    - Ho riconosciuto una lista");}
; // TODO: cambiare string con formattext

// TODO: nei controlli capire come controllare l'esistenza di una varibiale oppure il suo tipo nel caso sia se � stata definita


assignRule [Token className, Token functionName]
	:
	n=VAR (assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n]  | assignTableRule[$className, $functionName, $n]
	     | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE
;


assignTitleRule [Token className, Token functionName, Token name]
	:
		EQ v=STRING refRule? {h.assignVarValue($className, $functionName, $name, $v.getText());}
;


assignString [Token className, Token functionName, Token name]
	:
		EQ v=STRING {h.assignVarValue($className, $functionName, $name, $v.getText());}
;


assignTextListRule [Token className, Token functionName, Token name]
	:
		EQ v=textListRule {h.assignVarValue($className, $functionName, $name, v);}
;


assignTableRule [Token className, Token functionName, Token name]
	:
		EQ v1=talignmentRule? v2=LP v3=trowRule {String cycle = v3;} (t1=CM t2=trowRule {cycle = cycle + $t1.getText() + t2;})* v4=RP {h.assignVarValue($className, $functionName, $name, v1 + $v2.getText() + cycle + $v4.getText());}
;


assignImageRule [Token className, Token functionName, Token name]
	:
		EQI v1=LP v2=STRING {String opt="";} (o1=CM o2=STRING {opt = $o1.getText() + $o2.getText();})? v3=RP {h.assignVarValue($className, $functionName, $name, $v1.getText() + v2.getText() + opt + $v3.getText());}
;


assignLinkRule [Token className, Token functionName, Token name]
	:
		EQL v1=LP {String v2 = "";} (t=STRING {v2=$t.getText();} | ir=imageRule {v2 = ir;}) v3=CM v4=STRING v5=RP {h.assignVarValue($className, $functionName, $name, $v1.getText() + v2 + $v3.getText() 
																	+ $v4.getText() + $v5.getText());}
;


assignListRule [Token className, Token functionName, Token name]
	:
		EQ v1=LSB v2=STRING {String cycle = $v2.getText();} (t1=CM t2=STRING {cycle = cycle + $t1.getText() + $t2.getText();})+ v3=RSB {h.assignVarValue($className, $functionName, $name, $v1.getText() + cycle + $v3.getText());}
; // TODO: cambiare string con formattext

// TODO: VA FATTA LA GESTIONE DEGLI ESCAPE? --> SISTEMARE %g e %i



fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'|'*')
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

//FORMATTEXT	: 	'f' '"' ( ESC_SEQ | ~('\\'|'"'|'['|']'|'*'|I|G) )* '"'; // TODO: sistemare formattext, in particolare %g %i
