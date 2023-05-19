lexer grammar Malt;

//options {
	//language = Java;
//}

@lexer::header {
	//package compilerPackage;
}

titleRule 
	:
		titleTypeRule nameRule EQ textRule refRule?
;

titleTypeRule
	:
		TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE
;

nameRule
	:
		(LETTER | DIGIT)+
;

textRule
	:
		(LETTER | DIGIT | DO | CM | SE | CL | SL | AT)+
; // INSERIRE FORMATTAZIONE, LINK, ... IN TEXT

italicTextRule	
	:
		AS textRule AS
;

boldTextRule
	:
		AS AS textRule AS AS
;

ibTextRule
	:
		AS AS AS textRule AS AS AS
;

strikethroughtTextRule
	:
		TI TI textRule TI TI
;

highlightTextRule
	:
		EQ EQ textRule EQ EQ
;

subscriptTextRule
	:
		TI textRule TI
;

superscriptTextRule
	:
		CI textRule CI
;

codeTextRule
	:	AP textRule AP
;


refRule
	:
		LCB HA ID RCB
;

blockquoteRule 
	:
		BLOCKQUOTE nameRule EQ textRule
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
		bcRule languageRule? textRule bcRule
;

bcRule
	:
		AP AP AP
;

languageRule
	:
		'Java' | 'C' | 'C++'
;

horizontalRule
	:
		UN UN UN
;

linkRule
	:
		LSB (textRule | imageRule) RSB LP textRule RP
;

imageRule
	:
		EX LSB textRule RSB LP textRule (QU textRule QU)? RP
;

quickLinkRule
		:
			LAB textRule RAB
;
// DISTINZIONE TRA TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE

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
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
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
LAB : '<'; // PROBLEMA con LT
RAB : '>'; // PROBLEMA con GT
AS : '*';
TI : '~';
EQ : '=';
CI : '^';
HA : '#';
AP : '\''; // PROBLEMA: ctrl se funziona
UN : '_';
SL : '/';
AT : '@';
EX : '!';
QU : '"';
GT : '>';
LT : '<';
GET : '>=';
LET : '<=';



TITLE : 'title';
S1TITLE : 'stitle';
S2TITLE : 'sstitle';
S3TITLE : 'ssstitle';
S4TITLE : 'sssstitle';
S5TITLE : 'ssssstitle';
BLOCKQUOTE : 'blockquote';
OLIST : 'olist';
ULIST : 'ulist';
TLIST : 'tlist';
TABLE : 'table';
L : 'l';
C : 'c';
R : 'r';



ID:	(LETTER |'_') (LETTER |DIGIT |'_')*;

INTEGER :	DIGIT+;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
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

