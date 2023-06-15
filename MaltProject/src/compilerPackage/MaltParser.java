// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-06-15 18:04:06

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BLOCKCODE", "BLOCKQUOTE", 
		"BOLD", "C", "CL", "CLANGUAGE", "CM", "CODE", "COMMENT", "CPPLANGUAGE", 
		"DIGIT", "DO", "DOTCOM", "EQ", "ESC_SEQ", "EX", "EXPONENT", "FLOAT", "GET", 
		"HA", "HEX_DIGIT", "HL", "HRULE", "HTTP", "HTTPS", "ID", "INTEGER", "IT", 
		"ITBOLD", "JAVALANGUAGE", "L", "LAB", "LCB", "LET", "LETTER", "LP", "LSB", 
		"OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", 
		"S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", "ST", "SUBS", 
		"SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "VAR", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int BLOCKCODE=5;
	public static final int BLOCKQUOTE=6;
	public static final int BOLD=7;
	public static final int C=8;
	public static final int CL=9;
	public static final int CLANGUAGE=10;
	public static final int CM=11;
	public static final int CODE=12;
	public static final int COMMENT=13;
	public static final int CPPLANGUAGE=14;
	public static final int DIGIT=15;
	public static final int DO=16;
	public static final int DOTCOM=17;
	public static final int EQ=18;
	public static final int ESC_SEQ=19;
	public static final int EX=20;
	public static final int EXPONENT=21;
	public static final int FLOAT=22;
	public static final int GET=23;
	public static final int HA=24;
	public static final int HEX_DIGIT=25;
	public static final int HL=26;
	public static final int HRULE=27;
	public static final int HTTP=28;
	public static final int HTTPS=29;
	public static final int ID=30;
	public static final int INTEGER=31;
	public static final int IT=32;
	public static final int ITBOLD=33;
	public static final int JAVALANGUAGE=34;
	public static final int L=35;
	public static final int LAB=36;
	public static final int LCB=37;
	public static final int LET=38;
	public static final int LETTER=39;
	public static final int LP=40;
	public static final int LSB=41;
	public static final int OCTAL_ESC=42;
	public static final int OLIST=43;
	public static final int QU=44;
	public static final int R=45;
	public static final int RAB=46;
	public static final int RCB=47;
	public static final int RP=48;
	public static final int RSB=49;
	public static final int S1TITLE=50;
	public static final int S2TITLE=51;
	public static final int S3TITLE=52;
	public static final int S4TITLE=53;
	public static final int S5TITLE=54;
	public static final int SE=55;
	public static final int SL=56;
	public static final int ST=57;
	public static final int SUBS=58;
	public static final int SUPS=59;
	public static final int TABLE=60;
	public static final int TEXT=61;
	public static final int TITLE=62;
	public static final int TLIST=63;
	public static final int ULIST=64;
	public static final int UNICODE_ESC=65;
	public static final int VAR=66;
	public static final int WS=67;

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : titleRule ( titleRule )* ( textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+ ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( titleRule ( titleRule )* ( textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: titleRule ( titleRule )* ( textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+
			{
			pushFollow(FOLLOW_titleRule_in_parseJava48);
			titleRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:3: ( titleRule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= S1TITLE && LA1_0 <= S5TITLE)||LA1_0==TITLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:4: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_parseJava53);
					titleRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:3: ( textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=10;
				switch ( input.LA(1) ) {
				case TEXT:
					{
					alt2=1;
					}
					break;
				case BLOCKQUOTE:
					{
					alt2=2;
					}
					break;
				case OLIST:
					{
					alt2=3;
					}
					break;
				case ULIST:
					{
					alt2=4;
					}
					break;
				case TLIST:
					{
					alt2=5;
					}
					break;
				case BLOCKCODE:
					{
					alt2=6;
					}
					break;
				case HRULE:
					{
					alt2=7;
					}
					break;
				case TABLE:
					{
					alt2=8;
					}
					break;
				case EX:
					{
					alt2=9;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:4: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_parseJava60);
					textDeclRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:19: blockquoteRule
					{
					pushFollow(FOLLOW_blockquoteRule_in_parseJava64);
					blockquoteRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:36: olistRule
					{
					pushFollow(FOLLOW_olistRule_in_parseJava68);
					olistRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:48: ulistRule
					{
					pushFollow(FOLLOW_ulistRule_in_parseJava72);
					ulistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:60: tlistRule
					{
					pushFollow(FOLLOW_tlistRule_in_parseJava76);
					tlistRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:72: blockCodeRule
					{
					pushFollow(FOLLOW_blockCodeRule_in_parseJava80);
					blockCodeRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:88: horizontalRule
					{
					pushFollow(FOLLOW_horizontalRule_in_parseJava84);
					horizontalRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:105: tableRule
					{
					pushFollow(FOLLOW_tableRule_in_parseJava88);
					tableRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:23:117: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_parseJava92);
					imageRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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



	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:1: titleRule : titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:2: ( titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:3: titleTypeRule VAR EQ ( subtextRule )+ ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule111);
			titleTypeRule();
			state._fsp--;

			match(input,VAR,FOLLOW_VAR_in_titleRule113); 
			match(input,EQ,FOLLOW_EQ_in_titleRule115); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:24: ( subtextRule )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CL||LA3_0==CM||LA3_0==DO||LA3_0==INTEGER||LA3_0==SE||LA3_0==VAR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:24: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_titleRule117);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:37: ( refRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LCB) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:29:37: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule120);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:34:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:1: refRule : LCB HA ID RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:2: ( LCB HA ID RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:40:3: LCB HA ID RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule169); 
			match(input,HA,FOLLOW_HA_in_refRule171); 
			match(input,ID,FOLLOW_ID_in_refRule173); 
			match(input,RCB,FOLLOW_RCB_in_refRule175); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:1: textDeclRule : TEXT VAR EQ textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:45:2: ( TEXT VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:46:3: TEXT VAR EQ textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule192); 
			match(input,VAR,FOLLOW_VAR_in_textDeclRule194); 
			match(input,EQ,FOLLOW_EQ_in_textDeclRule196); 
			pushFollow(FOLLOW_textRule_in_textDeclRule198);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:1: textRule : ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:2: ( ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=12;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case VAR:
					{
					alt5=1;
					}
					break;
				case IT:
					{
					alt5=2;
					}
					break;
				case BOLD:
					{
					alt5=3;
					}
					break;
				case ITBOLD:
					{
					alt5=4;
					}
					break;
				case ST:
					{
					alt5=5;
					}
					break;
				case HL:
					{
					alt5=6;
					}
					break;
				case SUBS:
					{
					alt5=7;
					}
					break;
				case SUPS:
					{
					alt5=8;
					}
					break;
				case CODE:
					{
					alt5=9;
					}
					break;
				case LSB:
					{
					alt5=10;
					}
					break;
				case LAB:
					{
					alt5=11;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textRule215);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:5: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule221);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:5: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule227);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:5: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule233);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule239);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:5: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule245);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:5: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule251);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:5: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule257);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule263);
					codeTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:5: linkRule
					{
					pushFollow(FOLLOW_linkRule_in_textRule269);
					linkRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:5: quickLinkRule
					{
					pushFollow(FOLLOW_quickLinkRule_in_textRule275);
					quickLinkRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:1: italicTextRule : IT ( subtextRule )+ IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:66:2: ( IT ( subtextRule )+ IT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:3: IT ( subtextRule )+ IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule290); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:7: ( subtextRule )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CL||LA6_0==CM||LA6_0==DO||LA6_0==INTEGER||LA6_0==SE||LA6_0==VAR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:7: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_italicTextRule293);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input,IT,FOLLOW_IT_in_italicTextRule296); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:1: boldTextRule : BOLD ( subtextRule )+ BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:72:2: ( BOLD ( subtextRule )+ BOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:3: BOLD ( subtextRule )+ BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule313); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:8: ( subtextRule )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CL||LA7_0==CM||LA7_0==DO||LA7_0==INTEGER||LA7_0==SE||LA7_0==VAR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_boldTextRule315);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule318); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:1: ibTextRule : ITBOLD ( subtextRule )+ ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:78:2: ( ITBOLD ( subtextRule )+ ITBOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:3: ITBOLD ( subtextRule )+ ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule334); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:10: ( subtextRule )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==CL||LA8_0==CM||LA8_0==DO||LA8_0==INTEGER||LA8_0==SE||LA8_0==VAR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:10: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_ibTextRule336);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule339); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:1: strikethroughtTextRule : ST ( subtextRule )+ ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:84:2: ( ST ( subtextRule )+ ST )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:3: ST ( subtextRule )+ ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule355); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:6: ( subtextRule )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CL||LA9_0==CM||LA9_0==DO||LA9_0==INTEGER||LA9_0==SE||LA9_0==VAR) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule357);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule360); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:1: highlightTextRule : HL ( subtextRule )+ HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:90:2: ( HL ( subtextRule )+ HL )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:3: HL ( subtextRule )+ HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule376); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:6: ( subtextRule )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CL||LA10_0==CM||LA10_0==DO||LA10_0==INTEGER||LA10_0==SE||LA10_0==VAR) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_highlightTextRule378);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input,HL,FOLLOW_HL_in_highlightTextRule381); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:1: subscriptTextRule : SUBS ( subtextRule )+ SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:96:2: ( SUBS ( subtextRule )+ SUBS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:3: SUBS ( subtextRule )+ SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule397); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:8: ( subtextRule )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CL||LA11_0==CM||LA11_0==DO||LA11_0==INTEGER||LA11_0==SE||LA11_0==VAR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_subscriptTextRule399);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule402); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:1: superscriptTextRule : SUPS ( subtextRule )+ SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:102:2: ( SUPS ( subtextRule )+ SUPS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:3: SUPS ( subtextRule )+ SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule418); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:8: ( subtextRule )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CL||LA12_0==CM||LA12_0==DO||LA12_0==INTEGER||LA12_0==SE||LA12_0==VAR) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_superscriptTextRule420);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule423); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:1: codeTextRule : CODE ( subtextRule )+ CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:108:2: ( CODE ( subtextRule )+ CODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:3: CODE ( subtextRule )+ CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule439); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:8: ( subtextRule )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CL||LA13_0==CM||LA13_0==DO||LA13_0==INTEGER||LA13_0==SE||LA13_0==VAR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_codeTextRule441);
					subtextRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input,CODE,FOLLOW_CODE_in_codeTextRule444); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:1: subtextRule : ( VAR | INTEGER | DO | CM | SE | CL ) ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:114:2: ( ( VAR | INTEGER | DO | CM | SE | CL ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:3: ( VAR | INTEGER | DO | CM | SE | CL )
			{
			if ( input.LA(1)==CL||input.LA(1)==CM||input.LA(1)==DO||input.LA(1)==INTEGER||input.LA(1)==SE||input.LA(1)==VAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:1: blockquoteRule : BLOCKQUOTE VAR EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:2: ( BLOCKQUOTE VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:3: BLOCKQUOTE VAR EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule501); 
			match(input,VAR,FOLLOW_VAR_in_blockquoteRule503); 
			match(input,EQ,FOLLOW_EQ_in_blockquoteRule505); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule507);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:1: olistRule : OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:2: ( OLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:127:3: OLIST textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule524); 
			pushFollow(FOLLOW_textListRule_in_olistRule526);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:1: textListRule : LP VAR ( CM VAR )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:2: ( LP VAR ( CM VAR )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:4: LP VAR ( CM VAR )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule540); 
			match(input,VAR,FOLLOW_VAR_in_textListRule542); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:11: ( CM VAR )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:132:12: CM VAR
					{
					match(input,CM,FOLLOW_CM_in_textListRule545); 
					match(input,VAR,FOLLOW_VAR_in_textListRule547); 
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule551); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:1: ulistRule : ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:2: ( ULIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:137:3: ULIST textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule564); 
			pushFollow(FOLLOW_textListRule_in_ulistRule566);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:1: tlistRule : TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:142:2: ( TLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:143:3: TLIST textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule583); 
			pushFollow(FOLLOW_textListRule_in_tlistRule585);
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



	// $ANTLR start "blockCodeRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:1: blockCodeRule : BLOCKCODE ( languageRule )? textRule BLOCKCODE ;
	public final void blockCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:148:2: ( BLOCKCODE ( languageRule )? textRule BLOCKCODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:3: BLOCKCODE ( languageRule )? textRule BLOCKCODE
			{
			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule602); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:13: ( languageRule )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CLANGUAGE||LA15_0==CPPLANGUAGE||LA15_0==JAVALANGUAGE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:13: languageRule
					{
					pushFollow(FOLLOW_languageRule_in_blockCodeRule604);
					languageRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockCodeRule607);
			textRule();
			state._fsp--;

			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule609); 
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
	// $ANTLR end "blockCodeRule"



	// $ANTLR start "languageRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:153:1: languageRule : ( JAVALANGUAGE | CLANGUAGE | CPPLANGUAGE );
	public final void languageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:2: ( JAVALANGUAGE | CLANGUAGE | CPPLANGUAGE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( input.LA(1)==CLANGUAGE||input.LA(1)==CPPLANGUAGE||input.LA(1)==JAVALANGUAGE ) {
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
	// $ANTLR end "languageRule"



	// $ANTLR start "horizontalRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule645); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: linkRule : LSB ( textRule | imageRule ) RSB LP textLinkRule RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: ( LSB ( textRule | imageRule ) RSB LP textLinkRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: LSB ( textRule | imageRule ) RSB LP textLinkRule RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule661); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:7: ( textRule | imageRule )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BOLD||LA16_0==CL||(LA16_0 >= CM && LA16_0 <= CODE)||LA16_0==DO||LA16_0==HL||(LA16_0 >= INTEGER && LA16_0 <= ITBOLD)||LA16_0==LAB||LA16_0==LSB||LA16_0==SE||(LA16_0 >= ST && LA16_0 <= SUPS)||LA16_0==VAR) ) {
				alt16=1;
			}
			else if ( (LA16_0==EX) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule664);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule668);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule671); 
			match(input,LP,FOLLOW_LP_in_linkRule673); 
			pushFollow(FOLLOW_textLinkRule_in_linkRule675);
			textLinkRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule677); 
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



	// $ANTLR start "textLinkRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:1: textLinkRule : ( subtextRule | SL | AT )+ ;
	public final void textLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:2: ( ( subtextRule | SL | AT )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: ( subtextRule | SL | AT )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:3: ( subtextRule | SL | AT )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=4;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case VAR:
					{
					alt17=1;
					}
					break;
				case SL:
					{
					alt17=2;
					}
					break;
				case AT:
					{
					alt17=3;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textLinkRule694);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:18: SL
					{
					match(input,SL,FOLLOW_SL_in_textLinkRule698); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:172:23: AT
					{
					match(input,AT,FOLLOW_AT_in_textLinkRule702); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			System.out.println("    - LINK");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "textLinkRule"



	// $ANTLR start "imageRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:1: imageRule : EX LSB textLinkRule RSB LP textLinkRule ( QU ( subtextRule )+ QU )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:2: ( EX LSB textLinkRule RSB LP textLinkRule ( QU ( subtextRule )+ QU )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:3: EX LSB textLinkRule RSB LP textLinkRule ( QU ( subtextRule )+ QU )? RP
			{
			match(input,EX,FOLLOW_EX_in_imageRule721); 
			match(input,LSB,FOLLOW_LSB_in_imageRule723); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule725);
			textLinkRule();
			state._fsp--;

			match(input,RSB,FOLLOW_RSB_in_imageRule727); 
			match(input,LP,FOLLOW_LP_in_imageRule729); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule731);
			textLinkRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:43: ( QU ( subtextRule )+ QU )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==QU) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:44: QU ( subtextRule )+ QU
					{
					match(input,QU,FOLLOW_QU_in_imageRule734); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:47: ( subtextRule )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CL||LA18_0==CM||LA18_0==DO||LA18_0==INTEGER||LA18_0==SE||LA18_0==VAR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:178:47: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_imageRule736);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input,QU,FOLLOW_QU_in_imageRule739); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule743); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:1: quickLinkRule : LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:2: ( LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:3: LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule760); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:7: ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= HTTP && LA23_0 <= HTTPS)) ) {
				alt23=1;
			}
			else if ( (LA23_0==CL||LA23_0==CM||LA23_0==DO||LA23_0==INTEGER||LA23_0==SE||LA23_0==VAR) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:9: ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM
					{
					if ( (input.LA(1) >= HTTP && input.LA(1) <= HTTPS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:24: ( subtextRule )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CL||LA20_0==CM||LA20_0==DO||LA20_0==INTEGER||LA20_0==SE||LA20_0==VAR) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:24: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule772);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule775); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:48: ( subtextRule )+ AT ( subtextRule )+ DOTCOM
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:48: ( subtextRule )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==CL||LA21_0==CM||LA21_0==DO||LA21_0==INTEGER||LA21_0==SE||LA21_0==VAR) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:48: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule781);
							subtextRule();
							state._fsp--;

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input,AT,FOLLOW_AT_in_quickLinkRule784); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:64: ( subtextRule )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==CL||LA22_0==CM||LA22_0==DO||LA22_0==INTEGER||LA22_0==SE||LA22_0==VAR) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:184:64: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule786);
							subtextRule();
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

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule789); 
					}

					}
					break;

			}

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule793); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:189:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule811); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:9: ( talignmentRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LSB) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule813);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule816); 
			pushFollow(FOLLOW_trowRule_in_tableRule818);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:37: ( CM trowRule )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule821); 
					pushFollow(FOLLOW_trowRule_in_tableRule823);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule827); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:195:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule843); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule845);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:17: ( CM alignRule )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==CM) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:196:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule848); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule850);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop26;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule854); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:200:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:1: trowRule : LSB VAR ( CM VAR )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:2: ( LSB VAR ( CM VAR )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:3: LSB VAR ( CM VAR )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule886); 
			match(input,VAR,FOLLOW_VAR_in_trowRule888); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:11: ( CM VAR )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CM) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:206:12: CM VAR
					{
					match(input,CM,FOLLOW_CM_in_trowRule891); 
					match(input,VAR,FOLLOW_VAR_in_trowRule893); 
					}
					break;

				default :
					break loop27;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule897); 
			}

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



	public static final BitSet FOLLOW_titleRule_in_parseJava48 = new BitSet(new long[]{0xF07C080008100060L,0x0000000000000001L});
	public static final BitSet FOLLOW_titleRule_in_parseJava53 = new BitSet(new long[]{0xF07C080008100060L,0x0000000000000001L});
	public static final BitSet FOLLOW_textDeclRule_in_parseJava60 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_blockquoteRule_in_parseJava64 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_olistRule_in_parseJava68 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_ulistRule_in_parseJava72 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_tlistRule_in_parseJava76 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_blockCodeRule_in_parseJava80 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_horizontalRule_in_parseJava84 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_tableRule_in_parseJava88 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_imageRule_in_parseJava92 = new BitSet(new long[]{0xB000080008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_titleRule113 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_titleRule115 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_titleRule117 = new BitSet(new long[]{0x0080002080010A02L,0x0000000000000004L});
	public static final BitSet FOLLOW_refRule_in_titleRule120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule169 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HA_in_refRule171 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ID_in_refRule173 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule194 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule196 = new BitSet(new long[]{0x0E80021384011A80L,0x0000000000000004L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule215 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule221 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule227 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule233 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule239 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule245 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule251 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule257 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule263 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_linkRule_in_textRule269 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_quickLinkRule_in_textRule275 = new BitSet(new long[]{0x0E80021384011A82L,0x0000000000000004L});
	public static final BitSet FOLLOW_IT_in_italicTextRule290 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule293 = new BitSet(new long[]{0x0080000180010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_IT_in_italicTextRule296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule313 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule315 = new BitSet(new long[]{0x0080000080010A80L,0x0000000000000004L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule334 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule336 = new BitSet(new long[]{0x0080000280010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule355 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule357 = new BitSet(new long[]{0x0280000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule376 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule378 = new BitSet(new long[]{0x0080000084010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule397 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule399 = new BitSet(new long[]{0x0480000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule418 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule420 = new BitSet(new long[]{0x0880000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule439 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule441 = new BitSet(new long[]{0x0080000080011A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_subtextRule461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule503 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule505 = new BitSet(new long[]{0x0E80021384011A80L,0x0000000000000004L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule524 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_textListRule542 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CM_in_textListRule545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_textListRule547 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_RP_in_textListRule551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule564 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule583 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule602 = new BitSet(new long[]{0x0E80021784015E80L,0x0000000000000004L});
	public static final BitSet FOLLOW_languageRule_in_blockCodeRule604 = new BitSet(new long[]{0x0E80021384011A80L,0x0000000000000004L});
	public static final BitSet FOLLOW_textRule_in_blockCodeRule607 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule661 = new BitSet(new long[]{0x0E80021384111A80L,0x0000000000000004L});
	public static final BitSet FOLLOW_textRule_in_linkRule664 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule668 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule671 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule673 = new BitSet(new long[]{0x0180000080010A10L,0x0000000000000004L});
	public static final BitSet FOLLOW_textLinkRule_in_linkRule675 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textLinkRule694 = new BitSet(new long[]{0x0180000080010A12L,0x0000000000000004L});
	public static final BitSet FOLLOW_SL_in_textLinkRule698 = new BitSet(new long[]{0x0180000080010A12L,0x0000000000000004L});
	public static final BitSet FOLLOW_AT_in_textLinkRule702 = new BitSet(new long[]{0x0180000080010A12L,0x0000000000000004L});
	public static final BitSet FOLLOW_EX_in_imageRule721 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LSB_in_imageRule723 = new BitSet(new long[]{0x0180000080010A10L,0x0000000000000004L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule725 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RSB_in_imageRule727 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule729 = new BitSet(new long[]{0x0180000080010A10L,0x0000000000000004L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule731 = new BitSet(new long[]{0x0001100000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule734 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_imageRule736 = new BitSet(new long[]{0x0080100080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_QU_in_imageRule739 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule760 = new BitSet(new long[]{0x00800000B0010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_quickLinkRule764 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule772 = new BitSet(new long[]{0x0080000080030A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule775 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule781 = new BitSet(new long[]{0x0080000080010A10L,0x0000000000000004L});
	public static final BitSet FOLLOW_AT_in_quickLinkRule784 = new BitSet(new long[]{0x0080000080010A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule786 = new BitSet(new long[]{0x0080000080030A00L,0x0000000000000004L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule789 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule811 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule813 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule816 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule818 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_CM_in_tableRule821 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule823 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_RP_in_tableRule827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule843 = new BitSet(new long[]{0x0000200800000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule845 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_CM_in_talignmentRule848 = new BitSet(new long[]{0x0000200800000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule850 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_trowRule888 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_CM_in_trowRule891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_trowRule893 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_RSB_in_trowRule897 = new BitSet(new long[]{0x0000000000000002L});
}
