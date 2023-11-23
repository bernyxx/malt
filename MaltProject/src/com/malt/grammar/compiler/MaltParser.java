// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g 2023-11-23 16:17:35

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
		"TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS"
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
					int LA1_11 = input.LA(2);
					if ( (LA1_11==LP) ) {
						alt1=2;
					}
					else if ( ((LA1_11 >= EQ && LA1_11 <= EQL)) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:55:5: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava74);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:56:5: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava82);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:57:5: assignRule[null, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava89);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava98); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:63:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:64:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:65:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule119); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule126); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule133); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:67:6: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:67:7: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule136);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule144); 
			match(input,LCB,FOLLOW_LCB_in_functionRule149); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:70:3: ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BLOCKQUOTE||LA3_0==CODEBLOCK||LA3_0==DOTVAR||(LA3_0 >= FOR && LA3_0 <= FORMAT)||LA3_0==IMG||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
					alt3=1;
				}
				else if ( (LA3_0==VAR) ) {
					int LA3_11 = input.LA(2);
					if ( (LA3_11==LP) ) {
						alt3=1;
					}
					else if ( ((LA3_11 >= EQ && LA3_11 <= EQL)) ) {
						alt3=2;
					}

				}

				switch (alt3) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:70:5: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule156);
					declarationRule(className, n, false);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:71:5: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule164);
					assignRule(className, n, false);
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:72:3: ( returnRule[className, $n] )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETURN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:72:3: returnRule[className, $n]
					{
					pushFollow(FOLLOW_returnRule_in_functionRule172);
					returnRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RCB,FOLLOW_RCB_in_functionRule179); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:78:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:79:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:80:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule201);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule208); 
			h.declareArg(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:82:3: ( CM t= argumentTypeRule n= VAR )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:82:5: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule217); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule226);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule235); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:88:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:89:2: ( (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:3: (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:3: (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= S1TITLE && LA6_0 <= S5TITLE)||LA6_0==TITLE) ) {
				alt6=1;
			}
			else if ( (LA6_0==BLOCKQUOTE||LA6_0==CODEBLOCK||LA6_0==FORMATTEXT||LA6_0==IMG||(LA6_0 >= LINK && LA6_0 <= LIST)||LA6_0==OLIST||(LA6_0 >= TABLE && LA6_0 <= TEXT)||(LA6_0 >= TLIST && LA6_0 <= ULIST)) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:90:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule259);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:91:5: t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST )
					{
					t=input.LT(1);
					if ( input.LA(1)==BLOCKQUOTE||input.LA(1)==CODEBLOCK||input.LA(1)==FORMATTEXT||input.LA(1)==IMG||(input.LA(1) >= LINK && input.LA(1) <= LIST)||input.LA(1)==OLIST||(input.LA(1) >= TABLE && input.LA(1) <= TEXT)||(input.LA(1) >= TLIST && input.LA(1) <= ULIST) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:106:1: functionCallRule[Token className, Token functionName] returns [Token calledFunction] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final Token functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token calledFunction = null;


		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:107:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:108:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:108:3: (v1= VAR |v1= DOTVAR )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:108:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule370); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:108:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule376); 
					}
					break;

			}

			calledFunction = v1;
			match(input,LP,FOLLOW_LP_in_functionCallRule384); 
			Vector<Token> vct = new Vector<Token>();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:110:3: (t1= VAR ( CM t2= VAR )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:110:4: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule394); 
					vct.add(t1);
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:110:27: ( CM t2= VAR )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:110:28: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule399); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule403); 
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

			match(input,RP,FOLLOW_RP_in_functionCallRule414); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:115:1: returnRule[Token className, Token functionName] : RETURN (v= VAR |v= STRING ) SE ;
	public final void returnRule(Token className, Token functionName) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:116:2: ( RETURN (v= VAR |v= STRING ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:117:3: RETURN (v= VAR |v= STRING ) SE
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule431); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:117:10: (v= VAR |v= STRING )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:117:11: v= VAR
					{
					v=(Token)match(input,VAR,FOLLOW_VAR_in_returnRule436); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:117:19: v= STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_returnRule442); 
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_returnRule445); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:121:1: forRule[Token className, Token functionName] : FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] ) ;
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:2: ( FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:4: FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule460); 
			match(input,LP,FOLLOW_LP_in_forRule462); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forRule466); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:17: ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IN) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:18: forInRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forInRule_in_forRule469);
					forInRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:122:60: forIncrRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule475);
					forIncrRule(className, functionName, n);
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
	// $ANTLR end "forRule"



	// $ANTLR start "forInRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:127:1: forInRule[Token className, Token functionName, Token name] : IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:2: ( IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:4: IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,IN,FOLLOW_IN_in_forInRule493); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule497); 
			match(input,RP,FOLLOW_RP_in_forInRule499); 
			match(input,LCB,FOLLOW_LCB_in_forInRule501); 
			h.declareFor(className, functionName, false, name, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:81: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BLOCKQUOTE||LA12_0==CODEBLOCK||LA12_0==DOTVAR||(LA12_0 >= FOR && LA12_0 <= FORMAT)||LA12_0==IMG||(LA12_0 >= LINK && LA12_0 <= LIST)||LA12_0==OLIST||(LA12_0 >= S1TITLE && LA12_0 <= S5TITLE)||(LA12_0 >= TABLE && LA12_0 <= ULIST)) ) {
					alt12=1;
				}
				else if ( (LA12_0==VAR) ) {
					int LA12_10 = input.LA(2);
					if ( (LA12_10==LP) ) {
						alt12=1;
					}
					else if ( ((LA12_10 >= EQ && LA12_10 <= EQL)) ) {
						alt12=2;
					}

				}

				switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:82: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule506);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:128:131: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule511);
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

			match(input,RCB,FOLLOW_RCB_in_forInRule516); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:133:1: forIncrRule[Token className, Token functionName, Token name] : CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:2: ( CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:4: CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,CM,FOLLOW_CM_in_forIncrRule532); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule536); 
			match(input,RP,FOLLOW_RP_in_forIncrRule538); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule540); 
			h.declareFor(className, functionName, true, name, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:84: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BLOCKQUOTE||LA13_0==CODEBLOCK||LA13_0==DOTVAR||(LA13_0 >= FOR && LA13_0 <= FORMAT)||LA13_0==IMG||(LA13_0 >= LINK && LA13_0 <= LIST)||LA13_0==OLIST||(LA13_0 >= S1TITLE && LA13_0 <= S5TITLE)||(LA13_0 >= TABLE && LA13_0 <= ULIST)) ) {
					alt13=1;
				}
				else if ( (LA13_0==VAR) ) {
					int LA13_10 = input.LA(2);
					if ( (LA13_10==LP) ) {
						alt13=1;
					}
					else if ( ((LA13_10 >= EQ && LA13_10 <= EQL)) ) {
						alt13=2;
					}

				}

				switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:85: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule545);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:134:134: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule550);
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

			match(input,RCB,FOLLOW_RCB_in_forIncrRule555); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:139:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:140:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:141:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule573); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule577); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule581); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:141:49: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
			loop14:
			while (true) {
				int alt14=4;
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
					alt14=1;
					}
					break;
				case VAR:
					{
					int LA14_10 = input.LA(2);
					if ( (LA14_10==LP) ) {
						alt14=1;
					}
					else if ( ((LA14_10 >= EQ && LA14_10 <= EQL)) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:141:50: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule584);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:141:84: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule589);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:141:103: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule594);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule599); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:146:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:147:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==DOTVAR||LA16_0==FORMAT||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)||LA16_0==VAR) ) {
				alt16=1;
			}
			else if ( (LA16_0==FOR) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:148:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:148:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:148:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:148:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
					int alt15=10;
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
					case CODEBLOCK:
						{
						alt15=4;
						}
						break;
					case LIST:
					case OLIST:
					case TLIST:
					case ULIST:
						{
						alt15=5;
						}
						break;
					case TABLE:
						{
						alt15=6;
						}
						break;
					case IMG:
						{
						alt15=7;
						}
						break;
					case LINK:
						{
						alt15=8;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt15=9;
						}
						break;
					case FORMAT:
						{
						alt15=10;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:148:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule620);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:149:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule629);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:150:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule638);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:151:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule647);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:152:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule655);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:153:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule664);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:154:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule673);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:155:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule681);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:156:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule690);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:157:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_declarationRule697);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_declarationRule702); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:157:56: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_declarationRule707);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:161:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:162:2: (t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:3: t= titleTypeRule n= VAR ( refRule )? ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule725);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule729); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:82: ( refRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LCB) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:82: refRule
					{
					pushFollow(FOLLOW_refRule_in_declareTitleRule733);
					refRule();
					state._fsp--;

					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:91: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:92: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTitleRule737);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:150: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTitleRule742);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:163:210: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTitleRule747);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:167:1: titleTypeRule returns [Token type] : t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:168:2: (t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:169:3: t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
			{
			t=input.LT(1);
			if ( (input.LA(1) >= S1TITLE && input.LA(1) <= S5TITLE)||input.LA(1)==TITLE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:173:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:174:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:175:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule806); 
			match(input,HA,FOLLOW_HA_in_refRule808); 
			match(input,VAR,FOLLOW_VAR_in_refRule810); 
			match(input,RCB,FOLLOW_RCB_in_refRule812); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:179:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:180:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule830); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule834); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:72: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt19=4;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt19=1;
						}
						break;
					case LP:
						{
						alt19=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt19=2;
						}
						break;
				}
			}
			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:73: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule839);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTextRule844);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:181:191: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTextRule849);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:185:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:186:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule869); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule873); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:79: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:80: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule879);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:138: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareBlockQuoteRule884);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:187:198: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareBlockQuoteRule889);
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



	// $ANTLR start "declareCodeBlockRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:191:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:192:2: (t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:3: t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule909); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:15: ( VAR )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==VAR) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:15: VAR
					{
					match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule911); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule916); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:83: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			int alt22=4;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==EQ) ) {
				switch ( input.LA(2) ) {
					case STRING:
						{
						alt22=1;
						}
						break;
					case LP:
						{
						alt22=3;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt22=2;
						}
						break;
				}
			}
			switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:84: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule922);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:142: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareCodeBlockRule927);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:193:201: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareCodeBlockRule931);
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



	// $ANTLR start "declareListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:196:1: declareListRule[Token className, Token functionName, boolean inFor] : t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:197:2: (t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:198:3: t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			pushFollow(FOLLOW_typeListRule_in_declareListRule950);
			t=typeListRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule957); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:3: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==LSB) ) {
					alt23=1;
				}
				else if ( (LA23_1==DOTVAR||LA23_1==VAR) ) {
					alt23=2;
				}
			}
			switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:200:5: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule966);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:201:5: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule974);
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



	// $ANTLR start "typeListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:205:1: typeListRule returns [Token type] : t= ( LIST | OLIST | ULIST | TLIST ) ;
	public final Token typeListRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:206:2: (t= ( LIST | OLIST | ULIST | TLIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:207:3: t= ( LIST | OLIST | ULIST | TLIST )
			{
			t=input.LT(1);
			if ( input.LA(1)==LIST||input.LA(1)==OLIST||(input.LA(1) >= TLIST && input.LA(1) <= ULIST) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "typeListRule"



	// $ANTLR start "declareTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:211:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:212:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:213:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule1031); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule1035); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:213:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				int LA24_1 = input.LA(2);
				if ( ((LA24_1 >= LP && LA24_1 <= LSB)) ) {
					alt24=1;
				}
				else if ( (LA24_1==DOTVAR||LA24_1==VAR) ) {
					alt24=2;
				}
			}
			switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:213:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule1040);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:213:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule1045);
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



	// $ANTLR start "declareImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:220:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:221:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:222:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1068); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1072); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:222:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==EQI) ) {
				alt25=1;
			}
			else if ( (LA25_0==EQ) ) {
				alt25=2;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:222:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1077);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:222:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1082);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:226:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:227:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:228:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1106); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1110); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:228:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EQL) ) {
				alt26=1;
			}
			else if ( (LA26_0==EQ) ) {
				alt26=2;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:228:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1115);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:228:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1120);
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



	// $ANTLR start "assignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:232:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:233:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:234:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1140); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:234:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
			int alt27=8;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case LP:
					{
					switch ( input.LA(3) ) {
					case STRING:
						{
						int LA27_9 = input.LA(4);
						if ( (LA27_9==CM) ) {
							alt27=4;
						}
						else if ( (LA27_9==PLUS||LA27_9==RP) ) {
							alt27=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 27, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VAR:
						{
						alt27=2;
						}
						break;
					case LSB:
						{
						alt27=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case STRING:
					{
					alt27=3;
					}
					break;
				case LSB:
					{
					int LA27_6 = input.LA(3);
					if ( (LA27_6==RSB||LA27_6==STRING||LA27_6==VAR) ) {
						alt27=8;
					}
					else if ( (LA27_6==C||LA27_6==L||LA27_6==R) ) {
						alt27=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 6, input);
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
					alt27=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt27=6;
				}
				break;
			case EQL:
				{
				alt27=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:234:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1143);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:235:5: assignExprRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_assignRule1150);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:236:5: assignStringRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_assignRule1157);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:237:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1164);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:238:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1172);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:239:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1184);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:240:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1196);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:241:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1208);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1213); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:245:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] ) ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token n=null;
		Token v3 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:246:2: ( EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:247:3: EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] )
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1230); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:247:6: (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] )
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==VAR) ) {
				switch ( input.LA(2) ) {
				case LSB:
					{
					alt28=2;
					}
					break;
				case SE:
					{
					alt28=1;
					}
					break;
				case LP:
					{
					alt28=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA28_0==DOTVAR) ) {
				alt28=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:247:7: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1235); 
					h.assignVarToVar(className, functionName, inFor, false, name, v1);
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:248:8: v2= VAR LSB n= INTEGER RSB
					{
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1249); 
					match(input,LSB,FOLLOW_LSB_in_assignVariableRule1251); 
					n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_assignVariableRule1255); 
					match(input,RSB,FOLLOW_RSB_in_assignVariableRule1257); 
					h.assignListItemToVar(className, functionName, inFor, name, v2, n);
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:249:8: v3= functionCallRule[$className, $functionName]
					{
					pushFollow(FOLLOW_functionCallRule_in_assignVariableRule1270);
					v3=functionCallRule(className, functionName);
					state._fsp--;

					h.assignVarToVar(className, functionName, inFor, true, name, v3);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:254:1: assignExprRule[Token className, Token functionName, boolean inFor, Token name] : EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP ;
	public final void assignExprRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:255:2: ( EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:3: EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignExprRule1296); 
			match(input,LP,FOLLOW_LP_in_assignExprRule1298); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:52: (v1= STRING |v1= VAR )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==STRING) ) {
				alt29=1;
			}
			else if ( (LA29_0==VAR) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:53: v1= STRING
					{
					v1=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1303); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:63: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1307); 
					}
					break;

			}

			vct.add(v1);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:87: ( PLUS (v2= STRING |v2= VAR ) )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==PLUS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:88: PLUS (v2= STRING |v2= VAR )
					{
					match(input,PLUS,FOLLOW_PLUS_in_assignExprRule1313); 
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:93: (v2= STRING |v2= VAR )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==STRING) ) {
						alt30=1;
					}
					else if ( (LA30_0==VAR) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:94: v2= STRING
							{
							v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1318); 
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:256:104: v2= VAR
							{
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1322); 
							}
							break;

					}

					vct.add(v2);
					}
					break;

				default :
					break loop31;
				}
			}

			match(input,RP,FOLLOW_RP_in_assignExprRule1329); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:260:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:261:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:262:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1346); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1350); 
			h.assignTextPrimitiveVarValue(className, functionName, inFor, name, v.getText());
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:266:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:267:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:268:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1367); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1371);
			v=textListRule();
			state._fsp--;

			h.assignComplexVarValue(className, functionName, inFor, "list", name, v);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:272:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:273:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:273:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1390); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1394); 
			String cicle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:273:52: (t1= CM t2= STRING )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==CM) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:273:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1401); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1405); 
					cicle = cicle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1413); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:277:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		Vector<Token> v1 =null;
		Vector<Token> v3 =null;
		Vector<Token> t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:278:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			 Vector<Vector<Token>> vct_data = new Vector<Vector<Token>>();
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1432); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:73: (v1= talignmentRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LSB) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:73: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1436);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1441); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1445);
			v3=trowRule();
			state._fsp--;

			vct_data.add(v3);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:128: (t1= CM t2= trowRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==CM) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:279:129: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1452); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1456);
					t2=trowRule();
					state._fsp--;

					vct_data.add(t2);
					}
					break;

				default :
					break loop34;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1464); 
			h.assignTable(className, functionName, inFor, name, v1, vct_data);
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



	// $ANTLR start "talignmentRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:282:1: talignmentRule returns [Vector<Token> alignment] :v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final Vector<Token> talignmentRule() throws RecognitionException {
		Vector<Token> alignment = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		Token v2 =null;
		Token t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:283:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:284:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			Vector<Token> vct = new Vector<Token>();
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1486); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1490);
			v2=alignRule();
			state._fsp--;

			vct.add(v2);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:284:81: (t1= CM t2= alignRule )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==CM) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:284:82: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1497); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1501);
					t2=alignRule();
					state._fsp--;

					vct.add(t2);
					}
					break;

				default :
					break loop35;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1509); 
			alignment = vct;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return alignment;
	}
	// $ANTLR end "talignmentRule"



	// $ANTLR start "alignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:288:1: alignRule returns [Token value] : (v= L |v= C |v= R ) ;
	public final Token alignRule() throws RecognitionException {
		Token value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:289:2: ( (v= L |v= C |v= R ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:290:3: (v= L |v= C |v= R )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:290:3: (v= L |v= C |v= R )
			int alt36=3;
			switch ( input.LA(1) ) {
			case L:
				{
				alt36=1;
				}
				break;
			case C:
				{
				alt36=2;
				}
				break;
			case R:
				{
				alt36=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:290:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1531); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:290:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1537); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:290:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1543); 
					}
					break;

			}

			value = v;
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:294:1: trowRule returns [Vector<Token> row] :v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final Vector<Token> trowRule() throws RecognitionException {
		Vector<Token> row = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:295:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:296:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			Vector<Token> vct = new Vector<Token>();
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1567); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1571); 
			vct.add(v2);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:296:79: (v3= CM v4= STRING )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==CM) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:296:80: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1578); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1582); 
					vct.add(v4);
					}
					break;

				default :
					break loop37;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1590); 
			row = vct;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return row;
	}
	// $ANTLR end "trowRule"



	// $ANTLR start "assignImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:300:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:301:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:302:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1607); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1611); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1615); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:302:40: (o1= CM o2= STRING )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==CM) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:302:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1622); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1626); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1634); 
			h.assignComplexVarValue(className, functionName, inFor, "img", name, v1.getText() + v2.getText() + opt + v3.getText());
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:306:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:307:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:308:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1651); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1655); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:308:31: (t= STRING |ir= imageRule )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==STRING) ) {
				alt39=1;
			}
			else if ( (LA39_0==IMG) ) {
				alt39=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:308:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1662); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:308:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1670);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1677); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1681); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1685); 
			h.assignComplexVarValue(className, functionName, inFor, "link", name, v1.getText() + v2 + v3.getText() 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:313:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:314:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:315:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1706); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1710); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1714); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:315:58: (t1= CM t2= STRING )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==CM) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:315:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule1721); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule1725); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule1733); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:320:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:321:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule1755); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule1757); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:54: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==STRING||LA44_0==VAR) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:55: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:55: (v= STRING |v= VAR )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:56: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1764); 
							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:65: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1768); 
							}
							break;

					}

					vct.add(v);
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:88: ( CM (t= STRING |t= VAR ) )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==CM) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:89: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule1775); 
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:92: (t= STRING |t= VAR )
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==STRING) ) {
								alt42=1;
							}
							else if ( (LA42_0==VAR) ) {
								alt42=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:93: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1780); 
									}
									break;
								case 2 :
									// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:322:102: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule1784); 
									}
									break;

							}

							vct.add(t);
							}
							break;

						default :
							break loop43;
						}
					}

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule1793); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:326:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:327:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:328:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1810); 
			match(input,LP,FOLLOW_LP_in_formatRule1812); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1816); 
			match(input,CM,FOLLOW_CM_in_formatRule1818); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1822); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule1826); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1830); 
			vct.add(v3);
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:328:99: ( CM v4= VAR )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==CM) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:328:100: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule1835); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1839); 
					vct.add(v4);
					}
					break;

				default :
					break loop45;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule1845); 
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



	public static final BitSet FOLLOW_functionRule_in_parseJava66 = new BitSet(new long[]{0x7C0460080B008910L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_parseJava74 = new BitSet(new long[]{0x7C0460080B008910L,0x00000000000013E0L});
	public static final BitSet FOLLOW_classRule_in_parseJava82 = new BitSet(new long[]{0x7C0460080B008910L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_parseJava89 = new BitSet(new long[]{0x7C0460080B008910L,0x00000000000013E0L});
	public static final BitSet FOLLOW_EOF_in_parseJava98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionRule126 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule133 = new BitSet(new long[]{0x7D04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule136 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule144 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule149 = new BitSet(new long[]{0x7C04600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule156 = new BitSet(new long[]{0x7CC4600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_functionRule164 = new BitSet(new long[]{0x7CC4600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_returnRule_in_functionRule172 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_functionRule179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule208 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule217 = new BitSet(new long[]{0x7C04600804000810L,0x00000000000003E0L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule235 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_argumentTypeRule270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule370 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule376 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule384 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule394 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule403 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_VAR_in_returnRule436 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_returnRule442 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_returnRule445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule460 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forRule462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forRule466 = new BitSet(new long[]{0x0000001000000200L});
	public static final BitSet FOLLOW_forInRule_in_forRule469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_forInRule493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_forInRule497 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule499 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule501 = new BitSet(new long[]{0x7C04600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule506 = new BitSet(new long[]{0x7C44600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forInRule511 = new BitSet(new long[]{0x7C44600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forInRule516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CM_in_forIncrRule532 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule536 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule538 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule540 = new BitSet(new long[]{0x7C04600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule545 = new BitSet(new long[]{0x7C44600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule550 = new BitSet(new long[]{0x7C44600803008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_classRule577 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule581 = new BitSet(new long[]{0x7C4460080B008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_declarationRule_in_classRule584 = new BitSet(new long[]{0x7C4460080B008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_functionRule_in_classRule589 = new BitSet(new long[]{0x7C4460080B008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_assignRule_in_classRule594 = new BitSet(new long[]{0x7C4460080B008810L,0x00000000000013E0L});
	public static final BitSet FOLLOW_RCB_in_classRule599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareTitleRule_in_declarationRule620 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareTextRule_in_declarationRule629 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareBlockQuoteRule_in_declarationRule638 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareCodeBlockRule_in_declarationRule647 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareListRule_in_declarationRule655 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareTableRule_in_declarationRule664 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareImageRule_in_declarationRule673 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_declareLinkRule_in_declarationRule681 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_declarationRule690 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_declarationRule697 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_declarationRule702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_declarationRule707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_declareTitleRule725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTitleRule729 = new BitSet(new long[]{0x0000040000010002L});
	public static final BitSet FOLLOW_refRule_in_declareTitleRule733 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTitleRule737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTitleRule742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTitleRule747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_titleTypeRule769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule806 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_refRule810 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule834 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTextRule844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTextRule849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule873 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareBlockQuoteRule884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareBlockQuoteRule889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule916 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareCodeBlockRule927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareCodeBlockRule931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeListRule_in_declareListRule950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareListRule957 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeListRule996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule1035 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1072 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1110 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1140 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1143 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignExprRule_in_assignRule1150 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignStringRule_in_assignRule1157 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1164 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1172 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1184 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1196 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1208 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1230 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1249 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignVariableRule1251 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_assignVariableRule1255 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RSB_in_assignVariableRule1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallRule_in_assignVariableRule1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignExprRule1296 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignExprRule1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1303 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1307 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_PLUS_in_assignExprRule1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1318 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1322 = new BitSet(new long[]{0x0108000000000000L});
	public static final BitSet FOLLOW_RP_in_assignExprRule1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1367 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1394 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_textListRule1405 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1432 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1436 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1441 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1445 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1452 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1456 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1486 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1490 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1497 = new BitSet(new long[]{0x0010010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1501 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1571 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_trowRule1582 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1607 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1615 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1626 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1651 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1655 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1662 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1670 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1681 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1706 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1714 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_imageRule1725 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1755 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1757 = new BitSet(new long[]{0x0200000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1764 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1768 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1780 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule1784 = new BitSet(new long[]{0x0200000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1810 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1816 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1822 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1830 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_VAR_in_formatRule1839 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1845 = new BitSet(new long[]{0x0000000000000002L});
}
