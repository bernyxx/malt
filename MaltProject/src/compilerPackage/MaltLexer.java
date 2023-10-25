// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-25 19:29:50

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:369:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:369:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:369:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:369:33: ( '0' .. '9' )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:372:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:376:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='*'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:377:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:378:9: OCTAL_ESC
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:383:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:383:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:384:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:385:9: '\\\\' ( '0' .. '7' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:390:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:390:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:394:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:397:7: ( '0' .. '9' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:399:4: ( '.' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:399:6: '.'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:400:4: ( ',' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:400:5: ','
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:401:4: ( ';' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:401:6: ';'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:402:4: ( ':' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:402:5: ':'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:403:4: ( '(' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:403:6: '('
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:404:4: ( ')' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:404:6: ')'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:405:5: ( '[' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:405:7: '['
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:406:5: ( ']' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:406:7: ']'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:407:5: ( '{' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:407:7: '{'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:408:5: ( '}' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:408:7: '}'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:409:5: ( '<' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:409:7: '<'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:410:5: ( '>' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:410:7: '>'
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

	// $ANTLR start "HA"
	public final void mHA() throws RecognitionException {
		try {
			int _type = HA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:411:4: ( '#' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:411:6: '#'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:412:5: ( '*' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:412:7: '*'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:413:7: ( '**' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:413:9: '**'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:414:9: ( '***' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:414:11: '***'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:415:5: ( '~~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:415:7: '~~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:416:5: ( '==' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:416:7: '=='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:417:7: ( '~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:417:9: '~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:418:7: ( '^' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:418:9: '^'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:419:7: ( '\\'' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:419:9: '\\''
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:420:8: ( '___' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:420:10: '___'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:421:4: ( '_' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:421:6: '_'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:422:4: ( '/' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:422:6: '/'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:423:4: ( '!' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:423:6: '!'
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

	// $ANTLR start "QU"
	public final void mQU() throws RecognitionException {
		try {
			int _type = QU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:424:4: ( '\"' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:424:6: '\"'
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
	// $ANTLR end "QU"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:425:4: ( '=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:425:6: '='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:426:5: ( '>=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:426:7: '>='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:427:5: ( '<=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:427:7: '<='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:429:7: ( 'title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:429:9: 'title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:430:9: ( 's1title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:430:11: 's1title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:431:9: ( 's2title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:431:11: 's2title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:432:9: ( 's3title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:432:11: 's3title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:433:9: ( 's4title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:433:11: 's4title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:434:9: ( 's5title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:434:11: 's5title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:435:6: ( 'text' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:435:8: 'text'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:436:12: ( 'blockquote' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:436:14: 'blockquote'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:437:7: ( 'olist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:437:9: 'olist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:438:7: ( 'ulist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:438:9: 'ulist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:439:7: ( 'tlist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:439:9: 'tlist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:440:11: ( 'codeblock' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:440:13: 'codeblock'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:441:6: ( 'link' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:441:8: 'link'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:442:5: ( 'img' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:442:7: 'img'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:443:7: ( 'table' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:443:9: 'table'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:444:3: ( '$l' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:444:5: '$l'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:445:3: ( '$c' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:445:5: '$c'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:446:3: ( '$r' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:446:5: '$r'
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

	// $ANTLR start "FORMATTEXT"
	public final void mFORMATTEXT() throws RecognitionException {
		try {
			int _type = FORMATTEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:447:12: ( 'formattext' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:447:14: 'formattext'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:448:5: ( 'fun' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:448:7: 'fun'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:449:5: ( 'for' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:449:7: 'for'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:450:4: ( 'in' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:450:6: 'in'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:451:7: ( 'class' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:451:9: 'class'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:452:6: ( 'list' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:452:8: 'list'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:453:5: ( '=i' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:453:7: '=i'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:454:5: ( '=l' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:454:7: '=l'
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

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:459:3: ( '%g' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:459:5: '%g'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:461:3: ( '%i' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:461:5: '%i'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:462:5: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:462:7: ( LETTER ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:462:16: ( LETTER | DIGIT | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:464:8: ( VAR ( '.' VAR )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:464:10: VAR ( '.' VAR )?
			{
			mVAR(); 

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:464:14: ( '.' VAR )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:464:15: '.' VAR
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:466:9: ( ( DIGIT )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:466:11: ( DIGIT )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:466:11: ( DIGIT )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:9: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:469:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:470:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:470:13: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:470:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:470:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:471:9: ( DIGIT )+ EXPONENT
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:471:9: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:475:29: '\\r'
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:476:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:476:14: ( options {greedy=false; } : . )*
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:476:42: .
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:479:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:479:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:479:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:490:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:490:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"'
			{
			match('\"'); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:490:15: ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )*
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:490:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:490:27: ~ ( '\\\\' | '\"' | '[' | ']' | '*' )
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

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:8: ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING )
		int alt21=62;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:10: DO
				{
				mDO(); 

				}
				break;
			case 2 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:13: CM
				{
				mCM(); 

				}
				break;
			case 3 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:16: SE
				{
				mSE(); 

				}
				break;
			case 4 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:19: CL
				{
				mCL(); 

				}
				break;
			case 5 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:22: LP
				{
				mLP(); 

				}
				break;
			case 6 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:25: RP
				{
				mRP(); 

				}
				break;
			case 7 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:28: LSB
				{
				mLSB(); 

				}
				break;
			case 8 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:32: RSB
				{
				mRSB(); 

				}
				break;
			case 9 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:36: LCB
				{
				mLCB(); 

				}
				break;
			case 10 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:40: RCB
				{
				mRCB(); 

				}
				break;
			case 11 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:44: LAB
				{
				mLAB(); 

				}
				break;
			case 12 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:48: RAB
				{
				mRAB(); 

				}
				break;
			case 13 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:52: HA
				{
				mHA(); 

				}
				break;
			case 14 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:55: IT
				{
				mIT(); 

				}
				break;
			case 15 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:58: BOLD
				{
				mBOLD(); 

				}
				break;
			case 16 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:63: ITBOLD
				{
				mITBOLD(); 

				}
				break;
			case 17 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:70: ST
				{
				mST(); 

				}
				break;
			case 18 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:73: HL
				{
				mHL(); 

				}
				break;
			case 19 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:76: SUBS
				{
				mSUBS(); 

				}
				break;
			case 20 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:81: SUPS
				{
				mSUPS(); 

				}
				break;
			case 21 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:86: CODE
				{
				mCODE(); 

				}
				break;
			case 22 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:91: HRULE
				{
				mHRULE(); 

				}
				break;
			case 23 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:97: US
				{
				mUS(); 

				}
				break;
			case 24 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:100: SL
				{
				mSL(); 

				}
				break;
			case 25 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:103: EX
				{
				mEX(); 

				}
				break;
			case 26 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:106: QU
				{
				mQU(); 

				}
				break;
			case 27 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:109: EQ
				{
				mEQ(); 

				}
				break;
			case 28 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:112: GET
				{
				mGET(); 

				}
				break;
			case 29 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:116: LET
				{
				mLET(); 

				}
				break;
			case 30 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:120: TITLE
				{
				mTITLE(); 

				}
				break;
			case 31 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:126: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 32 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:134: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 33 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:142: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 34 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:150: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 35 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:158: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 36 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:166: TEXT
				{
				mTEXT(); 

				}
				break;
			case 37 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:171: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 38 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:182: OLIST
				{
				mOLIST(); 

				}
				break;
			case 39 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:188: ULIST
				{
				mULIST(); 

				}
				break;
			case 40 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:194: TLIST
				{
				mTLIST(); 

				}
				break;
			case 41 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:200: CODEBLOCK
				{
				mCODEBLOCK(); 

				}
				break;
			case 42 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:210: LINK
				{
				mLINK(); 

				}
				break;
			case 43 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:215: IMG
				{
				mIMG(); 

				}
				break;
			case 44 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:219: TABLE
				{
				mTABLE(); 

				}
				break;
			case 45 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:225: L
				{
				mL(); 

				}
				break;
			case 46 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:227: C
				{
				mC(); 

				}
				break;
			case 47 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:229: R
				{
				mR(); 

				}
				break;
			case 48 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:231: FORMATTEXT
				{
				mFORMATTEXT(); 

				}
				break;
			case 49 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:242: FUN
				{
				mFUN(); 

				}
				break;
			case 50 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:246: FOR
				{
				mFOR(); 

				}
				break;
			case 51 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:250: IN
				{
				mIN(); 

				}
				break;
			case 52 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:253: CLASS
				{
				mCLASS(); 

				}
				break;
			case 53 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:259: LIST
				{
				mLIST(); 

				}
				break;
			case 54 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:264: EQI
				{
				mEQI(); 

				}
				break;
			case 55 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:268: EQL
				{
				mEQL(); 

				}
				break;
			case 56 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:272: VAR
				{
				mVAR(); 

				}
				break;
			case 57 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:276: DOTVAR
				{
				mDOTVAR(); 

				}
				break;
			case 58 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:283: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 59 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:291: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 60 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:297: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 61 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:305: WS
				{
				mWS(); 

				}
				break;
			case 62 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:308: STRING
				{
				mSTRING(); 

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
			return "468:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\1\44\11\uffff\1\47\1\51\1\uffff\1\53\1\55\1\61\2\uffff\1\63\1"+
		"\65\1\uffff\1\66\10\75\1\uffff\2\75\1\121\7\uffff\1\123\15\uffff\5\75"+
		"\2\uffff\14\75\1\145\3\uffff\2\75\3\uffff\20\75\1\170\1\uffff\1\172\1"+
		"\173\1\75\1\175\14\75\1\u008a\1\u008b\1\uffff\1\75\2\uffff\1\u008d\1\uffff"+
		"\1\u008e\1\u008f\6\75\1\u0096\1\u0097\1\75\1\u0099\2\uffff\1\75\3\uffff"+
		"\6\75\2\uffff\1\75\1\uffff\1\75\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7"+
		"\3\75\5\uffff\4\75\1\u00af\1\75\1\u00b1\1\uffff\1\u00b2\2\uffff";
	static final String DFA21_eofS =
		"\u00b3\uffff";
	static final String DFA21_minS =
		"\1\11\1\60\11\uffff\2\75\1\uffff\1\52\1\176\1\75\2\uffff\1\137\1\52\1"+
		"\uffff\1\0\10\56\1\143\3\56\7\uffff\1\52\15\uffff\5\56\2\uffff\15\56\3"+
		"\uffff\2\56\3\uffff\21\56\1\uffff\22\56\1\uffff\1\56\2\uffff\1\56\1\uffff"+
		"\14\56\2\uffff\1\56\3\uffff\6\56\2\uffff\1\56\1\uffff\11\56\5\uffff\7"+
		"\56\1\uffff\1\56\2\uffff";
	static final String DFA21_maxS =
		"\1\176\1\71\11\uffff\2\75\1\uffff\1\52\1\176\1\154\2\uffff\1\137\1\57"+
		"\1\uffff\1\uffff\10\172\1\162\2\172\1\145\7\uffff\1\52\15\uffff\5\172"+
		"\2\uffff\15\172\3\uffff\2\172\3\uffff\21\172\1\uffff\22\172\1\uffff\1"+
		"\172\2\uffff\1\172\1\uffff\14\172\2\uffff\1\172\3\uffff\6\172\2\uffff"+
		"\1\172\1\uffff\11\172\5\uffff\7\172\1\uffff\1\172\2\uffff";
	static final String DFA21_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15\3\uffff\1"+
		"\24\1\25\2\uffff\1\31\15\uffff\1\75\1\1\1\73\1\35\1\13\1\34\1\14\1\uffff"+
		"\1\16\1\21\1\23\1\22\1\66\1\67\1\33\1\26\1\27\1\74\1\30\1\32\1\76\5\uffff"+
		"\1\70\1\71\15\uffff\1\55\1\56\1\57\2\uffff\1\72\1\20\1\17\21\uffff\1\63"+
		"\22\uffff\1\53\1\uffff\1\62\1\61\1\uffff\1\44\14\uffff\1\52\1\65\1\uffff"+
		"\1\36\1\50\1\54\6\uffff\1\46\1\47\1\uffff\1\64\11\uffff\1\37\1\40\1\41"+
		"\1\42\1\43\7\uffff\1\51\1\uffff\1\45\1\60";
	static final String DFA21_specialS =
		"\26\uffff\1\0\u009c\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\43\2\uffff\1\43\22\uffff\1\43\1\25\1\26\1\15\1\37\2\uffff\1\22\1\5"+
			"\1\6\1\16\1\uffff\1\2\1\uffff\1\1\1\24\12\42\1\4\1\3\1\13\1\20\1\14\2"+
			"\uffff\32\41\1\7\1\uffff\1\10\1\21\1\23\1\uffff\1\41\1\31\1\34\2\41\1"+
			"\40\2\41\1\36\2\41\1\35\2\41\1\32\3\41\1\30\1\27\1\33\5\41\1\11\1\uffff"+
			"\1\12\1\17",
			"\12\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\46",
			"\1\50",
			"",
			"\1\52",
			"\1\54",
			"\1\56\53\uffff\1\57\2\uffff\1\60",
			"",
			"",
			"\1\62",
			"\1\64\4\uffff\1\64",
			"",
			"\52\67\1\uffff\60\67\1\uffff\1\67\1\uffff\uffa2\67",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\73\3\74\1\71"+
			"\3\74\1\70\2\74\1\72\16\74",
			"\1\76\1\uffff\1\74\1\77\1\100\1\101\1\102\1\103\4\74\7\uffff\32\74\4"+
			"\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\104\16"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\105\16"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\106\16"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\110\2"+
			"\74\1\107\13\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\111\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\14\74\1\112\1"+
			"\113\14\74",
			"\1\115\10\uffff\1\114\5\uffff\1\116",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\117\5"+
			"\74\1\120\5\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\45\1\uffff\12\42\13\uffff\1\45\37\uffff\1\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
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
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\124\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\27\74\1\125\2"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\126\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\74\1\127\30"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\130\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\131\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\132\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\133\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\134\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\135\13"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\136\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\137\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\3\74\1\140\26"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\141\31\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\15\74\1\142\4"+
			"\74\1\143\7\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\6\74\1\144\23"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\21\74\1\146\10"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\15\74\1\147\14"+
			"\74",
			"",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\150\16"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\151\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22\74\1\152\7"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\153\16"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\154\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\155\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\156\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\157\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\160\21"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\2\74\1\161\27"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22\74\1\162\7"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22\74\1\163\7"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\164\25"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22\74\1\165\7"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\12\74\1\166\17"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\167\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\14\74\1\171\15"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\174\25"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\176\6"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\177\25"+
			"\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0080"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0081"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0082"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0083"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0084"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\12\74\1\u0085"+
			"\17\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0086"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u0087"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\74\1\u0088"+
			"\30\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22\74\1\u0089"+
			"\7\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\u008c\31\74",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0090"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0091"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0092"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0093"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0094"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\20\74\1\u0095"+
			"\11\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u0098"+
			"\16\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u009a"+
			"\6\74",
			"",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u009b"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u009c"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u009d"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u009e"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u009f"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\24\74\1\u00a0"+
			"\5\74",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\u00a1"+
			"\13\74",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u00a2"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\u00a8"+
			"\13\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\2\74\1\u00a9"+
			"\27\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u00aa"+
			"\25\74",
			"",
			"",
			"",
			"",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u00ab"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\12\74\1\u00ac"+
			"\17\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\27\74\1\u00ad"+
			"\2\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u00ae"+
			"\25\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\23\74\1\u00b0"+
			"\6\74",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
			"",
			"\1\76\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
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
			return "1:1: Tokens : ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_22 = input.LA(1);
						s = -1;
						if ( ((LA21_22 >= '\u0000' && LA21_22 <= ')')||(LA21_22 >= '+' && LA21_22 <= 'Z')||LA21_22=='\\'||(LA21_22 >= '^' && LA21_22 <= '\uFFFF')) ) {s = 55;}
						else s = 54;
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
