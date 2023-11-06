// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g 2023-11-06 18:00:56

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:51:1: parseJava : ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initMaltHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:53:2: ( ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:4: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava66);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:25: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava71);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:62: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava76);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:54:74: assignRule[null, null, false]
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:60:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:61:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ ( returnRule[className, $n] )? RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule108); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule112); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule116); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:50: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule119);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule124); 
			match(input,LCB,FOLLOW_LCB_in_functionRule126); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:89: ( ( declarationRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:90: ( declarationRule[className,$n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:90: ( declarationRule[className,$n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:91: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule130);
					declarationRule(className, n, false);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:131: ( assignRule[className, $n, false] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:131: ( assignRule[className, $n, false] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:132: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule137);
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

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:168: ( returnRule[className, $n] )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETURN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:62:168: returnRule[className, $n]
					{
					pushFollow(FOLLOW_returnRule_in_functionRule143);
					returnRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RCB,FOLLOW_RCB_in_functionRule147); 
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
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule171);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule175); 
			h.declareArg(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:69:78: ( CM t= argumentTypeRule n= VAR )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:69:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule180); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule184);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule188); 
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule212);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule220); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule226); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule232); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule238); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule244); 
					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule250); 
					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule256); 
					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule262); 
					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule268); 
					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule274); 
					}
					break;
				case 12 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:75:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule280); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:79:1: functionCallRule[Token className, Token functionName] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final void functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:80:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:3: (v1= VAR |v1= DOTVAR )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule301); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule307); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionCallRule310); 
			Vector<Token> vct = new Vector<Token>();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:70: (t1= VAR ( CM t2= VAR )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:71: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule317); 
					vct.add(t1);
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:94: ( CM t2= VAR )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:81:95: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule322); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule326); 
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

			match(input,RP,FOLLOW_RP_in_functionCallRule334); 
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



	// $ANTLR start "returnRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:84:1: returnRule[Token className, Token functionName] : RETURN (v= VAR |v= STRING ) SE ;
	public final void returnRule(Token className, Token functionName) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:85:2: ( RETURN (v= VAR |v= STRING ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:86:3: RETURN (v= VAR |v= STRING ) SE
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule350); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:86:10: (v= VAR |v= STRING )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:86:11: v= VAR
					{
					v=(Token)match(input,VAR,FOLLOW_VAR_in_returnRule355); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:86:19: v= STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_returnRule361); 
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_returnRule364); 
			handleReturn(className,functionName,v);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:90:1: forRule[Token className, Token functionName] : ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] );
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:2: ( FOR LP n= VAR forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:4: FOR LP n= VAR forInRule[className, functionName, $n]
					{
					match(input,FOR,FOLLOW_FOR_in_forRule379); 
					match(input,LP,FOLLOW_LP_in_forRule381); 
					n=(Token)match(input,VAR,FOLLOW_VAR_in_forRule385); 
					pushFollow(FOLLOW_forInRule_in_forRule387);
					forInRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:91:59: forIncrRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule393);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:96:1: forInRule[Token className, Token functionName, Token name] : IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:2: ( IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:4: IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,IN,FOLLOW_IN_in_forInRule410); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule414); 
			match(input,RP,FOLLOW_RP_in_forInRule416); 
			match(input,LCB,FOLLOW_LCB_in_forInRule418); 
			h.declareFor(className, functionName, false, name, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:80: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:81: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule423);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:97:130: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule428);
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

			match(input,RCB,FOLLOW_RCB_in_forInRule433); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:102:1: forIncrRule[Token className, Token functionName, Token name] : CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:2: ( CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:4: CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,CM,FOLLOW_CM_in_forIncrRule450); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule454); 
			match(input,RP,FOLLOW_RP_in_forIncrRule456); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule458); 
			h.declareFor(className, functionName, true, name, i);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:83: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:84: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule463);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:103:133: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule468);
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

			match(input,RCB,FOLLOW_RCB_in_forIncrRule473); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:108:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:109:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule492); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule496); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule500); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:49: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:50: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule503);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:84: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule508);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:110:103: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule513);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule518); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:115:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:116:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareOlistRule[className, functionName, inFor] | declareUlistRule[className, functionName, inFor] | declareTlistRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:117:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule540);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:118:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule549);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:119:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule558);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:120:5: declareOlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareOlistRule_in_declarationRule567);
							declareOlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:121:5: declareUlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareUlistRule_in_declarationRule576);
							declareUlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:122:5: declareTlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTlistRule_in_declarationRule584);
							declareTlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:123:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule592);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:124:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule600);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:125:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule609);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:126:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule617);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:127:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule626);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:128:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule635);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:5: formatRule[className, functionName, inFor]
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:129:56: forRule[className, functionName]
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:133:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:134:2: (t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:3: t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule670);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule674); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:82: ( refRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LCB) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:82: refRule
					{
					pushFollow(FOLLOW_refRule_in_declareTitleRule678);
					refRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:91: ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==EQ) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==STRING) ) {
					alt18=1;
				}
				else if ( (LA18_1==LP) ) {
					alt18=2;
				}
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:92: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTitleRule682);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:135:150: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTitleRule687);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:139:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:140:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule710); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule716); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule722); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule728); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule734); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:141:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule740); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:145:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:146:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:147:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule756); 
			match(input,HA,FOLLOW_HA_in_refRule758); 
			match(input,VAR,FOLLOW_VAR_in_refRule760); 
			match(input,RCB,FOLLOW_RCB_in_refRule762); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:151:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:152:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule780); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule784); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:72: ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EQ) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==STRING) ) {
					alt20=1;
				}
				else if ( (LA20_1==LP) ) {
					alt20=2;
				}
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:73: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule789);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:153:131: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTextRule794);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:157:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:158:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule814); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule818); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:79: ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EQ) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==STRING) ) {
					alt21=1;
				}
				else if ( (LA21_1==LP) ) {
					alt21=2;
				}
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:80: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule824);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:159:138: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareBlockQuoteRule829);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:163:1: declareOlistRule[Token className, Token functionName, boolean inFor] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareOlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:164:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_declareOlistRule849); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareOlistRule853); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==EQ) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==VAR) ) {
					alt22=2;
				}
				else if ( (LA22_1==LP) ) {
					alt22=1;
				}
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareOlistRule858);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:165:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareOlistRule863);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:169:1: declareUlistRule[Token className, Token functionName, boolean inFor] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareUlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:170:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_declareUlistRule884); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareUlistRule888); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==VAR) ) {
					alt23=2;
				}
				else if ( (LA23_1==LP) ) {
					alt23=1;
				}
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareUlistRule893);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:171:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareUlistRule898);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:175:1: declareTlistRule[Token className, Token functionName, boolean inFor] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:176:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_declareTlistRule919); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTlistRule923); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==VAR) ) {
					alt24=2;
				}
				else if ( (LA24_1==LP) ) {
					alt24=1;
				}
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_declareTlistRule928);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:177:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTlistRule933);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:181:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:182:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule953); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LP) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_declareCodeBlockRule956); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:19: (~ ( LP | RP | '\"' ) )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= BLOCKQUOTE && LA25_0 <= LIST)||(LA25_0 >= LSB && LA25_0 <= RETURN)||(LA25_0 >= RSB && LA25_0 <= WS)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
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

					match(input,RP,FOLLOW_RP_in_declareCodeBlockRule974); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule980); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:107: ( assignStringRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt27=3;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==STRING) ) {
					alt27=1;
				}
				else if ( (LA27_1==LP) ) {
					alt27=2;
				}
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:108: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule986);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:183:165: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareCodeBlockRule990);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:187:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:188:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule1010); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule1014); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==VAR) ) {
					alt28=2;
				}
				else if ( ((LA28_1 >= LP && LA28_1 <= LSB)) ) {
					alt28=1;
				}
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule1019);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:189:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule1024);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:193:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:194:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1046); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1050);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:44: (t1= CM t2= alignRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==CM) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:195:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1057); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1061);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop29;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1069); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:199:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:200:2: ( (v= L |v= C |v= R ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:3: (v= L |v= C |v= R )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:3: (v= L |v= C |v= R )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1091); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1097); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:201:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1103); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:205:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:206:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1125); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1129); 
			String cycle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:52: (v3= CM v4= STRING )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==CM) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:207:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1136); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1140); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop31;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1148); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:211:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:212:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1167); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1171); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1176);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:213:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1181);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:217:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:218:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:219:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1205); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1209); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:219:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:219:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1214);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:219:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1219);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:224:1: declareListRule[Token className, Token functionName, boolean inFor] : t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:225:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_declareListRule1240); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule1244); 
			h.declareNew(className, functionName, inFor, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:72: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==LSB) ) {
					alt34=1;
				}
				else if ( (LA34_1==VAR) ) {
					alt34=2;
				}
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:73: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule1249);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:226:129: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule1254);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:231:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:232:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:233:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1278); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:233:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
			int alt35=8;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt35=1;
					}
					break;
				case LP:
					{
					switch ( input.LA(3) ) {
					case STRING:
						{
						int LA35_8 = input.LA(4);
						if ( (LA35_8==CM) ) {
							alt35=4;
						}
						else if ( (LA35_8==PLUS||LA35_8==RP) ) {
							alt35=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 8, input);
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
								new NoViableAltException("", 35, 5, input);
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
					int LA35_7 = input.LA(3);
					if ( (LA35_7==RSB||LA35_7==STRING||LA35_7==VAR) ) {
						alt35=8;
					}
					else if ( (LA35_7==C||LA35_7==L||LA35_7==R) ) {
						alt35=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 7, input);
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:233:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1281);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:234:5: assignExprRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_assignRule1288);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:235:5: assignStringRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_assignRule1295);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:236:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1302);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:237:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1310);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:238:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1322);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:239:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1334);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:240:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1346);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1351); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:244:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ v1= VAR ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:245:2: ( EQ v1= VAR )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:246:3: EQ v1= VAR
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1368); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1372); 
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



	// $ANTLR start "assignExprRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:250:1: assignExprRule[Token className, Token functionName, boolean inFor, Token name] : EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP ;
	public final void assignExprRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:251:2: ( EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:3: EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignExprRule1394); 
			match(input,LP,FOLLOW_LP_in_assignExprRule1396); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:52: (v1= STRING |v1= VAR )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==STRING) ) {
				alt36=1;
			}
			else if ( (LA36_0==VAR) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:53: v1= STRING
					{
					v1=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1401); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:63: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1405); 
					}
					break;

			}

			vct.add(v1);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:87: ( PLUS (v2= STRING |v2= VAR ) )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==PLUS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:88: PLUS (v2= STRING |v2= VAR )
					{
					match(input,PLUS,FOLLOW_PLUS_in_assignExprRule1411); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:93: (v2= STRING |v2= VAR )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:94: v2= STRING
							{
							v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1416); 
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:252:104: v2= VAR
							{
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1420); 
							}
							break;

					}

					vct.add(v2);
					}
					break;

				default :
					break loop38;
				}
			}

			match(input,RP,FOLLOW_RP_in_assignExprRule1427); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:256:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:257:2: ( EQ v= STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:258:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1444); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1448); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:262:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:263:2: ( EQ v= textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:264:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1465); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1469);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:268:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:269:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:269:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1488); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1492); 
			String cicle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:269:52: (t1= CM t2= STRING )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CM) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:269:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1499); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1503); 
					cicle = cicle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1511); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:273:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:274:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1528); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:8: (v1= talignmentRule )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LSB) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1532);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1537); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1541);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:64: (t1= CM t2= trowRule )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==CM) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:275:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1548); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1552);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop41;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1560); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:279:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:280:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:281:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1577); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1581); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1585); 
			String opt="";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:281:40: (o1= CM o2= STRING )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==CM) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:281:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1592); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1596); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1604); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:285:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:286:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:287:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1621); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1625); 
			String v2 = "";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:287:31: (t= STRING |ir= imageRule )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==STRING) ) {
				alt43=1;
			}
			else if ( (LA43_0==IMG) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:287:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1632); 
					v2=t.getText();
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:287:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1640);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1647); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1651); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1655); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:292:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:293:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:294:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1676); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1680); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1684); 
			String cycle = v3.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:294:58: (t1= CM t2= STRING )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==CM) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:294:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule1691); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1695); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule1703); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:299:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:300:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule1726); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1728); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:54: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==STRING||LA48_0==VAR) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:55: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:55: (v= STRING |v= VAR )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==STRING) ) {
						alt45=1;
					}
					else if ( (LA45_0==VAR) ) {
						alt45=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:56: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1735); 
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:65: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1739); 
							}
							break;

					}

					vct.add(v);
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:88: ( CM (t= STRING |t= VAR ) )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==CM) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:89: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule1746); 
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:92: (t= STRING |t= VAR )
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
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:93: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1751); 
									}
									break;
								case 2 :
									// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:301:102: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1755); 
									}
									break;

							}

							vct.add(t);
							}
							break;

						default :
							break loop47;
						}
					}

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule1764); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:305:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:306:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:307:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1781); 
			match(input,LP,FOLLOW_LP_in_formatRule1783); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1787); 
			match(input,CM,FOLLOW_CM_in_formatRule1789); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1793); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule1797); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1801); 
			vct.add(v3);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:307:99: ( CM v4= VAR )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==CM) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:307:100: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule1806); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1810); 
					vct.add(v4);
					}
					break;

				default :
					break loop49;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule1816); 
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
	public static final BitSet FOLLOW_FUN_in_functionRule108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionRule112 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule116 = new BitSet(new long[]{0x7D04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule119 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule124 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule126 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule130 = new BitSet(new long[]{0x7CC4600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_functionRule137 = new BitSet(new long[]{0x7CC4600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_returnRule_in_functionRule143 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_functionRule147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule175 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule180 = new BitSet(new long[]{0x7C04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule188 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule301 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule307 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule310 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule317 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule326 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_VAR_in_returnRule355 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_returnRule361 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_returnRule364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule379 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forRule381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forRule385 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_forInRule_in_forRule387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_forInRule410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forInRule414 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule416 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule418 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule423 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forInRule428 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forInRule433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CM_in_forIncrRule450 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule454 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule456 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule458 = new BitSet(new long[]{0x7C04600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule463 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule468 = new BitSet(new long[]{0x7C44600803008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_classRule496 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule500 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_classRule503 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_functionRule_in_classRule508 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_classRule513 = new BitSet(new long[]{0x7C4460080B008A10L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_classRule518 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_assignExprRule_in_declareTitleRule687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule756 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_refRule760 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule784 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTextRule794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule818 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareBlockQuoteRule829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_declareOlistRule849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareOlistRule853 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareOlistRule858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareOlistRule863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_declareUlistRule884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareUlistRule888 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareUlistRule893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareUlistRule898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_declareTlistRule919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTlistRule923 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_declareTlistRule928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTlistRule933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule953 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LP_in_declareCodeBlockRule956 = new BitSet(new long[]{0xFFFF7FFFFFFFFFF0L,0x0000000000003FFFL});
	public static final BitSet FOLLOW_RP_in_declareCodeBlockRule974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule980 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareCodeBlockRule990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule1014 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1046 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1050 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1057 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1061 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1129 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1140 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1171 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1209 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_declareListRule1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareListRule1244 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1278 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1281 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignExprRule_in_assignRule1288 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignStringRule_in_assignRule1295 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1302 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1310 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1322 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1334 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1346 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignExprRule1394 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignExprRule1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1401 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1405 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_PLUS_in_assignExprRule1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1416 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1420 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_RP_in_assignExprRule1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1465 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1492 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1503 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1528 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1532 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1537 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1541 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1548 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1552 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1577 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1585 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1596 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1621 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1625 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1632 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1640 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1651 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1676 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1684 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1695 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1726 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1728 = new BitSet(new long[]{0x0200000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1735 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1739 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1751 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1755 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1781 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1787 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1793 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1801 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1810 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1816 = new BitSet(new long[]{0x0000000000000002L});
}
