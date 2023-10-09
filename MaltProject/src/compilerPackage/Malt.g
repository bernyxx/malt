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
		(instrRule)+
		{System.out.println("    - Ho riconosciuto un documento Malt");}
;

instrRule
	:	(titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule) SE
		{System.out.println("    - Ho riconosciuto un'istruzione");}	
;	

titleRule 
	:
		titleTypeRule (VAR EQ)? subtextRule refRule?
		{System.out.println("    - Ho riconosciuto un titolo");}
;

titleTypeRule
	:
		TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE
;

refRule
	:
		LCB HA VAR RCB
		{System.out.println("    - REF");}
;
// TODO: SOSTITUIRE VAR CON UN TOKEN = (LETTER) (LETTER | DIGIT |'-')*

textDeclRule 
	:
		TEXT (VAR EQ)? textRule
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
		| codeTextRule
		| linkRule
		| quickLinkRule)
;

italicTextRule	
	:
		IT  subtextRule IT // come dire che il primo � inizio e l'ultimo fine ?
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
		STRING
		{System.out.println("    - SUBTEXT");}
;

blockquoteRule 
	:
		BLOCKQUOTE (VAR EQ)? textRule
		{System.out.println("    - Ho riconosciuto un BLOCKQUOTE");}
;

olistRule 
	:
		OLIST (VAR EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un OLIST");}
;

textListRule
	:	LP STRING (CM STRING)+ RP
;

ulistRule 
	:
		ULIST (VAR EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un ULIST");}
;

tlistRule 
	:
		TLIST (VAR EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un TLIST");}
;

codeBlockRule 
	:
		CODEBLOCK STR? (VAR EQ)? textRule
		{System.out.println("    - Ho riconosciuto un BLOCKCODE");}
;

horizontalRule
	:
		HRULE
		{System.out.println("    - Ho riconosciuto un HORIZ");}
;

linkRule
	:
		LINK (VAR EQ)? LP (textRule | imageRule) CM STR RP
		{System.out.println("    - Ho riconosciuto un link");}
;

imageRule
	:
		IMG (VAR EQ)? LP STR (CM STR)? RP
		{System.out.println("    - Ho riconosciuto un'immagine");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

quickLinkRule
	:
		LAB (((HTTP | HTTPS)? subtextRule DOTCOM) | (subtextRule AT subtextRule DOTCOM)) RAB
		{System.out.println("    - Ho riconosciuto un quicklink");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

tableRule 
	:
		TABLE (VAR EQ)? talignmentRule? LP trowRule (CM trowRule)* RP
		{System.out.println("    - Ho riconosciuto una tabella");}
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
		LSB STRING (CM STRING)* RSB
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA


// TODO: VA FATTA GESTIONE ESCAPE?





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

// TODO: ELIMINARE TOKEN INUTILI
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
CODEBLOCK : 'codeblock';
LINK : 'link';
IMG : 'img';
TABLE : 'table';
L : 'l';
C : 'c';
R : 'r';
HTTP : 'http://';
HTTPS : 'https://';
DOTCOM : '.com';

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



STR 	:	LP (~(LP | RP | '"'))* RP;

STRING	: 	'"' ( ESC_SEQ | ~('\\'|'"'|'['|']'|'*') )* '"';

//CHAR	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\''; //--> VA COMMENTATO PERCH� SENN� NON RICONOSCE codeTextRule
