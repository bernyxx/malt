// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g 2023-11-11 10:10:33

	package com.malt.grammar.compiler;
	
	import java.util.Vector;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKQUOTE", "BOLD", "C", "CL", 
		"CLASS", "CM", "CODE", "CODEBLOCK", "COMMENT", "DIGIT", "DO", "DOTVAR", 
		"EQ", "EQI", "EQL", "ERROR_TK", "ESC_SEQ", "EX", "EXPONENT", "FLOAT", 
		"FOR", "FORMAT", "FORMATTEXT", "FUN", "G", "GET", "HA", "HEX_DIGIT", "HL", 
		"HRULE", "I", "IMG", "IN", "INTEGER", "IT", "ITBOLD", "L", "LAB", "LCB", 
		"LET", "LETTER", "LINK", "LIST", "LP", "LSB", "OCTAL_ESC", "OLIST", "PLUS", 
		"R", "RAB", "RCB", "RETURN", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", 
		"S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", 
		"TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS", "'\"'"
	};
	public static final int EOF=-1;
	public static final int T__78=78;
	public static final int BLOCKQUOTE=4;
	public static final int BOLD=5;
	public static final int C=6;
	public static final int CL=7;
	public static final int CLASS=8;
	public static final int CM=9;
	public static final int CODE=10;
	public static final int CODEBLOCK=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DO=14;
	public static final int DOTVAR=15;
	public static final int EQ=16;
	public static final int EQI=17;
	public static final int EQL=18;
	public static final int ERROR_TK=19;
	public static final int ESC_SEQ=20;
	public static final int EX=21;
	public static final int EXPONENT=22;
	public static final int FLOAT=23;
	public static final int FOR=24;
	public static final int FORMAT=25;
	public static final int FORMATTEXT=26;
	public static final int FUN=27;
	public static final int G=28;
	public static final int GET=29;
	public static final int HA=30;
	public static final int HEX_DIGIT=31;
	public static final int HL=32;
	public static final int HRULE=33;
	public static final int I=34;
	public static final int IMG=35;
	public static final int IN=36;
	public static final int INTEGER=37;
	public static final int IT=38;
	public static final int ITBOLD=39;
	public static final int L=40;
	public static final int LAB=41;
	public static final int LCB=42;
	public static final int LET=43;
	public static final int LETTER=44;
	public static final int LINK=45;
	public static final int LIST=46;
	public static final int LP=47;
	public static final int LSB=48;
	public static final int OCTAL_ESC=49;
	public static final int OLIST=50;
	public static final int PLUS=51;
	public static final int R=52;
	public static final int RAB=53;
	public static final int RCB=54;
	public static final int RETURN=55;
	public static final int RP=56;
	public static final int RSB=57;
	public static final int S1TITLE=58;
	public static final int S2TITLE=59;
	public static final int S3TITLE=60;
	public static final int S4TITLE=61;
	public static final int S5TITLE=62;
	public static final int SE=63;
	public static final int SL=64;
	public static final int ST=65;
	public static final int STRING=66;
	public static final int SUBS=67;
	public static final int SUPS=68;
	public static final int TABLE=69;
	public static final int TEXT=70;
	public static final int TITLE=71;
	public static final int TLIST=72;
	public static final int ULIST=73;
	public static final int UNICODE_ESC=74;
	public static final int US=75;
	public static final int VAR=76;
	public static final int WS=77;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MaltParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MaltParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MaltParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g"; }



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



	// $ANTLR start "parseJava"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:51:1: parseJava : ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initMaltHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:53:2: ( ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=5;
				switch ( input.LA(1) ) {
				case FUN:
					{
					alt1=1;
					}
					break;
				case BLOCKQUOTE:
				case CM:
				case CODEBLOCK:
				case DOTVAR:
				case FOR:
				case FORMAT:
				case IMG:
				case LINK:
				case LIST:
				case OLIST:
				case S1TITLE:
				case S2TITLE:
				case S3TITLE:
				case S4TITLE:
				case S5TITLE:
				case TABLE:
				case TEXT:
				case TITLE:
				case TLIST:
				case ULIST:
					{
					alt1=2;
					}
					break;
				case VAR:
					{
					int LA1_19 = input.LA(2);
					if ( (LA1_19==LP) ) {
						alt1=2;
					}
					else if ( ((LA1_19 >= EQ && LA1_19 <= EQL)) ) {
						alt1=4;
					}

					}
					break;
				case CLASS:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:4: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava66);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:25: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava71);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:62: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava76);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:54:74: assignRule[null, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava80);
					assignRule(null, null, false);
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_parseJava86); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseJava"



	// $ANTLR start "functionRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:59:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:60:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule107); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule111); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule115); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:50: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule118);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule123); 
			match(input,LCB,FOLLOW_LCB_in_functionRule125); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:89: ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BLOCKQUOTE||LA3_0==CM||LA3_0==CODEBLOCK||LA3_0==DOTVAR||(LA3_0 >= FOR && LA3_0 <= FORMAT)||LA3_0==IMG||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
					alt3=1;
				}
				else if ( (LA3_0==VAR) ) {
					int LA3_19 = input.LA(2);
					if ( (LA3_19==LP) ) {
						alt3=1;
					}
					else if ( ((LA3_19 >= EQ && LA3_19 <= EQL)) ) {
						alt3=2;
					}

				}

				switch (alt3) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:90: ( declarationRule[className,$n, false] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:90: ( declarationRule[className,$n, false] )
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:91: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule129);
					declarationRule(className, n, false);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:131: ( assignRule[className, $n, false] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:131: ( assignRule[className, $n, false] )
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:132: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule136);
					assignRule(className, n, false);
					state._fsp--;

					}

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:168: ( returnRule[className, $n] )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETURN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:61:168: returnRule[className, $n]
					{
					pushFollow(FOLLOW_returnRule_in_functionRule142);
					returnRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RCB,FOLLOW_RCB_in_functionRule146); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionRule"



	// $ANTLR start "argumentsRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:66:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:67:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:68:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule168);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule172); 
			h.declareArg(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:68:78: ( CM t= argumentTypeRule n= VAR )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:68:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule177); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule181);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule185); 
					h.declareArg(className, functionName, t, n);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argumentsRule"



	// $ANTLR start "argumentTypeRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:72:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:73:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			int alt6=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt6=1;
				}
				break;
			case TEXT:
				{
				alt6=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt6=3;
				}
				break;
			case OLIST:
				{
				alt6=4;
				}
				break;
			case ULIST:
				{
				alt6=5;
				}
				break;
			case TLIST:
				{
				alt6=6;
				}
				break;
			case CODEBLOCK:
				{
				alt6=7;
				}
				break;
			case LINK:
				{
				alt6=8;
				}
				break;
			case IMG:
				{
				alt6=9;
				}
				break;
			case TABLE:
				{
				alt6=10;
				}
				break;
			case FORMATTEXT:
				{
				alt6=11;
				}
				break;
			case LIST:
				{
				alt6=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule209);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule217); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule223); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule229); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule235); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule241); 
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule247); 
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule253); 
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule259); 
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule265); 
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule271); 
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:74:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule277); 
					}
					break;

			}

			type = t;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "argumentTypeRule"



	// $ANTLR start "functionCallRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:78:1: functionCallRule[Token className, Token functionName] returns [Token calledFunction] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final Token functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token calledFunction = null;


		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:79:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:3: (v1= VAR |v1= DOTVAR )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			else if ( (LA7_0==DOTVAR) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule302); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule308); 
					}
					break;

			}

			calledFunction = v1;
			match(input,LP,FOLLOW_LP_in_functionCallRule313); 
			Vector<Token> vct = new Vector<Token>();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:94: (t1= VAR ( CM t2= VAR )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:95: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule320); 
					vct.add(t1);
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:118: ( CM t2= VAR )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:119: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule325); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule329); 
							vct.add(t2);
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule337); 
			h.functionCall(className, functionName, v1, vct);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return calledFunction;
	}
	// $ANTLR end "functionCallRule"



	// $ANTLR start "returnRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:83:1: returnRule[Token className, Token functionName] : RETURN (v= VAR |v= STRING ) SE ;
	public final void returnRule(Token className, Token functionName) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:84:2: ( RETURN (v= VAR |v= STRING ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:85:3: RETURN (v= VAR |v= STRING ) SE
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule353); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:85:10: (v= VAR |v= STRING )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			else if ( (LA10_0==STRING) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:85:11: v= VAR
					{
					v=(Token)match(input,VAR,FOLLOW_VAR_in_returnRule358); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:85:19: v= STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_returnRule364); 
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_returnRule367); 
			h.handleReturn(className,functionName,v);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnRule"



	// $ANTLR start "forRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:89:1: forRule[Token className, Token functionName] : ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] );
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:2: ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==FOR) ) {
				alt11=1;
			}
			else if ( (LA11_0==CM) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:4: FOR LP n= VAR forInRule[className, functionName, $n]
					{
					match(input,FOR,FOLLOW_FOR_in_forRule382); 
					match(input,LP,FOLLOW_LP_in_forRule384); 
					n=(Token)match(input,VAR,FOLLOW_VAR_in_forRule388); 
					pushFollow(FOLLOW_forInRule_in_forRule390);
					forInRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:59: forIncrRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule396);
					forIncrRule(className, functionName, n);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forRule"



	// $ANTLR start "forInRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:95:1: forInRule[Token className, Token functionName, Token name] : IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:96:2: ( IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:96:4: IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,IN,FOLLOW_IN_in_forInRule413); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule417); 
			match(input,RP,FOLLOW_RP_in_forInRule419); 
			match(input,LCB,FOLLOW_LCB_in_forInRule421); 
			h.declareFor(className, functionName, false, name, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:96:80: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BLOCKQUOTE||LA12_0==CM||LA12_0==CODEBLOCK||LA12_0==DOTVAR||(LA12_0 >= FOR && LA12_0 <= FORMAT)||LA12_0==IMG||(LA12_0 >= LINK && LA12_0 <= LIST)||LA12_0==OLIST||(LA12_0 >= S1TITLE && LA12_0 <= S5TITLE)||(LA12_0 >= TABLE && LA12_0 <= ULIST)) ) {
					alt12=1;
				}
				else if ( (LA12_0==VAR) ) {
					int LA12_18 = input.LA(2);
					if ( (LA12_18==LP) ) {
						alt12=1;
					}
					else if ( ((LA12_18 >= EQ && LA12_18 <= EQL)) ) {
						alt12=2;
					}

				}

				switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:96:81: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule426);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:96:130: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule431);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input,RCB,FOLLOW_RCB_in_forInRule436); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forInRule"



	// $ANTLR start "forIncrRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:101:1: forIncrRule[Token className, Token functionName, Token name] : CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:102:2: ( CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:102:4: CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,CM,FOLLOW_CM_in_forIncrRule452); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule456); 
			match(input,RP,FOLLOW_RP_in_forIncrRule458); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule460); 
			h.declareFor(className, functionName, true, name, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:102:83: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BLOCKQUOTE||LA13_0==CM||LA13_0==CODEBLOCK||LA13_0==DOTVAR||(LA13_0 >= FOR && LA13_0 <= FORMAT)||LA13_0==IMG||(LA13_0 >= LINK && LA13_0 <= LIST)||LA13_0==OLIST||(LA13_0 >= S1TITLE && LA13_0 <= S5TITLE)||(LA13_0 >= TABLE && LA13_0 <= ULIST)) ) {
					alt13=1;
				}
				else if ( (LA13_0==VAR) ) {
					int LA13_18 = input.LA(2);
					if ( (LA13_18==LP) ) {
						alt13=1;
					}
					else if ( ((LA13_18 >= EQ && LA13_18 <= EQL)) ) {
						alt13=2;
					}

				}

				switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:102:84: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule465);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:102:133: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule470);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input,RCB,FOLLOW_RCB_in_forIncrRule475); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forIncrRule"



	// $ANTLR start "classRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:107:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:108:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:109:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule493); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule497); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule501); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:109:49: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
			loop14:
			while (true) {
				int alt14=4;
				switch ( input.LA(1) ) {
				case BLOCKQUOTE:
				case CM:
				case CODEBLOCK:
				case DOTVAR:
				case FOR:
				case FORMAT:
				case IMG:
				case LINK:
				case LIST:
				case OLIST:
				case S1TITLE:
				case S2TITLE:
				case S3TITLE:
				case S4TITLE:
				case S5TITLE:
				case TABLE:
				case TEXT:
				case TITLE:
				case TLIST:
				case ULIST:
					{
					alt14=1;
					}
					break;
				case VAR:
					{
					int LA14_18 = input.LA(2);
					if ( (LA14_18==LP) ) {
						alt14=1;
					}
					else if ( ((LA14_18 >= EQ && LA14_18 <= EQL)) ) {
						alt14=3;
					}

					}
					break;
				case FUN:
					{
					alt14=2;
					}
					break;
				}
				switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:109:50: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule504);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:109:84: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule509);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:109:103: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule514);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule519); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classRule"



	// $ANTLR start "declarationRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:114:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:115:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==DOTVAR||LA16_0==FORMAT||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)||LA16_0==VAR) ) {
				alt16=1;
			}
			else if ( (LA16_0==CM||LA16_0==FOR) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
					int alt15=13;
					switch ( input.LA(1) ) {
					case S1TITLE:
					case S2TITLE:
					case S3TITLE:
					case S4TITLE:
					case S5TITLE:
					case TITLE:
						{
						alt15=1;
						}
						break;
					case TEXT:
						{
						alt15=2;
						}
						break;
					case BLOCKQUOTE:
						{
						alt15=3;
						}
						break;
					case OLIST:
						{
						alt15=4;
						}
						break;
					case ULIST:
						{
						alt15=5;
						}
						break;
					case TLIST:
						{
						alt15=6;
						}
						break;
					case CODEBLOCK:
						{
						alt15=7;
						}
						break;
					case TABLE:
						{
						alt15=8;
						}
						break;
					case IMG:
						{
						alt15=9;
						}
						break;
					case LINK:
						{
						alt15=10;
						}
						break;
					case LIST:
						{
						alt15=11;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt15=12;
						}
						break;
					case FORMAT:
						{
						alt15=13;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule540);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:117:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule549);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:118:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule558);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:119:5: declareOlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareOlistRule_in_declarationRule567);
							declareOlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:120:5: declareUlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareUlistRule_in_declarationRule576);
							declareUlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:121:5: declareTlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTlistRule_in_declarationRule584);
							declareTlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule592);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:123:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule600);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:124:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule609);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:125:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule617);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:126:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule626);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:127:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule635);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_declarationRule642);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_declarationRule647); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:56: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_declarationRule652);
					forRule(className, functionName);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarationRule"



	// $ANTLR start "declareTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:132:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:133:2: (t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:3: t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule670);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule674); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:82: ( refRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LCB) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:82: refRule
					{
					pushFollow(FOLLOW_refRule_in_declareTitleRule678);
					refRule();
					state._fsp--;

					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:91: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt18=4;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt18=1;
						}
						break;
					case LP:
						{
						alt18=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt18=2;
						}
						break;
				}
			}
			switch (alt18) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:92: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTitleRule682);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:150: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTitleRule687);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:210: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTitleRule692);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareTitleRule"



	// $ANTLR start "titleTypeRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:138:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:139:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			int alt19=6;
			switch ( input.LA(1) ) {
			case TITLE:
				{
				alt19=1;
				}
				break;
			case S1TITLE:
				{
				alt19=2;
				}
				break;
			case S2TITLE:
				{
				alt19=3;
				}
				break;
			case S3TITLE:
				{
				alt19=4;
				}
				break;
			case S4TITLE:
				{
				alt19=5;
				}
				break;
			case S5TITLE:
				{
				alt19=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule715); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule721); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule727); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule733); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule739); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule745); 
					}
					break;

			}

			type = t;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "titleTypeRule"



	// $ANTLR start "refRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:144:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:145:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:146:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule761); 
			match(input,HA,FOLLOW_HA_in_refRule763); 
			match(input,VAR,FOLLOW_VAR_in_refRule765); 
			match(input,RCB,FOLLOW_RCB_in_refRule767); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "refRule"



	// $ANTLR start "declareTextRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:150:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:151:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule785); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule789); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:72: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt20=4;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt20=1;
						}
						break;
					case LP:
						{
						alt20=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt20=2;
						}
						break;
				}
			}
			switch (alt20) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:73: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule794);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTextRule799);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:191: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTextRule804);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareTextRule"



	// $ANTLR start "declareBlockQuoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:156:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:157:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:158:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule824); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule828); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:158:79: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt21=4;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt21=1;
						}
						break;
					case LP:
						{
						alt21=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt21=2;
						}
						break;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:158:80: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule834);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:158:138: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareBlockQuoteRule839);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:158:198: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareBlockQuoteRule844);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareBlockQuoteRule"



	// $ANTLR start "declareOlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:162:1: declareOlistRule[Token className, Token functionName, boolean inFor] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareOlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:164:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_declareOlistRule864); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareOlistRule868); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:164:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==EQ) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==LP) ) {
					alt22=1;
				}
				else if ( (LA22_1==DOTVAR||LA22_1==VAR) ) {
					alt22=2;
				}
			}
			switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:164:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareOlistRule873);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:164:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareOlistRule878);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareOlistRule"



	// $ANTLR start "declareUlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:168:1: declareUlistRule[Token className, Token functionName, boolean inFor] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareUlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:169:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:170:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_declareUlistRule899); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareUlistRule903); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:170:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==LP) ) {
					alt23=1;
				}
				else if ( (LA23_1==DOTVAR||LA23_1==VAR) ) {
					alt23=2;
				}
			}
			switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:170:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareUlistRule908);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:170:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareUlistRule913);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareUlistRule"



	// $ANTLR start "declareTlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:174:1: declareTlistRule[Token className, Token functionName, boolean inFor] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:175:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:176:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_declareTlistRule934); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTlistRule938); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:176:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==LP) ) {
					alt24=1;
				}
				else if ( (LA24_1==DOTVAR||LA24_1==VAR) ) {
					alt24=2;
				}
			}
			switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:176:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareTlistRule943);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:176:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTlistRule948);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareTlistRule"



	// $ANTLR start "declareCodeBlockRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:180:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule968); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LP) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_declareCodeBlockRule971); 
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:19: (~ ( LP | RP | '\"' ) )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= BLOCKQUOTE && LA25_0 <= LIST)||(LA25_0 >= LSB && LA25_0 <= RETURN)||(LA25_0 >= RSB && LA25_0 <= WS)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
							{
							if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LIST)||(input.LA(1) >= LSB && input.LA(1) <= RETURN)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop25;
						}
					}

					match(input,RP,FOLLOW_RP_in_declareCodeBlockRule989); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule995); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:107: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt27=4;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt27=1;
						}
						break;
					case LP:
						{
						alt27=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt27=2;
						}
						break;
				}
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:108: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule1001);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:166: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareCodeBlockRule1006);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:182:225: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareCodeBlockRule1010);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareCodeBlockRule"



	// $ANTLR start "declareTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:186:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:188:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule1030); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule1034); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:188:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				int LA28_1 = input.LA(2);
				if ( ((LA28_1 >= LP && LA28_1 <= LSB)) ) {
					alt28=1;
				}
				else if ( (LA28_1==DOTVAR||LA28_1==VAR) ) {
					alt28=2;
				}
			}
			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:188:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule1039);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:188:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule1044);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareTableRule"



	// $ANTLR start "talignmentRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:192:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:194:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1066); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1070);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:194:44: (t1= CM t2= alignRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==CM) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:194:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1077); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1081);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop29;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1089); 
			value = v1.getText() + cycle + v3.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "talignmentRule"



	// $ANTLR start "alignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:198:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:199:2: ( (v= L |v= C |v= R ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:3: (v= L |v= C |v= R )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:3: (v= L |v= C |v= R )
			int alt30=3;
			switch ( input.LA(1) ) {
			case L:
				{
				alt30=1;
				}
				break;
			case C:
				{
				alt30=2;
				}
				break;
			case R:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1111); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1117); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1123); 
					}
					break;

			}

			value = v.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "alignRule"



	// $ANTLR start "trowRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:204:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:205:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:206:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1145); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1149); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:206:52: (v3= CM v4= STRING )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==CM) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:206:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1156); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1160); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop31;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1168); 
			value = v1.getText() + cycle + v5.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "trowRule"



	// $ANTLR start "declareImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:210:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:211:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:212:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1187); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1191); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:212:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQI) ) {
				alt32=1;
			}
			else if ( (LA32_0==EQ) ) {
				alt32=2;
			}
			switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:212:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1196);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:212:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1201);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareImageRule"


	public static class declareLinkRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "declareLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:216:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:217:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:218:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1225); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1229); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:218:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQL) ) {
				alt33=1;
			}
			else if ( (LA33_0==EQ) ) {
				alt33=2;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:218:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1234);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:218:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1239);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declareLinkRule"



	// $ANTLR start "declareListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:223:1: declareListRule[Token className, Token functionName, boolean inFor] : t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:224:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:225:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_declareListRule1260); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule1264); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:225:72: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==LSB) ) {
					alt34=1;
				}
				else if ( (LA34_1==DOTVAR||LA34_1==VAR) ) {
					alt34=2;
				}
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:225:73: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule1269);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:225:129: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule1274);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declareListRule"



	// $ANTLR start "assignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:230:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:231:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:232:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1297); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:232:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
			int alt35=8;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case LP:
					{
					switch ( input.LA(3) ) {
					case STRING:
						{
						int LA35_9 = input.LA(4);
						if ( (LA35_9==CM) ) {
							alt35=4;
						}
						else if ( (LA35_9==PLUS||LA35_9==RP) ) {
							alt35=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VAR:
						{
						alt35=2;
						}
						break;
					case LSB:
						{
						alt35=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case STRING:
					{
					alt35=3;
					}
					break;
				case LSB:
					{
					int LA35_6 = input.LA(3);
					if ( (LA35_6==RSB||LA35_6==STRING||LA35_6==VAR) ) {
						alt35=8;
					}
					else if ( (LA35_6==C||LA35_6==L||LA35_6==R) ) {
						alt35=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case DOTVAR:
				case VAR:
					{
					alt35=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt35=6;
				}
				break;
			case EQL:
				{
				alt35=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:232:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1300);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:233:5: assignExprRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_assignRule1307);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:234:5: assignStringRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_assignRule1314);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:235:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1321);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:236:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1329);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:237:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1341);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:238:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1353);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:239:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1365);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1370); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignRule"



	// $ANTLR start "assignVariableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:243:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= VAR |v2= functionCallRule[$className, $functionName] ) ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:244:2: ( EQ (v1= VAR |v2= functionCallRule[$className, $functionName] ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:245:3: EQ (v1= VAR |v2= functionCallRule[$className, $functionName] )
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1387); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:245:6: (v1= VAR |v2= functionCallRule[$className, $functionName] )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==VAR) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==SE) ) {
					alt36=1;
				}
				else if ( (LA36_1==LP) ) {
					alt36=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA36_0==DOTVAR) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:245:7: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1392); 
					h.assignVarToVar(className, functionName, inFor, false, name, v1);
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:245:90: v2= functionCallRule[$className, $functionName]
					{
					pushFollow(FOLLOW_functionCallRule_in_assignVariableRule1400);
					v2=functionCallRule(className, functionName);
					state._fsp--;

					h.assignVarToVar(className, functionName, inFor, true, name, v2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignVariableRule"



	// $ANTLR start "assignExprRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:250:1: assignExprRule[Token className, Token functionName, boolean inFor, Token name] : EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP ;
	public final void assignExprRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:251:2: ( EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:3: EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignExprRule1427); 
			match(input,LP,FOLLOW_LP_in_assignExprRule1429); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:52: (v1= STRING |v1= VAR )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==STRING) ) {
				alt37=1;
			}
			else if ( (LA37_0==VAR) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:53: v1= STRING
					{
					v1=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1434); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:63: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1438); 
					}
					break;

			}

			vct.add(v1);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:87: ( PLUS (v2= STRING |v2= VAR ) )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==PLUS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:88: PLUS (v2= STRING |v2= VAR )
					{
					match(input,PLUS,FOLLOW_PLUS_in_assignExprRule1444); 
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:93: (v2= STRING |v2= VAR )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==STRING) ) {
						alt38=1;
					}
					else if ( (LA38_0==VAR) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:94: v2= STRING
							{
							v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1449); 
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:252:104: v2= VAR
							{
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1453); 
							}
							break;

					}

					vct.add(v2);
					}
					break;

				default :
					break loop39;
				}
			}

			match(input,RP,FOLLOW_RP_in_assignExprRule1460); 
			h.assignExprToVar(className, functionName, inFor, name, vct);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignExprRule"



	// $ANTLR start "assignStringRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:257:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:258:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1477); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1481); 
			h.assignVarValue(className, functionName, inFor, name, v.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignStringRule"



	// $ANTLR start "assignTextListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:262:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:263:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:264:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1498); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1502);
			v=textListRule();
			state._fsp--;

			h.assignVarValue(className, functionName, inFor, name, v);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignTextListRule"



	// $ANTLR start "textListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:268:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:269:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:269:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1521); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1525); 
			String cicle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:269:52: (t1= CM t2= STRING )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==CM) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:269:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1532); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1536); 
					cicle = cicle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1544); 
			value = v1.getText() + v2.getText() + cicle + v3.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "textListRule"



	// $ANTLR start "assignTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:273:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:274:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:275:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1561); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:275:8: (v1= talignmentRule )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LSB) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:275:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1565);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1570); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1574);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:275:64: (t1= CM t2= trowRule )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==CM) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:275:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1581); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1585);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop42;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1593); 
			h.assignVarValue(className, functionName, inFor, name, v1 + v2.getText() + cycle + v4.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignTableRule"



	// $ANTLR start "assignImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:280:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:281:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1610); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1614); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1618); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:281:40: (o1= CM o2= STRING )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==CM) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:281:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1625); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1629); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1637); 
			h.assignVarValue(className, functionName, inFor, name, v1.getText() + v2.getText() + opt + v3.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignImageRule"



	// $ANTLR start "assignLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:285:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:286:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:287:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1654); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1658); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:287:31: (t= STRING |ir= imageRule )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==STRING) ) {
				alt44=1;
			}
			else if ( (LA44_0==IMG) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:287:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1665); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:287:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1673);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1680); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1684); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1688); 
			h.assignVarValue(className, functionName, inFor, name, v1.getText() + v2 + v3.getText() 
																				+ v4.getText() + v5.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignLinkRule"



	// $ANTLR start "imageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:292:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:293:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:294:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1709); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1713); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1717); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:294:58: (t1= CM t2= STRING )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==CM) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:294:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule1724); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1728); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule1736); 
			value = v1.getText() + v2.getText() + cycle + v4.getText();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "imageRule"



	// $ANTLR start "assignListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:299:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:300:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule1758); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1760); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:54: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==STRING||LA49_0==VAR) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:55: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:55: (v= STRING |v= VAR )
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==STRING) ) {
						alt46=1;
					}
					else if ( (LA46_0==VAR) ) {
						alt46=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						throw nvae;
					}

					switch (alt46) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:56: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1767); 
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:65: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1771); 
							}
							break;

					}

					vct.add(v);
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:88: ( CM (t= STRING |t= VAR ) )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==CM) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:89: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule1778); 
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:92: (t= STRING |t= VAR )
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==STRING) ) {
								alt47=1;
							}
							else if ( (LA47_0==VAR) ) {
								alt47=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 47, 0, input);
								throw nvae;
							}

							switch (alt47) {
								case 1 :
									// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:93: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1783); 
									}
									break;
								case 2 :
									// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:102: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1787); 
									}
									break;

							}

							vct.add(t);
							}
							break;

						default :
							break loop48;
						}
					}

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule1796); 
			h.assignListValue(className, functionName, inFor, name, vct);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignListRule"



	// $ANTLR start "formatRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:305:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:306:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:307:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1813); 
			match(input,LP,FOLLOW_LP_in_formatRule1815); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1819); 
			match(input,CM,FOLLOW_CM_in_formatRule1821); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1825); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule1829); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1833); 
			vct.add(v3);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:307:99: ( CM v4= VAR )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==CM) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:307:100: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule1838); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1842); 
					vct.add(v4);
					}
					break;

				default :
					break loop50;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule1848); 
			h.handleFormat(className, functionName, inFor, v1, v2, vct);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formatRule"

	// Delegated rules



	public static final BitSet FOLLOW_functionRule_in_parseJava66 = new BitSet(new long[]{0x7C0460080B008B10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_parseJava71 = new BitSet(new long[]{0x7C0460080B008B10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_classRule_in_parseJava76 = new BitSet(new long[]{0x7C0460080B008B10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_parseJava80 = new BitSet(new long[]{0x7C0460080B008B10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_EOF_in_parseJava86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionRule111 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule115 = new BitSet(new long[]{0x7D04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule118 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule123 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule125 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule129 = new BitSet(new long[]{0x7CC4600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_functionRule136 = new BitSet(new long[]{0x7CC4600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_returnRule_in_functionRule142 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_functionRule146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule172 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule177 = new BitSet(new long[]{0x7C04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule185 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule302 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule308 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule313 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule320 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule329 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_VAR_in_returnRule358 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_returnRule364 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_returnRule367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule382 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forRule384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forRule388 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_forInRule_in_forRule390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_forInRule413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forInRule417 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule419 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule421 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule426 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forInRule431 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forInRule436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CM_in_forIncrRule452 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule456 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule458 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule460 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule465 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule470 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_classRule497 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule501 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_classRule504 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_functionRule_in_classRule509 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_classRule514 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_classRule519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareTitleRule_in_declarationRule540 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareTextRule_in_declarationRule549 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareBlockQuoteRule_in_declarationRule558 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareOlistRule_in_declarationRule567 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareUlistRule_in_declarationRule576 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareTlistRule_in_declarationRule584 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareCodeBlockRule_in_declarationRule592 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareTableRule_in_declarationRule600 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareImageRule_in_declarationRule609 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareLinkRule_in_declarationRule617 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareListRule_in_declarationRule626 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_declarationRule635 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_declarationRule642 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_declarationRule647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_declarationRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_declareTitleRule670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTitleRule674 = new BitSet(new long[]{0x0000040000010002L});
	public static final BitSet FOLLOW_refRule_in_declareTitleRule678 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTitleRule682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTitleRule687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTitleRule692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule761 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_refRule765 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule789 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTextRule799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTextRule804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule828 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareBlockQuoteRule839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareBlockQuoteRule844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_declareOlistRule864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareOlistRule868 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareOlistRule873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareOlistRule878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_declareUlistRule899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareUlistRule903 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareUlistRule908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareUlistRule913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_declareTlistRule934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTlistRule938 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareTlistRule943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTlistRule948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule968 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_declareCodeBlockRule971 = new BitSet(new long[]{0xFFFF7FFFFFFFFFF0L,0x0000000000003FFFL});
	public static final BitSet FOLLOW_RP_in_declareCodeBlockRule989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule995 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareCodeBlockRule1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareCodeBlockRule1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule1030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule1034 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1066 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1070 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1077 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1081 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1149 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1160 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1191 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1229 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_declareListRule1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareListRule1264 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1297 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1300 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignExprRule_in_assignRule1307 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignStringRule_in_assignRule1314 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1321 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1329 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1341 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1353 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1365 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1387 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallRule_in_assignVariableRule1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignExprRule1427 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignExprRule1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1434 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1438 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_PLUS_in_assignExprRule1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1449 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1453 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_RP_in_assignExprRule1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1498 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1525 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1536 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1561 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1565 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1570 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1574 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1581 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1585 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1610 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1618 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1629 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1654 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1658 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1665 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1673 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1684 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1709 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1717 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule1724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1728 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1758 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1760 = new BitSet(new long[]{0x0200000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1767 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1771 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1783 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1787 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1813 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1819 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1825 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1833 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1842 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1848 = new BitSet(new long[]{0x0000000000000002L});
}