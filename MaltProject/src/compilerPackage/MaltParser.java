// $ANTLR 3.5.1 C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-06-01 18:38:00

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BLOCKCODE", "BLOCKQUOTE", 
		"BOLD", "C", "CHAR", "CL", "CM", "CODE", "COMMENT", "DIGIT", "DO", "EQ", 
		"ESC_SEQ", "EX", "EXPONENT", "FLOAT", "GET", "HA", "HEX_DIGIT", "HL", 
		"HRULE", "ID", "INTEGER", "IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", 
		"LP", "LSB", "OCTAL_ESC", "OLIST", "PERC", "QU", "R", "RAB", "RCB", "RP", 
		"RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", 
		"ST", "STRING", "SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", 
		"UNICODE_ESC", "VAR", "WS", "'C'", "'C++'", "'Java'"
	};
	public static final int EOF=-1;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int AT=4;
	public static final int BLOCKCODE=5;
	public static final int BLOCKQUOTE=6;
	public static final int BOLD=7;
	public static final int C=8;
	public static final int CHAR=9;
	public static final int CL=10;
	public static final int CM=11;
	public static final int CODE=12;
	public static final int COMMENT=13;
	public static final int DIGIT=14;
	public static final int DO=15;
	public static final int EQ=16;
	public static final int ESC_SEQ=17;
	public static final int EX=18;
	public static final int EXPONENT=19;
	public static final int FLOAT=20;
	public static final int GET=21;
	public static final int HA=22;
	public static final int HEX_DIGIT=23;
	public static final int HL=24;
	public static final int HRULE=25;
	public static final int ID=26;
	public static final int INTEGER=27;
	public static final int IT=28;
	public static final int ITBOLD=29;
	public static final int L=30;
	public static final int LAB=31;
	public static final int LCB=32;
	public static final int LET=33;
	public static final int LETTER=34;
	public static final int LP=35;
	public static final int LSB=36;
	public static final int OCTAL_ESC=37;
	public static final int OLIST=38;
	public static final int PERC=39;
	public static final int QU=40;
	public static final int R=41;
	public static final int RAB=42;
	public static final int RCB=43;
	public static final int RP=44;
	public static final int RSB=45;
	public static final int S1TITLE=46;
	public static final int S2TITLE=47;
	public static final int S3TITLE=48;
	public static final int S4TITLE=49;
	public static final int S5TITLE=50;
	public static final int SE=51;
	public static final int SL=52;
	public static final int ST=53;
	public static final int STRING=54;
	public static final int SUBS=55;
	public static final int SUPS=56;
	public static final int TABLE=57;
	public static final int TEXT=58;
	public static final int TITLE=59;
	public static final int TLIST=60;
	public static final int ULIST=61;
	public static final int UNICODE_ESC=62;
	public static final int VAR=63;
	public static final int WS=64;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }



	// $ANTLR start "parseJava"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:15:1: parseJava : initRule ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:16:2: ( initRule )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:17:3: initRule
			{
			pushFollow(FOLLOW_initRule_in_parseJava45);
			initRule();
			state._fsp--;

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



	// $ANTLR start "initRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: initRule : titleRule ( titleRule | textDeclRule )* ;
	public final void initRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:9: ( titleRule ( titleRule | textDeclRule )* )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: titleRule ( titleRule | textDeclRule )*
			{
			pushFollow(FOLLOW_titleRule_in_initRule55);
			titleRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:11: ( titleRule | textDeclRule )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= S1TITLE && LA1_0 <= S5TITLE)||LA1_0==TITLE) ) {
					alt1=1;
				}
				else if ( (LA1_0==TEXT) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:12: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_initRule57);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:22: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_initRule59);
					textDeclRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "initRule"



	// $ANTLR start "titleRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:1: titleRule : titleTypeRule VAR EQ STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:2: ( titleTypeRule VAR EQ STRING ( refRule )? )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:3: titleTypeRule VAR EQ STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule74);
			titleTypeRule();
			state._fsp--;

			match(input,VAR,FOLLOW_VAR_in_titleRule76); 
			match(input,EQ,FOLLOW_EQ_in_titleRule78); 
			match(input,STRING,FOLLOW_STRING_in_titleRule80); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:31: ( refRule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==LCB) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:31: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule82);
					refRule();
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
	// $ANTLR end "titleRule"



	// $ANTLR start "titleTypeRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= S1TITLE && input.LA(1) <= S5TITLE)||input.LA(1)==TITLE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "titleTypeRule"



	// $ANTLR start "refRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: refRule : LCB HA ID RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( LCB HA ID RCB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: LCB HA ID RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule127); 
			match(input,HA,FOLLOW_HA_in_refRule129); 
			match(input,ID,FOLLOW_ID_in_refRule131); 
			match(input,RCB,FOLLOW_RCB_in_refRule133); 
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



	// $ANTLR start "textDeclRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:1: textDeclRule : TEXT VAR EQ textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:2: ( TEXT VAR EQ textRule )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:3: TEXT VAR EQ textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule146); 
			match(input,VAR,FOLLOW_VAR_in_textDeclRule148); 
			match(input,EQ,FOLLOW_EQ_in_textDeclRule150); 
			pushFollow(FOLLOW_textRule_in_textDeclRule152);
			textRule();
			state._fsp--;

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
	// $ANTLR end "textDeclRule"



	// $ANTLR start "textRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:1: textRule : ( LETTER | DIGIT | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )* ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:2: ( ( LETTER | DIGIT | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )* )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:3: ( LETTER | DIGIT | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )*
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:3: ( LETTER | DIGIT | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )*
			loop3:
			while (true) {
				int alt3=11;
				switch ( input.LA(1) ) {
				case LETTER:
					{
					alt3=1;
					}
					break;
				case DIGIT:
					{
					alt3=2;
					}
					break;
				case IT:
					{
					alt3=3;
					}
					break;
				case BOLD:
					{
					alt3=4;
					}
					break;
				case ITBOLD:
					{
					alt3=5;
					}
					break;
				case ST:
					{
					alt3=6;
					}
					break;
				case HL:
					{
					alt3=7;
					}
					break;
				case SUBS:
					{
					alt3=8;
					}
					break;
				case SUPS:
					{
					alt3=9;
					}
					break;
				case CODE:
					{
					alt3=10;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:4: LETTER
					{
					match(input,LETTER,FOLLOW_LETTER_in_textRule165); 
					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:13: DIGIT
					{
					match(input,DIGIT,FOLLOW_DIGIT_in_textRule169); 
					}
					break;
				case 3 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:21: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule173);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:38: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule177);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:53: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule181);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule187);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:30: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule191);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:50: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule195);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:70: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule199);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule205);
					codeTextRule();
					state._fsp--;

					}
					break;

				default :
					break loop3;
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
	// $ANTLR end "textRule"



	// $ANTLR start "italicTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:1: italicTextRule : IT ( subtextRule )* IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:2: ( IT ( subtextRule )* IT )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:3: IT ( subtextRule )* IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule221); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:6: ( subtextRule )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==AT||(LA4_0 >= CL && LA4_0 <= CM)||(LA4_0 >= DIGIT && LA4_0 <= DO)||LA4_0==LETTER||(LA4_0 >= SE && LA4_0 <= SL)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_italicTextRule223);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,IT,FOLLOW_IT_in_italicTextRule226); 
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
	// $ANTLR end "italicTextRule"



	// $ANTLR start "boldTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: boldTextRule : BOLD ( subtextRule )* BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: ( BOLD ( subtextRule )* BOLD )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: BOLD ( subtextRule )* BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule239); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:8: ( subtextRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AT||(LA5_0 >= CL && LA5_0 <= CM)||(LA5_0 >= DIGIT && LA5_0 <= DO)||LA5_0==LETTER||(LA5_0 >= SE && LA5_0 <= SL)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_boldTextRule241);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule244); 
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
	// $ANTLR end "boldTextRule"



	// $ANTLR start "ibTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:1: ibTextRule : ITBOLD ( subtextRule )* ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:2: ( ITBOLD ( subtextRule )* ITBOLD )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:3: ITBOLD ( subtextRule )* ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule256); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:10: ( subtextRule )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AT||(LA6_0 >= CL && LA6_0 <= CM)||(LA6_0 >= DIGIT && LA6_0 <= DO)||LA6_0==LETTER||(LA6_0 >= SE && LA6_0 <= SL)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:10: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_ibTextRule258);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule261); 
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
	// $ANTLR end "ibTextRule"



	// $ANTLR start "strikethroughtTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: strikethroughtTextRule : ST ( subtextRule )* ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( ST ( subtextRule )* ST )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: ST ( subtextRule )* ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule273); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:6: ( subtextRule )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AT||(LA7_0 >= CL && LA7_0 <= CM)||(LA7_0 >= DIGIT && LA7_0 <= DO)||LA7_0==LETTER||(LA7_0 >= SE && LA7_0 <= SL)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule275);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule278); 
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
	// $ANTLR end "strikethroughtTextRule"



	// $ANTLR start "highlightTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:1: highlightTextRule : HL ( subtextRule )* HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:2: ( HL ( subtextRule )* HL )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:3: HL ( subtextRule )* HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule290); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:6: ( subtextRule )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AT||(LA8_0 >= CL && LA8_0 <= CM)||(LA8_0 >= DIGIT && LA8_0 <= DO)||LA8_0==LETTER||(LA8_0 >= SE && LA8_0 <= SL)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_highlightTextRule292);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,HL,FOLLOW_HL_in_highlightTextRule295); 
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
	// $ANTLR end "highlightTextRule"



	// $ANTLR start "subscriptTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:1: subscriptTextRule : SUBS ( subtextRule )* SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:2: ( SUBS ( subtextRule )* SUBS )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:3: SUBS ( subtextRule )* SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule307); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:8: ( subtextRule )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==AT||(LA9_0 >= CL && LA9_0 <= CM)||(LA9_0 >= DIGIT && LA9_0 <= DO)||LA9_0==LETTER||(LA9_0 >= SE && LA9_0 <= SL)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_subscriptTextRule309);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule312); 
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
	// $ANTLR end "subscriptTextRule"



	// $ANTLR start "superscriptTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:1: superscriptTextRule : SUPS ( subtextRule )* SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:2: ( SUPS ( subtextRule )* SUPS )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:3: SUPS ( subtextRule )* SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule324); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:8: ( subtextRule )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==AT||(LA10_0 >= CL && LA10_0 <= CM)||(LA10_0 >= DIGIT && LA10_0 <= DO)||LA10_0==LETTER||(LA10_0 >= SE && LA10_0 <= SL)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_superscriptTextRule326);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule329); 
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
	// $ANTLR end "superscriptTextRule"



	// $ANTLR start "codeTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:1: codeTextRule : CODE ( subtextRule )* CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:2: ( CODE ( subtextRule )* CODE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:4: CODE ( subtextRule )* CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule339); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:9: ( subtextRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AT||(LA11_0 >= CL && LA11_0 <= CM)||(LA11_0 >= DIGIT && LA11_0 <= DO)||LA11_0==LETTER||(LA11_0 >= SE && LA11_0 <= SL)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:9: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_codeTextRule341);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,CODE,FOLLOW_CODE_in_codeTextRule344); 
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
	// $ANTLR end "codeTextRule"



	// $ANTLR start "subtextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:1: subtextRule : ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT ) ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:2: ( ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT ) )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( input.LA(1)==AT||(input.LA(1) >= CL && input.LA(1) <= CM)||(input.LA(1) >= DIGIT && input.LA(1) <= DO)||input.LA(1)==LETTER||(input.LA(1) >= SE && input.LA(1) <= SL) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "subtextRule"



	// $ANTLR start "blockquoteRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:93:1: blockquoteRule : BLOCKQUOTE VAR EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:2: ( BLOCKQUOTE VAR EQ textRule )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:3: BLOCKQUOTE VAR EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule401); 
			match(input,VAR,FOLLOW_VAR_in_blockquoteRule403); 
			match(input,EQ,FOLLOW_EQ_in_blockquoteRule405); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule407);
			textRule();
			state._fsp--;

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
	// $ANTLR end "blockquoteRule"



	// $ANTLR start "olistRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:1: olistRule : OLIST LP textListRule RP ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:2: ( OLIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:3: OLIST LP textListRule RP
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule420); 
			match(input,LP,FOLLOW_LP_in_olistRule422); 
			pushFollow(FOLLOW_textListRule_in_olistRule424);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_olistRule426); 
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
	// $ANTLR end "olistRule"



	// $ANTLR start "textListRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:1: textListRule : textRule ( CM textRule )+ ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:2: ( textRule ( CM textRule )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:4: textRule ( CM textRule )+
			{
			pushFollow(FOLLOW_textRule_in_textListRule436);
			textRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:13: ( CM textRule )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:14: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_textListRule439); 
					pushFollow(FOLLOW_textRule_in_textListRule441);
					textRule();
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
	// $ANTLR end "textListRule"



	// $ANTLR start "ulistRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:1: ulistRule : ULIST LP textListRule RP ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:2: ( ULIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:3: ULIST LP textListRule RP
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule456); 
			match(input,LP,FOLLOW_LP_in_ulistRule458); 
			pushFollow(FOLLOW_textListRule_in_ulistRule460);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ulistRule462); 
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
	// $ANTLR end "ulistRule"



	// $ANTLR start "tlistRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:1: tlistRule : TLIST LP textListRule RP ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:2: ( TLIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:3: TLIST LP textListRule RP
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule475); 
			match(input,LP,FOLLOW_LP_in_tlistRule477); 
			pushFollow(FOLLOW_textListRule_in_tlistRule479);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_tlistRule481); 
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
	// $ANTLR end "tlistRule"



	// $ANTLR start "blockCodeRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:1: blockCodeRule : BLOCKCODE ( languageRule )? textRule BLOCKCODE ;
	public final void blockCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:2: ( BLOCKCODE ( languageRule )? textRule BLOCKCODE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:3: BLOCKCODE ( languageRule )? textRule BLOCKCODE
			{
			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule494); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:13: ( languageRule )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= 65 && LA13_0 <= 67)) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:13: languageRule
					{
					pushFollow(FOLLOW_languageRule_in_blockCodeRule496);
					languageRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockCodeRule499);
			textRule();
			state._fsp--;

			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule501); 
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
	// $ANTLR end "blockCodeRule"



	// $ANTLR start "languageRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:1: languageRule : ( 'Java' | 'C' | 'C++' );
	public final void languageRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:123:2: ( 'Java' | 'C' | 'C++' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= 65 && input.LA(1) <= 67) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "languageRule"



	// $ANTLR start "horizontalRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:128:2: ( HRULE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule533); 
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
	// $ANTLR end "horizontalRule"



	// $ANTLR start "linkRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:1: linkRule : LSB ( textRule | imageRule ) RSB LP textLinkRule RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:2: ( LSB ( textRule | imageRule ) RSB LP textLinkRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:3: LSB ( textRule | imageRule ) RSB LP textLinkRule RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule545); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:7: ( textRule | imageRule )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EOF||LA14_0==BLOCKCODE||LA14_0==BOLD||(LA14_0 >= CM && LA14_0 <= CODE)||LA14_0==DIGIT||LA14_0==HL||(LA14_0 >= IT && LA14_0 <= ITBOLD)||LA14_0==LETTER||LA14_0==QU||(LA14_0 >= RP && LA14_0 <= S5TITLE)||LA14_0==ST||(LA14_0 >= SUBS && LA14_0 <= SUPS)||(LA14_0 >= TEXT && LA14_0 <= TITLE)) ) {
				alt14=1;
			}
			else if ( (LA14_0==EX) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule548);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule552);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule555); 
			match(input,LP,FOLLOW_LP_in_linkRule557); 
			pushFollow(FOLLOW_textLinkRule_in_linkRule559);
			textLinkRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule561); 
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
	// $ANTLR end "linkRule"



	// $ANTLR start "textLinkRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:1: textLinkRule : ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ ;
	public final void textLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:2: ( ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AT||(LA15_0 >= CL && LA15_0 <= CM)||(LA15_0 >= DIGIT && LA15_0 <= DO)||LA15_0==LETTER||(LA15_0 >= SE && LA15_0 <= SL)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( input.LA(1)==AT||(input.LA(1) >= CL && input.LA(1) <= CM)||(input.LA(1) >= DIGIT && input.LA(1) <= DO)||input.LA(1)==LETTER||(input.LA(1) >= SE && input.LA(1) <= SL) ) {
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
	// $ANTLR end "textLinkRule"



	// $ANTLR start "imageRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:1: imageRule : EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:2: ( EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:3: EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP
			{
			match(input,EX,FOLLOW_EX_in_imageRule616); 
			match(input,LSB,FOLLOW_LSB_in_imageRule618); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule620);
			textLinkRule();
			state._fsp--;

			match(input,RSB,FOLLOW_RSB_in_imageRule622); 
			match(input,LP,FOLLOW_LP_in_imageRule624); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule626);
			textLinkRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:43: ( QU textRule QU )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==QU) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:44: QU textRule QU
					{
					match(input,QU,FOLLOW_QU_in_imageRule629); 
					pushFollow(FOLLOW_textRule_in_imageRule631);
					textRule();
					state._fsp--;

					match(input,QU,FOLLOW_QU_in_imageRule633); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule637); 
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
	// $ANTLR end "imageRule"



	// $ANTLR start "quickLinkRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:1: quickLinkRule : LAB textLinkRule RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:2: ( LAB textLinkRule RAB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:3: LAB textLinkRule RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule649); 
			pushFollow(FOLLOW_textLinkRule_in_quickLinkRule651);
			textLinkRule();
			state._fsp--;

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule653); 
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
	// $ANTLR end "quickLinkRule"



	// $ANTLR start "tableRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule667); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:9: ( talignmentRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LSB) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule669);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule672); 
			pushFollow(FOLLOW_trowRule_in_tableRule674);
			trowRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:37: ( CM trowRule )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==CM) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule677); 
					pushFollow(FOLLOW_trowRule_in_tableRule679);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule683); 
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
	// $ANTLR end "tableRule"



	// $ANTLR start "talignmentRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule695); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule697);
			alignRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:17: ( CM alignRule )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==CM) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule700); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule702);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule706); 
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
	// $ANTLR end "talignmentRule"



	// $ANTLR start "alignRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:2: ( L | C | R )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( input.LA(1)==C||input.LA(1)==L||input.LA(1)==R ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "alignRule"



	// $ANTLR start "trowRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:1: trowRule : LSB textRule ( CM textRule )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:2: ( LSB textRule ( CM textRule )* RSB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:3: LSB textRule ( CM textRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule738); 
			pushFollow(FOLLOW_textRule_in_trowRule740);
			textRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:16: ( CM textRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==CM) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:17: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_trowRule743); 
					pushFollow(FOLLOW_textRule_in_trowRule745);
					textRule();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule749); 
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
	// $ANTLR end "trowRule"

	// Delegated rules



	public static final BitSet FOLLOW_initRule_in_parseJava45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_initRule55 = new BitSet(new long[]{0x0C07C00000000002L});
	public static final BitSet FOLLOW_titleRule_in_initRule57 = new BitSet(new long[]{0x0C07C00000000002L});
	public static final BitSet FOLLOW_textDeclRule_in_initRule59 = new BitSet(new long[]{0x0C07C00000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule74 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_VAR_in_titleRule76 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule78 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule80 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule127 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_HA_in_refRule129 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_refRule131 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule146 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule148 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule150 = new BitSet(new long[]{0x01A0000431005080L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_textRule165 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_DIGIT_in_textRule169 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule173 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule177 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule181 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule187 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule191 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule195 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule199 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule205 = new BitSet(new long[]{0x01A0000431005082L});
	public static final BitSet FOLLOW_IT_in_italicTextRule221 = new BitSet(new long[]{0x001800041000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule223 = new BitSet(new long[]{0x001800041000CC10L});
	public static final BitSet FOLLOW_IT_in_italicTextRule226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule239 = new BitSet(new long[]{0x001800040000CC90L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule241 = new BitSet(new long[]{0x001800040000CC90L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule256 = new BitSet(new long[]{0x001800042000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule258 = new BitSet(new long[]{0x001800042000CC10L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule273 = new BitSet(new long[]{0x003800040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule275 = new BitSet(new long[]{0x003800040000CC10L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule290 = new BitSet(new long[]{0x001800040100CC10L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule292 = new BitSet(new long[]{0x001800040100CC10L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule307 = new BitSet(new long[]{0x009800040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule309 = new BitSet(new long[]{0x009800040000CC10L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule324 = new BitSet(new long[]{0x011800040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule326 = new BitSet(new long[]{0x011800040000CC10L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule339 = new BitSet(new long[]{0x001800040000DC10L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule341 = new BitSet(new long[]{0x001800040000DC10L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule401 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule403 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule405 = new BitSet(new long[]{0x01A0000431005080L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule420 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_olistRule422 = new BitSet(new long[]{0x01A0000431005880L});
	public static final BitSet FOLLOW_textListRule_in_olistRule424 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RP_in_olistRule426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_textRule_in_textListRule436 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CM_in_textListRule439 = new BitSet(new long[]{0x01A0000431005880L});
	public static final BitSet FOLLOW_textRule_in_textListRule441 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule456 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_ulistRule458 = new BitSet(new long[]{0x01A0000431005880L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule460 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RP_in_ulistRule462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule475 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tlistRule477 = new BitSet(new long[]{0x01A0000431005880L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule479 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RP_in_tlistRule481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule494 = new BitSet(new long[]{0x01A00004310050A0L,0x000000000000000EL});
	public static final BitSet FOLLOW_languageRule_in_blockCodeRule496 = new BitSet(new long[]{0x01A00004310050A0L});
	public static final BitSet FOLLOW_textRule_in_blockCodeRule499 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule545 = new BitSet(new long[]{0x01A0200431045080L});
	public static final BitSet FOLLOW_textRule_in_linkRule548 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule552 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule555 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_linkRule557 = new BitSet(new long[]{0x001800040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_linkRule559 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EX_in_imageRule616 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LSB_in_imageRule618 = new BitSet(new long[]{0x001800040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule620 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RSB_in_imageRule622 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_imageRule624 = new BitSet(new long[]{0x001800040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule626 = new BitSet(new long[]{0x0000110000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule629 = new BitSet(new long[]{0x01A0010431005080L});
	public static final BitSet FOLLOW_textRule_in_imageRule631 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule633 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule649 = new BitSet(new long[]{0x001800040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_quickLinkRule651 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule667 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule669 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tableRule672 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule674 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_CM_in_tableRule677 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule679 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RP_in_tableRule683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule695 = new BitSet(new long[]{0x0000020040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule697 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_CM_in_talignmentRule700 = new BitSet(new long[]{0x0000020040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule702 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule738 = new BitSet(new long[]{0x01A0200431005880L});
	public static final BitSet FOLLOW_textRule_in_trowRule740 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_CM_in_trowRule743 = new BitSet(new long[]{0x01A0200431005880L});
	public static final BitSet FOLLOW_textRule_in_trowRule745 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_RSB_in_trowRule749 = new BitSet(new long[]{0x0000000000000002L});
}
