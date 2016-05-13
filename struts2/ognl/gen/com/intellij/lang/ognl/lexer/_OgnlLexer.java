/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

/* Generated code. Do not modify it. */
package com.intellij.lang.ognl.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

import com.intellij.psi.TokenType;
import com.intellij.lang.ognl.OgnlTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_OgnlLexer.flex</tt>
 */
public class _OgnlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NESTED_BRACE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\4\1\3\1\16\1\0\1\3\1\16\16\4\4\0\1\42\1\53"+
    "\1\17\1\62\1\64\1\20\1\70\1\14\1\47\1\50\1\66\1\13"+
    "\1\57\1\67\1\11\1\65\1\6\11\2\1\61\1\0\1\55\1\54"+
    "\1\56\1\60\1\63\1\5\1\10\2\5\1\12\2\5\1\7\22\5"+
    "\1\51\1\15\1\52\1\72\1\4\1\0\1\30\1\33\1\46\1\32"+
    "\1\36\1\45\1\41\1\24\1\43\2\5\1\25\1\5\1\31\1\34"+
    "\1\5\1\37\1\26\1\23\1\40\1\27\1\5\1\44\1\35\2\5"+
    "\1\21\1\71\1\22\1\73\41\4\2\0\4\4\4\0\1\5\2\0"+
    "\1\4\7\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5\1\0"+
    "\376\5\4\4\36\5\70\4\131\5\7\4\11\5\2\4\7\5\4\0"+
    "\12\4\2\5\16\0\5\5\7\0\1\4\1\0\1\4\21\0\165\4"+
    "\1\0\2\4\2\0\1\5\3\4\10\0\1\5\1\0\3\5\1\0"+
    "\1\5\1\0\24\5\1\0\54\5\1\4\7\5\3\4\1\5\1\4"+
    "\1\5\1\4\1\5\1\4\1\5\1\4\22\5\2\4\1\0\12\4"+
    "\14\5\1\4\102\5\1\4\14\5\1\4\44\5\1\0\5\4\2\0"+
    "\6\4\65\5\2\4\2\5\2\4\2\5\3\4\34\5\2\4\10\5"+
    "\2\4\2\5\56\4\11\0\46\5\2\0\1\5\7\0\47\5\7\0"+
    "\1\4\1\0\55\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0"+
    "\1\4\10\0\33\5\5\0\3\5\15\0\5\4\6\0\1\4\4\0"+
    "\13\4\5\0\1\4\32\5\5\4\13\5\37\4\4\0\3\4\107\5"+
    "\2\4\5\5\1\4\17\5\1\4\4\5\1\0\1\5\10\4\1\0"+
    "\6\4\2\5\2\4\1\0\23\4\2\0\1\4\17\0\74\4\2\0"+
    "\145\4\16\0\66\4\4\0\1\4\5\0\56\4\22\0\34\4\104\0"+
    "\1\4\1\0\13\4\67\0\33\4\1\0\5\4\65\5\3\4\1\5"+
    "\32\4\12\5\2\4\2\0\12\4\1\0\7\4\1\0\7\4\1\0"+
    "\3\4\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\1\5\3\0\4\5\2\0\11\4\2\0\2\4\2\0\4\4\10\0"+
    "\1\4\4\0\2\5\1\0\3\5\2\4\2\0\12\4\2\5\2\4"+
    "\7\0\1\4\5\0\3\4\1\0\6\5\4\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\4"+
    "\1\0\5\4\4\0\2\4\2\0\3\4\3\0\1\4\7\0\4\5"+
    "\1\0\1\5\7\0\14\4\3\5\1\4\13\0\3\4\1\0\7\5"+
    "\1\4\1\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0\2\5"+
    "\1\0\5\5\2\0\1\4\1\5\10\4\1\0\3\4\1\0\3\4"+
    "\2\0\1\4\17\0\1\5\3\4\2\0\12\4\1\0\1\4\17\0"+
    "\3\4\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\2\5\1\0\1\4\4\5\2\0\1\4\1\5\7\4\2\0\2\4"+
    "\2\0\3\4\10\0\2\4\4\0\2\5\1\0\3\5\2\4\2\0"+
    "\12\4\1\0\1\4\20\0\2\4\1\0\6\5\3\0\3\5\1\0"+
    "\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0"+
    "\3\5\3\0\10\5\1\4\3\5\4\0\5\4\3\0\3\4\1\0"+
    "\4\4\2\0\1\4\6\0\1\4\16\0\12\4\11\0\1\4\7\0"+
    "\3\4\1\0\10\5\1\0\3\5\1\0\27\5\1\0\12\5\1\0"+
    "\5\5\3\0\10\4\1\0\3\4\1\0\4\4\7\0\2\4\1\0"+
    "\2\4\6\0\2\5\2\4\2\0\12\4\22\0\2\4\1\0\10\5"+
    "\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5\2\0\11\4"+
    "\1\0\3\4\1\0\4\4\7\0\2\4\7\0\1\5\1\0\2\5"+
    "\2\4\2\0\12\4\1\0\2\4\17\0\2\4\1\0\10\5\1\0"+
    "\3\5\1\0\27\5\1\4\20\5\1\4\2\0\10\4\1\0\3\4"+
    "\1\0\5\4\10\0\1\4\10\0\2\5\2\4\2\0\12\4\12\0"+
    "\6\4\2\0\2\4\1\0\22\4\3\0\30\4\1\0\11\4\1\0"+
    "\1\4\2\0\7\4\3\0\1\4\4\0\6\4\1\0\1\4\1\0"+
    "\10\4\22\0\2\4\15\0\56\5\1\4\1\5\1\4\2\5\7\4"+
    "\4\0\1\4\7\5\10\4\1\0\12\4\47\0\2\5\1\0\1\5"+
    "\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0\7\5"+
    "\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0\2\5"+
    "\1\4\1\5\1\4\2\5\6\4\1\0\2\4\1\5\2\0\5\5"+
    "\1\0\1\5\1\0\6\4\2\0\12\4\2\0\2\5\2\4\40\0"+
    "\1\4\27\0\2\4\6\0\12\4\13\0\1\4\1\0\1\4\1\0"+
    "\1\4\4\0\2\4\10\5\1\0\41\5\3\4\4\0\24\4\1\0"+
    "\22\4\1\0\44\4\11\0\1\4\71\0\112\4\6\0\116\4\2\0"+
    "\46\5\1\0\1\4\5\0\1\4\2\0\47\5\4\4\1\0\4\4"+
    "\132\5\5\4\104\5\5\4\122\5\117\4\1\0\4\4\2\0\7\4"+
    "\1\0\1\4\1\0\4\4\2\0\51\4\1\0\4\4\2\0\41\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\17\4"+
    "\1\0\71\4\1\0\4\4\2\0\103\4\2\0\3\4\40\0\20\4"+
    "\20\0\125\4\14\0\u026c\4\2\0\21\4\1\0\32\4\5\0\113\4"+
    "\3\0\3\4\17\0\15\4\1\0\7\4\13\0\25\4\13\0\24\4"+
    "\14\0\15\4\1\0\3\4\1\0\2\4\14\0\124\4\3\0\1\4"+
    "\3\0\3\4\2\0\12\4\41\0\3\4\2\0\12\4\6\0\130\4"+
    "\10\0\53\4\5\0\106\4\12\0\35\4\3\0\14\4\4\0\14\4"+
    "\12\0\50\4\2\0\5\4\13\0\54\4\4\0\32\4\6\0\12\4"+
    "\46\0\34\4\4\0\77\4\1\0\35\4\2\0\13\4\6\0\12\4"+
    "\15\0\1\4\130\0\114\4\4\0\12\4\21\0\11\4\14\0\164\4"+
    "\14\0\70\4\10\0\12\4\3\0\61\4\122\0\3\4\1\0\43\4"+
    "\11\0\347\4\25\0\4\4\234\5\4\4\132\5\6\4\26\5\2\0"+
    "\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0\1\5\1\0"+
    "\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0\7\5\1\0"+
    "\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0\6\5\4\0"+
    "\15\5\5\0\3\5\1\0\7\5\16\0\5\4\32\0\5\4\20\0"+
    "\2\4\23\0\1\4\13\0\5\4\5\0\6\4\1\0\1\4\15\0"+
    "\1\5\20\0\15\4\3\0\33\4\25\0\15\4\4\0\1\4\3\0"+
    "\14\4\21\0\1\5\4\0\1\5\2\0\12\5\1\0\1\5\2\0"+
    "\1\1\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5"+
    "\1\1\3\5\1\4\6\5\1\4\2\0\4\4\5\0\5\4\4\0"+
    "\1\4\21\0\51\4\u0a77\0\57\4\1\0\57\4\1\0\205\4\6\0"+
    "\11\4\14\0\46\4\1\0\1\4\5\0\1\4\2\0\70\4\7\0"+
    "\1\4\17\0\30\4\11\0\7\4\1\0\7\4\1\0\7\4\1\0"+
    "\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0"+
    "\40\4\57\0\1\4\u01d5\0\1\5\2\4\31\0\17\4\1\0\5\5"+
    "\2\0\5\4\4\0\124\5\2\4\2\0\2\4\2\1\2\5\1\4"+
    "\1\0\132\5\1\0\3\5\1\4\5\0\50\5\1\4\3\0\136\5"+
    "\21\0\33\4\65\0\20\4\u0200\0\u19b6\4\112\0\u51a6\5\47\4\63\0"+
    "\u048d\4\103\0\56\4\2\0\u010d\4\3\0\34\4\24\0\60\4\4\0"+
    "\12\4\1\0\31\4\7\0\123\4\45\0\11\4\2\0\147\4\2\0"+
    "\4\4\1\0\4\4\14\0\13\4\115\0\60\4\20\0\1\4\7\0"+
    "\64\4\14\0\105\4\13\0\12\4\6\0\30\4\3\0\1\4\4\0"+
    "\56\4\2\0\44\4\14\0\35\4\3\0\101\4\16\0\13\4\46\0"+
    "\67\4\11\0\16\4\2\0\12\4\6\0\27\4\3\0\2\4\4\0"+
    "\103\4\30\0\3\4\2\0\20\4\2\0\5\4\12\0\6\4\2\0"+
    "\6\4\2\0\6\4\11\0\7\4\1\0\7\4\221\0\53\4\1\0"+
    "\2\4\2\0\12\4\6\0\u2ba4\5\14\0\27\4\4\0\61\4\u2104\0"+
    "\u012e\5\100\4\2\0\152\4\46\0\7\5\14\0\5\5\5\0\2\4"+
    "\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0"+
    "\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0"+
    "\14\5\1\4\3\0\20\4\20\0\7\4\14\0\2\4\30\0\3\4"+
    "\31\0\1\4\6\0\3\5\1\4\1\5\1\0\207\5\2\0\1\4"+
    "\4\0\1\4\13\0\12\4\7\0\32\5\4\0\1\4\1\0\32\5"+
    "\13\0\131\5\3\0\6\5\2\0\6\5\2\0\6\5\2\0\3\5"+
    "\3\0\2\4\3\0\2\4\22\0\3\4\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\15\2\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\11\1\41\1\42\2\43\1\0"+
    "\2\7\2\10\1\44\1\2\1\45\7\2\1\46\1\2"+
    "\1\47\1\2\1\50\1\51\1\2\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\62\1\43\1\63"+
    "\1\64\1\65\1\2\1\66\1\2\1\67\1\70\1\71"+
    "\1\2\1\72\1\73\1\2\1\74\2\2\1\75\1\76"+
    "\1\77\1\0\1\100\1\101\2\2\1\0\1\2\1\102"+
    "\1\103\4\2\1\104";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
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
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\170\0\u01e0\0\u021c\0\u0258\0\170\0\170\0\u0294\0\u02d0"+
    "\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0"+
    "\0\u04ec\0\u0528\0\u0564\0\170\0\170\0\170\0\170\0\u05a0"+
    "\0\u05dc\0\u0618\0\u0654\0\170\0\170\0\170\0\170\0\170"+
    "\0\170\0\170\0\170\0\170\0\u0690\0\u06cc\0\170\0\170"+
    "\0\170\0\170\0\170\0\u0708\0\u0744\0\u0780\0\170\0\u07bc"+
    "\0\u07f8\0\170\0\170\0\u0834\0\u0870\0\u08ac\0\u08e8\0\u0924"+
    "\0\u0960\0\u099c\0\u09d8\0\u0a14\0\264\0\u0a50\0\264\0\u0a8c"+
    "\0\u0ac8\0\u0b04\0\u0b40\0\170\0\170\0\170\0\170\0\170"+
    "\0\u0b7c\0\170\0\170\0\170\0\u0bb8\0\264\0\264\0\264"+
    "\0\u0bf4\0\264\0\u0c30\0\u0c6c\0\264\0\264\0\u0ca8\0\264"+
    "\0\264\0\u0ce4\0\264\0\u0d20\0\u0d5c\0\170\0\264\0\264"+
    "\0\u0d98\0\264\0\264\0\u0dd4\0\u0e10\0\u0e4c\0\u0e88\0\264"+
    "\0\170\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
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
    "\1\3\1\4\1\5\1\6\1\3\1\4\1\7\2\4"+
    "\1\10\1\4\1\11\1\12\1\3\1\6\1\13\1\14"+
    "\1\15\1\16\1\17\1\4\1\20\1\4\1\21\1\22"+
    "\1\23\1\4\1\24\1\25\1\26\1\27\1\4\1\30"+
    "\1\31\1\6\1\32\1\4\1\33\1\4\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\3\1\4\1\5\1\6\1\3"+
    "\1\4\1\7\2\4\1\10\1\4\1\11\1\12\1\3"+
    "\1\6\1\13\1\61\1\15\1\62\1\17\1\4\1\20"+
    "\1\4\1\21\1\22\1\23\1\4\1\24\1\25\1\26"+
    "\1\27\1\4\1\30\1\31\1\6\1\32\1\4\1\33"+
    "\1\4\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\76\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\17\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\5\3\0\1\5\1\63\1\0"+
    "\1\64\1\65\11\0\1\63\11\0\1\65\40\0\1\6"+
    "\12\0\1\6\23\0\1\6\33\0\1\66\3\0\1\66"+
    "\1\63\1\0\1\64\1\65\11\0\1\63\11\0\1\65"+
    "\37\0\1\64\3\0\1\64\65\0\14\12\1\67\1\70"+
    "\1\0\55\12\15\13\1\71\1\0\1\72\54\13\21\0"+
    "\1\73\54\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\1\4\1\74\15\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\15\4\1\75"+
    "\1\4\1\0\4\4\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\1\76\16\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\6\4\1\77\10\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\4\4"+
    "\1\100\4\4\1\101\1\4\1\102\3\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\5\4\1\103\3\4\1\104\5\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\3\4\1\105\13\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\11\4"+
    "\1\106\5\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\14\4\1\107\2\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\3\4\1\110\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\15\4\1\111\1\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\6\4"+
    "\1\112\10\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\5\4\1\113\11\4"+
    "\1\0\4\4\15\0\1\4\63\0\1\114\73\0\1\115"+
    "\73\0\1\116\1\117\72\0\1\120\1\0\1\121\105\0"+
    "\1\122\74\0\1\123\4\0\1\64\3\0\1\64\1\0"+
    "\1\124\1\0\1\65\20\0\1\124\2\0\1\65\37\0"+
    "\1\125\3\0\1\125\1\0\1\124\2\0\1\125\17\0"+
    "\1\124\33\0\1\125\6\0\1\66\3\0\1\66\2\0"+
    "\1\64\1\65\23\0\1\65\35\0\16\12\1\0\55\12"+
    "\16\13\1\0\55\13\2\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\2\4\1\126\1\127\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\13\4\1\130\3\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\1\4"+
    "\1\131\15\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\7\4\1\132\7\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\2\4\1\133\14\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\15\4\1\134\1\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\14\4"+
    "\1\135\2\4\1\0\1\4\1\136\2\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\6\4"+
    "\1\137\10\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\3\4\1\140\13\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\3\4\1\141\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\4\4\1\142\12\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\13\4"+
    "\1\143\3\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\1\144\16\4\1\0"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\2\4\1\145\14\4\1\0\4\4\15\0"+
    "\1\4\65\0\1\146\17\0\1\125\3\0\1\125\1\0"+
    "\1\124\22\0\1\124\42\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\3\4\1\147\13\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\2\4\1\150\14\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\17\4\1\151"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\7\4\1\152\7\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\13\4\1\153\3\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\15\4\1\154"+
    "\1\4\1\0\4\4\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\1\155\16\4\1\0\4\4"+
    "\15\0\1\4\52\0\1\156\32\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\5\4\1\157\11\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\13\4\1\160\3\4\1\0\4\4\15\0\1\4"+
    "\40\0\1\161\44\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\6\4\1\162\10\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\17\4"+
    "\1\0\3\4\1\163\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\13\4\1\164\3\4\1\0"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\11\4\1\165\5\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\17\4\1\0\2\4\1\166\1\4\15\0\1\4\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4020];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\1\11\3\1\2\11\15\1\4\11"+
    "\4\1\11\11\2\1\5\11\2\1\1\0\1\11\2\1"+
    "\2\11\20\1\5\11\1\1\3\11\21\1\1\11\2\1"+
    "\1\0\4\1\1\0\2\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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
  public _OgnlLexer(){
    this((java.io.Reader)null);
  }

  int braceCount;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _OgnlLexer(java.io.Reader in) {
    this.zzReader = in;
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
    while (i < 2194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER;
            }
          case 69: break;
          case 2: 
            { return OgnlTypes.IDENTIFIER;
            }
          case 70: break;
          case 3: 
            { return OgnlTypes.INTEGER_LITERAL;
            }
          case 71: break;
          case 4: 
            { return TokenType.WHITE_SPACE;
            }
          case 72: break;
          case 5: 
            { return OgnlTypes.DOT;
            }
          case 73: break;
          case 6: 
            { return OgnlTypes.PLUS;
            }
          case 74: break;
          case 7: 
            { return OgnlTypes.CHARACTER_LITERAL;
            }
          case 75: break;
          case 8: 
            { return OgnlTypes.STRING_LITERAL;
            }
          case 76: break;
          case 9: 
            { return OgnlTypes.MODULO;
            }
          case 77: break;
          case 10: 
            { if (++braceCount > 0)  yybegin(NESTED_BRACE); return OgnlTypes.LBRACE;
            }
          case 78: break;
          case 11: 
            { return OgnlTypes.EXPRESSION_END;
            }
          case 79: break;
          case 12: 
            { return OgnlTypes.LPARENTH;
            }
          case 80: break;
          case 13: 
            { return OgnlTypes.RPARENTH;
            }
          case 81: break;
          case 14: 
            { return OgnlTypes.LBRACKET;
            }
          case 82: break;
          case 15: 
            { return OgnlTypes.RBRACKET;
            }
          case 83: break;
          case 16: 
            { return OgnlTypes.NEGATE;
            }
          case 84: break;
          case 17: 
            { return OgnlTypes.EQ;
            }
          case 85: break;
          case 18: 
            { return OgnlTypes.LESS;
            }
          case 86: break;
          case 19: 
            { return OgnlTypes.GREATER;
            }
          case 87: break;
          case 20: 
            { return OgnlTypes.COMMA;
            }
          case 88: break;
          case 21: 
            { return OgnlTypes.QUESTION;
            }
          case 89: break;
          case 22: 
            { return OgnlTypes.COLON;
            }
          case 90: break;
          case 23: 
            { return OgnlTypes.HASH;
            }
          case 91: break;
          case 24: 
            { return OgnlTypes.AT;
            }
          case 92: break;
          case 25: 
            { return OgnlTypes.DOLLAR;
            }
          case 93: break;
          case 26: 
            { return OgnlTypes.DIVISION;
            }
          case 94: break;
          case 27: 
            { return OgnlTypes.MULTIPLY;
            }
          case 95: break;
          case 28: 
            { return OgnlTypes.MINUS;
            }
          case 96: break;
          case 29: 
            { return OgnlTypes.AND;
            }
          case 97: break;
          case 30: 
            { return OgnlTypes.OR;
            }
          case 98: break;
          case 31: 
            { return OgnlTypes.XOR;
            }
          case 99: break;
          case 32: 
            { return OgnlTypes.NOT;
            }
          case 100: break;
          case 33: 
            { if (--braceCount == 0) yybegin(YYINITIAL); return OgnlTypes.RBRACE;
            }
          case 101: break;
          case 34: 
            { return OgnlTypes.BIG_INTEGER_LITERAL;
            }
          case 102: break;
          case 35: 
            { return OgnlTypes.DOUBLE_LITERAL;
            }
          case 103: break;
          case 36: 
            { return OgnlTypes.EXPRESSION_START;
            }
          case 104: break;
          case 37: 
            { return OgnlTypes.LT_KEYWORD;
            }
          case 105: break;
          case 38: 
            { return OgnlTypes.OR_KEYWORD;
            }
          case 106: break;
          case 39: 
            { return OgnlTypes.EQ_KEYWORD;
            }
          case 107: break;
          case 40: 
            { return OgnlTypes.GT_KEYWORD;
            }
          case 108: break;
          case 41: 
            { return OgnlTypes.IN_KEYWORD;
            }
          case 109: break;
          case 42: 
            { return OgnlTypes.NOT_EQUAL;
            }
          case 110: break;
          case 43: 
            { return OgnlTypes.EQUAL;
            }
          case 111: break;
          case 44: 
            { return OgnlTypes.LESS_EQUAL;
            }
          case 112: break;
          case 45: 
            { return OgnlTypes.SHIFT_LEFT;
            }
          case 113: break;
          case 46: 
            { return OgnlTypes.GREATER_EQUAL;
            }
          case 114: break;
          case 47: 
            { return OgnlTypes.SHIFT_RIGHT;
            }
          case 115: break;
          case 48: 
            { return OgnlTypes.AND_AND;
            }
          case 116: break;
          case 49: 
            { return OgnlTypes.OR_OR;
            }
          case 117: break;
          case 50: 
            { return OgnlTypes.BIG_DECIMAL_LITERAL;
            }
          case 118: break;
          case 51: 
            { return OgnlTypes.SHIFT_LEFT_KEYWORD;
            }
          case 119: break;
          case 52: 
            { return OgnlTypes.SHIFT_RIGHT_KEYWORD;
            }
          case 120: break;
          case 53: 
            { return OgnlTypes.LT_EQ_KEYWORD;
            }
          case 121: break;
          case 54: 
            { return OgnlTypes.AND_KEYWORD;
            }
          case 122: break;
          case 55: 
            { return OgnlTypes.NOT_KEYWORD;
            }
          case 123: break;
          case 56: 
            { return OgnlTypes.NEQ_KEYWORD;
            }
          case 124: break;
          case 57: 
            { return OgnlTypes.NEW_KEYWORD;
            }
          case 125: break;
          case 58: 
            { return OgnlTypes.BOR_KEYWORD;
            }
          case 126: break;
          case 59: 
            { return OgnlTypes.XOR_KEYWORD;
            }
          case 127: break;
          case 60: 
            { return OgnlTypes.GT_EQ_KEYWORD;
            }
          case 128: break;
          case 61: 
            { return OgnlTypes.SHIFT_RIGHT_LOGICAL;
            }
          case 129: break;
          case 62: 
            { return OgnlTypes.SHIFT_RIGHT_LOGICAL_KEYWORD;
            }
          case 130: break;
          case 63: 
            { return OgnlTypes.NULL_KEYWORD;
            }
          case 131: break;
          case 64: 
            { return OgnlTypes.BAND_KEYWORD;
            }
          case 132: break;
          case 65: 
            { return OgnlTypes.TRUE_KEYWORD;
            }
          case 133: break;
          case 66: 
            { return OgnlTypes.FALSE_KEYWORD;
            }
          case 134: break;
          case 67: 
            { return OgnlTypes.NOT_IN_KEYWORD;
            }
          case 135: break;
          case 68: 
            { return OgnlTypes.INSTANCEOF_KEYWORD;
            }
          case 136: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
