/* Generated by: JavaCC 21 Parser Generator. Do not edit. mdxConstants.java */
package org.eclipse.daanse.mdx.parser.impl;

import java.io.IOException;
import java.io.Reader;
/**
 * Token literal values and constants.
 */
public interface mdxConstants {
    public enum TokenType {
        EOF, AND, AS, AXIS, BEGIN, BY, CASE, CALCULATION, CAST, CELL, CHAPTERS, CREATE, COLUMNS, COMMIT, CUBE, DIMENSION, DRILLTHROUGH, ELSE, EMPTY, END, EXPLAIN, FIRSTROWSET, FOR, FROM, IN, IS, MATCHES, MAXROWS, MEMBER, MEASURE, NON, NOT, NULL, ON, OR, PAGES, PLAN, PROPERTIES, REFRESH, RETURN, ROLLBACK, ROWS, SECTIONS, SELECT, SESSION, SET, THEN, TRAN, TRANSACTION, UPDATE, USE_EQUAL_ALLOCATION, USE_EQUAL_INCREMENT, USE_WEIGHTED_ALLOCATION, USE_WEIGHTED_INCREMENT, WHEN, WHERE, XOR, WITH, EXISTING, $SYSTEM, _TOKEN_60, _TOKEN_61, _TOKEN_62, _TOKEN_63, _TOKEN_64, _TOKEN_65, _TOKEN_66, _TOKEN_67, _TOKEN_68, SINGLE_LINE_COMMENT, FORMAL_COMMENT, MULTI_LINE_COMMENT, _TOKEN_72, LPAREN, RPAREN, LBRACE, RBRACE, LBRACKET, RBRACKET, COMMA, SEMICOLON, DOT, ASTERISK, BANG, COLON, CONCAT, EQ, GE, GT, LE, LT, MINUS, NE, PLUS, SOLIDUS, ATSIGN, ID, QUOTED_ID, AMP_QUOTED_ID, AMP_UNQUOTED_ID, UNSIGNED_INTEGER_LITERAL, APPROX_NUMERIC_LITERAL, DECIMAL_NUMERIC_LITERAL, FLOATING_POINT_LITERAL, STRING, SINGLE_QUOTED_STRING, DOUBLE_QUOTED_STRING, CALCULATED, INVALID
    }
    /**
   * Lexical States
   */
    public enum LexicalState {
        DEFAULT, IN_SINGLE_LINE_COMMENT, IN_FORMAL_COMMENT, IN_MULTI_LINE_COMMENT, 
    }
}