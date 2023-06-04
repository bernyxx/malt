// $ANTLR 3.5.1 C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g 2023-06-05 00:10:31

	package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MaltLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g"; }

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:11:7: ( 'C' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:11:9: 'C'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:12:7: ( 'C++' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:12:9: 'C++'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:13:7: ( 'Java' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:13:9: 'Java'
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
	// $ANTLR end "T__66"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:202:33: ( '0' .. '9' )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:205:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:209:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '*' )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:210:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:211:9: OCTAL_ESC
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:216:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:217:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:218:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:223:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:227:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:230:7: ( '0' .. '9' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:4: ( '.' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:231:6: '.'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:4: ( ',' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:232:5: ','
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:4: ( ';' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:233:6: ';'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:4: ( ':' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:234:5: ':'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:4: ( '(' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:235:6: '('
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:4: ( ')' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:236:6: ')'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:5: ( '[' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:237:7: '['
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:5: ( ']' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:238:7: ']'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:5: ( '{' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:239:7: '{'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:5: ( '}' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:240:7: '}'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:5: ( '<' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:241:7: '<'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:5: ( '>' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:242:7: '>'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:4: ( '#' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:243:6: '#'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:5: ( '*' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:244:7: '*'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:7: ( '**' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:245:9: '**'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:9: ( '***' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:246:11: '***'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:5: ( '~~' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:247:7: '~~'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:5: ( '==' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:248:7: '=='
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:7: ( '~' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:249:9: '~'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:7: ( '^' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:250:9: '^'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:7: ( '\\'' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:251:9: '\\''
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:11: ( '\\'\\'\\'' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:252:13: '\\'\\'\\''
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:8: ( '___' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:253:10: '___'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:4: ( '/' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:254:6: '/'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:4: ( '@' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:255:6: '@'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:4: ( '!' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:256:6: '!'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:4: ( '\"' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:257:6: '\"'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:4: ( '=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:258:6: '='
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:5: ( '>=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:259:7: '>='
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:5: ( '<=' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:260:7: '<='
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:7: ( 'title' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:262:9: 'title'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:9: ( 'stitle' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:263:11: 'stitle'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:9: ( 'sstitle' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:264:11: 'sstitle'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:9: ( 'ssstitle' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:265:11: 'ssstitle'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:9: ( 'sssstitle' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:266:11: 'sssstitle'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:9: ( 'ssssstitle' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:267:11: 'ssssstitle'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:6: ( 'text' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:268:8: 'text'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:12: ( 'blockquote' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:269:14: 'blockquote'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:7: ( 'olist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:270:9: 'olist'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:7: ( 'ulist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:271:9: 'ulist'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:7: ( 'tlist' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:272:9: 'tlist'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:7: ( 'table' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:273:9: 'table'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:3: ( 'l' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:274:5: 'l'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:3: ( 'c' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:275:5: 'c'
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:3: ( 'r' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:276:5: 'r'
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

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:5: ( ( LETTER )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:7: ( LETTER )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:278:7: ( LETTER )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:9: ( ( DIGIT )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:11: ( DIGIT )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:280:11: ( DIGIT )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:4: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:6: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:282:20: ( LETTER | DIGIT | '_' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:9: ( DIGIT )+
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:285:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:13: ( DIGIT )+
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:286:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:287:9: ( DIGIT )+
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:291:29: '\\r'
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:14: ( options {greedy=false; } : . )*
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
							// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:292:42: .
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:295:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:
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
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\\') ) {
					alt20=1;
				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:302:27: ~ ( '\\\\' | '\"' )
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:6: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				alt21=1;
			}
			else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:304:25: ~ ( '\\'' | '\\\\' )
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
		// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:8: ( T__64 | T__65 | T__66 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | BLOCKCODE | HRULE | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | TABLE | L | C | R | VAR | INTEGER | ID | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt22=56;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:10: T__64
				{
				mT__64(); 

				}
				break;
			case 2 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:16: T__65
				{
				mT__65(); 

				}
				break;
			case 3 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:22: T__66
				{
				mT__66(); 

				}
				break;
			case 4 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:28: DO
				{
				mDO(); 

				}
				break;
			case 5 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:31: CM
				{
				mCM(); 

				}
				break;
			case 6 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:34: SE
				{
				mSE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:37: CL
				{
				mCL(); 

				}
				break;
			case 8 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:40: LP
				{
				mLP(); 

				}
				break;
			case 9 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:43: RP
				{
				mRP(); 

				}
				break;
			case 10 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:46: LSB
				{
				mLSB(); 

				}
				break;
			case 11 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:50: RSB
				{
				mRSB(); 

				}
				break;
			case 12 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:54: LCB
				{
				mLCB(); 

				}
				break;
			case 13 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:58: RCB
				{
				mRCB(); 

				}
				break;
			case 14 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:62: LAB
				{
				mLAB(); 

				}
				break;
			case 15 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:66: RAB
				{
				mRAB(); 

				}
				break;
			case 16 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:70: HA
				{
				mHA(); 

				}
				break;
			case 17 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:73: IT
				{
				mIT(); 

				}
				break;
			case 18 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:76: BOLD
				{
				mBOLD(); 

				}
				break;
			case 19 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:81: ITBOLD
				{
				mITBOLD(); 

				}
				break;
			case 20 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:88: ST
				{
				mST(); 

				}
				break;
			case 21 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:91: HL
				{
				mHL(); 

				}
				break;
			case 22 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:94: SUBS
				{
				mSUBS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:99: SUPS
				{
				mSUPS(); 

				}
				break;
			case 24 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:104: CODE
				{
				mCODE(); 

				}
				break;
			case 25 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:109: BLOCKCODE
				{
				mBLOCKCODE(); 

				}
				break;
			case 26 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:119: HRULE
				{
				mHRULE(); 

				}
				break;
			case 27 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:125: SL
				{
				mSL(); 

				}
				break;
			case 28 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:128: AT
				{
				mAT(); 

				}
				break;
			case 29 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:131: EX
				{
				mEX(); 

				}
				break;
			case 30 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:134: QU
				{
				mQU(); 

				}
				break;
			case 31 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:137: EQ
				{
				mEQ(); 

				}
				break;
			case 32 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:140: GET
				{
				mGET(); 

				}
				break;
			case 33 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:144: LET
				{
				mLET(); 

				}
				break;
			case 34 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:148: TITLE
				{
				mTITLE(); 

				}
				break;
			case 35 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:154: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 36 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:162: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 37 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:170: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 38 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:178: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 39 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:186: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 40 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:194: TEXT
				{
				mTEXT(); 

				}
				break;
			case 41 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:199: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 42 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:210: OLIST
				{
				mOLIST(); 

				}
				break;
			case 43 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:216: ULIST
				{
				mULIST(); 

				}
				break;
			case 44 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:222: TLIST
				{
				mTLIST(); 

				}
				break;
			case 45 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:228: TABLE
				{
				mTABLE(); 

				}
				break;
			case 46 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:234: L
				{
				mL(); 

				}
				break;
			case 47 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:236: C
				{
				mC(); 

				}
				break;
			case 48 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:238: R
				{
				mR(); 

				}
				break;
			case 49 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:240: VAR
				{
				mVAR(); 

				}
				break;
			case 50 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:244: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 51 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:252: ID
				{
				mID(); 

				}
				break;
			case 52 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:255: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 53 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:261: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 54 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:269: WS
				{
				mWS(); 

				}
				break;
			case 55 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:272: STRING
				{
				mSTRING(); 

				}
				break;
			case 56 :
				// C:\\Users\\Martina\\Documents\\UNIBG\\2022-23\\PRIMO SEMESTRE\\Linguaggi formali e compilatori\\progetto\\Github\\malt\\MaltProject\\src\\compilerPackage\\Malt.g:1:279: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA22 dfa22 = new DFA22(this);
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
			return "284:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\1\uffff\1\46\1\52\1\53\11\uffff\1\56\1\60\1\uffff\1\62\1\64\1\66\1\uffff"+
		"\1\70\1\uffff\1\74\2\uffff\1\75\5\52\1\110\1\111\1\112\1\52\1\113\3\uffff"+
		"\1\52\1\uffff\1\52\7\uffff\1\116\10\uffff\1\50\4\uffff\11\52\4\uffff\1"+
		"\52\2\uffff\1\133\12\52\1\147\1\uffff\1\52\1\151\11\52\1\uffff\1\164\1"+
		"\uffff\1\165\1\166\6\52\1\175\1\176\3\uffff\1\177\5\52\3\uffff\1\u0085"+
		"\4\52\1\uffff\1\u008a\3\52\1\uffff\1\u008e\2\52\1\uffff\1\u0091\1\u0092"+
		"\2\uffff";
	static final String DFA22_eofS =
		"\u0093\uffff";
	static final String DFA22_minS =
		"\1\11\1\53\2\60\11\uffff\2\75\1\uffff\1\52\1\176\1\75\1\uffff\1\0\1\60"+
		"\1\52\2\uffff\1\0\11\60\1\56\3\uffff\1\60\1\uffff\1\60\7\uffff\1\52\10"+
		"\uffff\1\137\4\uffff\11\60\4\uffff\1\60\2\uffff\14\60\1\uffff\13\60\1"+
		"\uffff\1\60\1\uffff\12\60\3\uffff\6\60\3\uffff\5\60\1\uffff\4\60\1\uffff"+
		"\3\60\1\uffff\2\60\2\uffff";
	static final String DFA22_maxS =
		"\1\176\2\172\1\71\11\uffff\2\75\1\uffff\1\52\1\176\1\75\1\uffff\1\uffff"+
		"\1\172\1\57\2\uffff\1\uffff\11\172\1\145\3\uffff\1\172\1\uffff\1\172\7"+
		"\uffff\1\52\10\uffff\1\137\4\uffff\11\172\4\uffff\1\172\2\uffff\14\172"+
		"\1\uffff\13\172\1\uffff\1\172\1\uffff\12\172\3\uffff\6\172\3\uffff\5\172"+
		"\1\uffff\4\172\1\uffff\3\172\1\uffff\2\172\2\uffff";
	static final String DFA22_acceptS =
		"\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\uffff\1\20\3\uffff"+
		"\1\27\3\uffff\1\34\1\35\13\uffff\1\66\1\2\1\1\1\uffff\1\63\1\uffff\1\61"+
		"\1\4\1\64\1\41\1\16\1\40\1\17\1\uffff\1\21\1\24\1\26\1\25\1\37\1\31\1"+
		"\30\1\70\1\uffff\1\65\1\33\1\36\1\67\11\uffff\1\56\1\57\1\60\1\62\1\uffff"+
		"\1\23\1\22\14\uffff\1\32\13\uffff\1\3\1\uffff\1\50\12\uffff\1\42\1\54"+
		"\1\55\6\uffff\1\52\1\53\1\43\5\uffff\1\44\4\uffff\1\45\3\uffff\1\46\2"+
		"\uffff\1\47\1\51";
	static final String DFA22_specialS =
		"\24\uffff\1\0\4\uffff\1\1\171\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\30\1\31\1\17\3\uffff\1\24\1\7\1\10"+
			"\1\20\1\uffff\1\4\1\uffff\1\3\1\26\12\43\1\6\1\5\1\15\1\22\1\16\1\uffff"+
			"\1\27\2\42\1\1\6\42\1\2\20\42\1\11\1\uffff\1\12\1\23\1\25\1\uffff\1\42"+
			"\1\34\1\40\10\42\1\37\2\42\1\35\2\42\1\41\1\33\1\32\1\36\5\42\1\13\1"+
			"\uffff\1\14\1\21",
			"\1\45\4\uffff\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\51\31\47",
			"\12\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\57",
			"",
			"\1\61",
			"\1\63",
			"\1\65",
			"",
			"\47\71\1\67\uffd8\71",
			"\12\50\7\uffff\32\50\4\uffff\1\72\1\uffff\32\50",
			"\1\73\4\uffff\1\73",
			"",
			"",
			"\0\76",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\102\3\47\1\100\3\47\1\77"+
			"\2\47\1\101\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\104\1\103\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\105\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\106\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\107\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\1\54\1\uffff\12\43\13\uffff\1\54\37\uffff\1\54",
			"",
			"",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\25\47\1\114\4\47",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\120\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\27\47\1\121\2\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\122\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\47\1\123\30\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\124\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\126\1\125\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\127\13\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\130\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\131\21\47",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\132\31\47",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\134\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\135\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\136\7\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\137\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\140\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\141\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\143\1\142\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\2\47\1\144\27\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\145\7\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\146\7\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\150\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\152\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\153\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\154\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\155\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\156\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\160\1\157\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\12\47\1\161\17\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\162\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\163\6\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\167\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\170\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\171\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\172\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\173\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\20\47\1\174\11\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"",
			"",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\u0080\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\u0081\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\u0082\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\u0083\21\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\24\47\1\u0084\5\47",
			"",
			"",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\u0086\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\u0087\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\u0088\6\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\u0089\13\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\u008b\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\13\47\1\u008c\16\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\23\47\1\u008d\6\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\u008f\25\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\u0090\25\47",
			"",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\12\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__64 | T__65 | T__66 | DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | BLOCKCODE | HRULE | SL | AT | EX | QU | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | TABLE | L | C | R | VAR | INTEGER | ID | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_20 = input.LA(1);
						s = -1;
						if ( (LA22_20=='\'') ) {s = 55;}
						else if ( ((LA22_20 >= '\u0000' && LA22_20 <= '&')||(LA22_20 >= '(' && LA22_20 <= '\uFFFF')) ) {s = 57;}
						else s = 56;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_25 = input.LA(1);
						s = -1;
						if ( ((LA22_25 >= '\u0000' && LA22_25 <= '\uFFFF')) ) {s = 62;}
						else s = 61;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
