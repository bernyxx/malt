// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-12 19:37:10

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKQUOTE", "BOLD", "C", "CL", 
		"CLASS", "CM", "CODE", "CODEBLOCK", "COMMENT", "DIGIT", "DO", "EQ", "ESC_SEQ", 
		"EX", "EXPONENT", "FLOAT", "FOR", "FORMATSTRING", "FORMATTEXT", "FUN", 
		"G", "GET", "HA", "HEX_DIGIT", "HL", "HRULE", "I", "IMG", "IN", "INTEGER", 
		"IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", "LINK", "LIST", "LP", 
		"LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", 
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
	public static final int EQ=15;
	public static final int ESC_SEQ=16;
	public static final int EX=17;
	public static final int EXPONENT=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int FORMATSTRING=21;
	public static final int FORMATTEXT=22;
	public static final int FUN=23;
	public static final int G=24;
	public static final int GET=25;
	public static final int HA=26;
	public static final int HEX_DIGIT=27;
	public static final int HL=28;
	public static final int HRULE=29;
	public static final int I=30;
	public static final int IMG=31;
	public static final int IN=32;
	public static final int INTEGER=33;
	public static final int IT=34;
	public static final int ITBOLD=35;
	public static final int L=36;
	public static final int LAB=37;
	public static final int LCB=38;
	public static final int LET=39;
	public static final int LETTER=40;
	public static final int LINK=41;
	public static final int LIST=42;
	public static final int LP=43;
	public static final int LSB=44;
	public static final int OCTAL_ESC=45;
	public static final int OLIST=46;
	public static final int QU=47;
	public static final int R=48;
	public static final int RAB=49;
	public static final int RCB=50;
	public static final int RP=51;
	public static final int RSB=52;
	public static final int S1TITLE=53;
	public static final int S2TITLE=54;
	public static final int S3TITLE=55;
	public static final int S4TITLE=56;
	public static final int S5TITLE=57;
	public static final int SE=58;
	public static final int SL=59;
	public static final int ST=60;
	public static final int STRING=61;
	public static final int SUBS=62;
	public static final int SUPS=63;
	public static final int TABLE=64;
	public static final int TEXT=65;
	public static final int TITLE=66;
	public static final int TLIST=67;
	public static final int ULIST=68;
	public static final int UNICODE_ESC=69;
	public static final int US=70;
	public static final int VAR=71;
	public static final int WS=72;

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


		Handler h;
		
		void initHandler () {
		h = new Handler();
		}



	// $ANTLR start "parseJava"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:1: parseJava : ( instrRule | functionRule | classRule )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:2: ( ( instrRule | functionRule | classRule )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule | functionRule | classRule )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:3: ( instrRule | functionRule | classRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case BLOCKQUOTE:
				case CODEBLOCK:
				case FOR:
				case FORMATTEXT:
				case HRULE:
				case IMG:
				case LAB:
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
					alt1=1;
					}
					break;
				case FUN:
					{
					alt1=2;
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_parseJava52);
					instrRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:16: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_parseJava56);
					functionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:31: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava60);
					classRule();
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

			match(input,EOF,FOLLOW_EOF_in_parseJava64); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:30:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE ) | forRule );
	public final void instrRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE ) | forRule )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BLOCKQUOTE||LA3_0==CODEBLOCK||LA3_0==FORMATTEXT||LA3_0==HRULE||LA3_0==IMG||LA3_0==LAB||(LA3_0 >= LINK && LA3_0 <= LIST)||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= ULIST)) ) {
				alt3=1;
			}
			else if ( (LA3_0==FOR) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule )
					int alt2=14;
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
					case LIST:
						{
						alt2=14;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule80);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:5: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule86);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule92);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule98);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule104);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule110);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule116);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule122);
							horizontalRule();
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:5: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule128);
							tableRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule134);
							imageRule();
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule140);
							linkRule();
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule146);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: formatTextRule
							{
							pushFollow(FOLLOW_formatTextRule_in_instrRule158);
							formatTextRule();
							state._fsp--;

							}
							break;
						case 14 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: listRule
							{
							pushFollow(FOLLOW_listRule_in_instrRule164);
							listRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule170); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule175);
					forRule();
					state._fsp--;

					h.hello();
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
	// $ANTLR end "instrRule"



	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:1: titleRule : t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		Token n=null;
		String t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:2: (t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:3: t= titleTypeRule (n= VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule196);
			t=titleTypeRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:19: (n= VAR EQ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==VAR) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:20: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_titleRule201); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_titleRule205); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule209); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:61: ( refRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LCB) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:61: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule211);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:1: titleTypeRule returns [String type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final String titleTypeRule() throws RecognitionException {
		String type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			int alt6=6;
			switch ( input.LA(1) ) {
			case TITLE:
				{
				alt6=1;
				}
				break;
			case S1TITLE:
				{
				alt6=2;
				}
				break;
			case S2TITLE:
				{
				alt6=3;
				}
				break;
			case S3TITLE:
				{
				alt6=4;
				}
				break;
			case S4TITLE:
				{
				alt6=5;
				}
				break;
			case S5TITLE:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule231); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule237); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule243); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule249); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule255); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule261); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule276); 
			match(input,HA,FOLLOW_HA_in_refRule278); 
			match(input,VAR,FOLLOW_VAR_in_refRule280); 
			match(input,RCB,FOLLOW_RCB_in_refRule282); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:1: textDeclRule : t= TEXT (n= VAR EQ )? textRule ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:2: (t= TEXT (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: t= TEXT (n= VAR EQ )? textRule
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule301); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:10: (n= VAR EQ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_textDeclRule306); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_textDeclRule310); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule314);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:1: textRule : STRING ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_textRule329); 
			}

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



	// $ANTLR start "blockquoteRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:1: blockquoteRule : t= BLOCKQUOTE (n= VAR EQ )? textRule ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:2: (t= BLOCKQUOTE (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:3: t= BLOCKQUOTE (n= VAR EQ )? textRule
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule462); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:16: (n= VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_blockquoteRule467); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule471); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule475);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:1: olistRule : t= OLIST (n= VAR EQ )? textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:2: (t= OLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:3: t= OLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule494); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:11: (n= VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_olistRule499); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_olistRule503); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule507);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule521); 
			match(input,STRING,FOLLOW_STRING_in_textListRule523); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:14: ( CM STRING )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CM) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule526); 
					match(input,STRING,FOLLOW_STRING_in_textListRule528); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule532); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:1: ulistRule : t= ULIST (n= VAR EQ )? textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:2: (t= ULIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:3: t= ULIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule547); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:11: (n= VAR EQ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_ulistRule552); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_ulistRule556); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule560);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: tlistRule : t= TLIST (n= VAR EQ )? textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: (t= TLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: t= TLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule579); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:11: (n= VAR EQ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tlistRule584); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_tlistRule588); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule592);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: codeBlockRule : t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: (t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule611); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:15: ( genericTextRule )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==LP) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:15: genericTextRule
					{
					pushFollow(FOLLOW_genericTextRule_in_codeBlockRule613);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:32: (n= VAR EQ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:33: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_codeBlockRule619); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule623); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule627);
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



	// $ANTLR start "genericTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:1: genericTextRule : ( LP (~ ( LP | RP | '\"' ) )* RP ) ;
	public final void genericTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:2: ( ( LP (~ ( LP | RP | '\"' ) )* RP ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:4: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_genericTextRule644); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:7: (~ ( LP | RP | '\"' ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= BLOCKQUOTE && LA15_0 <= LIST)||(LA15_0 >= LSB && LA15_0 <= OLIST)||(LA15_0 >= R && LA15_0 <= RCB)||(LA15_0 >= RSB && LA15_0 <= WS)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					break loop15;
				}
			}

			match(input,RP,FOLLOW_RP_in_genericTextRule662); 
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
	// $ANTLR end "genericTextRule"



	// $ANTLR start "horizontalRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule675); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:1: linkRule : t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:2: (t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:3: t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule693); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:10: (n= VAR EQ )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==VAR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_linkRule698); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_linkRule702); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule706); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:49: ( textRule | imageRule )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==STRING) ) {
				alt17=1;
			}
			else if ( (LA17_0==IMG) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:50: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule709);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:61: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule713);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule716); 
			pushFollow(FOLLOW_genericTextRule_in_linkRule718);
			genericTextRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule720); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:1: imageRule : t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP ;
	public final void imageRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:2: (t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:3: t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule738); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:9: (n= VAR EQ )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==VAR) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:10: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_imageRule743); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_imageRule747); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule751); 
			pushFollow(FOLLOW_genericTextRule_in_imageRule753);
			genericTextRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:64: ( CM genericTextRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CM) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:65: CM genericTextRule
					{
					match(input,CM,FOLLOW_CM_in_imageRule756); 
					pushFollow(FOLLOW_genericTextRule_in_imageRule758);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule762); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:2: ( LAB STRING RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule779); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule781); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule783); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:1: tableRule : t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:2: (t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:3: t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule803); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:11: (n= VAR EQ )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tableRule808); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_tableRule812); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:47: ( talignmentRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LSB) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:47: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule816);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule819); 
			pushFollow(FOLLOW_trowRule_in_tableRule821);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:75: ( CM trowRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CM) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:76: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule824); 
					pushFollow(FOLLOW_trowRule_in_tableRule826);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule830); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule846); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule848);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:17: ( CM alignRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule851); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule853);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule857); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule893); 
			match(input,STRING,FOLLOW_STRING_in_trowRule895); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:14: ( CM STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule898); 
					match(input,STRING,FOLLOW_STRING_in_trowRule900); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule904); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:1: formatTextRule : t= FORMATTEXT (n= VAR EQ )? STRING ;
	public final void formatTextRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:2: (t= FORMATTEXT (n= VAR EQ )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:3: t= FORMATTEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule923); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:16: (n= VAR EQ )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==VAR) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_formatTextRule928); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_formatTextRule932); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule936); 
			System.out.println("    - Ho riconosciuto formattext");
			}

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



	// $ANTLR start "functionRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:1: functionRule : FUN VAR LP ( TEXT | LIST ) VAR RP LCB ( instrRule )+ RCB ;
	public final void functionRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:2: ( FUN VAR LP ( TEXT | LIST ) VAR RP LCB ( instrRule )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:3: FUN VAR LP ( TEXT | LIST ) VAR RP LCB ( instrRule )+ RCB
			{
			match(input,FUN,FOLLOW_FUN_in_functionRule952); 
			match(input,VAR,FOLLOW_VAR_in_functionRule954); 
			match(input,LP,FOLLOW_LP_in_functionRule956); 
			if ( input.LA(1)==LIST||input.LA(1)==TEXT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,VAR,FOLLOW_VAR_in_functionRule966); 
			match(input,RP,FOLLOW_RP_in_functionRule968); 
			match(input,LCB,FOLLOW_LCB_in_functionRule970); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:39: ( instrRule )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==BLOCKQUOTE||LA26_0==CODEBLOCK||LA26_0==FOR||LA26_0==FORMATTEXT||LA26_0==HRULE||LA26_0==IMG||LA26_0==LAB||(LA26_0 >= LINK && LA26_0 <= LIST)||LA26_0==OLIST||(LA26_0 >= S1TITLE && LA26_0 <= S5TITLE)||(LA26_0 >= TABLE && LA26_0 <= ULIST)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:39: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_functionRule972);
					instrRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule975); 
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



	// $ANTLR start "forRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:2: ( FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:3: FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule991); 
			match(input,LP,FOLLOW_LP_in_forRule993); 
			match(input,VAR,FOLLOW_VAR_in_forRule995); 
			match(input,IN,FOLLOW_IN_in_forRule997); 
			match(input,VAR,FOLLOW_VAR_in_forRule999); 
			match(input,RP,FOLLOW_RP_in_forRule1001); 
			match(input,LCB,FOLLOW_LCB_in_forRule1003); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:28: ( instrRule )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==BLOCKQUOTE||LA27_0==CODEBLOCK||LA27_0==FOR||LA27_0==FORMATTEXT||LA27_0==HRULE||LA27_0==IMG||LA27_0==LAB||(LA27_0 >= LINK && LA27_0 <= LIST)||LA27_0==OLIST||(LA27_0 >= S1TITLE && LA27_0 <= S5TITLE)||(LA27_0 >= TABLE && LA27_0 <= ULIST)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:28: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_forRule1005);
					instrRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			match(input,RCB,FOLLOW_RCB_in_forRule1008); 
			}

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



	// $ANTLR start "classRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:1: classRule : CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:2: ( CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:3: CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1020); 
			match(input,VAR,FOLLOW_VAR_in_classRule1022); 
			match(input,LCB,FOLLOW_LCB_in_classRule1024); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:17: ( fieldRule )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==LIST||LA28_0==OLIST||LA28_0==TEXT||(LA28_0 >= TLIST && LA28_0 <= ULIST)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:17: fieldRule
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1026);
					fieldRule();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:28: ( functionRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==FUN) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:28: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_classRule1029);
					functionRule();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1032); 
			}

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



	// $ANTLR start "fieldRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:1: fieldRule : ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE ;
	public final void fieldRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:2: ( ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule )
			int alt30=5;
			switch ( input.LA(1) ) {
			case TEXT:
				{
				alt30=1;
				}
				break;
			case OLIST:
				{
				alt30=2;
				}
				break;
			case ULIST:
				{
				alt30=3;
				}
				break;
			case TLIST:
				{
				alt30=4;
				}
				break;
			case LIST:
				{
				alt30=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:4: fieldTextRule
					{
					pushFollow(FOLLOW_fieldTextRule_in_fieldRule1045);
					fieldTextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:5: fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1051);
					fieldOlistRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:5: fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1057);
					fieldUlistRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:5: fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1063);
					fieldTlistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:5: listRule
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1069);
					listRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1072); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fieldRule"



	// $ANTLR start "fieldTextRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:1: fieldTextRule : TEXT VAR ( EQ textRule )? ;
	public final void fieldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:2: ( TEXT VAR ( EQ textRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:3: TEXT VAR ( EQ textRule )?
			{
			match(input,TEXT,FOLLOW_TEXT_in_fieldTextRule1085); 
			match(input,VAR,FOLLOW_VAR_in_fieldTextRule1087); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:12: ( EQ textRule )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:13: EQ textRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTextRule1090); 
					pushFollow(FOLLOW_textRule_in_fieldTextRule1092);
					textRule();
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
	// $ANTLR end "fieldTextRule"



	// $ANTLR start "fieldOlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:1: fieldOlistRule : OLIST VAR ( EQ textListRule )? ;
	public final void fieldOlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:2: ( OLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:3: OLIST VAR ( EQ textListRule )?
			{
			match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1107); 
			match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1109); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:13: ( EQ textListRule )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldOlistRule1112); 
					pushFollow(FOLLOW_textListRule_in_fieldOlistRule1114);
					textListRule();
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
	// $ANTLR end "fieldOlistRule"



	// $ANTLR start "fieldUlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:1: fieldUlistRule : ULIST VAR ( EQ textListRule )? ;
	public final void fieldUlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:2: ( ULIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:3: ULIST VAR ( EQ textListRule )?
			{
			match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1129); 
			match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1131); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:13: ( EQ textListRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldUlistRule1134); 
					pushFollow(FOLLOW_textListRule_in_fieldUlistRule1136);
					textListRule();
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
	// $ANTLR end "fieldUlistRule"



	// $ANTLR start "fieldTlistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:1: fieldTlistRule : TLIST VAR ( EQ textListRule )? ;
	public final void fieldTlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:2: ( TLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:3: TLIST VAR ( EQ textListRule )?
			{
			match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1151); 
			match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1153); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:13: ( EQ textListRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTlistRule1156); 
					pushFollow(FOLLOW_textListRule_in_fieldTlistRule1158);
					textListRule();
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
	// $ANTLR end "fieldTlistRule"



	// $ANTLR start "listRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:1: listRule : t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? ;
	public final void listRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:2: (t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:3: t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1174); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1178); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:16: ( EQ LSB STRING ( CM STRING )+ RSB )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:17: EQ LSB STRING ( CM STRING )+ RSB
					{
					match(input,EQ,FOLLOW_EQ_in_listRule1181); 
					match(input,LSB,FOLLOW_LSB_in_listRule1183); 
					match(input,STRING,FOLLOW_STRING_in_listRule1185); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:31: ( CM STRING )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==CM) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:32: CM STRING
							{
							match(input,CM,FOLLOW_CM_in_listRule1188); 
							match(input,STRING,FOLLOW_STRING_in_listRule1190); 
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					match(input,RSB,FOLLOW_RSB_in_listRule1194); 
					}
					break;

			}

			h.declareVar(t, n);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "listRule"



	// $ANTLR start "fieldTextAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:1: fieldTextAssignRule : VAR EQ textRule ;
	public final void fieldTextAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:2: ( VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:3: VAR EQ textRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldTextAssignRule1213); 
			match(input,EQ,FOLLOW_EQ_in_fieldTextAssignRule1215); 
			pushFollow(FOLLOW_textRule_in_fieldTextAssignRule1217);
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
	// $ANTLR end "fieldTextAssignRule"



	// $ANTLR start "fieldListAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:1: fieldListAssignRule : VAR EQ textListRule ;
	public final void fieldListAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:2: ( VAR EQ textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:3: VAR EQ textListRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldListAssignRule1230); 
			match(input,EQ,FOLLOW_EQ_in_fieldListAssignRule1232); 
			pushFollow(FOLLOW_textListRule_in_fieldListAssignRule1234);
			textListRule();
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
	// $ANTLR end "fieldListAssignRule"



	// $ANTLR start "listAssignRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:1: listAssignRule : VAR EQ LSB STRING ( CM STRING )+ RSB ;
	public final void listAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:2: ( VAR EQ LSB STRING ( CM STRING )+ RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:3: VAR EQ LSB STRING ( CM STRING )+ RSB
			{
			match(input,VAR,FOLLOW_VAR_in_listAssignRule1246); 
			match(input,EQ,FOLLOW_EQ_in_listAssignRule1248); 
			match(input,LSB,FOLLOW_LSB_in_listAssignRule1250); 
			match(input,STRING,FOLLOW_STRING_in_listAssignRule1252); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:21: ( CM STRING )+
			int cnt37=0;
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==CM) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:22: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_listAssignRule1255); 
					match(input,STRING,FOLLOW_STRING_in_listAssignRule1257); 
					}
					break;

				default :
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
			}

			match(input,RSB,FOLLOW_RSB_in_listAssignRule1261); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "listAssignRule"

	// Delegated rules



	public static final BitSet FOLLOW_instrRule_in_parseJava52 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_functionRule_in_parseJava56 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_classRule_in_parseJava60 = new BitSet(new long[]{0x03E04620A0D00910L,0x000000000000001FL});
	public static final BitSet FOLLOW_EOF_in_parseJava64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule80 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule86 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule92 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule98 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule104 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule110 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule116 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule122 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule128 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule134 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule140 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule146 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule158 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule164 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule196 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_titleRule201 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule205 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule209 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule276 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HA_in_refRule278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_refRule280 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule301 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule306 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule310 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textRule329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule462 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule467 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule471 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule494 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_olistRule499 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule503 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule521 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule523 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule526 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule528 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule547 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_ulistRule552 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule556 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule579 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tlistRule584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule588 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule611 = new BitSet(new long[]{0x2000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_genericTextRule_in_codeBlockRule613 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule619 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule623 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_genericTextRule644 = new BitSet(new long[]{0xFFFF77FFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_genericTextRule662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule693 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_linkRule698 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule702 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule706 = new BitSet(new long[]{0x2000000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule709 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule713 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule716 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_linkRule718 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule738 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_imageRule743 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule747 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule751 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule753 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule756 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule758 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule779 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule781 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule803 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tableRule808 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule812 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule816 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule819 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule821 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule824 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule826 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule846 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule848 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule851 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule853 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule893 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule895 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule898 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule900 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule923 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule928 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule932 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule954 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule956 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_functionRule958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule966 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule968 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule970 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_functionRule972 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_functionRule975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule991 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_forRule993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule995 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_forRule997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule999 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1001 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1003 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_forRule1005 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_forRule1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_classRule1022 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1024 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1026 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_functionRule_in_classRule1029 = new BitSet(new long[]{0x0004000000800000L});
	public static final BitSet FOLLOW_RCB_in_classRule1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTextRule_in_fieldRule1045 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1051 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1057 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1063 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1069 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldTextRule1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTextRule1087 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTextRule1090 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextRule1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1109 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldOlistRule1112 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldOlistRule1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1131 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldUlistRule1134 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldUlistRule1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1153 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTlistRule1156 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldTlistRule1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_listRule1178 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_listRule1181 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listRule1183 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1185 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRule1188 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1190 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listRule1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldTextAssignRule1213 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldTextAssignRule1215 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextAssignRule1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldListAssignRule1230 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldListAssignRule1232 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldListAssignRule1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_listAssignRule1246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_listAssignRule1248 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listAssignRule1250 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1252 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listAssignRule1255 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1257 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listAssignRule1261 = new BitSet(new long[]{0x0000000000000002L});
}
