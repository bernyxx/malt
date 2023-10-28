// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-28 18:39:51

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:1: parseJava : ( functionRule[null] | fieldRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( ( functionRule[null] | fieldRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: ( functionRule[null] | fieldRule[null, null, false] | classRule | assignRule[null, null, false] )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:3: ( functionRule[null] | fieldRule[null, null, false] | classRule | assignRule[null, null, false] )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:41: fieldRule[null, null, false]
					{
					pushFollow(FOLLOW_fieldRule_in_parseJava64);
					fieldRule(null, null, false);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:72: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava69);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:84: assignRule[null, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava73);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] );
	public final void instrRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null, false] | formatText | quickLinkRule | horizontalRule )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:6: listRule[null,null, false]
							{
							pushFollow(FOLLOW_listRule_in_instrRule176);
							listRule(null, null, false);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+ RCB
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:89: ( ( fieldRule[className,$n, false] ) | ( assignRule[className, $n, false] ) )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:90: ( fieldRule[className,$n, false] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:90: ( fieldRule[className,$n, false] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:91: fieldRule[className,$n, false]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule828);
					fieldRule(className, n, false);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:125: ( assignRule[className, $n, false] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:125: ( assignRule[className, $n, false] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:126: assignRule[className, $n, false]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule835);
					assignRule(className, n, false);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:1: forRule[Token className, Token functionName] : ( forInRule[className, functionName] | forIncrRule[className, functionName] );
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:2: ( forInRule[className, functionName] | forIncrRule[className, functionName] )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==FOR) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==LP) ) {
					int LA22_2 = input.LA(3);
					if ( (LA22_2==VAR) ) {
						int LA22_3 = input.LA(4);
						if ( (LA22_3==IN) ) {
							alt22=1;
						}
						else if ( (LA22_3==CM) ) {
							alt22=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:4: forInRule[className, functionName]
					{
					pushFollow(FOLLOW_forInRule_in_forRule1045);
					forInRule(className, functionName);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:42: forIncrRule[className, functionName]
					{
					pushFollow(FOLLOW_forIncrRule_in_forRule1051);
					forIncrRule(className, functionName);
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
	// $ANTLR end "forRule"



	// $ANTLR start "forInRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:1: forInRule[Token className, Token functionName] : FOR LP n= VAR IN i= VAR RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forInRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:2: ( FOR LP n= VAR IN i= VAR RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:4: FOR LP n= VAR IN i= VAR RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forInRule1067); 
			match(input,LP,FOLLOW_LP_in_forInRule1069); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule1073); 
			match(input,IN,FOLLOW_IN_in_forInRule1075); 
			i=(Token)match(input,VAR,FOLLOW_VAR_in_forInRule1079); 
			match(input,RP,FOLLOW_RP_in_forInRule1081); 
			match(input,LCB,FOLLOW_LCB_in_forInRule1083); 
			h.declareFor(className, functionName, false, n, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:91: ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==BLOCKQUOTE||LA23_0==CODEBLOCK||LA23_0==DOTVAR||LA23_0==FOR||LA23_0==IMG||(LA23_0 >= LINK && LA23_0 <= LIST)||LA23_0==OLIST||(LA23_0 >= S1TITLE && LA23_0 <= S5TITLE)||(LA23_0 >= TABLE && LA23_0 <= ULIST)) ) {
					alt23=1;
				}
				else if ( (LA23_0==VAR) ) {
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA23_4 = input.LA(3);
						if ( (LA23_4==FORMAT) ) {
							alt23=1;
						}
						else if ( ((LA23_4 >= LP && LA23_4 <= LSB)||LA23_4==STRING||LA23_4==VAR) ) {
							alt23=2;
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
						alt23=2;
						}
						break;
					}
				}

				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:108: fieldRule[className, functionName, true]
					{
					pushFollow(FOLLOW_fieldRule_in_forInRule1090);
					fieldRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:151: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forInRule1095);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			match(input,RCB,FOLLOW_RCB_in_forInRule1100); 
			System.out.println("    - Ho riconosciuto un for in");
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:1: forIncrRule[Token className, Token functionName] : FOR LP n= VAR CM i= INTEGER RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB ;
	public final void forIncrRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token i=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:2: ( FOR LP n= VAR CM i= INTEGER RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:4: FOR LP n= VAR CM i= INTEGER RP LCB ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forIncrRule1116); 
			match(input,LP,FOLLOW_LP_in_forIncrRule1118); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_forIncrRule1122); 
			match(input,CM,FOLLOW_CM_in_forIncrRule1124); 
			i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forIncrRule1128); 
			match(input,RP,FOLLOW_RP_in_forIncrRule1130); 
			match(input,LCB,FOLLOW_LCB_in_forIncrRule1132); 
			h.declareFor(className, functionName, true, n, i);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:94: ( fieldRule[className, functionName, true] | assignRule[className, functionName, true] )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=3;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==BLOCKQUOTE||LA24_0==CODEBLOCK||LA24_0==DOTVAR||LA24_0==FOR||LA24_0==IMG||(LA24_0 >= LINK && LA24_0 <= LIST)||LA24_0==OLIST||(LA24_0 >= S1TITLE && LA24_0 <= S5TITLE)||(LA24_0 >= TABLE && LA24_0 <= ULIST)) ) {
					alt24=1;
				}
				else if ( (LA24_0==VAR) ) {
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA24_4 = input.LA(3);
						if ( (LA24_4==FORMAT) ) {
							alt24=1;
						}
						else if ( ((LA24_4 >= LP && LA24_4 <= LSB)||LA24_4==STRING||LA24_4==VAR) ) {
							alt24=2;
						}

						}
						break;
					case LP:
						{
						alt24=1;
						}
						break;
					case EQI:
					case EQL:
						{
						alt24=2;
						}
						break;
					}
				}

				switch (alt24) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:111: fieldRule[className, functionName, true]
					{
					pushFollow(FOLLOW_fieldRule_in_forIncrRule1139);
					fieldRule(className, functionName, true);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:154: assignRule[className, functionName, true]
					{
					pushFollow(FOLLOW_assignRule_in_forIncrRule1144);
					assignRule(className, functionName, true);
					state._fsp--;

					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			match(input,RCB,FOLLOW_RCB_in_forIncrRule1149); 
			System.out.println("    - Ho riconosciuto un for incr");
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:2: (f= CLASS n= VAR LCB ( fieldRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:3: f= CLASS n= VAR LCB ( fieldRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1169); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1173); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule1177); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:49: ( fieldRule[$n,null, false] | functionRule[$n] | assignRule[$n, null, false] )*
			loop25:
			while (true) {
				int alt25=4;
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
					alt25=1;
					}
					break;
				case VAR:
					{
					switch ( input.LA(2) ) {
					case EQ:
						{
						int LA25_5 = input.LA(3);
						if ( (LA25_5==FORMAT) ) {
							alt25=1;
						}
						else if ( ((LA25_5 >= LP && LA25_5 <= LSB)||LA25_5==STRING||LA25_5==VAR) ) {
							alt25=3;
						}

						}
						break;
					case LP:
						{
						alt25=1;
						}
						break;
					case EQI:
					case EQL:
						{
						alt25=3;
						}
						break;
					}
					}
					break;
				case FUN:
					{
					alt25=2;
					}
					break;
				}
				switch (alt25) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:50: fieldRule[$n,null, false]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1180);
					fieldRule(n, null, false);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:78: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1185);
					functionRule(n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:97: assignRule[$n, null, false]
					{
					pushFollow(FOLLOW_assignRule_in_classRule1190);
					assignRule(n, null, false);
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1195); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:1: fieldRule[Token className, Token functionName, boolean inFor] : ( ( ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] );
	public final void fieldRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:2: ( ( ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE ) | forRule[className, functionName] )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==BLOCKQUOTE||LA27_0==CODEBLOCK||LA27_0==DOTVAR||LA27_0==IMG||(LA27_0 >= LINK && LA27_0 <= LIST)||LA27_0==OLIST||(LA27_0 >= S1TITLE && LA27_0 <= S5TITLE)||(LA27_0 >= TABLE && LA27_0 <= ULIST)||LA27_0==VAR) ) {
				alt27=1;
			}
			else if ( (LA27_0==FOR) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:3: ( ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:3: ( ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:4: ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:4: ( fieldTitleRule[className, functionName, inFor] | fieldText[className, functionName, inFor] | fieldBlockQuoteRule[className, functionName, inFor] | fieldOlistRule[className, functionName, inFor] | fieldUlistRule[className, functionName, inFor] | fieldTlistRule[className, functionName, inFor] | fieldCodeBlockRule[className, functionName, inFor] | fieldTableRule[className, functionName, inFor] | fieldImageRule[className, functionName, inFor] | fieldLinkRule[className, functionName, inFor] | listRule[className, functionName, inFor] | functionCallRule[className, functionName] | formatRule[className, functionName, inFor] )
					int alt26=13;
					switch ( input.LA(1) ) {
					case S1TITLE:
					case S2TITLE:
					case S3TITLE:
					case S4TITLE:
					case S5TITLE:
					case TITLE:
						{
						alt26=1;
						}
						break;
					case TEXT:
						{
						alt26=2;
						}
						break;
					case BLOCKQUOTE:
						{
						alt26=3;
						}
						break;
					case OLIST:
						{
						alt26=4;
						}
						break;
					case ULIST:
						{
						alt26=5;
						}
						break;
					case TLIST:
						{
						alt26=6;
						}
						break;
					case CODEBLOCK:
						{
						alt26=7;
						}
						break;
					case TABLE:
						{
						alt26=8;
						}
						break;
					case IMG:
						{
						alt26=9;
						}
						break;
					case LINK:
						{
						alt26=10;
						}
						break;
					case LIST:
						{
						alt26=11;
						}
						break;
					case VAR:
						{
						int LA26_12 = input.LA(2);
						if ( (LA26_12==EQ) ) {
							alt26=13;
						}
						else if ( (LA26_12==LP) ) {
							alt26=12;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 26, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DOTVAR:
						{
						alt26=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:6: fieldTitleRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1217);
							fieldTitleRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:5: fieldText[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldText_in_fieldRule1226);
							fieldText(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:5: fieldBlockQuoteRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1235);
							fieldBlockQuoteRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:5: fieldOlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1244);
							fieldOlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:5: fieldUlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1253);
							fieldUlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:5: fieldTlistRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1261);
							fieldTlistRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:5: fieldCodeBlockRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1269);
							fieldCodeBlockRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:5: fieldTableRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldTableRule_in_fieldRule1277);
							fieldTableRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:5: fieldImageRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldImageRule_in_fieldRule1286);
							fieldImageRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:5: fieldLinkRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1294);
							fieldLinkRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:5: listRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_listRule_in_fieldRule1303);
							listRule(className, functionName, inFor);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_fieldRule1312);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:5: formatRule[className, functionName, inFor]
							{
							pushFollow(FOLLOW_formatRule_in_fieldRule1319);
							formatRule(className, functionName, inFor);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_fieldRule1324); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:56: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_fieldRule1329);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:1: fieldTitleRule[Token className, Token functionName, boolean inFor] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldTitleRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1347);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1351); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:82: ( assignTitleRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==STRING) ) {
					alt28=1;
				}
				else if ( (LA28_1==VAR) ) {
					alt28=2;
				}
			}
			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:83: assignTitleRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1356);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:140: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldTitleRule1361);
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
	// $ANTLR end "fieldTitleRule"



	// $ANTLR start "fieldText"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:1: fieldText[Token className, Token functionName, boolean inFor] : t= TEXT n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldText(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:2: (t= TEXT n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:3: t= TEXT n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1382); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1386); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:72: ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==EQ) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==STRING) ) {
					alt29=1;
				}
				else if ( (LA29_1==VAR) ) {
					alt29=2;
				}
			}
			switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:73: assignString[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldText1391);
					assignString(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:127: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldText1396);
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
	// $ANTLR end "fieldText"



	// $ANTLR start "fieldBlockQuoteRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:1: fieldBlockQuoteRule[Token className, Token functionName, boolean inFor] : t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldBlockQuoteRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:2: (t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:3: t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1416); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1420); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:79: ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EQ) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==STRING) ) {
					alt30=1;
				}
				else if ( (LA30_1==VAR) ) {
					alt30=2;
				}
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:80: assignString[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1426);
					assignString(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldBlockQuoteRule1431);
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
	// $ANTLR end "fieldBlockQuoteRule"



	// $ANTLR start "fieldOlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:1: fieldOlistRule[Token className, Token functionName, boolean inFor] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldOlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1451); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1455); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==VAR) ) {
					alt31=2;
				}
				else if ( (LA31_1==LP) ) {
					alt31=1;
				}
			}
			switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1460);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldOlistRule1465);
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
	// $ANTLR end "fieldOlistRule"



	// $ANTLR start "fieldUlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:1: fieldUlistRule[Token className, Token functionName, boolean inFor] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldUlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1486); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1490); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==VAR) ) {
					alt32=2;
				}
				else if ( (LA32_1==LP) ) {
					alt32=1;
				}
			}
			switch (alt32) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1495);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldUlistRule1500);
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
	// $ANTLR end "fieldUlistRule"



	// $ANTLR start "fieldTlistRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:1: fieldTlistRule[Token className, Token functionName, boolean inFor] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldTlistRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1521); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1525); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:73: ( assignTextListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==VAR) ) {
					alt33=2;
				}
				else if ( (LA33_1==LP) ) {
					alt33=1;
				}
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:74: assignTextListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1530);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:134: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldTlistRule1535);
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
	// $ANTLR end "fieldTlistRule"



	// $ANTLR start "fieldCodeBlockRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:1: fieldCodeBlockRule[Token className, Token functionName, boolean inFor] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldCodeBlockRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1555); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==LP) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_fieldCodeBlockRule1558); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:19: (~ ( LP | RP | '\"' ) )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= BLOCKQUOTE && LA34_0 <= LIST)||(LA34_0 >= LSB && LA34_0 <= OLIST)||(LA34_0 >= R && LA34_0 <= RCB)||(LA34_0 >= RSB && LA34_0 <= WS)) ) {
							alt34=1;
						}

						switch (alt34) {
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
							break loop34;
						}
					}

					match(input,RP,FOLLOW_RP_in_fieldCodeBlockRule1576); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1582); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:107: ( assignString[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==STRING) ) {
					alt36=1;
				}
				else if ( (LA36_1==VAR) ) {
					alt36=2;
				}
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:108: assignString[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1588);
					assignString(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:161: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldCodeBlockRule1592);
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
	// $ANTLR end "fieldCodeBlockRule"



	// $ANTLR start "fieldTableRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:1: fieldTableRule[Token className, Token functionName, boolean inFor] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldTableRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1612); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1616); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:73: ( assignTableRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQ) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==VAR) ) {
					alt37=2;
				}
				else if ( ((LA37_1 >= LP && LA37_1 <= LSB)) ) {
					alt37=1;
				}
			}
			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:74: assignTableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1621);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:131: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldTableRule1626);
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
	// $ANTLR end "fieldTableRule"



	// $ANTLR start "fieldImageRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:301:1: fieldImageRule[Token className, Token functionName, boolean inFor] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final void fieldImageRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:303:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1646); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1650); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:303:71: ( assignImageRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EQI) ) {
				alt38=1;
			}
			else if ( (LA38_0==EQ) ) {
				alt38=2;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:303:72: assignImageRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1655);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:303:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldImageRule1660);
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
	// $ANTLR end "fieldImageRule"


	public static class fieldLinkRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "fieldLinkRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:1: fieldLinkRule[Token className, Token functionName, boolean inFor] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1684); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1688); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:72: ( assignLinkRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n] )?
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==EQL) ) {
				alt39=1;
			}
			else if ( (LA39_0==EQ) ) {
				alt39=2;
			}
			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:73: assignLinkRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1693);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:129: assignVariableRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_fieldLinkRule1698);
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
	// $ANTLR end "fieldLinkRule"



	// $ANTLR start "listRule"
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:1: listRule[Token className, Token functionName, boolean inFor] : t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? ;
	public final void listRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:315:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1719); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1723); 
			h.declareNew(className, functionName, inFor, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:72: ( assignListRule[$className, $functionName, $inFor, $n] | assignVariableRule[$className, $functionName, $inFor, $n ] )?
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==EQ) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==LSB) ) {
					alt40=1;
				}
				else if ( (LA40_1==VAR) ) {
					alt40=2;
				}
			}
			switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:73: assignListRule[$className, $functionName, $inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1728);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:129: assignVariableRule[$className, $functionName, $inFor, $n ]
					{
					pushFollow(FOLLOW_assignVariableRule_in_listRule1733);
					assignVariableRule(className, functionName, inFor, n);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:321:1: assignRule[Token className, Token functionName, boolean inFor] : n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE ;
	public final void assignRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:322:2: (n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:3: n= VAR ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1757); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:9: ( assignVariableRule[$className, $functionName, inFor, $n] | assignTitleRule[$className, $functionName, inFor, $n] | assignTextListRule[$className, $functionName, inFor, $n] | assignTableRule[$className, $functionName, inFor, $n] | assignImageRule[$className, $functionName, inFor, $n] | assignLinkRule[$className, $functionName, inFor, $n] | assignListRule[$className, $functionName, inFor, $n] )
			int alt41=7;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt41=1;
					}
					break;
				case STRING:
					{
					alt41=2;
					}
					break;
				case LSB:
					{
					int LA41_6 = input.LA(3);
					if ( (LA41_6==RSB||LA41_6==STRING) ) {
						alt41=7;
					}
					else if ( (LA41_6==C||LA41_6==L||LA41_6==R) ) {
						alt41=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LP:
					{
					int LA41_7 = input.LA(3);
					if ( (LA41_7==STRING) ) {
						alt41=3;
					}
					else if ( (LA41_7==LSB) ) {
						alt41=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 7, input);
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
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt41=5;
				}
				break;
			case EQL:
				{
				alt41=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:10: assignVariableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignVariableRule_in_assignRule1760);
					assignVariableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:69: assignTitleRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1765);
					assignTitleRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:125: assignTextListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1770);
					assignTextListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:185: assignTableRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1776);
					assignTableRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:10: assignImageRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1788);
					assignImageRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:66: assignLinkRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1793);
					assignLinkRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:121: assignListRule[$className, $functionName, inFor, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1798);
					assignListRule(className, functionName, inFor, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1803); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:327:1: assignVariableRule[Token className, Token functionName, boolean inFor, Token name] : EQ v1= VAR ;
	public final void assignVariableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:328:2: ( EQ v1= VAR )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:328:6: EQ v1= VAR
			{
			match(input,EQ,FOLLOW_EQ_in_assignVariableRule1817); 
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_assignVariableRule1821); 
			h.assignVarToVar(className, functionName, inFor, name, v1);
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:1: assignTitleRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:333:2: ( EQ v= STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:334:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1838); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1842); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:334:15: ( refRule )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==LCB) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:334:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1844);
					refRule();
					state._fsp--;

					}
					break;

			}

			h.assignVarValue(className, functionName, inFor, name, v.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:338:1: assignString[Token className, Token functionName, boolean inFor, Token name] : EQ v= STRING ;
	public final void assignString(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:339:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:340:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1862); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1866); 
			h.assignVarValue(className, functionName, inFor, name, v.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:344:1: assignTextListRule[Token className, Token functionName, boolean inFor, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:345:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:346:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1883); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1887);
			v=textListRule();
			state._fsp--;

			h.assignVarValue(className, functionName, inFor, name, v);
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:350:1: assignTableRule[Token className, Token functionName, boolean inFor, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:351:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1904); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:8: (v1= talignmentRule )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==LSB) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1908);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1913); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1917);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:64: (t1= CM t2= trowRule )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==CM) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1924); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1928);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop44;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1936); 
			h.assignVarValue(className, functionName, inFor, name, v1 + v2.getText() + cycle + v4.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:356:1: assignImageRule[Token className, Token functionName, boolean inFor, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:357:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:358:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1953); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1957); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1961); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:358:40: (o1= CM o2= STRING )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==CM) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:358:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1968); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1972); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1980); 
			h.assignVarValue(className, functionName, inFor, name, v1.getText() + v2.getText() + opt + v3.getText());
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:362:1: assignLinkRule[Token className, Token functionName, boolean inFor, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:363:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:364:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1997); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule2001); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:364:31: (t= STRING |ir= imageRule )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==STRING) ) {
				alt46=1;
			}
			else if ( (LA46_0==IMG) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:364:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule2008); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:364:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule2016);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule2023); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule2027); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule2031); 
			h.assignVarValue(className, functionName, inFor, name, v1.getText() + v2 + v3.getText() 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:369:1: assignListRule[Token className, Token functionName, boolean inFor, Token name] : EQ LSB (v= STRING ( CM t= STRING )* )? RSB ;
	public final void assignListRule(Token className, Token functionName, boolean inFor, Token name) throws RecognitionException {
		Token v=null;
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:370:2: ( EQ LSB (v= STRING ( CM t= STRING )* )? RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:371:3: EQ LSB (v= STRING ( CM t= STRING )* )? RSB
			{
			Vector<Token> vct = new Vector<Token>();
			match(input,EQ,FOLLOW_EQ_in_assignListRule2050); 
			match(input,LSB,FOLLOW_LSB_in_assignListRule2052); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:371:54: (v= STRING ( CM t= STRING )* )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==STRING) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:371:55: v= STRING ( CM t= STRING )*
					{
					v=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule2058); 
					vct.add(v);
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:371:80: ( CM t= STRING )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==CM) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:371:81: CM t= STRING
							{
							match(input,CM,FOLLOW_CM_in_assignListRule2064); 
							t=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule2068); 
							vct.add(t);
							}
							break;

						default :
							break loop47;
						}
					}

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_assignListRule2076); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:375:1: formatRule[Token className, Token functionName, boolean inFor] : v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP ;
	public final void formatRule(Token className, Token functionName, boolean inFor) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:2: (v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:4: v1= VAR EQ FORMAT LP v2= VAR ( CM v3= VAR ( CM v4= VAR )+ )? RP
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2093); 
			match(input,EQ,FOLLOW_EQ_in_formatRule2095); 
			match(input,FORMAT,FOLLOW_FORMAT_in_formatRule2097); 
			match(input,LP,FOLLOW_LP_in_formatRule2099); 
			v2=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2103); 
			Vector<Token> vct = new Vector<Token>();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:74: ( CM v3= VAR ( CM v4= VAR )+ )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==CM) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:76: CM v3= VAR ( CM v4= VAR )+
					{
					match(input,CM,FOLLOW_CM_in_formatRule2109); 
					v3=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2113); 
					vct.add(v3);
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:102: ( CM v4= VAR )+
					int cnt49=0;
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==CM) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:103: CM v4= VAR
							{
							match(input,CM,FOLLOW_CM_in_formatRule2118); 
							v4=(Token)match(input,VAR,FOLLOW_VAR_in_formatRule2122); 
							vct.add(v4);
							}
							break;

						default :
							if ( cnt49 >= 1 ) break loop49;
							EarlyExitException eee = new EarlyExitException(49, input);
							throw eee;
						}
						cnt49++;
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_formatRule2131); 
			h.handleFormat(className, functionName, inFor, v1, v2, vct );
			}

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
	public static final BitSet FOLLOW_forInRule_in_forRule1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forIncrRule_in_forRule1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forInRule1067 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_forInRule1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_forInRule1073 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_IN_in_forInRule1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_forInRule1079 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_forInRule1081 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_forInRule1083 = new BitSet(new long[]{0x1F02300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_forInRule1090 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_forInRule1095 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_forInRule1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forIncrRule1116 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_forIncrRule1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_forIncrRule1122 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_forIncrRule1124 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_INTEGER_in_forIncrRule1128 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_forIncrRule1130 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_forIncrRule1132 = new BitSet(new long[]{0x1F02300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_forIncrRule1139 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_forIncrRule1144 = new BitSet(new long[]{0x1F22300400808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_forIncrRule1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_classRule1173 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1177 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_fieldRule_in_classRule1180 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_functionRule_in_classRule1185 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_assignRule_in_classRule1190 = new BitSet(new long[]{0x1F22300404808810L,0x00000000000004F8L});
	public static final BitSet FOLLOW_RCB_in_classRule1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1217 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1226 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1235 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1244 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1253 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1261 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1269 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1277 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1286 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1294 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1303 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_fieldRule1312 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_formatRule_in_fieldRule1319 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_fieldRule1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1351 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldTitleRule1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldText1386 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldText1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1420 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldBlockQuoteRule1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1455 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldOlistRule1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1490 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldUlistRule1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1525 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldTlistRule1535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1555 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LP_in_fieldCodeBlockRule1558 = new BitSet(new long[]{0xFFFBBFFFFFFFFFF0L,0x0000000000000FFFL});
	public static final BitSet FOLLOW_RP_in_fieldCodeBlockRule1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1582 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldCodeBlockRule1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1616 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldTableRule1626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1650 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldImageRule1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1688 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_fieldLinkRule1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_listRule1723 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignVariableRule_in_listRule1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1757 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignVariableRule_in_assignRule1760 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1765 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1770 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1776 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1788 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1793 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1798 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignVariableRule1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_assignVariableRule1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1842 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignString1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1883 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1904 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1908 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1913 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1917 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1924 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1928 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1953 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1961 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1972 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1997 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule2001 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule2008 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule2016 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule2027 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule2050 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule2052 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignListRule2058 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_in_assignListRule2068 = new BitSet(new long[]{0x0080000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule2076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formatRule2093 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_formatRule2095 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FORMAT_in_formatRule2097 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LP_in_formatRule2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule2103 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule2113 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_formatRule2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_VAR_in_formatRule2122 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RP_in_formatRule2131 = new BitSet(new long[]{0x0000000000000002L});
}
