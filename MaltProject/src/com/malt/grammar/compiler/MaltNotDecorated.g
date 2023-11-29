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
@init
	:
		(functionRule
		| declarationRule
		| classRule 
		| assignRule)+ 
		EOF 
;


functionRule
	:
		FUN 
		VAR
		LP
		(argumentsRule)? 
		RP 
		LCB 
		( declarationRule
		| assignRule)+ 
		returnRule? 
		RCB
;


argumentsRule
	: 	
		argumentTypeRule 
		VAR
		( CM 
		  argumentTypeRule 
		  VAR)*
;


argumentTypeRule
	:
		(titleTypeRule
		| (TEXT 
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


functionCallRule
	:
		(VAR |DOTVAR) 
		LP
		(VAR (CM VAR )*)? 
		RP
;


returnRule
	:
		RETURN
		(VAR | STRING)
		SE
;


forRule
	:
		FOR
		LP
		VAR
		(forInRule
		| forIncrRule)
		
;


forInRule
	:
		IN
		VAR
		RP
		LCB
		(declarationRule
		| assignRule)+
		RCB
;


forIncrRule
	:
		CM
		INTEGER
		RP
		LCB
		(declarationRule
		| assignRule)+
		RCB
;


classRule
	:
		CLASS
		VAR
		LCB
		(declarationRule
		| functionRule
		| assignRule)*
		RCB
;


declarationRule
	:
		(( declareTitleRule 
		| declareTextRule
		| declareBlockQuoteRule
		| declareCodeBlockRule
		| declareListRule
		| declareTableRule 
		| declareImageRule
		| declareLinkRule
		| functionCallRule
		| formatRule
		) SE)
		| forRule
;


declareTitleRule 
	:
		titleTypeRule
		VAR
		refRule?
		(assignStringRule
		| assignVariableRule
		| assignExprRule)?
;


titleTypeRule
	:
		TITLE
		| S1TITLE
		| S2TITLE
		| S3TITLE
		| S4TITLE
		| S5TITLE)
;


refRule
	:
		LCB HA VAR RCB
;


declareTextRule
	:
		TEXT
		VAR
		(assignStringRule
		| assignVariableRule
		| assignExprRule)?
;


declareBlockQuoteRule
	:
		BLOCKQUOTE
		VAR
		(assignStringRule
		| assignVariableRule
		| assignExprRule)?
;


declareCodeBlockRule
	:
		CODEBLOCK
		VAR?
		VAR  
		(assignStringRule
		| assignVariableRule
		| assignExprRule)?
;


declareListRule
	:
		typeListRule 
		VAR
		( assignListRule
		| assignVariableRule)?
;


typeListRule
	:
		(LIST
		| OLIST
		| ULIST
		| TLIST)
;


declareTableRule
	:
		TABLE
		VAR
		(assignTableRule
		| assignVariableRule)?
;


declareImageRule
	:
		IMG
		VAR
		(assignImageRule
		| assignVariableRule)?
;


declareLinkRule
	:
		LINK
		VAR
		(assignLinkRule
		| assignVariableRule)?
;


assignRule
	:
		VAR
		(assignVariableRule
		| assignExprRule
		| assignStringRule
		| assignTextListRule
		| assignTableRule
	     	| assignImageRule
	     	| assignLinkRule
	     	| assignListRule
	     	) SE
;


assignVariableRule
	:  
		EQ (VAR
		   | VAR
		   LSB
		   INTEGER
		   RSB
		   | functionCallRule)	
;


assignExprRule
	:  
		EQ
		LP
		(STRING|VAR)
		(PLUS
		(STRING|VAR)
		)* RP 
;


assignStringRule
	:
		EQ
		STRING
;


assignTextListRule
	:
		EQ
		textListRule
;


textListRule
	:
		LP
		STRING
		(CM
		STRING
		)+ RP
;


assignTableRule
	:
		EQ
		talignmentRule?
		LP
		trowRule
		(CM
		trowRule
		)* RP
;

talignmentRule
	:
		LSB
		alignRule
		(CM
		alignRule
		)* RSB
;


alignRule
	:
		(L | C | R)
;


trowRule
	:
		LSB
		STRING 
		(CM
		STRING 
		)* RSB 
;


assignImageRule
	:
		EQI
		LP
		STRING
		(CM
		STRING
		)? RP
;


assignLinkRule
	:
		EQL
		LP
		(STRING)
		CM
		STRING
		RP
;


imageRule returns [String value]
	:
		IMG
		LP
		STRING
		(CM
		STRING
		)? RP
;


assignListRule
	:
		EQ
		LSB
		((STRING|VAR)
		(CM
		(STRING|VAR)
		)*)?
		RSB
;


formatRule
	:
		FORMAT
		LP
		VAR
		CM
		VAR
		CM
		VAR
		(CM
		VAR 
		)*
		RP
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


STRING	: 	'"' ( ESC_SEQ | ~('\\'|'"'|'['|']'|'*') )* '"';

ERROR_TK  :	. ;