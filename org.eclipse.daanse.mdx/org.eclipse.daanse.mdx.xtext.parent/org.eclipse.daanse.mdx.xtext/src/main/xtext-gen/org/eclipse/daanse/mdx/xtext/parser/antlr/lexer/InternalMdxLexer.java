package org.eclipse.daanse.mdx.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMdxLexer extends Lexer {
  public static final int LessThanSignGreaterThanSign = 27;
  public static final int PROPERTIES = 6;
  public static final int VALUE = 11;
  public static final int FROM = 16;
  public static final int LessThanSign = 44;
  public static final int WHEN = 18;
  public static final int LeftParenthesis = 34;
  public static final int DIMENSION = 7;
  public static final int ELSE = 15;
  public static final int GreaterThanSign = 46;
  public static final int RULE_ID = 49;
  public static final int RULE_QUOTED_ID = 52;
  public static final int RightParenthesis = 35;
  public static final int RULE_DIGIT = 50;
  public static final int FORMATTED_VALUE = 4;
  public static final int WHERE = 12;
  public static final int NON = 22;
  public static final int CASE = 13;
  public static final int GreaterThanSignEqualsSign = 28;
  public static final int NOT = 23;
  public static final int AS = 29;
  public static final int PlusSign = 37;
  public static final int RULE_INT = 54;
  public static final int AND = 20;
  public static final int RULE_ML_COMMENT = 56;
  public static final int THEN = 17;
  public static final int END = 21;
  public static final int XOR = 25;
  public static final int SET = 24;
  public static final int VerticalLineVerticalLine = 32;
  public static final int RULE_STRING = 55;
  public static final int MEMBER = 8;
  public static final int RULE_SL_COMMENT = 57;
  public static final int Comma = 38;
  public static final int EqualsSign = 45;
  public static final int HyphenMinus = 39;
  public static final int LessThanSignEqualsSign = 26;
  public static final int Solidus = 41;
  public static final int Colon = 42;
  public static final int RightCurlyBracket = 48;
  public static final int EOF = -1;
  public static final int EMPTY = 10;
  public static final int Apostrophe = 33;
  public static final int Asterisk = 36;
  public static final int CELL_ORDINAL = 5;
  public static final int ON = 30;
  public static final int FullStop = 40;
  public static final int OR = 31;
  public static final int RULE_WS = 58;
  public static final int LeftCurlyBracket = 47;
  public static final int RULE_ANY_OTHER = 59;
  public static final int SELECT = 9;
  public static final int WITH = 19;
  public static final int Semicolon = 43;
  public static final int RULE_LETTER = 53;
  public static final int RULE_AMP_QUOTED_ID = 51;
  public static final int CELL = 14;

  // delegates
  // delegators

  public InternalMdxLexer() {
    ;
  }

  public InternalMdxLexer(CharStream input) {
    this(input, new RecognizerSharedState());
  }

  public InternalMdxLexer(CharStream input, RecognizerSharedState state) {
    super(input, state);

  }

  public String getGrammarFileName() {
    return "InternalMdxLexer.g";
  }

  // $ANTLR start "FORMATTED_VALUE"
  public final void mFORMATTED_VALUE() throws RecognitionException {
    try {
      int _type = FORMATTED_VALUE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:14:17: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'M' |
      // 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' )
      // '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
      // InternalMdxLexer.g:14:19: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'M' |
      // 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' )
      // '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' )
      {
        if (input.LA(1) == 'F' || input.LA(1) == 'f') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'D' || input.LA(1) == 'd') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        match('_');
        if (input.LA(1) == 'V' || input.LA(1) == 'v') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'U' || input.LA(1) == 'u') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "FORMATTED_VALUE"

  // $ANTLR start "CELL_ORDINAL"
  public final void mCELL_ORDINAL() throws RecognitionException {
    try {
      int _type = CELL_ORDINAL;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:16:14: ( ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' |
      // 'l' ) '_' ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n'
      // ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
      // InternalMdxLexer.g:16:16: ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' |
      // 'l' ) '_' ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n'
      // ) ( 'A' | 'a' ) ( 'L' | 'l' )
      {
        if (input.LA(1) == 'C' || input.LA(1) == 'c') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        match('_');
        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'D' || input.LA(1) == 'd') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'I' || input.LA(1) == 'i') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "CELL_ORDINAL"

  // $ANTLR start "PROPERTIES"
  public final void mPROPERTIES() throws RecognitionException {
    try {
      int _type = PROPERTIES;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:18:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' |
      // 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'E' | 'e' ) (
      // 'S' | 's' ) )
      // InternalMdxLexer.g:18:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' |
      // 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'E' | 'e' ) (
      // 'S' | 's' )
      {
        if (input.LA(1) == 'P' || input.LA(1) == 'p') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'P' || input.LA(1) == 'p') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'I' || input.LA(1) == 'i') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "PROPERTIES"

  // $ANTLR start "DIMENSION"
  public final void mDIMENSION() throws RecognitionException {
    try {
      int _type = DIMENSION;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:20:11: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' |
      // 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
      // InternalMdxLexer.g:20:13: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' |
      // 'e' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
      {
        if (input.LA(1) == 'D' || input.LA(1) == 'd') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'I' || input.LA(1) == 'i') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'I' || input.LA(1) == 'i') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "DIMENSION"

  // $ANTLR start "MEMBER"
  public final void mMEMBER() throws RecognitionException {
    try {
      int _type = MEMBER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:22:8: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' |
      // 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
      // InternalMdxLexer.g:22:10: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' |
      // 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
      {
        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'B' || input.LA(1) == 'b') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "MEMBER"

  // $ANTLR start "SELECT"
  public final void mSELECT() throws RecognitionException {
    try {
      int _type = SELECT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:24:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' |
      // 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
      // InternalMdxLexer.g:24:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' |
      // 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
      {
        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'C' || input.LA(1) == 'c') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "SELECT"

  // $ANTLR start "EMPTY"
  public final void mEMPTY() throws RecognitionException {
    try {
      int _type = EMPTY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:26:7: ( ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' |
      // 't' ) ( 'Y' | 'y' ) )
      // InternalMdxLexer.g:26:9: ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' |
      // 't' ) ( 'Y' | 'y' )
      {
        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'P' || input.LA(1) == 'p') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'Y' || input.LA(1) == 'y') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "EMPTY"

  // $ANTLR start "VALUE"
  public final void mVALUE() throws RecognitionException {
    try {
      int _type = VALUE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:28:7: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' |
      // 'u' ) ( 'E' | 'e' ) )
      // InternalMdxLexer.g:28:9: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' |
      // 'u' ) ( 'E' | 'e' )
      {
        if (input.LA(1) == 'V' || input.LA(1) == 'v') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'U' || input.LA(1) == 'u') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "VALUE"

  // $ANTLR start "WHERE"
  public final void mWHERE() throws RecognitionException {
    try {
      int _type = WHERE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:30:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' |
      // 'r' ) ( 'E' | 'e' ) )
      // InternalMdxLexer.g:30:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' |
      // 'r' ) ( 'E' | 'e' )
      {
        if (input.LA(1) == 'W' || input.LA(1) == 'w') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'H' || input.LA(1) == 'h') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "WHERE"

  // $ANTLR start "CASE"
  public final void mCASE() throws RecognitionException {
    try {
      int _type = CASE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:32:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' |
      // 'e' ) )
      // InternalMdxLexer.g:32:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' |
      // 'e' )
      {
        if (input.LA(1) == 'C' || input.LA(1) == 'c') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "CASE"

  // $ANTLR start "CELL"
  public final void mCELL() throws RecognitionException {
    try {
      int _type = CELL;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:34:6: ( ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' |
      // 'l' ) )
      // InternalMdxLexer.g:34:8: ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'L' |
      // 'l' )
      {
        if (input.LA(1) == 'C' || input.LA(1) == 'c') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "CELL"

  // $ANTLR start "ELSE"
  public final void mELSE() throws RecognitionException {
    try {
      int _type = ELSE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:36:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' |
      // 'e' ) )
      // InternalMdxLexer.g:36:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' |
      // 'e' )
      {
        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'L' || input.LA(1) == 'l') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "ELSE"

  // $ANTLR start "FROM"
  public final void mFROM() throws RecognitionException {
    try {
      int _type = FROM;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:38:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' |
      // 'm' ) )
      // InternalMdxLexer.g:38:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' |
      // 'm' )
      {
        if (input.LA(1) == 'F' || input.LA(1) == 'f') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'M' || input.LA(1) == 'm') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "FROM"

  // $ANTLR start "THEN"
  public final void mTHEN() throws RecognitionException {
    try {
      int _type = THEN;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:40:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' |
      // 'n' ) )
      // InternalMdxLexer.g:40:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' |
      // 'n' )
      {
        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'H' || input.LA(1) == 'h') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "THEN"

  // $ANTLR start "WHEN"
  public final void mWHEN() throws RecognitionException {
    try {
      int _type = WHEN;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:42:6: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' |
      // 'n' ) )
      // InternalMdxLexer.g:42:8: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' |
      // 'n' )
      {
        if (input.LA(1) == 'W' || input.LA(1) == 'w') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'H' || input.LA(1) == 'h') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "WHEN"

  // $ANTLR start "WITH"
  public final void mWITH() throws RecognitionException {
    try {
      int _type = WITH;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:44:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' |
      // 'h' ) )
      // InternalMdxLexer.g:44:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' |
      // 'h' )
      {
        if (input.LA(1) == 'W' || input.LA(1) == 'w') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'I' || input.LA(1) == 'i') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'H' || input.LA(1) == 'h') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "WITH"

  // $ANTLR start "AND"
  public final void mAND() throws RecognitionException {
    try {
      int _type = AND;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:46:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
      // InternalMdxLexer.g:46:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
      {
        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'D' || input.LA(1) == 'd') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "AND"

  // $ANTLR start "END"
  public final void mEND() throws RecognitionException {
    try {
      int _type = END;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:48:5: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
      // InternalMdxLexer.g:48:7: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
      {
        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'D' || input.LA(1) == 'd') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "END"

  // $ANTLR start "NON"
  public final void mNON() throws RecognitionException {
    try {
      int _type = NON;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:50:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
      // InternalMdxLexer.g:50:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' )
      {
        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "NON"

  // $ANTLR start "NOT"
  public final void mNOT() throws RecognitionException {
    try {
      int _type = NOT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:52:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
      // InternalMdxLexer.g:52:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
      {
        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "NOT"

  // $ANTLR start "SET"
  public final void mSET() throws RecognitionException {
    try {
      int _type = SET;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:54:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
      // InternalMdxLexer.g:54:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
      {
        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'E' || input.LA(1) == 'e') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'T' || input.LA(1) == 't') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "SET"

  // $ANTLR start "XOR"
  public final void mXOR() throws RecognitionException {
    try {
      int _type = XOR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:56:5: ( ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
      // InternalMdxLexer.g:56:7: ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' )
      {
        if (input.LA(1) == 'X' || input.LA(1) == 'x') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "XOR"

  // $ANTLR start "LessThanSignEqualsSign"
  public final void mLessThanSignEqualsSign() throws RecognitionException {
    try {
      int _type = LessThanSignEqualsSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:58:24: ( '<' '=' )
      // InternalMdxLexer.g:58:26: '<' '='
      {
        match('<');
        match('=');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "LessThanSignEqualsSign"

  // $ANTLR start "LessThanSignGreaterThanSign"
  public final void mLessThanSignGreaterThanSign() throws RecognitionException {
    try {
      int _type = LessThanSignGreaterThanSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:60:29: ( '<' '>' )
      // InternalMdxLexer.g:60:31: '<' '>'
      {
        match('<');
        match('>');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "LessThanSignGreaterThanSign"

  // $ANTLR start "GreaterThanSignEqualsSign"
  public final void mGreaterThanSignEqualsSign() throws RecognitionException {
    try {
      int _type = GreaterThanSignEqualsSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:62:27: ( '>' '=' )
      // InternalMdxLexer.g:62:29: '>' '='
      {
        match('>');
        match('=');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "GreaterThanSignEqualsSign"

  // $ANTLR start "AS"
  public final void mAS() throws RecognitionException {
    try {
      int _type = AS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:64:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
      // InternalMdxLexer.g:64:6: ( 'A' | 'a' ) ( 'S' | 's' )
      {
        if (input.LA(1) == 'A' || input.LA(1) == 'a') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'S' || input.LA(1) == 's') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "AS"

  // $ANTLR start "ON"
  public final void mON() throws RecognitionException {
    try {
      int _type = ON;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:66:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
      // InternalMdxLexer.g:66:6: ( 'O' | 'o' ) ( 'N' | 'n' )
      {
        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "ON"

  // $ANTLR start "OR"
  public final void mOR() throws RecognitionException {
    try {
      int _type = OR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:68:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
      // InternalMdxLexer.g:68:6: ( 'O' | 'o' ) ( 'R' | 'r' )
      {
        if (input.LA(1) == 'O' || input.LA(1) == 'o') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        if (input.LA(1) == 'R' || input.LA(1) == 'r') {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "OR"

  // $ANTLR start "VerticalLineVerticalLine"
  public final void mVerticalLineVerticalLine() throws RecognitionException {
    try {
      int _type = VerticalLineVerticalLine;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:70:26: ( '|' '|' )
      // InternalMdxLexer.g:70:28: '|' '|'
      {
        match('|');
        match('|');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "VerticalLineVerticalLine"

  // $ANTLR start "Apostrophe"
  public final void mApostrophe() throws RecognitionException {
    try {
      int _type = Apostrophe;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:72:12: ( '\\'' )
      // InternalMdxLexer.g:72:14: '\\''
      {
        match('\'');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Apostrophe"

  // $ANTLR start "LeftParenthesis"
  public final void mLeftParenthesis() throws RecognitionException {
    try {
      int _type = LeftParenthesis;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:74:17: ( '(' )
      // InternalMdxLexer.g:74:19: '('
      {
        match('(');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "LeftParenthesis"

  // $ANTLR start "RightParenthesis"
  public final void mRightParenthesis() throws RecognitionException {
    try {
      int _type = RightParenthesis;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:76:18: ( ')' )
      // InternalMdxLexer.g:76:20: ')'
      {
        match(')');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RightParenthesis"

  // $ANTLR start "Asterisk"
  public final void mAsterisk() throws RecognitionException {
    try {
      int _type = Asterisk;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:78:10: ( '*' )
      // InternalMdxLexer.g:78:12: '*'
      {
        match('*');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Asterisk"

  // $ANTLR start "PlusSign"
  public final void mPlusSign() throws RecognitionException {
    try {
      int _type = PlusSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:80:10: ( '+' )
      // InternalMdxLexer.g:80:12: '+'
      {
        match('+');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "PlusSign"

  // $ANTLR start "Comma"
  public final void mComma() throws RecognitionException {
    try {
      int _type = Comma;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:82:7: ( ',' )
      // InternalMdxLexer.g:82:9: ','
      {
        match(',');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Comma"

  // $ANTLR start "HyphenMinus"
  public final void mHyphenMinus() throws RecognitionException {
    try {
      int _type = HyphenMinus;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:84:13: ( '-' )
      // InternalMdxLexer.g:84:15: '-'
      {
        match('-');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "HyphenMinus"

  // $ANTLR start "FullStop"
  public final void mFullStop() throws RecognitionException {
    try {
      int _type = FullStop;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:86:10: ( '.' )
      // InternalMdxLexer.g:86:12: '.'
      {
        match('.');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "FullStop"

  // $ANTLR start "Solidus"
  public final void mSolidus() throws RecognitionException {
    try {
      int _type = Solidus;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:88:9: ( '/' )
      // InternalMdxLexer.g:88:11: '/'
      {
        match('/');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Solidus"

  // $ANTLR start "Colon"
  public final void mColon() throws RecognitionException {
    try {
      int _type = Colon;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:90:7: ( ':' )
      // InternalMdxLexer.g:90:9: ':'
      {
        match(':');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Colon"

  // $ANTLR start "Semicolon"
  public final void mSemicolon() throws RecognitionException {
    try {
      int _type = Semicolon;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:92:11: ( ';' )
      // InternalMdxLexer.g:92:13: ';'
      {
        match(';');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "Semicolon"

  // $ANTLR start "LessThanSign"
  public final void mLessThanSign() throws RecognitionException {
    try {
      int _type = LessThanSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:94:14: ( '<' )
      // InternalMdxLexer.g:94:16: '<'
      {
        match('<');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "LessThanSign"

  // $ANTLR start "EqualsSign"
  public final void mEqualsSign() throws RecognitionException {
    try {
      int _type = EqualsSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:96:12: ( '=' )
      // InternalMdxLexer.g:96:14: '='
      {
        match('=');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "EqualsSign"

  // $ANTLR start "GreaterThanSign"
  public final void mGreaterThanSign() throws RecognitionException {
    try {
      int _type = GreaterThanSign;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:98:17: ( '>' )
      // InternalMdxLexer.g:98:19: '>'
      {
        match('>');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "GreaterThanSign"

  // $ANTLR start "LeftCurlyBracket"
  public final void mLeftCurlyBracket() throws RecognitionException {
    try {
      int _type = LeftCurlyBracket;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:100:18: ( '{' )
      // InternalMdxLexer.g:100:20: '{'
      {
        match('{');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "LeftCurlyBracket"

  // $ANTLR start "RightCurlyBracket"
  public final void mRightCurlyBracket() throws RecognitionException {
    try {
      int _type = RightCurlyBracket;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:102:19: ( '}' )
      // InternalMdxLexer.g:102:21: '}'
      {
        match('}');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RightCurlyBracket"

  // $ANTLR start "RULE_ID"
  public final void mRULE_ID() throws RecognitionException {
    try {
      int _type = RULE_ID;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:104:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a'
      // .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
      // InternalMdxLexer.g:104:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a'
      // .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
      {
        // InternalMdxLexer.g:104:11: ( '^' )?
        int alt1 = 2;
        int LA1_0 = input.LA(1);

        if ((LA1_0 == '^')) {
          alt1 = 1;
        }
        switch (alt1) {
        case 1:
        // InternalMdxLexer.g:104:11: '^'
        {
          match('^');

        }
          break;

        }

        if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
            || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

        // InternalMdxLexer.g:104:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$'
        // )*
        loop2: do {
          int alt2 = 2;
          int LA2_0 = input.LA(1);

          if ((LA2_0 == '$' || (LA2_0 >= '0' && LA2_0 <= '9') || (LA2_0 >= 'A' && LA2_0 <= 'Z') || LA2_0 == '_'
              || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
            alt2 = 1;
          }

          switch (alt2) {
          case 1:
          // InternalMdxLexer.g:
          {
            if (input.LA(1) == '$' || (input.LA(1) >= '0' && input.LA(1) <= '9')
                || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
                || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
              input.consume();

            } else {
              MismatchedSetException mse = new MismatchedSetException(null, input);
              recover(mse);
              throw mse;
            }

          }
            break;

          default:
            break loop2;
          }
        } while (true);

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_ID"

  // $ANTLR start "RULE_AMP_QUOTED_ID"
  public final void mRULE_AMP_QUOTED_ID() throws RecognitionException {
    try {
      int _type = RULE_AMP_QUOTED_ID;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:106:20: ( '[&' ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID
      // )* | RULE_DIGIT ) ']' )
      // InternalMdxLexer.g:106:22: '[&' ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
      // | RULE_DIGIT ) ']'
      {
        match("[&");

        // InternalMdxLexer.g:106:27: ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )* |
        // RULE_DIGIT )
        int alt5 = 2;
        int LA5_0 = input.LA(1);

        if (((LA5_0 >= 'A' && LA5_0 <= 'Z') || (LA5_0 >= '^' && LA5_0 <= '_') || (LA5_0 >= 'a' && LA5_0 <= 'z'))) {
          alt5 = 1;
        } else if (((LA5_0 >= '0' && LA5_0 <= '9') || (LA5_0 >= '\u0660' && LA5_0 <= '\u0669')
            || (LA5_0 >= '\u06F0' && LA5_0 <= '\u06F9') || (LA5_0 >= '\u0966' && LA5_0 <= '\u096F')
            || (LA5_0 >= '\u09E6' && LA5_0 <= '\u09EF') || (LA5_0 >= '\u0A66' && LA5_0 <= '\u0A6F')
            || (LA5_0 >= '\u0AE6' && LA5_0 <= '\u0AEF') || (LA5_0 >= '\u0B66' && LA5_0 <= '\u0B6F')
            || (LA5_0 >= '\u0BE7' && LA5_0 <= '\u0BEF') || (LA5_0 >= '\u0C66' && LA5_0 <= '\u0C6F')
            || (LA5_0 >= '\u0CE6' && LA5_0 <= '\u0CEF') || (LA5_0 >= '\u0D66' && LA5_0 <= '\u0D6F')
            || (LA5_0 >= '\u0E50' && LA5_0 <= '\u0E59') || (LA5_0 >= '\u0ED0' && LA5_0 <= '\u0ED9')
            || (LA5_0 >= '\u1040' && LA5_0 <= '\u1049'))) {
          alt5 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 5, 0, input);

          throw nvae;
        }
        switch (alt5) {
        case 1:
        // InternalMdxLexer.g:106:28: RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
        {
          mRULE_ID();
          // InternalMdxLexer.g:106:36: ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
          loop4: do {
            int alt4 = 2;
            int LA4_0 = input.LA(1);

            if ((LA4_0 == '\t' || LA4_0 == ' ' || LA4_0 == '.')) {
              alt4 = 1;
            }

            switch (alt4) {
            case 1:
            // InternalMdxLexer.g:106:37: ( ' ' | '\\t' | '.' )+ RULE_ID
            {
              // InternalMdxLexer.g:106:37: ( ' ' | '\\t' | '.' )+
              int cnt3 = 0;
              loop3: do {
                int alt3 = 2;
                int LA3_0 = input.LA(1);

                if ((LA3_0 == '\t' || LA3_0 == ' ' || LA3_0 == '.')) {
                  alt3 = 1;
                }

                switch (alt3) {
                case 1:
                // InternalMdxLexer.g:
                {
                  if (input.LA(1) == '\t' || input.LA(1) == ' ' || input.LA(1) == '.') {
                    input.consume();

                  } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                  }

                }
                  break;

                default:
                  if (cnt3 >= 1)
                    break loop3;
                  EarlyExitException eee = new EarlyExitException(3, input);
                  throw eee;
                }
                cnt3++;
              } while (true);

              mRULE_ID();

            }
              break;

            default:
              break loop4;
            }
          } while (true);

        }
          break;
        case 2:
        // InternalMdxLexer.g:106:63: RULE_DIGIT
        {
          mRULE_DIGIT();

        }
          break;

        }

        match(']');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_AMP_QUOTED_ID"

  // $ANTLR start "RULE_QUOTED_ID"
  public final void mRULE_QUOTED_ID() throws RecognitionException {
    try {
      int _type = RULE_QUOTED_ID;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:108:16: ( '[' ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID
      // )* | RULE_DIGIT ) ']' )
      // InternalMdxLexer.g:108:18: '[' ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
      // | RULE_DIGIT ) ']'
      {
        match('[');
        // InternalMdxLexer.g:108:22: ( RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )* |
        // RULE_DIGIT )
        int alt8 = 2;
        int LA8_0 = input.LA(1);

        if (((LA8_0 >= 'A' && LA8_0 <= 'Z') || (LA8_0 >= '^' && LA8_0 <= '_') || (LA8_0 >= 'a' && LA8_0 <= 'z'))) {
          alt8 = 1;
        } else if (((LA8_0 >= '0' && LA8_0 <= '9') || (LA8_0 >= '\u0660' && LA8_0 <= '\u0669')
            || (LA8_0 >= '\u06F0' && LA8_0 <= '\u06F9') || (LA8_0 >= '\u0966' && LA8_0 <= '\u096F')
            || (LA8_0 >= '\u09E6' && LA8_0 <= '\u09EF') || (LA8_0 >= '\u0A66' && LA8_0 <= '\u0A6F')
            || (LA8_0 >= '\u0AE6' && LA8_0 <= '\u0AEF') || (LA8_0 >= '\u0B66' && LA8_0 <= '\u0B6F')
            || (LA8_0 >= '\u0BE7' && LA8_0 <= '\u0BEF') || (LA8_0 >= '\u0C66' && LA8_0 <= '\u0C6F')
            || (LA8_0 >= '\u0CE6' && LA8_0 <= '\u0CEF') || (LA8_0 >= '\u0D66' && LA8_0 <= '\u0D6F')
            || (LA8_0 >= '\u0E50' && LA8_0 <= '\u0E59') || (LA8_0 >= '\u0ED0' && LA8_0 <= '\u0ED9')
            || (LA8_0 >= '\u1040' && LA8_0 <= '\u1049'))) {
          alt8 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 8, 0, input);

          throw nvae;
        }
        switch (alt8) {
        case 1:
        // InternalMdxLexer.g:108:23: RULE_ID ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
        {
          mRULE_ID();
          // InternalMdxLexer.g:108:31: ( ( ' ' | '\\t' | '.' )+ RULE_ID )*
          loop7: do {
            int alt7 = 2;
            int LA7_0 = input.LA(1);

            if ((LA7_0 == '\t' || LA7_0 == ' ' || LA7_0 == '.')) {
              alt7 = 1;
            }

            switch (alt7) {
            case 1:
            // InternalMdxLexer.g:108:32: ( ' ' | '\\t' | '.' )+ RULE_ID
            {
              // InternalMdxLexer.g:108:32: ( ' ' | '\\t' | '.' )+
              int cnt6 = 0;
              loop6: do {
                int alt6 = 2;
                int LA6_0 = input.LA(1);

                if ((LA6_0 == '\t' || LA6_0 == ' ' || LA6_0 == '.')) {
                  alt6 = 1;
                }

                switch (alt6) {
                case 1:
                // InternalMdxLexer.g:
                {
                  if (input.LA(1) == '\t' || input.LA(1) == ' ' || input.LA(1) == '.') {
                    input.consume();

                  } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                  }

                }
                  break;

                default:
                  if (cnt6 >= 1)
                    break loop6;
                  EarlyExitException eee = new EarlyExitException(6, input);
                  throw eee;
                }
                cnt6++;
              } while (true);

              mRULE_ID();

            }
              break;

            default:
              break loop7;
            }
          } while (true);

        }
          break;
        case 2:
        // InternalMdxLexer.g:108:58: RULE_DIGIT
        {
          mRULE_DIGIT();

        }
          break;

        }

        match(']');

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_QUOTED_ID"

  // $ANTLR start "RULE_LETTER"
  public final void mRULE_LETTER() throws RecognitionException {
    try {
      int _type = RULE_LETTER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:110:13: ( ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' |
      // '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' |
      // '\\u0100' .. '\\u1FFF' | '\\u3040' .. '\\u318F' | '\\u3300' .. '\\u337F' |
      // '\\u3400' .. '\\u3D2D' | '\\u4E00' .. '\\u9FFF' | '\\uF900' .. '\\uFAFF' ) )
      // InternalMdxLexer.g:110:15: ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00C0'
      // .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' ..
      // '\\u1FFF' | '\\u3040' .. '\\u318F' | '\\u3300' .. '\\u337F' | '\\u3400' ..
      // '\\u3D2D' | '\\u4E00' .. '\\u9FFF' | '\\uF900' .. '\\uFAFF' )
      {
        if (input.LA(1) == '$' || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
            || (input.LA(1) >= 'a' && input.LA(1) <= 'z') || (input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')
            || (input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')
            || (input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')
            || (input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')
            || (input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')
            || (input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')
            || (input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')
            || (input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF')) {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_LETTER"

  // $ANTLR start "RULE_DIGIT"
  public final void mRULE_DIGIT() throws RecognitionException {
    try {
      // InternalMdxLexer.g:112:21: ( ( '0' .. '9' | '\\u0660' .. '\\u0669' |
      // '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' |
      // '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' |
      // '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' |
      // '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' |
      // '\\u1040' .. '\\u1049' ) )
      // InternalMdxLexer.g:112:23: ( '0' .. '9' | '\\u0660' .. '\\u0669' | '\\u06F0'
      // .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' ..
      // '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' ..
      // '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' ..
      // '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u1040' ..
      // '\\u1049' )
      {
        if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')
            || (input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')
            || (input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')
            || (input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')
            || (input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')
            || (input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')
            || (input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')
            || (input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')
            || (input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')
            || (input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')
            || (input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')
            || (input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')
            || (input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')
            || (input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049')) {
          input.consume();

        } else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }

      }

    } finally {
    }
  }
  // $ANTLR end "RULE_DIGIT"

  // $ANTLR start "RULE_INT"
  public final void mRULE_INT() throws RecognitionException {
    try {
      int _type = RULE_INT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:114:10: ( ( '0' .. '9' )+ )
      // InternalMdxLexer.g:114:12: ( '0' .. '9' )+
      {
        // InternalMdxLexer.g:114:12: ( '0' .. '9' )+
        int cnt9 = 0;
        loop9: do {
          int alt9 = 2;
          int LA9_0 = input.LA(1);

          if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
            alt9 = 1;
          }

          switch (alt9) {
          case 1:
          // InternalMdxLexer.g:114:13: '0' .. '9'
          {
            matchRange('0', '9');

          }
            break;

          default:
            if (cnt9 >= 1)
              break loop9;
            EarlyExitException eee = new EarlyExitException(9, input);
            throw eee;
          }
          cnt9++;
        } while (true);

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_INT"

  // $ANTLR start "RULE_STRING"
  public final void mRULE_STRING() throws RecognitionException {
    try {
      int _type = RULE_STRING;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:116:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
      // '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
      // InternalMdxLexer.g:116:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
      // '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
      {
        // InternalMdxLexer.g:116:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
        // '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
        int alt12 = 2;
        int LA12_0 = input.LA(1);

        if ((LA12_0 == '\"')) {
          alt12 = 1;
        } else if ((LA12_0 == '\'')) {
          alt12 = 2;
        } else {
          NoViableAltException nvae = new NoViableAltException("", 12, 0, input);

          throw nvae;
        }
        switch (alt12) {
        case 1:
        // InternalMdxLexer.g:116:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
        {
          match('\"');
          // InternalMdxLexer.g:116:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
          loop10: do {
            int alt10 = 3;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == '\\')) {
              alt10 = 1;
            } else if (((LA10_0 >= '\u0000' && LA10_0 <= '!') || (LA10_0 >= '#' && LA10_0 <= '[')
                || (LA10_0 >= ']' && LA10_0 <= '\uFFFF'))) {
              alt10 = 2;
            }

            switch (alt10) {
            case 1:
            // InternalMdxLexer.g:116:21: '\\\\' .
            {
              match('\\');
              matchAny();

            }
              break;
            case 2:
            // InternalMdxLexer.g:116:28: ~ ( ( '\\\\' | '\"' ) )
            {
              if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '[')
                  || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                input.consume();

              } else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }

            }
              break;

            default:
              break loop10;
            }
          } while (true);

          match('\"');

        }
          break;
        case 2:
        // InternalMdxLexer.g:116:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
        // '\\''
        {
          match('\'');
          // InternalMdxLexer.g:116:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
          loop11: do {
            int alt11 = 3;
            int LA11_0 = input.LA(1);

            if ((LA11_0 == '\\')) {
              alt11 = 1;
            } else if (((LA11_0 >= '\u0000' && LA11_0 <= '&') || (LA11_0 >= '(' && LA11_0 <= '[')
                || (LA11_0 >= ']' && LA11_0 <= '\uFFFF'))) {
              alt11 = 2;
            }

            switch (alt11) {
            case 1:
            // InternalMdxLexer.g:116:54: '\\\\' .
            {
              match('\\');
              matchAny();

            }
              break;
            case 2:
            // InternalMdxLexer.g:116:61: ~ ( ( '\\\\' | '\\'' ) )
            {
              if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '[')
                  || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                input.consume();

              } else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }

            }
              break;

            default:
              break loop11;
            }
          } while (true);

          match('\'');

        }
          break;

        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_STRING"

  // $ANTLR start "RULE_ML_COMMENT"
  public final void mRULE_ML_COMMENT() throws RecognitionException {
    try {
      int _type = RULE_ML_COMMENT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:118:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
      // InternalMdxLexer.g:118:19: '/*' ( options {greedy=false; } : . )* '*/'
      {
        match("/*");

        // InternalMdxLexer.g:118:24: ( options {greedy=false; } : . )*
        loop13: do {
          int alt13 = 2;
          int LA13_0 = input.LA(1);

          if ((LA13_0 == '*')) {
            int LA13_1 = input.LA(2);

            if ((LA13_1 == '/')) {
              alt13 = 2;
            } else if (((LA13_1 >= '\u0000' && LA13_1 <= '.') || (LA13_1 >= '0' && LA13_1 <= '\uFFFF'))) {
              alt13 = 1;
            }

          } else if (((LA13_0 >= '\u0000' && LA13_0 <= ')') || (LA13_0 >= '+' && LA13_0 <= '\uFFFF'))) {
            alt13 = 1;
          }

          switch (alt13) {
          case 1:
          // InternalMdxLexer.g:118:52: .
          {
            matchAny();

          }
            break;

          default:
            break loop13;
          }
        } while (true);

        match("*/");

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_ML_COMMENT"

  // $ANTLR start "RULE_SL_COMMENT"
  public final void mRULE_SL_COMMENT() throws RecognitionException {
    try {
      int _type = RULE_SL_COMMENT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:120:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )?
      // '\\n' )? )
      // InternalMdxLexer.g:120:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )?
      // '\\n' )?
      {
        match("//");

        // InternalMdxLexer.g:120:24: (~ ( ( '\\n' | '\\r' ) ) )*
        loop14: do {
          int alt14 = 2;
          int LA14_0 = input.LA(1);

          if (((LA14_0 >= '\u0000' && LA14_0 <= '\t') || (LA14_0 >= '\u000B' && LA14_0 <= '\f')
              || (LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF'))) {
            alt14 = 1;
          }

          switch (alt14) {
          case 1:
          // InternalMdxLexer.g:120:24: ~ ( ( '\\n' | '\\r' ) )
          {
            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
              input.consume();

            } else {
              MismatchedSetException mse = new MismatchedSetException(null, input);
              recover(mse);
              throw mse;
            }

          }
            break;

          default:
            break loop14;
          }
        } while (true);

        // InternalMdxLexer.g:120:40: ( ( '\\r' )? '\\n' )?
        int alt16 = 2;
        int LA16_0 = input.LA(1);

        if ((LA16_0 == '\n' || LA16_0 == '\r')) {
          alt16 = 1;
        }
        switch (alt16) {
        case 1:
        // InternalMdxLexer.g:120:41: ( '\\r' )? '\\n'
        {
          // InternalMdxLexer.g:120:41: ( '\\r' )?
          int alt15 = 2;
          int LA15_0 = input.LA(1);

          if ((LA15_0 == '\r')) {
            alt15 = 1;
          }
          switch (alt15) {
          case 1:
          // InternalMdxLexer.g:120:41: '\\r'
          {
            match('\r');

          }
            break;

          }

          match('\n');

        }
          break;

        }

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_SL_COMMENT"

  // $ANTLR start "RULE_WS"
  public final void mRULE_WS() throws RecognitionException {
    try {
      int _type = RULE_WS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:122:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
      // InternalMdxLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
      {
        // InternalMdxLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
        int cnt17 = 0;
        loop17: do {
          int alt17 = 2;
          int LA17_0 = input.LA(1);

          if (((LA17_0 >= '\t' && LA17_0 <= '\n') || LA17_0 == '\r' || LA17_0 == ' ')) {
            alt17 = 1;
          }

          switch (alt17) {
          case 1:
          // InternalMdxLexer.g:
          {
            if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
              input.consume();

            } else {
              MismatchedSetException mse = new MismatchedSetException(null, input);
              recover(mse);
              throw mse;
            }

          }
            break;

          default:
            if (cnt17 >= 1)
              break loop17;
            EarlyExitException eee = new EarlyExitException(17, input);
            throw eee;
          }
          cnt17++;
        } while (true);

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_WS"

  // $ANTLR start "RULE_ANY_OTHER"
  public final void mRULE_ANY_OTHER() throws RecognitionException {
    try {
      int _type = RULE_ANY_OTHER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // InternalMdxLexer.g:124:16: ( . )
      // InternalMdxLexer.g:124:18: .
      {
        matchAny();

      }

      state.type = _type;
      state.channel = _channel;
    } finally {
    }
  }
  // $ANTLR end "RULE_ANY_OTHER"

  public void mTokens() throws RecognitionException {
    // InternalMdxLexer.g:1:8: ( FORMATTED_VALUE | CELL_ORDINAL | PROPERTIES |
    // DIMENSION | MEMBER | SELECT | EMPTY | VALUE | WHERE | CASE | CELL | ELSE |
    // FROM | THEN | WHEN | WITH | AND | END | NON | NOT | SET | XOR |
    // LessThanSignEqualsSign | LessThanSignGreaterThanSign |
    // GreaterThanSignEqualsSign | AS | ON | OR | VerticalLineVerticalLine |
    // Apostrophe | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma
    // | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign |
    // EqualsSign | GreaterThanSign | LeftCurlyBracket | RightCurlyBracket | RULE_ID
    // | RULE_AMP_QUOTED_ID | RULE_QUOTED_ID | RULE_LETTER | RULE_INT | RULE_STRING
    // | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
    int alt18 = 55;
    alt18 = dfa18.predict(input);
    switch (alt18) {
    case 1:
    // InternalMdxLexer.g:1:10: FORMATTED_VALUE
    {
      mFORMATTED_VALUE();

    }
      break;
    case 2:
    // InternalMdxLexer.g:1:26: CELL_ORDINAL
    {
      mCELL_ORDINAL();

    }
      break;
    case 3:
    // InternalMdxLexer.g:1:39: PROPERTIES
    {
      mPROPERTIES();

    }
      break;
    case 4:
    // InternalMdxLexer.g:1:50: DIMENSION
    {
      mDIMENSION();

    }
      break;
    case 5:
    // InternalMdxLexer.g:1:60: MEMBER
    {
      mMEMBER();

    }
      break;
    case 6:
    // InternalMdxLexer.g:1:67: SELECT
    {
      mSELECT();

    }
      break;
    case 7:
    // InternalMdxLexer.g:1:74: EMPTY
    {
      mEMPTY();

    }
      break;
    case 8:
    // InternalMdxLexer.g:1:80: VALUE
    {
      mVALUE();

    }
      break;
    case 9:
    // InternalMdxLexer.g:1:86: WHERE
    {
      mWHERE();

    }
      break;
    case 10:
    // InternalMdxLexer.g:1:92: CASE
    {
      mCASE();

    }
      break;
    case 11:
    // InternalMdxLexer.g:1:97: CELL
    {
      mCELL();

    }
      break;
    case 12:
    // InternalMdxLexer.g:1:102: ELSE
    {
      mELSE();

    }
      break;
    case 13:
    // InternalMdxLexer.g:1:107: FROM
    {
      mFROM();

    }
      break;
    case 14:
    // InternalMdxLexer.g:1:112: THEN
    {
      mTHEN();

    }
      break;
    case 15:
    // InternalMdxLexer.g:1:117: WHEN
    {
      mWHEN();

    }
      break;
    case 16:
    // InternalMdxLexer.g:1:122: WITH
    {
      mWITH();

    }
      break;
    case 17:
    // InternalMdxLexer.g:1:127: AND
    {
      mAND();

    }
      break;
    case 18:
    // InternalMdxLexer.g:1:131: END
    {
      mEND();

    }
      break;
    case 19:
    // InternalMdxLexer.g:1:135: NON
    {
      mNON();

    }
      break;
    case 20:
    // InternalMdxLexer.g:1:139: NOT
    {
      mNOT();

    }
      break;
    case 21:
    // InternalMdxLexer.g:1:143: SET
    {
      mSET();

    }
      break;
    case 22:
    // InternalMdxLexer.g:1:147: XOR
    {
      mXOR();

    }
      break;
    case 23:
    // InternalMdxLexer.g:1:151: LessThanSignEqualsSign
    {
      mLessThanSignEqualsSign();

    }
      break;
    case 24:
    // InternalMdxLexer.g:1:174: LessThanSignGreaterThanSign
    {
      mLessThanSignGreaterThanSign();

    }
      break;
    case 25:
    // InternalMdxLexer.g:1:202: GreaterThanSignEqualsSign
    {
      mGreaterThanSignEqualsSign();

    }
      break;
    case 26:
    // InternalMdxLexer.g:1:228: AS
    {
      mAS();

    }
      break;
    case 27:
    // InternalMdxLexer.g:1:231: ON
    {
      mON();

    }
      break;
    case 28:
    // InternalMdxLexer.g:1:234: OR
    {
      mOR();

    }
      break;
    case 29:
    // InternalMdxLexer.g:1:237: VerticalLineVerticalLine
    {
      mVerticalLineVerticalLine();

    }
      break;
    case 30:
    // InternalMdxLexer.g:1:262: Apostrophe
    {
      mApostrophe();

    }
      break;
    case 31:
    // InternalMdxLexer.g:1:273: LeftParenthesis
    {
      mLeftParenthesis();

    }
      break;
    case 32:
    // InternalMdxLexer.g:1:289: RightParenthesis
    {
      mRightParenthesis();

    }
      break;
    case 33:
    // InternalMdxLexer.g:1:306: Asterisk
    {
      mAsterisk();

    }
      break;
    case 34:
    // InternalMdxLexer.g:1:315: PlusSign
    {
      mPlusSign();

    }
      break;
    case 35:
    // InternalMdxLexer.g:1:324: Comma
    {
      mComma();

    }
      break;
    case 36:
    // InternalMdxLexer.g:1:330: HyphenMinus
    {
      mHyphenMinus();

    }
      break;
    case 37:
    // InternalMdxLexer.g:1:342: FullStop
    {
      mFullStop();

    }
      break;
    case 38:
    // InternalMdxLexer.g:1:351: Solidus
    {
      mSolidus();

    }
      break;
    case 39:
    // InternalMdxLexer.g:1:359: Colon
    {
      mColon();

    }
      break;
    case 40:
    // InternalMdxLexer.g:1:365: Semicolon
    {
      mSemicolon();

    }
      break;
    case 41:
    // InternalMdxLexer.g:1:375: LessThanSign
    {
      mLessThanSign();

    }
      break;
    case 42:
    // InternalMdxLexer.g:1:388: EqualsSign
    {
      mEqualsSign();

    }
      break;
    case 43:
    // InternalMdxLexer.g:1:399: GreaterThanSign
    {
      mGreaterThanSign();

    }
      break;
    case 44:
    // InternalMdxLexer.g:1:415: LeftCurlyBracket
    {
      mLeftCurlyBracket();

    }
      break;
    case 45:
    // InternalMdxLexer.g:1:432: RightCurlyBracket
    {
      mRightCurlyBracket();

    }
      break;
    case 46:
    // InternalMdxLexer.g:1:450: RULE_ID
    {
      mRULE_ID();

    }
      break;
    case 47:
    // InternalMdxLexer.g:1:458: RULE_AMP_QUOTED_ID
    {
      mRULE_AMP_QUOTED_ID();

    }
      break;
    case 48:
    // InternalMdxLexer.g:1:477: RULE_QUOTED_ID
    {
      mRULE_QUOTED_ID();

    }
      break;
    case 49:
    // InternalMdxLexer.g:1:492: RULE_LETTER
    {
      mRULE_LETTER();

    }
      break;
    case 50:
    // InternalMdxLexer.g:1:504: RULE_INT
    {
      mRULE_INT();

    }
      break;
    case 51:
    // InternalMdxLexer.g:1:513: RULE_STRING
    {
      mRULE_STRING();

    }
      break;
    case 52:
    // InternalMdxLexer.g:1:525: RULE_ML_COMMENT
    {
      mRULE_ML_COMMENT();

    }
      break;
    case 53:
    // InternalMdxLexer.g:1:541: RULE_SL_COMMENT
    {
      mRULE_SL_COMMENT();

    }
      break;
    case 54:
    // InternalMdxLexer.g:1:557: RULE_WS
    {
      mRULE_WS();

    }
      break;
    case 55:
    // InternalMdxLexer.g:1:565: RULE_ANY_OTHER
    {
      mRULE_ANY_OTHER();

    }
      break;

    }

  }

  protected DFA18 dfa18 = new DFA18(this);
  static final String DFA18_eotS = "\1\uffff\15\52\1\76\1\100\1\52\1\47\1\104\7\uffff\1\117\5\uffff\1\47\1\uffff\1\47\2\uffff\1\47\2\uffff\2\52\1\uffff\16\52\1\153\2\52\5\uffff\1\157\1\160\27\uffff\10\52\1\171\2\52\1\174\4\52\1\u0082\1\uffff\1\u0083\1\u0084\1\u0085\2\uffff\1\52\1\u0087\1\u0089\1\u008a\4\52\1\uffff\1\52\1\u0090\1\uffff\2\52\1\u0093\1\u0094\1\u0095\4\uffff\1\52\1\uffff\1\52\2\uffff\4\52\1\u009c\1\uffff\1\u009d\1\u009e\3\uffff\4\52\1\u00a3\1\u00a4\3\uffff\4\52\2\uffff\7\52\1\u00b0\2\52\1\u00b3\1\uffff\2\52\1\uffff\1\52\1\u00b7\1\52\1\uffff\1\52\1\u00ba\1\uffff";
  static final String DFA18_eofS = "\u00bb\uffff";
  static final String DFA18_minS = "\1\0\1\117\1\101\1\122\1\111\2\105\1\114\1\101\2\110\1\116\2\117\2\75\1\116\1\174\1\0\7\uffff\1\52\5\uffff\1\101\1\uffff\1\46\2\uffff\1\0\2\uffff\1\122\1\117\1\uffff\1\114\1\123\1\117\2\115\1\114\1\120\1\123\1\104\1\114\1\105\1\124\1\105\1\104\1\44\1\116\1\122\5\uffff\2\44\27\uffff\2\115\1\114\1\105\1\120\1\105\1\102\1\105\1\44\1\124\1\105\1\44\1\125\1\116\1\110\1\116\1\44\1\uffff\3\44\2\uffff\1\101\3\44\1\105\1\116\1\105\1\103\1\uffff\1\131\1\44\1\uffff\2\105\3\44\4\uffff\1\124\1\uffff\1\117\2\uffff\1\122\1\123\1\122\1\124\1\44\1\uffff\2\44\3\uffff\1\124\1\122\1\124\1\111\2\44\3\uffff\1\105\1\104\1\111\1\117\2\uffff\1\104\1\111\1\105\1\116\1\137\1\116\1\123\1\44\1\126\1\101\1\44\1\uffff\1\101\1\114\1\uffff\1\114\1\44\1\125\1\uffff\1\105\1\44\1\uffff";
  static final String DFA18_maxS = "\1\uffff\1\162\1\145\1\162\1\151\2\145\1\156\1\141\1\151\1\150\1\163\2\157\1\76\1\75\1\162\1\174\1\uffff\7\uffff\1\57\5\uffff\1\172\1\uffff\1\u1049\2\uffff\1\uffff\2\uffff\1\162\1\157\1\uffff\1\154\1\163\1\157\2\155\1\164\1\160\1\163\1\144\1\154\1\145\1\164\1\145\1\144\1\172\1\164\1\162\5\uffff\2\172\27\uffff\2\155\1\154\1\145\1\160\1\145\1\142\1\145\1\172\1\164\1\145\1\172\1\165\1\162\1\150\1\156\1\172\1\uffff\3\172\2\uffff\1\141\3\172\1\145\1\156\1\145\1\143\1\uffff\1\171\1\172\1\uffff\2\145\3\172\4\uffff\1\164\1\uffff\1\157\2\uffff\1\162\1\163\1\162\1\164\1\172\1\uffff\2\172\3\uffff\1\164\1\162\1\164\1\151\2\172\3\uffff\1\145\1\144\1\151\1\157\2\uffff\1\144\1\151\1\145\1\156\1\137\1\156\1\163\1\172\1\166\1\141\1\172\1\uffff\1\141\1\154\1\uffff\1\154\1\172\1\165\1\uffff\1\145\1\172\1\uffff";
  static final String DFA18_acceptS = "\23\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\uffff\1\47\1\50\1\52\1\54\1\55\1\uffff\1\56\1\uffff\1\61\1\62\1\uffff\1\66\1\67\2\uffff\1\56\21\uffff\1\27\1\30\1\51\1\31\1\53\2\uffff\1\35\1\36\1\63\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\64\1\65\1\46\1\47\1\50\1\52\1\54\1\55\1\57\1\60\1\61\1\62\1\66\21\uffff\1\32\3\uffff\1\33\1\34\10\uffff\1\25\2\uffff\1\22\5\uffff\1\21\1\23\1\24\1\26\1\uffff\1\15\1\uffff\1\13\1\12\5\uffff\1\14\2\uffff\1\17\1\20\1\16\6\uffff\1\7\1\10\1\11\4\uffff\1\5\1\6\13\uffff\1\4\2\uffff\1\3\3\uffff\1\2\2\uffff\1\1";
  static final String DFA18_specialS = "\1\2\21\uffff\1\0\22\uffff\1\1\u0095\uffff}>";
  static final String[] DFA18_transitionS = {
      "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\45\1\47\1\43\2\47\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\12\44\1\33\1\34\1\16\1\35\1\17\2\47\1\13\1\41\1\2\1\4\1\7\1\1\6\41\1\5\1\14\1\20\1\3\2\41\1\6\1\12\1\41\1\10\1\11\1\15\2\41\1\42\2\47\1\40\1\41\1\47\1\13\1\41\1\2\1\4\1\7\1\1\6\41\1\5\1\14\1\20\1\3\2\41\1\6\1\12\1\41\1\10\1\11\1\15\2\41\1\36\1\21\1\37\102\47\27\43\1\47\37\43\1\47\u1f08\43\u1040\47\u0150\43\u0170\47\u0080\43\u0080\47\u092e\43\u10d2\47\u5200\43\u5900\47\u0200\43\u0500\47",
      "\1\50\2\uffff\1\51\34\uffff\1\50\2\uffff\1\51", "\1\54\3\uffff\1\53\33\uffff\1\54\3\uffff\1\53",
      "\1\55\37\uffff\1\55", "\1\56\37\uffff\1\56", "\1\57\37\uffff\1\57", "\1\60\37\uffff\1\60",
      "\1\62\1\61\1\63\35\uffff\1\62\1\61\1\63", "\1\64\37\uffff\1\64", "\1\65\1\66\36\uffff\1\65\1\66",
      "\1\67\37\uffff\1\67", "\1\70\4\uffff\1\71\32\uffff\1\70\4\uffff\1\71", "\1\72\37\uffff\1\72",
      "\1\73\37\uffff\1\73", "\1\74\1\75", "\1\77", "\1\101\3\uffff\1\102\33\uffff\1\101\3\uffff\1\102", "\1\103",
      "\0\105", "", "", "", "", "", "", "", "\1\115\4\uffff\1\116", "", "", "", "", "",
      "\32\52\4\uffff\1\52\1\uffff\32\52", "",
      "\1\125\11\uffff\12\126\7\uffff\32\126\3\uffff\2\126\1\uffff\32\126\u05e5\uffff\12\126\u0086\uffff\12\126\u026c\uffff\12\126\166\uffff\12\126\166\uffff\12\126\166\uffff\12\126\166\uffff\12\126\167\uffff\11\126\166\uffff\12\126\166\uffff\12\126\166\uffff\12\126\u00e0\uffff\12\126\166\uffff\12\126\u0166\uffff\12\126",
      "", "", "\0\105", "", "", "\1\132\37\uffff\1\132", "\1\133\37\uffff\1\133", "", "\1\134\37\uffff\1\134",
      "\1\135\37\uffff\1\135", "\1\136\37\uffff\1\136", "\1\137\37\uffff\1\137", "\1\140\37\uffff\1\140",
      "\1\141\7\uffff\1\142\27\uffff\1\141\7\uffff\1\142", "\1\143\37\uffff\1\143", "\1\144\37\uffff\1\144",
      "\1\145\37\uffff\1\145", "\1\146\37\uffff\1\146", "\1\147\37\uffff\1\147", "\1\150\37\uffff\1\150",
      "\1\151\37\uffff\1\151", "\1\152\37\uffff\1\152", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\154\5\uffff\1\155\31\uffff\1\154\5\uffff\1\155", "\1\156\37\uffff\1\156", "", "", "", "", "",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "", "", "", "", "", "", "", "", "", "", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "\1\161\37\uffff\1\161", "\1\162\37\uffff\1\162",
      "\1\163\37\uffff\1\163", "\1\164\37\uffff\1\164", "\1\165\37\uffff\1\165", "\1\166\37\uffff\1\166",
      "\1\167\37\uffff\1\167", "\1\170\37\uffff\1\170", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\172\37\uffff\1\172", "\1\173\37\uffff\1\173", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\175\37\uffff\1\175", "\1\177\3\uffff\1\176\33\uffff\1\177\3\uffff\1\176", "\1\u0080\37\uffff\1\u0080",
      "\1\u0081\37\uffff\1\u0081", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "", "", "\1\u0086\37\uffff\1\u0086",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\u0088\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "\1\u008b\37\uffff\1\u008b",
      "\1\u008c\37\uffff\1\u008c", "\1\u008d\37\uffff\1\u008d", "\1\u008e\37\uffff\1\u008e", "",
      "\1\u008f\37\uffff\1\u008f", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
      "\1\u0091\37\uffff\1\u0091", "\1\u0092\37\uffff\1\u0092",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "", "", "", "", "\1\u0096\37\uffff\1\u0096", "",
      "\1\u0097\37\uffff\1\u0097", "", "", "\1\u0098\37\uffff\1\u0098", "\1\u0099\37\uffff\1\u0099",
      "\1\u009a\37\uffff\1\u009a", "\1\u009b\37\uffff\1\u009b",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "", "", "", "\1\u009f\37\uffff\1\u009f",
      "\1\u00a0\37\uffff\1\u00a0", "\1\u00a1\37\uffff\1\u00a1", "\1\u00a2\37\uffff\1\u00a2",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "", "", "", "\1\u00a5\37\uffff\1\u00a5",
      "\1\u00a6\37\uffff\1\u00a6", "\1\u00a7\37\uffff\1\u00a7", "\1\u00a8\37\uffff\1\u00a8", "", "",
      "\1\u00a9\37\uffff\1\u00a9", "\1\u00aa\37\uffff\1\u00aa", "\1\u00ab\37\uffff\1\u00ab",
      "\1\u00ac\37\uffff\1\u00ac", "\1\u00ad", "\1\u00ae\37\uffff\1\u00ae", "\1\u00af\37\uffff\1\u00af",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "\1\u00b1\37\uffff\1\u00b1",
      "\1\u00b2\37\uffff\1\u00b2", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "",
      "\1\u00b4\37\uffff\1\u00b4", "\1\u00b5\37\uffff\1\u00b5", "", "\1\u00b6\37\uffff\1\u00b6",
      "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "\1\u00b8\37\uffff\1\u00b8", "",
      "\1\u00b9\37\uffff\1\u00b9", "\1\52\13\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52", "" };

  static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
  static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
  static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
  static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
  static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
  static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
  static final short[][] DFA18_transition;

  static {
    int numStates = DFA18_transitionS.length;
    DFA18_transition = new short[numStates][];
    for (int i = 0; i < numStates; i++) {
      DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
    }
  }

  class DFA18 extends DFA {

    public DFA18(BaseRecognizer recognizer) {
      this.recognizer = recognizer;
      this.decisionNumber = 18;
      this.eot = DFA18_eot;
      this.eof = DFA18_eof;
      this.min = DFA18_min;
      this.max = DFA18_max;
      this.accept = DFA18_accept;
      this.special = DFA18_special;
      this.transition = DFA18_transition;
    }

    public String getDescription() {
      return "1:1: Tokens : ( FORMATTED_VALUE | CELL_ORDINAL | PROPERTIES | DIMENSION | MEMBER | SELECT | EMPTY | VALUE | WHERE | CASE | CELL | ELSE | FROM | THEN | WHEN | WITH | AND | END | NON | NOT | SET | XOR | LessThanSignEqualsSign | LessThanSignGreaterThanSign | GreaterThanSignEqualsSign | AS | ON | OR | VerticalLineVerticalLine | Apostrophe | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_AMP_QUOTED_ID | RULE_QUOTED_ID | RULE_LETTER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
    }

    public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
      IntStream input = _input;
      int _s = s;
      switch (s) {
      case 0:
        int LA18_18 = input.LA(1);

        s = -1;
        if (((LA18_18 >= '\u0000' && LA18_18 <= '\uFFFF'))) {
          s = 69;
        }

        else
          s = 68;

        if (s >= 0)
          return s;
        break;
      case 1:
        int LA18_37 = input.LA(1);

        s = -1;
        if (((LA18_37 >= '\u0000' && LA18_37 <= '\uFFFF'))) {
          s = 69;
        }

        else
          s = 39;

        if (s >= 0)
          return s;
        break;
      case 2:
        int LA18_0 = input.LA(1);

        s = -1;
        if ((LA18_0 == 'F' || LA18_0 == 'f')) {
          s = 1;
        }

        else if ((LA18_0 == 'C' || LA18_0 == 'c')) {
          s = 2;
        }

        else if ((LA18_0 == 'P' || LA18_0 == 'p')) {
          s = 3;
        }

        else if ((LA18_0 == 'D' || LA18_0 == 'd')) {
          s = 4;
        }

        else if ((LA18_0 == 'M' || LA18_0 == 'm')) {
          s = 5;
        }

        else if ((LA18_0 == 'S' || LA18_0 == 's')) {
          s = 6;
        }

        else if ((LA18_0 == 'E' || LA18_0 == 'e')) {
          s = 7;
        }

        else if ((LA18_0 == 'V' || LA18_0 == 'v')) {
          s = 8;
        }

        else if ((LA18_0 == 'W' || LA18_0 == 'w')) {
          s = 9;
        }

        else if ((LA18_0 == 'T' || LA18_0 == 't')) {
          s = 10;
        }

        else if ((LA18_0 == 'A' || LA18_0 == 'a')) {
          s = 11;
        }

        else if ((LA18_0 == 'N' || LA18_0 == 'n')) {
          s = 12;
        }

        else if ((LA18_0 == 'X' || LA18_0 == 'x')) {
          s = 13;
        }

        else if ((LA18_0 == '<')) {
          s = 14;
        }

        else if ((LA18_0 == '>')) {
          s = 15;
        }

        else if ((LA18_0 == 'O' || LA18_0 == 'o')) {
          s = 16;
        }

        else if ((LA18_0 == '|')) {
          s = 17;
        }

        else if ((LA18_0 == '\'')) {
          s = 18;
        }

        else if ((LA18_0 == '(')) {
          s = 19;
        }

        else if ((LA18_0 == ')')) {
          s = 20;
        }

        else if ((LA18_0 == '*')) {
          s = 21;
        }

        else if ((LA18_0 == '+')) {
          s = 22;
        }

        else if ((LA18_0 == ',')) {
          s = 23;
        }

        else if ((LA18_0 == '-')) {
          s = 24;
        }

        else if ((LA18_0 == '.')) {
          s = 25;
        }

        else if ((LA18_0 == '/')) {
          s = 26;
        }

        else if ((LA18_0 == ':')) {
          s = 27;
        }

        else if ((LA18_0 == ';')) {
          s = 28;
        }

        else if ((LA18_0 == '=')) {
          s = 29;
        }

        else if ((LA18_0 == '{')) {
          s = 30;
        }

        else if ((LA18_0 == '}')) {
          s = 31;
        }

        else if ((LA18_0 == '^')) {
          s = 32;
        }

        else if ((LA18_0 == 'B' || (LA18_0 >= 'G' && LA18_0 <= 'L') || (LA18_0 >= 'Q' && LA18_0 <= 'R') || LA18_0 == 'U'
            || (LA18_0 >= 'Y' && LA18_0 <= 'Z') || LA18_0 == '_' || LA18_0 == 'b' || (LA18_0 >= 'g' && LA18_0 <= 'l')
            || (LA18_0 >= 'q' && LA18_0 <= 'r') || LA18_0 == 'u' || (LA18_0 >= 'y' && LA18_0 <= 'z'))) {
          s = 33;
        }

        else if ((LA18_0 == '[')) {
          s = 34;
        }

        else if ((LA18_0 == '$' || (LA18_0 >= '\u00C0' && LA18_0 <= '\u00D6')
            || (LA18_0 >= '\u00D8' && LA18_0 <= '\u00F6') || (LA18_0 >= '\u00F8' && LA18_0 <= '\u1FFF')
            || (LA18_0 >= '\u3040' && LA18_0 <= '\u318F') || (LA18_0 >= '\u3300' && LA18_0 <= '\u337F')
            || (LA18_0 >= '\u3400' && LA18_0 <= '\u3D2D') || (LA18_0 >= '\u4E00' && LA18_0 <= '\u9FFF')
            || (LA18_0 >= '\uF900' && LA18_0 <= '\uFAFF'))) {
          s = 35;
        }

        else if (((LA18_0 >= '0' && LA18_0 <= '9'))) {
          s = 36;
        }

        else if ((LA18_0 == '\"')) {
          s = 37;
        }

        else if (((LA18_0 >= '\t' && LA18_0 <= '\n') || LA18_0 == '\r' || LA18_0 == ' ')) {
          s = 38;
        }

        else if (((LA18_0 >= '\u0000' && LA18_0 <= '\b') || (LA18_0 >= '\u000B' && LA18_0 <= '\f')
            || (LA18_0 >= '\u000E' && LA18_0 <= '\u001F') || LA18_0 == '!' || LA18_0 == '#'
            || (LA18_0 >= '%' && LA18_0 <= '&') || (LA18_0 >= '?' && LA18_0 <= '@') || (LA18_0 >= '\\' && LA18_0 <= ']')
            || LA18_0 == '`' || (LA18_0 >= '~' && LA18_0 <= '\u00BF') || LA18_0 == '\u00D7' || LA18_0 == '\u00F7'
            || (LA18_0 >= '\u2000' && LA18_0 <= '\u303F') || (LA18_0 >= '\u3190' && LA18_0 <= '\u32FF')
            || (LA18_0 >= '\u3380' && LA18_0 <= '\u33FF') || (LA18_0 >= '\u3D2E' && LA18_0 <= '\u4DFF')
            || (LA18_0 >= '\uA000' && LA18_0 <= '\uF8FF') || (LA18_0 >= '\uFB00' && LA18_0 <= '\uFFFF'))) {
          s = 39;
        }

        if (s >= 0)
          return s;
        break;
      }
      NoViableAltException nvae = new NoViableAltException(getDescription(), 18, _s, input);
      error(nvae);
      throw nvae;
    }
  }

}