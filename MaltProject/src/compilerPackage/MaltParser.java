// $ANTLR 3.5.1 C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-05-30 14:07:00

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
		"LP", "LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", 
		"S1TITLE", "S2", "S2TITLE", "S3", "S3TITLE", "S4", "S4TITLE", "S5", "S5TITLE", 
		"S6", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", "TITLE", "TLIST", 
		"ULIST", "UNICODE_ESC", "WS", "'C'", "'C++'", "'Java'"
	};
	public static final int EOF=-1;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
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
	public static final int QU=39;
	public static final int R=40;
	public static final int RAB=41;
	public static final int RCB=42;
	public static final int RP=43;
	public static final int RSB=44;
	public static final int S1TITLE=45;
	public static final int S2=46;
	public static final int S2TITLE=47;
	public static final int S3=48;
	public static final int S3TITLE=49;
	public static final int S4=50;
	public static final int S4TITLE=51;
	public static final int S5=52;
	public static final int S5TITLE=53;
	public static final int S6=54;
	public static final int SE=55;
	public static final int SL=56;
	public static final int ST=57;
	public static final int STRING=58;
	public static final int SUBS=59;
	public static final int SUPS=60;
	public static final int TABLE=61;
	public static final int TITLE=62;
	public static final int TLIST=63;
	public static final int ULIST=64;
	public static final int UNICODE_ESC=65;
	public static final int WS=66;

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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: initRule : ( titleRule | textRule );
	public final void initRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:9: ( titleRule | textRule )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==S1TITLE||LA1_0==S2TITLE||LA1_0==S3TITLE||LA1_0==S4TITLE||LA1_0==S5TITLE||LA1_0==TITLE) ) {
				alt1=1;
			}
			else if ( (LA1_0==BOLD||(LA1_0 >= CL && LA1_0 <= CODE)||(LA1_0 >= DIGIT && LA1_0 <= DO)||LA1_0==HL||(LA1_0 >= IT && LA1_0 <= ITBOLD)||LA1_0==LETTER||LA1_0==SE||LA1_0==ST||(LA1_0 >= SUBS && LA1_0 <= SUPS)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_initRule55);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:14: textRule
					{
					pushFollow(FOLLOW_textRule_in_initRule59);
					textRule();
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
	// $ANTLR end "initRule"



	// $ANTLR start "titleRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:1: titleRule : titleTypeRule nameRule EQ textTitleRule ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:2: ( titleTypeRule nameRule EQ textTitleRule ( refRule )? )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:3: titleTypeRule nameRule EQ textTitleRule ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule72);
			titleTypeRule();
			state._fsp--;

			pushFollow(FOLLOW_nameRule_in_titleRule74);
			nameRule();
			state._fsp--;

			match(input,EQ,FOLLOW_EQ_in_titleRule76); 
			pushFollow(FOLLOW_textTitleRule_in_titleRule78);
			textTitleRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:43: ( refRule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==LCB) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:43: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule80);
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
			if ( input.LA(1)==S1TITLE||input.LA(1)==S2TITLE||input.LA(1)==S3TITLE||input.LA(1)==S4TITLE||input.LA(1)==S5TITLE||input.LA(1)==TITLE ) {
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



	// $ANTLR start "nameRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: nameRule : LETTER ( LETTER | DIGIT | DO | CM | SE | CL )* ;
	public final void nameRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( LETTER ( LETTER | DIGIT | DO | CM | SE | CL )* )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: LETTER ( LETTER | DIGIT | DO | CM | SE | CL )*
			{
			match(input,LETTER,FOLLOW_LETTER_in_nameRule125); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:9: ( LETTER | DIGIT | DO | CM | SE | CL )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= CL && LA3_0 <= CM)||(LA3_0 >= DIGIT && LA3_0 <= DO)||LA3_0==LETTER||LA3_0==SE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= CL && input.LA(1) <= CM)||(input.LA(1) >= DIGIT && input.LA(1) <= DO)||input.LA(1)==LETTER||input.LA(1)==SE ) {
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
	// $ANTLR end "nameRule"



	// $ANTLR start "textTitleRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:1: textTitleRule : ( LETTER | DIGIT | DO | CM | SE | CL )+ ;
	public final void textTitleRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:2: ( ( LETTER | DIGIT | DO | CM | SE | CL )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:3: ( LETTER | DIGIT | DO | CM | SE | CL )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:3: ( LETTER | DIGIT | DO | CM | SE | CL )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= CL && LA4_0 <= CM)||(LA4_0 >= DIGIT && LA4_0 <= DO)||LA4_0==LETTER||LA4_0==SE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= CL && input.LA(1) <= CM)||(input.LA(1) >= DIGIT && input.LA(1) <= DO)||input.LA(1)==LETTER||input.LA(1)==SE ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
	// $ANTLR end "textTitleRule"



	// $ANTLR start "refRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:1: refRule : LCB HA ID RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:2: ( LCB HA ID RCB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:3: LCB HA ID RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule197); 
			match(input,HA,FOLLOW_HA_in_refRule199); 
			match(input,ID,FOLLOW_ID_in_refRule201); 
			match(input,RCB,FOLLOW_RCB_in_refRule203); 
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



	// $ANTLR start "textRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:1: textRule : ( LETTER | DIGIT | DO | CM | SE | CL | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+ ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:2: ( ( LETTER | DIGIT | DO | CM | SE | CL | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:3: ( LETTER | DIGIT | DO | CM | SE | CL | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:3: ( LETTER | DIGIT | DO | CM | SE | CL | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=15;
				switch ( input.LA(1) ) {
				case CM:
					{
					alt5=4;
					}
					break;
				case LETTER:
					{
					alt5=1;
					}
					break;
				case DIGIT:
					{
					alt5=2;
					}
					break;
				case DO:
					{
					alt5=3;
					}
					break;
				case SE:
					{
					alt5=5;
					}
					break;
				case CL:
					{
					alt5=6;
					}
					break;
				case IT:
					{
					alt5=7;
					}
					break;
				case BOLD:
					{
					alt5=8;
					}
					break;
				case ITBOLD:
					{
					alt5=9;
					}
					break;
				case ST:
					{
					alt5=10;
					}
					break;
				case HL:
					{
					alt5=11;
					}
					break;
				case SUBS:
					{
					alt5=12;
					}
					break;
				case SUPS:
					{
					alt5=13;
					}
					break;
				case CODE:
					{
					alt5=14;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:4: LETTER
					{
					match(input,LETTER,FOLLOW_LETTER_in_textRule216); 
					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:13: DIGIT
					{
					match(input,DIGIT,FOLLOW_DIGIT_in_textRule220); 
					}
					break;
				case 3 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:21: DO
					{
					match(input,DO,FOLLOW_DO_in_textRule224); 
					}
					break;
				case 4 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:26: CM
					{
					match(input,CM,FOLLOW_CM_in_textRule228); 
					}
					break;
				case 5 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:31: SE
					{
					match(input,SE,FOLLOW_SE_in_textRule232); 
					}
					break;
				case 6 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:36: CL
					{
					match(input,CL,FOLLOW_CL_in_textRule236); 
					}
					break;
				case 7 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:41: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule240);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:58: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule244);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:73: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule248);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule254);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:30: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule258);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:50: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule262);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:70: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule266);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 14 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule272);
					codeTextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: italicTextRule : IT subtextRule IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: ( IT subtextRule IT )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: IT subtextRule IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule288); 
			pushFollow(FOLLOW_subtextRule_in_italicTextRule290);
			subtextRule();
			state._fsp--;

			match(input,IT,FOLLOW_IT_in_italicTextRule292); 
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



	// $ANTLR start "subtextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:1: subtextRule : ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:2: ( ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AT||(LA6_0 >= CL && LA6_0 <= CM)||(LA6_0 >= DIGIT && LA6_0 <= DO)||LA6_0==LETTER||(LA6_0 >= SE && LA6_0 <= SL)) ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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



	// $ANTLR start "boldTextRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: boldTextRule : BOLD subtextRule BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( BOLD subtextRule BOLD )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: BOLD subtextRule BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule349); 
			pushFollow(FOLLOW_subtextRule_in_boldTextRule351);
			subtextRule();
			state._fsp--;

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule353); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:1: ibTextRule : ITBOLD subtextRule ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:2: ( ITBOLD subtextRule ITBOLD )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:3: ITBOLD subtextRule ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule365); 
			pushFollow(FOLLOW_subtextRule_in_ibTextRule367);
			subtextRule();
			state._fsp--;

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule369); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:1: strikethroughtTextRule : ST subtextRule ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:2: ( ST subtextRule ST )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:3: ST subtextRule ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule381); 
			pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule383);
			subtextRule();
			state._fsp--;

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule385); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:1: highlightTextRule : HL subtextRule HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:2: ( HL subtextRule HL )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:3: HL subtextRule HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule397); 
			pushFollow(FOLLOW_subtextRule_in_highlightTextRule399);
			subtextRule();
			state._fsp--;

			match(input,HL,FOLLOW_HL_in_highlightTextRule401); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:1: subscriptTextRule : SUBS subtextRule SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:2: ( SUBS subtextRule SUBS )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:3: SUBS subtextRule SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule413); 
			pushFollow(FOLLOW_subtextRule_in_subscriptTextRule415);
			subtextRule();
			state._fsp--;

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule417); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:1: superscriptTextRule : SUPS subtextRule SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:2: ( SUPS subtextRule SUPS )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:3: SUPS subtextRule SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule429); 
			pushFollow(FOLLOW_subtextRule_in_superscriptTextRule431);
			subtextRule();
			state._fsp--;

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule433); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:1: codeTextRule : CODE subtextRule CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:2: ( CODE subtextRule CODE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:4: CODE subtextRule CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule443); 
			pushFollow(FOLLOW_subtextRule_in_codeTextRule445);
			subtextRule();
			state._fsp--;

			match(input,CODE,FOLLOW_CODE_in_codeTextRule447); 
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



	// $ANTLR start "blockquoteRule"
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:1: blockquoteRule : BLOCKQUOTE nameRule EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:2: ( BLOCKQUOTE nameRule EQ textRule )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:3: BLOCKQUOTE nameRule EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule460); 
			pushFollow(FOLLOW_nameRule_in_blockquoteRule462);
			nameRule();
			state._fsp--;

			match(input,EQ,FOLLOW_EQ_in_blockquoteRule464); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule466);
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:1: olistRule : OLIST LP textListRule RP ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:2: ( OLIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:105:3: OLIST LP textListRule RP
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule479); 
			match(input,LP,FOLLOW_LP_in_olistRule481); 
			pushFollow(FOLLOW_textListRule_in_olistRule483);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_olistRule485); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:1: textListRule : textRule ( CM textRule )+ ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:2: ( textRule ( CM textRule )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:4: textRule ( CM textRule )+
			{
			pushFollow(FOLLOW_textRule_in_textListRule495);
			textRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:13: ( CM textRule )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CM) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:14: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_textListRule498); 
					pushFollow(FOLLOW_textRule_in_textListRule500);
					textRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:1: ulistRule : ULIST LP textListRule RP ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:2: ( ULIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:3: ULIST LP textListRule RP
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule515); 
			match(input,LP,FOLLOW_LP_in_ulistRule517); 
			pushFollow(FOLLOW_textListRule_in_ulistRule519);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ulistRule521); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:1: tlistRule : TLIST LP textListRule RP ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:2: ( TLIST LP textListRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:3: TLIST LP textListRule RP
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule534); 
			match(input,LP,FOLLOW_LP_in_tlistRule536); 
			pushFollow(FOLLOW_textListRule_in_tlistRule538);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_tlistRule540); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:1: blockCodeRule : BLOCKCODE ( languageRule )? textRule BLOCKCODE ;
	public final void blockCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:123:2: ( BLOCKCODE ( languageRule )? textRule BLOCKCODE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:3: BLOCKCODE ( languageRule )? textRule BLOCKCODE
			{
			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule553); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:13: ( languageRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= 67 && LA8_0 <= 69)) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:13: languageRule
					{
					pushFollow(FOLLOW_languageRule_in_blockCodeRule555);
					languageRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockCodeRule558);
			textRule();
			state._fsp--;

			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule560); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:1: languageRule : ( 'Java' | 'C' | 'C++' );
	public final void languageRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:128:2: ( 'Java' | 'C' | 'C++' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= 67 && input.LA(1) <= 69) ) {
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:2: ( HRULE )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule592); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:1: linkRule : LSB ( textRule | imageRule ) RSB LP textLinkRule RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:2: ( LSB ( textRule | imageRule ) RSB LP textLinkRule RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: LSB ( textRule | imageRule ) RSB LP textLinkRule RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule604); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:7: ( textRule | imageRule )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BOLD||(LA9_0 >= CL && LA9_0 <= CODE)||(LA9_0 >= DIGIT && LA9_0 <= DO)||LA9_0==HL||(LA9_0 >= IT && LA9_0 <= ITBOLD)||LA9_0==LETTER||LA9_0==SE||LA9_0==ST||(LA9_0 >= SUBS && LA9_0 <= SUPS)) ) {
				alt9=1;
			}
			else if ( (LA9_0==EX) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule607);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule611);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule614); 
			match(input,LP,FOLLOW_LP_in_linkRule616); 
			pushFollow(FOLLOW_textLinkRule_in_linkRule618);
			textLinkRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule620); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:1: textLinkRule : ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ ;
	public final void textLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:2: ( ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:3: ( LETTER | DIGIT | DO | CM | SE | CL | SL | AT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==AT||(LA10_0 >= CL && LA10_0 <= CM)||(LA10_0 >= DIGIT && LA10_0 <= DO)||LA10_0==LETTER||(LA10_0 >= SE && LA10_0 <= SL)) ) {
					alt10=1;
				}

				switch (alt10) {
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:1: imageRule : EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:2: ( EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:3: EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP
			{
			match(input,EX,FOLLOW_EX_in_imageRule675); 
			match(input,LSB,FOLLOW_LSB_in_imageRule677); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule679);
			textLinkRule();
			state._fsp--;

			match(input,RSB,FOLLOW_RSB_in_imageRule681); 
			match(input,LP,FOLLOW_LP_in_imageRule683); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule685);
			textLinkRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:43: ( QU textRule QU )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==QU) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:44: QU textRule QU
					{
					match(input,QU,FOLLOW_QU_in_imageRule688); 
					pushFollow(FOLLOW_textRule_in_imageRule690);
					textRule();
					state._fsp--;

					match(input,QU,FOLLOW_QU_in_imageRule692); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule696); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:1: quickLinkRule : LAB textLinkRule RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:2: ( LAB textLinkRule RAB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:3: LAB textLinkRule RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule708); 
			pushFollow(FOLLOW_textLinkRule_in_quickLinkRule710);
			textLinkRule();
			state._fsp--;

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule712); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule726); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:9: ( talignmentRule )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==LSB) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule728);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule731); 
			pushFollow(FOLLOW_trowRule_in_tableRule733);
			trowRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:37: ( CM trowRule )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule736); 
					pushFollow(FOLLOW_trowRule_in_tableRule738);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule742); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule754); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule756);
			alignRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:17: ( CM alignRule )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule759); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule761);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule765); 
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:2: ( L | C | R )
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
	// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:1: trowRule : LSB textRule ( CM textRule )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:2: ( LSB textRule ( CM textRule )* RSB )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:3: LSB textRule ( CM textRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule797); 
			pushFollow(FOLLOW_textRule_in_trowRule799);
			textRule();
			state._fsp--;

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:16: ( CM textRule )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==CM) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:17: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_trowRule802); 
					pushFollow(FOLLOW_textRule_in_trowRule804);
					textRule();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule808); 
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
	public static final BitSet FOLLOW_titleRule_in_initRule55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_textRule_in_initRule59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule72 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_nameRule_in_titleRule74 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule76 = new BitSet(new long[]{0x008000040000CC00L});
	public static final BitSet FOLLOW_textTitleRule_in_titleRule78 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_nameRule125 = new BitSet(new long[]{0x008000040000CC02L});
	public static final BitSet FOLLOW_LCB_in_refRule197 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_HA_in_refRule199 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_refRule201 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_textRule216 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_DIGIT_in_textRule220 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_DO_in_textRule224 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_CM_in_textRule228 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_SE_in_textRule232 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_CL_in_textRule236 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule240 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule244 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule248 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule254 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule258 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule262 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule266 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule272 = new BitSet(new long[]{0x1A8000043100DC82L});
	public static final BitSet FOLLOW_IT_in_italicTextRule288 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule290 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IT_in_italicTextRule292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule349 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule351 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule365 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule367 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule381 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule383 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule397 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule399 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule413 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule415 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule429 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule431 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule443 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule445 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule460 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_nameRule_in_blockquoteRule462 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule464 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule479 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_olistRule481 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textListRule_in_olistRule483 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_olistRule485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_textRule_in_textListRule495 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CM_in_textListRule498 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_textListRule500 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule515 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_ulistRule517 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule519 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_ulistRule521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule534 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tlistRule536 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule538 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_tlistRule540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule553 = new BitSet(new long[]{0x1A8000043100DC80L,0x0000000000000038L});
	public static final BitSet FOLLOW_languageRule_in_blockCodeRule555 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_blockCodeRule558 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule604 = new BitSet(new long[]{0x1A8000043104DC80L});
	public static final BitSet FOLLOW_textRule_in_linkRule607 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule611 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule614 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_linkRule616 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_linkRule618 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EX_in_imageRule675 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LSB_in_imageRule677 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule679 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RSB_in_imageRule681 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_imageRule683 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule685 = new BitSet(new long[]{0x0000088000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule688 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_imageRule690 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule692 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule708 = new BitSet(new long[]{0x018000040000CC10L});
	public static final BitSet FOLLOW_textLinkRule_in_quickLinkRule710 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule726 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule728 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tableRule731 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule733 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_CM_in_tableRule736 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule738 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RP_in_tableRule742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule754 = new BitSet(new long[]{0x0000010040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule756 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_CM_in_talignmentRule759 = new BitSet(new long[]{0x0000010040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule761 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule797 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_trowRule799 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_CM_in_trowRule802 = new BitSet(new long[]{0x1A8000043100DC80L});
	public static final BitSet FOLLOW_textRule_in_trowRule804 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RSB_in_trowRule808 = new BitSet(new long[]{0x0000000000000002L});
}
