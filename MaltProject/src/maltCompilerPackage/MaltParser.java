// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g 2023-11-03 19:05:42

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:50:1: parseJava : ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initMaltHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:52:2: ( ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:4: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava65);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:25: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava70);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:62: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava75);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:74: assignRule[null, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava79);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava85); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:59:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule107); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule111); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule115); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:50: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule118);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule123); 
			match(input,LCB,FOLLOW_LCB_in_functionRule125); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:89: ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BLOCKQUOTE||LA3_0==CM||LA3_0==CODEBLOCK||LA3_0==DOTVAR||(LA3_0 >= FOR && LA3_0 <= FORMAT)||LA3_0==IMG||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
					alt3=1;
				}
				else if ( (LA3_0==VAR) ) {
					int LA3_18 = input.LA(2);
					if ( (LA3_18==LP) ) {
						alt3=1;
					}
					else if ( ((LA3_18 >= EQ && LA3_18 <= EQL)) ) {
						alt3=2;
					}

				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:90: ( declarationRule[className,$n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:90: ( declarationRule[className,$n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:91: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule129);
					declarationRule(className, n, false);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:131: ( assignRule[className, $n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:131: ( assignRule[className, $n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:132: assignRule[className, $n, false]
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

			match(input,RCB,FOLLOW_RCB_in_functionRule142); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:66:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:67:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:68:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule166);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule170); 
			h.declareArg(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:68:78: ( CM t= argumentTypeRule n= VAR )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CM) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:68:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule175); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule179);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule183); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:72:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:73:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule207);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule215); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule221); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule227); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule233); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule239); 
					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule245); 
					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule251); 
					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule257); 
					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule263); 
					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule269); 
					}
					break;
				case 12 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:74:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule275); 
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
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule296); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule302); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionCallRule305); 
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
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule312); 
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
							match(input,CM,FOLLOW_CM_in_functionCallRule317); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule321); 
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

			match(input,RP,FOLLOW_RP_in_functionCallRule329); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:84:1: forRule[Token className, Token functionName] : ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] );
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:2: ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FOR) ) {
				alt9=1;
			}
			else if ( (LA9_0==CM) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:4: FOR LP n= VAR forInRule[className, functionName, $n]
					{
					match(input,FOR,FOLLOW_FOR_in_forRule344); 
					match(input,LP,FOLLOW_LP_in_forRule346); 
					n=(Token)match(input,VAR,FOLLOW_VAR_in_forRule350); 
					pushFollow(FOLLOW_forInRule_in_forRule352);
					forInRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:59: forIncrRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule358);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:1: forInRule[Token className, Token functionName, Token name] : IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:2: ( IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:4: IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,IN,FOLLOW_IN_in_forInRule375); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule379); 
			match(input,RP,FOLLOW_RP_in_forInRule381); 
			match(input,LCB,FOLLOW_LCB_in_forInRule383); 
			h.declareFor(className, functionName, false, name, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:80: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==BLOCKQUOTE||LA10_0==CM||LA10_0==CODEBLOCK||LA10_0==DOTVAR||(LA10_0 >= FOR && LA10_0 <= FORMAT)||LA10_0==IMG||(LA10_0 >= LINK && LA10_0 <= LIST)||LA10_0==OLIST||(LA10_0 >= S1TITLE && LA10_0 <= S5TITLE)||(LA10_0 >= TABLE && LA10_0 <= ULIST)) ) {
					alt10=1;
				}
				else if ( (LA10_0==VAR) ) {
					int LA10_18 = input.LA(2);
					if ( (LA10_18==LP) ) {
						alt10=1;
					}
					else if ( ((LA10_18 >= EQ && LA10_18 <= EQL)) ) {
						alt10=2;
					}

				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:81: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule388);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:130: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule393);
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

			match(input,RCB,FOLLOW_RCB_in_forInRule398); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:96:1: forIncrRule[Token className, Token functionName, Token name] : CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:2: ( CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:4: CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,CM,FOLLOW_CM_in_forIncrRule415); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule419); 
			match(input,RP,FOLLOW_RP_in_forIncrRule421); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule423); 
			h.declareFor(className, functionName, true, name, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:83: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==BLOCKQUOTE||LA11_0==CM||LA11_0==CODEBLOCK||LA11_0==DOTVAR||(LA11_0 >= FOR && LA11_0 <= FORMAT)||LA11_0==IMG||(LA11_0 >= LINK && LA11_0 <= LIST)||LA11_0==OLIST||(LA11_0 >= S1TITLE && LA11_0 <= S5TITLE)||(LA11_0 >= TABLE && LA11_0 <= ULIST)) ) {
					alt11=1;
				}
				else if ( (LA11_0==VAR) ) {
					int LA11_18 = input.LA(2);
					if ( (LA11_18==LP) ) {
						alt11=1;
					}
					else if ( ((LA11_18 >= EQ && LA11_18 <= EQL)) ) {
						alt11=2;
					}

				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:84: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule428);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:133: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule433);
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

			match(input,RCB,FOLLOW_RCB_in_forIncrRule438); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:104:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule457); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule461); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule465); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:104:49: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
			loop12:
			while (true) {
				int alt12=4;
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
					alt12=1;
					}
					break;
				case VAR:
					{
					int LA12_18 = input.LA(2);
					if ( (LA12_18==LP) ) {
						alt12=1;
					}
					else if ( ((LA12_18 >= EQ && LA12_18 <= EQL)) ) {
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:104:50: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule468);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:104:84: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule473);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:104:103: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule478);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule483); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==BLOCKQUOTE||LA14_0==CODEBLOCK||LA14_0==DOTVAR||LA14_0==FORMAT||LA14_0==IMG||(LA14_0 >= LINK && LA14_0 <= LIST)||LA14_0==OLIST||(LA14_0 >= S1TITLE && LA14_0 <= S5TITLE)||(LA14_0 >= TABLE && LA14_0 <= ULIST)||LA14_0==VAR) ) {
				alt14=1;
			}
			else if ( (LA14_0==CM||LA14_0==FOR) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:111:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule505);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:112:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule514);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:113:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule523);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:114:5: declareOlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareOlistRule_in_declarationRule532);
							declareOlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:115:5: declareUlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareUlistRule_in_declarationRule541);
							declareUlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:116:5: declareTlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTlistRule_in_declarationRule549);
							declareTlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule557);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:118:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule565);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:119:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule574);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:120:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule582);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:121:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule591);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:122:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule600);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:123:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_declarationRule607);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_declarationRule612); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:123:56: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_declarationRule617);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:128:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule635);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule639); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:82: ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:83: assignTitleRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_declareTitleRule644);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:140: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTitleRule649);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:134:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule672); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule678); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule684); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule690); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule696); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule702); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:139:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:140:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule718); 
			match(input,HA,FOLLOW_HA_in_refRule720); 
			match(input,VAR,FOLLOW_VAR_in_refRule722); 
			match(input,RCB,FOLLOW_RCB_in_refRule724); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:146:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:147:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule742); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule746); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:147:72: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:147:73: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule751);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:147:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTextRule756);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:152:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule776); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule780); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:79: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:80: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule786);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:138: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareBlockQuoteRule791);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:1: declareOlistRule[Token className, Token functionName, boolean inFor] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareOlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:158:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_declareOlistRule811); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareOlistRule815); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareOlistRule820);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareOlistRule825);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:1: declareUlistRule[Token className, Token functionName, boolean inFor] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareUlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:164:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_declareUlistRule846); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareUlistRule850); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareUlistRule855);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareUlistRule860);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:1: declareTlistRule[Token className, Token functionName, boolean inFor] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:170:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_declareTlistRule881); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTlistRule885); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareTlistRule890);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTlistRule895);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:176:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule915); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LP) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_declareCodeBlockRule918); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:19: (~ ( LP | RP | '\"' ) )*
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

					match(input,RP,FOLLOW_RP_in_declareCodeBlockRule936); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule942); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:107: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:108: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule948);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:165: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareCodeBlockRule952);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:182:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule972); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule976); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule981);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule986);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:187:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:188:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1008); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1012);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:44: (t1= CM t2= alignRule )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CM) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1019); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1023);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop26;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1031); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:194:2: ( (v= L |v= C |v= R ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:3: (v= L |v= C |v= R )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:3: (v= L |v= C |v= R )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1053); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1059); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1065); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:199:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:200:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1087); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1091); 
			String cycle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:52: (v3= CM v4= STRING )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==CM) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1098); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1102); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop28;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1110); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:206:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1129); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1133); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1138);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1143);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:212:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1167); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1171); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1176);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1181);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:1: declareListRule[Token className, Token functionName, boolean inFor] : t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:219:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:220:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_declareListRule1202); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule1206); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:220:72: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:220:73: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule1211);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:220:129: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule1216);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:225:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:227:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1240); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:227:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:227:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1243);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:228:5: assignTitleRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1250);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:229:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1257);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:230:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1265);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:231:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1277);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:232:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1289);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:233:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1301);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1306); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:236:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ v1= VAR ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:237:2: ( EQ v1= VAR )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:237:6: EQ v1= VAR
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1320); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1324); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:241:1: assignTitleRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:242:2: ( EQ v= STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:243:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1341); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1345); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:243:15: ( refRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LCB) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:243:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1347);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:247:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:248:2: ( EQ v= STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:249:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1365); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1369); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:253:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:254:2: ( EQ v= textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:255:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1386); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1390);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:259:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:260:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:260:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1409); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1413); 
			String cicle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:260:52: (t1= CM t2= STRING )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:260:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1420); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1424); 
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

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1432); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:265:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:266:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1449); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:266:8: (v1= talignmentRule )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==LSB) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:266:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1453);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1458); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1462);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:266:64: (t1= CM t2= trowRule )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==CM) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:266:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1469); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1473);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop36;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1481); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:270:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:271:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:272:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1498); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1502); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1506); 
			String opt="";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:272:40: (o1= CM o2= STRING )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CM) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:272:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1513); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1517); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1525); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:276:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:277:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:278:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1542); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1546); 
			String v2 = "";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:278:31: (t= STRING |ir= imageRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:278:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1553); 
					v2=t.getText();
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:278:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1561);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1568); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1572); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1576); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:283:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:284:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:285:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1597); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1601); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1605); 
			String cycle = v3.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:285:58: (t1= CM t2= STRING )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==CM) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:285:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule1612); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1616); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule1624); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:290:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:291:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule1647); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1649); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:54: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==STRING||LA43_0==VAR) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:55: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:55: (v= STRING |v= VAR )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:56: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1656); 
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:65: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1660); 
							}
							break;

					}

					vct.add(v);
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:88: ( CM (t= STRING |t= VAR ) )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==CM) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:89: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule1667); 
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:92: (t= STRING |t= VAR )
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
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:93: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1672); 
									}
									break;
								case 2 :
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:102: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1676); 
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

			match(input,RSB,FOLLOW_RSB_in_assignListRule1685); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:296:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:297:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:298:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1702); 
			match(input,LP,FOLLOW_LP_in_formatRule1704); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1708); 
			match(input,CM,FOLLOW_CM_in_formatRule1710); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1714); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule1718); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1722); 
			vct.add(v3);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:298:99: ( CM v4= VAR )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==CM) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:298:100: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule1727); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1731); 
					vct.add(v4);
					}
					break;

				default :
					break loop44;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule1737); 
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



	public static final BitSet FOLLOW_functionRule_in_parseJava65 = new BitSet(new long[]{0x3E0460080B008B10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_parseJava70 = new BitSet(new long[]{0x3E0460080B008B10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_classRule_in_parseJava75 = new BitSet(new long[]{0x3E0460080B008B10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_parseJava79 = new BitSet(new long[]{0x3E0460080B008B10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_EOF_in_parseJava85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionRule111 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule115 = new BitSet(new long[]{0x3E84600804000810L,0x00000000000001F0L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule118 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule123 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule125 = new BitSet(new long[]{0x3E04600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule129 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_functionRule136 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_functionRule142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule170 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule175 = new BitSet(new long[]{0x3E04600804000810L,0x00000000000001F0L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule183 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule296 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule302 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule305 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule312 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule321 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule344 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forRule346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_forRule350 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_forInRule_in_forRule352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_forInRule375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_forInRule379 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule381 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule383 = new BitSet(new long[]{0x3E04600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule388 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_forInRule393 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_forInRule398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CM_in_forIncrRule415 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule419 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule421 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule423 = new BitSet(new long[]{0x3E04600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule428 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule433 = new BitSet(new long[]{0x3E44600803008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_classRule461 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule465 = new BitSet(new long[]{0x3E4460080B008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_declarationRule_in_classRule468 = new BitSet(new long[]{0x3E4460080B008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_functionRule_in_classRule473 = new BitSet(new long[]{0x3E4460080B008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_assignRule_in_classRule478 = new BitSet(new long[]{0x3E4460080B008A10L,0x00000000000009F0L});
	public static final BitSet FOLLOW_RCB_in_classRule483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareTitleRule_in_declarationRule505 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTextRule_in_declarationRule514 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareBlockQuoteRule_in_declarationRule523 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareOlistRule_in_declarationRule532 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareUlistRule_in_declarationRule541 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTlistRule_in_declarationRule549 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareCodeBlockRule_in_declarationRule557 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareTableRule_in_declarationRule565 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareImageRule_in_declarationRule574 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareLinkRule_in_declarationRule582 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_declareListRule_in_declarationRule591 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_declarationRule600 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_declarationRule607 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SE_in_declarationRule612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_declarationRule617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_declareTitleRule635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTitleRule639 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_declareTitleRule644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTitleRule649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule718 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_refRule722 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule746 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTextRule756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule780 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareBlockQuoteRule791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_declareOlistRule811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareOlistRule815 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareOlistRule820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareOlistRule825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_declareUlistRule846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareUlistRule850 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareUlistRule855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareUlistRule860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_declareTlistRule881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTlistRule885 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareTlistRule890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTlistRule895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule915 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LP_in_declareCodeBlockRule918 = new BitSet(new long[]{0xFFF77FFFFFFFFFF0L,0x0000000000001FFFL});
	public static final BitSet FOLLOW_RP_in_declareCodeBlockRule936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule942 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareCodeBlockRule952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule976 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1008 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1012 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1019 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1023 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_trowRule1091 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_trowRule1102 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1133 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1171 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_declareListRule1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_declareListRule1206 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1240 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1243 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1250 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1257 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1265 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1277 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1289 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1301 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1345 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1386 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textListRule1413 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textListRule1424 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1449 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1453 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1458 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1462 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1469 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1473 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1498 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1506 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1517 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1542 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1546 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1553 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1561 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1572 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1597 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imageRule1605 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imageRule1616 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1647 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1649 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000802L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1656 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1660 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000802L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1672 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1676 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1702 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1708 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1714 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1722 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_VAR_in_formatRule1731 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1737 = new BitSet(new long[]{0x0000000000000002L});
}
