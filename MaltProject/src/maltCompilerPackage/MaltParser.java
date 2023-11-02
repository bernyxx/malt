// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g 2023-11-02 16:24:50

	package maltCompilerPackage;
	
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
		"LET", "LETTER", "LINK", "LIST", "LP", "LSB", "OCTAL_ESC", "OLIST", "QU", 
		"R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", 
		"S5TITLE", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", "TEXT", 
		"TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS"
	};
	public static final int EOF=-1;
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
	public static final int QU=51;
	public static final int R=52;
	public static final int RAB=53;
	public static final int RCB=54;
	public static final int RP=55;
	public static final int RSB=56;
	public static final int S1TITLE=57;
	public static final int S2TITLE=58;
	public static final int S3TITLE=59;
	public static final int S4TITLE=60;
	public static final int S5TITLE=61;
	public static final int SE=62;
	public static final int SL=63;
	public static final int ST=64;
	public static final int STRING=65;
	public static final int SUBS=66;
	public static final int SUPS=67;
	public static final int TABLE=68;
	public static final int TEXT=69;
	public static final int TITLE=70;
	public static final int TLIST=71;
	public static final int ULIST=72;
	public static final int UNICODE_ESC=73;
	public static final int US=74;
	public static final int VAR=75;
	public static final int WS=76;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g"; }



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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:49:1: parseJava : ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initMaltHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:51:2: ( ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+
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
					int LA1_4 = input.LA(2);
					if ( (LA1_4==LP) ) {
						alt1=2;
					}
					else if ( ((LA1_4 >= EQ && LA1_4 <= EQL)) ) {
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:4: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava57);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:25: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava62);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:62: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava67);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:74: assignRule[null, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava71);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava77); 
			h.printTable();
					System.out.println("    - Ho riconosciuto un documento Malt");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:58:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:59:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule99); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule103); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule107); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:50: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule110);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule115); 
			match(input,LCB,FOLLOW_LCB_in_functionRule117); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:89: ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BLOCKQUOTE||LA3_0==CODEBLOCK||LA3_0==DOTVAR||(LA3_0 >= FOR && LA3_0 <= FORMAT)||LA3_0==IMG||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
					alt3=1;
				}
				else if ( (LA3_0==VAR) ) {
					int LA3_3 = input.LA(2);
					if ( (LA3_3==LP) ) {
						alt3=1;
					}
					else if ( ((LA3_3 >= EQ && LA3_3 <= EQL)) ) {
						alt3=2;
					}

				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:90: ( declarationRule[className,$n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:90: ( declarationRule[className,$n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:91: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule121);
					declarationRule(className, n, false);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:131: ( assignRule[className, $n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:131: ( assignRule[className, $n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:132: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule128);
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

			match(input,RCB,FOLLOW_RCB_in_functionRule134); 
			System.out.println("    - Ho riconosciuto una funzione");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:67:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:68:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:69:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule164);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule168); 
			h.declareArg(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:69:78: ( CM t= argumentTypeRule n= VAR )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CM) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:69:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule173); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule177);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule181); 
					h.declareArg(className, functionName, t, n);
					}
					break;

				default :
					break loop4;
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:73:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			int alt5=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt5=1;
				}
				break;
			case TEXT:
				{
				alt5=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt5=3;
				}
				break;
			case OLIST:
				{
				alt5=4;
				}
				break;
			case ULIST:
				{
				alt5=5;
				}
				break;
			case TLIST:
				{
				alt5=6;
				}
				break;
			case CODEBLOCK:
				{
				alt5=7;
				}
				break;
			case LINK:
				{
				alt5=8;
				}
				break;
			case IMG:
				{
				alt5=9;
				}
				break;
			case TABLE:
				{
				alt5=10;
				}
				break;
			case FORMATTEXT:
				{
				alt5=11;
				}
				break;
			case LIST:
				{
				alt5=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule205);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule213); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule219); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule225); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule231); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule237); 
					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule243); 
					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule249); 
					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule255); 
					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule261); 
					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule267); 
					}
					break;
				case 12 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule273); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:78:1: functionCallRule[Token className, Token functionName] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final void functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:79:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:3: (v1= VAR |v1= DOTVAR )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				alt6=1;
			}
			else if ( (LA6_0==DOTVAR) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule293); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule299); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionCallRule302); 
			Vector<Token> vct = new Vector<Token>();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:70: (t1= VAR ( CM t2= VAR )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:71: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule309); 
					vct.add(t1);
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:94: ( CM t2= VAR )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==CM) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:95: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule314); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule318); 
							vct.add(t2);
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule326); 
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
	}
	// $ANTLR end "functionCallRule"



	// $ANTLR start "forRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:84:1: forRule[Token className, Token functionName] : ( forInRule[className, functionName] | forIncrRule[className, functionName] );
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:2: ( forInRule[className, functionName] | forIncrRule[className, functionName] )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FOR) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==LP) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==VAR) ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3==IN) ) {
							alt9=1;
						}
						else if ( (LA9_3==CM) ) {
							alt9=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:4: forInRule[className, functionName]
					{
					pushFollow(FOLLOW_forInRule_in_forRule341);
					forInRule(className, functionName);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:42: forIncrRule[className, functionName]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule347);
					forIncrRule(className, functionName);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:89:1: forInRule[Token className, Token functionName] : FOR LP n= VAR IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:2: ( FOR LP n= VAR IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:4: FOR LP n= VAR IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forInRule363); 
			match(input,LP,FOLLOW_LP_in_forInRule365); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule369); 
			match(input,IN,FOLLOW_IN_in_forInRule371); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule375); 
			match(input,RP,FOLLOW_RP_in_forInRule377); 
			match(input,LCB,FOLLOW_LCB_in_forInRule379); 
			h.declareFor(className, functionName, false, n, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:91: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==BLOCKQUOTE||LA10_0==CODEBLOCK||LA10_0==DOTVAR||(LA10_0 >= FOR && LA10_0 <= FORMAT)||LA10_0==IMG||(LA10_0 >= LINK && LA10_0 <= LIST)||LA10_0==OLIST||(LA10_0 >= S1TITLE && LA10_0 <= S5TITLE)||(LA10_0 >= TABLE && LA10_0 <= ULIST)) ) {
					alt10=1;
				}
				else if ( (LA10_0==VAR) ) {
					int LA10_3 = input.LA(2);
					if ( (LA10_3==LP) ) {
						alt10=1;
					}
					else if ( ((LA10_3 >= EQ && LA10_3 <= EQL)) ) {
						alt10=2;
					}

				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:108: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule386);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:157: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule391);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,RCB,FOLLOW_RCB_in_forInRule396); 
			System.out.println("    - Ho riconosciuto un for in");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:94:1: forIncrRule[Token className, Token functionName] : FOR LP n= VAR CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:95:2: ( FOR LP n= VAR CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:95:4: FOR LP n= VAR CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forIncrRule412); 
			match(input,LP,FOLLOW_LP_in_forIncrRule414); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forIncrRule418); 
			match(input,CM,FOLLOW_CM_in_forIncrRule420); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule424); 
			match(input,RP,FOLLOW_RP_in_forIncrRule426); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule428); 
			h.declareFor(className, functionName, true, n, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:95:94: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==BLOCKQUOTE||LA11_0==CODEBLOCK||LA11_0==DOTVAR||(LA11_0 >= FOR && LA11_0 <= FORMAT)||LA11_0==IMG||(LA11_0 >= LINK && LA11_0 <= LIST)||LA11_0==OLIST||(LA11_0 >= S1TITLE && LA11_0 <= S5TITLE)||(LA11_0 >= TABLE && LA11_0 <= ULIST)) ) {
					alt11=1;
				}
				else if ( (LA11_0==VAR) ) {
					int LA11_3 = input.LA(2);
					if ( (LA11_3==LP) ) {
						alt11=1;
					}
					else if ( ((LA11_3 >= EQ && LA11_3 <= EQL)) ) {
						alt11=2;
					}

				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:95:111: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule435);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:95:160: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule440);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,RCB,FOLLOW_RCB_in_forIncrRule445); 
			System.out.println("    - Ho riconosciuto un for incr");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:100:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:101:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule464); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule468); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule472); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:49: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
			loop12:
			while (true) {
				int alt12=4;
				switch ( input.LA(1) ) {
				case BLOCKQUOTE:
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
					alt12=1;
					}
					break;
				case VAR:
					{
					int LA12_3 = input.LA(2);
					if ( (LA12_3==LP) ) {
						alt12=1;
					}
					else if ( ((LA12_3 >= EQ && LA12_3 <= EQL)) ) {
						alt12=3;
					}

					}
					break;
				case FUN:
					{
					alt12=2;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:50: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule475);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:84: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule480);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:103: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule485);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule490); 
			System.out.println("    - Ho riconosciuto una classe");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:107:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:108:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==BLOCKQUOTE||LA14_0==CODEBLOCK||LA14_0==DOTVAR||LA14_0==FORMAT||LA14_0==IMG||(LA14_0 >= LINK && LA14_0 <= LIST)||LA14_0==OLIST||(LA14_0 >= S1TITLE && LA14_0 <= S5TITLE)||(LA14_0 >= TABLE && LA14_0 <= ULIST)||LA14_0==VAR) ) {
				alt14=1;
			}
			else if ( (LA14_0==FOR) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
					int alt13=13;
					switch ( input.LA(1) ) {
					case S1TITLE:
					case S2TITLE:
					case S3TITLE:
					case S4TITLE:
					case S5TITLE:
					case TITLE:
						{
						alt13=1;
						}
						break;
					case TEXT:
						{
						alt13=2;
						}
						break;
					case BLOCKQUOTE:
						{
						alt13=3;
						}
						break;
					case OLIST:
						{
						alt13=4;
						}
						break;
					case ULIST:
						{
						alt13=5;
						}
						break;
					case TLIST:
						{
						alt13=6;
						}
						break;
					case CODEBLOCK:
						{
						alt13=7;
						}
						break;
					case TABLE:
						{
						alt13=8;
						}
						break;
					case IMG:
						{
						alt13=9;
						}
						break;
					case LINK:
						{
						alt13=10;
						}
						break;
					case LIST:
						{
						alt13=11;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt13=12;
						}
						break;
					case FORMAT:
						{
						alt13=13;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule512);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule521);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule530);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:112:5: declareOlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareOlistRule_in_declarationRule539);
							declareOlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:113:5: declareUlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareUlistRule_in_declarationRule548);
							declareUlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:114:5: declareTlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTlistRule_in_declarationRule556);
							declareTlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:115:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule564);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:116:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule572);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule581);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:118:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule589);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:119:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule598);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:120:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule607);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:121:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_declarationRule614);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_declarationRule619); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:121:56: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_declarationRule624);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:125:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:126:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule642);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule646); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:82: ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==EQ) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==STRING) ) {
					alt15=1;
				}
				else if ( (LA15_1==VAR) ) {
					alt15=2;
				}
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:83: assignTitleRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_declareTitleRule651);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:140: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTitleRule656);
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
	// $ANTLR end "declareTitleRule"



	// $ANTLR start "titleTypeRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:131:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:132:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			int alt16=6;
			switch ( input.LA(1) ) {
			case TITLE:
				{
				alt16=1;
				}
				break;
			case S1TITLE:
				{
				alt16=2;
				}
				break;
			case S2TITLE:
				{
				alt16=3;
				}
				break;
			case S3TITLE:
				{
				alt16=4;
				}
				break;
			case S4TITLE:
				{
				alt16=5;
				}
				break;
			case S5TITLE:
				{
				alt16=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule679); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule685); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule691); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule697); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule703); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule709); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:137:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:138:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:139:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule725); 
			match(input,HA,FOLLOW_HA_in_refRule727); 
			match(input,VAR,FOLLOW_VAR_in_refRule729); 
			match(input,RCB,FOLLOW_RCB_in_refRule731); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:143:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:144:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule749); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule753); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:72: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==EQ) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==STRING) ) {
					alt17=1;
				}
				else if ( (LA17_1==VAR) ) {
					alt17=2;
				}
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:73: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule758);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTextRule763);
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
	// $ANTLR end "declareTextRule"



	// $ANTLR start "declareBlockQuoteRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:149:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:150:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule783); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule787); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:79: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==EQ) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==STRING) ) {
					alt18=1;
				}
				else if ( (LA18_1==VAR) ) {
					alt18=2;
				}
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:80: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule793);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:138: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareBlockQuoteRule798);
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
	// $ANTLR end "declareBlockQuoteRule"



	// $ANTLR start "declareOlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:155:1: declareOlistRule[Token className, Token functionName, boolean inFor] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareOlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:156:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_declareOlistRule818); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareOlistRule822); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EQ) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==VAR) ) {
					alt19=2;
				}
				else if ( (LA19_1==LP) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareOlistRule827);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareOlistRule832);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:161:1: declareUlistRule[Token className, Token functionName, boolean inFor] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareUlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:162:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_declareUlistRule853); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareUlistRule857); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EQ) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==VAR) ) {
					alt20=2;
				}
				else if ( (LA20_1==LP) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareUlistRule862);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareUlistRule867);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:167:1: declareTlistRule[Token className, Token functionName, boolean inFor] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:168:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_declareTlistRule888); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTlistRule892); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EQ) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==VAR) ) {
					alt21=2;
				}
				else if ( (LA21_1==LP) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareTlistRule897);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTlistRule902);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:173:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:174:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule922); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LP) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_declareCodeBlockRule925); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:19: (~ ( LP | RP | '\"' ) )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= BLOCKQUOTE && LA22_0 <= LIST)||(LA22_0 >= LSB && LA22_0 <= OLIST)||(LA22_0 >= R && LA22_0 <= RCB)||(LA22_0 >= RSB && LA22_0 <= WS)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LIST)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
							break loop22;
						}
					}

					match(input,RP,FOLLOW_RP_in_declareCodeBlockRule943); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule949); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:107: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==STRING) ) {
					alt24=1;
				}
				else if ( (LA24_1==VAR) ) {
					alt24=2;
				}
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:108: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule955);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:165: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareCodeBlockRule959);
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
	// $ANTLR end "declareCodeBlockRule"



	// $ANTLR start "declareTableRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:179:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:180:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule979); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule983); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==EQ) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==VAR) ) {
					alt25=2;
				}
				else if ( ((LA25_1 >= LP && LA25_1 <= LSB)) ) {
					alt25=1;
				}
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule988);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule993);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:185:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:186:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:187:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1015); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1019);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:187:44: (t1= CM t2= alignRule )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CM) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:187:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1026); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1030);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop26;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1038); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:191:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:192:2: ( (v= L |v= C |v= R ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:3: (v= L |v= C |v= R )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:3: (v= L |v= C |v= R )
			int alt27=3;
			switch ( input.LA(1) ) {
			case L:
				{
				alt27=1;
				}
				break;
			case C:
				{
				alt27=2;
				}
				break;
			case R:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1060); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1066); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1072); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:197:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:198:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:199:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1094); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1098); 
			String cycle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:199:52: (v3= CM v4= STRING )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==CM) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:199:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1105); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1109); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop28;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1117); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:203:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:204:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1136); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1140); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==EQI) ) {
				alt29=1;
			}
			else if ( (LA29_0==EQ) ) {
				alt29=2;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1145);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1150);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:209:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:210:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1174); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1178); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EQL) ) {
				alt30=1;
			}
			else if ( (LA30_0==EQ) ) {
				alt30=2;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1183);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1188);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:216:1: declareListRule[Token className, Token functionName, boolean inFor] : t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:217:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_declareListRule1209); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule1213); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:72: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==LSB) ) {
					alt31=1;
				}
				else if ( (LA31_1==VAR) ) {
					alt31=2;
				}
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:73: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule1218);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:129: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule1223);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			System.out.println("    - Ho riconosciuto una lista");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:223:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:224:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:225:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1247); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:225:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
			int alt32=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt32=1;
					}
					break;
				case STRING:
					{
					alt32=2;
					}
					break;
				case LSB:
					{
					int LA32_6 = input.LA(3);
					if ( (LA32_6==RSB||LA32_6==STRING||LA32_6==VAR) ) {
						alt32=7;
					}
					else if ( (LA32_6==C||LA32_6==L||LA32_6==R) ) {
						alt32=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LP:
					{
					int LA32_7 = input.LA(3);
					if ( (LA32_7==STRING) ) {
						alt32=3;
					}
					else if ( (LA32_7==LSB) ) {
						alt32=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt32=5;
				}
				break;
			case EQL:
				{
				alt32=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:225:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1250);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:5: assignTitleRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1257);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:227:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1264);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:228:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1272);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:229:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1284);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:230:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1296);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:231:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1308);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1313); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:234:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ v1= VAR ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:235:2: ( EQ v1= VAR )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:235:6: EQ v1= VAR
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1327); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1331); 
			h.assignVarToVar(className, functionName, inFor, name, v1);
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



	// $ANTLR start "assignTitleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:239:1: assignTitleRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:240:2: ( EQ v= STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:241:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1348); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1352); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:241:15: ( refRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LCB) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:241:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1354);
					refRule();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "assignTitleRule"



	// $ANTLR start "assignStringRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:245:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:246:2: ( EQ v= STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:247:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1372); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1376); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:251:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:2: ( EQ v= textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:253:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1393); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1397);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:257:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:258:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:258:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1416); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1420); 
			String cicle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:258:52: (t1= CM t2= STRING )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==CM) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:258:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1427); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1431); 
					cicle = cicle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1439); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:262:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:263:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1456); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:8: (v1= talignmentRule )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==LSB) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1460);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1465); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1469);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:64: (t1= CM t2= trowRule )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==CM) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1476); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1480);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop36;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1488); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:268:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:269:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:270:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1505); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1509); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1513); 
			String opt="";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:270:40: (o1= CM o2= STRING )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CM) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:270:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1520); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1524); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1532); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:274:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:276:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1549); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1553); 
			String v2 = "";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:276:31: (t= STRING |ir= imageRule )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==STRING) ) {
				alt38=1;
			}
			else if ( (LA38_0==IMG) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:276:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1560); 
					v2=t.getText();
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:276:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1568);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1575); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1579); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1583); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:281:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:282:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:283:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1604); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1608); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1612); 
			String cycle = v3.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:283:58: (t1= CM t2= STRING )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==CM) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:283:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule1619); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1623); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule1631); 
			value = v1.getText() + v2.getText() + cycle + v4.getText();
			System.out.println("    - Ho riconosciuto un'immagine");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:288:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:289:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule1654); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1656); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:54: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==STRING||LA43_0==VAR) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:55: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:55: (v= STRING |v= VAR )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==STRING) ) {
						alt40=1;
					}
					else if ( (LA40_0==VAR) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:56: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1663); 
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:65: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1667); 
							}
							break;

					}

					vct.add(v);
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:88: ( CM (t= STRING |t= VAR ) )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==CM) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:89: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule1674); 
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:92: (t= STRING |t= VAR )
							int alt41=2;
							int LA41_0 = input.LA(1);
							if ( (LA41_0==STRING) ) {
								alt41=1;
							}
							else if ( (LA41_0==VAR) ) {
								alt41=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 41, 0, input);
								throw nvae;
							}

							switch (alt41) {
								case 1 :
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:93: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1679); 
									}
									break;
								case 2 :
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:102: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1683); 
									}
									break;

							}

							vct.add(t);
							}
							break;

						default :
							break loop42;
						}
					}

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule1692); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:294:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:295:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:296:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1709); 
			match(input,LP,FOLLOW_LP_in_formatRule1711); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1715); 
			match(input,CM,FOLLOW_CM_in_formatRule1717); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1721); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule1725); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1729); 
			vct.add(v3);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:296:99: ( CM v4= VAR )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==CM) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:296:100: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule1734); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1738); 
					vct.add(v4);
					}
					break;

				default :
					break loop44;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule1744); 
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



	public static final BitSet FOLLOW_functionRule_in_parseJava57 = new BitSet(new long[]{0x3E0460080B008910L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_parseJava62 = new BitSet(new long[]{0x3E0460080B008910L,0x00000000000009F0L});
	public static final BitSet FOLLOW_classRule_in_parseJava67 = new BitSet(new long[]{0x3E0460080B008910L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_parseJava71 = new BitSet(new long[]{0x3E0460080B008910L,0x00000000000009F0L});
	public static final BitSet FOLLOW_EOF_in_parseJava77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionRule103 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule107 = new BitSet(new long[]{0x3E84600804000810L,0x00000000000001F0L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule110 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule115 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule117 = new BitSet(new long[]{0x3E04600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule121 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_functionRule128 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_functionRule134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule168 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule173 = new BitSet(new long[]{0x3E04600804000810L,0x00000000000001F0L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule181 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule293 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule299 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule302 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule309 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule318 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInRule_in_forRule341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forInRule363 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forInRule365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_forInRule369 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_IN_in_forInRule371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_forInRule375 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule377 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule379 = new BitSet(new long[]{0x3E04600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule386 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_forInRule391 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_forInRule396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forIncrRule412 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forIncrRule414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_forIncrRule418 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_forIncrRule420 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule424 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule426 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule428 = new BitSet(new long[]{0x3E04600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule435 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule440 = new BitSet(new long[]{0x3E44600803008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_classRule468 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule472 = new BitSet(new long[]{0x3E4460080B008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_classRule475 = new BitSet(new long[]{0x3E4460080B008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_functionRule_in_classRule480 = new BitSet(new long[]{0x3E4460080B008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_classRule485 = new BitSet(new long[]{0x3E4460080B008810L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_classRule490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareTitleRule_in_declarationRule512 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTextRule_in_declarationRule521 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareBlockQuoteRule_in_declarationRule530 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareOlistRule_in_declarationRule539 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareUlistRule_in_declarationRule548 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTlistRule_in_declarationRule556 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareCodeBlockRule_in_declarationRule564 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTableRule_in_declarationRule572 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareImageRule_in_declarationRule581 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareLinkRule_in_declarationRule589 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareListRule_in_declarationRule598 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_declarationRule607 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_declarationRule614 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SE_in_declarationRule619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_declarationRule624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_declareTitleRule642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTitleRule646 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_declareTitleRule651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTitleRule656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule725 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_refRule729 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule753 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTextRule763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule787 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareBlockQuoteRule798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_declareOlistRule818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareOlistRule822 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareOlistRule827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareOlistRule832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_declareUlistRule853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareUlistRule857 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareUlistRule862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareUlistRule867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_declareTlistRule888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTlistRule892 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareTlistRule897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTlistRule902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule922 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_declareCodeBlockRule925 = new BitSet(new long[]{0xFFF77FFFFFFFFFF0L,0x0000000000001FFFL});
	public static final BitSet FOLLOW_RP_in_declareCodeBlockRule943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule949 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareCodeBlockRule959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule983 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1015 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1019 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1026 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1030 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_trowRule1098 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_trowRule1109 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1140 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1178 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_declareListRule1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareListRule1213 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1247 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1250 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1257 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1264 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1272 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1284 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1296 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1308 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1352 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1393 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textListRule1420 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textListRule1431 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1456 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1460 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1465 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1469 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1476 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1480 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1505 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1513 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1524 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1549 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1553 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1560 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1568 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1579 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1604 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imageRule1612 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imageRule1623 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1654 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1656 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000802L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1663 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1667 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1679 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1683 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1709 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1715 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1721 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1729 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1738 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1744 = new BitSet(new long[]{0x0000000000000002L});
}
