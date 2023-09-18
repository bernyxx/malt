// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-09-18 23:08:27

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
		"HA", "HEX_DIGIT", "HL", "HRULE", "HTTP", "HTTPS", "INTEGER", "IT", "ITBOLD", 
		"JAVALANGUAGE", "L", "LAB", "LCB", "LET", "LETTER", "LP", "LSB", "OCTAL_ESC", 
		"OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", "S1TITLE", "S2TITLE", "S3TITLE", 
		"S4TITLE", "S5TITLE", "SE", "SL", "ST", "STRING", "SUBS", "SUPS", "TABLE", 
		"TEXT", "TITLE", "TLIST", "ULIST", "UNICODE_ESC", "US", "VAR", "WS"
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
	public static final int INTEGER=30;
	public static final int IT=31;
	public static final int ITBOLD=32;
	public static final int JAVALANGUAGE=33;
	public static final int L=34;
	public static final int LAB=35;
	public static final int LCB=36;
	public static final int LET=37;
	public static final int LETTER=38;
	public static final int LP=39;
	public static final int LSB=40;
	public static final int OCTAL_ESC=41;
	public static final int OLIST=42;
	public static final int QU=43;
	public static final int R=44;
	public static final int RAB=45;
	public static final int RCB=46;
	public static final int RP=47;
	public static final int RSB=48;
	public static final int S1TITLE=49;
	public static final int S2TITLE=50;
	public static final int S3TITLE=51;
	public static final int S4TITLE=52;
	public static final int S5TITLE=53;
	public static final int SE=54;
	public static final int SL=55;
	public static final int ST=56;
	public static final int STRING=57;
	public static final int SUBS=58;
	public static final int SUPS=59;
	public static final int TABLE=60;
	public static final int TEXT=61;
	public static final int TITLE=62;
	public static final int TLIST=63;
	public static final int ULIST=64;
	public static final int UNICODE_ESC=65;
	public static final int US=66;
	public static final int VAR=67;
	public static final int WS=68;

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+ ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: ( titleRule | textDeclRule | blockquoteRule | olistRule | ulistRule | tlistRule | blockCodeRule | horizontalRule | tableRule | imageRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=11;
				switch ( input.LA(1) ) {
				case S1TITLE:
				case S2TITLE:
				case S3TITLE:
				case S4TITLE:
				case S5TITLE:
				case TITLE:
					{
					alt1=1;
					}
					break;
				case TEXT:
					{
					alt1=2;
					}
					break;
				case BLOCKQUOTE:
					{
					alt1=3;
					}
					break;
				case OLIST:
					{
					alt1=4;
					}
					break;
				case ULIST:
					{
					alt1=5;
					}
					break;
				case TLIST:
					{
					alt1=6;
					}
					break;
				case BLOCKCODE:
					{
					alt1=7;
					}
					break;
				case HRULE:
					{
					alt1=8;
					}
					break;
				case TABLE:
					{
					alt1=9;
					}
					break;
				case EX:
					{
					alt1=10;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:4: titleRule
					{
					pushFollow(FOLLOW_titleRule_in_parseJava48);
					titleRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:16: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_parseJava52);
					textDeclRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:31: blockquoteRule
					{
					pushFollow(FOLLOW_blockquoteRule_in_parseJava56);
					blockquoteRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:48: olistRule
					{
					pushFollow(FOLLOW_olistRule_in_parseJava60);
					olistRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:60: ulistRule
					{
					pushFollow(FOLLOW_ulistRule_in_parseJava64);
					ulistRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:72: tlistRule
					{
					pushFollow(FOLLOW_tlistRule_in_parseJava68);
					tlistRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:84: blockCodeRule
					{
					pushFollow(FOLLOW_blockCodeRule_in_parseJava72);
					blockCodeRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:100: horizontalRule
					{
					pushFollow(FOLLOW_horizontalRule_in_parseJava76);
					horizontalRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:117: tableRule
					{
					pushFollow(FOLLOW_tableRule_in_parseJava80);
					tableRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:129: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_parseJava84);
					imageRule();
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



	// $ANTLR start "titleRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:25:1: titleRule : titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:2: ( titleTypeRule VAR EQ ( subtextRule )+ ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:3: titleTypeRule VAR EQ ( subtextRule )+ ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule103);
			titleTypeRule();
			state._fsp--;

			match(input,VAR,FOLLOW_VAR_in_titleRule105); 
			match(input,EQ,FOLLOW_EQ_in_titleRule107); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:24: ( subtextRule )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CL||LA2_0==CM||LA2_0==DO||LA2_0==INTEGER||LA2_0==SE||LA2_0==STRING) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:24: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_titleRule109);
					subtextRule();
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

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:37: ( refRule )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LCB) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:37: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule112);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:31:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:36:1: refRule : LCB HA VAR RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:2: ( LCB HA VAR RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:3: LCB HA VAR RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule161); 
			match(input,HA,FOLLOW_HA_in_refRule163); 
			match(input,VAR,FOLLOW_VAR_in_refRule165); 
			match(input,RCB,FOLLOW_RCB_in_refRule167); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:42:1: textDeclRule : TEXT VAR EQ textRule ;
	public final void textDeclRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:43:2: ( TEXT VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:44:3: TEXT VAR EQ textRule
			{
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule184); 
			match(input,VAR,FOLLOW_VAR_in_textDeclRule186); 
			match(input,EQ,FOLLOW_EQ_in_textDeclRule188); 
			pushFollow(FOLLOW_textRule_in_textDeclRule190);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:1: textRule : ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:2: ( ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule | linkRule | quickLinkRule )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=12;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case STRING:
					{
					alt4=1;
					}
					break;
				case IT:
					{
					alt4=2;
					}
					break;
				case BOLD:
					{
					alt4=3;
					}
					break;
				case ITBOLD:
					{
					alt4=4;
					}
					break;
				case ST:
					{
					alt4=5;
					}
					break;
				case HL:
					{
					alt4=6;
					}
					break;
				case SUBS:
					{
					alt4=7;
					}
					break;
				case SUPS:
					{
					alt4=8;
					}
					break;
				case CODE:
					{
					alt4=9;
					}
					break;
				case LSB:
					{
					alt4=10;
					}
					break;
				case LAB:
					{
					alt4=11;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textRule207);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:5: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule213);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:5: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule219);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:5: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule225);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule231);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:5: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule237);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:5: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule243);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:5: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule249);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule255);
					codeTextRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:59:5: linkRule
					{
					pushFollow(FOLLOW_linkRule_in_textRule261);
					linkRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:60:5: quickLinkRule
					{
					pushFollow(FOLLOW_quickLinkRule_in_textRule267);
					quickLinkRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:1: italicTextRule : IT ( subtextRule )+ IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:64:2: ( IT ( subtextRule )+ IT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:3: IT ( subtextRule )+ IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule282); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:7: ( subtextRule )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CL||LA5_0==CM||LA5_0==DO||LA5_0==INTEGER||LA5_0==SE||LA5_0==STRING) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:65:7: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_italicTextRule285);
					subtextRule();
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

			match(input,IT,FOLLOW_IT_in_italicTextRule288); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:1: boldTextRule : BOLD ( subtextRule )+ BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:70:2: ( BOLD ( subtextRule )+ BOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:3: BOLD ( subtextRule )+ BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule305); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:8: ( subtextRule )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CL||LA6_0==CM||LA6_0==DO||LA6_0==INTEGER||LA6_0==SE||LA6_0==STRING) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:71:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_boldTextRule307);
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

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule310); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:1: ibTextRule : ITBOLD ( subtextRule )+ ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:76:2: ( ITBOLD ( subtextRule )+ ITBOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:3: ITBOLD ( subtextRule )+ ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule326); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:10: ( subtextRule )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CL||LA7_0==CM||LA7_0==DO||LA7_0==INTEGER||LA7_0==SE||LA7_0==STRING) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:77:10: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_ibTextRule328);
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

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule331); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:1: strikethroughtTextRule : ST ( subtextRule )+ ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:82:2: ( ST ( subtextRule )+ ST )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:3: ST ( subtextRule )+ ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule347); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:6: ( subtextRule )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==CL||LA8_0==CM||LA8_0==DO||LA8_0==INTEGER||LA8_0==SE||LA8_0==STRING) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:83:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule349);
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

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule352); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:1: highlightTextRule : HL ( subtextRule )+ HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:88:2: ( HL ( subtextRule )+ HL )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:3: HL ( subtextRule )+ HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule368); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:6: ( subtextRule )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CL||LA9_0==CM||LA9_0==DO||LA9_0==INTEGER||LA9_0==SE||LA9_0==STRING) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:89:6: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_highlightTextRule370);
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

			match(input,HL,FOLLOW_HL_in_highlightTextRule373); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:93:1: subscriptTextRule : SUBS ( subtextRule )+ SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:94:2: ( SUBS ( subtextRule )+ SUBS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:3: SUBS ( subtextRule )+ SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule389); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:8: ( subtextRule )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CL||LA10_0==CM||LA10_0==DO||LA10_0==INTEGER||LA10_0==SE||LA10_0==STRING) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:95:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_subscriptTextRule391);
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

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule394); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:1: superscriptTextRule : SUPS ( subtextRule )+ SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:100:2: ( SUPS ( subtextRule )+ SUPS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:3: SUPS ( subtextRule )+ SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule410); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:8: ( subtextRule )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CL||LA11_0==CM||LA11_0==DO||LA11_0==INTEGER||LA11_0==SE||LA11_0==STRING) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:101:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_superscriptTextRule412);
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

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule415); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:105:1: codeTextRule : CODE ( subtextRule )+ CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:106:2: ( CODE ( subtextRule )+ CODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:3: CODE ( subtextRule )+ CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule431); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:8: ( subtextRule )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CL||LA12_0==CM||LA12_0==DO||LA12_0==INTEGER||LA12_0==SE||LA12_0==STRING) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:107:8: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_codeTextRule433);
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

			match(input,CODE,FOLLOW_CODE_in_codeTextRule436); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:111:1: subtextRule : ( STRING | INTEGER | DO | CM | SE | CL ) ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:112:2: ( ( STRING | INTEGER | DO | CM | SE | CL ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:113:3: ( STRING | INTEGER | DO | CM | SE | CL )
			{
			if ( input.LA(1)==CL||input.LA(1)==CM||input.LA(1)==DO||input.LA(1)==INTEGER||input.LA(1)==SE||input.LA(1)==STRING ) {
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:1: blockquoteRule : BLOCKQUOTE VAR EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:118:2: ( BLOCKQUOTE VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:119:3: BLOCKQUOTE VAR EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule493); 
			match(input,VAR,FOLLOW_VAR_in_blockquoteRule495); 
			match(input,EQ,FOLLOW_EQ_in_blockquoteRule497); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule499);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:123:1: olistRule : OLIST textListRule ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:124:2: ( OLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:3: OLIST textListRule
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule516); 
			pushFollow(FOLLOW_textListRule_in_olistRule518);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:1: textListRule : LP STRING ( CM STRING )+ RP ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:2: ( LP STRING ( CM STRING )+ RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:4: LP STRING ( CM STRING )+ RP
			{
			match(input,LP,FOLLOW_LP_in_textListRule532); 
			match(input,STRING,FOLLOW_STRING_in_textListRule534); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:14: ( CM STRING )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_textListRule537); 
					match(input,STRING,FOLLOW_STRING_in_textListRule539); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input,RP,FOLLOW_RP_in_textListRule543); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:133:1: ulistRule : ULIST textListRule ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:2: ( ULIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:3: ULIST textListRule
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule556); 
			pushFollow(FOLLOW_textListRule_in_ulistRule558);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:1: tlistRule : TLIST textListRule ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:2: ( TLIST textListRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:3: TLIST textListRule
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule575); 
			pushFollow(FOLLOW_textListRule_in_tlistRule577);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:1: blockCodeRule : BLOCKCODE ( languageRule )? textRule BLOCKCODE ;
	public final void blockCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:146:2: ( BLOCKCODE ( languageRule )? textRule BLOCKCODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:3: BLOCKCODE ( languageRule )? textRule BLOCKCODE
			{
			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule594); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:13: ( languageRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==CLANGUAGE||LA14_0==CPPLANGUAGE||LA14_0==JAVALANGUAGE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:147:13: languageRule
					{
					pushFollow(FOLLOW_languageRule_in_blockCodeRule596);
					languageRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockCodeRule599);
			textRule();
			state._fsp--;

			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule601); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:151:1: languageRule : ( JAVALANGUAGE | CLANGUAGE | CPPLANGUAGE );
	public final void languageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:152:2: ( JAVALANGUAGE | CLANGUAGE | CPPLANGUAGE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:157:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:158:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule637); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:162:1: linkRule : LSB ( textRule | imageRule ) RSB LP textLinkRule RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:163:2: ( LSB ( textRule | imageRule ) RSB LP textLinkRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:3: LSB ( textRule | imageRule ) RSB LP textLinkRule RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule653); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:7: ( textRule | imageRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BOLD||LA15_0==CL||(LA15_0 >= CM && LA15_0 <= CODE)||LA15_0==DO||LA15_0==HL||(LA15_0 >= INTEGER && LA15_0 <= ITBOLD)||LA15_0==LAB||LA15_0==LSB||LA15_0==SE||(LA15_0 >= ST && LA15_0 <= SUPS)) ) {
				alt15=1;
			}
			else if ( (LA15_0==EX) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule656);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule660);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule663); 
			match(input,LP,FOLLOW_LP_in_linkRule665); 
			pushFollow(FOLLOW_textLinkRule_in_linkRule667);
			textLinkRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule669); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:168:1: textLinkRule : ( subtextRule | SL | AT )+ ;
	public final void textLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:2: ( ( subtextRule | SL | AT )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:3: ( subtextRule | SL | AT )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:3: ( subtextRule | SL | AT )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=4;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case STRING:
					{
					alt16=1;
					}
					break;
				case SL:
					{
					alt16=2;
					}
					break;
				case AT:
					{
					alt16=3;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textLinkRule686);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:18: SL
					{
					match(input,SL,FOLLOW_SL_in_textLinkRule690); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:23: AT
					{
					match(input,AT,FOLLOW_AT_in_textLinkRule694); 
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:174:1: imageRule : EX LSB textLinkRule RSB LP textLinkRule ( STRING )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:2: ( EX LSB textLinkRule RSB LP textLinkRule ( STRING )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:3: EX LSB textLinkRule RSB LP textLinkRule ( STRING )? RP
			{
			match(input,EX,FOLLOW_EX_in_imageRule713); 
			match(input,LSB,FOLLOW_LSB_in_imageRule715); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule717);
			textLinkRule();
			state._fsp--;

			match(input,RSB,FOLLOW_RSB_in_imageRule719); 
			match(input,LP,FOLLOW_LP_in_imageRule721); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule723);
			textLinkRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:43: ( STRING )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==STRING) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:44: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_imageRule726); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule730); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:1: quickLinkRule : LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:2: ( LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:3: LAB ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) ) RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule747); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:7: ( ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM ) | ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= HTTP && LA21_0 <= HTTPS)) ) {
				alt21=1;
			}
			else if ( (LA21_0==CL||LA21_0==CM||LA21_0==DO||LA21_0==INTEGER||LA21_0==SE||LA21_0==STRING) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:8: ( ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:9: ( HTTP | HTTPS ) ( subtextRule )+ DOTCOM
					{
					if ( (input.LA(1) >= HTTP && input.LA(1) <= HTTPS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:24: ( subtextRule )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CL||LA18_0==CM||LA18_0==DO||LA18_0==INTEGER||LA18_0==SE||LA18_0==STRING) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:24: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule759);
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

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule762); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:47: ( ( subtextRule )+ AT ( subtextRule )+ DOTCOM )
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:48: ( subtextRule )+ AT ( subtextRule )+ DOTCOM
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:48: ( subtextRule )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==CL||LA19_0==CM||LA19_0==DO||LA19_0==INTEGER||LA19_0==SE||LA19_0==STRING) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:48: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule768);
							subtextRule();
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

					match(input,AT,FOLLOW_AT_in_quickLinkRule771); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:64: ( subtextRule )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==CL||LA20_0==CM||LA20_0==DO||LA20_0==INTEGER||LA20_0==SE||LA20_0==STRING) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:64: subtextRule
							{
							pushFollow(FOLLOW_subtextRule_in_quickLinkRule773);
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

					match(input,DOTCOM,FOLLOW_DOTCOM_in_quickLinkRule776); 
					}

					}
					break;

			}

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule780); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:187:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule798); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:9: ( talignmentRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LSB) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule800);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule803); 
			pushFollow(FOLLOW_trowRule_in_tableRule805);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:37: ( CM trowRule )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==CM) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:188:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule808); 
					pushFollow(FOLLOW_trowRule_in_tableRule810);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule814); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:193:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule830); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule832);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:17: ( CM alignRule )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CM) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:194:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule835); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule837);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule841); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:1: trowRule : LSB STRING ( CM STRING )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:203:2: ( LSB STRING ( CM STRING )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:3: LSB STRING ( CM STRING )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule873); 
			match(input,STRING,FOLLOW_STRING_in_trowRule875); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:14: ( CM STRING )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:15: CM STRING
					{
					match(input,CM,FOLLOW_CM_in_trowRule878); 
					match(input,STRING,FOLLOW_STRING_in_trowRule880); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule884); 
			}

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



	public static final BitSet FOLLOW_titleRule_in_parseJava48 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_textDeclRule_in_parseJava52 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_blockquoteRule_in_parseJava56 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_olistRule_in_parseJava60 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_ulistRule_in_parseJava64 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_tlistRule_in_parseJava68 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_blockCodeRule_in_parseJava72 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_horizontalRule_in_parseJava76 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_tableRule_in_parseJava80 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_imageRule_in_parseJava84 = new BitSet(new long[]{0xF03E040008100062L,0x0000000000000001L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_titleRule105 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_titleRule107 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_titleRule109 = new BitSet(new long[]{0x0240001040010A02L});
	public static final BitSet FOLLOW_refRule_in_titleRule112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule161 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HA_in_refRule163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_refRule165 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule186 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule188 = new BitSet(new long[]{0x0F400109C4011A80L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule207 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule213 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule219 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule225 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule231 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule237 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule243 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule249 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule255 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_linkRule_in_textRule261 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_quickLinkRule_in_textRule267 = new BitSet(new long[]{0x0F400109C4011A82L});
	public static final BitSet FOLLOW_IT_in_italicTextRule282 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule285 = new BitSet(new long[]{0x02400000C0010A00L});
	public static final BitSet FOLLOW_IT_in_italicTextRule288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule305 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule307 = new BitSet(new long[]{0x0240000040010A80L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule326 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule328 = new BitSet(new long[]{0x0240000140010A00L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule347 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule349 = new BitSet(new long[]{0x0340000040010A00L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule368 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule370 = new BitSet(new long[]{0x0240000044010A00L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule389 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule391 = new BitSet(new long[]{0x0640000040010A00L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule410 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule412 = new BitSet(new long[]{0x0A40000040010A00L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule431 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule433 = new BitSet(new long[]{0x0240000040011A00L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_subtextRule453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule495 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule497 = new BitSet(new long[]{0x0F400109C4011A80L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule516 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_textListRule_in_olistRule518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_textListRule532 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule534 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CM_in_textListRule537 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_textListRule539 = new BitSet(new long[]{0x0000800000000800L});
	public static final BitSet FOLLOW_RP_in_textListRule543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule556 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule575 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule594 = new BitSet(new long[]{0x0F40010BC4015E80L});
	public static final BitSet FOLLOW_languageRule_in_blockCodeRule596 = new BitSet(new long[]{0x0F400109C4011A80L});
	public static final BitSet FOLLOW_textRule_in_blockCodeRule599 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule653 = new BitSet(new long[]{0x0F400109C4111A80L});
	public static final BitSet FOLLOW_textRule_in_linkRule656 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule660 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule663 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_linkRule665 = new BitSet(new long[]{0x02C0000040010A10L});
	public static final BitSet FOLLOW_textLinkRule_in_linkRule667 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textLinkRule686 = new BitSet(new long[]{0x02C0000040010A12L});
	public static final BitSet FOLLOW_SL_in_textLinkRule690 = new BitSet(new long[]{0x02C0000040010A12L});
	public static final BitSet FOLLOW_AT_in_textLinkRule694 = new BitSet(new long[]{0x02C0000040010A12L});
	public static final BitSet FOLLOW_EX_in_imageRule713 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LSB_in_imageRule715 = new BitSet(new long[]{0x02C0000040010A10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule717 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RSB_in_imageRule719 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_imageRule721 = new BitSet(new long[]{0x02C0000040010A10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule723 = new BitSet(new long[]{0x0200800000000000L});
	public static final BitSet FOLLOW_STRING_in_imageRule726 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule747 = new BitSet(new long[]{0x0240000070010A00L});
	public static final BitSet FOLLOW_set_in_quickLinkRule751 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule759 = new BitSet(new long[]{0x0240000040030A00L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule762 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule768 = new BitSet(new long[]{0x0240000040010A10L});
	public static final BitSet FOLLOW_AT_in_quickLinkRule771 = new BitSet(new long[]{0x0240000040010A00L});
	public static final BitSet FOLLOW_subtextRule_in_quickLinkRule773 = new BitSet(new long[]{0x0240000040030A00L});
	public static final BitSet FOLLOW_DOTCOM_in_quickLinkRule776 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule798 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule800 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LP_in_tableRule803 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule805 = new BitSet(new long[]{0x0000800000000800L});
	public static final BitSet FOLLOW_CM_in_tableRule808 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule810 = new BitSet(new long[]{0x0000800000000800L});
	public static final BitSet FOLLOW_RP_in_tableRule814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule830 = new BitSet(new long[]{0x0000100400000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule832 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_CM_in_talignmentRule835 = new BitSet(new long[]{0x0000100400000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule837 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule873 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule875 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_CM_in_trowRule878 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_trowRule880 = new BitSet(new long[]{0x0001000000000800L});
	public static final BitSet FOLLOW_RSB_in_trowRule884 = new BitSet(new long[]{0x0000000000000002L});
}
