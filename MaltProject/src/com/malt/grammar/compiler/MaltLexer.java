// $ANTLR 3.5.1 D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g 2023-11-20 16:07:29

	package com.malt.grammar.compiler;


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
	@Override public String getGrammarFileName() { return "D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g"; }

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:332:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:332:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:332:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:332:33: ( '0' .. '9' )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:335:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:339:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '%' | '\\\"' | '\\'' | '\\\\' | '*' ) | UNICODE_ESC | OCTAL_ESC )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:339:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '%' | '\\\"' | '\\'' | '\\\\' | '*' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:340:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:341:9: OCTAL_ESC
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:346:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:346:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:347:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:348:9: '\\\\' ( '0' .. '7' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:353:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:353:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:357:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:360:7: ( '0' .. '9' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:362:4: ( '.' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:362:6: '.'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:363:4: ( ',' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:363:5: ','
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:364:4: ( ';' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:364:6: ';'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:365:4: ( ':' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:365:5: ':'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:366:4: ( '(' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:366:6: '('
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:367:4: ( ')' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:367:6: ')'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:368:5: ( '[' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:368:7: '['
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:369:5: ( ']' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:369:7: ']'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:370:5: ( '{' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:370:7: '{'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:371:5: ( '}' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:371:7: '}'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:372:5: ( '<' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:372:7: '<'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:373:5: ( '>' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:373:7: '>'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:374:6: ( '+' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:374:8: '+'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:375:4: ( '#' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:375:6: '#'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:376:5: ( '*' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:376:7: '*'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:377:7: ( '**' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:377:9: '**'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:378:9: ( '***' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:378:11: '***'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:379:5: ( '~~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:379:7: '~~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:380:5: ( '==' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:380:7: '=='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:381:7: ( '~' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:381:9: '~'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:382:7: ( '^' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:382:9: '^'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:383:7: ( '\\'' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:383:9: '\\''
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:384:8: ( '___' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:384:10: '___'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:385:4: ( '_' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:385:6: '_'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:386:4: ( '/' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:386:6: '/'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:387:4: ( '!' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:387:6: '!'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:388:4: ( '=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:388:6: '='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:389:5: ( '>=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:389:7: '>='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:390:5: ( '<=' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:390:7: '<='
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:392:7: ( 'title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:392:9: 'title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:393:9: ( 's1title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:393:11: 's1title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:394:9: ( 's2title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:394:11: 's2title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:395:9: ( 's3title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:395:11: 's3title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:396:9: ( 's4title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:396:11: 's4title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:397:9: ( 's5title' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:397:11: 's5title'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:398:6: ( 'text' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:398:8: 'text'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:399:12: ( 'blockquote' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:399:14: 'blockquote'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:400:7: ( 'olist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:400:9: 'olist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:401:7: ( 'ulist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:401:9: 'ulist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:402:7: ( 'tlist' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:402:9: 'tlist'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:403:11: ( 'codeblock' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:403:13: 'codeblock'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:404:6: ( 'link' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:404:8: 'link'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:405:5: ( 'img' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:405:7: 'img'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:406:7: ( 'table' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:406:9: 'table'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:407:3: ( '$l' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:407:5: '$l'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:408:3: ( '$c' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:408:5: '$c'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:409:3: ( '$r' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:409:5: '$r'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:410:9: ( 'format' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:410:11: 'format'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:411:12: ( 'formattext' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:411:14: 'formattext'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:412:5: ( 'fun' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:412:7: 'fun'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:413:5: ( 'for' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:413:7: 'for'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:414:4: ( 'in' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:414:6: 'in'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:415:7: ( 'class' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:415:9: 'class'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:416:6: ( 'list' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:416:8: 'list'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:417:5: ( '=i' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:417:7: '=i'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:418:5: ( '=l' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:418:7: '=l'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:419:8: ( 'return' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:419:10: 'return'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:424:3: ( '%g' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:424:5: '%g'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:426:3: ( '%i' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:426:5: '%i'
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:427:5: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:427:7: ( LETTER ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:427:16: ( LETTER | DIGIT | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:429:8: ( VAR ( '.' VAR )? )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:429:10: VAR ( '.' VAR )?
			{
			mVAR(); 

			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:429:14: ( '.' VAR )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:429:15: '.' VAR
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:431:9: ( ( DIGIT )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:431:11: ( DIGIT )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:431:11: ( DIGIT )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:9: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:434:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:435:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:435:13: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:435:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:435:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:436:9: ( DIGIT )+ EXPONENT
					{
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:436:9: ( DIGIT )+
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
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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

					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:440:29: '\\r'
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:441:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:441:14: ( options {greedy=false; } : . )*
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
							// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:441:42: .
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:444:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:444:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:444:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:455:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"' )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:455:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )* '\"'
			{
			match('\"'); 
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:455:15: ( ESC_SEQ |~ ( '\\\\' | '\"' | '[' | ']' | '*' ) )*
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
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:455:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:455:27: ~ ( '\\\\' | '\"' | '[' | ']' | '*' )
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
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:457:11: ( . )
			// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:457:13: .
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
		// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:8: ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | PLUS | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMAT | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | RETURN | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK )
		int alt21=65;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:10: DO
				{
				mDO(); 

				}
				break;
			case 2 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:13: CM
				{
				mCM(); 

				}
				break;
			case 3 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:16: SE
				{
				mSE(); 

				}
				break;
			case 4 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:19: CL
				{
				mCL(); 

				}
				break;
			case 5 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:22: LP
				{
				mLP(); 

				}
				break;
			case 6 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:25: RP
				{
				mRP(); 

				}
				break;
			case 7 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:28: LSB
				{
				mLSB(); 

				}
				break;
			case 8 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:32: RSB
				{
				mRSB(); 

				}
				break;
			case 9 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:36: LCB
				{
				mLCB(); 

				}
				break;
			case 10 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:40: RCB
				{
				mRCB(); 

				}
				break;
			case 11 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:44: LAB
				{
				mLAB(); 

				}
				break;
			case 12 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:48: RAB
				{
				mRAB(); 

				}
				break;
			case 13 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:52: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:57: HA
				{
				mHA(); 

				}
				break;
			case 15 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:60: IT
				{
				mIT(); 

				}
				break;
			case 16 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:63: BOLD
				{
				mBOLD(); 

				}
				break;
			case 17 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:68: ITBOLD
				{
				mITBOLD(); 

				}
				break;
			case 18 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:75: ST
				{
				mST(); 

				}
				break;
			case 19 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:78: HL
				{
				mHL(); 

				}
				break;
			case 20 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:81: SUBS
				{
				mSUBS(); 

				}
				break;
			case 21 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:86: SUPS
				{
				mSUPS(); 

				}
				break;
			case 22 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:91: CODE
				{
				mCODE(); 

				}
				break;
			case 23 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:96: HRULE
				{
				mHRULE(); 

				}
				break;
			case 24 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:102: US
				{
				mUS(); 

				}
				break;
			case 25 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:105: SL
				{
				mSL(); 

				}
				break;
			case 26 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:108: EX
				{
				mEX(); 

				}
				break;
			case 27 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:111: EQ
				{
				mEQ(); 

				}
				break;
			case 28 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:114: GET
				{
				mGET(); 

				}
				break;
			case 29 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:118: LET
				{
				mLET(); 

				}
				break;
			case 30 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:122: TITLE
				{
				mTITLE(); 

				}
				break;
			case 31 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:128: S1TITLE
				{
				mS1TITLE(); 

				}
				break;
			case 32 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:136: S2TITLE
				{
				mS2TITLE(); 

				}
				break;
			case 33 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:144: S3TITLE
				{
				mS3TITLE(); 

				}
				break;
			case 34 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:152: S4TITLE
				{
				mS4TITLE(); 

				}
				break;
			case 35 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:160: S5TITLE
				{
				mS5TITLE(); 

				}
				break;
			case 36 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:168: TEXT
				{
				mTEXT(); 

				}
				break;
			case 37 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:173: BLOCKQUOTE
				{
				mBLOCKQUOTE(); 

				}
				break;
			case 38 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:184: OLIST
				{
				mOLIST(); 

				}
				break;
			case 39 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:190: ULIST
				{
				mULIST(); 

				}
				break;
			case 40 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:196: TLIST
				{
				mTLIST(); 

				}
				break;
			case 41 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:202: CODEBLOCK
				{
				mCODEBLOCK(); 

				}
				break;
			case 42 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:212: LINK
				{
				mLINK(); 

				}
				break;
			case 43 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:217: IMG
				{
				mIMG(); 

				}
				break;
			case 44 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:221: TABLE
				{
				mTABLE(); 

				}
				break;
			case 45 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:227: L
				{
				mL(); 

				}
				break;
			case 46 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:229: C
				{
				mC(); 

				}
				break;
			case 47 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:231: R
				{
				mR(); 

				}
				break;
			case 48 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:233: FORMAT
				{
				mFORMAT(); 

				}
				break;
			case 49 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:240: FORMATTEXT
				{
				mFORMATTEXT(); 

				}
				break;
			case 50 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:251: FUN
				{
				mFUN(); 

				}
				break;
			case 51 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:255: FOR
				{
				mFOR(); 

				}
				break;
			case 52 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:259: IN
				{
				mIN(); 

				}
				break;
			case 53 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:262: CLASS
				{
				mCLASS(); 

				}
				break;
			case 54 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:268: LIST
				{
				mLIST(); 

				}
				break;
			case 55 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:273: EQI
				{
				mEQI(); 

				}
				break;
			case 56 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:277: EQL
				{
				mEQL(); 

				}
				break;
			case 57 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:281: RETURN
				{
				mRETURN(); 

				}
				break;
			case 58 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:288: VAR
				{
				mVAR(); 

				}
				break;
			case 59 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:292: DOTVAR
				{
				mDOTVAR(); 

				}
				break;
			case 60 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:299: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 61 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:307: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 62 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:313: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 63 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:321: WS
				{
				mWS(); 

				}
				break;
			case 64 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:324: STRING
				{
				mSTRING(); 

				}
				break;
			case 65 :
				// D:\\Documenti\\malt\\MaltProject\\src\\com\\malt\\grammar\\compiler\\Malt.g:1:331: ERROR_TK
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
			return "433:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\uffff\1\47\11\uffff\1\63\1\65\2\uffff\1\71\1\73\1\77\2\uffff\1\103"+
		"\1\105\1\uffff\10\114\1\46\3\114\1\141\1\uffff\1\46\22\uffff\1\146\16"+
		"\uffff\5\114\2\uffff\14\114\1\170\3\uffff\3\114\1\uffff\1\141\4\uffff"+
		"\20\114\1\u008c\1\uffff\1\u008e\1\u008f\2\114\1\u0092\14\114\1\u009f\1"+
		"\u00a0\1\uffff\1\114\2\uffff\1\114\1\u00a3\1\uffff\1\u00a4\1\u00a5\6\114"+
		"\1\u00ac\1\u00ad\1\114\1\u00af\2\uffff\2\114\3\uffff\6\114\2\uffff\1\114"+
		"\1\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\3\114"+
		"\7\uffff\4\114\1\u00c8\1\114\1\u00ca\1\uffff\1\u00cb\2\uffff";
	static final String DFA21_eofS =
		"\u00cc\uffff";
	static final String DFA21_minS =
		"\1\0\1\60\11\uffff\2\75\2\uffff\1\52\1\176\1\75\2\uffff\1\137\1\52\1\uffff"+
		"\10\56\1\143\4\56\1\uffff\1\0\22\uffff\1\52\16\uffff\5\56\2\uffff\15\56"+
		"\3\uffff\3\56\1\uffff\1\56\4\uffff\21\56\1\uffff\23\56\1\uffff\1\56\2"+
		"\uffff\2\56\1\uffff\14\56\2\uffff\2\56\3\uffff\6\56\2\uffff\1\56\1\uffff"+
		"\12\56\7\uffff\7\56\1\uffff\1\56\2\uffff";
	static final String DFA21_maxS =
		"\1\uffff\1\71\11\uffff\2\75\2\uffff\1\52\1\176\1\154\2\uffff\1\137\1\57"+
		"\1\uffff\10\172\1\162\3\172\1\145\1\uffff\1\uffff\22\uffff\1\52\16\uffff"+
		"\5\172\2\uffff\15\172\3\uffff\3\172\1\uffff\1\145\4\uffff\21\172\1\uffff"+
		"\23\172\1\uffff\1\172\2\uffff\2\172\1\uffff\14\172\2\uffff\2\172\3\uffff"+
		"\6\172\2\uffff\1\172\1\uffff\12\172\7\uffff\7\172\1\uffff\1\172\2\uffff";
	static final String DFA21_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15\1\16\3\uffff"+
		"\1\25\1\26\2\uffff\1\32\15\uffff\1\77\1\uffff\1\101\1\1\1\75\1\2\1\3\1"+
		"\4\1\5\1\6\1\7\1\10\1\11\1\12\1\35\1\13\1\34\1\14\1\15\1\16\1\uffff\1"+
		"\17\1\22\1\24\1\23\1\67\1\70\1\33\1\25\1\26\1\27\1\30\1\76\1\31\1\32\5"+
		"\uffff\1\72\1\73\15\uffff\1\55\1\56\1\57\3\uffff\1\74\1\uffff\1\77\1\100"+
		"\1\21\1\20\21\uffff\1\64\23\uffff\1\53\1\uffff\1\63\1\62\2\uffff\1\44"+
		"\14\uffff\1\52\1\66\2\uffff\1\36\1\50\1\54\6\uffff\1\46\1\47\1\uffff\1"+
		"\65\12\uffff\1\60\1\71\1\37\1\40\1\41\1\42\1\43\7\uffff\1\51\1\uffff\1"+
		"\45\1\61";
	static final String DFA21_specialS =
		"\1\1\44\uffff\1\0\u00a6\uffff}>";
	static final String[] DFA21_transitionS = {
			"\11\46\2\44\2\46\1\44\22\46\1\44\1\26\1\45\1\16\1\37\2\46\1\23\1\5\1"+
			"\6\1\17\1\15\1\2\1\46\1\1\1\25\12\43\1\4\1\3\1\13\1\21\1\14\2\46\32\42"+
			"\1\7\1\46\1\10\1\22\1\24\1\46\1\42\1\31\1\34\2\42\1\40\2\42\1\36\2\42"+
			"\1\35\2\42\1\32\2\42\1\41\1\30\1\27\1\33\5\42\1\11\1\46\1\12\1\20\uff81"+
			"\46",
			"\12\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\64",
			"",
			"",
			"\1\70",
			"\1\72",
			"\1\74\53\uffff\1\75\2\uffff\1\76",
			"",
			"",
			"\1\102",
			"\1\104\4\uffff\1\104",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\1\112\3\113"+
			"\1\110\3\113\1\107\2\113\1\111\16\113",
			"\1\115\1\uffff\1\113\1\116\1\117\1\120\1\121\1\122\4\113\7\uffff\32"+
			"\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\123\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\124\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\125\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\127\2\113\1\126\13\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\130\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\14\113\1"+
			"\131\1\132\14\113",
			"\1\134\10\uffff\1\133\5\uffff\1\135",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\16\113\1"+
			"\136\5\113\1\137\5\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\140"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\50\1\uffff\12\142\13\uffff\1\50\37\uffff\1\50",
			"",
			"\52\144\1\uffff\60\144\1\uffff\1\144\1\uffff\uffa2\144",
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
			"\1\145",
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
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\147\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\27\113\1"+
			"\150\2\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\151\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\1\113\1\152"+
			"\30\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\153\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\154\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\155\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\156\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\157\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\16\113\1"+
			"\160\13\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\161\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\162\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\3\113\1\163"+
			"\26\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\1\164\31"+
			"\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\15\113\1"+
			"\165\4\113\1\166\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\6\113\1\167"+
			"\23\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\21\113\1"+
			"\171\10\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\15\113\1"+
			"\172\14\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\173\6\113",
			"",
			"\1\50\1\uffff\12\142\13\uffff\1\50\37\uffff\1\50",
			"",
			"",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\174\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\175\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\22\113\1"+
			"\176\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\177\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\u0080\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\u0081\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\u0082\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\u0083\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\10\113\1"+
			"\u0084\21\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\2\113\1\u0085"+
			"\27\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\22\113\1"+
			"\u0086\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\22\113\1"+
			"\u0087\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u0088"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\22\113\1"+
			"\u0089\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\12\113\1"+
			"\u008a\17\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u008b\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\14\113\1"+
			"\u008d\15\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\24\113\1"+
			"\u0090\5\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u0091"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0093\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u0094"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0095\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0096\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0097\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0098\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u0099\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\12\113\1"+
			"\u009a\17\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u009b\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u009c\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\1\113\1\u009d"+
			"\30\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\22\113\1"+
			"\u009e\7\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\1\u00a1\31"+
			"\113",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\21\113\1"+
			"\u00a2\10\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00a6\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00a7\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00a8\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00a9\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00aa\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\20\113\1"+
			"\u00ab\11\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\13\113\1"+
			"\u00ae\16\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u00b0\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\15\113\1"+
			"\u00b1\14\113",
			"",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00b2"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00b3"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00b4"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00b5"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00b6"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\24\113\1"+
			"\u00b7\5\113",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\16\113\1"+
			"\u00b8\13\113",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u00b9\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\16\113\1"+
			"\u00c1\13\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\2\113\1\u00c2"+
			"\27\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00c3"+
			"\25\113",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u00c4\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\12\113\1"+
			"\u00c5\17\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\27\113\1"+
			"\u00c6\2\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\4\113\1\u00c7"+
			"\25\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\23\113\1"+
			"\u00c9\6\113",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
			"",
			"\1\115\1\uffff\12\113\7\uffff\32\113\4\uffff\1\113\1\uffff\32\113",
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
			return "1:1: Tokens : ( DO | CM | SE | CL | LP | RP | LSB | RSB | LCB | RCB | LAB | RAB | PLUS | HA | IT | BOLD | ITBOLD | ST | HL | SUBS | SUPS | CODE | HRULE | US | SL | EX | EQ | GET | LET | TITLE | S1TITLE | S2TITLE | S3TITLE | S4TITLE | S5TITLE | TEXT | BLOCKQUOTE | OLIST | ULIST | TLIST | CODEBLOCK | LINK | IMG | TABLE | L | C | R | FORMAT | FORMATTEXT | FUN | FOR | IN | CLASS | LIST | EQI | EQL | RETURN | VAR | DOTVAR | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_37 = input.LA(1);
						s = -1;
						if ( ((LA21_37 >= '\u0000' && LA21_37 <= ')')||(LA21_37 >= '+' && LA21_37 <= 'Z')||LA21_37=='\\'||(LA21_37 >= '^' && LA21_37 <= '\uFFFF')) ) {s = 100;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_0 = input.LA(1);
						s = -1;
						if ( (LA21_0=='.') ) {s = 1;}
						else if ( (LA21_0==',') ) {s = 2;}
						else if ( (LA21_0==';') ) {s = 3;}
						else if ( (LA21_0==':') ) {s = 4;}
						else if ( (LA21_0=='(') ) {s = 5;}
						else if ( (LA21_0==')') ) {s = 6;}
						else if ( (LA21_0=='[') ) {s = 7;}
						else if ( (LA21_0==']') ) {s = 8;}
						else if ( (LA21_0=='{') ) {s = 9;}
						else if ( (LA21_0=='}') ) {s = 10;}
						else if ( (LA21_0=='<') ) {s = 11;}
						else if ( (LA21_0=='>') ) {s = 12;}
						else if ( (LA21_0=='+') ) {s = 13;}
						else if ( (LA21_0=='#') ) {s = 14;}
						else if ( (LA21_0=='*') ) {s = 15;}
						else if ( (LA21_0=='~') ) {s = 16;}
						else if ( (LA21_0=='=') ) {s = 17;}
						else if ( (LA21_0=='^') ) {s = 18;}
						else if ( (LA21_0=='\'') ) {s = 19;}
						else if ( (LA21_0=='_') ) {s = 20;}
						else if ( (LA21_0=='/') ) {s = 21;}
						else if ( (LA21_0=='!') ) {s = 22;}
						else if ( (LA21_0=='t') ) {s = 23;}
						else if ( (LA21_0=='s') ) {s = 24;}
						else if ( (LA21_0=='b') ) {s = 25;}
						else if ( (LA21_0=='o') ) {s = 26;}
						else if ( (LA21_0=='u') ) {s = 27;}
						else if ( (LA21_0=='c') ) {s = 28;}
						else if ( (LA21_0=='l') ) {s = 29;}
						else if ( (LA21_0=='i') ) {s = 30;}
						else if ( (LA21_0=='$') ) {s = 31;}
						else if ( (LA21_0=='f') ) {s = 32;}
						else if ( (LA21_0=='r') ) {s = 33;}
						else if ( ((LA21_0 >= 'A' && LA21_0 <= 'Z')||LA21_0=='a'||(LA21_0 >= 'd' && LA21_0 <= 'e')||(LA21_0 >= 'g' && LA21_0 <= 'h')||(LA21_0 >= 'j' && LA21_0 <= 'k')||(LA21_0 >= 'm' && LA21_0 <= 'n')||(LA21_0 >= 'p' && LA21_0 <= 'q')||(LA21_0 >= 'v' && LA21_0 <= 'z')) ) {s = 34;}
						else if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {s = 35;}
						else if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 36;}
						else if ( (LA21_0=='\"') ) {s = 37;}
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
