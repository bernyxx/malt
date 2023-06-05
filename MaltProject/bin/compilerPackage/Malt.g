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
	
}

parseJava
	: 
		titleRule
		(titleRule|textDeclRule)*
		{System.out.println("    - Ho riconosciuto un documento Malt");}
;

titleRule 
	:
		titleTypeRule VAR EQ STRING refRule?
		{System.out.println("    - Ho riconosciuto un titolo");}
;

titleTypeRule
	:
		TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE
;

refRule
	:
		LCB HA ID RCB
;

textDeclRule 
	:
		TEXT VAR EQ textRule
		{System.out.println("    - Ho riconosciuto un testo");}
;

textRule
	:
		(subtextRule
		| italicTextRule
		| boldTextRule
		| ibTextRule
		| strikethroughtTextRule
		| highlightTextRule
		| subscriptTextRule
		| superscriptTextRule
		| codeTextRule)+
; // SISTEMARE FORMATTAZIONE, LINK, ... IN TEXT

italicTextRule	
	:
		IT  subtextRule IT // come dire che il primo è inizio e l'ultimo fine ?
		{System.out.println("    - I");}
;

boldTextRule
	:
		BOLD subtextRule BOLD
		{System.out.println("    - B");}
;

ibTextRule
	:
		ITBOLD subtextRule ITBOLD
		{System.out.println("    - IB");}
;

strikethroughtTextRule
	:
		ST subtextRule ST
		{System.out.println("    - ST");}
;

highlightTextRule
	:
		HL subtextRule HL
		{System.out.println("    - HL");}
;

subscriptTextRule
	:
		SUBS subtextRule SUBS
		{System.out.println("    - SUBS");}
;

superscriptTextRule
	:
		SUPS subtextRule SUPS
		{System.out.println("    - SUPS");}
;

codeTextRule
	:
		CODE subtextRule CODE
		{System.out.println("    - CODE");}
;

subtextRule 
	:
		(VAR | INTEGER | DO | CM | SE | CL )+
		{System.out.println("    - SUBTEXT");}
;

blockquoteRule 
	:
		BLOCKQUOTE VAR EQ textRule
;

olistRule 
	:
		OLIST LP textListRule RP
;

textListRule
	:	textRule (CM textRule)+
;

ulistRule 
	:
		ULIST LP textListRule RP
;

tlistRule 
	:
		TLIST LP textListRule RP
;

blockCodeRule 
	:
		BLOCKCODE languageRule? textRule BLOCKCODE
;

languageRule
	:
		'Java' | 'C' | 'C++'
;

horizontalRule
	:
		HRULE
;

linkRule
	:
		LSB (textRule | imageRule) RSB LP textLinkRule RP
;

textLinkRule
	:
		(subtextRule | SL | AT)+
;

imageRule
	:
		EX LSB textLinkRule RSB LP textLinkRule (QU textRule QU)? RP
;

quickLinkRule
	:
		LAB textLinkRule RAB
;
// DISTINZIONE TRA TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE E TESTO FORMATTATO-DIDASCALIA IMMAGINE-TESTO TABELLA

tableRule 
	:
		TABLE talignmentRule? LP trowRule (CM trowRule)* RP
;

talignmentRule
	:
		LSB alignRule (CM alignRule)* RSB
;

alignRule
	:
		L | C | R
;

trowRule
	:
		LSB textRule (CM textRule)* RSB;

// GESTIONE ESCAPE





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
CODE		: '\''; // PROBLEMA: ctrl se funziona
BLOCKCODE	: '\'\'\'';
HRULE		: '___';
SL : '/';
AT : '@';
EX : '!';
QU : '"';
EQ : '=';
GET : '>=';
LET : '<=';

TITLE : 'title';
S1TITLE : 'stitle';
S2TITLE : 'sstitle';
S3TITLE : 'ssstitle';
S4TITLE : 'sssstitle';
S5TITLE : 'ssssstitle';
TEXT : 'text';
BLOCKQUOTE : 'blockquote';
OLIST : 'olist';
ULIST : 'ulist';
TLIST : 'tlist';
TABLE : 'table';
L : 'l';
C : 'c';
R : 'r';

VAR	:	(LETTER) (LETTER | DIGIT |'_')*;

ID	:	'_' (LETTER) (LETTER | DIGIT |'_')*;

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

STRING	: 	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';

CHAR	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';
