// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-23 17:34:35

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
		"EX", "EXPONENT", "FLOAT", "FOR", "FORMATTEXT", "FUN", "G", "GET", "HA", 
		"HEX_DIGIT", "HL", "HRULE", "I", "IMG", "IN", "INTEGER", "IT", "ITBOLD", 
		"L", "LAB", "LCB", "LET", "LETTER", "LINK", "LIST", "LP", "LSB", "OCTAL_ESC", 
		"OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", 
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
	public static final int EQ=15;
	public static final int ESC_SEQ=16;
	public static final int EX=17;
	public static final int EXPONENT=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int FORMATTEXT=21;
	public static final int FUN=22;
	public static final int G=23;
	public static final int GET=24;
	public static final int HA=25;
	public static final int HEX_DIGIT=26;
	public static final int HL=27;
	public static final int HRULE=28;
	public static final int I=29;
	public static final int IMG=30;
	public static final int IN=31;
	public static final int INTEGER=32;
	public static final int IT=33;
	public static final int ITBOLD=34;
	public static final int L=35;
	public static final int LAB=36;
	public static final int LCB=37;
	public static final int LET=38;
	public static final int LETTER=39;
	public static final int LINK=40;
	public static final int LIST=41;
	public static final int LP=42;
	public static final int LSB=43;
	public static final int OCTAL_ESC=44;
	public static final int OLIST=45;
	public static final int QU=46;
	public static final int R=47;
	public static final int RAB=48;
	public static final int RCB=49;
	public static final int RP=50;
	public static final int RSB=51;
	public static final int S1TITLE=52;
	public static final int S2TITLE=53;
	public static final int S3TITLE=54;
	public static final int S4TITLE=55;
	public static final int S5TITLE=56;
	public static final int SE=57;
	public static final int SL=58;
	public static final int ST=59;
	public static final int STRING=60;
	public static final int SUBS=61;
	public static final int SUPS=62;
	public static final int TABLE=63;
	public static final int TEXT=64;
	public static final int TITLE=65;
	public static final int TLIST=66;
	public static final int ULIST=67;
	public static final int UNICODE_ESC=68;
	public static final int US=69;
	public static final int VAR=70;
	public static final int WS=71;

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


		Handler h;
		
		void initHandler () {
		h = new Handler();
		}



	// $ANTLR start "parseJava"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:24:1: parseJava : ( instrRule | functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:2: ( ( instrRule | functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:3: ( instrRule | functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:3: ( instrRule | functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=6;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:4: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_parseJava53);
					instrRule();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:16: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava57);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:37: fieldRule[null, null]
					{
					pushFollow(FOLLOW_fieldRule_in_parseJava62);
					fieldRule(null, null);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:61: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava67);
					classRule();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:73: assignRule[null, null]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava71);
					assignRule(null, null);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava77); 
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



	// $ANTLR start "instrRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule );
	public final void instrRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule )
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
					case TABLE:
						{
						alt2=8;
						}
						break;
					case IMG:
						{
						alt2=9;
						}
						break;
					case LINK:
						{
						alt2=10;
						}
						break;
					case LIST:
						{
						alt2=11;
						}
						break;
					case FORMATTEXT:
						{
						alt2=12;
						}
						break;
					case LAB:
						{
						alt2=13;
						}
						break;
					case HRULE:
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule94);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:6: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule102);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:6: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule110);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:6: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule118);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:6: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule125);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:6: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule133);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:6: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule141);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:6: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule149);
							tableRule();
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:6: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule157);
							imageRule();
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:6: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule164);
							linkRule();
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:6: listRule[null,null]
							{
							pushFollow(FOLLOW_listRule_in_instrRule172);
							listRule(null, null);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:6: formatText
							{
							pushFollow(FOLLOW_formatText_in_instrRule180);
							formatText();
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule187);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 14 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule193);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule199); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule204);
					forRule();
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
	// $ANTLR end "instrRule"



	// $ANTLR start "titleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:1: titleRule : t= titleTypeRule STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:2: (t= titleTypeRule STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:3: t= titleTypeRule STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule224);
			t=titleTypeRule();
			state._fsp--;

			match(input,STRING,FOLLOW_STRING_in_titleRule226); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:26: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:26: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule228);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			int alt5=6;
			switch ( input.LA(1) ) {
			case TITLE:
				{
				alt5=1;
				}
				break;
			case S1TITLE:
				{
				alt5=2;
				}
				break;
			case S2TITLE:
				{
				alt5=3;
				}
				break;
			case S3TITLE:
				{
				alt5=4;
				}
				break;
			case S4TITLE:
				{
				alt5=5;
				}
				break;
			case S5TITLE:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule252); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule258); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule264); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule270); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule276); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule282); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule297); 
			match(input,HA,FOLLOW_HA_in_refRule299); 
			match(input,VAR,FOLLOW_VAR_in_refRule301); 
			match(input,RCB,FOLLOW_RCB_in_refRule303); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:1: textDeclRule : t= TEXT STRING ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:2: (t= TEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: t= TEXT STRING
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule317); 
			match(input,STRING,FOLLOW_STRING_in_textDeclRule319); 
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



	// $ANTLR start "blockquoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:1: blockquoteRule : t= BLOCKQUOTE STRING ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:2: (t= BLOCKQUOTE STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:3: t= BLOCKQUOTE STRING
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule338); 
			match(input,STRING,FOLLOW_STRING_in_blockquoteRule340); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:1: olistRule : t= OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:2: (t= OLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:3: t= OLIST textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule358); 
			pushFollow(FOLLOW_textListRule_in_olistRule360);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule380); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule384); 
			String cicle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:52: (t1= CM t2= STRING )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CM) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule391); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule395); 
					cicle = cicle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule403); 
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



	// $ANTLR start "ulistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:1: ulistRule : t= ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:2: (t= ULIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:3: t= ULIST textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule419); 
			pushFollow(FOLLOW_textListRule_in_ulistRule421);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:1: tlistRule : t= TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:2: (t= TLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:3: t= TLIST textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule440); 
			pushFollow(FOLLOW_textListRule_in_tlistRule442);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:1: codeBlockRule : t= CODEBLOCK ( STRING )? STRING ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:2: (t= CODEBLOCK ( STRING )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:3: t= CODEBLOCK ( STRING )? STRING
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule461); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:15: ( STRING )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==STRING) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==STRING) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:15: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_codeBlockRule463); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_codeBlockRule466); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule483); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:1: linkRule : t= LINK LP ( STRING | imageRule ) CM STRING RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:2: (t= LINK LP ( STRING | imageRule ) CM STRING RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:3: t= LINK LP ( STRING | imageRule ) CM STRING RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule502); 
			match(input,LP,FOLLOW_LP_in_linkRule504); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:13: ( STRING | imageRule )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==STRING) ) {
				alt8=1;
			}
			else if ( (LA8_0==IMG) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:14: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_linkRule507); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:23: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule511);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule514); 
			match(input,STRING,FOLLOW_STRING_in_linkRule516); 
			match(input,RP,FOLLOW_RP_in_linkRule518); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule540); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule544); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule548); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:58: (t1= CM t2= STRING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule555); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule559); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule567); 
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



	// $ANTLR start "quickLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:2: ( LAB STRING RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:128:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule586); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule588); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule590); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:1: tableRule : t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:2: (t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:3: t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule609); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:11: ( talignmentRule )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:11: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule611);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule614); 
			pushFollow(FOLLOW_trowRule_in_tableRule616);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:39: ( CM trowRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:40: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule619); 
					pushFollow(FOLLOW_trowRule_in_tableRule621);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule625); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule647); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule651);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:44: (t1= CM t2= alignRule )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule658); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule662);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop12;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule670); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:1: alignRule returns [String value] : (v= L |v= C |v= R );
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:2: (v= L |v= C |v= R )
			int alt13=3;
			switch ( input.LA(1) ) {
			case L:
				{
				alt13=1;
				}
				break;
			case C:
				{
				alt13=2;
				}
				break;
			case R:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:3: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule690); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:9: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule696); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:15: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule702); 
					value = v.getText();
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
		return value;
	}
	// $ANTLR end "alignRule"



	// $ANTLR start "trowRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule722); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule726); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:52: (v3= CM v4= STRING )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule733); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule737); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop14;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule745); 
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



	// $ANTLR start "formatText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:1: formatText : t= FORMATTEXT STRING ;
	public final void formatText() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:2: (t= FORMATTEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:3: t= FORMATTEXT STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatText763); 
			match(input,STRING,FOLLOW_STRING_in_formatText765); 
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
	// $ANTLR end "formatText"



	// $ANTLR start "functionRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule785); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule789); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule793); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:50: ( argumentsRule[className, $n] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BLOCKQUOTE||LA15_0==CODEBLOCK||LA15_0==FORMATTEXT||LA15_0==IMG||(LA15_0 >= LINK && LA15_0 <= LIST)||LA15_0==OLIST||(LA15_0 >= S1TITLE && LA15_0 <= S5TITLE)||(LA15_0 >= TABLE && LA15_0 <= ULIST)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule796);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule801); 
			match(input,LCB,FOLLOW_LCB_in_functionRule803); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:89: ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==FORMATTEXT||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)) ) {
					alt16=1;
				}
				else if ( (LA16_0==VAR) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:90: ( fieldRule[className,$n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:90: ( fieldRule[className,$n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:91: fieldRule[className,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule807);
					fieldRule(className, n);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:118: ( assignRule[className, $n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:118: ( assignRule[className, $n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:119: assignRule[className, $n]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule814);
					assignRule(className, n);
					state._fsp--;

					}

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule820); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:1: argumentsRule[Token className, Token funcName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token funcName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule842);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule846); 
			h.declareArg(className, funcName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:74: ( CM t= argumentTypeRule n= VAR )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CM) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:75: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule851); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule855);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule859); 
					h.declareArg(className, funcName, t, n);
					}
					break;

				default :
					break loop17;
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			int alt18=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt18=1;
				}
				break;
			case TEXT:
				{
				alt18=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt18=3;
				}
				break;
			case OLIST:
				{
				alt18=4;
				}
				break;
			case ULIST:
				{
				alt18=5;
				}
				break;
			case TLIST:
				{
				alt18=6;
				}
				break;
			case CODEBLOCK:
				{
				alt18=7;
				}
				break;
			case LINK:
				{
				alt18=8;
				}
				break;
			case IMG:
				{
				alt18=9;
				}
				break;
			case TABLE:
				{
				alt18=10;
				}
				break;
			case FORMATTEXT:
				{
				alt18=11;
				}
				break;
			case LIST:
				{
				alt18=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule882);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule890); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule896); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule902); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule908); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule914); 
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule920); 
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule926); 
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule932); 
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule938); 
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule944); 
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule950); 
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



	// $ANTLR start "forRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:2: ( FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:3: FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule965); 
			match(input,LP,FOLLOW_LP_in_forRule967); 
			match(input,VAR,FOLLOW_VAR_in_forRule969); 
			match(input,IN,FOLLOW_IN_in_forRule971); 
			match(input,VAR,FOLLOW_VAR_in_forRule973); 
			match(input,RP,FOLLOW_RP_in_forRule975); 
			match(input,LCB,FOLLOW_LCB_in_forRule977); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:28: ( instrRule )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==BLOCKQUOTE||LA19_0==CODEBLOCK||(LA19_0 >= FOR && LA19_0 <= FORMATTEXT)||LA19_0==HRULE||LA19_0==IMG||LA19_0==LAB||(LA19_0 >= LINK && LA19_0 <= LIST)||LA19_0==OLIST||(LA19_0 >= S1TITLE && LA19_0 <= S5TITLE)||(LA19_0 >= TABLE && LA19_0 <= ULIST)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:29: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_forRule980);
					instrRule();
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

			match(input,RCB,FOLLOW_RCB_in_forRule984); 
			System.out.println("    - Ho riconosciuto un for");
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:2: (f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:3: f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1002); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1006); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule1010); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:49: ( fieldRule[$n,null] )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BLOCKQUOTE||LA20_0==CODEBLOCK||LA20_0==FORMATTEXT||LA20_0==IMG||(LA20_0 >= LINK && LA20_0 <= LIST)||LA20_0==OLIST||(LA20_0 >= S1TITLE && LA20_0 <= S5TITLE)||(LA20_0 >= TABLE && LA20_0 <= ULIST)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:49: fieldRule[$n,null]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1012);
					fieldRule(n, null);
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:69: ( functionRule[$n] )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==FUN) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:70: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1017);
					functionRule(n);
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1022); 
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



	// $ANTLR start "fieldRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:1: fieldRule[Token className, Token functionName] : ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE ;
	public final void fieldRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:2: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:3: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:3: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] )
			int alt22=12;
			switch ( input.LA(1) ) {
			case S1TITLE:
			case S2TITLE:
			case S3TITLE:
			case S4TITLE:
			case S5TITLE:
			case TITLE:
				{
				alt22=1;
				}
				break;
			case TEXT:
				{
				alt22=2;
				}
				break;
			case BLOCKQUOTE:
				{
				alt22=3;
				}
				break;
			case OLIST:
				{
				alt22=4;
				}
				break;
			case ULIST:
				{
				alt22=5;
				}
				break;
			case TLIST:
				{
				alt22=6;
				}
				break;
			case CODEBLOCK:
				{
				alt22=7;
				}
				break;
			case TABLE:
				{
				alt22=8;
				}
				break;
			case IMG:
				{
				alt22=9;
				}
				break;
			case LINK:
				{
				alt22=10;
				}
				break;
			case LIST:
				{
				alt22=11;
				}
				break;
			case FORMATTEXT:
				{
				alt22=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:5: fieldTitleRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1042);
					fieldTitleRule(className, functionName);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:5: fieldText[className, functionName]
					{
					pushFollow(FOLLOW_fieldText_in_fieldRule1051);
					fieldText(className, functionName);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:5: fieldBlockQuoteRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1060);
					fieldBlockQuoteRule(className, functionName);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:5: fieldOlistRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1069);
					fieldOlistRule(className, functionName);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:5: fieldUlistRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1078);
					fieldUlistRule(className, functionName);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:5: fieldTlistRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1086);
					fieldTlistRule(className, functionName);
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:5: fieldCodeBlockRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1094);
					fieldCodeBlockRule(className, functionName);
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:5: fieldTableRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldTableRule_in_fieldRule1102);
					fieldTableRule(className, functionName);
					state._fsp--;

					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:5: fieldImageRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldImageRule_in_fieldRule1111);
					fieldImageRule(className, functionName);
					state._fsp--;

					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:5: fieldLinkRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1119);
					fieldLinkRule(className, functionName);
					state._fsp--;

					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:5: listRule[className, functionName]
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1128);
					listRule(className, functionName);
					state._fsp--;

					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:5: fieldFormatText[className, functionName]
					{
					pushFollow(FOLLOW_fieldFormatText_in_fieldRule1137);
					fieldFormatText(className, functionName);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1142); 
			}

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



	// $ANTLR start "fieldTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:1: fieldTitleRule[Token className, Token functionName] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? ;
	public final void fieldTitleRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1158);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1162); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:75: ( assignTitleRule[$className, $functionName, $n] )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:76: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1167);
					assignTitleRule(className, functionName, n);
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
	// $ANTLR end "fieldTitleRule"



	// $ANTLR start "fieldText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:1: fieldText[Token className, Token functionName] : t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:2: (t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:3: t= TEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1188); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1192); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:65: ( assignString[$className, $functionName, $n] )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:66: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldText1197);
					assignString(className, functionName, n);
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
	// $ANTLR end "fieldText"



	// $ANTLR start "fieldBlockQuoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:1: fieldBlockQuoteRule[Token className, Token functionName] : t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldBlockQuoteRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:2: (t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:3: t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1216); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1220); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:72: ( assignString[$className, $functionName, $n] )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==EQ) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:73: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1226);
					assignString(className, functionName, n);
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
	// $ANTLR end "fieldBlockQuoteRule"



	// $ANTLR start "fieldOlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:1: fieldOlistRule[Token className, Token functionName] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldOlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1245); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1249); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EQ) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1254);
					assignTextListRule(className, functionName, n);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:1: fieldUlistRule[Token className, Token functionName] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldUlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1274); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1278); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1283);
					assignTextListRule(className, functionName, n);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:1: fieldTlistRule[Token className, Token functionName] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldTlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1303); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1307); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1312);
					assignTextListRule(className, functionName, n);
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



	// $ANTLR start "fieldCodeBlockRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:1: fieldCodeBlockRule[Token className, Token functionName] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldCodeBlockRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1331); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LP) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_fieldCodeBlockRule1334); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:19: (~ ( LP | RP | '\"' ) )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( ((LA29_0 >= BLOCKQUOTE && LA29_0 <= LIST)||(LA29_0 >= LSB && LA29_0 <= OLIST)||(LA29_0 >= R && LA29_0 <= RCB)||(LA29_0 >= RSB && LA29_0 <= WS)) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
							break loop29;
						}
					}

					match(input,RP,FOLLOW_RP_in_fieldCodeBlockRule1352); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1358); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:100: ( assignString[$className, $functionName, $n] )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:101: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1364);
					assignString(className, functionName, n);
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
	// $ANTLR end "fieldCodeBlockRule"



	// $ANTLR start "fieldTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:1: fieldTableRule[Token className, Token functionName] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? ;
	public final void fieldTableRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1383); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1387); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:66: ( assignTableRule[$className, $functionName, $n] )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:67: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1392);
					assignTableRule(className, functionName, n);
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
	// $ANTLR end "fieldTableRule"



	// $ANTLR start "fieldImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:1: fieldImageRule[Token className, Token functionName] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? ;
	public final void fieldImageRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1411); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1415); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:64: ( assignImageRule[$className, $functionName, $n] )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:65: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1420);
					assignImageRule(className, functionName, n);
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
	// $ANTLR end "fieldImageRule"


	public static class fieldLinkRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:1: fieldLinkRule[Token className, Token functionName] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule(Token className, Token functionName) throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1443); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1447); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:65: ( assignLinkRule[$className, $functionName, $n] )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:66: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1452);
					assignLinkRule(className, functionName, n);
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
	// $ANTLR end "fieldLinkRule"



	// $ANTLR start "fieldFormatText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:1: fieldFormatText[Token className, Token functionName] : t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldFormatText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:2: (t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:3: t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_fieldFormatText1471); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldFormatText1475); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:71: ( assignString[$className, $functionName, $n] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:72: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldFormatText1480);
					assignString(className, functionName, n);
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
	// $ANTLR end "fieldFormatText"



	// $ANTLR start "listRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:1: listRule[Token className, Token functionName] : t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? ;
	public final void listRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1501); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1505); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:65: ( assignListRule[$className, $functionName, $n] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:66: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1510);
					assignListRule(className, functionName, n);
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
	// $ANTLR end "listRule"



	// $ANTLR start "assignRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:1: assignRule[Token className, Token functionName] : n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE ;
	public final void assignRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:2: (n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:2: n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1536); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:8: ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] )
			int alt37=6;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQ) ) {
				switch ( input.LA(2) ) {
				case STRING:
					{
					alt37=1;
					}
					break;
				case LP:
					{
					switch ( input.LA(3) ) {
					case STRING:
						{
						int LA37_5 = input.LA(4);
						if ( (LA37_5==CM) ) {
							int LA37_9 = input.LA(5);
							if ( (LA37_9==STRING) ) {
								int LA37_11 = input.LA(6);
								if ( (LA37_11==CM||LA37_11==RP) ) {
									alt37=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 37, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 37, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA37_5==RP) ) {
							alt37=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 37, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case IMG:
						{
						alt37=5;
						}
						break;
					case LSB:
						{
						alt37=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LSB:
					{
					int LA37_4 = input.LA(3);
					if ( (LA37_4==STRING) ) {
						alt37=6;
					}
					else if ( (LA37_4==C||LA37_4==L||LA37_4==R) ) {
						alt37=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 4, input);
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
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:9: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1539);
					assignTitleRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:58: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1544);
					assignTextListRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:111: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1550);
					assignTableRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:9: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1561);
					assignImageRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:58: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1566);
					assignLinkRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:106: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1571);
					assignListRule(className, functionName, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1576); 
			}

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



	// $ANTLR start "assignTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:1: assignTitleRule[Token className, Token functionName, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:2: ( EQ v= STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1590); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1594); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:15: ( refRule )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==LCB) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1596);
					refRule();
					state._fsp--;

					}
					break;

			}

			h.assignVarValue(className, functionName, name, v.getText());
			}

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



	// $ANTLR start "assignString"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:1: assignString[Token className, Token functionName, Token name] : EQ v= STRING ;
	public final void assignString(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1613); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1617); 
			h.assignVarValue(className, functionName, name, v.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignString"



	// $ANTLR start "assignTextListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:1: assignTextListRule[Token className, Token functionName, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1633); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1637);
			v=textListRule();
			state._fsp--;

			h.assignVarValue(className, functionName, name, v);
			}

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



	// $ANTLR start "assignTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:1: assignTableRule[Token className, Token functionName, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1653); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:8: (v1= talignmentRule )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LSB) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1657);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1662); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1666);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:64: (t1= CM t2= trowRule )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==CM) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1673); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1677);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop40;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1685); 
			h.assignVarValue(className, functionName, name, v1 + v2.getText() + cycle + v4.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:1: assignImageRule[Token className, Token functionName, Token name] : EQ v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:2: ( EQ v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:3: EQ v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignImageRule1701); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1705); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1709); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:39: (o1= CM o2= STRING )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==CM) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:40: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1716); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1720); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1728); 
			h.assignVarValue(className, functionName, name, v1.getText() + v2.getText() + opt + v3.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:1: assignLinkRule[Token className, Token functionName, Token name] : EQ v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:301:2: ( EQ v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:3: EQ v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignLinkRule1744); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1748); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:30: (t= STRING |ir= imageRule )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==STRING) ) {
				alt42=1;
			}
			else if ( (LA42_0==IMG) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:31: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1755); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:61: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1763);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1770); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1774); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1778); 
			h.assignVarValue(className, functionName, name, v1.getText() + v2 + v3.getText() 
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



	// $ANTLR start "assignListRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:1: assignListRule[Token className, Token functionName, Token name] : v1= EQ v2= LSB v3= STRING (t1= CM t2= STRING )+ v4= RSB ;
	public final void assignListRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:2: (v1= EQ v2= LSB v3= STRING (t1= CM t2= STRING )+ v4= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:3: v1= EQ v2= LSB v3= STRING (t1= CM t2= STRING )+ v4= RSB
			{
			v1=(Token)match(input,EQ,FOLLOW_EQ_in_assignListRule1797); 
			v2=(Token)match(input,LSB,FOLLOW_LSB_in_assignListRule1801); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1805); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:58: (t1= CM t2= STRING )+
			int cnt43=0;
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==CM) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignListRule1812); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1816); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt43 >= 1 ) break loop43;
					EarlyExitException eee = new EarlyExitException(43, input);
					throw eee;
				}
				cnt43++;
			}

			v4=(Token)match(input,RSB,FOLLOW_RSB_in_assignListRule1824); 
			h.assignVarValue(className, functionName, name, v1.getText() + v2.getText() 
																								+ cycle + v4.getText());
			}

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

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\40\uffff";
	static final String DFA1_eofS =
		"\1\1\37\uffff";
	static final String DFA1_minS =
		"\1\4\1\uffff\10\74\7\52\1\106\1\74\5\uffff\1\17\1\53\1\uffff\1\74\1\11"+
		"\1\74\1\11\1\71";
	static final String DFA1_maxS =
		"\1\106\1\uffff\21\106\5\uffff\1\71\1\53\1\uffff\1\74\1\11\1\74\1\63\1"+
		"\71";
	static final String DFA1_acceptS =
		"\1\uffff\1\6\21\uffff\1\1\1\2\1\4\1\5\1\3\2\uffff\1\1\5\uffff";
	static final String DFA1_specialS =
		"\40\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\11\3\uffff\1\25\2\uffff\1\15\10\uffff\1\23\1\22\1\24\5\uffff\1\23"+
			"\1\uffff\1\17\5\uffff\1\23\3\uffff\1\20\1\21\3\uffff\1\12\6\uffff\1\3"+
			"\1\4\1\5\1\6\1\7\6\uffff\1\16\1\10\1\2\1\14\1\13\2\uffff\1\26",
			"",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\11\uffff\1\27",
			"\1\23\33\uffff\1\27",
			"\1\23\33\uffff\1\27",
			"\1\23\33\uffff\1\27",
			"\1\27\21\uffff\1\23\11\uffff\1\27",
			"\2\23\32\uffff\1\27",
			"\1\23\33\uffff\1\27",
			"\1\23\33\uffff\1\27",
			"\1\30",
			"\1\23\11\uffff\1\27",
			"",
			"",
			"",
			"",
			"",
			"\1\31\51\uffff\1\32",
			"\1\33",
			"",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\35\51\uffff\1\37",
			"\1\32"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 27:3: ( instrRule | functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+";
		}
	}

	public static final BitSet FOLLOW_instrRule_in_parseJava53 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000004FL});
	public static final BitSet FOLLOW_functionRule_in_parseJava57 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000004FL});
	public static final BitSet FOLLOW_fieldRule_in_parseJava62 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000004FL});
	public static final BitSet FOLLOW_classRule_in_parseJava67 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000004FL});
	public static final BitSet FOLLOW_assignRule_in_parseJava71 = new BitSet(new long[]{0x81F0231050700910L,0x000000000000004FL});
	public static final BitSet FOLLOW_EOF_in_parseJava77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule94 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule102 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule110 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule118 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule125 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule133 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule141 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule149 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule157 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule164 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule172 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_formatText_in_instrRule180 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule187 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule193 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule224 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule226 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule297 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_HA_in_refRule299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_refRule301 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule317 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textDeclRule319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule338 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_blockquoteRule340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule358 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule380 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule384 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule391 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule395 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule419 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule440 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule461 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule463 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule502 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule504 = new BitSet(new long[]{0x1000000040000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule507 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule511 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule514 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule516 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule540 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule544 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule548 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule555 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule559 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule586 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule588 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule609 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule611 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule614 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule616 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule619 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule621 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule647 = new BitSet(new long[]{0x0000800800000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule651 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule658 = new BitSet(new long[]{0x0000800800000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule662 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule722 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule726 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule733 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule737 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatText763 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatText765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_functionRule789 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule793 = new BitSet(new long[]{0x81F4230040200810L,0x000000000000000FL});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule796 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule801 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule803 = new BitSet(new long[]{0x81F0230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_fieldRule_in_functionRule807 = new BitSet(new long[]{0x81F2230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_assignRule_in_functionRule814 = new BitSet(new long[]{0x81F2230040200810L,0x000000000000004FL});
	public static final BitSet FOLLOW_RCB_in_functionRule820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule846 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule851 = new BitSet(new long[]{0x81F0230040200810L,0x000000000000000FL});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule859 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule965 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_forRule967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_forRule969 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_forRule971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_forRule973 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule975 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule977 = new BitSet(new long[]{0x81F0231050300810L,0x000000000000000FL});
	public static final BitSet FOLLOW_instrRule_in_forRule980 = new BitSet(new long[]{0x81F2231050300810L,0x000000000000000FL});
	public static final BitSet FOLLOW_RCB_in_forRule984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_classRule1006 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1010 = new BitSet(new long[]{0x81F2230040600810L,0x000000000000000FL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1012 = new BitSet(new long[]{0x81F2230040600810L,0x000000000000000FL});
	public static final BitSet FOLLOW_functionRule_in_classRule1017 = new BitSet(new long[]{0x0002000000400000L});
	public static final BitSet FOLLOW_RCB_in_classRule1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1042 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1051 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1060 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1069 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1078 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1086 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1094 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1102 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1111 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1119 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1128 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldFormatText_in_fieldRule1137 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1162 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldText1192 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1220 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1249 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1278 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1307 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1331 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LP_in_fieldCodeBlockRule1334 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000000FFL});
	public static final BitSet FOLLOW_RP_in_fieldCodeBlockRule1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1358 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1387 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1415 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1447 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_fieldFormatText1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_fieldFormatText1475 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldFormatText1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_VAR_in_listRule1505 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1536 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1539 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1544 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1550 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1561 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1566 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1571 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1590 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1594 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1613 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignString1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1633 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1653 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1657 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1662 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1666 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1673 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1677 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignImageRule1701 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1705 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1709 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1716 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1720 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignLinkRule1744 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1748 = new BitSet(new long[]{0x1000000040000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1755 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1763 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1770 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1774 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1797 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1801 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1805 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1812 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1816 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1824 = new BitSet(new long[]{0x0000000000000002L});
}
