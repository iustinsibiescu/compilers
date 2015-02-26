
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\060\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\016\000\002\003\013\000\002\004\005" +
    "\000\002\005\003\000\002\005\003\000\002\006\005\000" +
    "\002\006\003\000\002\006\002\000\002\007\006\000\002" +
    "\010\004\000\002\010\003\000\002\011\011\000\002\012" +
    "\013\000\002\012\011\000\002\013\004\000\002\013\003" +
    "\000\002\014\004\000\002\014\003\000\002\015\005\000" +
    "\002\015\003\000\002\015\003\000\002\016\004\000\002" +
    "\016\004\000\002\017\004\000\002\020\005\000\002\021" +
    "\004\000\002\021\004\000\002\022\003\000\002\022\003" +
    "\000\002\022\003\000\002\022\003\000\002\022\003\000" +
    "\002\023\005\000\002\023\005\000\002\023\003\000\002" +
    "\024\005\000\002\024\005\000\002\024\003\000\002\024" +
    "\004\000\002\025\005\000\002\025\003\000\002\025\003" +
    "\000\002\026\003\000\002\026\003\000\002\026\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\006\037\010\044\006\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\144\001\002\000\004\004\116" +
    "\001\002\000\006\037\010\044\006\001\002\000\004\040" +
    "\011\001\002\000\010\004\021\030\017\034\012\001\002" +
    "\000\004\017\107\001\002\000\022\004\031\030\017\031" +
    "\ufff4\033\ufff4\034\012\036\ufff4\041\ufff4\043\ufff4\001\002" +
    "\000\022\004\uffed\030\uffed\031\uffed\033\uffed\034\uffed\036" +
    "\uffed\041\uffed\043\uffed\001\002\000\022\004\uffeb\030\uffeb" +
    "\031\uffeb\033\uffeb\034\uffeb\036\uffeb\041\uffeb\043\uffeb\001" +
    "\002\000\004\041\106\001\002\000\004\017\075\001\002" +
    "\000\006\025\073\027\034\001\002\000\006\026\064\027" +
    "\034\001\002\000\022\004\uffea\030\uffea\031\uffea\033\uffea" +
    "\034\uffea\036\uffea\041\uffea\043\uffea\001\002\000\010\004" +
    "\021\030\017\034\012\001\002\000\010\004\uffef\030\uffef" +
    "\034\uffef\001\002\000\004\025\026\001\002\000\010\004" +
    "\uffe8\030\uffe8\034\uffe8\001\002\000\022\004\031\030\017" +
    "\031\ufff5\033\ufff5\034\012\036\ufff5\041\ufff5\043\ufff5\001" +
    "\002\000\010\004\ufff0\030\ufff0\034\ufff0\001\002\000\004" +
    "\027\034\001\002\000\022\004\uffee\030\uffee\031\uffee\033" +
    "\uffee\034\uffee\036\uffee\041\uffee\043\uffee\001\002\000\004" +
    "\025\063\001\002\000\020\004\043\013\046\014\041\015" +
    "\040\016\042\017\047\022\035\001\002\000\014\004\043" +
    "\014\041\015\040\016\042\017\047\001\002\000\016\020" +
    "\uffd6\021\uffd6\022\uffd6\023\uffd6\024\uffd6\025\uffd6\001\002" +
    "\000\016\020\uffd9\021\uffd9\022\uffd9\023\uffd9\024\uffd9\025" +
    "\uffd9\001\002\000\016\020\uffd3\021\uffd3\022\uffd3\023\uffd3" +
    "\024\uffd3\025\uffd3\001\002\000\016\020\uffd4\021\uffd4\022" +
    "\uffd4\023\uffd4\024\uffd4\025\uffd4\001\002\000\016\020\uffd2" +
    "\021\uffd2\022\uffd2\023\uffd2\024\uffd2\025\uffd2\001\002\000" +
    "\016\020\uffd5\021\uffd5\022\uffd5\023\uffd5\024\uffd5\025\uffd5" +
    "\001\002\000\016\020\uffdc\021\uffdc\022\uffdc\023\056\024" +
    "\055\025\uffdc\001\002\000\010\021\052\022\053\025\uffe5" +
    "\001\002\000\004\025\uffe4\001\002\000\016\004\043\014" +
    "\041\015\040\016\042\017\047\022\035\001\002\000\010" +
    "\020\051\021\052\022\053\001\002\000\016\020\uffd7\021" +
    "\uffd7\022\uffd7\023\uffd7\024\uffd7\025\uffd7\001\002\000\016" +
    "\004\043\014\041\015\040\016\042\017\047\022\035\001" +
    "\002\000\016\004\043\014\041\015\040\016\042\017\047" +
    "\022\035\001\002\000\016\020\uffdd\021\uffdd\022\uffdd\023" +
    "\056\024\055\025\uffdd\001\002\000\014\004\043\014\041" +
    "\015\040\016\042\017\047\001\002\000\014\004\043\014" +
    "\041\015\040\016\042\017\047\001\002\000\016\020\uffdb" +
    "\021\uffdb\022\uffdb\023\uffdb\024\uffdb\025\uffdb\001\002\000" +
    "\016\020\uffda\021\uffda\022\uffda\023\uffda\024\uffda\025\uffda" +
    "\001\002\000\016\020\uffde\021\uffde\022\uffde\023\056\024" +
    "\055\025\uffde\001\002\000\016\020\uffd8\021\uffd8\022\uffd8" +
    "\023\uffd8\024\uffd8\025\uffd8\001\002\000\022\004\uffec\030" +
    "\uffec\031\uffec\033\uffec\034\uffec\036\uffec\041\uffec\043\uffec" +
    "\001\002\000\014\005\072\006\065\007\070\010\066\011" +
    "\071\001\002\000\012\020\uffdf\025\uffdf\027\uffdf\042\uffdf" +
    "\001\002\000\012\020\uffe1\025\uffe1\027\uffe1\042\uffe1\001" +
    "\002\000\012\020\uffe6\025\uffe6\027\uffe6\042\uffe6\001\002" +
    "\000\012\020\uffe3\025\uffe3\027\uffe3\042\uffe3\001\002\000" +
    "\012\020\uffe2\025\uffe2\027\uffe2\042\uffe2\001\002\000\012" +
    "\020\uffe0\025\uffe0\027\uffe0\042\uffe0\001\002\000\010\004" +
    "\uffe9\030\uffe9\034\uffe9\001\002\000\004\025\uffe7\001\002" +
    "\000\016\004\043\014\041\015\040\016\042\017\047\022" +
    "\035\001\002\000\010\020\077\021\052\022\053\001\002" +
    "\000\004\032\100\001\002\000\010\004\021\030\017\034" +
    "\012\001\002\000\006\031\102\033\103\001\002\000\022" +
    "\004\ufff1\030\ufff1\031\ufff1\033\ufff1\034\ufff1\036\ufff1\041" +
    "\ufff1\043\ufff1\001\002\000\010\004\021\030\017\034\012" +
    "\001\002\000\004\031\105\001\002\000\022\004\ufff2\030" +
    "\ufff2\031\ufff2\033\ufff2\034\ufff2\036\ufff2\041\ufff2\043\ufff2" +
    "\001\002\000\004\002\ufff6\001\002\000\016\004\043\014" +
    "\041\015\040\016\042\017\047\022\035\001\002\000\010" +
    "\020\111\021\052\022\053\001\002\000\004\035\112\001" +
    "\002\000\010\004\021\030\017\034\012\001\002\000\004" +
    "\036\114\001\002\000\022\004\ufff3\030\ufff3\031\ufff3\033" +
    "\ufff3\034\ufff3\036\ufff3\041\ufff3\043\ufff3\001\002\000\004" +
    "\002\001\001\002\000\004\017\117\001\002\000\006\004" +
    "\120\020\ufff7\001\002\000\004\026\064\001\002\000\004" +
    "\020\125\001\002\000\006\020\ufff8\042\123\001\002\000" +
    "\006\004\120\020\ufff7\001\002\000\004\020\ufff9\001\002" +
    "\000\004\040\126\001\002\000\010\004\021\030\017\034" +
    "\012\001\002\000\006\041\132\043\130\001\002\000\020" +
    "\004\043\013\141\014\041\015\040\016\042\017\047\022" +
    "\035\001\002\000\004\041\134\001\002\000\004\025\133" +
    "\001\002\000\006\037\ufffd\044\ufffd\001\002\000\004\026" +
    "\135\001\002\000\014\005\072\006\065\007\070\010\066" +
    "\011\071\001\002\000\004\025\137\001\002\000\006\037" +
    "\ufffe\044\ufffe\001\002\000\010\021\052\022\053\025\ufffb" +
    "\001\002\000\004\025\ufffa\001\002\000\004\025\143\001" +
    "\002\000\004\041\ufffc\001\002\000\004\002\000\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\010\002\004\003\006\007\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\002\114\003\006\007\003\001\001\000\002\001\001\000" +
    "\024\010\015\011\021\012\014\013\022\014\012\015\013" +
    "\016\023\017\024\020\017\001\001\000\002\001\001\000" +
    "\010\011\021\012\014\015\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\021\073\001\001\000\004\021\032\001\001\000\002" +
    "\001\001\000\020\011\021\012\014\014\026\015\013\016" +
    "\027\017\024\020\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\011\021\012\014\015" +
    "\031\001\001\000\002\001\001\000\004\021\032\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\023\044\024" +
    "\043\025\036\026\035\001\001\000\006\025\061\026\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\023\047\024\043\025\036\026\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\024\060\025\036\026" +
    "\035\001\001\000\010\024\053\025\036\026\035\001\001" +
    "\000\002\001\001\000\006\025\057\026\035\001\001\000" +
    "\006\025\056\026\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\022\066\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\023\075\024\043\025\036\026\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\024\010\100\011\021" +
    "\012\014\013\022\014\012\015\013\016\023\017\024\020" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\024" +
    "\010\103\011\021\012\014\013\022\014\012\015\013\016" +
    "\023\017\024\020\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\023\107\024\043\025" +
    "\036\026\035\001\001\000\002\001\001\000\002\001\001" +
    "\000\024\010\112\011\021\012\014\013\022\014\012\015" +
    "\013\016\023\017\024\020\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\120\020\121\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\006\123\020\121\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\010\126" +
    "\011\021\012\014\013\022\014\012\015\013\016\023\017" +
    "\024\020\017\001\001\000\004\004\130\001\001\000\014" +
    "\005\141\023\137\024\043\025\036\026\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\022\135\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
	boolean syntaxErrors;

	public void syntax_error(Symbol current_token) {
	syntaxErrors = true;
	report_error(
		"Syntax error at line " + (current_token.left+1) + ", column "
		+ current_token.right + current_token.toString() +"\n\n\n\n\n", null
	);
	}
	public void report_fatal_error(String message, Object info) {
		report_error("", null);
		done_parsing();
	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= function_body program 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= main 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // function_body ::= FDEF ID LPAREN function_declr RPAREN LCURL body return RCURL COLON type SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_body",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // function_body ::= FDEF ID LPAREN function_declr RPAREN LCURL body RCURL SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_body",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // return ::= RETURN return_val SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // return_val ::= expr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return_val",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // return_val ::= CHARACTER_VALUE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return_val",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // function_declr ::= normal_declr COMMA function_declr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_declr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // function_declr ::= normal_declr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_declr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // function_declr ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_declr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // main ::= MAIN LCURL body RCURL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("main",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // body ::= declrs stmts 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("body",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // body ::= stmts 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("body",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // whileblock ::= WHILE LPAREN expr RPAREN DO body OD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("whileblock",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ifblock ::= IF LPAREN expr RPAREN THEN body ELSE body FI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ifblock",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ifblock ::= IF LPAREN expr RPAREN THEN body FI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ifblock",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // declrs ::= declrs declr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declrs",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // declrs ::= declr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declrs",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // stmts ::= stmts stmt 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmts",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // stmts ::= stmt 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmts",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // stmt ::= ID assignment SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // stmt ::= ifblock 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // stmt ::= whileblock 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("stmt",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // declr ::= normal_declr SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declr",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // declr ::= init_declr SEMI 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declr",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // init_declr ::= normal_declr assignment 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("init_declr",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // normal_declr ::= ID COLON type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("normal_declr",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // assignment ::= ASSIGN expr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // assignment ::= ASSIGN CHARACTER_VALUE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // type ::= INTEGER_TYPE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // type ::= FLOAT_TYPE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // type ::= RATIONAL_TYPE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // type ::= BOOLEAN_TYPE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // type ::= CHARACTER_TYPE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expr ::= expr PLUS factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expr ::= expr MINUS factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expr ::= factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // factor ::= factor TIMES term 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // factor ::= factor DIVIDE term 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // factor ::= term 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // factor ::= MINUS term 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // term ::= LPAREN expr RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // term ::= numerical_val 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // term ::= ID 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // numerical_val ::= INTEGER_NUMBER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("numerical_val",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // numerical_val ::= FLOAT_NUMBER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("numerical_val",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // numerical_val ::= RATIONAL_NUMBER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("numerical_val",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
