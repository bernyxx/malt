// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-23 19:36:54

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCKQUOTE", "BOLD", "C", "CL", 
		"CLASS", "CM", "CODE", "CODEBLOCK", "COMMENT", "DIGIT", "DO", "EQ", "EQI", 
		"EQL", "ESC_SEQ", "EX", "EXPONENT", "FLOAT", "FOR", "FORMATTEXT", "FUN", 
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
	public static final int EQI=16;
	public static final int EQL=17;
	public static final int ESC_SEQ=18;
	public static final int EX=19;
	public static final int EXPONENT=20;
	public static final int FLOAT=21;
	public static final int FOR=22;
	public static final int FORMATTEXT=23;
	public static final int FUN=24;
	public static final int G=25;
	public static final int GET=26;
	public static final int HA=27;
	public static final int HEX_DIGIT=28;
	public static final int HL=29;
	public static final int HRULE=30;
	public static final int I=31;
	public static final int IMG=32;
	public static final int IN=33;
	public static final int INTEGER=34;
	public static final int IT=35;
	public static final int ITBOLD=36;
	public static final int L=37;
	public static final int LAB=38;
	public static final int LCB=39;
	public static final int LET=40;
	public static final int LETTER=41;
	public static final int LINK=42;
	public static final int LIST=43;
	public static final int LP=44;
	public static final int LSB=45;
	public static final int OCTAL_ESC=46;
	public static final int OLIST=47;
	public static final int QU=48;
	public static final int R=49;
	public static final int RAB=50;
	public static final int RCB=51;
	public static final int RP=52;
	public static final int RSB=53;
	public static final int S1TITLE=54;
	public static final int S2TITLE=55;
	public static final int S3TITLE=56;
	public static final int S4TITLE=57;
	public static final int S5TITLE=58;
	public static final int SE=59;
	public static final int SL=60;
	public static final int ST=61;
	public static final int STRING=62;
	public static final int SUBS=63;
	public static final int SUPS=64;
	public static final int TABLE=65;
	public static final int TEXT=66;
	public static final int TITLE=67;
	public static final int TLIST=68;
	public static final int ULIST=69;
	public static final int UNICODE_ESC=70;
	public static final int US=71;
	public static final int VAR=72;
	public static final int WS=73;

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:1: parseJava : ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF ;
	public final void parseJava() throws RecognitionException {
		initHandler();
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:2: ( ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:3: ( functionRule[null] | fieldRule[null, null] | classRule | assignRule[null, null] )+
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
				case CLASS:
					{
					alt1=3;
					}
					break;
				case VAR:
					{
					alt1=4;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:20: functionRule[null]
					{
					pushFollow(FOLLOW_functionRule_in_parseJava56);
					functionRule(null);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:41: fieldRule[null, null]
					{
					pushFollow(FOLLOW_fieldRule_in_parseJava61);
					fieldRule(null, null);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:65: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava66);
					classRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:77: assignRule[null, null]
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule );
	public final void instrRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE ) | forRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | tableRule | imageRule | linkRule | listRule[null,null] | formatText | quickLinkRule | horizontalRule )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule95);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:6: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule103);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:6: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule111);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:6: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule119);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:6: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule126);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:6: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule134);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:6: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule142);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:6: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule150);
							tableRule();
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:6: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule158);
							imageRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:6: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule165);
							linkRule();
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:6: listRule[null,null]
							{
							pushFollow(FOLLOW_listRule_in_instrRule173);
							listRule(null, null);
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:6: formatText
							{
							pushFollow(FOLLOW_formatText_in_instrRule181);
							formatText();
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule188);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 14 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:5: horizontalRule
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule205);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:1: titleRule : t= titleTypeRule STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:2: (t= titleTypeRule STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:3: t= titleTypeRule STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule226);
			t=titleTypeRule();
			state._fsp--;

			match(input,STRING,FOLLOW_STRING_in_titleRule228); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:26: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:26: refRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule255); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule261); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule267); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule273); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule279); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:62: t= S5TITLE
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: LCB HA VAR RCB
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:1: textDeclRule : t= TEXT STRING ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:2: (t= TEXT STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:3: t= TEXT STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:1: blockquoteRule : t= BLOCKQUOTE STRING ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:2: (t= BLOCKQUOTE STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:3: t= BLOCKQUOTE STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:1: olistRule : t= OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:2: (t= OLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:3: t= OLIST textListRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:1: textListRule returns [String value] : v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP ;
	public final String textListRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:2: (v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:4: v1= LP v2= STRING (t1= CM t2= STRING )+ v3= RP
			{
			v1=(Token)match(input,LP,FOLLOW_LP_in_textListRule388); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_textListRule392); 
			String cicle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:52: (t1= CM t2= STRING )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:53: t1= CM t2= STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:1: ulistRule : t= ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:2: (t= ULIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:3: t= ULIST textListRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:106:1: tlistRule : t= TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:2: (t= TLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:3: t= TLIST textListRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:1: codeBlockRule : t= CODEBLOCK ( STRING )? STRING ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:2: (t= CODEBLOCK ( STRING )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:3: t= CODEBLOCK ( STRING )? STRING
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule472); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:15: ( STRING )?
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:15: STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:3: HRULE
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:1: linkRule : t= LINK LP ( STRING | imageRule ) CM STRING RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:128:2: (t= LINK LP ( STRING | imageRule ) CM STRING RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:3: t= LINK LP ( STRING | imageRule ) CM STRING RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule514); 
			match(input,LP,FOLLOW_LP_in_linkRule516); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:13: ( STRING | imageRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:14: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_linkRule519); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:23: imageRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:1: imageRule returns [String value] : v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP ;
	public final String imageRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token t1=null;
		Token t2=null;
		Token v4=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:2: (v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:3: v1= IMG v2= LP v3= STRING (t1= CM t2= STRING )? v4= RP
			{
			v1=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule553); 
			v2=(Token)match(input,LP,FOLLOW_LP_in_imageRule557); 
			v3=(Token)match(input,STRING,FOLLOW_STRING_in_imageRule561); 
			String cycle = v3.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:58: (t1= CM t2= STRING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:59: t1= CM t2= STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:2: ( LAB STRING RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:3: LAB STRING RAB
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:1: tableRule : t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:2: (t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:3: t= TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule622); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:11: ( talignmentRule )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:11: talignmentRule
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

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:39: ( CM trowRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:40: CM trowRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:1: talignmentRule returns [String value] : v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB ;
	public final String talignmentRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token t1=null;
		Token v3=null;
		String v2 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:2: (v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:3: v1= LSB v2= alignRule (t1= CM t2= alignRule )* v3= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_talignmentRule661); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule665);
			v2=alignRule();
			state._fsp--;

			String cycle = v2;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:44: (t1= CM t2= alignRule )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:45: t1= CM t2= alignRule
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:1: alignRule returns [String value] : (v= L |v= C |v= R ) ;
	public final String alignRule() throws RecognitionException {
		String value = null;


		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:2: ( (v= L |v= C |v= R ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:3: (v= L |v= C |v= R )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:3: (v= L |v= C |v= R )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:4: v= L
					{
					v=(Token)match(input,L,FOLLOW_L_in_alignRule706); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:10: v= C
					{
					v=(Token)match(input,C,FOLLOW_C_in_alignRule712); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:16: v= R
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:1: trowRule returns [String value] : v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB ;
	public final String trowRule() throws RecognitionException {
		String value = null;


		Token v1=null;
		Token v2=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:2: (v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:3: v1= LSB v2= STRING (v3= CM v4= STRING )* v5= RSB
			{
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_trowRule740); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_trowRule744); 
			String cycle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:52: (v3= CM v4= STRING )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:53: v3= CM v4= STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:1: formatText : t= FORMATTEXT STRING ;
	public final void formatText() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:2: (t= FORMATTEXT STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:3: t= FORMATTEXT STRING
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:1: functionRule[Token className] : f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB ;
	public final void functionRule(Token className) throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:2: (f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:3: f= FUN n= VAR LP ( argumentsRule[className, $n] )? RP LCB ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+ RCB
			{
			f=(Token)match(input,FUN,FOLLOW_FUN_in_functionRule803); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule807); 
			h.declareFunCl(className,n);
			match(input,LP,FOLLOW_LP_in_functionRule811); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:50: ( argumentsRule[className, $n] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BLOCKQUOTE||LA15_0==CODEBLOCK||LA15_0==FORMATTEXT||LA15_0==IMG||(LA15_0 >= LINK && LA15_0 <= LIST)||LA15_0==OLIST||(LA15_0 >= S1TITLE && LA15_0 <= S5TITLE)||(LA15_0 >= TABLE && LA15_0 <= ULIST)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:51: argumentsRule[className, $n]
					{
					pushFollow(FOLLOW_argumentsRule_in_functionRule814);
					argumentsRule(className, n);
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionRule819); 
			match(input,LCB,FOLLOW_LCB_in_functionRule821); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:89: ( ( fieldRule[className,$n] ) | ( assignRule[className, $n] ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==BLOCKQUOTE||LA16_0==CODEBLOCK||(LA16_0 >= FOR && LA16_0 <= FORMATTEXT)||LA16_0==IMG||(LA16_0 >= LINK && LA16_0 <= LIST)||LA16_0==OLIST||(LA16_0 >= S1TITLE && LA16_0 <= S5TITLE)||(LA16_0 >= TABLE && LA16_0 <= ULIST)) ) {
					alt16=1;
				}
				else if ( (LA16_0==VAR) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:90: ( fieldRule[className,$n] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:90: ( fieldRule[className,$n] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:91: fieldRule[className,$n]
					{
					pushFollow(FOLLOW_fieldRule_in_functionRule825);
					fieldRule(className, n);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:118: ( assignRule[className, $n] )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:118: ( assignRule[className, $n] )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:119: assignRule[className, $n]
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:1: argumentsRule[Token className, Token funcName] : t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* ;
	public final void argumentsRule(Token className, Token funcName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:2: (t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )* )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:3: t= argumentTypeRule n= VAR ( CM t= argumentTypeRule n= VAR )*
			{
			pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule861);
			t=argumentTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule865); 
			h.declareArg(className, funcName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:74: ( CM t= argumentTypeRule n= VAR )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CM) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:75: CM t= argumentTypeRule n= VAR
					{
					match(input,CM,FOLLOW_CM_in_argumentsRule870); 
					pushFollow(FOLLOW_argumentTypeRule_in_argumentsRule874);
					t=argumentTypeRule();
					state._fsp--;

					n=(Token)match(input,VAR,FOLLOW_VAR_in_argumentsRule878); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:1: argumentTypeRule returns [Token type] : (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) ;
	public final Token argumentTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;
		Token res =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:2: ( (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:3: (res= titleTypeRule |t= TEXT |t= BLOCKQUOTE |t= OLIST |t= ULIST |t= TLIST |t= CODEBLOCK |t= LINK |t= IMG |t= TABLE |t= FORMATTEXT |t= LIST )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:4: res= titleTypeRule
					{
					pushFollow(FOLLOW_titleTypeRule_in_argumentTypeRule902);
					res=titleTypeRule();
					state._fsp--;

					t = res;
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:35: t= TEXT
					{
					t=(Token)match(input,TEXT,FOLLOW_TEXT_in_argumentTypeRule910); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:44: t= BLOCKQUOTE
					{
					t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_argumentTypeRule916); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:59: t= OLIST
					{
					t=(Token)match(input,OLIST,FOLLOW_OLIST_in_argumentTypeRule922); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:69: t= ULIST
					{
					t=(Token)match(input,ULIST,FOLLOW_ULIST_in_argumentTypeRule928); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:79: t= TLIST
					{
					t=(Token)match(input,TLIST,FOLLOW_TLIST_in_argumentTypeRule934); 
					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:89: t= CODEBLOCK
					{
					t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_argumentTypeRule940); 
					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:103: t= LINK
					{
					t=(Token)match(input,LINK,FOLLOW_LINK_in_argumentTypeRule946); 
					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:112: t= IMG
					{
					t=(Token)match(input,IMG,FOLLOW_IMG_in_argumentTypeRule952); 
					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:120: t= TABLE
					{
					t=(Token)match(input,TABLE,FOLLOW_TABLE_in_argumentTypeRule958); 
					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:130: t= FORMATTEXT
					{
					t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_argumentTypeRule964); 
					}
					break;
				case 12 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:145: t= LIST
					{
					t=(Token)match(input,LIST,FOLLOW_LIST_in_argumentTypeRule970); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:1: forRule : FOR LP VAR IN VAR RP LCB ( fieldRule[null,null] )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:2: ( FOR LP VAR IN VAR RP LCB ( fieldRule[null,null] )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:3: FOR LP VAR IN VAR RP LCB ( fieldRule[null,null] )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule986); 
			match(input,LP,FOLLOW_LP_in_forRule988); 
			match(input,VAR,FOLLOW_VAR_in_forRule990); 
			match(input,IN,FOLLOW_IN_in_forRule992); 
			match(input,VAR,FOLLOW_VAR_in_forRule994); 
			match(input,RP,FOLLOW_RP_in_forRule996); 
			match(input,LCB,FOLLOW_LCB_in_forRule998); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:28: ( fieldRule[null,null] )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==BLOCKQUOTE||LA19_0==CODEBLOCK||(LA19_0 >= FOR && LA19_0 <= FORMATTEXT)||LA19_0==IMG||(LA19_0 >= LINK && LA19_0 <= LIST)||LA19_0==OLIST||(LA19_0 >= S1TITLE && LA19_0 <= S5TITLE)||(LA19_0 >= TABLE && LA19_0 <= ULIST)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:45: fieldRule[null,null]
					{
					pushFollow(FOLLOW_fieldRule_in_forRule1003);
					fieldRule(null, null);
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

			match(input,RCB,FOLLOW_RCB_in_forRule1008); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:1: classRule : f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB ;
	public final void classRule() throws RecognitionException {
		Token f=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:2: (f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:3: f= CLASS n= VAR LCB ( fieldRule[$n,null] )* ( functionRule[$n] )* RCB
			{
			f=(Token)match(input,CLASS,FOLLOW_CLASS_in_classRule1028); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_classRule1032); 
			h.declareFunCl(n, null);
			match(input,LCB,FOLLOW_LCB_in_classRule1036); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:49: ( fieldRule[$n,null] )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BLOCKQUOTE||LA20_0==CODEBLOCK||(LA20_0 >= FOR && LA20_0 <= FORMATTEXT)||LA20_0==IMG||(LA20_0 >= LINK && LA20_0 <= LIST)||LA20_0==OLIST||(LA20_0 >= S1TITLE && LA20_0 <= S5TITLE)||(LA20_0 >= TABLE && LA20_0 <= ULIST)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:49: fieldRule[$n,null]
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1038);
					fieldRule(n, null);
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:69: ( functionRule[$n] )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==FUN) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:70: functionRule[$n]
					{
					pushFollow(FOLLOW_functionRule_in_classRule1043);
					functionRule(n);
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1048); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:1: fieldRule[Token className, Token functionName] : ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE ) | forRule );
	public final void fieldRule(Token className, Token functionName) throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:2: ( ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE ) | forRule )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==BLOCKQUOTE||LA23_0==CODEBLOCK||LA23_0==FORMATTEXT||LA23_0==IMG||(LA23_0 >= LINK && LA23_0 <= LIST)||LA23_0==OLIST||(LA23_0 >= S1TITLE && LA23_0 <= S5TITLE)||(LA23_0 >= TABLE && LA23_0 <= ULIST)) ) {
				alt23=1;
			}
			else if ( (LA23_0==FOR) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:3: ( ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:4: ( fieldTitleRule[className, functionName] | fieldText[className, functionName] | fieldBlockQuoteRule[className, functionName] | fieldOlistRule[className, functionName] | fieldUlistRule[className, functionName] | fieldTlistRule[className, functionName] | fieldCodeBlockRule[className, functionName] | fieldTableRule[className, functionName] | fieldImageRule[className, functionName] | fieldLinkRule[className, functionName] | listRule[className, functionName] | fieldFormatText[className, functionName] )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:6: fieldTitleRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTitleRule_in_fieldRule1070);
							fieldTitleRule(className, functionName);
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:5: fieldText[className, functionName]
							{
							pushFollow(FOLLOW_fieldText_in_fieldRule1079);
							fieldText(className, functionName);
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:5: fieldBlockQuoteRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldBlockQuoteRule_in_fieldRule1088);
							fieldBlockQuoteRule(className, functionName);
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:5: fieldOlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1097);
							fieldOlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:5: fieldUlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1106);
							fieldUlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:5: fieldTlistRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1114);
							fieldTlistRule(className, functionName);
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:5: fieldCodeBlockRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldCodeBlockRule_in_fieldRule1122);
							fieldCodeBlockRule(className, functionName);
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:5: fieldTableRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldTableRule_in_fieldRule1130);
							fieldTableRule(className, functionName);
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:5: fieldImageRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldImageRule_in_fieldRule1139);
							fieldImageRule(className, functionName);
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:5: fieldLinkRule[className, functionName]
							{
							pushFollow(FOLLOW_fieldLinkRule_in_fieldRule1147);
							fieldLinkRule(className, functionName);
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:5: listRule[className, functionName]
							{
							pushFollow(FOLLOW_listRule_in_fieldRule1156);
							listRule(className, functionName);
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:5: fieldFormatText[className, functionName]
							{
							pushFollow(FOLLOW_fieldFormatText_in_fieldRule1165);
							fieldFormatText(className, functionName);
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_fieldRule1170); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:54: forRule
					{
					pushFollow(FOLLOW_forRule_in_fieldRule1175);
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
	// $ANTLR end "fieldRule"



	// $ANTLR start "fieldTitleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:1: fieldTitleRule[Token className, Token functionName] : t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? ;
	public final void fieldTitleRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:2: (t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:3: t= titleTypeRule n= VAR ( assignTitleRule[$className, $functionName, $n] )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_fieldTitleRule1193);
			t=titleTypeRule();
			state._fsp--;

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTitleRule1197); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:75: ( assignTitleRule[$className, $functionName, $n] )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:76: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_fieldTitleRule1202);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:1: fieldText[Token className, Token functionName] : t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:2: (t= TEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:3: t= TEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_fieldText1224); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldText1228); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:65: ( assignString[$className, $functionName, $n] )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==EQ) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:66: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldText1233);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:1: fieldBlockQuoteRule[Token className, Token functionName] : t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldBlockQuoteRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:2: (t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:3: t= BLOCKQUOTE n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1253); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldBlockQuoteRule1257); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:72: ( assignString[$className, $functionName, $n] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EQ) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:73: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldBlockQuoteRule1263);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:1: fieldOlistRule[Token className, Token functionName] : t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldOlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:2: (t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:3: t= OLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1283); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1287); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==EQ) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldOlistRule1292);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:1: fieldUlistRule[Token className, Token functionName] : t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldUlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:2: (t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:3: t= ULIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1313); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1317); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldUlistRule1322);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:1: fieldTlistRule[Token className, Token functionName] : t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? ;
	public final void fieldTlistRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:2: (t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:3: t= TLIST n= VAR ( assignTextListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1343); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1347); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:66: ( assignTextListRule[$className, $functionName, $n] )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==EQ) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:67: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_fieldTlistRule1352);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:1: fieldCodeBlockRule[Token className, Token functionName] : t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldCodeBlockRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:2: (t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:3: t= CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1372); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:15: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==LP) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:16: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_fieldCodeBlockRule1375); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:19: (~ ( LP | RP | '\"' ) )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( ((LA30_0 >= BLOCKQUOTE && LA30_0 <= LIST)||(LA30_0 >= LSB && LA30_0 <= OLIST)||(LA30_0 >= R && LA30_0 <= RCB)||(LA30_0 >= RSB && LA30_0 <= WS)) ) {
							alt30=1;
						}

						switch (alt30) {
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
							break loop30;
						}
					}

					match(input,RP,FOLLOW_RP_in_fieldCodeBlockRule1393); 
					}
					break;

			}

			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldCodeBlockRule1399); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:100: ( assignString[$className, $functionName, $n] )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:101: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldCodeBlockRule1405);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:1: fieldTableRule[Token className, Token functionName] : t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? ;
	public final void fieldTableRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:2: (t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:3: t= TABLE n= VAR ( assignTableRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_fieldTableRule1425); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldTableRule1429); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:66: ( assignTableRule[$className, $functionName, $n] )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:67: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_fieldTableRule1434);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:1: fieldImageRule[Token className, Token functionName] : t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? ;
	public final void fieldImageRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:2: (t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:3: t= IMG n= VAR ( assignImageRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_fieldImageRule1454); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldImageRule1458); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:64: ( assignImageRule[$className, $functionName, $n] )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQI) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:65: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_fieldImageRule1463);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:1: fieldLinkRule[Token className, Token functionName] returns [Token name, Token type] : t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? ;
	public final MaltParser.fieldLinkRule_return fieldLinkRule(Token className, Token functionName) throws RecognitionException {
		MaltParser.fieldLinkRule_return retval = new MaltParser.fieldLinkRule_return();
		retval.start = input.LT(1);

		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:2: (t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:3: t= LINK n= VAR ( assignLinkRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_fieldLinkRule1487); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldLinkRule1491); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:65: ( assignLinkRule[$className, $functionName, $n] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EQL) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:66: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_fieldLinkRule1496);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:1: fieldFormatText[Token className, Token functionName] : t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? ;
	public final void fieldFormatText(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:2: (t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:3: t= FORMATTEXT n= VAR ( assignString[$className, $functionName, $n] )?
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_fieldFormatText1516); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_fieldFormatText1520); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:71: ( assignString[$className, $functionName, $n] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:72: assignString[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignString_in_fieldFormatText1525);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:1: listRule[Token className, Token functionName] : t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? ;
	public final void listRule(Token className, Token functionName) throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:297:2: (t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:3: t= LIST n= VAR ( assignListRule[$className, $functionName, $n] )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1545); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1549); 
			h.declareNew(className, functionName, t, n);
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:65: ( assignListRule[$className, $functionName, $n] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EQ) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:298:66: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_listRule1554);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:1: assignRule[Token className, Token functionName] : n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE ;
	public final void assignRule(Token className, Token functionName) throws RecognitionException {
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:2: (n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:2: n= VAR ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] ) SE
			{
			n=(Token)match(input,VAR,FOLLOW_VAR_in_assignRule1581); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:8: ( assignTitleRule[$className, $functionName, $n] | assignTextListRule[$className, $functionName, $n] | assignTableRule[$className, $functionName, $n] | assignImageRule[$className, $functionName, $n] | assignLinkRule[$className, $functionName, $n] | assignListRule[$className, $functionName, $n] )
			int alt38=6;
			switch ( input.LA(1) ) {
			case EQ:
				{
				switch ( input.LA(2) ) {
				case STRING:
					{
					alt38=1;
					}
					break;
				case LSB:
					{
					int LA38_5 = input.LA(3);
					if ( (LA38_5==STRING) ) {
						alt38=6;
					}
					else if ( (LA38_5==C||LA38_5==L||LA38_5==R) ) {
						alt38=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LP:
					{
					int LA38_6 = input.LA(3);
					if ( (LA38_6==STRING) ) {
						alt38=2;
					}
					else if ( (LA38_6==LSB) ) {
						alt38=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 6, input);
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
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case EQI:
				{
				alt38=4;
				}
				break;
			case EQL:
				{
				alt38=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:9: assignTitleRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTitleRule_in_assignRule1584);
					assignTitleRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:58: assignTextListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTextListRule_in_assignRule1589);
					assignTextListRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:307:111: assignTableRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignTableRule_in_assignRule1595);
					assignTableRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:9: assignImageRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignImageRule_in_assignRule1606);
					assignImageRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:58: assignLinkRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignLinkRule_in_assignRule1611);
					assignLinkRule(className, functionName, n);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:308:106: assignListRule[$className, $functionName, $n]
					{
					pushFollow(FOLLOW_assignListRule_in_assignRule1616);
					assignListRule(className, functionName, n);
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_assignRule1621); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:312:1: assignTitleRule[Token className, Token functionName, Token name] : EQ v= STRING ( refRule )? ;
	public final void assignTitleRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:313:2: ( EQ v= STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:3: EQ v= STRING ( refRule )?
			{
			match(input,EQ,FOLLOW_EQ_in_assignTitleRule1636); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignTitleRule1640); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:15: ( refRule )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LCB) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:314:15: refRule
					{
					pushFollow(FOLLOW_refRule_in_assignTitleRule1642);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:1: assignString[Token className, Token functionName, Token name] : EQ v= STRING ;
	public final void assignString(Token className, Token functionName, Token name) throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:319:2: ( EQ v= STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:3: EQ v= STRING
			{
			match(input,EQ,FOLLOW_EQ_in_assignString1660); 
			v=(Token)match(input,STRING,FOLLOW_STRING_in_assignString1664); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:324:1: assignTextListRule[Token className, Token functionName, Token name] : EQ v= textListRule ;
	public final void assignTextListRule(Token className, Token functionName, Token name) throws RecognitionException {
		String v =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:325:2: ( EQ v= textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:326:3: EQ v= textListRule
			{
			match(input,EQ,FOLLOW_EQ_in_assignTextListRule1681); 
			pushFollow(FOLLOW_textListRule_in_assignTextListRule1685);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:330:1: assignTableRule[Token className, Token functionName, Token name] : EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP ;
	public final void assignTableRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v2=null;
		Token t1=null;
		Token v4=null;
		String v1 =null;
		String v3 =null;
		String t2 =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:331:2: ( EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:3: EQ (v1= talignmentRule )? v2= LP v3= trowRule (t1= CM t2= trowRule )* v4= RP
			{
			match(input,EQ,FOLLOW_EQ_in_assignTableRule1702); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:8: (v1= talignmentRule )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==LSB) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:8: v1= talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_assignTableRule1706);
					v1=talignmentRule();
					state._fsp--;

					}
					break;

			}

			v2=(Token)match(input,LP,FOLLOW_LP_in_assignTableRule1711); 
			pushFollow(FOLLOW_trowRule_in_assignTableRule1715);
			v3=trowRule();
			state._fsp--;

			String cycle = v3;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:64: (t1= CM t2= trowRule )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==CM) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:332:65: t1= CM t2= trowRule
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignTableRule1722); 
					pushFollow(FOLLOW_trowRule_in_assignTableRule1726);
					t2=trowRule();
					state._fsp--;

					cycle = cycle + t1.getText() + t2;
					}
					break;

				default :
					break loop41;
				}
			}

			v4=(Token)match(input,RP,FOLLOW_RP_in_assignTableRule1734); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:336:1: assignImageRule[Token className, Token functionName, Token name] : EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP ;
	public final void assignImageRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token o1=null;
		Token o2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:337:2: ( EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:338:3: EQI v1= LP v2= STRING (o1= CM o2= STRING )? v3= RP
			{
			match(input,EQI,FOLLOW_EQI_in_assignImageRule1751); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignImageRule1755); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1759); 
			String opt="";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:338:40: (o1= CM o2= STRING )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==CM) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:338:41: o1= CM o2= STRING
					{
					o1=(Token)match(input,CM,FOLLOW_CM_in_assignImageRule1766); 
					o2=(Token)match(input,STRING,FOLLOW_STRING_in_assignImageRule1770); 
					opt = o1.getText() + o2.getText();
					}
					break;

			}

			v3=(Token)match(input,RP,FOLLOW_RP_in_assignImageRule1778); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:342:1: assignLinkRule[Token className, Token functionName, Token name] : EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP ;
	public final void assignLinkRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token t=null;
		Token v3=null;
		Token v4=null;
		Token v5=null;
		String ir =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:343:2: ( EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:344:3: EQL v1= LP (t= STRING |ir= imageRule ) v3= CM v4= STRING v5= RP
			{
			match(input,EQL,FOLLOW_EQL_in_assignLinkRule1795); 
			v1=(Token)match(input,LP,FOLLOW_LP_in_assignLinkRule1799); 
			String v2 = "";
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:344:31: (t= STRING |ir= imageRule )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==STRING) ) {
				alt43=1;
			}
			else if ( (LA43_0==IMG) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:344:32: t= STRING
					{
					t=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1806); 
					v2=t.getText();
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:344:62: ir= imageRule
					{
					pushFollow(FOLLOW_imageRule_in_assignLinkRule1814);
					ir=imageRule();
					state._fsp--;

					v2 = ir;
					}
					break;

			}

			v3=(Token)match(input,CM,FOLLOW_CM_in_assignLinkRule1821); 
			v4=(Token)match(input,STRING,FOLLOW_STRING_in_assignLinkRule1825); 
			v5=(Token)match(input,RP,FOLLOW_RP_in_assignLinkRule1829); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:349:1: assignListRule[Token className, Token functionName, Token name] : EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB ;
	public final void assignListRule(Token className, Token functionName, Token name) throws RecognitionException {
		Token v1=null;
		Token v2=null;
		Token t1=null;
		Token t2=null;
		Token v3=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:350:2: ( EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:351:3: EQ v1= LSB v2= STRING (t1= CM t2= STRING )+ v3= RSB
			{
			match(input,EQ,FOLLOW_EQ_in_assignListRule1846); 
			v1=(Token)match(input,LSB,FOLLOW_LSB_in_assignListRule1850); 
			v2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1854); 
			String cycle = v2.getText();
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:351:55: (t1= CM t2= STRING )+
			int cnt44=0;
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==CM) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:351:56: t1= CM t2= STRING
					{
					t1=(Token)match(input,CM,FOLLOW_CM_in_assignListRule1861); 
					t2=(Token)match(input,STRING,FOLLOW_STRING_in_assignListRule1865); 
					cycle = cycle + t1.getText() + t2.getText();
					}
					break;

				default :
					if ( cnt44 >= 1 ) break loop44;
					EarlyExitException eee = new EarlyExitException(44, input);
					throw eee;
				}
				cnt44++;
			}

			v3=(Token)match(input,RSB,FOLLOW_RSB_in_assignListRule1873); 
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



	public static final BitSet FOLLOW_functionRule_in_parseJava56 = new BitSet(new long[]{0x07C08C0101C00910L,0x000000000000013EL});
	public static final BitSet FOLLOW_fieldRule_in_parseJava61 = new BitSet(new long[]{0x07C08C0101C00910L,0x000000000000013EL});
	public static final BitSet FOLLOW_classRule_in_parseJava66 = new BitSet(new long[]{0x07C08C0101C00910L,0x000000000000013EL});
	public static final BitSet FOLLOW_assignRule_in_parseJava70 = new BitSet(new long[]{0x07C08C0101C00910L,0x000000000000013EL});
	public static final BitSet FOLLOW_EOF_in_parseJava76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule95 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule103 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule111 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule119 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule126 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule134 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule142 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule150 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule158 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule165 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule173 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_formatText_in_instrRule181 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule188 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule194 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule226 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule228 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule301 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_HA_in_refRule303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_refRule305 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule322 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textDeclRule324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule344 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_blockquoteRule346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule365 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule388 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule392 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule399 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule403 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule428 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule450 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule472 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule474 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_codeBlockRule477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule514 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule516 = new BitSet(new long[]{0x4000000100000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule519 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule523 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule526 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_linkRule528 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule553 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule557 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule561 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule568 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule572 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule599 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule601 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule622 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule624 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule627 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule629 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule632 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule634 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule661 = new BitSet(new long[]{0x0002002000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule665 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule672 = new BitSet(new long[]{0x0002002000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule676 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_L_in_alignRule706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_C_in_alignRule712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_R_in_alignRule718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule740 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule744 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule751 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule755 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatText780 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatText782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_functionRule807 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule811 = new BitSet(new long[]{0x07D08C0100800810L,0x000000000000003EL});
	public static final BitSet FOLLOW_argumentsRule_in_functionRule814 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule819 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule821 = new BitSet(new long[]{0x07C08C0100C00810L,0x000000000000013EL});
	public static final BitSet FOLLOW_fieldRule_in_functionRule825 = new BitSet(new long[]{0x07C88C0100C00810L,0x000000000000013EL});
	public static final BitSet FOLLOW_assignRule_in_functionRule832 = new BitSet(new long[]{0x07C88C0100C00810L,0x000000000000013EL});
	public static final BitSet FOLLOW_RCB_in_functionRule838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule865 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_CM_in_argumentsRule870 = new BitSet(new long[]{0x07C08C0100800810L,0x000000000000003EL});
	public static final BitSet FOLLOW_argumentTypeRule_in_argumentsRule874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_argumentsRule878 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_titleTypeRule_in_argumentTypeRule902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_argumentTypeRule910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_argumentTypeRule916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_argumentTypeRule922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_argumentTypeRule928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_argumentTypeRule934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_argumentTypeRule940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_argumentTypeRule946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_argumentTypeRule952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_argumentTypeRule958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_argumentTypeRule964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_argumentTypeRule970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule986 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_forRule988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_forRule990 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_forRule992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_forRule994 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule996 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule998 = new BitSet(new long[]{0x07C08C0100C00810L,0x000000000000003EL});
	public static final BitSet FOLLOW_fieldRule_in_forRule1003 = new BitSet(new long[]{0x07C88C0100C00810L,0x000000000000003EL});
	public static final BitSet FOLLOW_RCB_in_forRule1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_classRule1032 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1036 = new BitSet(new long[]{0x07C88C0101C00810L,0x000000000000003EL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1038 = new BitSet(new long[]{0x07C88C0101C00810L,0x000000000000003EL});
	public static final BitSet FOLLOW_functionRule_in_classRule1043 = new BitSet(new long[]{0x0008000001000000L});
	public static final BitSet FOLLOW_RCB_in_classRule1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTitleRule_in_fieldRule1070 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldText_in_fieldRule1079 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldBlockQuoteRule_in_fieldRule1088 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1097 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1106 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1114 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldCodeBlockRule_in_fieldRule1122 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldTableRule_in_fieldRule1130 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldImageRule_in_fieldRule1139 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldLinkRule_in_fieldRule1147 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1156 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_fieldFormatText_in_fieldRule1165 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_fieldRule1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_fieldTitleRule1193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldTitleRule1197 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTitleRule_in_fieldTitleRule1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldText1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldText1228 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldText1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_fieldBlockQuoteRule1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldBlockQuoteRule1257 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldBlockQuoteRule1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1287 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldOlistRule1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1317 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldUlistRule1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1347 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTextListRule_in_fieldTlistRule1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_fieldCodeBlockRule1372 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LP_in_fieldCodeBlockRule1375 = new BitSet(new long[]{0xFFFEEFFFFFFFFFF0L,0x00000000000003FFL});
	public static final BitSet FOLLOW_RP_in_fieldCodeBlockRule1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldCodeBlockRule1399 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldCodeBlockRule1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_fieldTableRule1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldTableRule1429 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignTableRule_in_fieldTableRule1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_fieldImageRule1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldImageRule1458 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_assignImageRule_in_fieldImageRule1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_fieldLinkRule1487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldLinkRule1491 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_assignLinkRule_in_fieldLinkRule1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_fieldFormatText1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_fieldFormatText1520 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignString_in_fieldFormatText1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_listRule1549 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_assignListRule_in_listRule1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_assignRule1581 = new BitSet(new long[]{0x0000000000038000L});
	public static final BitSet FOLLOW_assignTitleRule_in_assignRule1584 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_assignTextListRule_in_assignRule1589 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_assignTableRule_in_assignRule1595 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_assignImageRule_in_assignRule1606 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_assignLinkRule_in_assignRule1611 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_assignListRule_in_assignRule1616 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SE_in_assignRule1621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTitleRule1636 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignTitleRule1640 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_refRule_in_assignTitleRule1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignString1660 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignString1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTextListRule1681 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_textListRule_in_assignTextListRule1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignTableRule1702 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_assignTableRule1706 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_assignTableRule1711 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1715 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_assignTableRule1722 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_trowRule_in_assignTableRule1726 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RP_in_assignTableRule1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQI_in_assignImageRule1751 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_assignImageRule1755 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1759 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_assignImageRule1766 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignImageRule1770 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_assignImageRule1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQL_in_assignLinkRule1795 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LP_in_assignLinkRule1799 = new BitSet(new long[]{0x4000000100000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1806 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_assignLinkRule1814 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignLinkRule1821 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignLinkRule1825 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RP_in_assignLinkRule1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_assignListRule1846 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_LSB_in_assignListRule1850 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1854 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_assignListRule1861 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_assignListRule1865 = new BitSet(new long[]{0x0020000000000200L});
	public static final BitSet FOLLOW_RSB_in_assignListRule1873 = new BitSet(new long[]{0x0000000000000002L});
}
