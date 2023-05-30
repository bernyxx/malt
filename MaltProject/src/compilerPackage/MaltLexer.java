// $ANTLR 3.5.1 C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-05-30 14:07:00

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
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
	public static final int S2=46;
	public static final int S2TITLE=47;
	public static final int S3=48;
	public static final int S3TITLE=49;
	public static final int S4=50;
	public static final int S4TITLE=51;
	public static final int S5=52;
	public static final int S5TITLE=53;
	public static final int S6=54;
	public static final int SE=55;
	public static final int SL=56;
	public static final int ST=57;
	public static final int STRING=58;
	public static final int SUBS=59;
	public static final int SUPS=60;
	public static final int TABLE=61;
	public static final int TITLE=62;
	public static final int TLIST=63;
	public static final int ULIST=64;
	public static final int UNICODE_ESC=65;
	public static final int WS=66;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:11:7: ( 'C' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:11:9: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:12:7: ( 'C++' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:12:9: 'C++'
			{
			match("C++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:13:7: ( 'Java' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:13:9: 'Java'
			{
			match("Java"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:183:33: ( '0' .. '9' )+
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:186:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:190:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:191:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:192:9: OCTAL_ESC
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:197:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:198:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:199:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:204:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:208:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:7: ( '0' .. '9' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:4: ( '.' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:6: '.'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:4: ( ',' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:212:5: ','
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:4: ( ';' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:213:6: ';'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:4: ( ':' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:5: ':'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:4: ( '(' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:215:6: '('
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:4: ( ')' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:6: ')'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:5: ( '[' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:7: '['
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:5: ( ']' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:7: ']'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:5: ( '{' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:7: '{'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:5: ( '}' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:7: '}'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:5: ( '<' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:221:7: '<'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:5: ( '>' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:222:7: '>'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:4: ( '#' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:6: '#'
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

	// $ANTLR start "S2"
	public final void mS2() throws RecognitionException {
		try {
			int _type = S2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:4: ( '##' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:224:6: '##'
			{
			match("##"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S2"

	// $ANTLR start "S3"
	public final void mS3() throws RecognitionException {
		try {
			int _type = S3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:4: ( '###' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:6: '###'
			{
			match("###"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S3"

	// $ANTLR start "S4"
	public final void mS4() throws RecognitionException {
		try {
			int _type = S4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:4: ( '####' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:6: '####'
			{
			match("####"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S4"

	// $ANTLR start "S5"
	public final void mS5() throws RecognitionException {
		try {
			int _type = S5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:4: ( '#####' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:6: '#####'
			{
			match("#####"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S5"

	// $ANTLR start "S6"
	public final void mS6() throws RecognitionException {
		try {
			int _type = S6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:4: ( '######' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:228:6: '######'
			{
			match("######"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S6"

	// $ANTLR start "IT"
	public final void mIT() throws RecognitionException {
		try {
			int _type = IT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:5: ( '*' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:229:7: '*'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:7: ( '**' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:9: '**'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:9: ( '***' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:11: '***'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:5: ( '~~' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:7: '~~'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:5: ( '==' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:7: '=='
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:7: ( '~' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:9: '~'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:7: ( '^' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:9: '^'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:7: ( '\\'' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:9: '\\''
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

	// $ANTLR start "BLOCKCODE"
	public final void mBLOCKCODE() throws RecognitionException {
		try {
			int _type = BLOCKCODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:11: ( '\\'\\'\\'' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:13: '\\'\\'\\''
			{
			match("'''"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOCKCODE"

	// $ANTLR start "HRULE"
	public final void mHRULE() throws RecognitionException {
		try {
			int _type = HRULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:8: ( '___' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:10: '___'
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

	// $ANTLR start "SL"
	public final void mSL() throws RecognitionException {
		try {
			int _type = SL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:4: ( '/' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:6: '/'
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

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:4: ( '@' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "EX"
	public final void mEX() throws RecognitionException {
		try {
			int _type = EX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:4: ( '!' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:6: '!'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:4: ( '\"' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:6: '\"'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:4: ( '=' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:6: '='
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:5: ( '>=' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:7: '>='
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:5: ( '<=' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:7: '<='
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:7: ( 'title' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:9: 'title'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:9: ( 'stitle' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:11: 'stitle'
			{
			match("stitle"); 

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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:9: ( 'sstitle' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:11: 'sstitle'
			{
			match("sstitle"); 

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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:9: ( 'ssstitle' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:11: 'ssstitle'
			{
			match("ssstitle"); 

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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:9: ( 'sssstitle' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:11: 'sssstitle'
			{
			match("sssstitle"); 

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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:9: ( 'ssssstitle' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:11: 'ssssstitle'
			{
			match("ssssstitle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S5TITLE"

	// $ANTLR start "BLOCKQUOTE"
	public final void mBLOCKQUOTE() throws RecognitionException {
		try {
			int _type = BLOCKQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:12: ( 'blockquote' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:14: 'blockquote'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:7: ( 'olist' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:9: 'olist'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:7: ( 'ulist' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:9: 'ulist'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:7: ( 'tlist' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:9: 'tlist'
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

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:7: ( 'table' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:9: 'table'
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:3: ( 'l' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:5: 'l'
			{
			match('l'); 
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:3: ( 'c' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:5: 'c'
			{
			match('c'); 
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:3: ( 'r' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:5: 'r'
			{
			match('r'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:3: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:5: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:19: ( LETTER | DIGIT | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// $ANTLR end "ID"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:9: ( ( DIGIT )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:11: ( DIGIT )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:11: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:9: ( DIGIT )+
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
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					match('.'); 
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:20: ( DIGIT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
							break loop8;
						}
					}

					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:27: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:13: ( DIGIT )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:20: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:9: ( DIGIT )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='/') ) {
					alt17=1;
				}
				else if ( (LA17_1=='*') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:15: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
							break loop14;
						}
					}

					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:29: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:29: '\\r'
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
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:14: ( options {greedy=false; } : . )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='*') ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1=='/') ) {
								alt16=2;
							}
							else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
								alt16=1;
							}

						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop16;
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\\') ) {
					alt19=1;
				}
				else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
					alt19=2;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:27: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop19;
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:6: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				alt20=1;
			}
			else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:8: ( T__67 | T__68 | T__69 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | S2 | S3 | S4 | S5 | S6 | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | BLOCKCODE | HRULE | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | BLOCKQUOTE | OLIST | ULIST | TLIST | TABLE | L | C | R | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt21=59;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:10: T__67
				{
				mT__67(); 

				}
				break;
			case 2 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:16: T__68
				{
				mT__68(); 

				}
				break;
			case 3 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:22: T__69
				{
				mT__69(); 

				}
				break;
			case 4 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:28: DO
				{
				mDO(); 

				}
				break;
			case 5 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:31: CM
				{
				mCM(); 

				}
				break;
			case 6 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:34: SE
				{
				mSE(); 

				}
				break;
			case 7 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:37: CL
				{
				mCL(); 

				}
				break;
			case 8 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:40: LP
				{
				mLP(); 

				}
				break;
			case 9 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:43: RP
				{
				mRP(); 

				}
				break;
			case 10 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:46: LSB
				{
				mLSB(); 

				}
				break;
			case 11 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:50: RSB
				{
				mRSB(); 

				}
				break;
			case 12 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:54: LCB
				{
				mLCB(); 

				}
				break;
			case 13 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:58: RCB
				{
				mRCB(); 

				}
				break;
			case 14 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:62: LAB
				{
				mLAB(); 

				}
				break;
			case 15 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:66: RAB
				{
				mRAB(); 

				}
				break;
			case 16 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:70: HA
				{
				mHA(); 

				}
				break;
			case 17 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:73: S2
				{
				mS2(); 

				}
				break;
			case 18 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:76: S3
				{
				mS3(); 

				}
				break;
			case 19 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:79: S4
				{
				mS4(); 

				}
				break;
			case 20 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:82: S5
				{
				mS5(); 

				}
				break;
			case 21 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:85: S6
				{
				mS6(); 

				}
				break;
			case 22 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:88: IT
				{
				mIT(); 

				}
				break;
			case 23 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:91: BOLD
				{
				mBOLD(); 

				}
				break;
			case 24 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:96: ITBOLD
				{
				mITBOLD(); 

				}
				break;
			case 25 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:103: ST
				{
				mST(); 

				}
				break;
			case 26 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:106: HL
				{
				mHL(); 

				}
				break;
			case 27 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:109: SUBS
				{
				mSUBS(); 

				}
				break;
			case 28 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:114: SUPS
				{
				mSUPS(); 

				}
				break;
			case 29 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:119: CODE
				{
				mCODE(); 

				}
				break;
			case 30 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:124: BLOCKCODE
				{
				mBLOCKCODE(); 

				}
				break;
			case 31 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:134: HRULE
				{
				mHRULE(); 

				}
				break;
			case 32 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:140: SL
				{
				mSL(); 

				}
				break;
			case 33 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:143: AT
				{
				mAT(); 

				}
				break;
			case 34 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:146: EX
				{
				mEX(); 

				}
				break;
			case 35 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:149: QU
				{
				mQU(); 

				}
				break;
			case 36 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:152: EQ
				{
				mEQ(); 

				}
				break;
			case 37 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:155: GET
				{
				mGET(); 

				}
				break;
			case 38 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:159: LET
				{
				mLET(); 

				}
				break;
			case 39 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:163: TITLE
				{
				mTITLE(); 

				}
				break;
			case 40 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:169: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 41 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:177: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 42 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:185: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 43 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:193: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 44 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:201: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 45 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:209: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 46 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:220: OLIST
				{
				mOLIST(); 

				}
				break;
			case 47 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:226: ULIST
				{
				mULIST(); 

				}
				break;
			case 48 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:232: TLIST
				{
				mTLIST(); 

				}
				break;
			case 49 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:238: TABLE
				{
				mTABLE(); 

				}
				break;
			case 50 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:244: L
				{
				mL(); 

				}
				break;
			case 51 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:246: C
				{
				mC(); 

				}
				break;
			case 52 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:248: R
				{
				mR(); 

				}
				break;
			case 53 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:250: ID
				{
				mID(); 

				}
				break;
			case 54 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:253: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 55 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:261: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 56 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:267: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 57 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:275: WS
				{
				mWS(); 

				}
				break;
			case 58 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:278: STRING
				{
				mSTRING(); 

				}
				break;
			case 59 :
				// C:\\Users\\giuly\\Desktop\\università\\ANNO 5\\S1\\Linguaggi\\progetto\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:285: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\2\56\3\uffff";
	static final String DFA13_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "268:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\1\46\1\42\1\50\11\uffff\1\53\1\55\1\57\1\61\1\63\1\65\1\uffff"+
		"\1\67\1\42\1\73\2\uffff\1\74\5\42\1\106\1\107\1\110\1\uffff\1\111\3\uffff"+
		"\1\42\6\uffff\1\114\1\uffff\1\116\10\uffff\1\42\4\uffff\10\42\4\uffff"+
		"\1\42\1\133\3\uffff\1\134\11\42\1\147\1\151\2\uffff\12\42\1\uffff\1\166"+
		"\1\uffff\1\167\1\170\1\171\6\42\1\u0080\1\u0081\5\uffff\1\u0082\5\42\3"+
		"\uffff\1\u0088\4\42\1\uffff\1\u008d\3\42\1\uffff\1\u0091\2\42\1\uffff"+
		"\1\u0094\1\u0095\2\uffff";
	static final String DFA21_eofS =
		"\u0096\uffff";
	static final String DFA21_minS =
		"\1\11\1\53\1\141\1\60\11\uffff\2\75\1\43\1\52\1\176\1\75\1\uffff\1\0\1"+
		"\137\1\52\2\uffff\1\0\1\141\1\163\3\154\3\60\1\uffff\1\56\3\uffff\1\166"+
		"\6\uffff\1\43\1\uffff\1\52\10\uffff\1\137\4\uffff\1\164\1\151\1\142\1"+
		"\151\1\163\1\157\2\151\4\uffff\1\141\1\43\3\uffff\1\60\1\154\1\163\1\154"+
		"\1\164\1\151\1\163\1\143\2\163\1\60\1\43\2\uffff\1\145\1\164\1\145\1\154"+
		"\1\164\1\151\1\163\1\153\2\164\1\uffff\1\43\1\uffff\3\60\1\145\1\154\1"+
		"\164\1\151\1\164\1\161\2\60\5\uffff\1\60\1\145\1\154\1\164\1\151\1\165"+
		"\3\uffff\1\60\1\145\1\154\1\164\1\157\1\uffff\1\60\1\145\1\154\1\164\1"+
		"\uffff\1\60\2\145\1\uffff\2\60\2\uffff";
	static final String DFA21_maxS =
		"\1\176\1\172\1\141\1\71\11\uffff\2\75\1\43\1\52\1\176\1\75\1\uffff\1\uffff"+
		"\1\137\1\57\2\uffff\1\uffff\1\154\1\164\3\154\3\172\1\uffff\1\145\3\uffff"+
		"\1\166\6\uffff\1\43\1\uffff\1\52\10\uffff\1\137\4\uffff\1\164\1\151\1"+
		"\142\1\151\1\164\1\157\2\151\4\uffff\1\141\1\43\3\uffff\1\172\1\154\1"+
		"\163\1\154\1\164\1\151\1\164\1\143\2\163\1\172\1\43\2\uffff\1\145\1\164"+
		"\1\145\1\154\1\164\1\151\1\164\1\153\2\164\1\uffff\1\43\1\uffff\3\172"+
		"\1\145\1\154\1\164\1\151\1\164\1\161\2\172\5\uffff\1\172\1\145\1\154\1"+
		"\164\1\151\1\165\3\uffff\1\172\1\145\1\154\1\164\1\157\1\uffff\1\172\1"+
		"\145\1\154\1\164\1\uffff\1\172\2\145\1\uffff\2\172\2\uffff";
	static final String DFA21_acceptS =
		"\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\6\uffff\1\34\3\uffff"+
		"\1\41\1\42\11\uffff\1\65\1\uffff\1\71\1\2\1\1\1\uffff\1\4\1\67\1\46\1"+
		"\16\1\45\1\17\1\uffff\1\20\1\uffff\1\26\1\31\1\33\1\32\1\44\1\36\1\35"+
		"\1\73\1\uffff\1\70\1\40\1\43\1\72\10\uffff\1\62\1\63\1\64\1\66\2\uffff"+
		"\1\21\1\30\1\27\14\uffff\1\22\1\37\12\uffff\1\3\1\uffff\1\23\13\uffff"+
		"\1\25\1\24\1\47\1\60\1\61\6\uffff\1\56\1\57\1\50\5\uffff\1\51\4\uffff"+
		"\1\52\3\uffff\1\53\2\uffff\1\54\1\55";
	static final String DFA21_specialS =
		"\24\uffff\1\1\4\uffff\1\0\174\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\30\1\31\1\17\3\uffff\1\24\1\7\1\10"+
			"\1\20\1\uffff\1\4\1\uffff\1\3\1\26\12\43\1\6\1\5\1\15\1\22\1\16\1\uffff"+
			"\1\27\2\42\1\1\6\42\1\2\20\42\1\11\1\uffff\1\12\1\23\1\25\1\uffff\1\42"+
			"\1\34\1\40\10\42\1\37\2\42\1\35\2\42\1\41\1\33\1\32\1\36\5\42\1\13\1"+
			"\uffff\1\14\1\21",
			"\1\45\4\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\47",
			"\12\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\54",
			"\1\56",
			"\1\60",
			"\1\62",
			"\1\64",
			"",
			"\47\70\1\66\uffd8\70",
			"\1\71",
			"\1\72\4\uffff\1\72",
			"",
			"",
			"\0\75",
			"\1\100\7\uffff\1\76\2\uffff\1\77",
			"\1\102\1\101",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\51\1\uffff\12\43\13\uffff\1\51\37\uffff\1\51",
			"",
			"",
			"",
			"\1\112",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\113",
			"",
			"\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117",
			"",
			"",
			"",
			"",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\125\1\124",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"",
			"",
			"",
			"\1\131",
			"\1\132",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\143\1\142",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\150",
			"",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\161\1\160",
			"\1\162",
			"\1\163",
			"\1\164",
			"",
			"\1\165",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0092",
			"\1\u0093",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
			return "1:1: Tokens : ( T__67 | T__68 | T__69 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | S2 | S3 | S4 | S5 | S6 | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | BLOCKCODE | HRULE | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | BLOCKQUOTE | OLIST | ULIST | TLIST | TABLE | L | C | R | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_25 = input.LA(1);
						s = -1;
						if ( ((LA21_25 >= '\u0000' && LA21_25 <= '\uFFFF')) ) {s = 61;}
						else s = 60;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_20 = input.LA(1);
						s = -1;
						if ( (LA21_20=='\'') ) {s = 54;}
						else if ( ((LA21_20 >= '\u0000' && LA21_20 <= '&')||(LA21_20 >= '(' && LA21_20 <= '\uFFFF')) ) {s = 56;}
						else s = 55;
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
