// $ANTLR 3.5.1 /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g 2023-12-01 14:45:01

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
		"PUSH", "R", "RAB", "RCB", "REMOVE", "RETURN", "RP", "RSB", "S1TITLE", 
		"S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", 
		"SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", 
		"US", "VAR", "WS"
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
	public static final int PUSH=52;
	public static final int R=53;
	public static final int RAB=54;
	public static final int RCB=55;
	public static final int REMOVE=56;
	public static final int RETURN=57;
	public static final int RP=58;
	public static final int RSB=59;
	public static final int S1TITLE=60;
	public static final int S2TITLE=61;
	public static final int S3TITLE=62;
	public static final int S4TITLE=63;
	public static final int S5TITLE=64;
	public static final int SE=65;
	public static final int SL=66;
	public static final int ST=67;
	public static final int STRING=68;
	public static final int SUBS=69;
	public static final int SUPS=70;
	public static final int TABLE=71;
	public static final int TEXT=72;
	public static final int TITLE=73;
	public static final int TLIST=74;
	public static final int ULIST=75;
	public static final int UNICODE_ESC=76;
	public static final int US=77;
	public static final int VAR=78;
	public static final int WS=79;

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
	@Override public String getGrammarFileName() { return "/home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g"; }



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
			
			// recupero il token corrente  
			Token tk = input.LT(1);
			
			// lascio gestire il messaggio all'handler
			h.handleError(tk, hdr, msg);
		}
		
		void initMaltHandler () {
		h = new MaltHandler(input);
		}



	// $ANTLR start "parseJava"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:51:1: parseJava : ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initMaltHandler();
		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:53:2: ( ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:54:3: ( functionRule[null] | declarationRule[null, null, false] | classRule | assignRule[null, null, false] )+
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
				case PUSH:
				case REMOVE:
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:54:4: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava66);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:55:5: declarationRule[null, null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_parseJava74);
					declarationRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:56:5: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava82);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:57:5: assignRule[null, null, false]
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:62:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:63:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:64:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+ ( returnRule[className, $n] )? RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule116); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule123); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule130); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:67:3: ( argumentsRule[className, $n] )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BLOCKQUOTE||LA2_0==CODEBLOCK||LA2_0==FORMATTEXT||LA2_0==IMG||(LA2_0 >= LINK && LA2_0 <= LIST)||LA2_0==OLIST||(LA2_0 >= S1TITLE && LA2_0 <= S5TITLE)||(LA2_0 >= TABLE && LA2_0 <= ULIST)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:67:4: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule135);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule143); 
			match(input,LCB,FOLLOW_LCB_in_functionRule148); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:70:3: ( declarationRule[className,$n, false] | assignRule[className, $n, false] )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BLOCKQUOTE||LA3_0==CODEBLOCK||LA3_0==DOTVAR||(LA3_0 >= FOR && LA3_0 <= FORMAT)||LA3_0==IMG||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||LA3_0==PUSH||LA3_0==REMOVE||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:70:5: declarationRule[className,$n, false]
					{
					pushFollow(FOLLOW_declarationRule_in_functionRule155);
					declarationRule(className, n, false);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:71:5: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule163);
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

			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:72:3: ( returnRule[className, $n] )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RETURN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:72:3: returnRule[className, $n]
					{
					pushFollow(FOLLOW_returnRule_in_functionRule171);
					returnRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RCB,FOLLOW_RCB_in_functionRule178); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:77:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:78:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:79:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule197);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule204); 
			h.declareArg(className, functionName, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:81:3: ( CM t= argumentTypeRule n= VAR )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:81:5: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule213); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule222);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule231); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:87:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:88:2: ( (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:89:3: (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) )
			{
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:89:3: (res= titleTypeRule |t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST ) )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:89:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule255);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:90:5: t= ( TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | FORMATTEXT | LIST )
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:105:1: functionCallRule[Token className, Token functionName] returns [Token calledFunction] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final Token functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token calledFunction = null;


		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:106:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:107:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:107:3: (v1= VAR |v1= DOTVAR )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:107:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule366); 
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:107:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule372); 
					}
					break;

			}

			calledFunction = v1;
			match(input,LP,FOLLOW_LP_in_functionCallRule382); 
			Vector<Token> vct = new Vector<Token>();
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:110:3: (t1= VAR ( CM t2= VAR )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:110:4: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule392); 
					vct.add(t1);
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:110:27: ( CM t2= VAR )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:110:28: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule397); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule401); 
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

			match(input,RP,FOLLOW_RP_in_functionCallRule412); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:115:1: returnRule[Token className, Token functionName] : RETURN (v= VAR |v= STRING ) SE ;
	public final void returnRule(Token className, Token functionName) throws RecognitionException {
		Token v=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:116:2: ( RETURN (v= VAR |v= STRING ) SE )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:117:3: RETURN (v= VAR |v= STRING ) SE
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule429); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:118:3: (v= VAR |v= STRING )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:118:4: v= VAR
					{
					v=(Token)match(input,VAR,FOLLOW_VAR_in_returnRule436); 
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:118:12: v= STRING
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_returnRule442); 
					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_returnRule447); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:123:1: forRule[Token className, Token functionName] : FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] ) ;
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:124:2: ( FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:125:3: FOR LP n= VAR ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule464); 
			match(input,LP,FOLLOW_LP_in_forRule468); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forRule474); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:128:3: ( forInRule[className, functionName, $n] | forIncrRule[className, functionName, $n] )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:128:4: forInRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forInRule_in_forRule479);
					forInRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:129:5: forIncrRule[className, functionName, $n]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule487);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:134:1: forInRule[Token className, Token functionName, Token name] : IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:135:2: ( IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:136:3: IN i= VAR RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,IN,FOLLOW_IN_in_forInRule507); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule513); 
			match(input,RP,FOLLOW_RP_in_forInRule517); 
			match(input,LCB,FOLLOW_LCB_in_forInRule521); 
			h.declareFor(className, functionName, false, name, i);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:140:3: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BLOCKQUOTE||LA12_0==CODEBLOCK||LA12_0==DOTVAR||(LA12_0 >= FOR && LA12_0 <= FORMAT)||LA12_0==IMG||(LA12_0 >= LINK && LA12_0 <= LIST)||LA12_0==OLIST||LA12_0==PUSH||LA12_0==REMOVE||(LA12_0 >= S1TITLE && LA12_0 <= S5TITLE)||(LA12_0 >= TABLE && LA12_0 <= ULIST)) ) {
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:140:4: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forInRule528);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:141:5: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule535);
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

			match(input,RCB,FOLLOW_RCB_in_forInRule542); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:146:1: forIncrRule[Token className, Token functionName, Token name] : CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token i=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:147:2: ( CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:148:3: CM i= INTEGER RP LCB ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,CM,FOLLOW_CM_in_forIncrRule557); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule563); 
			match(input,RP,FOLLOW_RP_in_forIncrRule567); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule571); 
			h.declareFor(className, functionName, true, name, i);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:152:3: ( declarationRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BLOCKQUOTE||LA13_0==CODEBLOCK||LA13_0==DOTVAR||(LA13_0 >= FOR && LA13_0 <= FORMAT)||LA13_0==IMG||(LA13_0 >= LINK && LA13_0 <= LIST)||LA13_0==OLIST||LA13_0==PUSH||LA13_0==REMOVE||(LA13_0 >= S1TITLE && LA13_0 <= S5TITLE)||(LA13_0 >= TABLE && LA13_0 <= ULIST)) ) {
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:152:4: declarationRule[className, functionName, true]
					{
					pushFollow(FOLLOW_declarationRule_in_forIncrRule578);
					declarationRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:153:5: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule585);
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

			match(input,RCB,FOLLOW_RCB_in_forIncrRule592); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:158:1: classRule : f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:159:2: (f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:160:3: f= CLASS n= VAR LCB ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule607); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule613); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule619); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:163:3: ( declarationRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
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
				case PUSH:
				case REMOVE:
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:163:4: declarationRule[$n,null, false]
					{
					pushFollow(FOLLOW_declarationRule_in_classRule624);
					declarationRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:164:5: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule631);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:165:5: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule638);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule645); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:170:1: declarationRule[Token className, Token functionName, boolean inFor] : ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void declarationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:171:2: ( ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==DOTVAR||LA16_0==FORMAT||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||LA16_0==PUSH||LA16_0==REMOVE||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)||LA16_0==VAR) ) {
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:172:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] ) SE )
					{
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:172:3: ( ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] ) SE )
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:172:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] ) SE
					{
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:172:4: ( declareTitleRule[className, functionName, inFor] | declareTextRule[className, functionName, inFor] | declareBlockQuoteRule[className, functionName, inFor] | declareCodeBlockRule[className, functionName, inFor] | declareListRule[className, functionName, inFor] | declareTableRule[className, functionName, inFor] | declareImageRule[className, functionName, inFor] | declareLinkRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] | listManipulationRule[className, functionName, inFor] )
					int alt15=11;
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
					case PUSH:
					case REMOVE:
						{
						alt15=11;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:172:6: declareTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTitleRule_in_declarationRule663);
							declareTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:173:5: declareTextRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTextRule_in_declarationRule672);
							declareTextRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:174:5: declareBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareBlockQuoteRule_in_declarationRule681);
							declareBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:175:5: declareCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareCodeBlockRule_in_declarationRule690);
							declareCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:176:5: declareListRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareListRule_in_declarationRule698);
							declareListRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:177:5: declareTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareTableRule_in_declarationRule707);
							declareTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:178:5: declareImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareImageRule_in_declarationRule716);
							declareImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:179:5: declareLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_declareLinkRule_in_declarationRule724);
							declareLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:180:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_declarationRule733);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 10 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:181:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_declarationRule740);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:182:5: listManipulationRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_listManipulationRule_in_declarationRule747);
							listManipulationRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_declarationRule754); 
					}

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:184:5: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_declarationRule761);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:188:1: declareTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR (ref= refRule )? ( assignTitleRule[$className, $functionName, $inFor, $n, ref] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;
		Token ref =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:189:2: (t= titleTypeRule n= VAR (ref= refRule )? ( assignTitleRule[$className, $functionName, $inFor, $n, ref] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:190:3: t= titleTypeRule n= VAR (ref= refRule )? ( assignTitleRule[$className, $functionName, $inFor, $n, ref] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_declareTitleRule779);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTitleRule785); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:192:6: (ref= refRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LCB) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:192:6: ref= refRule
					{
					pushFollow(FOLLOW_refRule_in_declareTitleRule793);
					ref=refRule();
					state._fsp--;

					}
					break;

			}

			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:193:3: ( assignTitleRule[$className, $functionName, $inFor, $n, ref] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:193:4: assignTitleRule[$className, $functionName, $inFor, $n, ref]
					{
					pushFollow(FOLLOW_assignTitleRule_in_declareTitleRule799);
					assignTitleRule(className, functionName, inFor, n, ref);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:194:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTitleRule806);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:195:5: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTitleRule813);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:199:1: titleTypeRule returns [Token type] : t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:200:2: (t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:201:3: t= ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:210:1: refRule returns [Token ref] : LCB HA v= VAR RCB ;
	public final Token refRule() throws RecognitionException {
		Token ref = null;


		Token v=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:211:2: ( LCB HA v= VAR RCB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:212:3: LCB HA v= VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule886); 
			match(input,HA,FOLLOW_HA_in_refRule888); 
			v=(Token)match(input,VAR,FOLLOW_VAR_in_refRule892); 
			match(input,RCB,FOLLOW_RCB_in_refRule894); 
			ref = v;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ref;
	}
	// $ANTLR end "refRule"



	// $ANTLR start "declareTextRule"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:218:1: declareTextRule[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTextRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:219:2: (t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:220:3: t= TEXT n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_declareTextRule919); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTextRule925); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:222:3: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:222:4: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareTextRule932);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:223:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTextRule939);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:224:5: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareTextRule946);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:228:1: declareBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:229:2: (t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:230:3: t= BLOCKQUOTE n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule966); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareBlockQuoteRule972); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:232:3: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:232:4: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareBlockQuoteRule979);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:233:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareBlockQuoteRule986);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:234:5: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareBlockQuoteRule993);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:238:1: declareCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:239:2: (t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:240:3: t= CODEBLOCK ( VAR )? n= VAR ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_declareCodeBlockRule1013); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:241:3: ( VAR )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:241:3: VAR
					{
					match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule1017); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareCodeBlockRule1024); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:243:3: ( assignStringRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] | assignExprRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:243:4: assignStringRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_declareCodeBlockRule1032);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:244:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareCodeBlockRule1039);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:245:5: assignExprRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_declareCodeBlockRule1046);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:249:1: declareListRule[Token className, Token functionName, boolean inFor] : t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareListRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:250:2: (t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:251:3: t= typeListRule n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_typeListRule_in_declareListRule1066);
			t=typeListRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareListRule1073); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:253:3: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:253:5: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_declareListRule1082);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:254:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareListRule1090);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:258:1: typeListRule returns [Token type] : t= ( LIST | OLIST | ULIST | TLIST ) ;
	public final Token typeListRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:259:2: (t= ( LIST | OLIST | ULIST | TLIST ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:260:3: t= ( LIST | OLIST | ULIST | TLIST )
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:267:1: declareTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:268:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:269:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_declareTableRule1151); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareTableRule1157); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:271:3: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:271:4: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_declareTableRule1164);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:272:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareTableRule1171);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:276:1: declareImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void declareImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:277:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:278:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_declareImageRule1191); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareImageRule1197); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:280:3: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:280:4: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_declareImageRule1204);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:281:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareImageRule1211);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:285:1: declareLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.declareLinkRule_return declareLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.declareLinkRule_return retval = new MaltParser.declareLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:286:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:287:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_declareLinkRule1235); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_declareLinkRule1241); 
			h.declareNew(className, functionName, inFor, t, n);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:289:3: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:289:4: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_declareLinkRule1248);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:290:5: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_declareLinkRule1255);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:294:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:295:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:296:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1275); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:297:3: ( assignVariableRule[$className, $functionName, inFor, $n] | assignExprRule[$className, $functionName, inFor, $n] | assignStringRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:297:4: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1280);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:298:5: assignExprRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignExprRule_in_assignRule1287);
					assignExprRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:299:5: assignStringRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignStringRule_in_assignRule1294);
					assignStringRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:300:5: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1301);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:301:5: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1309);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:302:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1321);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:303:10: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1333);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 8 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:304:10: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1345);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1357); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:309:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] ) ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token n=null;
		Token v3 =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:310:2: ( EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:311:3: EQ (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] )
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1374); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:311:6: (v1= VAR |v2= VAR LSB n= INTEGER RSB |v3= functionCallRule[$className, $functionName] )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:311:7: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1379); 
					h.assignVarToVar(className, functionName, inFor, false, name, v1);
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:312:8: v2= VAR LSB n= INTEGER RSB
					{
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1393); 
					match(input,LSB,FOLLOW_LSB_in_assignVariableRule1400); 
					n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_assignVariableRule1409); 
					match(input,RSB,FOLLOW_RSB_in_assignVariableRule1416); 
					h.assignListItemToVar(className, functionName, inFor, name, v2, n);
					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:317:8: v3= functionCallRule[$className, $functionName]
					{
					pushFollow(FOLLOW_functionCallRule_in_assignVariableRule1434);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:323:1: assignExprRule[Token className, Token functionName, boolean inFor, Token name] : EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP ;
	public final void assignExprRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:324:2: ( EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:325:3: EQ LP (v1= STRING |v1= VAR ) ( PLUS (v2= STRING |v2= VAR ) )* RP
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignExprRule1467); 
			match(input,LP,FOLLOW_LP_in_assignExprRule1471); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:328:3: (v1= STRING |v1= VAR )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:328:4: v1= STRING
					{
					v1=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1478); 
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:328:14: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1482); 
					}
					break;

			}

			vct.add(v1);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:330:3: ( PLUS (v2= STRING |v2= VAR ) )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==PLUS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:330:4: PLUS (v2= STRING |v2= VAR )
					{
					match(input,PLUS,FOLLOW_PLUS_in_assignExprRule1492); 
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:331:3: (v2= STRING |v2= VAR )
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
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:331:4: v2= STRING
							{
							v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignExprRule1499); 
							}
							break;
						case 2 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:331:14: v2= VAR
							{
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_assignExprRule1503); 
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

			match(input,RP,FOLLOW_RP_in_assignExprRule1515); 
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



	// $ANTLR start "assignTitleRule"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:336:1: assignTitleRule[Token className, Token functionName, boolean inFor, Token name, Token ref] : EQ v= STRING ;
	public final void assignTitleRule(Token className, Token functionName, boolean inFor, Token name, Token ref) throws RecognitionException {
		Token v=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:337:2: ( EQ v= STRING )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:338:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1531); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1537); 
			h.assignTitle(className, functionName, inFor, name, ref, v.getText());
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:344:1: assignStringRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignStringRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:345:2: ( EQ v= STRING )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:346:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignStringRule1557); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignStringRule1563); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:351:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:352:2: ( EQ v= textListRule )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:353:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1580); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1586);
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:358:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:359:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:360:3: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule1607); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1613); 
			String cicle = v2.getText();
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:362:3: (t1= CM t2= STRING )+
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:362:4: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule1622); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule1628); 
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

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule1639); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:368:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		Vector<Token> v1 =null;
		Vector<Token> v3 =null;
		Vector<Token> t2 =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:369:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:370:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			Vector<Vector<Token>> vct_data = new Vector<Vector<Token>>();
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1660); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:372:5: (v1= talignmentRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LSB) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:372:5: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1666);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1673); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1679);
			v3=trowRule();
			state._fsp--;

			vct_data.add(v3);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:375:3: (t1= CM t2= trowRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==CM) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:375:4: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1688); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1694);
					t2=trowRule();
					state._fsp--;

					vct_data.add(t2);
					}
					break;

				default :
					break loop34;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1705); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:380:1: talignmentRule returns [Vector<Token> alignment] :v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final Vector<Token> talignmentRule() throws RecognitionException {
		Vector<Token> alignment = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		Token v2 =null;
		Token t2 =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:381:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:382:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			Vector<Token> vct = new Vector<Token>();
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule1729); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule1735);
			v2=alignRule();
			state._fsp--;

			vct.add(v2);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:385:3: (t1= CM t2= alignRule )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==CM) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:385:4: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule1744); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule1750);
					t2=alignRule();
					state._fsp--;

					vct.add(t2);
					}
					break;

				default :
					break loop35;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule1761); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:391:1: alignRule returns [Token value] : (v= L |v= C |v= R ) ;
	public final Token alignRule() throws RecognitionException {
		Token value = null;


		Token v=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:392:2: ( (v= L |v= C |v= R ) )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:393:3: (v= L |v= C |v= R )
			{
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:393:3: (v= L |v= C |v= R )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:393:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule1783); 
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:393:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule1789); 
					}
					break;
				case 3 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:393:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule1795); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:397:1: trowRule returns [Vector<Token> row] :v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final Vector<Token> trowRule() throws RecognitionException {
		Vector<Token> row = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:398:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:399:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			Vector<Token> vct = new Vector<Token>();
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule1821); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1827); 
			vct.add(v2);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:402:3: (v3= CM v4= STRING )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==CM) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:402:4: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule1836); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule1842); 
					vct.add(v4);
					}
					break;

				default :
					break loop37;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule1853); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:408:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:409:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:410:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1870); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1876); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1882); 
			String opt="";
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:413:3: (o1= CM o2= STRING )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==CM) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:413:4: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1891); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1897); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1908); 
			h.assignComplexVarValue(className, functionName, inFor, "img", name,
							v1.getText() + v2.getText() + opt + v3.getText());
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:420:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:421:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:422:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1925); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1931); 
			String v2 = "";
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:424:3: (t= STRING |ir= imageRule )
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
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:424:4: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1940); 
					v2=t.getText();
					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:424:34: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1948);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1957); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1963); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1969); 
			h.assignComplexVarValue(className, functionName, inFor, "link", name,
						v1.getText() + v2 + v3.getText() + v4.getText() + v5.getText());
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:432:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:433:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:434:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule1990); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule1996); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule2002); 
			String cycle = v3.getText();
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:437:3: (t1= CM t2= STRING )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==CM) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:437:4: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule2011); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule2017); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule2028); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:443:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:444:2: ( EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:445:3: EQ LSB ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule2049); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule2053); 
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:448:3: ( (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )* )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==STRING||LA44_0==VAR) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:448:4: (v= STRING |v= VAR ) ( CM (t= STRING |t= VAR ) )*
					{
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:448:4: (v= STRING |v= VAR )
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
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:448:5: v= STRING
							{
							v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule2061); 
							}
							break;
						case 2 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:448:14: v= VAR
							{
							v=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule2065); 
							}
							break;

					}

					vct.add(v);
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:449:3: ( CM (t= STRING |t= VAR ) )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==CM) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:449:4: CM (t= STRING |t= VAR )
							{
							match(input,CM,FOLLOW_CM_in_assignListRule2074); 
							// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:450:3: (t= STRING |t= VAR )
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
									// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:450:4: t= STRING
									{
									t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule2081); 
									}
									break;
								case 2 :
									// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:450:13: t= VAR
									{
									t=(Token)match(input,VAR,FOLLOW_VAR_in_assignListRule2085); 
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

			match(input,RSB,FOLLOW_RSB_in_assignListRule2101); 
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
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:457:1: formatRule[Token className, Token functionName, boolean inFor] : FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:458:2: ( FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:459:3: FORMAT LP v1= VAR CM v2= VAR CM v3= VAR ( CM v4= VAR )* RP
			{
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule2118); 
			match(input,LP,FOLLOW_LP_in_formatRule2122); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2128); 
			match(input,CM,FOLLOW_CM_in_formatRule2132); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2138); 
			Vector<Token> vct = new Vector<Token>();
			match(input,CM,FOLLOW_CM_in_formatRule2144); 
			v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2150); 
			vct.add(v3);
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:466:3: ( CM v4= VAR )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==CM) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:466:4: CM v4= VAR
					{
					match(input,CM,FOLLOW_CM_in_formatRule2157); 
					v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2163); 
					vct.add(v4);
					}
					break;

				default :
					break loop45;
				}
			}

			match(input,RP,FOLLOW_RP_in_formatRule2174); 
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



	// $ANTLR start "listManipulationRule"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:472:1: listManipulationRule[Token className, Token functionName, boolean inFor] : ( listPushRule[$className, $functionName, $inFor] | listRemoveRule[$className, $functionName, $inFor] );
	public final void listManipulationRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:473:2: ( listPushRule[$className, $functionName, $inFor] | listRemoveRule[$className, $functionName, $inFor] )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==PUSH) ) {
				alt46=1;
			}
			else if ( (LA46_0==REMOVE) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:474:3: listPushRule[$className, $functionName, $inFor]
					{
					pushFollow(FOLLOW_listPushRule_in_listManipulationRule2191);
					listPushRule(className, functionName, inFor);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:475:5: listRemoveRule[$className, $functionName, $inFor]
					{
					pushFollow(FOLLOW_listRemoveRule_in_listManipulationRule2199);
					listRemoveRule(className, functionName, inFor);
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
	// $ANTLR end "listManipulationRule"



	// $ANTLR start "listPushRule"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:478:1: listPushRule[Token className, Token functionName, boolean inFor] : PUSH LP v1= VAR CM v2= VAR RP ;
	public final void listPushRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:479:2: ( PUSH LP v1= VAR CM v2= VAR RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:480:3: PUSH LP v1= VAR CM v2= VAR RP
			{
			match(input,PUSH,FOLLOW_PUSH_in_listPushRule2216); 
			match(input,LP,FOLLOW_LP_in_listPushRule2220); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_listPushRule2226); 
			match(input,CM,FOLLOW_CM_in_listPushRule2230); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_listPushRule2236); 
			match(input,RP,FOLLOW_RP_in_listPushRule2240); 
			h.handleListPush(className, functionName, inFor, v1, v2);
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
	// $ANTLR end "listPushRule"



	// $ANTLR start "listRemoveRule"
	// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:489:1: listRemoveRule[Token className, Token functionName, boolean inFor] : REMOVE LP v1= VAR CM idx= ( INTEGER | US ) CM v2= ( VAR | US ) RP ;
	public final void listRemoveRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token idx=null;
		Token v2=null;

		try {
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:490:2: ( REMOVE LP v1= VAR CM idx= ( INTEGER | US ) CM v2= ( VAR | US ) RP )
			// /home/kevin/Documenti/malt/MaltProject/src/com/malt/grammar/compiler/Malt.g:490:4: REMOVE LP v1= VAR CM idx= ( INTEGER | US ) CM v2= ( VAR | US ) RP
			{
			match(input,REMOVE,FOLLOW_REMOVE_in_listRemoveRule2256); 
			match(input,LP,FOLLOW_LP_in_listRemoveRule2260); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_listRemoveRule2266); 
			match(input,CM,FOLLOW_CM_in_listRemoveRule2270); 
			idx=input.LT(1);
			if ( input.LA(1)==INTEGER||input.LA(1)==US ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,CM,FOLLOW_CM_in_listRemoveRule2286); 
			v2=input.LT(1);
			if ( (input.LA(1) >= US && input.LA(1) <= VAR) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,RP,FOLLOW_RP_in_listRemoveRule2302); 
			h.handleListRemove(className, functionName, inFor, v1, idx, v2);
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
	// $ANTLR end "listRemoveRule"

	// Delegated rules



	public static final BitSet FOLLOW_functionRule_in_parseJava66 = new BitSet(new long[]{0xF11460080B008910L,0x0000000000004F81L});
	public static final BitSet FOLLOW_declarationRule_in_parseJava74 = new BitSet(new long[]{0xF11460080B008910L,0x0000000000004F81L});
	public static final BitSet FOLLOW_classRule_in_parseJava82 = new BitSet(new long[]{0xF11460080B008910L,0x0000000000004F81L});
	public static final BitSet FOLLOW_assignRule_in_parseJava89 = new BitSet(new long[]{0xF11460080B008910L,0x0000000000004F81L});
	public static final BitSet FOLLOW_EOF_in_parseJava98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_functionRule123 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule130 = new BitSet(new long[]{0xF404600804000810L,0x0000000000000F81L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule135 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule143 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule148 = new BitSet(new long[]{0xF114600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_declarationRule_in_functionRule155 = new BitSet(new long[]{0xF394600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_assignRule_in_functionRule163 = new BitSet(new long[]{0xF394600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_returnRule_in_functionRule171 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RCB_in_functionRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule204 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule213 = new BitSet(new long[]{0xF004600804000810L,0x0000000000000F81L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule231 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_argumentTypeRule266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule366 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule372 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule382 = new BitSet(new long[]{0x0400000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule392 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule401 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_VAR_in_returnRule436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_returnRule442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SE_in_returnRule447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule464 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_forRule468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_forRule474 = new BitSet(new long[]{0x0000001000000200L});
	public static final BitSet FOLLOW_forInRule_in_forRule479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_forInRule507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_forInRule513 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule517 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule521 = new BitSet(new long[]{0xF114600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_declarationRule_in_forInRule528 = new BitSet(new long[]{0xF194600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_assignRule_in_forInRule535 = new BitSet(new long[]{0xF194600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_RCB_in_forInRule542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CM_in_forIncrRule557 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule563 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule567 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule571 = new BitSet(new long[]{0xF114600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_declarationRule_in_forIncrRule578 = new BitSet(new long[]{0xF194600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule585 = new BitSet(new long[]{0xF194600803008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_classRule613 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule619 = new BitSet(new long[]{0xF19460080B008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_declarationRule_in_classRule624 = new BitSet(new long[]{0xF19460080B008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_functionRule_in_classRule631 = new BitSet(new long[]{0xF19460080B008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_assignRule_in_classRule638 = new BitSet(new long[]{0xF19460080B008810L,0x0000000000004F81L});
	public static final BitSet FOLLOW_RCB_in_classRule645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareTitleRule_in_declarationRule663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareTextRule_in_declarationRule672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareBlockQuoteRule_in_declarationRule681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareCodeBlockRule_in_declarationRule690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareListRule_in_declarationRule698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareTableRule_in_declarationRule707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareImageRule_in_declarationRule716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_declareLinkRule_in_declarationRule724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallRule_in_declarationRule733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_formatRule_in_declarationRule740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_listManipulationRule_in_declarationRule747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SE_in_declarationRule754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_declarationRule761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_declareTitleRule779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareTitleRule785 = new BitSet(new long[]{0x0000040000010002L});
	public static final BitSet FOLLOW_refRule_in_declareTitleRule793 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_declareTitleRule799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTitleRule806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTitleRule813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_titleTypeRule835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule886 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HA_in_refRule888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_refRule892 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_declareTextRule919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareTextRule925 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareTextRule932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTextRule939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareTextRule946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_declareBlockQuoteRule966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareBlockQuoteRule972 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareBlockQuoteRule979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareBlockQuoteRule986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareBlockQuoteRule993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_declareCodeBlockRule1013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareCodeBlockRule1024 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignStringRule_in_declareCodeBlockRule1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareCodeBlockRule1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_declareCodeBlockRule1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeListRule_in_declareListRule1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareListRule1073 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_declareListRule1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareListRule1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_typeListRule1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_declareTableRule1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareTableRule1157 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_declareTableRule1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareTableRule1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_declareImageRule1191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareImageRule1197 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_declareImageRule1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareImageRule1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_declareLinkRule1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_declareLinkRule1241 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_declareLinkRule1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_declareLinkRule1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1275 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignExprRule_in_assignRule1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignStringRule_in_assignRule1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SE_in_assignRule1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1374 = new BitSet(new long[]{0x0000000000008000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1393 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignVariableRule1400 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTEGER_in_assignVariableRule1409 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RSB_in_assignVariableRule1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCallRule_in_assignVariableRule1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignExprRule1467 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignExprRule1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1478 = new BitSet(new long[]{0x0408000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1482 = new BitSet(new long[]{0x0408000000000000L});
	public static final BitSet FOLLOW_PLUS_in_assignExprRule1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_STRING_in_assignExprRule1499 = new BitSet(new long[]{0x0408000000000000L});
	public static final BitSet FOLLOW_VAR_in_assignExprRule1503 = new BitSet(new long[]{0x0408000000000000L});
	public static final BitSet FOLLOW_RP_in_assignExprRule1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignStringRule1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignStringRule1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1580 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_textListRule1613 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_textListRule1628 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1660 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1666 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1673 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1679 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1688 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1694 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule1729 = new BitSet(new long[]{0x0020010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1735 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule1744 = new BitSet(new long[]{0x0020010000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule1750 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule1761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_trowRule1827 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_trowRule1842 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1870 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1882 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1897 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1925 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1931 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1940 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1948 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1963 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule1990 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_imageRule2002 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule2011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_imageRule2017 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule2049 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule2053 = new BitSet(new long[]{0x0800000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_STRING_in_assignListRule2061 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule2065 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_STRING_in_assignListRule2081 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_VAR_in_assignListRule2085 = new BitSet(new long[]{0x0800000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule2118 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule2122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_formatRule2128 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_formatRule2138 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_formatRule2150 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_formatRule2163 = new BitSet(new long[]{0x0400000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPushRule_in_listManipulationRule2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRemoveRule_in_listManipulationRule2199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUSH_in_listPushRule2216 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_listPushRule2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_listPushRule2226 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listPushRule2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_listPushRule2236 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_listPushRule2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMOVE_in_listRemoveRule2256 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LP_in_listRemoveRule2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VAR_in_listRemoveRule2266 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRemoveRule2270 = new BitSet(new long[]{0x0000002000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_listRemoveRule2276 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRemoveRule2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_set_in_listRemoveRule2292 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_RP_in_listRemoveRule2302 = new BitSet(new long[]{0x0000000000000002L});
}
