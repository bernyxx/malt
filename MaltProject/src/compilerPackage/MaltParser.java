// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-09-19 22:28:16

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BLOCKQUOTE", "BOLD", "C", 
		"CL", "CM", "CODE", "CODEBLOCK", "COMMENT", "DIGIT", "DO", "DOTCOM", "EQ", 
		"ESC_SEQ", "EX", "EXPONENT", "FLOAT", "GET", "HA", "HEX_DIGIT", "HL", 
		"HRULE", "HTTP", "HTTPS", "IMG", "INTEGER", "IT", "ITBOLD", "L", "LAB", 
		"LCB", "LET", "LETTER", "LP", "LSB", "OCTAL_ESC", "OLIST", "QU", "R", 
		"RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", 
		"S5TITLE", "SE", "SL", "ST", "STR", "STRING", "SUBS", "SUPS", "TABLE", 
		"TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int BLOCKQUOTE=5;
	public static final int BOLD=6;
	public static final int C=7;
	public static final int CL=8;
	public static final int CM=9;
	public static final int CODE=10;
	public static final int CODEBLOCK=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DO=14;
	public static final int DOTCOM=15;
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
	public static final int HTTP=26;
	public static final int HTTPS=27;
	public static final int IMG=28;
	public static final int INTEGER=29;
	public static final int IT=30;
	public static final int ITBOLD=31;
	public static final int L=32;
	public static final int LAB=33;
	public static final int LCB=34;
	public static final int LET=35;
	public static final int LETTER=36;
	public static final int LP=37;
	public static final int LSB=38;
	public static final int OCTAL_ESC=39;
	public static final int OLIST=40;
	public static final int QU=41;
	public static final int R=42;
	public static final int RAB=43;
	public static final int RCB=44;
	public static final int RP=45;
	public static final int RSB=46;
	public static final int S1TITLE=47;
	public static final int S2TITLE=48;
	public static final int S3TITLE=49;
	public static final int S4TITLE=50;
	public static final int S5TITLE=51;
	public static final int SE=52;
	public static final int SL=53;
	public static final int ST=54;
	public static final int STR=55;
	public static final int STRING=56;
	public static final int SUBS=57;
	public static final int SUPS=58;
	public static final int TABLE=59;
	public static final int TEXT=60;
	public static final int TITLE=61;
	public static final int TLIST=62;
	public static final int ULIST=63;
	public static final int UNICODE_ESC=64;
	public static final int US=65;
	public static final int VAR=66;
	public static final int WS=67;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }


		



	// $ANTLR start "parseJava"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule )+ ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=11;
				switch ( input.LA(1) ) {
				case S1TITLE:
				case S2TITLE:
				case S3TITLE:
				case S4TITLE:
				case S5TITLE:
				case TITLE:
					{
					alt1=1;
					}
					break;
				case TEXT:
					{
					alt1=2;
					}
					break;
				case BLOCKQUOTE:
					{
					alt1=3;
					}
					break;
				case OLIST:
					{
					alt1=4;
					}
					break;
				case ULIST:
					{
					alt1=5;
					}
					break;
				case TLIST:
					{
					alt1=6;
					}
					break;
				case CODEBLOCK:
					{
					alt1=7;
					}
					break;
				case HRULE:
					{
					alt1=8;
					}
					break;
				case TABLE:
					{
					alt1=9;
					}
					break;
				case IMG:
					{
					alt1=10;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:4: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_parseJava48);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:16: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_parseJava52);
					textDeclRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:31: blockquoteRule
					{
					pushFollow(FOLLOW_blockquoteRule_in_parseJava56);
					blockquoteRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:48: olistRule
					{
					pushFollow(FOLLOW_olistRule_in_parseJava60);
					olistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:60: ulistRule
					{
					pushFollow(FOLLOW_ulistRule_in_parseJava64);
					ulistRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:72: tlistRule
					{
					pushFollow(FOLLOW_tlistRule_in_parseJava68);
					tlistRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:84: codeBlockRule
					{
					pushFollow(FOLLOW_codeBlockRule_in_parseJava72);
					codeBlockRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:100: horizontalRule
					{
					pushFollow(FOLLOW_horizontalRule_in_parseJava76);
					horizontalRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:117: tableRule
					{
					pushFollow(FOLLOW_tableRule_in_parseJava80);
					tableRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:129: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_parseJava84);
					imageRule();
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



	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:1: titleRule : titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:2: ( titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:3: titleTypeRule VAR EQ ( subtextRule )+ ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule103);
			titleTypeRule();
			state._fsp--;

			match(input,VAR,FOLLOW_VAR_in_titleRule105); 
			match(input,EQ,FOLLOW_EQ_in_titleRule107); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:24: ( subtextRule )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==STRING) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:24: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_titleRule109);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:37: ( refRule )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LCB) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:37: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule112);
					refRule();
					state._fsp--;

					}
					break;

			}

			System.out.println("    - Ho riconosciuto un titolo");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule161); 
			match(input,HA,FOLLOW_HA_in_refRule163); 
			match(input,VAR,FOLLOW_VAR_in_refRule165); 
			match(input,RCB,FOLLOW_RCB_in_refRule167); 
			System.out.println("    - REF");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:1: textDeclRule : TEXT VAR EQ textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:2: ( TEXT VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:3: TEXT VAR EQ textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule185); 
			match(input,VAR,FOLLOW_VAR_in_textDeclRule187); 
			match(input,EQ,FOLLOW_EQ_in_textDeclRule189); 
			pushFollow(FOLLOW_textRule_in_textDeclRule191);
			textRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un testo");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:1: textRule : ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:2: ( ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=12;
				switch ( input.LA(1) ) {
				case STRING:
					{
					alt4=1;
					}
					break;
				case IT:
					{
					alt4=2;
					}
					break;
				case BOLD:
					{
					alt4=3;
					}
					break;
				case ITBOLD:
					{
					alt4=4;
					}
					break;
				case ST:
					{
					alt4=5;
					}
					break;
				case HL:
					{
					alt4=6;
					}
					break;
				case SUBS:
					{
					alt4=7;
					}
					break;
				case SUPS:
					{
					alt4=8;
					}
					break;
				case CODE:
					{
					alt4=9;
					}
					break;
				case LSB:
					{
					alt4=10;
					}
					break;
				case LAB:
					{
					alt4=11;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textRule208);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:5: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule214);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:5: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule220);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:5: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule226);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule232);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:5: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule238);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:5: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule244);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:5: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule250);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule256);
					codeTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:5: linkRule
					{
					pushFollow(FOLLOW_linkRule_in_textRule262);
					linkRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:5: quickLinkRule
					{
					pushFollow(FOLLOW_quickLinkRule_in_textRule268);
					quickLinkRule();
					state._fsp--;

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
	// $ANTLR end "textRule"



	// $ANTLR start "italicTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: italicTextRule : IT ( subtextRule )+ IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( IT ( subtextRule )+ IT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: IT ( subtextRule )+ IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule283); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:7: ( subtextRule )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==STRING) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:7: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_italicTextRule286);
					subtextRule();
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

			match(input,IT,FOLLOW_IT_in_italicTextRule289); 
			System.out.println("    - I");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:1: boldTextRule : BOLD ( subtextRule )+ BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:2: ( BOLD ( subtextRule )+ BOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:3: BOLD ( subtextRule )+ BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule306); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:8: ( subtextRule )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==STRING) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_boldTextRule308);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule311); 
			System.out.println("    - B");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:1: ibTextRule : ITBOLD ( subtextRule )+ ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:2: ( ITBOLD ( subtextRule )+ ITBOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:3: ITBOLD ( subtextRule )+ ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule327); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:10: ( subtextRule )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==STRING) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:10: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_ibTextRule329);
					subtextRule();
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

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule332); 
			System.out.println("    - IB");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:1: strikethroughtTextRule : ST ( subtextRule )+ ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:2: ( ST ( subtextRule )+ ST )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:3: ST ( subtextRule )+ ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule348); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:6: ( subtextRule )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==STRING) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule350);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule353); 
			System.out.println("    - ST");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:1: highlightTextRule : HL ( subtextRule )+ HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:2: ( HL ( subtextRule )+ HL )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:3: HL ( subtextRule )+ HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule369); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:6: ( subtextRule )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==STRING) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_highlightTextRule371);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,HL,FOLLOW_HL_in_highlightTextRule374); 
			System.out.println("    - HL");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:1: subscriptTextRule : SUBS ( subtextRule )+ SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:2: ( SUBS ( subtextRule )+ SUBS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:3: SUBS ( subtextRule )+ SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule390); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:8: ( subtextRule )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==STRING) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_subscriptTextRule392);
					subtextRule();
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

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule395); 
			System.out.println("    - SUBS");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:1: superscriptTextRule : SUPS ( subtextRule )+ SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:2: ( SUPS ( subtextRule )+ SUPS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:3: SUPS ( subtextRule )+ SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule411); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:8: ( subtextRule )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==STRING) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_superscriptTextRule413);
					subtextRule();
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

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule416); 
			System.out.println("    - SUPS");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:106:1: codeTextRule : CODE ( subtextRule )+ CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:2: ( CODE ( subtextRule )+ CODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:3: CODE ( subtextRule )+ CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule432); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:8: ( subtextRule )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==STRING) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_codeTextRule434);
					subtextRule();
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

			match(input,CODE,FOLLOW_CODE_in_codeTextRule437); 
			System.out.println("    - CODE");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:1: subtextRule : STRING ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_subtextRule454); 
			System.out.println("    - SUBTEXT");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:1: blockquoteRule : BLOCKQUOTE VAR EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:2: ( BLOCKQUOTE VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:3: BLOCKQUOTE VAR EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule471); 
			match(input,VAR,FOLLOW_VAR_in_blockquoteRule473); 
			match(input,EQ,FOLLOW_EQ_in_blockquoteRule475); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule477);
			textRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un BLOCKQUOTE");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:1: olistRule : OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:2: ( OLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:3: OLIST textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule494); 
			pushFollow(FOLLOW_textListRule_in_olistRule496);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un OLIST");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule510); 
			match(input,STRING,FOLLOW_STRING_in_textListRule512); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:14: ( CM STRING )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule515); 
					match(input,STRING,FOLLOW_STRING_in_textListRule517); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule521); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:1: ulistRule : ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:2: ( ULIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:3: ULIST textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule534); 
			pushFollow(FOLLOW_textListRule_in_ulistRule536);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un ULIST");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:1: tlistRule : TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:2: ( TLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:3: TLIST textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule553); 
			pushFollow(FOLLOW_textListRule_in_tlistRule555);
			textListRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un TLIST");
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



	// $ANTLR start "codeBlockRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:1: codeBlockRule : CODEBLOCK ( STR )? VAR EQ textRule ;
	public final void codeBlockRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:2: ( CODEBLOCK ( STR )? VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:3: CODEBLOCK ( STR )? VAR EQ textRule
			{
			match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule572); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:13: ( STR )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==STR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:13: STR
					{
					match(input,STR,FOLLOW_STR_in_codeBlockRule574); 
					}
					break;

			}

			match(input,VAR,FOLLOW_VAR_in_codeBlockRule577); 
			match(input,EQ,FOLLOW_EQ_in_codeBlockRule579); 
			pushFollow(FOLLOW_textRule_in_codeBlockRule581);
			textRule();
			state._fsp--;

			System.out.println("    - Ho riconosciuto un BLOCKCODE");
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
	// $ANTLR end "codeBlockRule"



	// $ANTLR start "horizontalRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule597); 
			System.out.println("    - Ho riconosciuto un HORIZ");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: linkRule : LSB ( textRule | imageRule ) RSB LP STR RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: ( LSB ( textRule | imageRule ) RSB LP STR RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: LSB ( textRule | imageRule ) RSB LP STR RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule613); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:7: ( textRule | imageRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BOLD||LA15_0==CODE||LA15_0==HL||(LA15_0 >= IT && LA15_0 <= ITBOLD)||LA15_0==LAB||LA15_0==LSB||LA15_0==ST||(LA15_0 >= STRING && LA15_0 <= SUPS)) ) {
				alt15=1;
			}
			else if ( (LA15_0==IMG) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule616);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule620);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule623); 
			match(input,LP,FOLLOW_LP_in_linkRule625); 
			match(input,STR,FOLLOW_STR_in_linkRule627); 
			match(input,RP,FOLLOW_RP_in_linkRule629); 
			System.out.println("    - Ho riconosciuto un link");
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



	// $ANTLR start "imageRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: imageRule : IMG VAR EQ LP STR ( CM STR )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: ( IMG VAR EQ LP STR ( CM STR )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: IMG VAR EQ LP STR ( CM STR )? RP
			{
			match(input,IMG,FOLLOW_IMG_in_imageRule645); 
			match(input,VAR,FOLLOW_VAR_in_imageRule647); 
			match(input,EQ,FOLLOW_EQ_in_imageRule649); 
			match(input,LP,FOLLOW_LP_in_imageRule651); 
			match(input,STR,FOLLOW_STR_in_imageRule653); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:21: ( CM STR )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CM) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:22: CM STR
					{
					match(input,CM,FOLLOW_CM_in_imageRule656); 
					match(input,STR,FOLLOW_STR_in_imageRule658); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule662); 
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
	}
	// $ANTLR end "imageRule"



	// $ANTLR start "quickLinkRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:1: quickLinkRule : LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:2: ( LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule680); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:7: ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= HTTP && LA20_0 <= HTTPS)) ) {
				alt20=1;
			}
			else if ( (LA20_0==STRING) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:9: ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM
					{
					if ( (input.LA(1) >= HTTP && input.LA(1) <= HTTPS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:24: ( subtextRule )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==STRING) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:24: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule692);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule695); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:48: ( subtextRule )+ AT ( subtextRule )+ DOTCOM
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:48: ( subtextRule )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==STRING) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:48: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule701);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input,AT,FOLLOW_AT_in_quickLinkRule704); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:64: ( subtextRule )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==STRING) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:64: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule706);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule709); 
					}

					}
					break;

			}

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule713); 
			System.out.println("    - Ho riconosciuto un quicklink");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule731); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:9: ( talignmentRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LSB) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule733);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule736); 
			pushFollow(FOLLOW_trowRule_in_tableRule738);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:37: ( CM trowRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CM) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule741); 
					pushFollow(FOLLOW_trowRule_in_tableRule743);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule747); 
			System.out.println("    - Ho riconosciuto una tabella");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule763); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule765);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:17: ( CM alignRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule768); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule770);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule774); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:2: ( L | C | R )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule806); 
			match(input,STRING,FOLLOW_STRING_in_trowRule808); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:14: ( CM STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule811); 
					match(input,STRING,FOLLOW_STRING_in_trowRule813); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule817); 
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



	public static final BitSet FOLLOW_titleRule_in_parseJava48 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_textDeclRule_in_parseJava52 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_blockquoteRule_in_parseJava56 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_olistRule_in_parseJava60 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_ulistRule_in_parseJava64 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_tlistRule_in_parseJava68 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_codeBlockRule_in_parseJava72 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_horizontalRule_in_parseJava76 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_tableRule_in_parseJava80 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_imageRule_in_parseJava84 = new BitSet(new long[]{0xF80F810012000822L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_titleRule105 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule107 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_titleRule109 = new BitSet(new long[]{0x0100000400000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule161 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_HA_in_refRule163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_refRule165 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule187 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule189 = new BitSet(new long[]{0x07400042C1000440L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule208 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule214 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule220 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule226 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule232 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule238 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule244 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule250 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule256 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_linkRule_in_textRule262 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_quickLinkRule_in_textRule268 = new BitSet(new long[]{0x07400042C1000442L});
	public static final BitSet FOLLOW_IT_in_italicTextRule283 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule286 = new BitSet(new long[]{0x0100000040000000L});
	public static final BitSet FOLLOW_IT_in_italicTextRule289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule306 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule308 = new BitSet(new long[]{0x0100000000000040L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule327 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule329 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule348 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule350 = new BitSet(new long[]{0x0140000000000000L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule369 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule371 = new BitSet(new long[]{0x0100000001000000L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule390 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule392 = new BitSet(new long[]{0x0300000000000000L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule411 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule413 = new BitSet(new long[]{0x0500000000000000L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule432 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule434 = new BitSet(new long[]{0x0100000000000400L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_subtextRule454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule473 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule475 = new BitSet(new long[]{0x07400042C1000440L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule494 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule510 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule512 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule515 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule517 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule534 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule553 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule572 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_codeBlockRule574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule577 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule579 = new BitSet(new long[]{0x07400042C1000440L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule613 = new BitSet(new long[]{0x07400042D1000440L});
	public static final BitSet FOLLOW_textRule_in_linkRule616 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule620 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule623 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule625 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_STR_in_linkRule627 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_imageRule647 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_imageRule649 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule651 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_STR_in_imageRule653 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule656 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_STR_in_imageRule658 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule680 = new BitSet(new long[]{0x010000000C000000L});
	public static final BitSet FOLLOW_set_in_quickLinkRule684 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule692 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule695 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule701 = new BitSet(new long[]{0x0100000000000010L});
	public static final BitSet FOLLOW_AT_in_quickLinkRule704 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule706 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule709 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule731 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule733 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule736 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule738 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule741 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule743 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule763 = new BitSet(new long[]{0x0000040100000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule765 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule768 = new BitSet(new long[]{0x0000040100000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule770 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule806 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule808 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule811 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule813 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule817 = new BitSet(new long[]{0x0000000000000002L});
}
