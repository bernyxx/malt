// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-25 19:29:50

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
		"EQ", "EQI", "EQL", "ESC_SEQ", "EX", "EXPONENT", "FLOAT", "FOR", "FORMATTEXT", 
		"FUN", "G", "GET", "HA", "HEX_DIGIT", "HL", "HRULE", "I", "IMG", "IN", 
		"INTEGER", "IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", "LINK", 
		"LIST", "LP", "LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", 
		"RSB", "S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", 
		"ST", "STRING", "SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", 
		"UNICODE_ESC", "US", "VAR", "WS"
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
	public static final int FORMATTEXT=24;
	public static final int FUN=25;
	public static final int G=26;
	public static final int GET=27;
	public static final int HA=28;
	public static final int HEX_DIGIT=29;
	public static final int HL=30;
	public static final int HRULE=31;
	public static final int I=32;
	public static final int IMG=33;
	public static final int IN=34;
	public static final int INTEGER=35;
	public static final int IT=36;
	public static final int ITBOLD=37;
	public static final int L=38;
	public static final int LAB=39;
	public static final int LCB=40;
	public static final int LET=41;
	public static final int LETTER=42;
	public static final int LINK=43;
	public static final int LIST=44;
	public static final int LP=45;
	public static final int LSB=46;
	public static final int OCTAL_ESC=47;
	public static final int OLIST=48;
	public static final int QU=49;
	public static final int R=50;
	public static final int RAB=51;
	public static final int RCB=52;
	public static final int RP=53;
	public static final int RSB=54;
	public static final int S1TITLE=55;
	public static final int S2TITLE=56;
	public static final int S3TITLE=57;
	public static final int S4TITLE=58;
	public static final int S5TITLE=59;
	public static final int SE=60;
	public static final int SL=61;
	public static final int ST=62;
	public static final int STRING=63;
	public static final int SUBS=64;
	public static final int SUPS=65;
	public static final int TABLE=66;
	public static final int TEXT=67;
	public static final int TITLE=68;
	public static final int TLIST=69;
	public static final int ULIST=70;
	public static final int UNICODE_ESC=71;
	public static final int US=72;
	public static final int VAR=73;
	public static final int WS=74;

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:1: parseJava : ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:30:2: ( ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+
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
				case FORMATTEXT:
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
					int LA1_4 = input.LA(2);
					if ( (LA1_4==LP) ) {
						alt1=2;
					}
					else if ( ((LA1_4 >= EQ && LA1_4 <= EQL)) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:20: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava56);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:41: fieldRule[null, null]
					{
					pushFollow(FOLLOW_fieldRule_in_parseJava61);
					fieldRule(null, null);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:65: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava66);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:77: assignRule[null, null]
					{
					pushFollow(FOLLOW_assignRule_in_parseJava70);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava76); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] );
	public final void instrRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule[null, null] )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule )
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule95);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:6: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule103);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:6: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule111);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:6: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule119);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:6: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule126);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:6: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule134);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:6: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule142);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule150);
							tableRule();
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:6: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule158);
							imageRule();
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:6: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule165);
							linkRule();
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:6: listRule[null,null]
							{
							pushFollow(FOLLOW_listRule_in_instrRule173);
							listRule(null, null);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:6: formatText
							{
							pushFollow(FOLLOW_formatText_in_instrRule181);
							formatText();
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule188);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 14 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule194);
							horizontalRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule200); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:11: forRule[null, null]
					{
					pushFollow(FOLLOW_forRule_in_instrRule205);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:1: titleRule : t= titleTypeRule STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:2: (t= titleTypeRule STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: t= titleTypeRule STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule226);
			t=titleTypeRule();
			state._fsp--;

			match(input,STRING,FOLLOW_STRING_in_titleRule228); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:26: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:26: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule230);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule255); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule261); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule267); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule273); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule279); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule285); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:2: ( LCB HA VAR RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule301); 
			match(input,HA,FOLLOW_HA_in_refRule303); 
			match(input,VAR,FOLLOW_VAR_in_refRule305); 
			match(input,RCB,FOLLOW_RCB_in_refRule307); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:1: textDeclRule : t= TEXT STRING ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:2: (t= TEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:3: t= TEXT STRING
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule322); 
			match(input,STRING,FOLLOW_STRING_in_textDeclRule324); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:1: blockquoteRule : t= BLOCKQUOTE STRING ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:2: (t= BLOCKQUOTE STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:3: t= BLOCKQUOTE STRING
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule344); 
			match(input,STRING,FOLLOW_STRING_in_blockquoteRule346); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:1: olistRule : t= OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:2: (t= OLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:92:3: t= OLIST textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule365); 
			pushFollow(FOLLOW_textListRule_in_olistRule367);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule388); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule392); 
			String cicle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:52: (t1= CM t2= STRING )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:53: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_textListRule399); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule403); 
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

			v3=(Token)match(input,RP,FOLLOW_RP_in_textListRule411); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:1: ulistRule : t= ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:2: (t= ULIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:3: t= ULIST textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule428); 
			pushFollow(FOLLOW_textListRule_in_ulistRule430);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:1: tlistRule : t= TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:2: (t= TLIST textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:111:3: t= TLIST textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule450); 
			pushFollow(FOLLOW_textListRule_in_tlistRule452);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:1: codeBlockRule : t= CODEBLOCK ( STRING )? STRING ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:2: (t= CODEBLOCK ( STRING )? STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:3: t= CODEBLOCK ( STRING )? STRING
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule472); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:15: ( STRING )?
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:15: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_codeBlockRule474); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_codeBlockRule477); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:123:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:2: ( HRULE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule494); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:1: linkRule : t= LINK LP ( STRING | imageRule ) CM STRING RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:2: (t= LINK LP ( STRING | imageRule ) CM STRING RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:3: t= LINK LP ( STRING | imageRule ) CM STRING RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule514); 
			match(input,LP,FOLLOW_LP_in_linkRule516); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:13: ( STRING | imageRule )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:14: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_linkRule519); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:23: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule523);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule526); 
			match(input,STRING,FOLLOW_STRING_in_linkRule528); 
			match(input,RP,FOLLOW_RP_in_linkRule530); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule553); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule557); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule561); 
			String cycle = v3.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:58: (t1= CM t2= STRING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:59: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_imageRule568); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule572); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_imageRule580); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:2: ( LAB STRING RAB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule599); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule601); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule603); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:151:1: tableRule : t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:2: (t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:3: t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule622); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:11: ( talignmentRule )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:11: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule624);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule627); 
			pushFollow(FOLLOW_trowRule_in_tableRule629);
			trowRule();
			state._fsp--;

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:39: ( CM trowRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:40: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule632); 
					pushFollow(FOLLOW_trowRule_in_tableRule634);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule638); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule661); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule665);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:44: (t1= CM t2= alignRule )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:45: t1= CM t2= alignRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_talignmentRule672); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule676);
					t2=alignRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop12;
				}
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_talignmentRule684); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: ( (v= L |v= C |v= R ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: (v= L |v= C |v= R )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: (v= L |v= C |v= R )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule706); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule712); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:16: v= R
					{
					v=(Token)match(input,R,FOLLOW_R_in_alignRule718); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule740); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule744); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:52: (v3= CM v4= STRING )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:53: v3= CM v4= STRING
					{
					v3=(Token)match(input,CM,FOLLOW_CM_in_trowRule751); 
					v4=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule755); 
					cycle = cycle + v3.getText() + v4.getText();
					}
					break;

				default :
					break loop14;
				}
			}

			v5=(Token)match(input,RSB,FOLLOW_RSB_in_trowRule763); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:1: formatText : t= FORMATTEXT STRING ;
	public final void formatText() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:2: (t= FORMATTEXT STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:3: t= FORMATTEXT STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatText780); 
			match(input,STRING,FOLLOW_STRING_in_formatText782); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule803); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule807); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule811); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:50: ( argumentsRule[className, $n] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BLOCKQUOTE||LA15_0==CODEBLOCK||LA15_0==FORMATTEXT||LA15_0==IMG||(LA15_0 >= LINK && LA15_0 <= LIST)||LA15_0==OLIST||(LA15_0 >= S1TITLE && LA15_0 <= S5TITLE)||(LA15_0 >= TABLE && LA15_0 <= ULIST)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule814);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule819); 
			match(input,LCB,FOLLOW_LCB_in_functionRule821); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:89: ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||LA16_0==DOTVAR||(LA16_0 >= FOR && LA16_0 <= FORMATTEXT)||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)) ) {
					alt16=1;
				}
				else if ( (LA16_0==VAR) ) {
					int LA16_3 = input.LA(2);
					if ( (LA16_3==LP) ) {
						alt16=1;
					}
					else if ( ((LA16_3 >= EQ && LA16_3 <= EQL)) ) {
						alt16=2;
					}

				}

				switch (alt16) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:90: ( fieldRule[className,$n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:90: ( fieldRule[className,$n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:91: fieldRule[className,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule825);
					fieldRule(className, n);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:118: ( assignRule[className, $n] )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:118: ( assignRule[className, $n] )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:119: assignRule[className, $n]
					{
					pushFollow(FOLLOW_assignRule_in_functionRule832);
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

			match(input,RCB,FOLLOW_RCB_in_functionRule838); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:1: argumentsRule[Token className, Token functionName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule865);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule869); 
			h.declareArg(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:78: ( CM t= argumentTypeRule n= VAR )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CM) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:79: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule874); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule878);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule882); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule906);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule914); 
					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule920); 
					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule926); 
					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule932); 
					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule938); 
					}
					break;
				case 7 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule944); 
					}
					break;
				case 8 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule950); 
					}
					break;
				case 9 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule956); 
					}
					break;
				case 10 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule962); 
					}
					break;
				case 11 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule968); 
					}
					break;
				case 12 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule974); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:1: functionCallRule[Token className, Token functionName] : (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP ;
	public final void functionCallRule(Token className, Token functionName) throws RecognitionException {
		Token v1=null;
		Token t1=null;
		Token t2=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:2: ( (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:3: (v1= VAR |v1= DOTVAR ) LP (t1= VAR ( CM t2= VAR )* )? RP
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:3: (v1= VAR |v1= DOTVAR )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:4: v1= VAR
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule994); 
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:13: v1= DOTVAR
					{
					v1=(Token)match(input,DOTVAR,FOLLOW_DOTVAR_in_functionCallRule1000); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionCallRule1003); 
			Vector<String> vct = new Vector<String>();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:72: (t1= VAR ( CM t2= VAR )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:73: t1= VAR ( CM t2= VAR )*
					{
					t1=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule1010); 
					vct.add(t1.getText());
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:106: ( CM t2= VAR )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CM) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:107: CM t2= VAR
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule1015); 
							t2=(Token)match(input,VAR,FOLLOW_VAR_in_functionCallRule1019); 
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

			match(input,RP,FOLLOW_RP_in_functionCallRule1027); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:1: forRule[Token className, Token functionName ] : FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB ;
	public final void forRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:2: ( FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:3: FOR LP VAR IN VAR RP LCB ( fieldRule[className, functionName] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1044); 
			match(input,LP,FOLLOW_LP_in_forRule1046); 
			match(input,VAR,FOLLOW_VAR_in_forRule1048); 
			match(input,IN,FOLLOW_IN_in_forRule1050); 
			match(input,VAR,FOLLOW_VAR_in_forRule1052); 
			match(input,RP,FOLLOW_RP_in_forRule1054); 
			match(input,LCB,FOLLOW_LCB_in_forRule1056); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:28: ( fieldRule[className, functionName] )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BLOCKQUOTE||LA22_0==CODEBLOCK||LA22_0==DOTVAR||(LA22_0 >= FOR && LA22_0 <= FORMATTEXT)||LA22_0==IMG||(LA22_0 >= LINK && LA22_0 <= LIST)||LA22_0==OLIST||(LA22_0 >= S1TITLE && LA22_0 <= S5TITLE)||(LA22_0 >= TABLE && LA22_0 <= ULIST)||LA22_0==VAR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:45: fieldRule[className, functionName]
					{
					pushFollow(FOLLOW_fieldRule_in_forRule1061);
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

			match(input,RCB,FOLLOW_RCB_in_forRule1066); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:2: (f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] )* RCB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:3: f= CLASS n= VAR LCB ( fieldRule[$n,null] | functionRule[$n] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1085); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1089); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule1093); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:49: ( fieldRule[$n,null] | functionRule[$n] )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==BLOCKQUOTE||LA23_0==CODEBLOCK||LA23_0==DOTVAR||(LA23_0 >= FOR && LA23_0 <= FORMATTEXT)||LA23_0==IMG||(LA23_0 >= LINK && LA23_0 <= LIST)||LA23_0==OLIST||(LA23_0 >= S1TITLE && LA23_0 <= S5TITLE)||(LA23_0 >= TABLE && LA23_0 <= ULIST)||LA23_0==VAR) ) {
					alt23=1;
				}
				else if ( (LA23_0==FUN) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:50: fieldRule[$n,null]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1096);
					fieldRule(n, null);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:71: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1101);
					functionRule(n);
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1106); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:1: fieldRule[Token className, Token functionName] : ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] ) SE ) | forRule[className, functionName] );
	public final void fieldRule(Token className, Token functionName) throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:2: ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] ) SE ) | forRule[className, functionName] )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==BLOCKQUOTE||LA25_0==CODEBLOCK||LA25_0==DOTVAR||LA25_0==FORMATTEXT||LA25_0==IMG||(LA25_0 >= LINK && LA25_0 <= LIST)||LA25_0==OLIST||(LA25_0 >= S1TITLE && LA25_0 <= S5TITLE)||(LA25_0 >= TABLE && LA25_0 <= ULIST)||LA25_0==VAR) ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] ) SE )
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] ) SE )
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] ) SE
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] | functionCallRule[className, functionName] )
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
					case FORMATTEXT:
						{
						alt24=12;
						}
						break;
					case DOTVAR:
					case VAR:
						{
						alt24=13;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:6: fieldTitleRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1128);
							fieldTitleRule(className, functionName);
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:5: fieldText[className, functionName]
							{
							pushFollow(FOLLOW_fieldText_in_fieldRule1137);
							fieldText(className, functionName);
							state._fsp--;

							}
							break;
						case 3 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:5: fieldBlockQuoteRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1146);
							fieldBlockQuoteRule(className, functionName);
							state._fsp--;

							}
							break;
						case 4 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:5: fieldOlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1155);
							fieldOlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 5 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:5: fieldUlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1164);
							fieldUlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 6 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:5: fieldTlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1172);
							fieldTlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 7 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:5: fieldCodeBlockRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1180);
							fieldCodeBlockRule(className, functionName);
							state._fsp--;

							}
							break;
						case 8 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:5: fieldTableRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTableRule_in_fieldRule1188);
							fieldTableRule(className, functionName);
							state._fsp--;

							}
							break;
						case 9 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:5: fieldImageRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldImageRule_in_fieldRule1197);
							fieldImageRule(className, functionName);
							state._fsp--;

							}
							break;
						case 10 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:5: fieldLinkRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1205);
							fieldLinkRule(className, functionName);
							state._fsp--;

							}
							break;
						case 11 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:5: listRule[className, functionName]
							{
							pushFollow(FOLLOW_listRule_in_fieldRule1214);
							listRule(className, functionName);
							state._fsp--;

							}
							break;
						case 12 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:5: fieldFormatText[className, functionName]
							{
							pushFollow(FOLLOW_fieldFormatText_in_fieldRule1223);
							fieldFormatText(className, functionName);
							state._fsp--;

							}
							break;
						case 13 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:5: functionCallRule[className, functionName]
							{
							pushFollow(FOLLOW_functionCallRule_in_fieldRule1231);
							functionCallRule(className, functionName);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_fieldRule1235); 
					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:54: forRule[className, functionName]
					{
					pushFollow(FOLLOW_forRule_in_fieldRule1240);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:1: fieldTitleRule[Token className, Token functionName] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? ;
	public final void fieldTitleRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1258);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1262); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:75: ( assignTitleRule[$className, $functionName, $n] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EQ) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:76: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1267);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:1: fieldText[Token className, Token functionName] : t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:2: (t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:3: t= TEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1289); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1293); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:65: ( assignString[$className, $functionName, $n] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:66: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldText1298);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:1: fieldBlockQuoteRule[Token className, Token functionName] : t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldBlockQuoteRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:2: (t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:3: t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1318); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1322); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:72: ( assignString[$className, $functionName, $n] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:73: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1328);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:1: fieldOlistRule[Token className, Token functionName] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldOlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1348); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1352); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==EQ) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1357);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:1: fieldUlistRule[Token className, Token functionName] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldUlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1378); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1382); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==EQ) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1387);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:1: fieldTlistRule[Token className, Token functionName] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldTlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1408); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1412); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1417);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:1: fieldCodeBlockRule[Token className, Token functionName] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldCodeBlockRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1437); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LP) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_fieldCodeBlockRule1440); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:19: (~ ( LP | RP | '\"' ) )*
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

					match(input,RP,FOLLOW_RP_in_fieldCodeBlockRule1458); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1464); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:100: ( assignString[$className, $functionName, $n] )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:101: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1470);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:1: fieldTableRule[Token className, Token functionName] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? ;
	public final void fieldTableRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1490); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1494); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:66: ( assignTableRule[$className, $functionName, $n] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQ) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:67: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1499);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:1: fieldImageRule[Token className, Token functionName] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? ;
	public final void fieldImageRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1519); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1523); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:64: ( assignImageRule[$className, $functionName, $n] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQI) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:65: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1528);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:1: fieldLinkRule[Token className, Token functionName] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule(Token className, Token functionName) throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1552); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1556); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:65: ( assignLinkRule[$className, $functionName, $n] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQL) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:66: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1561);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:1: fieldFormatText[Token className, Token functionName] : t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldFormatText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:301:2: (t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:3: t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_fieldFormatText1581); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldFormatText1585); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:71: ( assignString[$className, $functionName, $n] )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==EQ) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:72: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldFormatText1590);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:1: listRule[Token className, Token functionName] : t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? ;
	public final void listRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1610); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1614); 
			h.declareNew(className, functionName, t, n);
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:65: ( assignListRule[$className, $functionName, $n] )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==EQ) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:66: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1619);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:1: assignRule[Token className, Token functionName] : n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE ;
	public final void assignRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:315:2: (n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:2: n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1644); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:8: ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] )
			int alt40=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case STRING:
					{
					alt40=1;
					}
					break;
				case LSB:
					{
					int LA40_5 = input.LA(3);
					if ( (LA40_5==STRING) ) {
						alt40=6;
					}
					else if ( (LA40_5==C||LA40_5==L||LA40_5==R) ) {
						alt40=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LP:
					{
					int LA40_6 = input.LA(3);
					if ( (LA40_6==STRING) ) {
						alt40=2;
					}
					else if ( (LA40_6==LSB) ) {
						alt40=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 6, input);
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
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt40=4;
				}
				break;
			case EQL:
				{
				alt40=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:9: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1647);
					assignTitleRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:58: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1652);
					assignTextListRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:316:111: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1658);
					assignTableRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:317:9: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1669);
					assignImageRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:317:58: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1674);
					assignLinkRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:317:106: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1679);
					assignListRule(className, functionName, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1684); 
			}

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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:321:1: assignTitleRule[Token className, Token functionName, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:322:2: ( EQ v= STRING ( refRule )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1699); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1703); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:15: ( refRule )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LCB) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:323:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1705);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:327:1: assignString[Token className, Token functionName, Token name] : EQ v= STRING ;
	public final void assignString(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:328:2: ( EQ v= STRING )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:329:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1723); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1727); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:333:1: assignTextListRule[Token className, Token functionName, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, Token name) throws RecognitionException {
		String v =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:334:2: ( EQ v= textListRule )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:335:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1744); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1748);
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:339:1: assignTableRule[Token className, Token functionName, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:340:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1765); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:8: (v1= talignmentRule )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==LSB) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1769);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1774); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1778);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:64: (t1= CM t2= trowRule )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==CM) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:341:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1785); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1789);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop43;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1797); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:345:1: assignImageRule[Token className, Token functionName, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:346:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:347:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1814); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1818); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1822); 
			String opt="";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:347:40: (o1= CM o2= STRING )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==CM) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:347:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1829); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1833); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1841); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:351:1: assignLinkRule[Token className, Token functionName, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:352:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:353:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1858); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1862); 
			String v2 = "";
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:353:31: (t= STRING |ir= imageRule )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==STRING) ) {
				alt45=1;
			}
			else if ( (LA45_0==IMG) ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:353:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1869); 
					v2=t.getText();
					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:353:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1877);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1884); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1888); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1892); 
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
	// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:358:1: assignListRule[Token className, Token functionName, Token name] : EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB ;
	public final void assignListRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:359:2: ( EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:360:3: EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB
			{
			match(input,EQ,FOLLOW_EQ_in_assignListRule1909); 
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_assignListRule1913); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1917); 
			String cycle = v2.getText();
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:360:55: (t1= CM t2= STRING )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:360:56: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignListRule1924); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1928); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt46 >= 1 ) break loop46;
					EarlyExitException eee = new EarlyExitException(46, input);
					throw eee;
				}
				cnt46++;
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_assignListRule1936); 
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

	// Delegated rules



	public static final BitSet FOLLOW_functionRule_in_parseJava56 = new BitSet(new long[]{0x0F81180203808910L,0x000000000000027CL});
	public static final BitSet FOLLOW_fieldRule_in_parseJava61 = new BitSet(new long[]{0x0F81180203808910L,0x000000000000027CL});
	public static final BitSet FOLLOW_classRule_in_parseJava66 = new BitSet(new long[]{0x0F81180203808910L,0x000000000000027CL});
	public static final BitSet FOLLOW_assignRule_in_parseJava70 = new BitSet(new long[]{0x0F81180203808910L,0x000000000000027CL});
	public static final BitSet FOLLOW_EOF_in_parseJava76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule95 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule103 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule111 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule119 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule126 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule134 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule142 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule150 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule158 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule165 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule173 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_formatText_in_instrRule181 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule188 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule194 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule226 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule228 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule301 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_HA_in_refRule303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_refRule305 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule322 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textDeclRule324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule344 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_blockquoteRule346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule365 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule388 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule392 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule399 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule403 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule428 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule450 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule472 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule474 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule514 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule516 = new BitSet(new long[]{0x8000000200000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule519 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule523 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule526 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule528 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule553 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule557 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule561 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule568 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule572 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule599 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule601 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule622 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule624 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule627 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule629 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule632 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule634 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule661 = new BitSet(new long[]{0x0004004000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule665 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule672 = new BitSet(new long[]{0x0004004000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule676 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule740 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule744 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule751 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule755 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatText780 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatText782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_functionRule807 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule811 = new BitSet(new long[]{0x0FA1180201000810L,0x000000000000007CL});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule814 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule819 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule821 = new BitSet(new long[]{0x0F81180201808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_fieldRule_in_functionRule825 = new BitSet(new long[]{0x0F91180201808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_assignRule_in_functionRule832 = new BitSet(new long[]{0x0F91180201808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_RCB_in_functionRule838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule869 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule874 = new BitSet(new long[]{0x0F81180201000810L,0x000000000000007CL});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule882 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule994 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTVAR_in_functionCallRule1000 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule1003 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule1010 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_functionCallRule1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_functionCallRule1019 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RP_in_functionCallRule1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1044 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_forRule1048 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_IN_in_forRule1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_forRule1052 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1054 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1056 = new BitSet(new long[]{0x0F81180201808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_fieldRule_in_forRule1061 = new BitSet(new long[]{0x0F91180201808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_RCB_in_forRule1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_classRule1089 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1093 = new BitSet(new long[]{0x0F91180203808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1096 = new BitSet(new long[]{0x0F91180203808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_functionRule_in_classRule1101 = new BitSet(new long[]{0x0F91180203808810L,0x000000000000027CL});
	public static final BitSet FOLLOW_RCB_in_classRule1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1128 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1137 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1146 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1155 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1164 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1172 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1180 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1188 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1197 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1205 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1214 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_fieldFormatText_in_fieldRule1223 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_functionCallRule_in_fieldRule1231 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_fieldRule1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1262 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldText1293 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1322 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1352 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1382 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1412 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1437 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LP_in_fieldCodeBlockRule1440 = new BitSet(new long[]{0xFFFDDFFFFFFFFFF0L,0x00000000000007FFL});
	public static final BitSet FOLLOW_RP_in_fieldCodeBlockRule1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1464 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1494 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1523 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1556 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_fieldFormatText1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_fieldFormatText1585 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignString_in_fieldFormatText1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_listRule1614 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1644 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1647 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1652 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1658 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1669 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1674 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1679 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1699 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1703 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1723 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignString1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1744 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1765 = new BitSet(new long[]{0x0000600000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1769 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1774 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1778 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1785 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1789 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1814 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1818 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1822 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1829 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1833 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1858 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1862 = new BitSet(new long[]{0x8000000200000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1869 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1877 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1884 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1888 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1909 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1913 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1917 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1924 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1928 = new BitSet(new long[]{0x0040000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1936 = new BitSet(new long[]{0x0000000000000002L});
}
