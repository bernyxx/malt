// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-06-05 10:34:31

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "BLOCKCODE", "BLOCKQUOTE", 
		"BOLD", "C", "CHAR", "CL", "CM", "CODE", "COMMENT", "DIGIT", "DO", "EQ", 
		"ESC_SEQ", "EX", "EXPONENT", "FLOAT", "GET", "HA", "HEX_DIGIT", "HL", 
		"HRULE", "ID", "INTEGER", "IT", "ITBOLD", "L", "LAB", "LCB", "LET", "LETTER", 
		"LP", "LSB", "OCTAL_ESC", "OLIST", "QU", "R", "RAB", "RCB", "RP", "RSB", 
		"S1TITLE", "S2TITLE", "S3TITLE", "S4TITLE", "S5TITLE", "SE", "SL", "ST", 
		"STRING", "SUBS", "SUPS", "TABLE", "TEXT", "TITLE", "TLIST", "ULIST", 
		"UNICODE_ESC", "VAR", "WS", "'C'", "'C++'", "'Java'"
	};
	public static final int EOF=-1;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int AT=4;
	public static final int BLOCKCODE=5;
	public static final int BLOCKQUOTE=6;
	public static final int BOLD=7;
	public static final int C=8;
	public static final int CHAR=9;
	public static final int CL=10;
	public static final int CM=11;
	public static final int CODE=12;
	public static final int COMMENT=13;
	public static final int DIGIT=14;
	public static final int DO=15;
	public static final int EQ=16;
	public static final int ESC_SEQ=17;
	public static final int EX=18;
	public static final int EXPONENT=19;
	public static final int FLOAT=20;
	public static final int GET=21;
	public static final int HA=22;
	public static final int HEX_DIGIT=23;
	public static final int HL=24;
	public static final int HRULE=25;
	public static final int ID=26;
	public static final int INTEGER=27;
	public static final int IT=28;
	public static final int ITBOLD=29;
	public static final int L=30;
	public static final int LAB=31;
	public static final int LCB=32;
	public static final int LET=33;
	public static final int LETTER=34;
	public static final int LP=35;
	public static final int LSB=36;
	public static final int OCTAL_ESC=37;
	public static final int OLIST=38;
	public static final int QU=39;
	public static final int R=40;
	public static final int RAB=41;
	public static final int RCB=42;
	public static final int RP=43;
	public static final int RSB=44;
	public static final int S1TITLE=45;
	public static final int S2TITLE=46;
	public static final int S3TITLE=47;
	public static final int S4TITLE=48;
	public static final int S5TITLE=49;
	public static final int SE=50;
	public static final int SL=51;
	public static final int ST=52;
	public static final int STRING=53;
	public static final int SUBS=54;
	public static final int SUPS=55;
	public static final int TABLE=56;
	public static final int TEXT=57;
	public static final int TITLE=58;
	public static final int TLIST=59;
	public static final int ULIST=60;
	public static final int UNICODE_ESC=61;
	public static final int VAR=62;
	public static final int WS=63;

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:19:1: parseJava : titleRule ( titleRule | textDeclRule )* ;
	public final void parseJava() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:20:2: ( titleRule ( titleRule | textDeclRule )* )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:21:3: titleRule ( titleRule | textDeclRule )*
			{
			pushFollow(FOLLOW_titleRule_in_parseJava48);
			titleRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:3: ( titleRule | textDeclRule )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= S1TITLE && LA1_0 <= S5TITLE)||LA1_0==TITLE) ) {
					alt1=1;
				}
				else if ( (LA1_0==TEXT) ) {
					alt1=2;
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
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:22:14: textDeclRule
					{
					pushFollow(FOLLOW_textDeclRule_in_parseJava55);
					textDeclRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:26:1: titleRule : titleTypeRule VAR EQ STRING ( refRule )? ;
	public final void titleRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:27:2: ( titleTypeRule VAR EQ STRING ( refRule )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:3: titleTypeRule VAR EQ STRING ( refRule )?
			{
			pushFollow(FOLLOW_titleTypeRule_in_titleRule74);
			titleTypeRule();
			state._fsp--;

			match(input,VAR,FOLLOW_VAR_in_titleRule76); 
			match(input,EQ,FOLLOW_EQ_in_titleRule78); 
			match(input,STRING,FOLLOW_STRING_in_titleRule80); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:31: ( refRule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==LCB) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:28:31: refRule
					{
					pushFollow(FOLLOW_refRule_in_titleRule82);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:32:1: titleTypeRule : ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE );
	public final void titleTypeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:33:2: ( TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:37:1: refRule : LCB HA ID RCB ;
	public final void refRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:38:2: ( LCB HA ID RCB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:39:3: LCB HA ID RCB
			{
			match(input,LCB,FOLLOW_LCB_in_refRule131); 
			match(input,HA,FOLLOW_HA_in_refRule133); 
			match(input,ID,FOLLOW_ID_in_refRule135); 
			match(input,RCB,FOLLOW_RCB_in_refRule137); 
			}

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
			match(input,TEXT,FOLLOW_TEXT_in_textDeclRule150); 
			match(input,VAR,FOLLOW_VAR_in_textDeclRule152); 
			match(input,EQ,FOLLOW_EQ_in_textDeclRule154); 
			pushFollow(FOLLOW_textRule_in_textDeclRule156);
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:48:1: textRule : ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+ ;
	public final void textRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:49:2: ( ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:3: ( subtextRule | italicTextRule | boldTextRule | ibTextRule | strikethroughtTextRule | highlightTextRule | subscriptTextRule | superscriptTextRule | codeTextRule )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=10;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case VAR:
					{
					alt3=1;
					}
					break;
				case IT:
					{
					alt3=2;
					}
					break;
				case BOLD:
					{
					alt3=3;
					}
					break;
				case ITBOLD:
					{
					alt3=4;
					}
					break;
				case ST:
					{
					alt3=5;
					}
					break;
				case HL:
					{
					alt3=6;
					}
					break;
				case SUBS:
					{
					alt3=7;
					}
					break;
				case SUPS:
					{
					alt3=8;
					}
					break;
				case CODE:
					{
					alt3=9;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:50:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textRule173);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:51:5: italicTextRule
					{
					pushFollow(FOLLOW_italicTextRule_in_textRule179);
					italicTextRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:52:5: boldTextRule
					{
					pushFollow(FOLLOW_boldTextRule_in_textRule185);
					boldTextRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:53:5: ibTextRule
					{
					pushFollow(FOLLOW_ibTextRule_in_textRule191);
					ibTextRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:54:5: strikethroughtTextRule
					{
					pushFollow(FOLLOW_strikethroughtTextRule_in_textRule197);
					strikethroughtTextRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:55:5: highlightTextRule
					{
					pushFollow(FOLLOW_highlightTextRule_in_textRule203);
					highlightTextRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:56:5: subscriptTextRule
					{
					pushFollow(FOLLOW_subscriptTextRule_in_textRule209);
					subscriptTextRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:57:5: superscriptTextRule
					{
					pushFollow(FOLLOW_superscriptTextRule_in_textRule215);
					superscriptTextRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:58:5: codeTextRule
					{
					pushFollow(FOLLOW_codeTextRule_in_textRule221);
					codeTextRule();
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

			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:61:1: italicTextRule : IT subtextRule IT ;
	public final void italicTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:62:2: ( IT subtextRule IT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:63:3: IT subtextRule IT
			{
			match(input,IT,FOLLOW_IT_in_italicTextRule237); 
			pushFollow(FOLLOW_subtextRule_in_italicTextRule240);
			subtextRule();
			state._fsp--;

			match(input,IT,FOLLOW_IT_in_italicTextRule242); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:67:1: boldTextRule : BOLD subtextRule BOLD ;
	public final void boldTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:68:2: ( BOLD subtextRule BOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:69:3: BOLD subtextRule BOLD
			{
			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule259); 
			pushFollow(FOLLOW_subtextRule_in_boldTextRule261);
			subtextRule();
			state._fsp--;

			match(input,BOLD,FOLLOW_BOLD_in_boldTextRule263); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:73:1: ibTextRule : ITBOLD subtextRule ITBOLD ;
	public final void ibTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:74:2: ( ITBOLD subtextRule ITBOLD )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:75:3: ITBOLD subtextRule ITBOLD
			{
			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule279); 
			pushFollow(FOLLOW_subtextRule_in_ibTextRule281);
			subtextRule();
			state._fsp--;

			match(input,ITBOLD,FOLLOW_ITBOLD_in_ibTextRule283); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:79:1: strikethroughtTextRule : ST subtextRule ST ;
	public final void strikethroughtTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:80:2: ( ST subtextRule ST )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:81:3: ST subtextRule ST
			{
			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule299); 
			pushFollow(FOLLOW_subtextRule_in_strikethroughtTextRule301);
			subtextRule();
			state._fsp--;

			match(input,ST,FOLLOW_ST_in_strikethroughtTextRule303); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:85:1: highlightTextRule : HL subtextRule HL ;
	public final void highlightTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:86:2: ( HL subtextRule HL )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:87:3: HL subtextRule HL
			{
			match(input,HL,FOLLOW_HL_in_highlightTextRule319); 
			pushFollow(FOLLOW_subtextRule_in_highlightTextRule321);
			subtextRule();
			state._fsp--;

			match(input,HL,FOLLOW_HL_in_highlightTextRule323); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:91:1: subscriptTextRule : SUBS subtextRule SUBS ;
	public final void subscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:92:2: ( SUBS subtextRule SUBS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:93:3: SUBS subtextRule SUBS
			{
			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule339); 
			pushFollow(FOLLOW_subtextRule_in_subscriptTextRule341);
			subtextRule();
			state._fsp--;

			match(input,SUBS,FOLLOW_SUBS_in_subscriptTextRule343); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:97:1: superscriptTextRule : SUPS subtextRule SUPS ;
	public final void superscriptTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:98:2: ( SUPS subtextRule SUPS )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:99:3: SUPS subtextRule SUPS
			{
			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule359); 
			pushFollow(FOLLOW_subtextRule_in_superscriptTextRule361);
			subtextRule();
			state._fsp--;

			match(input,SUPS,FOLLOW_SUPS_in_superscriptTextRule363); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:103:1: codeTextRule : CODE subtextRule CODE ;
	public final void codeTextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:104:2: ( CODE subtextRule CODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:105:3: CODE subtextRule CODE
			{
			match(input,CODE,FOLLOW_CODE_in_codeTextRule379); 
			pushFollow(FOLLOW_subtextRule_in_codeTextRule381);
			subtextRule();
			state._fsp--;

			match(input,CODE,FOLLOW_CODE_in_codeTextRule383); 
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:109:1: subtextRule : ( VAR | INTEGER | DO | CM | SE | CL )+ ;
	public final void subtextRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:110:2: ( ( VAR | INTEGER | DO | CM | SE | CL )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:111:3: ( VAR | INTEGER | DO | CM | SE | CL )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:111:3: ( VAR | INTEGER | DO | CM | SE | CL )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CM) ) {
					alt4=1;
				}
				else if ( (LA4_0==CL||LA4_0==DO||LA4_0==INTEGER||LA4_0==SE||LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= CL && input.LA(1) <= CM)||input.LA(1)==DO||input.LA(1)==INTEGER||input.LA(1)==SE||input.LA(1)==VAR ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:115:1: blockquoteRule : BLOCKQUOTE VAR EQ textRule ;
	public final void blockquoteRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:116:2: ( BLOCKQUOTE VAR EQ textRule )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:117:3: BLOCKQUOTE VAR EQ textRule
			{
			match(input,BLOCKQUOTE,FOLLOW_BLOCKQUOTE_in_blockquoteRule441); 
			match(input,VAR,FOLLOW_VAR_in_blockquoteRule443); 
			match(input,EQ,FOLLOW_EQ_in_blockquoteRule445); 
			pushFollow(FOLLOW_textRule_in_blockquoteRule447);
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
	// $ANTLR end "blockquoteRule"



	// $ANTLR start "olistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:120:1: olistRule : OLIST LP textListRule RP ;
	public final void olistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:121:2: ( OLIST LP textListRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:122:3: OLIST LP textListRule RP
			{
			match(input,OLIST,FOLLOW_OLIST_in_olistRule460); 
			match(input,LP,FOLLOW_LP_in_olistRule462); 
			pushFollow(FOLLOW_textListRule_in_olistRule464);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_olistRule466); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:125:1: textListRule : textRule ( CM textRule )+ ;
	public final void textListRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:2: ( textRule ( CM textRule )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:4: textRule ( CM textRule )+
			{
			pushFollow(FOLLOW_textRule_in_textListRule476);
			textRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:13: ( CM textRule )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:126:14: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_textListRule479); 
					pushFollow(FOLLOW_textRule_in_textListRule481);
					textRule();
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
	// $ANTLR end "textListRule"



	// $ANTLR start "ulistRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:129:1: ulistRule : ULIST LP textListRule RP ;
	public final void ulistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:130:2: ( ULIST LP textListRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:131:3: ULIST LP textListRule RP
			{
			match(input,ULIST,FOLLOW_ULIST_in_ulistRule496); 
			match(input,LP,FOLLOW_LP_in_ulistRule498); 
			pushFollow(FOLLOW_textListRule_in_ulistRule500);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ulistRule502); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:134:1: tlistRule : TLIST LP textListRule RP ;
	public final void tlistRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:135:2: ( TLIST LP textListRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:136:3: TLIST LP textListRule RP
			{
			match(input,TLIST,FOLLOW_TLIST_in_tlistRule515); 
			match(input,LP,FOLLOW_LP_in_tlistRule517); 
			pushFollow(FOLLOW_textListRule_in_tlistRule519);
			textListRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_tlistRule521); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:139:1: blockCodeRule : BLOCKCODE ( languageRule )? textRule BLOCKCODE ;
	public final void blockCodeRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:140:2: ( BLOCKCODE ( languageRule )? textRule BLOCKCODE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:3: BLOCKCODE ( languageRule )? textRule BLOCKCODE
			{
			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule534); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:13: ( languageRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= 64 && LA6_0 <= 66)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:141:13: languageRule
					{
					pushFollow(FOLLOW_languageRule_in_blockCodeRule536);
					languageRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_textRule_in_blockCodeRule539);
			textRule();
			state._fsp--;

			match(input,BLOCKCODE,FOLLOW_BLOCKCODE_in_blockCodeRule541); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:144:1: languageRule : ( 'Java' | 'C' | 'C++' );
	public final void languageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:145:2: ( 'Java' | 'C' | 'C++' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= 64 && input.LA(1) <= 66) ) {
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:149:1: horizontalRule : HRULE ;
	public final void horizontalRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:150:2: ( HRULE )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:151:3: HRULE
			{
			match(input,HRULE,FOLLOW_HRULE_in_horizontalRule573); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:154:1: linkRule : LSB ( textRule | imageRule ) RSB LP textLinkRule RP ;
	public final void linkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:155:2: ( LSB ( textRule | imageRule ) RSB LP textLinkRule RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:3: LSB ( textRule | imageRule ) RSB LP textLinkRule RP
			{
			match(input,LSB,FOLLOW_LSB_in_linkRule585); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:7: ( textRule | imageRule )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==BOLD||(LA7_0 >= CL && LA7_0 <= CODE)||LA7_0==DO||LA7_0==HL||(LA7_0 >= INTEGER && LA7_0 <= ITBOLD)||LA7_0==SE||LA7_0==ST||(LA7_0 >= SUBS && LA7_0 <= SUPS)||LA7_0==VAR) ) {
				alt7=1;
			}
			else if ( (LA7_0==EX) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:8: textRule
					{
					pushFollow(FOLLOW_textRule_in_linkRule588);
					textRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:156:19: imageRule
					{
					pushFollow(FOLLOW_imageRule_in_linkRule592);
					imageRule();
					state._fsp--;

					}
					break;

			}

			match(input,RSB,FOLLOW_RSB_in_linkRule595); 
			match(input,LP,FOLLOW_LP_in_linkRule597); 
			pushFollow(FOLLOW_textLinkRule_in_linkRule599);
			textLinkRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_linkRule601); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:159:1: textLinkRule : ( subtextRule | SL | AT )+ ;
	public final void textLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:160:2: ( ( subtextRule | SL | AT )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:3: ( subtextRule | SL | AT )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:3: ( subtextRule | SL | AT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=4;
				switch ( input.LA(1) ) {
				case CL:
				case CM:
				case DO:
				case INTEGER:
				case SE:
				case VAR:
					{
					alt8=1;
					}
					break;
				case SL:
					{
					alt8=2;
					}
					break;
				case AT:
					{
					alt8=3;
					}
					break;
				}
				switch (alt8) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:4: subtextRule
					{
					pushFollow(FOLLOW_subtextRule_in_textLinkRule614);
					subtextRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:18: SL
					{
					match(input,SL,FOLLOW_SL_in_textLinkRule618); 
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:161:23: AT
					{
					match(input,AT,FOLLOW_AT_in_textLinkRule622); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
	// $ANTLR end "textLinkRule"



	// $ANTLR start "imageRule"
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:164:1: imageRule : EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP ;
	public final void imageRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:165:2: ( EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:3: EX LSB textLinkRule RSB LP textLinkRule ( QU textRule QU )? RP
			{
			match(input,EX,FOLLOW_EX_in_imageRule636); 
			match(input,LSB,FOLLOW_LSB_in_imageRule638); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule640);
			textLinkRule();
			state._fsp--;

			match(input,RSB,FOLLOW_RSB_in_imageRule642); 
			match(input,LP,FOLLOW_LP_in_imageRule644); 
			pushFollow(FOLLOW_textLinkRule_in_imageRule646);
			textLinkRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:43: ( QU textRule QU )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==QU) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:166:44: QU textRule QU
					{
					match(input,QU,FOLLOW_QU_in_imageRule649); 
					pushFollow(FOLLOW_textRule_in_imageRule651);
					textRule();
					state._fsp--;

					match(input,QU,FOLLOW_QU_in_imageRule653); 
					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_imageRule657); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:169:1: quickLinkRule : LAB textLinkRule RAB ;
	public final void quickLinkRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:170:2: ( LAB textLinkRule RAB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:171:3: LAB textLinkRule RAB
			{
			match(input,LAB,FOLLOW_LAB_in_quickLinkRule669); 
			pushFollow(FOLLOW_textLinkRule_in_quickLinkRule671);
			textLinkRule();
			state._fsp--;

			match(input,RAB,FOLLOW_RAB_in_quickLinkRule673); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:175:1: tableRule : TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP ;
	public final void tableRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:176:2: ( TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:3: TABLE ( talignmentRule )? LP trowRule ( CM trowRule )* RP
			{
			match(input,TABLE,FOLLOW_TABLE_in_tableRule687); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:9: ( talignmentRule )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LSB) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:9: talignmentRule
					{
					pushFollow(FOLLOW_talignmentRule_in_tableRule689);
					talignmentRule();
					state._fsp--;

					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_tableRule692); 
			pushFollow(FOLLOW_trowRule_in_tableRule694);
			trowRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:37: ( CM trowRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CM) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:177:38: CM trowRule
					{
					match(input,CM,FOLLOW_CM_in_tableRule697); 
					pushFollow(FOLLOW_trowRule_in_tableRule699);
					trowRule();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RP,FOLLOW_RP_in_tableRule703); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:180:1: talignmentRule : LSB alignRule ( CM alignRule )* RSB ;
	public final void talignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:181:2: ( LSB alignRule ( CM alignRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:3: LSB alignRule ( CM alignRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_talignmentRule715); 
			pushFollow(FOLLOW_alignRule_in_talignmentRule717);
			alignRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:17: ( CM alignRule )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:182:18: CM alignRule
					{
					match(input,CM,FOLLOW_CM_in_talignmentRule720); 
					pushFollow(FOLLOW_alignRule_in_talignmentRule722);
					alignRule();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_talignmentRule726); 
			}

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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:185:1: alignRule : ( L | C | R );
	public final void alignRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:2: ( L | C | R )
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
	// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:1: trowRule : LSB textRule ( CM textRule )* RSB ;
	public final void trowRule() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:2: ( LSB textRule ( CM textRule )* RSB )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:3: LSB textRule ( CM textRule )* RSB
			{
			match(input,LSB,FOLLOW_LSB_in_trowRule758); 
			pushFollow(FOLLOW_textRule_in_trowRule760);
			textRule();
			state._fsp--;

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:16: ( CM textRule )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:17: CM textRule
					{
					match(input,CM,FOLLOW_CM_in_trowRule763); 
					pushFollow(FOLLOW_textRule_in_trowRule765);
					textRule();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,RSB,FOLLOW_RSB_in_trowRule769); 
			}

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



	public static final BitSet FOLLOW_titleRule_in_parseJava48 = new BitSet(new long[]{0x0603E00000000002L});
	public static final BitSet FOLLOW_titleRule_in_parseJava53 = new BitSet(new long[]{0x0603E00000000002L});
	public static final BitSet FOLLOW_textDeclRule_in_parseJava55 = new BitSet(new long[]{0x0603E00000000002L});
	public static final BitSet FOLLOW_titleTypeRule_in_titleRule74 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_VAR_in_titleRule76 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_titleRule78 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_STRING_in_titleRule80 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_refRule_in_titleRule82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCB_in_refRule131 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_HA_in_refRule133 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_refRule135 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCB_in_refRule137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_in_textDeclRule150 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_VAR_in_textDeclRule152 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_textDeclRule154 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_textDeclRule156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textRule173 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_italicTextRule_in_textRule179 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_boldTextRule_in_textRule185 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_ibTextRule_in_textRule191 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_strikethroughtTextRule_in_textRule197 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_highlightTextRule_in_textRule203 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_subscriptTextRule_in_textRule209 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_superscriptTextRule_in_textRule215 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_codeTextRule_in_textRule221 = new BitSet(new long[]{0x40D4000039009C82L});
	public static final BitSet FOLLOW_IT_in_italicTextRule237 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_italicTextRule240 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IT_in_italicTextRule242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule259 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_boldTextRule261 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOLD_in_boldTextRule263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule279 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_ibTextRule281 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ITBOLD_in_ibTextRule283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule299 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_strikethroughtTextRule301 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_ST_in_strikethroughtTextRule303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule319 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_highlightTextRule321 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_HL_in_highlightTextRule323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule339 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_subscriptTextRule341 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SUBS_in_subscriptTextRule343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule359 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_superscriptTextRule361 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SUPS_in_superscriptTextRule363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule379 = new BitSet(new long[]{0x4004000008008C00L});
	public static final BitSet FOLLOW_subtextRule_in_codeTextRule381 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CODE_in_codeTextRule383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKQUOTE_in_blockquoteRule441 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_VAR_in_blockquoteRule443 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQ_in_blockquoteRule445 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_blockquoteRule447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLIST_in_olistRule460 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_olistRule462 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textListRule_in_olistRule464 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_olistRule466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_textRule_in_textListRule476 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CM_in_textListRule479 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_textListRule481 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ULIST_in_ulistRule496 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_ulistRule498 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textListRule_in_ulistRule500 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_ulistRule502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TLIST_in_tlistRule515 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tlistRule517 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textListRule_in_tlistRule519 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_tlistRule521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule534 = new BitSet(new long[]{0x40D4000039009C80L,0x0000000000000007L});
	public static final BitSet FOLLOW_languageRule_in_blockCodeRule536 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_blockCodeRule539 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BLOCKCODE_in_blockCodeRule541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HRULE_in_horizontalRule573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_linkRule585 = new BitSet(new long[]{0x40D4000039049C80L});
	public static final BitSet FOLLOW_textRule_in_linkRule588 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_imageRule_in_linkRule592 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RSB_in_linkRule595 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_linkRule597 = new BitSet(new long[]{0x400C000008008C10L});
	public static final BitSet FOLLOW_textLinkRule_in_linkRule599 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_linkRule601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtextRule_in_textLinkRule614 = new BitSet(new long[]{0x400C000008008C12L});
	public static final BitSet FOLLOW_SL_in_textLinkRule618 = new BitSet(new long[]{0x400C000008008C12L});
	public static final BitSet FOLLOW_AT_in_textLinkRule622 = new BitSet(new long[]{0x400C000008008C12L});
	public static final BitSet FOLLOW_EX_in_imageRule636 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LSB_in_imageRule638 = new BitSet(new long[]{0x400C000008008C10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule640 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RSB_in_imageRule642 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_imageRule644 = new BitSet(new long[]{0x400C000008008C10L});
	public static final BitSet FOLLOW_textLinkRule_in_imageRule646 = new BitSet(new long[]{0x0000088000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule649 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_imageRule651 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QU_in_imageRule653 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RP_in_imageRule657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAB_in_quickLinkRule669 = new BitSet(new long[]{0x400C000008008C10L});
	public static final BitSet FOLLOW_textLinkRule_in_quickLinkRule671 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RAB_in_quickLinkRule673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLE_in_tableRule687 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_talignmentRule_in_tableRule689 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LP_in_tableRule692 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule694 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_CM_in_tableRule697 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_trowRule_in_tableRule699 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RP_in_tableRule703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_talignmentRule715 = new BitSet(new long[]{0x0000010040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule717 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_CM_in_talignmentRule720 = new BitSet(new long[]{0x0000010040000100L});
	public static final BitSet FOLLOW_alignRule_in_talignmentRule722 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RSB_in_talignmentRule726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSB_in_trowRule758 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_trowRule760 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_CM_in_trowRule763 = new BitSet(new long[]{0x40D4000039009C80L});
	public static final BitSet FOLLOW_textRule_in_trowRule765 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_RSB_in_trowRule769 = new BitSet(new long[]{0x0000000000000002L});
}
