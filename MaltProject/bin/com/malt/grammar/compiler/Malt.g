grammar Malt;

// i campi delle classi sono automaticamente private
// i metodi delle classi sono automaticamente public (accesso con dot notation)
// si assume che nei return ci siano solo variabili o letterali, ma non concatenazioni

options {
	language = Java;
	k = 4;
}

@lexer::header {
	package com.malt.grammar.compiler;
}

@header {
	package com.malt.grammar.compiler;
	
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
		(functionRule[null] 
		| declarationRule[null, null, false] 
		| classRule 
		| assignRule[null, null, false] )+ 
		EOF 
		//{System.out.println("    - Ho riconosciuto un documento Malt");}
;


functionRule [Token className]
	:
		f=FUN 
		n=VAR {h.declareFunCl(className,$n);} 
		LP
		(argumentsRule[className, $n])? 
		RP 
		LCB 
		( declarationRule[className,$n, false] 
		| assignRule[className, $n, false])+ 
		returnRule[className, $n]? 
		RCB
		//{System.out.println("    - Ho riconosciuto una funzione");}
;


argumentsRule [Token className, Token functionName]
	: 	
		t=argumentTypeRule 
		n=VAR {h.declareArg($className, $functionName, t, $n);} 
		( CM 
		  t=argumentTypeRule 
		  n=VAR {h.declareArg($className, $functionName, t, $n);})*
;


argumentTypeRule returns [Token type]
	:
		(res=titleTypeRule {t = res;} 
		| t=(TEXT 
		| BLOCKQUOTE 
		| OLIST 
		| ULIST 
		| TLIST 
		| CODEBLOCK 
		| LINK 
		| IMG 
		| TABLE 
		| FORMATTEXT 
		| LIST)) 
		{type = $t;}
;


functionCallRule [Token className, Token functionName] returns [Token calledFunction]
	:
		(v1=VAR | v1=DOTVAR)
		{calledFunction = $v1;} 
		LP {Vector<Token> vct = new Vector<Token>();} 
		(t1=VAR {vct.add($t1);} (CM t2=VAR {vct.add($t2);})*)? 
		RP {h.functionCall(className, functionName, $v1, vct);}
;


returnRule [Token className, Token functionName]
	:
		RETURN
		(v=VAR | v=STRING)
		SE {h.handleReturn(className,functionName,$v);}
;


forRule [Token className, Token functionName]
	:
		FOR
		LP
		n=VAR
		(forInRule [className, functionName, $n]
		| forIncrRule[className, functionName, $n])
		
;


forInRule [Token className, Token functionName, Token name]
	:
		IN
		i=VAR
		RP
		LCB {h.declareFor($className, $functionName, false, $name, $i);}
		(declarationRule[className, functionName, true]
		| assignRule[className, functionName, true])+
		RCB
;


forIncrRule [Token className, Token functionName, Token name]
	:
		CM
		i=INTEGER
		RP
		LCB {h.declareFor($className, $functionName, true, $name, $i);}
		(declarationRule[className, functionName, true]
		| assignRule[className, functionName, true])+
		RCB
;


classRule
	:
		f=CLASS
		n=VAR {h.declareFunCl($n, null);}
		LCB
		(declarationRule[$n,null, false]
		| functionRule[$n]
		| assignRule[$n, null, false])*
		RCB
;


declarationRule [Token className, Token functionName, boolean inFor]
	:
		(( declareTitleRule [className, functionName, inFor] 
		| declareTextRule [className, functionName, inFor] 
		| declareBlockQuoteRule [className, functionName, inFor] 
		| declareCodeBlockRule [className, functionName, inFor]
		| declareListRule [className, functionName, inFor] 
		| declareTableRule [className, functionName, inFor] 
		| declareImageRule [className, functionName, inFor]
		| declareLinkRule [className, functionName, inFor] 
		| functionCallRule[className, functionName]
		| formatRule[className, functionName, inFor]
		) SE)
		| forRule[className, functionName]
;


declareTitleRule [Token className, Token functionName, boolean inFor]
	:
		t=titleTypeRule
		n=VAR {h.declareNew($className, $functionName, inFor, t, $n);}
		refRule?
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


titleTypeRule returns [Token type]
	:
		t=(TITLE
		| S1TITLE
		| S2TITLE
		| S3TITLE
		| S4TITLE
		| S5TITLE) {type = $t;}
;


refRule
	:
		LCB HA VAR RCB
;


declareTextRule [Token className, Token functionName, boolean inFor] 
	:
		t=TEXT
		n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareBlockQuoteRule [Token className, Token functionName, boolean inFor]
	:
		t=BLOCKQUOTE
		n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareCodeBlockRule [Token className, Token functionName, boolean inFor]
	:
		t=CODEBLOCK
		VAR?
		n=VAR  {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareListRule [Token className, Token functionName, boolean inFor]
	:
		t=typeListRule 
		n=VAR {h.declareNew(className, functionName, inFor, t, $n);} 
		( assignListRule[$className, $functionName, $inFor, $n] 
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


typeListRule returns [Token type]
	:
		t=(LIST
		| OLIST
		| ULIST
		| TLIST) {type = $t;}
;


declareTableRule [Token className, Token functionName, boolean inFor]
	:
		t=TABLE
		n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignTableRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


declareImageRule [Token className, Token functionName, boolean inFor]
	:
		t=IMG
		n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignImageRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


declareLinkRule [Token className, Token functionName, boolean inFor] returns [Token name, Token type]
	:
		t=LINK
		n=VAR {h.declareNew(className, functionName, inFor, $t, $n);}
		(assignLinkRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


assignRule [Token className, Token functionName, boolean inFor]
	:
		n=VAR
		(assignVariableRule[$className, $functionName, inFor, $n]
		| assignExprRule[$className, $functionName, inFor, $n]
		| assignStringRule[$className, $functionName, inFor, $n]
		| assignTextListRule[$className, $functionName, inFor, $n] 
		| assignTableRule[$className, $functionName, inFor, $n]
	     	| assignImageRule[$className, $functionName, inFor, $n]
	     	| assignLinkRule[$className, $functionName, inFor, $n]
	     	| assignListRule[$className, $functionName, inFor, $n]
	     	) SE
;


assignVariableRule [Token className, Token functionName, boolean inFor, Token name]
	:  
		EQ (v1=VAR {h.assignVarToVar($className, $functionName, $inFor, false, $name, $v1);} 
		   | v2=VAR
		   LSB
		   n=INTEGER
		   RSB
		   {h.assignListItemToVar($className, $functionName, $inFor, $name, $v2, n);}
		   | v3=functionCallRule[$className, $functionName]
		   {h.assignVarToVar($className, $functionName, $inFor, true, $name, v3);})
		
;


assignExprRule [Token className, Token functionName, boolean inFor, Token name]
	:  
		{Vector<Token> vct = new Vector<Token>();}
		EQ
		LP
		(v1=STRING|v1=VAR)
		{vct.add($v1);}
		(PLUS
		(v2=STRING|v2=VAR)
		{vct.add($v2);}
		)* RP {h.assignExprToVar($className, $functionName, $inFor, $name, vct);}
;


assignStringRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		v=STRING {h.assignTextPrimitiveVarValue($className, $functionName, $inFor, $name, $v.getText());}
;


assignTextListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		v=textListRule {h.assignComplexVarValue($className, $functionName, $inFor, "list", $name, v);}
;


textListRule returns [String value]
	:
		v1=LP
		v2=STRING {String cicle = $v2.getText();}
		(t1=CM
		t2=STRING {cicle = cicle + $t1.getText() + $t2.getText();}
		)+ v3=RP {value = $v1.getText() + $v2.getText() + cicle + $v3.getText();}
;


assignTableRule [Token className, Token functionName, boolean inFor, Token name]
	:
		{Vector<Vector<Token>> vct_data = new Vector<Vector<Token>>();}
		EQ
		v1=talignmentRule?
		v2=LP
		v3=trowRule {vct_data.add(v3);}
		(t1=CM
		t2=trowRule {vct_data.add(t2);}
		)* v4=RP {h.assignTable($className, $functionName, $inFor, $name, v1, vct_data);}
;

talignmentRule returns [Vector<Token> alignment]
	:
		{Vector<Token> vct = new Vector<Token>();}
		v1=LSB
		v2=alignRule {vct.add(v2);}
		(t1=CM
		t2=alignRule {vct.add(t2);}
		)* v3=RSB {alignment = vct;}
;


alignRule returns [Token value]
	:
		(v=L | v=C | v=R) {value = $v;}
;


trowRule returns [Vector<Token> row]
	:
		{Vector<Token> vct = new Vector<Token>();}
		v1=LSB
		v2=STRING {vct.add($v2);}
		(v3=CM
		v4=STRING {vct.add($v4);}
		)* v5=RSB {row = vct;}
;


assignImageRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQI
		v1=LP
		v2=STRING {String opt="";}
		(o1=CM
		o2=STRING {opt = $o1.getText() + $o2.getText();}
		)? v3=RP {h.assignComplexVarValue($className, $functionName, $inFor, "img", $name,
				$v1.getText() + v2.getText() + opt + $v3.getText());}
;


assignLinkRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQL
		v1=LP {String v2 = "";}
		(t=STRING {v2=$t.getText();} | ir=imageRule {v2 = ir;})
		v3=CM
		v4=STRING
		v5=RP {h.assignComplexVarValue($className, $functionName, $inFor, "link", $name,
			$v1.getText() + v2 + $v3.getText() 
																	+ $v4.getText() + $v5.getText());}
;


imageRule returns [String value]
	:
		v1=IMG
		v2=LP
		v3=STRING {String cycle = $v3.getText();}
		(t1=CM
		t2=STRING {cycle = cycle + $t1.getText() + $t2.getText();}
		)? v4=RP {value = $v1.getText() + $v2.getText() + cycle + $v4.getText();}
;


assignListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		{Vector<Token> vct = new Vector<Token>();}
		EQ
		LSB
		((v=STRING|v=VAR) {vct.add($v);} 
		(CM
		(t=STRING|t=VAR)
		{vct.add($t);}
		)*)?
		RSB {h.assignListValue($className, $functionName, $inFor, $name, vct);}
;


formatRule [Token className, Token functionName, boolean inFor]
	:
		FORMAT
		LP
		v1=VAR
		CM
		v2=VAR {Vector<Token> vct = new Vector<Token>();}
		CM
		v3=VAR {vct.add($v3);}
		(CM
		v4=VAR {vct.add($v4);}
		)*
		RP {h.handleFormat($className, $functionName, $inFor, $v1, $v2, vct);}
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
PLUS : '+';
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
RETURN : 'return';


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