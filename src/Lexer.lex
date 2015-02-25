import java_cup.runtime.*;
      
%%

%class Lexer

%line
%column
    
%cup
   

%{   
   
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
 
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   


LineTerminator = \r|\n|\r\n
   

WhiteSpace     = {LineTerminator} | [ \t\f]
   

integer = 0 | [1-9][0-9]*
   
id = [A-Za-z_][A-Za-z_0-9]*
   
%%

   
<YYINITIAL> {

    "main"             { return symbol(sym.MAIN); } 
    "while"            { return symbol(sym.WHILE); } 
    "do"               { return symbol(sym.DO); } 
    "od"               { return symbol(sym.OD); } 
    "if"               { return symbol(sym.IF); } 
    "fi"               { return symbol(sym.FI); } 
    "then"             { return symbol(sym.THEN); } 
    "else"             { return symbol(sym.ELSE); }
    "int"              { return symbol(sym.INTEGER_TYPE);}
    ":="               { return symbol(sym.ASSIGN);}
    ":"                { return symbol(sym.COLON);}
    ";"                { return symbol(sym.SEMI); }
    "+"                { return symbol(sym.PLUS); }
    "-"                { return symbol(sym.MINUS); }
    "*"                { return symbol(sym.TIMES); }
    "/"                { return symbol(sym.DIVIDE); }
    "("                { return symbol(sym.LPAREN); }
    ")"                { return symbol(sym.RPAREN); }
    "{"                { return symbol(sym.LCURL); }
    "}"                { return symbol(sym.RCURL); }
   

    {integer}      { return symbol(sym.INTEGER_NUMBER); }
   
    {id}       { return symbol(sym.ID);}
   

    {WhiteSpace}       {  }   
}



[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
