// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-10-09 16:38:41

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int BLOCKQUOTE=5;
	public static final int BOLD=6;
	public static final int C=7;
	public static final int CL=8;
	public static final int CM=9;
	public static final int CODE=10;
	public static final int CODEBLOCK=11;
	public static final int COMMENT=12;
	public static final int DIGIT=13;
	public static final int DO=14;
	public static final int DOTCOM=15;
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
	public static final int HTTP=26;
	public static final int HTTPS=27;
	public static final int IMG=28;
	public static final int INTEGER=29;
	public static final int IT=30;
	public static final int ITBOLD=31;
	public static final int L=32;
	public static final int LAB=33;
	public static final int LCB=34;
	public static final int LET=35;
	public static final int LETTER=36;
	public static final int LINK=37;
	public static final int LP=38;
	public static final int LSB=39;
	public static final int OCTAL_ESC=40;
	public static final int OLIST=41;
	public static final int QU=42;
	public static final int R=43;
	public static final int RAB=44;
	public static final int RCB=45;
	public static final int RP=46;
	public static final int RSB=47;
	public static final int S1TITLE=48;
	public static final int S2TITLE=49;
	public static final int S3TITLE=50;
	public static final int S4TITLE=51;
	public static final int S5TITLE=52;
	public static final int SE=53;
	public static final int SL=54;
	public static final int ST=55;
	public static final int STR=56;
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:22: ( '+' | '-' )?
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

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:33: ( '0' .. '9' )+
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:214:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' ) | UNICODE_ESC | OCTAL_ESC )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:219:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:220:9: OCTAL_ESC
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:225:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:226:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:9: '\\\\' ( '0' .. '7' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:8: ( 'a' .. 'z' | 'A' .. 'Z' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:7: ( '0' .. '9' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:4: ( '.' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:6: '.'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:4: ( ',' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:5: ','
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:4: ( ';' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:6: ';'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:4: ( ':' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:5: ':'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:4: ( '(' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:6: '('
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:4: ( ')' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:6: ')'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:5: ( '[' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:7: '['
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:5: ( ']' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:7: ']'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:5: ( '{' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:7: '{'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:5: ( '}' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:7: '}'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:5: ( '<' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:7: '<'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:5: ( '>' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:7: '>'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:4: ( '#' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:6: '#'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:5: ( '*' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:7: '*'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:7: ( '**' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:9: '**'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:9: ( '***' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:11: '***'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:5: ( '~~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:7: '~~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:5: ( '==' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:7: '=='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:7: ( '~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:9: '~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:7: ( '^' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:9: '^'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:7: ( '\\'' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:261:9: '\\''
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:8: ( '___' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:10: '___'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:4: ( '_' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:6: '_'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:4: ( '/' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:6: '/'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:4: ( '@' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:6: '@'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:4: ( '!' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:6: '!'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:4: ( '\"' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:6: '\"'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:4: ( '=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:6: '='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:5: ( '>=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:7: '>='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:5: ( '<=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:7: '<='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:7: ( 'title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:9: 'title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:9: ( 'stitle' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:11: 'stitle'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:9: ( 'sstitle' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:11: 'sstitle'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:9: ( 'ssstitle' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:11: 'ssstitle'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:9: ( 'sssstitle' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:11: 'sssstitle'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:9: ( 'ssssstitle' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:277:11: 'ssssstitle'
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

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:6: ( 'text' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:8: 'text'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:12: ( 'blockquote' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:279:14: 'blockquote'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:7: ( 'olist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:9: 'olist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:7: ( 'ulist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:281:9: 'ulist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:7: ( 'tlist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:9: 'tlist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:11: ( 'codeblock' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:283:13: 'codeblock'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:6: ( 'link' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:284:8: 'link'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:5: ( 'img' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:7: 'img'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:7: ( 'table' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:9: 'table'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:3: ( 'l' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:5: 'l'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:3: ( 'c' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:288:5: 'c'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:3: ( 'r' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:289:5: 'r'
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

	// $ANTLR start "HTTP"
	public final void mHTTP() throws RecognitionException {
		try {
			int _type = HTTP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:6: ( 'http://' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:290:8: 'http://'
			{
			match("http://"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HTTP"

	// $ANTLR start "HTTPS"
	public final void mHTTPS() throws RecognitionException {
		try {
			int _type = HTTPS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:7: ( 'https://' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:9: 'https://'
			{
			match("https://"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HTTPS"

	// $ANTLR start "DOTCOM"
	public final void mDOTCOM() throws RecognitionException {
		try {
			int _type = DOTCOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:8: ( '.com' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:10: '.com'
			{
			match(".com"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTCOM"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:5: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:7: ( LETTER ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:294:16: ( LETTER | DIGIT | '_' )*
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:9: ( ( DIGIT )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:11: ( DIGIT )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:296:11: ( DIGIT )+
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:9: ( DIGIT )+
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

					match('.'); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:20: ( DIGIT )*
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
							break loop8;
						}
					}

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:27: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:299:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:13: ( DIGIT )+
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:20: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:300:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:301:9: ( DIGIT )+ EXPONENT
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:301:9: ( DIGIT )+
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:15: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
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
							break loop14;
						}
					}

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:29: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:305:29: '\\r'
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:14: ( options {greedy=false; } : . )*
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
							// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:306:42: .
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
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:309:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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

	// $ANTLR start "STR"
	public final void mSTR() throws RecognitionException {
		try {
			int _type = STR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:6: ( LP (~ ( LP | RP | '\"' ) )* RP )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:8: LP (~ ( LP | RP | '\"' ) )* RP
			{
			mLP(); 

			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:318:11: (~ ( LP | RP | '\"' ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\u0000' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '\'')||(LA19_0 >= '*' && LA19_0 <= '\uFFFF')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\'')||(input.LA(1) >= '*' && input.LA(1) <= '\uFFFF') ) {
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

			mRP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"' )
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"'
			{
			match('\"'); 
			// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:15: ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )*
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
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:320:27: ~ ( '\\\\' | '\"' | '[' | ']' | '*' )
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
		// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:8: ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | HTTP | HTTPS | DOTCOM | VAR | INTEGER | FLOAT | COMMENT | WS | STR | STRING )
		int alt21=58;
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
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:103: AT
				{
				mAT(); 

				}
				break;
			case 26 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:106: EX
				{
				mEX(); 

				}
				break;
			case 27 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:109: QU
				{
				mQU(); 

				}
				break;
			case 28 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:112: EQ
				{
				mEQ(); 

				}
				break;
			case 29 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:115: GET
				{
				mGET(); 

				}
				break;
			case 30 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:119: LET
				{
				mLET(); 

				}
				break;
			case 31 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:123: TITLE
				{
				mTITLE(); 

				}
				break;
			case 32 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:129: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 33 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:137: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 34 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:145: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 35 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:153: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 36 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:161: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 37 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:169: TEXT
				{
				mTEXT(); 

				}
				break;
			case 38 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:174: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 39 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:185: OLIST
				{
				mOLIST(); 

				}
				break;
			case 40 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:191: ULIST
				{
				mULIST(); 

				}
				break;
			case 41 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:197: TLIST
				{
				mTLIST(); 

				}
				break;
			case 42 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:203: CODEBLOCK
				{
				mCODEBLOCK(); 

				}
				break;
			case 43 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:213: LINK
				{
				mLINK(); 

				}
				break;
			case 44 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:218: IMG
				{
				mIMG(); 

				}
				break;
			case 45 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:222: TABLE
				{
				mTABLE(); 

				}
				break;
			case 46 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:228: L
				{
				mL(); 

				}
				break;
			case 47 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:230: C
				{
				mC(); 

				}
				break;
			case 48 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:232: R
				{
				mR(); 

				}
				break;
			case 49 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:234: HTTP
				{
				mHTTP(); 

				}
				break;
			case 50 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:239: HTTPS
				{
				mHTTPS(); 

				}
				break;
			case 51 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:245: DOTCOM
				{
				mDOTCOM(); 

				}
				break;
			case 52 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:252: VAR
				{
				mVAR(); 

				}
				break;
			case 53 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:256: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 54 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:264: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 55 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:270: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 56 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:278: WS
				{
				mWS(); 

				}
				break;
			case 57 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:281: STR
				{
				mSTR(); 

				}
				break;
			case 58 :
				// D:\\Documenti\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:285: STRING
				{
				mSTRING(); 

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
			return "298:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\1\46\3\uffff\1\50\5\uffff\1\53\1\55\1\uffff\1\57\1\61\1\63\2"+
		"\uffff\1\65\1\67\2\uffff\1\70\5\42\1\104\1\106\1\42\1\110\1\42\1\uffff"+
		"\1\112\12\uffff\1\114\13\uffff\12\42\1\uffff\1\42\1\uffff\1\42\1\uffff"+
		"\1\42\3\uffff\14\42\1\150\2\42\1\153\12\42\1\167\1\uffff\1\42\1\172\1"+
		"\uffff\1\173\1\174\6\42\1\u0083\1\u0084\1\42\2\uffff\1\42\3\uffff\1\u0087"+
		"\5\42\2\uffff\1\42\2\uffff\1\u008e\5\42\1\uffff\1\u0094\4\42\1\uffff\1"+
		"\u0099\2\42\1\u009c\1\uffff\1\u009d\1\u009e\3\uffff";
	static final String DFA21_eofS =
		"\u009f\uffff";
	static final String DFA21_minS =
		"\1\11\1\60\3\uffff\1\0\5\uffff\2\75\1\uffff\1\52\1\176\1\75\2\uffff\1"+
		"\137\1\52\2\uffff\1\0\1\141\1\163\3\154\2\60\1\155\1\60\1\164\1\uffff"+
		"\1\56\12\uffff\1\52\13\uffff\1\164\1\170\1\151\1\142\1\151\1\163\1\157"+
		"\2\151\1\144\1\uffff\1\156\1\uffff\1\147\1\uffff\1\164\3\uffff\1\154\1"+
		"\164\1\163\1\154\1\164\1\151\1\163\1\143\2\163\1\145\1\153\1\60\1\160"+
		"\1\145\1\60\1\164\1\145\1\154\1\164\1\151\1\163\1\153\2\164\1\142\1\60"+
		"\1\uffff\1\72\1\60\1\uffff\2\60\1\145\1\154\1\164\1\151\1\164\1\161\2"+
		"\60\1\154\2\uffff\1\72\3\uffff\1\60\1\145\1\154\1\164\1\151\1\165\2\uffff"+
		"\1\157\2\uffff\1\60\1\145\1\154\1\164\1\157\1\143\1\uffff\1\60\1\145\1"+
		"\154\1\164\1\153\1\uffff\1\60\2\145\1\60\1\uffff\2\60\3\uffff";
	static final String DFA21_maxS =
		"\1\176\1\143\3\uffff\1\uffff\5\uffff\2\75\1\uffff\1\52\1\176\1\75\2\uffff"+
		"\1\137\1\57\2\uffff\1\uffff\1\154\1\164\3\154\2\172\1\155\1\172\1\164"+
		"\1\uffff\1\145\12\uffff\1\52\13\uffff\1\164\1\170\1\151\1\142\1\151\1"+
		"\164\1\157\2\151\1\144\1\uffff\1\156\1\uffff\1\147\1\uffff\1\164\3\uffff"+
		"\1\154\1\164\1\163\1\154\1\164\1\151\1\164\1\143\2\163\1\145\1\153\1\172"+
		"\1\160\1\145\1\172\1\164\1\145\1\154\1\164\1\151\1\164\1\153\2\164\1\142"+
		"\1\172\1\uffff\1\163\1\172\1\uffff\2\172\1\145\1\154\1\164\1\151\1\164"+
		"\1\161\2\172\1\154\2\uffff\1\72\3\uffff\1\172\1\145\1\154\1\164\1\151"+
		"\1\165\2\uffff\1\157\2\uffff\1\172\1\145\1\154\1\164\1\157\1\143\1\uffff"+
		"\1\172\1\145\1\154\1\164\1\153\1\uffff\1\172\2\145\1\172\1\uffff\2\172"+
		"\3\uffff";
	static final String DFA21_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15\3\uffff"+
		"\1\24\1\25\2\uffff\1\31\1\32\13\uffff\1\64\1\uffff\1\70\1\63\1\1\1\66"+
		"\1\5\1\71\1\36\1\13\1\35\1\14\1\uffff\1\16\1\21\1\23\1\22\1\34\1\26\1"+
		"\27\1\67\1\30\1\33\1\72\12\uffff\1\57\1\uffff\1\56\1\uffff\1\60\1\uffff"+
		"\1\65\1\20\1\17\33\uffff\1\54\2\uffff\1\45\13\uffff\1\53\1\61\1\uffff"+
		"\1\37\1\51\1\55\6\uffff\1\47\1\50\1\uffff\1\62\1\40\6\uffff\1\41\5\uffff"+
		"\1\42\4\uffff\1\43\2\uffff\1\52\1\44\1\46";
	static final String DFA21_specialS =
		"\5\uffff\1\0\21\uffff\1\1\u0087\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\26\1\27\1\15\3\uffff\1\22\1\5\1\6"+
			"\1\16\1\uffff\1\2\1\uffff\1\1\1\24\12\43\1\4\1\3\1\13\1\20\1\14\1\uffff"+
			"\1\25\32\42\1\7\1\uffff\1\10\1\21\1\23\1\uffff\1\42\1\32\1\35\4\42\1"+
			"\41\1\37\2\42\1\36\2\42\1\33\2\42\1\40\1\31\1\30\1\34\5\42\1\11\1\uffff"+
			"\1\12\1\17",
			"\12\47\51\uffff\1\45",
			"",
			"",
			"",
			"\42\51\1\uffff\5\51\1\uffff\uffd7\51",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\54",
			"",
			"\1\56",
			"\1\60",
			"\1\62",
			"",
			"",
			"\1\64",
			"\1\66\4\uffff\1\66",
			"",
			"",
			"\52\71\1\uffff\60\71\1\uffff\1\71\1\uffff\uffa2\71",
			"\1\75\3\uffff\1\73\3\uffff\1\72\2\uffff\1\74",
			"\1\77\1\76",
			"\1\100",
			"\1\101",
			"\1\102",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\103\13\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\105\21\42",
			"\1\107",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\111",
			"",
			"\1\47\1\uffff\12\43\13\uffff\1\47\37\uffff\1\47",
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
			"\1\113",
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
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\123\1\122",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"",
			"\1\131",
			"",
			"\1\132",
			"",
			"",
			"",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\142\1\141",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\151",
			"\1\152",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\162\1\161",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\170\70\uffff\1\171",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0085",
			"",
			"",
			"\1\u0086",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"",
			"",
			"\1\u008d",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u009a",
			"\1\u009b",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
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
			return "1:1: Tokens : ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | HTTP | HTTPS | DOTCOM | VAR | INTEGER | FLOAT | COMMENT | WS | STR | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_5 = input.LA(1);
						s = -1;
						if ( ((LA21_5 >= '\u0000' && LA21_5 <= '!')||(LA21_5 >= '#' && LA21_5 <= '\'')||(LA21_5 >= ')' && LA21_5 <= '\uFFFF')) ) {s = 41;}
						else s = 40;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_23 = input.LA(1);
						s = -1;
						if ( ((LA21_23 >= '\u0000' && LA21_23 <= ')')||(LA21_23 >= '+' && LA21_23 <= 'Z')||LA21_23=='\\'||(LA21_23 >= '^' && LA21_23 <= '\uFFFF')) ) {s = 57;}
						else s = 56;
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
