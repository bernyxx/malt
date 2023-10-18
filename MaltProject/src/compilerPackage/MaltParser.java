// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-18 16:19:05

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


	public static class instrRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "instrRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:1: instrRule returns [Token name, Token type] : ( ( (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE ) | forRule );
	public final MaltParser.instrRule_return instrRule() throws RecognitionException {
		MaltParser.instrRule_return retval = new MaltParser.instrRule_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope r =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:2: ( ( (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE ) | forRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:4: ( (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:4: ( (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:5: (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:5: (r= titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule | listRule )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:6: r= titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule88);
							r=titleRule();
							state._fsp--;

							name = r.name; type = r.type; h.prova(r.name,r.type);
							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule96);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule102);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule108);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule114);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule120);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:5: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule126);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule132);
							horizontalRule();
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule138);
							tableRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:5: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule144);
							imageRule();
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:5: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule150);
							linkRule();
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule156);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:5: formatTextRule
							{
							pushFollow(FOLLOW_formatTextRule_in_instrRule168);
							formatTextRule();
							state._fsp--;

							}
							break;
						case 14 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:5: listRule
							{
							pushFollow(FOLLOW_listRule_in_instrRule174);
							listRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule180); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule185);
					forRule();
					state._fsp--;

					h.hello();
					}
					break;

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
	// $ANTLR end "instrRule"


	public static class titleRule_return extends ParserRuleReturnScope {
		public Token name;
		public Token type;
	};


	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:1: titleRule returns [Token name, Token type] : t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? ;
	public final MaltParser.titleRule_return titleRule() throws RecognitionException {
		MaltParser.titleRule_return retval = new MaltParser.titleRule_return();
		retval.start = input.LT(1);

		Token n=null;
		Token t =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:2: (t= titleTypeRule (n= VAR EQ )? STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:3: t= titleTypeRule (n= VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule209);
			t=titleTypeRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:19: (n= VAR EQ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==VAR) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:20: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_titleRule214); 
					h.declareVar(t, n); name = n; type = t;
					match(input,EQ,FOLLOW_EQ_in_titleRule218); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule222); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:82: ( refRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LCB) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:82: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule224);
					refRule();
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
	// $ANTLR end "titleRule"



	// $ANTLR start "titleTypeRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:1: titleTypeRule returns [Token type] : (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) ;
	public final Token titleTypeRule() throws RecognitionException {
		Token type = null;


		Token t=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:2: ( (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:3: (t= TITLE |t= S1TITLE |t= S2TITLE |t= S3TITLE |t= S4TITLE |t= S5TITLE )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:4: t= TITLE
					{
					t=(Token)match(input,TITLE,FOLLOW_TITLE_in_titleTypeRule244); 
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:14: t= S1TITLE
					{
					t=(Token)match(input,S1TITLE,FOLLOW_S1TITLE_in_titleTypeRule250); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:26: t= S2TITLE
					{
					t=(Token)match(input,S2TITLE,FOLLOW_S2TITLE_in_titleTypeRule256); 
					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:38: t= S3TITLE
					{
					t=(Token)match(input,S3TITLE,FOLLOW_S3TITLE_in_titleTypeRule262); 
					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:50: t= S4TITLE
					{
					t=(Token)match(input,S4TITLE,FOLLOW_S4TITLE_in_titleTypeRule268); 
					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:62: t= S5TITLE
					{
					t=(Token)match(input,S5TITLE,FOLLOW_S5TITLE_in_titleTypeRule274); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule289); 
			match(input,HA,FOLLOW_HA_in_refRule291); 
			match(input,VAR,FOLLOW_VAR_in_refRule293); 
			match(input,RCB,FOLLOW_RCB_in_refRule295); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:1: textDeclRule : t= TEXT (n= VAR EQ )? textRule ;
	public final void textDeclRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:2: (t= TEXT (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:3: t= TEXT (n= VAR EQ )? textRule
			{
			t=(Token)match(input,TEXT,FOLLOW_TEXT_in_textDeclRule314); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:10: (n= VAR EQ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_textDeclRule319); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_textDeclRule323); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule327);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:1: textRule : STRING ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_textRule342); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:1: blockquoteRule : t= BLOCKQUOTE (n= VAR EQ )? textRule ;
	public final void blockquoteRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:2: (t= BLOCKQUOTE (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:3: t= BLOCKQUOTE (n= VAR EQ )? textRule
			{
			t=(Token)match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule475); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:16: (n= VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_blockquoteRule480); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule484); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule488);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:1: olistRule : t= OLIST (n= VAR EQ )? textListRule ;
	public final void olistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:2: (t= OLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:3: t= OLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,OLIST,FOLLOW_OLIST_in_olistRule507); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:11: (n= VAR EQ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_olistRule512); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_olistRule516); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule520);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule534); 
			match(input,STRING,FOLLOW_STRING_in_textListRule536); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:14: ( CM STRING )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule539); 
					match(input,STRING,FOLLOW_STRING_in_textListRule541); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule545); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:1: ulistRule : t= ULIST (n= VAR EQ )? textListRule ;
	public final void ulistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:2: (t= ULIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:3: t= ULIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,ULIST,FOLLOW_ULIST_in_ulistRule560); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:11: (n= VAR EQ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_ulistRule565); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_ulistRule569); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule573);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:1: tlistRule : t= TLIST (n= VAR EQ )? textListRule ;
	public final void tlistRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:2: (t= TLIST (n= VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:3: t= TLIST (n= VAR EQ )? textListRule
			{
			t=(Token)match(input,TLIST,FOLLOW_TLIST_in_tlistRule592); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:11: (n= VAR EQ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tlistRule597); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_tlistRule601); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule605);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:1: codeBlockRule : t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule ;
	public final void codeBlockRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:2: (t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:3: t= CODEBLOCK ( genericTextRule )? (n= VAR EQ )? textRule
			{
			t=(Token)match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule624); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:15: ( genericTextRule )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==LP) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:15: genericTextRule
					{
					pushFollow(FOLLOW_genericTextRule_in_codeBlockRule626);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:32: (n= VAR EQ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:33: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_codeBlockRule632); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule636); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule640);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:1: genericTextRule : ( LP (~ ( LP | RP | '\"' ) )* RP ) ;
	public final void genericTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:2: ( ( LP (~ ( LP | RP | '\"' ) )* RP ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:3: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:4: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_genericTextRule657); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:7: (~ ( LP | RP | '\"' ) )*
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

			match(input,RP,FOLLOW_RP_in_genericTextRule675); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule688); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:1: linkRule : t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP ;
	public final void linkRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:2: (t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:3: t= LINK (n= VAR EQ )? LP ( textRule | imageRule ) CM genericTextRule RP
			{
			t=(Token)match(input,LINK,FOLLOW_LINK_in_linkRule706); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:10: (n= VAR EQ )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==VAR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:11: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_linkRule711); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_linkRule715); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule719); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:49: ( textRule | imageRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:50: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule722);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:61: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule726);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule729); 
			pushFollow(FOLLOW_genericTextRule_in_linkRule731);
			genericTextRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule733); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:1: imageRule : t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP ;
	public final void imageRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:2: (t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:3: t= IMG (n= VAR EQ )? LP genericTextRule ( CM genericTextRule )? RP
			{
			t=(Token)match(input,IMG,FOLLOW_IMG_in_imageRule751); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:9: (n= VAR EQ )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==VAR) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:10: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_imageRule756); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_imageRule760); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule764); 
			pushFollow(FOLLOW_genericTextRule_in_imageRule766);
			genericTextRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:64: ( CM genericTextRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CM) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:65: CM genericTextRule
					{
					match(input,CM,FOLLOW_CM_in_imageRule769); 
					pushFollow(FOLLOW_genericTextRule_in_imageRule771);
					genericTextRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule775); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:2: ( LAB STRING RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule792); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule794); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule796); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:1: tableRule : t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:201:2: (t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:3: t= TABLE (n= VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			t=(Token)match(input,TABLE,FOLLOW_TABLE_in_tableRule816); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:11: (n= VAR EQ )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:12: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_tableRule821); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_tableRule825); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:47: ( talignmentRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LSB) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:47: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule829);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule832); 
			pushFollow(FOLLOW_trowRule_in_tableRule834);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:75: ( CM trowRule )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CM) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:76: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule837); 
					pushFollow(FOLLOW_trowRule_in_tableRule839);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule843); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule859); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule861);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:17: ( CM alignRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule864); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule866);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule870); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule906); 
			match(input,STRING,FOLLOW_STRING_in_trowRule908); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:14: ( CM STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule911); 
					match(input,STRING,FOLLOW_STRING_in_trowRule913); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule917); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:1: formatTextRule : t= FORMATTEXT (n= VAR EQ )? STRING ;
	public final void formatTextRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:2: (t= FORMATTEXT (n= VAR EQ )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:3: t= FORMATTEXT (n= VAR EQ )? STRING
			{
			t=(Token)match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule936); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:16: (n= VAR EQ )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==VAR) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:17: n= VAR EQ
					{
					n=(Token)match(input,VAR,FOLLOW_VAR_in_formatTextRule941); 
					h.declareVar(t, n);
					match(input,EQ,FOLLOW_EQ_in_formatTextRule945); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule949); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:1: functionRule : FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule )+ RCB ;
	public final void functionRule() throws RecognitionException {
		Token n=null;
		ParserRuleReturnScope r =null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:2: ( FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:3: FUN n= VAR LP ( TEXT | LIST ) VAR RP LCB (r= instrRule )+ RCB
			{
			match(input,FUN,FOLLOW_FUN_in_functionRule965); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_functionRule969); 
			h.declareFun(n);
			match(input,LP,FOLLOW_LP_in_functionRule973); 
			if ( input.LA(1)==LIST||input.LA(1)==TEXT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,VAR,FOLLOW_VAR_in_functionRule983); 
			match(input,RP,FOLLOW_RP_in_functionRule985); 
			match(input,LCB,FOLLOW_LCB_in_functionRule987); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:61: (r= instrRule )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:62: r= instrRule
					{
					pushFollow(FOLLOW_instrRule_in_functionRule992);
					r=instrRule();
					state._fsp--;

					h.prova(r.name,r.type);
					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			match(input,RCB,FOLLOW_RCB_in_functionRule998); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:1: forRule : FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:2: ( FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:3: FOR LP VAR IN VAR RP LCB ( instrRule )+ RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1014); 
			match(input,LP,FOLLOW_LP_in_forRule1016); 
			match(input,VAR,FOLLOW_VAR_in_forRule1018); 
			match(input,IN,FOLLOW_IN_in_forRule1020); 
			match(input,VAR,FOLLOW_VAR_in_forRule1022); 
			match(input,RP,FOLLOW_RP_in_forRule1024); 
			match(input,LCB,FOLLOW_LCB_in_forRule1026); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:28: ( instrRule )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:28: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_forRule1028);
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

			match(input,RCB,FOLLOW_RCB_in_forRule1031); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:1: classRule : CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:2: ( CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:3: CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1043); 
			match(input,VAR,FOLLOW_VAR_in_classRule1045); 
			match(input,LCB,FOLLOW_LCB_in_classRule1047); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:17: ( fieldRule )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==LIST||LA28_0==OLIST||LA28_0==TEXT||(LA28_0 >= TLIST && LA28_0 <= ULIST)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:17: fieldRule
					{
					pushFollow(FOLLOW_fieldRule_in_classRule1049);
					fieldRule();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:28: ( functionRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==FUN) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:28: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_classRule1052);
					functionRule();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule1055); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:1: fieldRule : ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE ;
	public final void fieldRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:2: ( ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule ) SE
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule | listRule )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:4: fieldTextRule
					{
					pushFollow(FOLLOW_fieldTextRule_in_fieldRule1068);
					fieldTextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:5: fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1074);
					fieldOlistRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:5: fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1080);
					fieldUlistRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:5: fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1086);
					fieldTlistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:5: listRule
					{
					pushFollow(FOLLOW_listRule_in_fieldRule1092);
					listRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1095); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:1: fieldTextRule : TEXT VAR ( EQ textRule )? ;
	public final void fieldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:2: ( TEXT VAR ( EQ textRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:3: TEXT VAR ( EQ textRule )?
			{
			match(input,TEXT,FOLLOW_TEXT_in_fieldTextRule1108); 
			match(input,VAR,FOLLOW_VAR_in_fieldTextRule1110); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:12: ( EQ textRule )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:13: EQ textRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTextRule1113); 
					pushFollow(FOLLOW_textRule_in_fieldTextRule1115);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:1: fieldOlistRule : OLIST VAR ( EQ textListRule )? ;
	public final void fieldOlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:2: ( OLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:3: OLIST VAR ( EQ textListRule )?
			{
			match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1130); 
			match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1132); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:13: ( EQ textListRule )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldOlistRule1135); 
					pushFollow(FOLLOW_textListRule_in_fieldOlistRule1137);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:1: fieldUlistRule : ULIST VAR ( EQ textListRule )? ;
	public final void fieldUlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:2: ( ULIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:3: ULIST VAR ( EQ textListRule )?
			{
			match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1152); 
			match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1154); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:13: ( EQ textListRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldUlistRule1157); 
					pushFollow(FOLLOW_textListRule_in_fieldUlistRule1159);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:1: fieldTlistRule : TLIST VAR ( EQ textListRule )? ;
	public final void fieldTlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:2: ( TLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:3: TLIST VAR ( EQ textListRule )?
			{
			match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1174); 
			match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1176); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:13: ( EQ textListRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTlistRule1179); 
					pushFollow(FOLLOW_textListRule_in_fieldTlistRule1181);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:1: listRule : t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? ;
	public final void listRule() throws RecognitionException {
		Token t=null;
		Token n=null;

		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:2: (t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:3: t= LIST n= VAR ( EQ LSB STRING ( CM STRING )+ RSB )?
			{
			t=(Token)match(input,LIST,FOLLOW_LIST_in_listRule1197); 
			n=(Token)match(input,VAR,FOLLOW_VAR_in_listRule1201); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:16: ( EQ LSB STRING ( CM STRING )+ RSB )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EQ) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:17: EQ LSB STRING ( CM STRING )+ RSB
					{
					match(input,EQ,FOLLOW_EQ_in_listRule1204); 
					match(input,LSB,FOLLOW_LSB_in_listRule1206); 
					match(input,STRING,FOLLOW_STRING_in_listRule1208); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:31: ( CM STRING )+
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:32: CM STRING
							{
							match(input,CM,FOLLOW_CM_in_listRule1211); 
							match(input,STRING,FOLLOW_STRING_in_listRule1213); 
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					match(input,RSB,FOLLOW_RSB_in_listRule1217); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:1: fieldTextAssignRule : VAR EQ textRule ;
	public final void fieldTextAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:2: ( VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:3: VAR EQ textRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldTextAssignRule1236); 
			match(input,EQ,FOLLOW_EQ_in_fieldTextAssignRule1238); 
			pushFollow(FOLLOW_textRule_in_fieldTextAssignRule1240);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:1: fieldListAssignRule : VAR EQ textListRule ;
	public final void fieldListAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:2: ( VAR EQ textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:3: VAR EQ textListRule
			{
			match(input,VAR,FOLLOW_VAR_in_fieldListAssignRule1253); 
			match(input,EQ,FOLLOW_EQ_in_fieldListAssignRule1255); 
			pushFollow(FOLLOW_textListRule_in_fieldListAssignRule1257);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:1: listAssignRule : VAR EQ LSB STRING ( CM STRING )+ RSB ;
	public final void listAssignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:2: ( VAR EQ LSB STRING ( CM STRING )+ RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:3: VAR EQ LSB STRING ( CM STRING )+ RSB
			{
			match(input,VAR,FOLLOW_VAR_in_listAssignRule1269); 
			match(input,EQ,FOLLOW_EQ_in_listAssignRule1271); 
			match(input,LSB,FOLLOW_LSB_in_listAssignRule1273); 
			match(input,STRING,FOLLOW_STRING_in_listAssignRule1275); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:21: ( CM STRING )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:293:22: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_listAssignRule1278); 
					match(input,STRING,FOLLOW_STRING_in_listAssignRule1280); 
					}
					break;

				default :
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
			}

			match(input,RSB,FOLLOW_RSB_in_listAssignRule1284); 
			}

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
	public static final BitSet FOLLOW_titleRule_in_instrRule88 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule96 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule102 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule108 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule114 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule120 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule126 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule132 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule138 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule144 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule150 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule156 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule168 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_instrRule174 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule209 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_titleRule214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule218 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule222 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_in_titleTypeRule244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S1TITLE_in_titleTypeRule250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S2TITLE_in_titleTypeRule256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S3TITLE_in_titleTypeRule262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S4TITLE_in_titleTypeRule268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S5TITLE_in_titleTypeRule274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule289 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HA_in_refRule291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_refRule293 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule314 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule319 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule323 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textRule342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule475 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule480 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule484 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule507 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_olistRule512 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule516 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule534 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule536 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule539 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule541 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule560 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_ulistRule565 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule569 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule592 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tlistRule597 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule601 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule624 = new BitSet(new long[]{0x2000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_genericTextRule_in_codeBlockRule626 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule632 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule636 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_genericTextRule657 = new BitSet(new long[]{0xFFFF77FFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_genericTextRule675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule706 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_linkRule711 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule715 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule719 = new BitSet(new long[]{0x2000000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule722 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule726 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule729 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_linkRule731 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule751 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_imageRule756 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule760 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule764 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule766 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule769 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_genericTextRule_in_imageRule771 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule792 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule794 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule816 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tableRule821 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule825 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule829 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule832 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule834 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule837 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule839 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule859 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule861 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule864 = new BitSet(new long[]{0x0001001000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule866 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule906 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule908 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule911 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule913 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule936 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule941 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule945 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule969 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule973 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_functionRule975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule983 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule985 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule987 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_functionRule992 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_functionRule998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1014 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1018 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_forRule1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule1022 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule1024 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule1026 = new BitSet(new long[]{0x03E04620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_instrRule_in_forRule1028 = new BitSet(new long[]{0x03E44620A0500810L,0x000000000000001FL});
	public static final BitSet FOLLOW_RCB_in_forRule1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_classRule1045 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule1047 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_fieldRule_in_classRule1049 = new BitSet(new long[]{0x0004440000800000L,0x000000000000001AL});
	public static final BitSet FOLLOW_functionRule_in_classRule1052 = new BitSet(new long[]{0x0004000000800000L});
	public static final BitSet FOLLOW_RCB_in_classRule1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTextRule_in_fieldRule1068 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1074 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1080 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1086 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_listRule_in_fieldRule1092 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldTextRule1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTextRule1110 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTextRule1113 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextRule1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1132 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldOlistRule1135 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldOlistRule1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1154 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldUlistRule1157 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldUlistRule1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1176 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTlistRule1179 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldTlistRule1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listRule1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_listRule1201 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_listRule1204 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listRule1206 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1208 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listRule1211 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listRule1213 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listRule1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldTextAssignRule1236 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldTextAssignRule1238 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextAssignRule1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldListAssignRule1253 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_fieldListAssignRule1255 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldListAssignRule1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_listAssignRule1269 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_listAssignRule1271 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LSB_in_listAssignRule1273 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1275 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_listAssignRule1278 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STRING_in_listAssignRule1280 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_RSB_in_listAssignRule1284 = new BitSet(new long[]{0x0000000000000002L});
}
