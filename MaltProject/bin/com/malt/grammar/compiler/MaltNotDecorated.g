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
		
		// recupero il token corrente  
		Token tk = input.LT(1);
		
		// lascio gestire il messaggio all'handler
		h.handleError(tk, hdr, msg);
	}
	
	void initMaltHandler () {
	h = new MaltHandler(input);
	}
}



parseJava
@init
	:
		(functionRule[null] 
		| declarationRule[null, null, false] 
		| classRule 
		| assignRule[null, null, false] )+ 
		EOF 
;


functionRule [Token className]
	:
		f=FUN 
		n=VAR 
		LP
		(argumentsRule[className, $n])? 
		RP 
		LCB 
		( declarationRule[className,$n, false] 
		| assignRule[className, $n, false])+ 
		returnRule[className, $n]? 
		RCB
;


argumentsRule [Token className, Token functionName]
	: 	
		t=argumentTypeRule 
		n=VAR 
		( CM 
		  t=argumentTypeRule 
		  n=VAR)*
;


argumentTypeRule returns [Token type]
	:
		(res=titleTypeRule 
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
;


functionCallRule [Token className, Token functionName] returns [Token calledFunction]
	:
		(v1=VAR | v1=DOTVAR) 
		LP 
		(t1=VAR (CM t2=VAR)*)? 
		RP
;


returnRule [Token className, Token functionName]
	:
		RETURN
		(v=VAR | v=STRING)
		SE
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
		LCB
		(declarationRule[className, functionName, true]
		| assignRule[className, functionName, true])+
		RCB
;


forIncrRule [Token className, Token functionName, Token name]
	:
		CM
		i=INTEGER
		RP
		LCB
		(declarationRule[className, functionName, true]
		| assignRule[className, functionName, true])+
		RCB
;


classRule
	:
		f=CLASS
		n=VAR
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
		| listManipulationRule[className, functionName, inFor]
		) SE)
		| forRule[className, functionName]
;


declareTitleRule [Token className, Token functionName, boolean inFor]
	:
		t=titleTypeRule
		n=VAR
		ref=refRule?
		(assignTitleRule[$className, $functionName, $inFor, $n, ref]
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
		| S5TITLE)
;


refRule returns [Token ref]
	:
		LCB HA v=VAR RCB
;	


declareTextRule [Token className, Token functionName, boolean inFor] 
	:
		t=TEXT
		n=VAR
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareBlockQuoteRule [Token className, Token functionName, boolean inFor]
	:
		t=BLOCKQUOTE
		n=VAR
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareCodeBlockRule [Token className, Token functionName, boolean inFor]
	:
		t=CODEBLOCK
		VAR?
		n=VAR
		(assignStringRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n]
		| assignExprRule[$className, $functionName, $inFor, $n])?
;


declareListRule [Token className, Token functionName, boolean inFor]
	:
		t=typeListRule 
		n=VAR 
		( assignListRule[$className, $functionName, $inFor, $n] 
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


typeListRule returns [Token type]
	:
		t=(LIST
		| OLIST
		| ULIST
		| TLIST)
;


declareTableRule [Token className, Token functionName, boolean inFor]
	:
		t=TABLE
		n=VAR
		(assignTableRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


declareImageRule [Token className, Token functionName, boolean inFor]
	:
		t=IMG
		n=VAR
		(assignImageRule[$className, $functionName, $inFor, $n]
		| assignVariableRule[$className, $functionName, $inFor, $n])?
;


declareLinkRule [Token className, Token functionName, boolean inFor] returns [Token name, Token type]
	:
		t=LINK
		n=VAR
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
		EQ (v1=VAR 
		   | v2=VAR
		   LSB
		   n=INTEGER
		   RSB
		   | v3=functionCallRule[$className, $functionName])
;


assignExprRule [Token className, Token functionName, boolean inFor, Token name]
	:  
		EQ
		LP
		(v1=STRING|v1=VAR)
		(PLUS
		(v2=STRING|v2=VAR)
		)* RP
;

assignTitleRule [Token className, Token functionName, boolean inFor, Token name, Token ref]
	:
		EQ
		v=STRING
;


assignStringRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		v=STRING
;


assignTextListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		v=textListRule
;


textListRule returns [String value]
	:
		v1=LP
		v2=STRING
		(t1=CM
		t2=STRING
		)+ v3=RP
;


assignTableRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		v1=talignmentRule?
		v2=LP
		v3=trowRule
		(t1=CM
		t2=trowRule
		)* v4=RP
;

talignmentRule returns [Vector<Token> alignment]
	:
		v1=LSB
		v2=alignRule
		(t1=CM
		t2=alignRule
		)* v3=RSB
;


alignRule returns [Token value]
	:
		(v=L | v=C | v=R)
;


trowRule returns [Vector<Token> row]
	:
		v1=LSB
		v2=STRING
		(v3=CM
		v4=STRING
		)* v5=RSB
;


assignImageRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQI
		v1=LP
		v2=STRING
		(o1=CM
		o2=STRING
		)? v3=RP
;


assignLinkRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQL
		v1=LP
		(t=STRING | ir=imageRule)
		v3=CM
		v4=STRING
		v5=RP
;


imageRule returns [String value]
	:
		v1=IMG
		v2=LP
		v3=STRING
		(t1=CM
		t2=STRING
		)? v4=RP
;


assignListRule [Token className, Token functionName, boolean inFor, Token name]
	:
		EQ
		LSB
		((v=STRING|v=VAR) 
		(CM
		(t=STRING|t=VAR))*)?
		RSB
;


formatRule [Token className, Token functionName, boolean inFor]
	:
		FORMAT
		LP
		v1=VAR
		CM
		v2=VAR
		CM
		v3=VAR
		(CM
		v4=VAR
		)*
		RP
;

listManipulationRule [Token className, Token functionName, boolean inFor]
	:	
		listPushRule [$className, $functionName, $inFor]
		| listRemoveRule [$className, $functionName, $inFor]
;

listPushRule [Token className, Token functionName, boolean inFor]
	:	
		PUSH
		LP
		v1=VAR
		CM
		v2=VAR
		RP
		{h.handleListPush($className, $functionName, $inFor, $v1, $v2);}
;

listRemoveRule [Token className, Token functionName, boolean inFor]
	:	REMOVE
		LP
		v1=VAR
		CM
		idx=(INTEGER | US)
		CM
		v2=(VAR | US)
		RP
		{h.handleListRemove($className, $functionName, $inFor, $v1, $idx, $v2);}
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
PUSH	: 'push';
REMOVE 	:  'remove';


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