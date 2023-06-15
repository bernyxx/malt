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
		(titleRule)*
		(textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule)+
		{System.out.println("    - Ho riconosciuto un documento Malt");}
;

titleRule 
	:
		titleTypeRule VAR EQ subtextRule+ refRule?
		{System.out.println("    - Ho riconosciuto un titolo");}
;

titleTypeRule
	:
		TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE
;

refRule
	:
		LCB HA ID RCB
		{System.out.println("    - REF");}
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
		| codeTextRule
		| linkRule
		| quickLinkRule)+
;

italicTextRule	
	:
		IT  subtextRule+ IT // come dire che il primo è inizio e l'ultimo fine ?
		{System.out.println("    - I");}
;

boldTextRule
	:
		BOLD subtextRule+ BOLD
		{System.out.println("    - B");}
;

ibTextRule
	:
		ITBOLD subtextRule+ ITBOLD
		{System.out.println("    - IB");}
;

strikethroughtTextRule
	:
		ST subtextRule+ ST
		{System.out.println("    - ST");}
;

highlightTextRule
	:
		HL subtextRule+ HL
		{System.out.println("    - HL");}
;

subscriptTextRule
	:
		SUBS subtextRule+ SUBS
		{System.out.println("    - SUBS");}
;

superscriptTextRule
	:
		SUPS subtextRule+ SUPS
		{System.out.println("    - SUPS");}
;

codeTextRule
	:
		CODE subtextRule+ CODE
		{System.out.println("    - CODE");}
;

subtextRule 
	:
		(VAR | INTEGER | DO | CM | SE | CL)
		{System.out.println("    - SUBTEXT");}
; // TODO: CONSENTIRE DI USARE APOSTROFO NEL TESTO SENZA CONFONDERE CON codeTextRule

blockquoteRule 
	:
		BLOCKQUOTE VAR EQ textRule
		{System.out.println("    - Ho riconosciuto un BLOCKQUOTE");}
;

olistRule 
	:
		OLIST textListRule
		{System.out.println("    - Ho riconosciuto un OLIST");}
;

textListRule
	:	LP VAR (CM VAR)+ RP
;

ulistRule 
	:
		ULIST textListRule
		{System.out.println("    - Ho riconosciuto un ULIST");}
;

tlistRule 
	:
		TLIST textListRule
		{System.out.println("    - Ho riconosciuto un TLIST");}
;

blockCodeRule 
	:
		BLOCKCODE languageRule? textRule BLOCKCODE
		{System.out.println("    - Ho riconosciuto un BLOCKCODE");}
;

languageRule
	:
		JAVALANGUAGE | CLANGUAGE | CPPLANGUAGE
;

horizontalRule
	:
		HRULE
		{System.out.println("    - Ho riconosciuto un HORIZ");}
;

linkRule
	:
		LSB (textRule | imageRule) RSB LP textLinkRule RP
		{System.out.println("    - Ho riconosciuto un link");}
;

textLinkRule
	:
		(subtextRule | SL | AT)+
		{System.out.println("    - LINK");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT-VAR E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

imageRule
	:
		EX LSB textLinkRule RSB LP textLinkRule (QU subtextRule+ QU)? RP
		{System.out.println("    - Ho riconosciuto un'immagine");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT-VAR E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

quickLinkRule
	:
		LAB (((HTTP | HTTPS) subtextRule+ DOTCOM) | (subtextRule+ AT subtextRule+ DOTCOM)) RAB
		{System.out.println("    - Ho riconosciuto un quicklink");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT-VAR E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

tableRule 
	:
		TABLE talignmentRule? LP trowRule (CM trowRule)* RP
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
		LSB VAR (CM VAR)* RSB
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT-VAR E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA


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
JAVALANGUAGE : 'Java';
CLANGUAGE : 'C';
CPPLANGUAGE : 'C++';
HTTP : 'http://';
HTTPS : 'https://';
DOTCOM : '.com';

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

//STRING	: 	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'; --> VA COMMENTATO PERCHè SENNò NON RICONOSCE IL TITOLO DI imageRule

//CHAR	:	'\'' ( ESC_SEQ | ~('\''|'\\') ) '\''; --> VA COMMENTATO PERCHè SENNò NON RICONOSCE codeTextRule
