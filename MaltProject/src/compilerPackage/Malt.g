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
		(instrRule[null, null] | functionRule[null] | classRule )+ EOF 
		{h.printTable();
		System.out.println("    - Ho riconosciuto un documento Malt");}
;


instrRule [Token id, Token functionName]
	:	(((r1 = titleRule {h.declareNew(id,functionName, $r1.type, $r1.name);}
		| r2 = textDeclRule {h.declareNew(id,functionName, $r2.type, $r2.name);}
		| r3 = blockquoteRule {h.declareNew(id,functionName, $r3.type, $r3.name);}
		| r4 = olistRule {h.declareNew(id,functionName, $r4.type, $r4.name);}
		| r5 = ulistRule {h.declareNew(id,functionName, $r5.type, $r5.name);}
		| r6 = tlistRule {h.declareNew(id,functionName, $r6.type, $r6.name);}
		| r7 = codeBlockRule {h.declareNew(id,functionName, $r7.type, $r7.name);}
		| r8 = tableRule {h.declareNew(id,functionName, $r8.type, $r8.name);}
		| r9 = imageRule {h.declareNew(id,functionName, $r9.type, $r9.name);}
		| r10 = linkRule {h.declareNew(id,functionName, $r10.type, $r10.name);}
		| r11 = listRule {h.declareNew(id,functionName, $r11.type, $r11.name);}
		| r12 = formatText {h.declareNew(id,functionName, $r12.type, $r12.name);}) SE ) 
		| (( quickLinkRule
		| horizontalRule
		) SE) | forRule) 
		
;	


titleRule returns [Token name, Token type]
	:
		t=titleTypeRule (n=VAR EQ)? STRING refRule? {$name = $n; $type = t;}
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

textDeclRule returns [Token name, Token type] 
	:
		t=TEXT (n=VAR EQ)? STRING {$name = $n; $type = $t;}
		{System.out.println("    - Ho riconosciuto un testo");}
;

blockquoteRule returns [Token name, Token type]
	:
		t=BLOCKQUOTE (n=VAR {$name = $n; $type = $t;} EQ)? STRING
		{System.out.println("    - Ho riconosciuto un BLOCKQUOTE");}
;

