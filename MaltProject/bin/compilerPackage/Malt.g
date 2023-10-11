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
		(instrRule | functionRule | classRule)+ EOF
		{System.out.println("    - Ho riconosciuto un documento Malt");}
;

instrRule
	:	((titleRule
		| textDeclRule
		| blockquoteRule
		| olistRule
		| ulistRule
		| tlistRule
		| codeBlockRule
		| horizontalRule
		| tableRule
		| imageRule
		| linkRule
		| quickLinkRule
		//| subscriptTextRule
		//| superscriptTextRule
		| formatTextRule
		) SE) | forRule
		{System.out.println("    - Ho riconosciuto un'istruzione");}	
;	

titleRule 
	:
		titleTypeRule (VAR EQ)? STRING refRule?
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

textDeclRule 
	:
		TEXT (VAR EQ)? textRule
		{System.out.println("    - Ho riconosciuto un testo");}
;

textRule
	:
		//(
		STRING
		//| italicTextRule
		//| boldTextRule
		//| ibTextRule
		//| strikethroughtTextRule
		//| highlightTextRule
		//| subscriptTextRule
		//| superscriptTextRule
		//| codeTextRule
		//| linkRule
		//| quickLinkRule)
;

//italicTextRule	
	//:
		//IT  STRING IT // come dire che il primo � inizio e l'ultimo fine ?
		//{System.out.println("    - I");}
//;

//boldTextRule
	//:
		//BOLD STRING BOLD
		//{System.out.println("    - B");}
//;

//ibTextRule
	//:
		//ITBOLD STRING ITBOLD
		//{System.out.println("    - IB");}
//;

//strikethroughtTextRule
	//:
		//ST STRING ST
		//{System.out.println("    - ST");}
//;

//highlightTextRule
	//:
		//HL STRING HL
		//{System.out.println("    - HL");}
//;

//subscriptTextRule
	//:
		//SUBS STRING SUBS
		//{System.out.println("    - SUBS");}
//;

//superscriptTextRule
	//:
		//SUPS STRING SUPS
		//{System.out.println("    - SUPS");}
//;

//codeTextRule
	//:
		//CODE STRING CODE
		//{System.out.println("    - CODE");}
//;

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
		CODEBLOCK (LP (~(LP | RP | '"'))* RP)? (VAR EQ)? textRule
		{System.out.println("    - Ho riconosciuto un BLOCKCODE");}
;

horizontalRule
	:
		HRULE
		{System.out.println("    - Ho riconosciuto un HORIZ");}
;

linkRule
	:
		LINK (VAR EQ)? LP (textRule | imageRule) CM (LP (~(LP | RP | '"'))* RP) RP
		{System.out.println("    - Ho riconosciuto un link");}
;

imageRule
	:
		IMG (VAR EQ)? LP (LP (~(LP | RP | '"'))* RP) (CM (LP (~(LP | RP | '"'))* RP))? RP
		{System.out.println("    - Ho riconosciuto un'immagine");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

quickLinkRule
	:
		LAB STRING RAB
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
		{System.out.println("    - Ho riconosciuto talign");}
;

alignRule
	:
		L | C | R
;

trowRule
	:
		LSB STRING (CM STRING)* RSB
		{System.out.println("    - Ho riconosciuto trow");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

formatTextRule
	:
		FORMATTEXT (VAR EQ)? STRING
		{System.out.println("    - Ho riconosciuto formattext");}
;

functionRule
	:
		FUN VAR LP TYPE VAR RP LCB instrRule RCB
		{System.out.println("    - Ho riconosciuto una funzione");}
;

forRule
	:
		FOR LP VAR IN VAR RP LCB instrRule RCB
;

classRule
	:
		CLASS VAR LCB fieldRule* functionRule* RCB
;

fieldRule
	:
		(fieldTextRule
		| fieldOlistRule
		| fieldUlistRule
		| fieldTlistRule) SE
;

fieldTextRule 
	:
		TEXT VAR (EQ textRule)?
;

fieldOlistRule 
	:
		OLIST VAR (EQ textListRule)?
;

fieldUlistRule 
	:
		ULIST VAR (EQ textListRule)?
;

fieldTlistRule 
	:
		TLIST VAR (EQ textListRule)?
;

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
TYPE : TEXT|'list'; // TODO: |'double'|'float'|'int'|'string'|'char'|'boolean'


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

FORMATSTRING	: 	'f' '"' ( ESC_SEQ | ~('\\'|'"'|'['|']'|'*'|I|G) )* '"'; // TODO: sistemare formattext, in particolare %g %i
