// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-09 16:38:41

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
		"LCB", "LET", "LETTER", "LINK", "LP", "LSB", "OCTAL_ESC", "OLIST", "QU", 
		"R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", 
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
	public static final int LINK=37;
	public static final int LP=38;
	public static final int LSB=39;
	public static final int OCTAL_ESC=40;
	public static final int OLIST=41;
	public static final int QU=42;
	public static final int R=43;
	public static final int RAB=44;
	public static final int RCB=45;
	public static final int RP=46;
	public static final int RSB=47;
	public static final int S1TITLE=48;
	public static final int S2TITLE=49;
	public static final int S3TITLE=50;
	public static final int S4TITLE=51;
	public static final int S5TITLE=52;
	public static final int SE=53;
	public static final int SL=54;
	public static final int ST=55;
	public static final int STR=56;
	public static final int STRING=57;
	public static final int SUBS=58;
	public static final int SUPS=59;
	public static final int TABLE=60;
	public static final int TEXT=61;
	public static final int TITLE=62;
	public static final int TLIST=63;
	public static final int ULIST=64;
	public static final int UNICODE_ESC=65;
	public static final int US=66;
	public static final int VAR=67;
	public static final int WS=68;

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
	@Override public String getGrammarFileName() { return "D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }


		



	// $ANTLR start "parseJava"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : ( instrRule )+ ;
	public final void parseJava() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( ( instrRule )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BLOCKQUOTE||LA1_0==CODEBLOCK||LA1_0==HRULE||LA1_0==IMG||LA1_0==OLIST||(LA1_0 >= S1TITLE && LA1_0 <= S5TITLE)||(LA1_0 >= TABLE && LA1_0 <= ULIST)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:4: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_parseJava48);
					instrRule();
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



	// $ANTLR start "instrRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:1: instrRule : ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule ) SE ;
	public final void instrRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:2: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule ) SE
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule )
			int alt2=10;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt2=1;
				}
				break;
			case TEXT:
				{
				alt2=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt2=3;
				}
				break;
			case OLIST:
				{
				alt2=4;
				}
				break;
			case ULIST:
				{
				alt2=5;
				}
				break;
			case TLIST:
				{
				alt2=6;
				}
				break;
			case CODEBLOCK:
				{
				alt2=7;
				}
				break;
			case HRULE:
				{
				alt2=8;
				}
				break;
			case TABLE:
				{
				alt2=9;
				}
				break;
			case IMG:
				{
				alt2=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:5: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_instrRule65);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:17: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_instrRule69);
					textDeclRule();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:32: blockquoteRule
					{
					pushFollow(FOLLOW_blockquoteRule_in_instrRule73);
					blockquoteRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:49: olistRule
					{
					pushFollow(FOLLOW_olistRule_in_instrRule77);
					olistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:61: ulistRule
					{
					pushFollow(FOLLOW_ulistRule_in_instrRule81);
					ulistRule();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:73: tlistRule
					{
					pushFollow(FOLLOW_tlistRule_in_instrRule85);
					tlistRule();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:85: codeBlockRule
					{
					pushFollow(FOLLOW_codeBlockRule_in_instrRule89);
					codeBlockRule();
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:101: horizontalRule
					{
					pushFollow(FOLLOW_horizontalRule_in_instrRule93);
					horizontalRule();
					state._fsp--;

					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:118: tableRule
					{
					pushFollow(FOLLOW_tableRule_in_instrRule97);
					tableRule();
					state._fsp--;

					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:130: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_instrRule101);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_instrRule104); 
			System.out.println("    - Ho riconosciuto un'istruzione");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instrRule"



	// $ANTLR start "titleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:30:1: titleRule : titleTypeRule ( VAR EQ )? subtextRule ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:2: ( titleTypeRule ( VAR EQ )? subtextRule ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:3: titleTypeRule ( VAR EQ )? subtextRule ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule123);
			titleTypeRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:17: ( VAR EQ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:18: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_titleRule126); 
					match(input,EQ,FOLLOW_EQ_in_titleRule128); 
					}
					break;

			}

			pushFollow(FOLLOW_subtextRule_in_titleRule132);
			subtextRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:39: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:39: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule134);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule183); 
			match(input,HA,FOLLOW_HA_in_refRule185); 
			match(input,VAR,FOLLOW_VAR_in_refRule187); 
			match(input,RCB,FOLLOW_RCB_in_refRule189); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:1: textDeclRule : TEXT ( VAR EQ )? textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:2: ( TEXT ( VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:3: TEXT ( VAR EQ )? textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule207); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:8: ( VAR EQ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_textDeclRule210); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule212); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule216);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: textRule : ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule ) ;
	public final void textRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: ( ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )
			int alt6=11;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt6=1;
				}
				break;
			case IT:
				{
				alt6=2;
				}
				break;
			case BOLD:
				{
				alt6=3;
				}
				break;
			case ITBOLD:
				{
				alt6=4;
				}
				break;
			case ST:
				{
				alt6=5;
				}
				break;
			case HL:
				{
				alt6=6;
				}
				break;
			case SUBS:
				{
				alt6=7;
				}
				break;
			case SUPS:
				{
				alt6=8;
				}
				break;
			case CODE:
				{
				alt6=9;
				}
				break;
			case LINK:
				{
				alt6=10;
				}
				break;
			case LAB:
				{
				alt6=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textRule233);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:5: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule239);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:5: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule245);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:5: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule251);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule257);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:5: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule263);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:5: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule269);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:5: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule275);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule281);
					codeTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:5: linkRule
					{
					pushFollow(FOLLOW_linkRule_in_textRule287);
					linkRule();
					state._fsp--;

					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:5: quickLinkRule
					{
					pushFollow(FOLLOW_quickLinkRule_in_textRule293);
					quickLinkRule();
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
	// $ANTLR end "textRule"



	// $ANTLR start "italicTextRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:1: italicTextRule : IT subtextRule IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:2: ( IT subtextRule IT )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:3: IT subtextRule IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule307); 
			pushFollow(FOLLOW_subtextRule_in_italicTextRule310);
			subtextRule();
			state._fsp--;

			match(input,IT,FOLLOW_IT_in_italicTextRule312); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:1: boldTextRule : BOLD subtextRule BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:2: ( BOLD subtextRule BOLD )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:3: BOLD subtextRule BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule329); 
			pushFollow(FOLLOW_subtextRule_in_boldTextRule331);
			subtextRule();
			state._fsp--;

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule333); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:1: ibTextRule : ITBOLD subtextRule ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:2: ( ITBOLD subtextRule ITBOLD )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:3: ITBOLD subtextRule ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule349); 
			pushFollow(FOLLOW_subtextRule_in_ibTextRule351);
			subtextRule();
			state._fsp--;

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule353); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:1: strikethroughtTextRule : ST subtextRule ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:2: ( ST subtextRule ST )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:3: ST subtextRule ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule369); 
			pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule371);
			subtextRule();
			state._fsp--;

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule373); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:93:1: highlightTextRule : HL subtextRule HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:2: ( HL subtextRule HL )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:3: HL subtextRule HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule389); 
			pushFollow(FOLLOW_subtextRule_in_highlightTextRule391);
			subtextRule();
			state._fsp--;

			match(input,HL,FOLLOW_HL_in_highlightTextRule393); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:1: subscriptTextRule : SUBS subtextRule SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:2: ( SUBS subtextRule SUBS )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:3: SUBS subtextRule SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule409); 
			pushFollow(FOLLOW_subtextRule_in_subscriptTextRule411);
			subtextRule();
			state._fsp--;

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule413); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:105:1: superscriptTextRule : SUPS subtextRule SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:106:2: ( SUPS subtextRule SUPS )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:3: SUPS subtextRule SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule429); 
			pushFollow(FOLLOW_subtextRule_in_superscriptTextRule431);
			subtextRule();
			state._fsp--;

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule433); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:111:1: codeTextRule : CODE subtextRule CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:2: ( CODE subtextRule CODE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:3: CODE subtextRule CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule449); 
			pushFollow(FOLLOW_subtextRule_in_codeTextRule451);
			subtextRule();
			state._fsp--;

			match(input,CODE,FOLLOW_CODE_in_codeTextRule453); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:1: subtextRule : STRING ;
	public final void subtextRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:2: ( STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_subtextRule470); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:123:1: blockquoteRule : BLOCKQUOTE ( VAR EQ )? textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:2: ( BLOCKQUOTE ( VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:3: BLOCKQUOTE ( VAR EQ )? textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule487); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:14: ( VAR EQ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:15: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_blockquoteRule490); 
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule492); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule496);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:1: olistRule : OLIST ( VAR EQ )? textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:2: ( OLIST ( VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:3: OLIST ( VAR EQ )? textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule513); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:9: ( VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_olistRule516); 
					match(input,EQ,FOLLOW_EQ_in_olistRule518); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule522);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:2: ( LP STRING ( CM STRING )+ RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule536); 
			match(input,STRING,FOLLOW_STRING_in_textListRule538); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:14: ( CM STRING )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CM) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule541); 
					match(input,STRING,FOLLOW_STRING_in_textListRule543); 
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule547); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:1: ulistRule : ULIST ( VAR EQ )? textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:2: ( ULIST ( VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:3: ULIST ( VAR EQ )? textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule560); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:9: ( VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_ulistRule563); 
					match(input,EQ,FOLLOW_EQ_in_ulistRule565); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule569);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:1: tlistRule : TLIST ( VAR EQ )? textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:2: ( TLIST ( VAR EQ )? textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:3: TLIST ( VAR EQ )? textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule586); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:9: ( VAR EQ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tlistRule589); 
					match(input,EQ,FOLLOW_EQ_in_tlistRule591); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule595);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:151:1: codeBlockRule : CODEBLOCK ( STR )? ( VAR EQ )? textRule ;
	public final void codeBlockRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:2: ( CODEBLOCK ( STR )? ( VAR EQ )? textRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:3: CODEBLOCK ( STR )? ( VAR EQ )? textRule
			{
			match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule612); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:13: ( STR )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==STR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:13: STR
					{
					match(input,STR,FOLLOW_STR_in_codeBlockRule614); 
					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:18: ( VAR EQ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:19: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_codeBlockRule618); 
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule620); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule624);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule640); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:1: linkRule : LINK ( VAR EQ )? LP ( textRule | imageRule ) CM STR RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:2: ( LINK ( VAR EQ )? LP ( textRule | imageRule ) CM STR RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:3: LINK ( VAR EQ )? LP ( textRule | imageRule ) CM STR RP
			{
			match(input,LINK,FOLLOW_LINK_in_linkRule656); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:8: ( VAR EQ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_linkRule659); 
					match(input,EQ,FOLLOW_EQ_in_linkRule661); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule665); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:21: ( textRule | imageRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BOLD||LA15_0==CODE||LA15_0==HL||(LA15_0 >= IT && LA15_0 <= ITBOLD)||LA15_0==LAB||LA15_0==LINK||LA15_0==ST||(LA15_0 >= STRING && LA15_0 <= SUPS)) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:22: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule668);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:33: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule672);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule675); 
			match(input,STR,FOLLOW_STR_in_linkRule677); 
			match(input,RP,FOLLOW_RP_in_linkRule679); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:1: imageRule : IMG ( VAR EQ )? LP STR ( CM STR )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:2: ( IMG ( VAR EQ )? LP STR ( CM STR )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:3: IMG ( VAR EQ )? LP STR ( CM STR )? RP
			{
			match(input,IMG,FOLLOW_IMG_in_imageRule695); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:7: ( VAR EQ )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==VAR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:8: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_imageRule698); 
					match(input,EQ,FOLLOW_EQ_in_imageRule700); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule704); 
			match(input,STR,FOLLOW_STR_in_imageRule706); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:24: ( CM STR )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CM) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:25: CM STR
					{
					match(input,CM,FOLLOW_CM_in_imageRule709); 
					match(input,STR,FOLLOW_STR_in_imageRule711); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule715); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:1: quickLinkRule : LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:2: ( LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:3: LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule732); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:7: ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= HTTP && LA19_0 <= HTTPS)) ) {
				alt19=1;
			}
			else if ( (LA19_0==STRING) ) {
				int LA19_2 = input.LA(2);
				if ( (LA19_2==DOTCOM) ) {
					alt19=1;
				}
				else if ( (LA19_2==AT) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:8: ( ( HTTP | HTTPS )? subtextRule DOTCOM )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:8: ( ( HTTP | HTTPS )? subtextRule DOTCOM )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:9: ( HTTP | HTTPS )? subtextRule DOTCOM
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:9: ( HTTP | HTTPS )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= HTTP && LA18_0 <= HTTPS)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= HTTP && input.LA(1) <= HTTPS) ) {
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

					pushFollow(FOLLOW_subtextRule_in_quickLinkRule745);
					subtextRule();
					state._fsp--;

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule747); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:47: ( subtextRule AT subtextRule DOTCOM )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:47: ( subtextRule AT subtextRule DOTCOM )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:48: subtextRule AT subtextRule DOTCOM
					{
					pushFollow(FOLLOW_subtextRule_in_quickLinkRule753);
					subtextRule();
					state._fsp--;

					match(input,AT,FOLLOW_AT_in_quickLinkRule755); 
					pushFollow(FOLLOW_subtextRule_in_quickLinkRule757);
					subtextRule();
					state._fsp--;

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule759); 
					}

					}
					break;

			}

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule763); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:1: tableRule : TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:2: ( TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:3: TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule781); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:9: ( VAR EQ )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tableRule784); 
					match(input,EQ,FOLLOW_EQ_in_tableRule786); 
					}
					break;

			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:19: ( talignmentRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LSB) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:19: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule790);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule793); 
			pushFollow(FOLLOW_trowRule_in_tableRule795);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:47: ( CM trowRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CM) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:48: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule798); 
					pushFollow(FOLLOW_trowRule_in_tableRule800);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule804); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:2: ( LSB alignRule ( CM alignRule )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule820); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule822);
			alignRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:17: ( CM alignRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule825); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule827);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule831); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:2: ( L | C | R )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:2: ( LSB STRING ( CM STRING )* RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule863); 
			match(input,STRING,FOLLOW_STRING_in_trowRule865); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:14: ( CM STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule868); 
					match(input,STRING,FOLLOW_STRING_in_trowRule870); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule874); 
			}

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



	public static final BitSet FOLLOW_instrRule_in_parseJava48 = new BitSet(new long[]{0xF01F020012000822L,0x0000000000000001L});
	public static final BitSet FOLLOW_titleRule_in_instrRule65 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule69 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule73 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule77 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule81 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule85 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule89 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule93 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule97 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule101 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule123 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_titleRule126 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule128 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_titleRule132 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule183 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_HA_in_refRule185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_refRule187 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule207 = new BitSet(new long[]{0x0E800022C1000440L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule210 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule212 = new BitSet(new long[]{0x0E800022C1000440L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_linkRule_in_textRule287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quickLinkRule_in_textRule293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IT_in_italicTextRule307 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule310 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IT_in_italicTextRule312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule329 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule331 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule349 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule351 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule369 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule371 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule389 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule391 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule409 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule411 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule429 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule431 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule449 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule451 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_subtextRule470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule487 = new BitSet(new long[]{0x0E800022C1000440L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule490 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule492 = new BitSet(new long[]{0x0E800022C1000440L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule513 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_olistRule516 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_olistRule518 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule536 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule538 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule541 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule543 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule560 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_ulistRule563 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule565 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule586 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_tlistRule589 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule591 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule612 = new BitSet(new long[]{0x0F800022C1000440L,0x0000000000000008L});
	public static final BitSet FOLLOW_STR_in_codeBlockRule614 = new BitSet(new long[]{0x0E800022C1000440L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule618 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule620 = new BitSet(new long[]{0x0E800022C1000440L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule656 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_linkRule659 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_linkRule661 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule665 = new BitSet(new long[]{0x0E800022D1000440L});
	public static final BitSet FOLLOW_textRule_in_linkRule668 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule672 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule675 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STR_in_linkRule677 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule695 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_imageRule698 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_imageRule700 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule704 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STR_in_imageRule706 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule709 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_STR_in_imageRule711 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule732 = new BitSet(new long[]{0x020000000C000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule745 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule747 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule753 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AT_in_quickLinkRule755 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule757 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule759 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule781 = new BitSet(new long[]{0x000000C000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_tableRule784 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_tableRule786 = new BitSet(new long[]{0x000000C000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule790 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule793 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule795 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule798 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule800 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule820 = new BitSet(new long[]{0x0000080100000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule822 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule825 = new BitSet(new long[]{0x0000080100000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule827 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule863 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule865 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule868 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule870 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule874 = new BitSet(new long[]{0x0000000000000002L});
}
