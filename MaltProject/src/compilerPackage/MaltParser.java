// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-10 00:02:45

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
		"ESC_SEQ", "EX", "EXPONENT", "FLOAT", "FORMATTEXT", "G", "GET", "HA", 
		"HEX_DIGIT", "HL", "HRULE", "HTTP", "HTTPS", "I", "IMG", "INTEGER", "IT", 
		"ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", "LINK", "LP", "LSB", "OCTAL_ESC", 
		"OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", 
		"S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", 
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
	public static final int FORMATTEXT=21;
	public static final int G=22;
	public static final int GET=23;
	public static final int HA=24;
	public static final int HEX_DIGIT=25;
	public static final int HL=26;
	public static final int HRULE=27;
	public static final int HTTP=28;
	public static final int HTTPS=29;
	public static final int I=30;
	public static final int IMG=31;
	public static final int INTEGER=32;
	public static final int IT=33;
	public static final int ITBOLD=34;
	public static final int L=35;
	public static final int LAB=36;
	public static final int LCB=37;
	public static final int LET=38;
	public static final int LETTER=39;
	public static final int LINK=40;
	public static final int LP=41;
	public static final int LSB=42;
	public static final int OCTAL_ESC=43;
	public static final int OLIST=44;
	public static final int QU=45;
	public static final int R=46;
	public static final int RAB=47;
	public static final int RCB=48;
	public static final int RP=49;
	public static final int RSB=50;
	public static final int S1TITLE=51;
	public static final int S2TITLE=52;
	public static final int S3TITLE=53;
	public static final int S4TITLE=54;
	public static final int S5TITLE=55;
	public static final int SE=56;
	public static final int SL=57;
	public static final int ST=58;
	public static final int STRING=59;
	public static final int SUBS=60;
	public static final int SUPS=61;
	public static final int TABLE=62;
	public static final int TEXT=63;
	public static final int TITLE=64;
	public static final int TLIST=65;
	public static final int ULIST=66;
	public static final int UNICODE_ESC=67;
	public static final int US=68;
	public static final int VAR=69;
	public static final int WS=70;

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : ( instrRule )+ ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( ( instrRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BLOCKQUOTE||LA1_0==CODEBLOCK||LA1_0==FORMATTEXT||LA1_0==HRULE||LA1_0==IMG||LA1_0==LAB||LA1_0==LINK||LA1_0==OLIST||(LA1_0 >= S1TITLE && LA1_0 <= S5TITLE)||(LA1_0 >= TABLE && LA1_0 <= ULIST)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:4: instrRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:1: instrRule : ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE ;
	public final void instrRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:2: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:4: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:4: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule )
			int alt2=13;
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
			case LINK:
				{
				alt2=11;
				}
				break;
			case LAB:
				{
				alt2=12;
				}
				break;
			case FORMATTEXT:
				{
				alt2=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:5: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_instrRule68);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:5: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_instrRule74);
					textDeclRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:5: blockquoteRule
					{
					pushFollow(FOLLOW_blockquoteRule_in_instrRule80);
					blockquoteRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:30:5: olistRule
					{
					pushFollow(FOLLOW_olistRule_in_instrRule86);
					olistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:5: ulistRule
					{
					pushFollow(FOLLOW_ulistRule_in_instrRule92);
					ulistRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:5: tlistRule
					{
					pushFollow(FOLLOW_tlistRule_in_instrRule98);
					tlistRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: codeBlockRule
					{
					pushFollow(FOLLOW_codeBlockRule_in_instrRule104);
					codeBlockRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: horizontalRule
					{
					pushFollow(FOLLOW_horizontalRule_in_instrRule110);
					horizontalRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: tableRule
					{
					pushFollow(FOLLOW_tableRule_in_instrRule116);
					tableRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_instrRule122);
					imageRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: linkRule
					{
					pushFollow(FOLLOW_linkRule_in_instrRule128);
					linkRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: quickLinkRule
					{
					pushFollow(FOLLOW_quickLinkRule_in_instrRule134);
					quickLinkRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: formatTextRule
					{
					pushFollow(FOLLOW_formatTextRule_in_instrRule146);
					formatTextRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_instrRule152); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:1: titleRule : titleTypeRule ( VAR EQ )? subtextRule ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:2: ( titleTypeRule ( VAR EQ )? subtextRule ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:3: titleTypeRule ( VAR EQ )? subtextRule ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule171);
			titleTypeRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:17: ( VAR EQ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:18: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_titleRule174); 
					match(input,EQ,FOLLOW_EQ_in_titleRule176); 
					}
					break;

			}

			pushFollow(FOLLOW_subtextRule_in_titleRule180);
			subtextRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:39: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:39: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule182);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule231); 
			match(input,HA,FOLLOW_HA_in_refRule233); 
			match(input,VAR,FOLLOW_VAR_in_refRule235); 
			match(input,RCB,FOLLOW_RCB_in_refRule237); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: textDeclRule : TEXT ( VAR EQ )? textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( TEXT ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: TEXT ( VAR EQ )? textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule255); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:8: ( VAR EQ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_textDeclRule258); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule260); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule264);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:1: textRule : subtextRule ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:2: ( subtextRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:3: subtextRule
			{
			pushFollow(FOLLOW_subtextRule_in_textRule283);
			subtextRule();
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
	// $ANTLR end "textRule"



	// $ANTLR start "subtextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:1: subtextRule : STRING ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_subtextRule414); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:1: blockquoteRule : BLOCKQUOTE ( VAR EQ )? textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:2: ( BLOCKQUOTE ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:3: BLOCKQUOTE ( VAR EQ )? textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule431); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:14: ( VAR EQ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:15: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_blockquoteRule434); 
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule436); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule440);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:1: olistRule : OLIST ( VAR EQ )? textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:2: ( OLIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:3: OLIST ( VAR EQ )? textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule457); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:9: ( VAR EQ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_olistRule460); 
					match(input,EQ,FOLLOW_EQ_in_olistRule462); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule466);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule480); 
			match(input,STRING,FOLLOW_STRING_in_textListRule482); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:14: ( CM STRING )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==CM) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule485); 
					match(input,STRING,FOLLOW_STRING_in_textListRule487); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule491); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:1: ulistRule : ULIST ( VAR EQ )? textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:2: ( ULIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:3: ULIST ( VAR EQ )? textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule504); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:9: ( VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_ulistRule507); 
					match(input,EQ,FOLLOW_EQ_in_ulistRule509); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule513);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:1: tlistRule : TLIST ( VAR EQ )? textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:2: ( TLIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:3: TLIST ( VAR EQ )? textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule530); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:9: ( VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tlistRule533); 
					match(input,EQ,FOLLOW_EQ_in_tlistRule535); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule539);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:1: codeBlockRule : CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule ;
	public final void codeBlockRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:2: ( CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:3: CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule
			{
			match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule556); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:13: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==LP) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:14: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_codeBlockRule559); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:17: (~ ( LP | RP | '\"' ) )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= AT && LA11_0 <= LINK)||(LA11_0 >= LSB && LA11_0 <= OLIST)||(LA11_0 >= R && LA11_0 <= RCB)||(LA11_0 >= RSB && LA11_0 <= WS)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= AT && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
							break loop11;
						}
					}

					match(input,RP,FOLLOW_RP_in_codeBlockRule577); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:42: ( VAR EQ )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:43: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_codeBlockRule582); 
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule584); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule588);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule604); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:1: linkRule : LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:2: ( LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:3: LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP
			{
			match(input,LINK,FOLLOW_LINK_in_linkRule620); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:8: ( VAR EQ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_linkRule623); 
					match(input,EQ,FOLLOW_EQ_in_linkRule625); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule629); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:21: ( textRule | imageRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==STRING) ) {
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:22: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule632);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:33: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule636);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule639); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:47: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:48: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_linkRule642); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:51: (~ ( LP | RP | '\"' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= AT && LA16_0 <= LINK)||(LA16_0 >= LSB && LA16_0 <= OLIST)||(LA16_0 >= R && LA16_0 <= RCB)||(LA16_0 >= RSB && LA16_0 <= WS)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= AT && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
					break loop16;
				}
			}

			match(input,RP,FOLLOW_RP_in_linkRule660); 
			}

			match(input,RP,FOLLOW_RP_in_linkRule663); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:1: imageRule : IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:2: ( IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:3: IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP
			{
			match(input,IMG,FOLLOW_IMG_in_imageRule679); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:7: ( VAR EQ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==VAR) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:8: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_imageRule682); 
					match(input,EQ,FOLLOW_EQ_in_imageRule684); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule688); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:20: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:21: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_imageRule691); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:24: (~ ( LP | RP | '\"' ) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= AT && LA18_0 <= LINK)||(LA18_0 >= LSB && LA18_0 <= OLIST)||(LA18_0 >= R && LA18_0 <= RCB)||(LA18_0 >= RSB && LA18_0 <= WS)) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= AT && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
					break loop18;
				}
			}

			match(input,RP,FOLLOW_RP_in_imageRule709); 
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:48: ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CM) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:49: CM ( LP (~ ( LP | RP | '\"' ) )* RP )
					{
					match(input,CM,FOLLOW_CM_in_imageRule713); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:52: ( LP (~ ( LP | RP | '\"' ) )* RP )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:53: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_imageRule716); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:56: (~ ( LP | RP | '\"' ) )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= AT && LA19_0 <= LINK)||(LA19_0 >= LSB && LA19_0 <= OLIST)||(LA19_0 >= R && LA19_0 <= RCB)||(LA19_0 >= RSB && LA19_0 <= WS)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= AT && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
							break loop19;
						}
					}

					match(input,RP,FOLLOW_RP_in_imageRule734); 
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule739); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:1: quickLinkRule : LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:2: ( LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:3: LAB ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) ) RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule756); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:7: ( ( ( HTTP | HTTPS )? subtextRule DOTCOM ) | ( subtextRule AT subtextRule DOTCOM ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= HTTP && LA22_0 <= HTTPS)) ) {
				alt22=1;
			}
			else if ( (LA22_0==STRING) ) {
				int LA22_2 = input.LA(2);
				if ( (LA22_2==DOTCOM) ) {
					alt22=1;
				}
				else if ( (LA22_2==AT) ) {
					alt22=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:8: ( ( HTTP | HTTPS )? subtextRule DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:8: ( ( HTTP | HTTPS )? subtextRule DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:9: ( HTTP | HTTPS )? subtextRule DOTCOM
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:9: ( HTTP | HTTPS )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( ((LA21_0 >= HTTP && LA21_0 <= HTTPS)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					pushFollow(FOLLOW_subtextRule_in_quickLinkRule769);
					subtextRule();
					state._fsp--;

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule771); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:47: ( subtextRule AT subtextRule DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:47: ( subtextRule AT subtextRule DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:48: subtextRule AT subtextRule DOTCOM
					{
					pushFollow(FOLLOW_subtextRule_in_quickLinkRule777);
					subtextRule();
					state._fsp--;

					match(input,AT,FOLLOW_AT_in_quickLinkRule779); 
					pushFollow(FOLLOW_subtextRule_in_quickLinkRule781);
					subtextRule();
					state._fsp--;

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule783); 
					}

					}
					break;

			}

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule787); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:1: tableRule : TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:2: ( TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:3: TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule805); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:9: ( VAR EQ )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==VAR) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tableRule808); 
					match(input,EQ,FOLLOW_EQ_in_tableRule810); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:19: ( talignmentRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LSB) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:19: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule814);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule817); 
			pushFollow(FOLLOW_trowRule_in_tableRule819);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:47: ( CM trowRule )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:48: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule822); 
					pushFollow(FOLLOW_trowRule_in_tableRule824);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule828); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule844); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule846);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:17: ( CM alignRule )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CM) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule849); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule851);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop26;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule855); 
			System.out.println("    - Ho riconosciuto talign");
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule891); 
			match(input,STRING,FOLLOW_STRING_in_trowRule893); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:14: ( CM STRING )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CM) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule896); 
					match(input,STRING,FOLLOW_STRING_in_trowRule898); 
					}
					break;

				default :
					break loop27;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule902); 
			System.out.println("    - Ho riconosciuto trow");
			}

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



	// $ANTLR start "formatTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:1: formatTextRule : FORMATTEXT ( VAR EQ )? STRING ;
	public final void formatTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:2: ( FORMATTEXT ( VAR EQ )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:3: FORMATTEXT ( VAR EQ )? STRING
			{
			match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule922); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:14: ( VAR EQ )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==VAR) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:15: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_formatTextRule925); 
					match(input,EQ,FOLLOW_EQ_in_formatTextRule927); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule931); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "formatTextRule"

	// Delegated rules



	public static final BitSet FOLLOW_instrRule_in_parseJava48 = new BitSet(new long[]{0xC0F8111088200822L,0x0000000000000007L});
	public static final BitSet FOLLOW_titleRule_in_instrRule68 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule74 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule80 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule86 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule92 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule98 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule104 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule110 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule116 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule122 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule128 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule134 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule146 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule171 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_titleRule174 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule176 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_titleRule180 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule231 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HA_in_refRule233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_refRule235 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule255 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule258 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule260 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_subtextRule414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule431 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule434 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule436 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule457 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_olistRule460 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_olistRule462 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule480 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule482 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule485 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule487 = new BitSet(new long[]{0x0002000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule504 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_ulistRule507 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule509 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule530 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_tlistRule533 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule535 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule556 = new BitSet(new long[]{0x0800020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LP_in_codeBlockRule559 = new BitSet(new long[]{0xFFFFDDFFFFFFFFF0L,0x000000000000007FL});
	public static final BitSet FOLLOW_RP_in_codeBlockRule577 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule582 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule584 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule620 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_linkRule623 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_linkRule625 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule629 = new BitSet(new long[]{0x0800000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule632 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule636 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule639 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule642 = new BitSet(new long[]{0xFFFFDDFFFFFFFFF0L,0x000000000000007FL});
	public static final BitSet FOLLOW_RP_in_linkRule660 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule679 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_imageRule682 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_imageRule684 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule688 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule691 = new BitSet(new long[]{0xFFFFDDFFFFFFFFF0L,0x000000000000007FL});
	public static final BitSet FOLLOW_RP_in_imageRule709 = new BitSet(new long[]{0x0002000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule713 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule716 = new BitSet(new long[]{0xFFFFDDFFFFFFFFF0L,0x000000000000007FL});
	public static final BitSet FOLLOW_RP_in_imageRule734 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule756 = new BitSet(new long[]{0x0800000030000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule769 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule771 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule777 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AT_in_quickLinkRule779 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule781 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule783 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule805 = new BitSet(new long[]{0x0000060000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_tableRule808 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_tableRule810 = new BitSet(new long[]{0x0000060000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule814 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule817 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule819 = new BitSet(new long[]{0x0002000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule822 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule824 = new BitSet(new long[]{0x0002000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule844 = new BitSet(new long[]{0x0000400800000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule846 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule849 = new BitSet(new long[]{0x0000400800000080L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule851 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule891 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule893 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule896 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule898 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule922 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule925 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule927 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule931 = new BitSet(new long[]{0x0000000000000002L});
}