olistRule returns [Token name, Token type]
	:
		t=OLIST (n=VAR {$name = $n; $type = $t;} EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un OLIST");}
;

textListRule
	:	LP STRING (CM STRING)+ RP
;

ulistRule returns [Token name, Token type]
	:
		t=ULIST (n=VAR {$name = $n; $type = $t;} EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un ULIST");}
;

tlistRule returns [Token name, Token type]
	:
		t=TLIST (n=VAR {$name = $n; $type = $t;} EQ)? textListRule
		{System.out.println("    - Ho riconosciuto un TLIST");}
;

codeBlockRule returns [Token name, Token type]
	:
		t=CODEBLOCK genericString? (n=VAR {$name = $n; $type = $t;} EQ)? STRING
		{System.out.println("    - Ho riconosciuto un BLOCKCODE");}
;

genericString
	:
		(LP (~(LP | RP | '"'))* RP)
;

horizontalRule
	:
		HRULE
		{System.out.println("    - Ho riconosciuto un HORIZ");}
;

linkRule returns [Token name, Token type]
	:
		t=LINK (n=VAR {$name = $n; $type = $t;} EQ)? LP (STRING | imageRule) CM genericString RP
		{System.out.println("    - Ho riconosciuto un link");}
;

imageRule returns [Token name, Token type]
	:
		t=IMG (n=VAR {$name = $n; $type = $t;} EQ)? LP genericString (CM genericString)? RP
		{System.out.println("    - Ho riconosciuto un'immagine");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

quickLinkRule
	:
		LAB STRING RAB
		{System.out.println("    - Ho riconosciuto un quicklink");}
; // TODO: DISTINZIONE TRA SUBTEXT-TEXT E LINK-URL-EMAIL-IMAGEPATH-URLIMAGE-DIDASCALIA IMMAGINE-TESTO TABELLA

tableRule returns [Token name, Token type]
	:
		t=TABLE (n=VAR {$name = $n; $type = $t;} EQ)? talignmentRule? LP trowRule (CM trowRule)* RP
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

formatText returns [Token name, Token type]
	:
		t=FORMATTEXT (n=VAR {$name = $n; $type = $t;} EQ)? STRING
		{System.out.println("    - Ho riconosciuto formattext");}
;

functionRule [Token className]
	:
		f=FUN n=VAR {h.declareFunCl(className,$n);} LP (argumentsRule[className, $n])? RP LCB ((fieldRule[className,$n]) | (assignRule[$n, className]))+ RCB
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
		FOR LP VAR IN VAR RP LCB (instrRule[null,null])+ RCB
		{System.out.println("    - Ho riconosciuto un for");}
;

classRule
	:
		f=CLASS n=VAR {h.declareFunCl($f,$n);} LCB fieldRule[$f,$n]* (functionRule[$n])* RCB
		{System.out.println("    - Ho riconosciuto una classe");}
;

fieldRule [Token id, Token className]
	:
		( r1 = fieldTitleRule [id, className] {h.declareNew(id,className, $r1.type, $r1.name);}
		| r2 = fieldText {h.declareNew(id,className, $r2.type, $r2.name);}
		| r3 = fieldBlockQuoteRule {h.declareNew(id,className, $r3.type, $r3.name);}
		| r4 = fieldOlistRule {h.declareNew(id,className, $r4.type, $r4.name);}
		| r5 = fieldUlistRule {h.declareNew(id,className, $r5.type, $r5.name);}
		| r6 = fieldTlistRule {h.declareNew(id,className, $r6.type, $r6.name);}
		| r7 = fieldCodeBlockRule {h.declareNew(id,className, $r7.type, $r7.name);}
		| r8 = fieldTableRule {h.declareNew(id,className, $r8.type, $r8.name);}
		| r9 = fieldImageRule {h.declareNew(id,className, $r9.type, $r9.name);}
		| r10 = fieldLinkRule {h.declareNew(id,className, $r10.type, $r10.name);}
		| r11 = listRule {h.declareNew(id,className, $r11.type, $r11.name);} 
		| r12 = fieldFormatText {h.declareNew(id,className, $r12.type, $r12.name);}) SE
;

fieldTitleRule [Token id, Token className] returns [Token name, Token type]
	:
		t=titleTypeRule n=VAR (assignTitleRule[$id, $className, $n])? {$name = $n; $type = t;}
;

fieldText returns [Token name, Token type]
	:
		t=TEXT n=VAR (assignString)? {$name = $n; $type = $t;}
;

fieldBlockQuoteRule returns [Token name, Token type]
	:
		t=BLOCKQUOTE n=VAR {$name = $n; $type = $t;} (assignString)?
;

fieldOlistRule returns [Token name, Token type]
	:
		t=OLIST n=VAR (assignTextListRule)? {$name = $n; $type = $t;}
;

fieldUlistRule returns [Token name, Token type]
	:
		t=ULIST n=VAR (assignTextListRule)? {$name = $n; $type = $t;}
;

fieldTlistRule returns [Token name, Token type]
	:
		t=TLIST n=VAR (assignTextListRule)? {$name = $n; $type = $t;}
;

fieldCodeBlockRule returns [Token name, Token type]
	:
		t=CODEBLOCK genericString? n=VAR {$name = $n; $type = $t;} (assignString)?
;

fieldTableRule returns [Token name, Token type]
	:
		t=TABLE n=VAR {$name = $n; $type = $t;} (assignTableRule)?
;

fieldImageRule returns [Token name, Token type]
	:
		t=IMG n=VAR {$name = $n; $type = $t;} (assignImageRule)?
;

fieldLinkRule returns [Token name, Token type]
	:
		t=LINK n=VAR {$name = $n; $type = $t;} (assignLinkRule)?
;

fieldFormatText returns [Token name, Token type]
	:
		t=FORMATTEXT n=VAR {$name = $n; $type = $t;} (assignString)?
;


listRule returns [Token name, Token type]
	:
		t=LIST n=VAR (assignListRule)? {$name = $n; $type = t;}
		{System.out.println("    - Ho riconosciuto una lista");}
; // TODO: cambiare string con formattext

// TODO: nei controlli capire come controllare l'esistenza di una varibiale oppure il suo tipo nel caso sia se � stata definita

assignRule [Token id, Token className]
	:
	n=VAR (assignTitleRule[$id, $className, $n] | assignTextListRule | assignTableRule | assignImageRule | assignLinkRule | assignListRule) SE
;

assignTitleRule [Token id, Token className, Token name]
	:
		v=assignString refRule? {h.assignVarValue($id, $className, $name, v);}
;

assignString returns [Token value]
	:
		EQ v=STRING {value = $v;}
;

assignTextListRule 
	:
		EQ textListRule
;

assignTableRule
	:
		EQ talignmentRule? LP trowRule (CM trowRule)* RP
;

assignImageRule
	:
		EQ LP genericString (CM genericString)? RP
;

assignLinkRule
	:
		EQ LP (STRING | imageRule) CM genericString RP
;


assignListRule
	:
		EQ LSB STRING (CM STRING)+ RSB
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
