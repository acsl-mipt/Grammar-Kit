/* The following code was generated by JFlex 1.4.3 on 7/22/12 9:29 PM */

package org.intellij.grammar.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import org.intellij.grammar.psi.BnfTypes;
import static org.intellij.grammar.BnfParserDefinition.BNF_LINE_COMMENT;
import static org.intellij.grammar.BnfParserDefinition.BNF_BLOCK_COMMENT;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/22/12 9:29 PM from the specification file
 * <tt>/ideadev/tools/lexer/../../persistence/sql-dialects/grammars.backlog/_BnfLexer.flex</tt>
 */
public class _BnfLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\35\1\20"+
    "\3\0\1\34\1\17\1\22\1\23\1\5\1\32\3\0\1\4\1\14"+
    "\11\7\1\30\1\21\1\11\1\31\1\12\1\33\1\0\6\13\24\6"+
    "\1\26\1\16\1\27\1\0\1\10\1\0\6\13\16\6\1\6\2\6"+
    "\1\15\2\6\1\24\1\36\1\25\54\0\1\6\12\0\1\6\4\0"+
    "\1\6\5\0\27\6\1\0\37\6\1\0\u013f\6\31\0\162\6\4\0"+
    "\14\6\16\0\5\6\11\0\1\6\213\0\1\6\13\0\1\6\1\0"+
    "\3\6\1\0\1\6\1\0\24\6\1\0\54\6\1\0\46\6\1\0"+
    "\5\6\4\0\202\6\10\0\105\6\1\0\46\6\2\0\2\6\6\0"+
    "\20\6\41\0\46\6\2\0\1\6\7\0\47\6\110\0\33\6\5\0"+
    "\3\6\56\0\32\6\5\0\13\6\25\0\12\7\4\0\2\6\1\0"+
    "\143\6\1\0\1\6\17\0\2\6\7\0\2\6\12\7\3\6\2\0"+
    "\1\6\20\0\1\6\1\0\36\6\35\0\3\6\60\0\46\6\13\0"+
    "\1\6\u0152\0\66\6\3\0\1\6\22\0\1\6\7\0\12\6\4\0"+
    "\12\7\25\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6\1\0"+
    "\1\6\3\0\4\6\3\0\1\6\36\0\2\6\1\0\3\6\4\0"+
    "\12\7\2\6\23\0\6\6\4\0\2\6\2\0\26\6\1\0\7\6"+
    "\1\0\2\6\1\0\2\6\1\0\2\6\37\0\4\6\1\0\1\6"+
    "\7\0\12\7\2\0\3\6\20\0\11\6\1\0\3\6\1\0\26\6"+
    "\1\0\7\6\1\0\2\6\1\0\5\6\3\0\1\6\22\0\1\6"+
    "\17\0\2\6\4\0\12\7\25\0\10\6\2\0\2\6\2\0\26\6"+
    "\1\0\7\6\1\0\2\6\1\0\5\6\3\0\1\6\36\0\2\6"+
    "\1\0\3\6\4\0\12\7\1\0\1\6\21\0\1\6\1\0\6\6"+
    "\3\0\3\6\1\0\4\6\3\0\2\6\1\0\1\6\1\0\2\6"+
    "\3\0\2\6\3\0\3\6\3\0\10\6\1\0\3\6\55\0\11\7"+
    "\25\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0\5\6"+
    "\46\0\2\6\4\0\12\7\25\0\10\6\1\0\3\6\1\0\27\6"+
    "\1\0\12\6\1\0\5\6\3\0\1\6\40\0\1\6\1\0\2\6"+
    "\4\0\12\7\25\0\10\6\1\0\3\6\1\0\27\6\1\0\20\6"+
    "\46\0\2\6\4\0\12\7\25\0\22\6\3\0\30\6\1\0\11\6"+
    "\1\0\1\6\2\0\7\6\72\0\60\6\1\0\2\6\14\0\7\6"+
    "\11\0\12\7\47\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6"+
    "\2\0\1\6\6\0\4\6\1\0\7\6\1\0\3\6\1\0\1\6"+
    "\1\0\1\6\2\0\2\6\1\0\4\6\1\0\2\6\11\0\1\6"+
    "\2\0\5\6\1\0\1\6\11\0\12\7\2\0\2\6\42\0\1\6"+
    "\37\0\12\7\26\0\10\6\1\0\42\6\35\0\4\6\164\0\42\6"+
    "\1\0\5\6\1\0\2\6\25\0\12\7\6\0\6\6\112\0\46\6"+
    "\12\0\51\6\7\0\132\6\5\0\104\6\5\0\122\6\6\0\7\6"+
    "\1\0\77\6\1\0\1\6\1\0\4\6\2\0\7\6\1\0\1\6"+
    "\1\0\4\6\2\0\47\6\1\0\1\6\1\0\4\6\2\0\37\6"+
    "\1\0\1\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6"+
    "\2\0\7\6\1\0\7\6\1\0\27\6\1\0\37\6\1\0\1\6"+
    "\1\0\4\6\2\0\7\6\1\0\47\6\1\0\23\6\16\0\11\7"+
    "\56\0\125\6\14\0\u026c\6\2\0\10\6\12\0\32\6\5\0\113\6"+
    "\25\0\15\6\1\0\4\6\16\0\22\6\16\0\22\6\16\0\15\6"+
    "\1\0\3\6\17\0\64\6\43\0\1\6\4\0\1\6\3\0\12\7"+
    "\46\0\12\7\6\0\130\6\10\0\51\6\127\0\35\6\51\0\12\7"+
    "\36\6\2\0\5\6\u038b\0\154\6\224\0\234\6\4\0\132\6\6\0"+
    "\26\6\2\0\6\6\2\0\46\6\2\0\6\6\2\0\10\6\1\0"+
    "\1\6\1\0\1\6\1\0\1\6\1\0\37\6\2\0\65\6\1\0"+
    "\7\6\1\0\1\6\3\0\3\6\1\0\7\6\3\0\4\6\2\0"+
    "\6\6\4\0\15\6\5\0\3\6\1\0\7\6\164\0\1\6\15\0"+
    "\1\6\202\0\1\6\4\0\1\6\2\0\12\6\1\0\1\6\3\0"+
    "\5\6\6\0\1\6\1\0\1\6\1\0\1\6\1\0\4\6\1\0"+
    "\3\6\1\0\7\6\3\0\3\6\5\0\5\6\u0ebb\0\2\6\52\0"+
    "\5\6\5\0\2\6\4\0\126\6\6\0\3\6\1\0\132\6\1\0"+
    "\4\6\5\0\50\6\4\0\136\6\21\0\30\6\70\0\20\6\u0200\0"+
    "\u19b6\6\112\0\u51a6\6\132\0\u048d\6\u0773\0\u2ba4\6\u215c\0\u012e\6\2\0"+
    "\73\6\225\0\7\6\14\0\5\6\5\0\1\6\1\0\12\6\1\0"+
    "\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0"+
    "\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\14\6\164\0"+
    "\5\6\1\0\207\6\23\0\12\7\7\0\32\6\6\0\32\6\13\0"+
    "\131\6\3\0\6\6\2\0\6\6\2\0\6\6\2\0\3\6\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\2\1"+
    "\1\5\2\1\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\1\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\0\1\25\1\26\2\0\1\27\2\0"+
    "\1\24\1\4\1\5\1\30\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[41];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\135\0\37\0\174\0\233\0\272"+
    "\0\331\0\370\0\u0117\0\u0136\0\37\0\37\0\37\0\37"+
    "\0\37\0\37\0\37\0\u0155\0\37\0\37\0\37\0\37"+
    "\0\37\0\37\0\u0174\0\u0193\0\u01b2\0\37\0\37\0\u01d1"+
    "\0\u01f0\0\37\0\u020f\0\u022e\0\u024d\0\37\0\u01d1\0\37"+
    "\0\37";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[41];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\6\1\12\1\6\1\2\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\40\0\3\3\37\0"+
    "\1\33\1\34\37\0\3\6\2\0\3\6\30\0\1\7"+
    "\4\0\1\7\22\0\11\35\1\36\1\0\24\35\12\0"+
    "\1\37\33\0\1\7\4\0\1\7\1\40\21\0\1\13"+
    "\2\0\13\13\1\41\1\42\17\13\1\14\2\0\13\14"+
    "\1\43\1\14\1\42\16\14\30\0\1\44\6\0\2\33"+
    "\1\0\34\33\5\34\1\45\31\34\11\35\1\0\1\46"+
    "\24\35\7\0\1\47\3\0\2\47\22\0\37\13\37\14"+
    "\31\0\1\50\5\0\4\34\1\51\1\45\31\34";

  private static int [] zzUnpackTrans() {
    int [] result = new int[620];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\7\1\7\11\1\1\6\11"+
    "\2\1\1\0\2\11\2\0\1\11\2\0\1\1\1\11"+
    "\1\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[41];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _BnfLexer() {
    this((java.io.Reader)null);
  }


  public _BnfLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _BnfLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1260) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_OR;
          }
        case 25: break;
        case 15: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_OPT;
          }
        case 26: break;
        case 24: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_IS;
          }
        case 27: break;
        case 13: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_EQ;
          }
        case 28: break;
        case 20: 
          { yybegin(YYINITIAL); return BNF_BLOCK_COMMENT;
          }
        case 29: break;
        case 12: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_RIGHT_BRACKET;
          }
        case 30: break;
        case 22: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_EXTERNAL_END;
          }
        case 31: break;
        case 11: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LEFT_BRACKET;
          }
        case 32: break;
        case 17: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_NOT;
          }
        case 33: break;
        case 2: 
          { yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 34: break;
        case 23: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_STRING;
          }
        case 35: break;
        case 4: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ID;
          }
        case 36: break;
        case 16: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_AND;
          }
        case 37: break;
        case 5: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_NUMBER;
          }
        case 38: break;
        case 10: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_RIGHT_BRACE;
          }
        case 39: break;
        case 8: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_RIGHT_PAREN;
          }
        case 40: break;
        case 3: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_ZEROMORE;
          }
        case 41: break;
        case 21: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_EXTERNAL_START;
          }
        case 42: break;
        case 14: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OP_ONEMORE;
          }
        case 43: break;
        case 9: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LEFT_BRACE;
          }
        case 44: break;
        case 7: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LEFT_PAREN;
          }
        case 45: break;
        case 6: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_SEMICOLON;
          }
        case 46: break;
        case 1: 
          { yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 47: break;
        case 19: 
          { yybegin(YYINITIAL); return BNF_LINE_COMMENT;
          }
        case 48: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
