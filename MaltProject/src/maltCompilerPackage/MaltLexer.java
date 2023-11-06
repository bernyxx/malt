// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g 2023-11-06 18:00:56

	package maltCompilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__78=78;
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
	public static final int ERROR_TK=19;
	public static final int ESC_SEQ=20;
	public static final int EX=21;
	public static final int EXPONENT=22;
	public static final int FLOAT=23;
	public static final int FOR=24;
	public static final int FORMAT=25;
	public static final int FORMATTEXT=26;
	public static final int FUN=27;
	public static final int G=28;
	public static final int GET=29;
	public static final int HA=30;
	public static final int HEX_DIGIT=31;
	public static final int HL=32;
	public static final int HRULE=33;
	public static final int I=34;
	public static final int IMG=35;
	public static final int IN=36;
	public static final int INTEGER=37;
	public static final int IT=38;
	public static final int ITBOLD=39;
	public static final int L=40;
	public static final int LAB=41;
	public static final int LCB=42;
	public static final int LET=43;
	public static final int LETTER=44;
	public static final int LINK=45;
	public static final int LIST=46;
	public static final int LP=47;
	public static final int LSB=48;
	public static final int OCTAL_ESC=49;
	public static final int OLIST=50;
	public static final int PLUS=51;
	public static final int R=52;
	public static final int RAB=53;
	public static final int RCB=54;
	public static final int RETURN=55;
	public static final int RP=56;
	public static final int RSB=57;
	public static final int S1TITLE=58;
	public static final int S2TITLE=59;
	public static final int S3TITLE=60;
	public static final int S4TITLE=61;
	public static final int S5TITLE=62;
	public static final int SE=63;
	public static final int SL=64;
	public static final int ST=65;
	public static final int STRING=66;
	public static final int SUBS=67;
	public static final int SUPS=68;
	public static final int TABLE=69;
	public static final int TEXT=70;
	public static final int TITLE=71;
	public static final int TLIST=72;
	public static final int ULIST=73;
	public static final int UNICODE_ESC=74;
	public static final int US=75;
	public static final int VAR=76;
	public static final int WS=77;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MaltLexer() {} 
	public MaltLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MaltLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g"; }

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:11:7: ( '\"' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:11:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:313:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:313:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:313:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:313:33: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:316:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:320:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '%' | '\\\"' | '\\'' | '\\\\' | '*' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '%':
				case '\'':
				case '*':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt3=1;
					}
					break;
				case 'u':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:320:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '%' | '\\\"' | '\\'' | '\\\\' | '*' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='%'||input.LA(1)=='\''||input.LA(1)=='*'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:321:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:322:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:327:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=1;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=3;
					}

				}
				else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
					int LA4_3 = input.LA(3);
					if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
						alt4=2;
					}

					else {
						alt4=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:327:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:328:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:329:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:334:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:334:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:338:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:341:7: ( '0' .. '9' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:343:4: ( '.' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:343:6: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:344:4: ( ',' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:344:5: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "SE"
	public final void mSE() throws RecognitionException {
		try {
			int _type = SE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:345:4: ( ';' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:345:6: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SE"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:346:4: ( ':' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:346:5: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:347:4: ( '(' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:347:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:348:4: ( ')' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:348:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "LSB"
	public final void mLSB() throws RecognitionException {
		try {
			int _type = LSB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:349:5: ( '[' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:349:7: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSB"

	// $ANTLR start "RSB"
	public final void mRSB() throws RecognitionException {
		try {
			int _type = RSB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:350:5: ( ']' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:350:7: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSB"

	// $ANTLR start "LCB"
	public final void mLCB() throws RecognitionException {
		try {
			int _type = LCB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:351:5: ( '{' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:351:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCB"

	// $ANTLR start "RCB"
	public final void mRCB() throws RecognitionException {
		try {
			int _type = RCB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:352:5: ( '}' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:352:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCB"

	// $ANTLR start "LAB"
	public final void mLAB() throws RecognitionException {
		try {
			int _type = LAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:353:5: ( '<' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:353:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAB"

	// $ANTLR start "RAB"
	public final void mRAB() throws RecognitionException {
		try {
			int _type = RAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:354:5: ( '>' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:354:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RAB"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:355:6: ( '+' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:355:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "HA"
	public final void mHA() throws RecognitionException {
		try {
			int _type = HA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:356:4: ( '#' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:356:6: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HA"

	// $ANTLR start "IT"
	public final void mIT() throws RecognitionException {
		try {
			int _type = IT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:357:5: ( '*' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:357:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IT"

	// $ANTLR start "BOLD"
	public final void mBOLD() throws RecognitionException {
		try {
			int _type = BOLD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:358:7: ( '**' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:358:9: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOLD"

	// $ANTLR start "ITBOLD"
	public final void mITBOLD() throws RecognitionException {
		try {
			int _type = ITBOLD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:359:9: ( '***' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:359:11: '***'
			{
			match("***"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ITBOLD"

	// $ANTLR start "ST"
	public final void mST() throws RecognitionException {
		try {
			int _type = ST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:360:5: ( '~~' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:360:7: '~~'
			{
			match("~~"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ST"

	// $ANTLR start "HL"
	public final void mHL() throws RecognitionException {
		try {
			int _type = HL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:361:5: ( '==' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:361:7: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HL"

	// $ANTLR start "SUBS"
	public final void mSUBS() throws RecognitionException {
		try {
			int _type = SUBS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:362:7: ( '~' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:362:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBS"

	// $ANTLR start "SUPS"
	public final void mSUPS() throws RecognitionException {
		try {
			int _type = SUPS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:363:7: ( '^' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:363:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPS"

	// $ANTLR start "CODE"
	public final void mCODE() throws RecognitionException {
		try {
			int _type = CODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:364:7: ( '\\'' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:364:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CODE"

	// $ANTLR start "HRULE"
	public final void mHRULE() throws RecognitionException {
		try {
			int _type = HRULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:365:8: ( '___' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:365:10: '___'
			{
			match("___"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HRULE"

	// $ANTLR start "US"
	public final void mUS() throws RecognitionException {
		try {
			int _type = US;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:366:4: ( '_' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:366:6: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "US"

	// $ANTLR start "SL"
	public final void mSL() throws RecognitionException {
		try {
			int _type = SL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:367:4: ( '/' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:367:6: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL"

	// $ANTLR start "EX"
	public final void mEX() throws RecognitionException {
		try {
			int _type = EX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:368:4: ( '!' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:368:6: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EX"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:369:4: ( '=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:369:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:370:5: ( '>=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:370:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:371:5: ( '<=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:371:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "TITLE"
	public final void mTITLE() throws RecognitionException {
		try {
			int _type = TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:373:7: ( 'title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:373:9: 'title'
			{
			match("title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITLE"

	// $ANTLR start "S1TITLE"
	public final void mS1TITLE() throws RecognitionException {
		try {
			int _type = S1TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:374:9: ( 's1title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:374:11: 's1title'
			{
			match("s1title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S1TITLE"

	// $ANTLR start "S2TITLE"
	public final void mS2TITLE() throws RecognitionException {
		try {
			int _type = S2TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:375:9: ( 's2title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:375:11: 's2title'
			{
			match("s2title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S2TITLE"

	// $ANTLR start "S3TITLE"
	public final void mS3TITLE() throws RecognitionException {
		try {
			int _type = S3TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:376:9: ( 's3title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:376:11: 's3title'
			{
			match("s3title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S3TITLE"

	// $ANTLR start "S4TITLE"
	public final void mS4TITLE() throws RecognitionException {
		try {
			int _type = S4TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:377:9: ( 's4title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:377:11: 's4title'
			{
			match("s4title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S4TITLE"

	// $ANTLR start "S5TITLE"
	public final void mS5TITLE() throws RecognitionException {
		try {
			int _type = S5TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:378:9: ( 's5title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:378:11: 's5title'
			{
			match("s5title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S5TITLE"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:379:6: ( 'text' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:379:8: 'text'
			{
			match("text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "BLOCKQUOTE"
	public final void mBLOCKQUOTE() throws RecognitionException {
		try {
			int _type = BLOCKQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:380:12: ( 'blockquote' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:380:14: 'blockquote'
			{
			match("blockquote"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOCKQUOTE"

	// $ANTLR start "OLIST"
	public final void mOLIST() throws RecognitionException {
		try {
			int _type = OLIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:381:7: ( 'olist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:381:9: 'olist'
			{
			match("olist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OLIST"

	// $ANTLR start "ULIST"
	public final void mULIST() throws RecognitionException {
		try {
			int _type = ULIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:382:7: ( 'ulist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:382:9: 'ulist'
			{
			match("ulist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ULIST"

	// $ANTLR start "TLIST"
	public final void mTLIST() throws RecognitionException {
		try {
			int _type = TLIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:383:7: ( 'tlist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:383:9: 'tlist'
			{
			match("tlist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TLIST"

	// $ANTLR start "CODEBLOCK"
	public final void mCODEBLOCK() throws RecognitionException {
		try {
			int _type = CODEBLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:384:11: ( 'codeblock' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:384:13: 'codeblock'
			{
			match("codeblock"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CODEBLOCK"

	// $ANTLR start "LINK"
	public final void mLINK() throws RecognitionException {
		try {
			int _type = LINK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:385:6: ( 'link' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:385:8: 'link'
			{
			match("link"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINK"

	// $ANTLR start "IMG"
	public final void mIMG() throws RecognitionException {
		try {
			int _type = IMG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:386:5: ( 'img' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:386:7: 'img'
			{
			match("img"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMG"

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:387:7: ( 'table' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:387:9: 'table'
			{
			match("table"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLE"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			int _type = L;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:388:3: ( '$l' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:388:5: '$l'
			{
			match("$l"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			int _type = C;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:389:3: ( '$c' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:389:5: '$c'
			{
			match("$c"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			int _type = R;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:390:3: ( '$r' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:390:5: '$r'
			{
			match("$r"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "FORMAT"
	public final void mFORMAT() throws RecognitionException {
		try {
			int _type = FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:391:9: ( 'format' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:391:11: 'format'
			{
			match("format"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORMAT"

	// $ANTLR start "FORMATTEXT"
	public final void mFORMATTEXT() throws RecognitionException {
		try {
			int _type = FORMATTEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:392:12: ( 'formattext' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:392:14: 'formattext'
			{
			match("formattext"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORMATTEXT"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:393:5: ( 'fun' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:393:7: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:394:5: ( 'for' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:394:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:395:4: ( 'in' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:395:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:396:7: ( 'class' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:396:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:397:6: ( 'list' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:397:8: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "EQI"
	public final void mEQI() throws RecognitionException {
		try {
			int _type = EQI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:398:5: ( '=i' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:398:7: '=i'
			{
			match("=i"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQI"

	// $ANTLR start "EQL"
	public final void mEQL() throws RecognitionException {
		try {
			int _type = EQL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:399:5: ( '=l' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:399:7: '=l'
			{
			match("=l"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQL"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:400:8: ( 'return' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:400:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:405:3: ( '%g' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:405:5: '%g'
			{
			match("%g"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:407:3: ( '%i' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:407:5: '%i'
			{
			match("%i"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:408:5: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:408:7: ( LETTER ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:408:16: ( LETTER | DIGIT | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "DOTVAR"
	public final void mDOTVAR() throws RecognitionException {
		try {
			int _type = DOTVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:410:8: ( VAR ( '.' VAR )? )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:410:10: VAR ( '.' VAR )?
			{
			mVAR(); 

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:410:14: ( '.' VAR )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:410:15: '.' VAR
					{
					match('.'); 
					mVAR(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTVAR"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:412:9: ( ( DIGIT )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:412:11: ( DIGIT )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:412:11: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:9: ( DIGIT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:415:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:416:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:416:13: ( DIGIT )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:416:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:416:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:417:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:417:9: ( DIGIT )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='/') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='/') ) {
					alt18=1;
				}
				else if ( (LA18_1=='*') ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop15;
						}
					}

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:421:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:422:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:422:14: ( options {greedy=false; } : . )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0=='*') ) {
							int LA17_1 = input.LA(2);
							if ( (LA17_1=='/') ) {
								alt17=2;
							}
							else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
								alt17=1;
							}

						}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:422:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop17;
						}
					}

					match("*/"); 

					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:425:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:425:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:425:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:436:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:436:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:436:15: ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\\') ) {
					alt20=1;
				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= ')')||(LA20_0 >= '+' && LA20_0 <= 'Z')||(LA20_0 >= '^' && LA20_0 <= '\uFFFF')) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:436:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:436:27: ~ ( '\\\\' | '\"' | '[' | ']' | '*' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:438:11: ( . )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:438:13: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TK"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:8: ( T__78 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | PLUS | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMAT | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | RETURN | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK )
		int alt21=66;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:10: T__78
				{
				mT__78(); 

				}
				break;
			case 2 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:16: DO
				{
				mDO(); 

				}
				break;
			case 3 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:19: CM
				{
				mCM(); 

				}
				break;
			case 4 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:22: SE
				{
				mSE(); 

				}
				break;
			case 5 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:25: CL
				{
				mCL(); 

				}
				break;
			case 6 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:28: LP
				{
				mLP(); 

				}
				break;
			case 7 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:31: RP
				{
				mRP(); 

				}
				break;
			case 8 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:34: LSB
				{
				mLSB(); 

				}
				break;
			case 9 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:38: RSB
				{
				mRSB(); 

				}
				break;
			case 10 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:42: LCB
				{
				mLCB(); 

				}
				break;
			case 11 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:46: RCB
				{
				mRCB(); 

				}
				break;
			case 12 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:50: LAB
				{
				mLAB(); 

				}
				break;
			case 13 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:54: RAB
				{
				mRAB(); 

				}
				break;
			case 14 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:58: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:63: HA
				{
				mHA(); 

				}
				break;
			case 16 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:66: IT
				{
				mIT(); 

				}
				break;
			case 17 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:69: BOLD
				{
				mBOLD(); 

				}
				break;
			case 18 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:74: ITBOLD
				{
				mITBOLD(); 

				}
				break;
			case 19 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:81: ST
				{
				mST(); 

				}
				break;
			case 20 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:84: HL
				{
				mHL(); 

				}
				break;
			case 21 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:87: SUBS
				{
				mSUBS(); 

				}
				break;
			case 22 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:92: SUPS
				{
				mSUPS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:97: CODE
				{
				mCODE(); 

				}
				break;
			case 24 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:102: HRULE
				{
				mHRULE(); 

				}
				break;
			case 25 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:108: US
				{
				mUS(); 

				}
				break;
			case 26 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:111: SL
				{
				mSL(); 

				}
				break;
			case 27 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:114: EX
				{
				mEX(); 

				}
				break;
			case 28 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:117: EQ
				{
				mEQ(); 

				}
				break;
			case 29 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:120: GET
				{
				mGET(); 

				}
				break;
			case 30 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:124: LET
				{
				mLET(); 

				}
				break;
			case 31 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:128: TITLE
				{
				mTITLE(); 

				}
				break;
			case 32 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:134: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 33 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:142: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 34 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:150: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 35 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:158: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 36 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:166: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 37 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:174: TEXT
				{
				mTEXT(); 

				}
				break;
			case 38 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:179: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 39 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:190: OLIST
				{
				mOLIST(); 

				}
				break;
			case 40 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:196: ULIST
				{
				mULIST(); 

				}
				break;
			case 41 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:202: TLIST
				{
				mTLIST(); 

				}
				break;
			case 42 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:208: CODEBLOCK
				{
				mCODEBLOCK(); 

				}
				break;
			case 43 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:218: LINK
				{
				mLINK(); 

				}
				break;
			case 44 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:223: IMG
				{
				mIMG(); 

				}
				break;
			case 45 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:227: TABLE
				{
				mTABLE(); 

				}
				break;
			case 46 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:233: L
				{
				mL(); 

				}
				break;
			case 47 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:235: C
				{
				mC(); 

				}
				break;
			case 48 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:237: R
				{
				mR(); 

				}
				break;
			case 49 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:239: FORMAT
				{
				mFORMAT(); 

				}
				break;
			case 50 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:246: FORMATTEXT
				{
				mFORMATTEXT(); 

				}
				break;
			case 51 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:257: FUN
				{
				mFUN(); 

				}
				break;
			case 52 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:261: FOR
				{
				mFOR(); 

				}
				break;
			case 53 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:265: IN
				{
				mIN(); 

				}
				break;
			case 54 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:268: CLASS
				{
				mCLASS(); 

				}
				break;
			case 55 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:274: LIST
				{
				mLIST(); 

				}
				break;
			case 56 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:279: EQI
				{
				mEQI(); 

				}
				break;
			case 57 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:283: EQL
				{
				mEQL(); 

				}
				break;
			case 58 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:287: RETURN
				{
				mRETURN(); 

				}
				break;
			case 59 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:294: VAR
				{
				mVAR(); 

				}
				break;
			case 60 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:298: DOTVAR
				{
				mDOTVAR(); 

				}
				break;
			case 61 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:305: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 62 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:313: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 63 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:319: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 64 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:327: WS
				{
				mWS(); 

				}
				break;
			case 65 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:330: STRING
				{
				mSTRING(); 

				}
				break;
			case 66 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\maltCompilerPackage\\Malt.g:1:337: ERROR_TK
				{
				mERROR_TK(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA14_eotS =
		"\5\uffff";
	static final String DFA14_eofS =
		"\5\uffff";
	static final String DFA14_minS =
		"\2\56\3\uffff";
	static final String DFA14_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA14_specialS =
		"\5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "414:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\1\47\1\51\11\uffff\1\65\1\67\2\uffff\1\73\1\75\1\101\2\uffff"+
		"\1\105\1\107\1\uffff\10\116\1\46\3\116\1\143\25\uffff\1\147\16\uffff\5"+
		"\116\2\uffff\14\116\1\171\3\uffff\3\116\1\uffff\1\143\3\uffff\20\116\1"+
		"\u008d\1\uffff\1\u008f\1\u0090\2\116\1\u0093\14\116\1\u00a0\1\u00a1\1"+
		"\uffff\1\116\2\uffff\1\116\1\u00a4\1\uffff\1\u00a5\1\u00a6\6\116\1\u00ad"+
		"\1\u00ae\1\116\1\u00b0\2\uffff\2\116\3\uffff\6\116\2\uffff\1\116\1\uffff"+
		"\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\3\116\7\uffff"+
		"\4\116\1\u00c9\1\116\1\u00cb\1\uffff\1\u00cc\2\uffff";
	static final String DFA21_eofS =
		"\u00cd\uffff";
	static final String DFA21_minS =
		"\2\0\1\60\11\uffff\2\75\2\uffff\1\52\1\176\1\75\2\uffff\1\137\1\52\1\uffff"+
		"\10\56\1\143\4\56\25\uffff\1\52\16\uffff\5\56\2\uffff\15\56\3\uffff\3"+
		"\56\1\uffff\1\56\3\uffff\21\56\1\uffff\23\56\1\uffff\1\56\2\uffff\2\56"+
		"\1\uffff\14\56\2\uffff\2\56\3\uffff\6\56\2\uffff\1\56\1\uffff\12\56\7"+
		"\uffff\7\56\1\uffff\1\56\2\uffff";
	static final String DFA21_maxS =
		"\2\uffff\1\71\11\uffff\2\75\2\uffff\1\52\1\176\1\154\2\uffff\1\137\1\57"+
		"\1\uffff\10\172\1\162\3\172\1\145\25\uffff\1\52\16\uffff\5\172\2\uffff"+
		"\15\172\3\uffff\3\172\1\uffff\1\145\3\uffff\21\172\1\uffff\23\172\1\uffff"+
		"\1\172\2\uffff\2\172\1\uffff\14\172\2\uffff\2\172\3\uffff\6\172\2\uffff"+
		"\1\172\1\uffff\12\172\7\uffff\7\172\1\uffff\1\172\2\uffff";
	static final String DFA21_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\16\1\17\3\uffff"+
		"\1\26\1\27\2\uffff\1\33\15\uffff\1\100\1\102\1\1\1\101\1\2\1\76\1\3\1"+
		"\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\36\1\14\1\35\1\15\1\16\1\17\1\uffff"+
		"\1\20\1\23\1\25\1\24\1\70\1\71\1\34\1\26\1\27\1\30\1\31\1\77\1\32\1\33"+
		"\5\uffff\1\73\1\74\15\uffff\1\56\1\57\1\60\3\uffff\1\75\1\uffff\1\100"+
		"\1\22\1\21\21\uffff\1\65\23\uffff\1\54\1\uffff\1\64\1\63\2\uffff\1\45"+
		"\14\uffff\1\53\1\67\2\uffff\1\37\1\51\1\55\6\uffff\1\47\1\50\1\uffff\1"+
		"\66\12\uffff\1\61\1\72\1\40\1\41\1\42\1\43\1\44\7\uffff\1\52\1\uffff\1"+
		"\46\1\62";
	static final String DFA21_specialS =
		"\1\1\1\0\u00cb\uffff}>";
	static final String[] DFA21_transitionS = {
			"\11\46\2\45\2\46\1\45\22\46\1\45\1\27\1\1\1\17\1\40\2\46\1\24\1\6\1\7"+
			"\1\20\1\16\1\3\1\46\1\2\1\26\12\44\1\5\1\4\1\14\1\22\1\15\2\46\32\43"+
			"\1\10\1\46\1\11\1\23\1\25\1\46\1\43\1\32\1\35\2\43\1\41\2\43\1\37\2\43"+
			"\1\36\2\43\1\33\2\43\1\42\1\31\1\30\1\34\5\43\1\12\1\46\1\13\1\21\uff81"+
			"\46",
			"\52\50\1\uffff\60\50\1\uffff\1\50\1\uffff\uffa2\50",
			"\12\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\64",
			"\1\66",
			"",
			"",
			"\1\72",
			"\1\74",
			"\1\76\53\uffff\1\77\2\uffff\1\100",
			"",
			"",
			"\1\104",
			"\1\106\4\uffff\1\106",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\1\114\3\115"+
			"\1\112\3\115\1\111\2\115\1\113\16\115",
			"\1\117\1\uffff\1\115\1\120\1\121\1\122\1\123\1\124\4\115\7\uffff\32"+
			"\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\125\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\126\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\127\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\131\2\115\1\130\13\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\132\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\14\115\1"+
			"\133\1\134\14\115",
			"\1\136\10\uffff\1\135\5\uffff\1\137",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\16\115\1"+
			"\140\5\115\1\141\5\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\142"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\52\1\uffff\12\144\13\uffff\1\52\37\uffff\1\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\146",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\150\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\27\115\1"+
			"\151\2\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\152\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\1\115\1\153"+
			"\30\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\154\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\155\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\156\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\157\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\160\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\16\115\1"+
			"\161\13\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\162\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\163\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\3\115\1\164"+
			"\26\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\1\165\31"+
			"\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\15\115\1"+
			"\166\4\115\1\167\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\6\115\1\170"+
			"\23\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\21\115\1"+
			"\172\10\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\15\115\1"+
			"\173\14\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\174\6\115",
			"",
			"\1\52\1\uffff\12\144\13\uffff\1\52\37\uffff\1\52",
			"",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\175\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\176\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\22\115\1"+
			"\177\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u0080\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\u0081\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\u0082\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\u0083\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\u0084\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\10\115\1"+
			"\u0085\21\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\2\115\1\u0086"+
			"\27\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\22\115\1"+
			"\u0087\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\22\115\1"+
			"\u0088\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u0089"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\22\115\1"+
			"\u008a\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\12\115\1"+
			"\u008b\17\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u008c\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\14\115\1"+
			"\u008e\15\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\24\115\1"+
			"\u0091\5\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u0092"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u0094\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u0095"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u0096\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u0097\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u0098\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u0099\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u009a\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\12\115\1"+
			"\u009b\17\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u009c\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u009d\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\1\115\1\u009e"+
			"\30\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\22\115\1"+
			"\u009f\7\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\1\u00a2\31"+
			"\115",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\21\115\1"+
			"\u00a3\10\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00a7\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00a8\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00a9\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00aa\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00ab\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\20\115\1"+
			"\u00ac\11\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\13\115\1"+
			"\u00af\16\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u00b1\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\15\115\1"+
			"\u00b2\14\115",
			"",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00b3"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00b4"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00b5"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00b6"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00b7"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\24\115\1"+
			"\u00b8\5\115",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\16\115\1"+
			"\u00b9\13\115",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u00ba\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\16\115\1"+
			"\u00c2\13\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\2\115\1\u00c3"+
			"\27\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00c4"+
			"\25\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u00c5\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\12\115\1"+
			"\u00c6\17\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\27\115\1"+
			"\u00c7\2\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\4\115\1\u00c8"+
			"\25\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\23\115\1"+
			"\u00ca\6\115",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			"\1\117\1\uffff\12\115\7\uffff\32\115\4\uffff\1\115\1\uffff\32\115",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__78 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | PLUS | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMAT | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | RETURN | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_1 = input.LA(1);
						s = -1;
						if ( ((LA21_1 >= '\u0000' && LA21_1 <= ')')||(LA21_1 >= '+' && LA21_1 <= 'Z')||LA21_1=='\\'||(LA21_1 >= '^' && LA21_1 <= '\uFFFF')) ) {s = 40;}
						else s = 39;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_0 = input.LA(1);
						s = -1;
						if ( (LA21_0=='\"') ) {s = 1;}
						else if ( (LA21_0=='.') ) {s = 2;}
						else if ( (LA21_0==',') ) {s = 3;}
						else if ( (LA21_0==';') ) {s = 4;}
						else if ( (LA21_0==':') ) {s = 5;}
						else if ( (LA21_0=='(') ) {s = 6;}
						else if ( (LA21_0==')') ) {s = 7;}
						else if ( (LA21_0=='[') ) {s = 8;}
						else if ( (LA21_0==']') ) {s = 9;}
						else if ( (LA21_0=='{') ) {s = 10;}
						else if ( (LA21_0=='}') ) {s = 11;}
						else if ( (LA21_0=='<') ) {s = 12;}
						else if ( (LA21_0=='>') ) {s = 13;}
						else if ( (LA21_0=='+') ) {s = 14;}
						else if ( (LA21_0=='#') ) {s = 15;}
						else if ( (LA21_0=='*') ) {s = 16;}
						else if ( (LA21_0=='~') ) {s = 17;}
						else if ( (LA21_0=='=') ) {s = 18;}
						else if ( (LA21_0=='^') ) {s = 19;}
						else if ( (LA21_0=='\'') ) {s = 20;}
						else if ( (LA21_0=='_') ) {s = 21;}
						else if ( (LA21_0=='/') ) {s = 22;}
						else if ( (LA21_0=='!') ) {s = 23;}
						else if ( (LA21_0=='t') ) {s = 24;}
						else if ( (LA21_0=='s') ) {s = 25;}
						else if ( (LA21_0=='b') ) {s = 26;}
						else if ( (LA21_0=='o') ) {s = 27;}
						else if ( (LA21_0=='u') ) {s = 28;}
						else if ( (LA21_0=='c') ) {s = 29;}
						else if ( (LA21_0=='l') ) {s = 30;}
						else if ( (LA21_0=='i') ) {s = 31;}
						else if ( (LA21_0=='$') ) {s = 32;}
						else if ( (LA21_0=='f') ) {s = 33;}
						else if ( (LA21_0=='r') ) {s = 34;}
						else if ( ((LA21_0 >= 'A' && LA21_0 <= 'Z')||LA21_0=='a'||(LA21_0 >= 'd' && LA21_0 <= 'e')||(LA21_0 >= 'g' && LA21_0 <= 'h')||(LA21_0 >= 'j' && LA21_0 <= 'k')||(LA21_0 >= 'm' && LA21_0 <= 'n')||(LA21_0 >= 'p' && LA21_0 <= 'q')||(LA21_0 >= 'v' && LA21_0 <= 'z')) ) {s = 35;}
						else if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {s = 36;}
						else if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 37;}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\b')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\u001F')||(LA21_0 >= '%' && LA21_0 <= '&')||LA21_0=='-'||(LA21_0 >= '?' && LA21_0 <= '@')||LA21_0=='\\'||LA21_0=='`'||LA21_0=='|'||(LA21_0 >= '\u007F' && LA21_0 <= '\uFFFF')) ) {s = 38;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 21, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
