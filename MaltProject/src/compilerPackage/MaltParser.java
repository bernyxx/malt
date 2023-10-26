// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-26 19:14:42

	package compilerPackage;
	
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
		"EQ", "EQI", "EQL", "ESC_SEQ", "EX", "EXPONENT", "FLOAT", "FOR", "FORMAT", 
		"FORMATTEXT", "FUN", "G", "GET", "HA", "HEX_DIGIT", "HL", "HRULE", "I", 
		"IMG", "IN", "INTEGER", "IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", 
		"LINK", "LIST", "LP", "LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", 
		"RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", 
		"SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", 
		"ULIST", "UNICODE_ESC", "US", "VAR", "WS"
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
	public static final int ESC_SEQ=19;
	public static final int EX=20;
	public static final int EXPONENT=21;
	public static final int FLOAT=22;
	public static final int FOR=23;
	public static final int FORMAT=24;
	public static final int FORMATTEXT=25;
	public static final int FUN=26;
	public static final int G=27;
	public static final int GET=28;
	public static final int HA=29;
	public static final int HEX_DIGIT=30;
	public static final int HL=31;
	public static final int HRULE=32;
	public static final int I=33;
	public static final int IMG=34;
	public static final int IN=35;
	public static final int INTEGER=36;
	public static final int IT=37;
	public static final int ITBOLD=38;
	public static final int L=39;
	public static final int LAB=40;
	public static final int LCB=41;
	public static final int LET=42;
	public static final int LETTER=43;
	public static final int LINK=44;
	public static final int LIST=45;
	public static final int LP=46;
	public static final int LSB=47;
	public static final int OCTAL_ESC=48;
	public static final int OLIST=49;
	public static final int QU=50;
	public static final int R=51;
	public static final int RAB=52;
	public static final int RCB=53;
	public static final int RP=54;
	public static final int RSB=55;
	public static final int S1TITLE=56;
	public static final int S2TITLE=57;
	public static final int S3TITLE=58;
	public static final int S4TITLE=59;
	public static final int S5TITLE=60;
	public static final int SE=61;
	public static final int SL=62;
	public static final int ST=63;
	public static final int STRING=64;
	public static final int SUBS=65;
	public static final int SUPS=66;
	public static final int TABLE=67;
	public static final int TEXT=68;
	public static final int TITLE=69;
	public static final int TLIST=70;
	public static final int ULIST=71;
	public static final int UNICODE_ESC=72;
	public static final int US=73;
	public static final int VAR=74;
	public static final int WS=75;

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:1: parseJava : ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+
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
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA1_6 = input.LA(3);
						if ( (LA1_6==FORMAT) ) {
							alt1=2;
						}
						else if ( ((LA1_6 >= LP && LA1_6 <= LSB)||LA1_6==STRING||LA1_6==VAR) ) {
							alt1=4;
						}

						}
						break;
					case LP:
						{
						alt1=2;
						}
						break;
					case EQI:
					case EQL:
						{
						alt1=4;
						}
						break;
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:20: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava59);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:41: fieldRule[null, null]
					{
					pushFollow(FOLLOW_fieldRule_in_parseJava64);
					fieldRule(null, null);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:65: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava69);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:77: assignRule[null, null]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava73);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava79); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] );
	public final void instrRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule98);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:6: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule106);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:6: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule114);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:6: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule122);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule129);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:6: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule137);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:6: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule145);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:6: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule153);
							tableRule();
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:6: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule161);
							imageRule();
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:6: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule168);
							linkRule();
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:6: listRule[null,null]
							{
							pushFollow(FOLLOW_listRule_in_instrRule176);
							listRule(null, null);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:6: formatText
							{
							pushFollow(FOLLOW_formatText_in_instrRule184);
							formatText();
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule191);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 14 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule197);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule203); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:11: forRule[null, null]
					{
					pushFollow(FOLLOW_forRule_in_instrRule208);
					forRule(null, null);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:1: titleRule : t= titleTypeRule STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:2: (t= titleTypeRule STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:3: t= titleTypeRule STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule229);
			t=titleTypeRule();
			state._fsp--;

			match(input,STRING,FOLLOW_STRING_in_titleRule231); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:26: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:26: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule233);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule258); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule264); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule270); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule276); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule282); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule288); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule304); 
			match(input,HA,FOLLOW_HA_in_refRule306); 
			match(input,VAR,FOLLOW_VAR_in_refRule308); 
			match(input,RCB,FOLLOW_RCB_in_refRule310); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:1: textDeclRule : t= TEXT STRING ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:2: (t= TEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:3: t= TEXT STRING
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule325); 
			match(input,STRING,FOLLOW_STRING_in_textDeclRule327); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:1: blockquoteRule : t= BLOCKQUOTE STRING ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:2: (t= BLOCKQUOTE STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:3: t= BLOCKQUOTE STRING
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule347); 
			match(input,STRING,FOLLOW_STRING_in_blockquoteRule349); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:93:1: olistRule : t= OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:2: (t= OLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:3: t= OLIST textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule368); 
			pushFollow(FOLLOW_textListRule_in_olistRule370);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule391); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule395); 
			String cicle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:52: (t1= CM t2= STRING )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule402); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule406); 
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

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule414); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:105:1: ulistRule : t= ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:106:2: (t= ULIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:3: t= ULIST textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule431); 
			pushFollow(FOLLOW_textListRule_in_ulistRule433);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:1: tlistRule : t= TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:2: (t= TLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:3: t= TLIST textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule453); 
			pushFollow(FOLLOW_textListRule_in_tlistRule455);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:1: codeBlockRule : t= CODEBLOCK ( STRING )? STRING ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:2: (t= CODEBLOCK ( STRING )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:3: t= CODEBLOCK ( STRING )? STRING
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule475); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:15: ( STRING )?
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:15: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_codeBlockRule477); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_codeBlockRule480); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:128:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule497); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:1: linkRule : t= LINK LP ( STRING | imageRule ) CM STRING RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:2: (t= LINK LP ( STRING | imageRule ) CM STRING RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:3: t= LINK LP ( STRING | imageRule ) CM STRING RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule517); 
			match(input,LP,FOLLOW_LP_in_linkRule519); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:13: ( STRING | imageRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:14: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_linkRule522); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:23: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule526);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule529); 
			match(input,STRING,FOLLOW_STRING_in_linkRule531); 
			match(input,RP,FOLLOW_RP_in_linkRule533); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule556); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule560); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule564); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:58: (t1= CM t2= STRING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule571); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule575); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule583); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:2: ( LAB STRING RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule602); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule604); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule606); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:1: tableRule : t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:2: (t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:3: t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule625); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:11: ( talignmentRule )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:11: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule627);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule630); 
			pushFollow(FOLLOW_trowRule_in_tableRule632);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:39: ( CM trowRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:40: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule635); 
					pushFollow(FOLLOW_trowRule_in_tableRule637);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule641); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule664); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule668);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:44: (t1= CM t2= alignRule )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule675); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule679);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop12;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule687); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:2: ( (v= L |v= C |v= R ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:3: (v= L |v= C |v= R )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:3: (v= L |v= C |v= R )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule709); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule715); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule721); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule743); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule747); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:52: (v3= CM v4= STRING )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule754); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule758); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop14;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule766); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:179:1: formatText : t= FORMATTEXT STRING ;
	public final void formatText() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:2: (t= FORMATTEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:3: t= FORMATTEXT STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatText783); 
			match(input,STRING,FOLLOW_STRING_in_formatText785); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule806); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule810); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule814); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:50: ( argumentsRule[className, $n] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BLOCKQUOTE||LA15_0==CODEBLOCK||LA15_0==FORMATTEXT||LA15_0==IMG||(LA15_0 >= LINK && LA15_0 <= LIST)||LA15_0==OLIST||(LA15_0 >= S1TITLE && LA15_0 <= S5TITLE)||(LA15_0 >= TABLE && LA15_0 <= ULIST)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule817);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule822); 
			match(input,LCB,FOLLOW_LCB_in_functionRule824); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:89: ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==DOTVAR||LA16_0==FOR||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)) ) {
					alt16=1;
				}
				else if ( (LA16_0==VAR) ) {
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA16_4 = input.LA(3);
						if ( (LA16_4==FORMAT) ) {
							alt16=1;
						}
						else if ( ((LA16_4 >= LP && LA16_4 <= LSB)||LA16_4==STRING||LA16_4==VAR) ) {
							alt16=2;
						}

						}
						break;
					case LP:
						{
						alt16=1;
						}
						break;
					case EQI:
					case EQL:
						{
						alt16=2;
						}
						break;
					}
				}

				switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:90: ( fieldRule[className,$n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:90: ( fieldRule[className,$n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:91: fieldRule[className,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule828);
					fieldRule(className, n);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:118: ( assignRule[className, $n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:118: ( assignRule[className, $n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:119: assignRule[className, $n]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule835);
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

			match(input,RCB,FOLLOW_RCB_in_functionRule841); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule868);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule872); 
			h.declareArg(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:78: ( CM t= argumentTypeRule n= VAR )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CM) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule877); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule881);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule885); 
					h.declareArg(className, functionName, t, n);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule909);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule917); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule923); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule929); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule935); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule941); 
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule947); 
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule953); 
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule959); 
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule965); 
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule971); 
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule977); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:1: functionCallRule[Token className, Token functionName] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final void functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:3: (v1= VAR |v1= DOTVAR )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			else if ( (LA19_0==DOTVAR) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule997); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule1003); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionCallRule1006); 
			Vector<String> vct = new Vector<String>();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:72: (t1= VAR ( CM t2= VAR )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:73: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule1013); 
					vct.add(t1.getText());
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:106: ( CM t2= VAR )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CM) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:107: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule1018); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule1022); 
							vct.add(t2.getText());
							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule1030); 
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



	// $ANTLR start "forRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:1: forRule[Token className, Token functionName ] : FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB ;
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:2: ( FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:3: FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1047); 
			match(input,LP,FOLLOW_LP_in_forRule1049); 
			match(input,VAR,FOLLOW_VAR_in_forRule1051); 
			match(input,IN,FOLLOW_IN_in_forRule1053); 
			match(input,VAR,FOLLOW_VAR_in_forRule1055); 
			match(input,RP,FOLLOW_RP_in_forRule1057); 
			match(input,LCB,FOLLOW_LCB_in_forRule1059); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:28: ( fieldRule[className, functionName] )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BLOCKQUOTE||LA22_0==CODEBLOCK||LA22_0==DOTVAR||LA22_0==FOR||LA22_0==IMG||(LA22_0 >= LINK && LA22_0 <= LIST)||LA22_0==OLIST||(LA22_0 >= S1TITLE && LA22_0 <= S5TITLE)||(LA22_0 >= TABLE && LA22_0 <= ULIST)||LA22_0==VAR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:45: fieldRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldRule_in_forRule1064);
					fieldRule(className, functionName);
					state._fsp--;

					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			match(input,RCB,FOLLOW_RCB_in_forRule1069); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] | assignRule[$n, null] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:2: (f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] | assignRule[$n, null] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:3: f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] | assignRule[$n, null] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1088); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1092); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule1096); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:49: ( fieldRule[$n,null] | functionRule[$n] | assignRule[$n, null] )*
			loop23:
			while (true) {
				int alt23=4;
				switch ( input.LA(1) ) {
				case BLOCKQUOTE:
				case CODEBLOCK:
				case DOTVAR:
				case FOR:
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
					alt23=1;
					}
					break;
				case VAR:
					{
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA23_5 = input.LA(3);
						if ( (LA23_5==FORMAT) ) {
							alt23=1;
						}
						else if ( ((LA23_5 >= LP && LA23_5 <= LSB)||LA23_5==STRING||LA23_5==VAR) ) {
							alt23=3;
						}

						}
						break;
					case LP:
						{
						alt23=1;
						}
						break;
					case EQI:
					case EQL:
						{
						alt23=3;
						}
						break;
					}
					}
					break;
				case FUN:
					{
					alt23=2;
					}
					break;
				}
				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:50: fieldRule[$n,null]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1099);
					fieldRule(n, null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:71: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1104);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:90: assignRule[$n, null]
					{
					pushFollow(FOLLOW_assignRule_in_classRule1109);
					assignRule(n, null);
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1114); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:1: fieldRule[Token className, Token functionName] : ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] ) SE ) | forRule[className, functionName] );
	public final void fieldRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:2: ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] ) SE ) | forRule[className, functionName] )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==BLOCKQUOTE||LA25_0==CODEBLOCK||LA25_0==DOTVAR||LA25_0==IMG||(LA25_0 >= LINK && LA25_0 <= LIST)||LA25_0==OLIST||(LA25_0 >= S1TITLE && LA25_0 <= S5TITLE)||(LA25_0 >= TABLE && LA25_0 <= ULIST)||LA25_0==VAR) ) {
				alt25=1;
			}
			else if ( (LA25_0==FOR) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | functionCallRule[className, functionName] | formatRule[className, functionName] )
					int alt24=13;
					switch ( input.LA(1) ) {
					case S1TITLE:
					case S2TITLE:
					case S3TITLE:
					case S4TITLE:
					case S5TITLE:
					case TITLE:
						{
						alt24=1;
						}
						break;
					case TEXT:
						{
						alt24=2;
						}
						break;
					case BLOCKQUOTE:
						{
						alt24=3;
						}
						break;
					case OLIST:
						{
						alt24=4;
						}
						break;
					case ULIST:
						{
						alt24=5;
						}
						break;
					case TLIST:
						{
						alt24=6;
						}
						break;
					case CODEBLOCK:
						{
						alt24=7;
						}
						break;
					case TABLE:
						{
						alt24=8;
						}
						break;
					case IMG:
						{
						alt24=9;
						}
						break;
					case LINK:
						{
						alt24=10;
						}
						break;
					case LIST:
						{
						alt24=11;
						}
						break;
					case VAR:
						{
						int LA24_12 = input.LA(2);
						if ( (LA24_12==EQ) ) {
							alt24=13;
						}
						else if ( (LA24_12==LP) ) {
							alt24=12;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 24, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DOTVAR:
						{
						alt24=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:6: fieldTitleRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1136);
							fieldTitleRule(className, functionName);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:5: fieldText[className, functionName]
							{
							pushFollow(FOLLOW_fieldText_in_fieldRule1145);
							fieldText(className, functionName);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:5: fieldBlockQuoteRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1154);
							fieldBlockQuoteRule(className, functionName);
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:5: fieldOlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1163);
							fieldOlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:5: fieldUlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1172);
							fieldUlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:5: fieldTlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1180);
							fieldTlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:5: fieldCodeBlockRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1188);
							fieldCodeBlockRule(className, functionName);
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:5: fieldTableRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTableRule_in_fieldRule1196);
							fieldTableRule(className, functionName);
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:5: fieldImageRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldImageRule_in_fieldRule1205);
							fieldImageRule(className, functionName);
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:5: fieldLinkRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1213);
							fieldLinkRule(className, functionName);
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:5: listRule[className, functionName]
							{
							pushFollow(FOLLOW_listRule_in_fieldRule1222);
							listRule(className, functionName);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_fieldRule1231);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:5: formatRule[className, functionName]
							{
							pushFollow(FOLLOW_formatRule_in_fieldRule1239);
							formatRule(className, functionName);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_fieldRule1244); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:49: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_fieldRule1249);
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
	// $ANTLR end "fieldRule"



	// $ANTLR start "fieldTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:1: fieldTitleRule[Token className, Token functionName] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? ;
	public final void fieldTitleRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1267);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1271); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:75: ( assignTitleRule[$className, $functionName, $n] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EQ) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:76: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1276);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:1: fieldText[Token className, Token functionName] : t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:2: (t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:3: t= TEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1298); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1302); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:65: ( assignString[$className, $functionName, $n] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:66: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldText1307);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:1: fieldBlockQuoteRule[Token className, Token functionName] : t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldBlockQuoteRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:2: (t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:3: t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1327); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1331); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:72: ( assignString[$className, $functionName, $n] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:73: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1337);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:1: fieldOlistRule[Token className, Token functionName] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldOlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1357); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1361); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==EQ) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1366);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:1: fieldUlistRule[Token className, Token functionName] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldUlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1387); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1391); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EQ) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1396);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:1: fieldTlistRule[Token className, Token functionName] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldTlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1417); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1421); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1426);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:1: fieldCodeBlockRule[Token className, Token functionName] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldCodeBlockRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1446); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LP) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_fieldCodeBlockRule1449); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:19: (~ ( LP | RP | '\"' ) )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( ((LA32_0 >= BLOCKQUOTE && LA32_0 <= LIST)||(LA32_0 >= LSB && LA32_0 <= OLIST)||(LA32_0 >= R && LA32_0 <= RCB)||(LA32_0 >= RSB && LA32_0 <= WS)) ) {
							alt32=1;
						}

						switch (alt32) {
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
							break loop32;
						}
					}

					match(input,RP,FOLLOW_RP_in_fieldCodeBlockRule1467); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1473); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:100: ( assignString[$className, $functionName, $n] )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:101: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1479);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:1: fieldTableRule[Token className, Token functionName] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? ;
	public final void fieldTableRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1499); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1503); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:66: ( assignTableRule[$className, $functionName, $n] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:67: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1508);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:1: fieldImageRule[Token className, Token functionName] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? ;
	public final void fieldImageRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1528); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1532); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:64: ( assignImageRule[$className, $functionName, $n] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQI) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:65: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1537);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:1: fieldLinkRule[Token className, Token functionName] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule(Token className, Token functionName) throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1561); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1565); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:65: ( assignLinkRule[$className, $functionName, $n] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQL) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:66: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1570);
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



	// $ANTLR start "listRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:1: listRule[Token className, Token functionName] : t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? ;
	public final void listRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1591); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1595); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:65: ( assignListRule[$className, $functionName, $n] )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EQ) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:66: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1600);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:311:1: assignRule[Token className, Token functionName] : n= VAR ( assignVariableRule[$className, $functionName, $n] | assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE ;
	public final void assignRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:312:2: (n= VAR ( assignVariableRule[$className, $functionName, $n] | assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:3: n= VAR ( assignVariableRule[$className, $functionName, $n] | assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1625); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:9: ( assignVariableRule[$className, $functionName, $n] | assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] )
			int alt39=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt39=1;
					}
					break;
				case STRING:
					{
					alt39=2;
					}
					break;
				case LSB:
					{
					int LA39_6 = input.LA(3);
					if ( (LA39_6==STRING) ) {
						alt39=7;
					}
					else if ( (LA39_6==C||LA39_6==L||LA39_6==R) ) {
						alt39=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LP:
					{
					int LA39_7 = input.LA(3);
					if ( (LA39_7==STRING) ) {
						alt39=3;
					}
					else if ( (LA39_7==LSB) ) {
						alt39=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 7, input);
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
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt39=5;
				}
				break;
			case EQL:
				{
				alt39=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:10: assignVariableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1628);
					assignVariableRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:62: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1633);
					assignTitleRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:111: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1638);
					assignTextListRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:164: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1644);
					assignTableRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:10: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1656);
					assignImageRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:59: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1661);
					assignLinkRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:107: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1666);
					assignListRule(className, functionName, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1671); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:317:1: assignVariableRule[Token className, Token functionName, Token name] : EQ v1= VAR ;
	public final void assignVariableRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:2: ( EQ v1= VAR )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:6: EQ v1= VAR
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1685); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1689); 
			h.assignVarToVar(className, functionName, name, v1);
			}

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



	// $ANTLR start "assignTitleRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:322:1: assignTitleRule[Token className, Token functionName, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:2: ( EQ v= STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1706); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1710); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:15: ( refRule )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LCB) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1712);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:328:1: assignString[Token className, Token functionName, Token name] : EQ v= STRING ;
	public final void assignString(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:329:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:330:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1730); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1734); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:334:1: assignTextListRule[Token className, Token functionName, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:335:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:336:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1751); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1755);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:340:1: assignTableRule[Token className, Token functionName, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1772); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:8: (v1= talignmentRule )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LSB) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1776);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1781); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1785);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:64: (t1= CM t2= trowRule )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==CM) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1792); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1796);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop42;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1804); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:346:1: assignImageRule[Token className, Token functionName, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:347:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:348:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1821); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1825); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1829); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:348:40: (o1= CM o2= STRING )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==CM) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:348:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1836); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1840); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1848); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:1: assignLinkRule[Token className, Token functionName, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:353:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:354:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1865); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1869); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:354:31: (t= STRING |ir= imageRule )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==STRING) ) {
				alt44=1;
			}
			else if ( (LA44_0==IMG) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:354:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1876); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:354:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1884);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1891); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1895); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1899); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:359:1: assignListRule[Token className, Token functionName, Token name] : EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB ;
	public final void assignListRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:360:2: ( EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:361:3: EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB
			{
			match(input,EQ,FOLLOW_EQ_in_assignListRule1916); 
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_assignListRule1920); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1924); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:361:55: (t1= CM t2= STRING )+
			int cnt45=0;
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==CM) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:361:56: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignListRule1931); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1935); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt45 >= 1 ) break loop45;
					EarlyExitException eee = new EarlyExitException(45, input);
					throw eee;
				}
				cnt45++;
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_assignListRule1943); 
			h.assignVarValue(className, functionName, name, v1.getText() + cycle + v3.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:365:1: formatRule[Token className, Token functionName] : v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP ;
	public final void formatRule(Token className, Token functionName) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:2: (v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:4: v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1960); 
			match(input,EQ,FOLLOW_EQ_in_formatRule1962); 
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule1964); 
			match(input,LP,FOLLOW_LP_in_formatRule1966); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1970); 
			Vector<Token> vct = new Vector<Token>();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:74: ( CM v3= VAR ( CM v4= VAR )+ )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==CM) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:76: CM v3= VAR ( CM v4= VAR )+
					{
					match(input,CM,FOLLOW_CM_in_formatRule1976); 
					v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1980); 
					vct.add(v3);
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:102: ( CM v4= VAR )+
					int cnt46=0;
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==CM) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:366:103: CM v4= VAR
							{
							match(input,CM,FOLLOW_CM_in_formatRule1985); 
							v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule1989); 
							vct.add(v4);
							}
							break;

						default :
							if ( cnt46 >= 1 ) break loop46;
							EarlyExitException eee = new EarlyExitException(46, input);
							throw eee;
						}
						cnt46++;
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_formatRule1998); 
			h.handleFormat(className, functionName, v1, v2, vct );
			}

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



	public static final BitSet FOLLOW_functionRule_in_parseJava59 = new BitSet(new long[]{0x1F02300404808910L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_parseJava64 = new BitSet(new long[]{0x1F02300404808910L,0x00000000000004F8L});
	public static final BitSet FOLLOW_classRule_in_parseJava69 = new BitSet(new long[]{0x1F02300404808910L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_parseJava73 = new BitSet(new long[]{0x1F02300404808910L,0x00000000000004F8L});
	public static final BitSet FOLLOW_EOF_in_parseJava79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule98 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule106 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule114 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule122 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule129 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule137 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule145 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule153 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule161 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule168 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule176 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_formatText_in_instrRule184 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule191 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule197 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_titleRule231 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule304 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_HA_in_refRule306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_refRule308 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_textDeclRule327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_blockquoteRule349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule368 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_textListRule395 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_textListRule406 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule431 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule453 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule517 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule519 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_linkRule522 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule526 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_linkRule531 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule556 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_imageRule564 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_imageRule575 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule604 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule625 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule627 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule630 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule632 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule635 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule637 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule664 = new BitSet(new long[]{0x0008008000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule668 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule675 = new BitSet(new long[]{0x0008008000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule679 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_trowRule747 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_trowRule758 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatText783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_formatText785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_functionRule810 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule814 = new BitSet(new long[]{0x1F42300402000810L,0x00000000000000F8L});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule817 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule822 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule824 = new BitSet(new long[]{0x1F02300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_functionRule828 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_functionRule835 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_functionRule841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule872 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule877 = new BitSet(new long[]{0x1F02300402000810L,0x00000000000000F8L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule885 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule997 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule1003 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule1006 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule1013 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule1022 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1047 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_forRule1051 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_IN_in_forRule1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_forRule1055 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1057 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1059 = new BitSet(new long[]{0x1F02300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_forRule1064 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_forRule1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_classRule1092 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1096 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_classRule1099 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_functionRule_in_classRule1104 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_classRule1109 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_classRule1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1136 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1145 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1154 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1163 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1172 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1180 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1188 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1196 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1205 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1213 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1222 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_fieldRule1231 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_fieldRule1239 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_fieldRule1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1271 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldText1302 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1331 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1361 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1391 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1421 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1446 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LP_in_fieldCodeBlockRule1449 = new BitSet(new long[]{0xFFFBBFFFFFFFFFF0L,0x0000000000000FFFL});
	public static final BitSet FOLLOW_RP_in_fieldCodeBlockRule1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1473 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1503 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1532 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1565 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_listRule1595 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1625 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1628 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1633 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1638 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1644 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1656 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1661 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1666 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1710 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignString1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1751 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1772 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1776 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1781 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1785 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1792 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1796 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1821 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1829 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1840 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1865 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1869 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1876 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1884 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1895 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1916 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1924 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1935 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formatRule1960 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_formatRule1962 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule1964 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule1970 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule1980 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule1989 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule1998 = new BitSet(new long[]{0x0000000000000002L});
}
