// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-11 19:37:51

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
		"IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", "LINK", "LP", "LSB", 
		"OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", 
		"S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", 
		"SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "TYPE", "ULIST", "UNICODE_ESC", 
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
	public static final int TYPE=67;
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


		



	// $ANTLR start "parseJava"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : ( instrRule | functionRule | classRule )+ EOF ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( ( instrRule | functionRule | classRule )+ EOF )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule | functionRule | classRule )+ EOF
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( instrRule | functionRule | classRule )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:4: instrRule
					{
					pushFollow(FOLLOW_instrRule_in_parseJava48);
					instrRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:16: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_parseJava52);
					functionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:31: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava56);
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

			match(input,EOF,FOLLOW_EOF_in_parseJava60); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:1: instrRule : ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE ) | forRule );
	public final void instrRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:2: ( ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE ) | forRule )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BLOCKQUOTE||LA3_0==CODEBLOCK||LA3_0==FORMATTEXT||LA3_0==HRULE||LA3_0==IMG||LA3_0==LAB||LA3_0==LINK||LA3_0==OLIST||(LA3_0 >= S1TITLE && LA3_0 <= S5TITLE)||(LA3_0 >= TABLE && LA3_0 <= TLIST)||LA3_0==ULIST) ) {
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:4: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule ) SE
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:5: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | codeBlockRule | horizontalRule | tableRule | imageRule | linkRule | quickLinkRule | formatTextRule )
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:6: titleRule
							{
							pushFollow(FOLLOW_titleRule_in_instrRule76);
							titleRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:5: textDeclRule
							{
							pushFollow(FOLLOW_textDeclRule_in_instrRule82);
							textDeclRule();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:5: blockquoteRule
							{
							pushFollow(FOLLOW_blockquoteRule_in_instrRule88);
							blockquoteRule();
							state._fsp--;

							}
							break;
						case 4 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:5: olistRule
							{
							pushFollow(FOLLOW_olistRule_in_instrRule94);
							olistRule();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:30:5: ulistRule
							{
							pushFollow(FOLLOW_ulistRule_in_instrRule100);
							ulistRule();
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:5: tlistRule
							{
							pushFollow(FOLLOW_tlistRule_in_instrRule106);
							tlistRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:5: codeBlockRule
							{
							pushFollow(FOLLOW_codeBlockRule_in_instrRule112);
							codeBlockRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:5: horizontalRule
							{
							pushFollow(FOLLOW_horizontalRule_in_instrRule118);
							horizontalRule();
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:5: tableRule
							{
							pushFollow(FOLLOW_tableRule_in_instrRule124);
							tableRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:35:5: imageRule
							{
							pushFollow(FOLLOW_imageRule_in_instrRule130);
							imageRule();
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:5: linkRule
							{
							pushFollow(FOLLOW_linkRule_in_instrRule136);
							linkRule();
							state._fsp--;

							}
							break;
						case 12 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:5: quickLinkRule
							{
							pushFollow(FOLLOW_quickLinkRule_in_instrRule142);
							quickLinkRule();
							state._fsp--;

							}
							break;
						case 13 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:5: formatTextRule
							{
							pushFollow(FOLLOW_formatTextRule_in_instrRule154);
							formatTextRule();
							state._fsp--;

							}
							break;

					}

					match(input,SE,FOLLOW_SE_in_instrRule160); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:41:11: forRule
					{
					pushFollow(FOLLOW_forRule_in_instrRule165);
					forRule();
					state._fsp--;

					System.out.println("    - Ho riconosciuto un'istruzione");
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:1: titleRule : titleTypeRule ( VAR EQ )? STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:2: ( titleTypeRule ( VAR EQ )? STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:3: titleTypeRule ( VAR EQ )? STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule184);
			titleTypeRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:17: ( VAR EQ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==VAR) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:18: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_titleRule187); 
					match(input,EQ,FOLLOW_EQ_in_titleRule189); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_titleRule193); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:34: ( refRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==LCB) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:47:34: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule195);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule244); 
			match(input,HA,FOLLOW_HA_in_refRule246); 
			match(input,VAR,FOLLOW_VAR_in_refRule248); 
			match(input,RCB,FOLLOW_RCB_in_refRule250); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:1: textDeclRule : TEXT ( VAR EQ )? textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:2: ( TEXT ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:3: TEXT ( VAR EQ )? textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule267); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:8: ( VAR EQ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_textDeclRule270); 
					match(input,EQ,FOLLOW_EQ_in_textDeclRule272); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_textDeclRule276);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:1: textRule : STRING ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:2: ( STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:3: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_textRule295); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:1: blockquoteRule : BLOCKQUOTE ( VAR EQ )? textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:2: ( BLOCKQUOTE ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:3: BLOCKQUOTE ( VAR EQ )? textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule426); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:14: ( VAR EQ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:15: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_blockquoteRule429); 
					match(input,EQ,FOLLOW_EQ_in_blockquoteRule431); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockquoteRule435);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:138:1: olistRule : OLIST ( VAR EQ )? textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:2: ( OLIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:3: OLIST ( VAR EQ )? textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule452); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:9: ( VAR EQ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_olistRule455); 
					match(input,EQ,FOLLOW_EQ_in_olistRule457); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_olistRule461);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule475); 
			match(input,STRING,FOLLOW_STRING_in_textListRule477); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:14: ( CM STRING )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule480); 
					match(input,STRING,FOLLOW_STRING_in_textListRule482); 
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule486); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:1: ulistRule : ULIST ( VAR EQ )? textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:2: ( ULIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:3: ULIST ( VAR EQ )? textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule499); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:9: ( VAR EQ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_ulistRule502); 
					match(input,EQ,FOLLOW_EQ_in_ulistRule504); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_ulistRule508);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:1: tlistRule : TLIST ( VAR EQ )? textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:2: ( TLIST ( VAR EQ )? textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:3: TLIST ( VAR EQ )? textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule525); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:9: ( VAR EQ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tlistRule528); 
					match(input,EQ,FOLLOW_EQ_in_tlistRule530); 
					}
					break;

			}

			pushFollow(FOLLOW_textListRule_in_tlistRule534);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:1: codeBlockRule : CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule ;
	public final void codeBlockRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:2: ( CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:3: CODEBLOCK ( LP (~ ( LP | RP | '\"' ) )* RP )? ( VAR EQ )? textRule
			{
			match(input,CODEBLOCK,FOLLOW_CODEBLOCK_in_codeBlockRule551); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:13: ( LP (~ ( LP | RP | '\"' ) )* RP )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==LP) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:14: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_codeBlockRule554); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:17: (~ ( LP | RP | '\"' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= BLOCKQUOTE && LA12_0 <= LINK)||(LA12_0 >= LSB && LA12_0 <= OLIST)||(LA12_0 >= R && LA12_0 <= RCB)||(LA12_0 >= RSB && LA12_0 <= WS)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
							break loop12;
						}
					}

					match(input,RP,FOLLOW_RP_in_codeBlockRule572); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:42: ( VAR EQ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:43: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_codeBlockRule577); 
					match(input,EQ,FOLLOW_EQ_in_codeBlockRule579); 
					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_codeBlockRule583);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:167:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule599); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:1: linkRule : LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:173:2: ( LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:3: LINK ( VAR EQ )? LP ( textRule | imageRule ) CM ( LP (~ ( LP | RP | '\"' ) )* RP ) RP
			{
			match(input,LINK,FOLLOW_LINK_in_linkRule615); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:8: ( VAR EQ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:9: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_linkRule618); 
					match(input,EQ,FOLLOW_EQ_in_linkRule620); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_linkRule624); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:21: ( textRule | imageRule )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==STRING) ) {
				alt16=1;
			}
			else if ( (LA16_0==IMG) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:22: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule627);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:33: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule631);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,CM,FOLLOW_CM_in_linkRule634); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:47: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:48: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_linkRule637); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:51: (~ ( LP | RP | '\"' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= BLOCKQUOTE && LA17_0 <= LINK)||(LA17_0 >= LSB && LA17_0 <= OLIST)||(LA17_0 >= R && LA17_0 <= RCB)||(LA17_0 >= RSB && LA17_0 <= WS)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
					break loop17;
				}
			}

			match(input,RP,FOLLOW_RP_in_linkRule655); 
			}

			match(input,RP,FOLLOW_RP_in_linkRule658); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:1: imageRule : IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:179:2: ( IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:3: IMG ( VAR EQ )? LP ( LP (~ ( LP | RP | '\"' ) )* RP ) ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )? RP
			{
			match(input,IMG,FOLLOW_IMG_in_imageRule674); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:7: ( VAR EQ )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==VAR) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:8: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_imageRule677); 
					match(input,EQ,FOLLOW_EQ_in_imageRule679); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_imageRule683); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:20: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:21: LP (~ ( LP | RP | '\"' ) )* RP
			{
			match(input,LP,FOLLOW_LP_in_imageRule686); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:24: (~ ( LP | RP | '\"' ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= BLOCKQUOTE && LA19_0 <= LINK)||(LA19_0 >= LSB && LA19_0 <= OLIST)||(LA19_0 >= R && LA19_0 <= RCB)||(LA19_0 >= RSB && LA19_0 <= WS)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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

			match(input,RP,FOLLOW_RP_in_imageRule704); 
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:48: ( CM ( LP (~ ( LP | RP | '\"' ) )* RP ) )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CM) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:49: CM ( LP (~ ( LP | RP | '\"' ) )* RP )
					{
					match(input,CM,FOLLOW_CM_in_imageRule708); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:52: ( LP (~ ( LP | RP | '\"' ) )* RP )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:53: LP (~ ( LP | RP | '\"' ) )* RP
					{
					match(input,LP,FOLLOW_LP_in_imageRule711); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:56: (~ ( LP | RP | '\"' ) )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= BLOCKQUOTE && LA20_0 <= LINK)||(LA20_0 >= LSB && LA20_0 <= OLIST)||(LA20_0 >= R && LA20_0 <= RCB)||(LA20_0 >= RSB && LA20_0 <= WS)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= BLOCKQUOTE && input.LA(1) <= LINK)||(input.LA(1) >= LSB && input.LA(1) <= OLIST)||(input.LA(1) >= R && input.LA(1) <= RCB)||(input.LA(1) >= RSB && input.LA(1) <= WS) ) {
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
							break loop20;
						}
					}

					match(input,RP,FOLLOW_RP_in_imageRule729); 
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule734); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:1: quickLinkRule : LAB STRING RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:2: ( LAB STRING RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:3: LAB STRING RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule751); 
			match(input,STRING,FOLLOW_STRING_in_quickLinkRule753); 
			match(input,RAB,FOLLOW_RAB_in_quickLinkRule755); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:1: tableRule : TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:2: ( TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:3: TABLE ( VAR EQ )? ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule773); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:9: ( VAR EQ )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==VAR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:10: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_tableRule776); 
					match(input,EQ,FOLLOW_EQ_in_tableRule778); 
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:19: ( talignmentRule )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LSB) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:19: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule782);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule785); 
			pushFollow(FOLLOW_trowRule_in_tableRule787);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:47: ( CM trowRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:48: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule790); 
					pushFollow(FOLLOW_trowRule_in_tableRule792);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule796); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule812); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule814);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:17: ( CM alignRule )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule817); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule819);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule823); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:207:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule859); 
			match(input,STRING,FOLLOW_STRING_in_trowRule861); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:14: ( CM STRING )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CM) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule864); 
					match(input,STRING,FOLLOW_STRING_in_trowRule866); 
					}
					break;

				default :
					break loop26;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule870); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:1: formatTextRule : FORMATTEXT ( VAR EQ )? STRING ;
	public final void formatTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:2: ( FORMATTEXT ( VAR EQ )? STRING )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:3: FORMATTEXT ( VAR EQ )? STRING
			{
			match(input,FORMATTEXT,FOLLOW_FORMATTEXT_in_formatTextRule887); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:14: ( VAR EQ )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==VAR) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:15: VAR EQ
					{
					match(input,VAR,FOLLOW_VAR_in_formatTextRule890); 
					match(input,EQ,FOLLOW_EQ_in_formatTextRule892); 
					}
					break;

			}

			match(input,STRING,FOLLOW_STRING_in_formatTextRule896); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:1: functionRule : FUN VAR LP TYPE VAR RP LCB instrRule RCB ;
	public final void functionRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:2: ( FUN VAR LP TYPE VAR RP LCB instrRule RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:3: FUN VAR LP TYPE VAR RP LCB instrRule RCB
			{
			match(input,FUN,FOLLOW_FUN_in_functionRule912); 
			match(input,VAR,FOLLOW_VAR_in_functionRule914); 
			match(input,LP,FOLLOW_LP_in_functionRule916); 
			match(input,TYPE,FOLLOW_TYPE_in_functionRule918); 
			match(input,VAR,FOLLOW_VAR_in_functionRule920); 
			match(input,RP,FOLLOW_RP_in_functionRule922); 
			match(input,LCB,FOLLOW_LCB_in_functionRule924); 
			pushFollow(FOLLOW_instrRule_in_functionRule926);
			instrRule();
			state._fsp--;

			match(input,RCB,FOLLOW_RCB_in_functionRule928); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:1: forRule : FOR LP VAR IN VAR RP LCB instrRule RCB ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:2: ( FOR LP VAR IN VAR RP LCB instrRule RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:3: FOR LP VAR IN VAR RP LCB instrRule RCB
			{
			match(input,FOR,FOLLOW_FOR_in_forRule944); 
			match(input,LP,FOLLOW_LP_in_forRule946); 
			match(input,VAR,FOLLOW_VAR_in_forRule948); 
			match(input,IN,FOLLOW_IN_in_forRule950); 
			match(input,VAR,FOLLOW_VAR_in_forRule952); 
			match(input,RP,FOLLOW_RP_in_forRule954); 
			match(input,LCB,FOLLOW_LCB_in_forRule956); 
			pushFollow(FOLLOW_instrRule_in_forRule958);
			instrRule();
			state._fsp--;

			match(input,RCB,FOLLOW_RCB_in_forRule960); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:1: classRule : CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:2: ( CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:3: CLASS VAR LCB ( fieldRule )* ( functionRule )* RCB
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule972); 
			match(input,VAR,FOLLOW_VAR_in_classRule974); 
			match(input,LCB,FOLLOW_LCB_in_classRule976); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:17: ( fieldRule )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==OLIST||LA28_0==TEXT||LA28_0==TLIST||LA28_0==ULIST) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:17: fieldRule
					{
					pushFollow(FOLLOW_fieldRule_in_classRule978);
					fieldRule();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:28: ( functionRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==FUN) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:28: functionRule
					{
					pushFollow(FOLLOW_functionRule_in_classRule981);
					functionRule();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			match(input,RCB,FOLLOW_RCB_in_classRule984); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:1: fieldRule : ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule ) SE ;
	public final void fieldRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:2: ( ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule ) SE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule ) SE
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:3: ( fieldTextRule | fieldOlistRule | fieldUlistRule | fieldTlistRule )
			int alt30=4;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:4: fieldTextRule
					{
					pushFollow(FOLLOW_fieldTextRule_in_fieldRule997);
					fieldTextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:5: fieldOlistRule
					{
					pushFollow(FOLLOW_fieldOlistRule_in_fieldRule1003);
					fieldOlistRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:5: fieldUlistRule
					{
					pushFollow(FOLLOW_fieldUlistRule_in_fieldRule1009);
					fieldUlistRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:5: fieldTlistRule
					{
					pushFollow(FOLLOW_fieldTlistRule_in_fieldRule1015);
					fieldTlistRule();
					state._fsp--;

					}
					break;

			}

			match(input,SE,FOLLOW_SE_in_fieldRule1018); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:1: fieldTextRule : TEXT VAR ( EQ textRule )? ;
	public final void fieldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:2: ( TEXT VAR ( EQ textRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:3: TEXT VAR ( EQ textRule )?
			{
			match(input,TEXT,FOLLOW_TEXT_in_fieldTextRule1031); 
			match(input,VAR,FOLLOW_VAR_in_fieldTextRule1033); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:12: ( EQ textRule )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==EQ) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:13: EQ textRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTextRule1036); 
					pushFollow(FOLLOW_textRule_in_fieldTextRule1038);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:1: fieldOlistRule : OLIST VAR ( EQ textListRule )? ;
	public final void fieldOlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:2: ( OLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:3: OLIST VAR ( EQ textListRule )?
			{
			match(input,OLIST,FOLLOW_OLIST_in_fieldOlistRule1053); 
			match(input,VAR,FOLLOW_VAR_in_fieldOlistRule1055); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:13: ( EQ textListRule )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==EQ) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldOlistRule1058); 
					pushFollow(FOLLOW_textListRule_in_fieldOlistRule1060);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:1: fieldUlistRule : ULIST VAR ( EQ textListRule )? ;
	public final void fieldUlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:2: ( ULIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:3: ULIST VAR ( EQ textListRule )?
			{
			match(input,ULIST,FOLLOW_ULIST_in_fieldUlistRule1075); 
			match(input,VAR,FOLLOW_VAR_in_fieldUlistRule1077); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:13: ( EQ textListRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==EQ) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldUlistRule1080); 
					pushFollow(FOLLOW_textListRule_in_fieldUlistRule1082);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:1: fieldTlistRule : TLIST VAR ( EQ textListRule )? ;
	public final void fieldTlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:2: ( TLIST VAR ( EQ textListRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:3: TLIST VAR ( EQ textListRule )?
			{
			match(input,TLIST,FOLLOW_TLIST_in_fieldTlistRule1097); 
			match(input,VAR,FOLLOW_VAR_in_fieldTlistRule1099); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:13: ( EQ textListRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EQ) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:14: EQ textListRule
					{
					match(input,EQ,FOLLOW_EQ_in_fieldTlistRule1102); 
					pushFollow(FOLLOW_textListRule_in_fieldTlistRule1104);
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

	// Delegated rules



	public static final BitSet FOLLOW_instrRule_in_parseJava48 = new BitSet(new long[]{0x81F02220A0D00910L,0x0000000000000017L});
	public static final BitSet FOLLOW_functionRule_in_parseJava52 = new BitSet(new long[]{0x81F02220A0D00910L,0x0000000000000017L});
	public static final BitSet FOLLOW_classRule_in_parseJava56 = new BitSet(new long[]{0x81F02220A0D00910L,0x0000000000000017L});
	public static final BitSet FOLLOW_EOF_in_parseJava60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleRule_in_instrRule76 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_textDeclRule_in_instrRule82 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockquoteRule_in_instrRule88 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_olistRule_in_instrRule94 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_ulistRule_in_instrRule100 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tlistRule_in_instrRule106 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_codeBlockRule_in_instrRule112 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_horizontalRule_in_instrRule118 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_tableRule_in_instrRule124 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_imageRule_in_instrRule130 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_linkRule_in_instrRule136 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_quickLinkRule_in_instrRule142 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_formatTextRule_in_instrRule154 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_instrRule160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forRule_in_instrRule165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule184 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_titleRule187 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_titleRule189 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule193 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule244 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_HA_in_refRule246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_refRule248 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule267 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule270 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule272 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_textRule295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule426 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule429 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule431 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule452 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_olistRule455 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_olistRule457 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule475 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule477 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_textListRule480 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule482 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_textListRule486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule499 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_ulistRule502 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_ulistRule504 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule525 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tlistRule528 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tlistRule530 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODEBLOCK_in_codeBlockRule551 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LP_in_codeBlockRule554 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_codeBlockRule572 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_codeBlockRule577 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_codeBlockRule579 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_textRule_in_codeBlockRule583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINK_in_linkRule615 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_linkRule618 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_linkRule620 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule624 = new BitSet(new long[]{0x1000000080000000L});
	public static final BitSet FOLLOW_textRule_in_linkRule627 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_imageRule_in_linkRule631 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_linkRule634 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule637 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_linkRule655 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMG_in_imageRule674 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_imageRule677 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_imageRule679 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule683 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule686 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_imageRule704 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_imageRule708 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule711 = new BitSet(new long[]{0xFFFFBBFFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_RP_in_imageRule729 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule751 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_quickLinkRule753 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule773 = new BitSet(new long[]{0x00000C0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_tableRule776 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_tableRule778 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule782 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule785 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule787 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_CM_in_tableRule790 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule792 = new BitSet(new long[]{0x0004000000000200L});
	public static final BitSet FOLLOW_RP_in_tableRule796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule812 = new BitSet(new long[]{0x0000801000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule814 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_talignmentRule817 = new BitSet(new long[]{0x0000801000000040L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule819 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule859 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule861 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_CM_in_trowRule864 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule866 = new BitSet(new long[]{0x0008000000000200L});
	public static final BitSet FOLLOW_RSB_in_trowRule870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORMATTEXT_in_formatTextRule887 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_formatTextRule890 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQ_in_formatTextRule892 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_formatTextRule896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUN_in_functionRule912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule914 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_functionRule916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_functionRule918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_functionRule920 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_functionRule922 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_functionRule924 = new BitSet(new long[]{0x81F02220A0500810L,0x0000000000000017L});
	public static final BitSet FOLLOW_instrRule_in_functionRule926 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCB_in_functionRule928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule944 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LP_in_forRule946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule948 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_IN_in_forRule950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_forRule952 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RP_in_forRule954 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_forRule956 = new BitSet(new long[]{0x81F02220A0500810L,0x0000000000000017L});
	public static final BitSet FOLLOW_instrRule_in_forRule958 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCB_in_forRule960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_classRule974 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LCB_in_classRule976 = new BitSet(new long[]{0x0002200000800000L,0x0000000000000015L});
	public static final BitSet FOLLOW_fieldRule_in_classRule978 = new BitSet(new long[]{0x0002200000800000L,0x0000000000000015L});
	public static final BitSet FOLLOW_functionRule_in_classRule981 = new BitSet(new long[]{0x0002000000800000L});
	public static final BitSet FOLLOW_RCB_in_classRule984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldTextRule_in_fieldRule997 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldOlistRule_in_fieldRule1003 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldUlistRule_in_fieldRule1009 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_fieldTlistRule_in_fieldRule1015 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SE_in_fieldRule1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_fieldTextRule1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTextRule1033 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTextRule1036 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_textRule_in_fieldTextRule1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_fieldOlistRule1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldOlistRule1055 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldOlistRule1058 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldOlistRule1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_fieldUlistRule1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldUlistRule1077 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldUlistRule1080 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldUlistRule1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_fieldTlistRule1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_VAR_in_fieldTlistRule1099 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_EQ_in_fieldTlistRule1102 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_textListRule_in_fieldTlistRule1104 = new BitSet(new long[]{0x0000000000000002L});
}
