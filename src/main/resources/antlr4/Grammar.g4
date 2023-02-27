grammar Grammar ;

@header {
package edu.ucsd.cse232b.parsers;
}

/*Rules*/
xq      : var                               #XqVariable
        | StringConstant                    #XqString
        | ap                                #XqAp
        | '(' xq ')'                        #XqParentheses
        | xq ',' xq                         #XqAppend
        | xq '/' rp                         #XqChildren
        | xq '//' rp                        #XqDescendant
        | beginTag '{' xq '}' endTag        #Xqtag
        | forClause letClause? whereClause? returnClause #XqQuery
        | letClause xq                      #XqLet
        ;

var     : '$' ID
        ;

beginTag : '<' ID '>'                        #XqBeginTag
        ;

endTag  : '</' ID '>'                       #XqEndTag
        ;

forClause : 'for' var 'in' xq (',' var 'in' xq )*
          ;

letClause : 'let' var ':=' xq (',' var ':=' xq)*
          ;

whereClause : 'where' cond
            ;

returnClause : 'return' xq
            ;

cond        : xq '=' xq                     #CondEqual
            | xq 'eq' xq                    #CondEqual
            | xq '==' xq                    #CondSame
            | xq 'is' xq                    #CondSame
            | 'empty' '(' xq ')'            #CondEmpty
            | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond                  # CondSome
            | '(' cond ')'                  # CondParentheses
            | cond 'and' cond               # CondAnd
            | cond 'or' cond                # CondOr
            | 'not' cond                    # CondNot
            ;


ap      : doc '/' rp                        # ApChildren
        | doc '//' rp                       # ApDescendant;

doc     : 'doc("' fileName '")'             # DocFile;

fileName        : ID ('.' ID)*              #File;

rp      : ID                                #TagName
        | '*'                               #Childen
        | '.'                               #Cur
        | '..'                              #Parent
        | 'text()'                          #Text
        | '@' ID                            #AtrributeName
        | '(' rp ')'                        #RpParentheses
        | rp '/' rp                         #RpChildren
        | rp '//' rp                        #RpDescendant
        | rp '[' filter ']'                 #RpFilter
        | rp ',' rp                         #RpAppend;

filter  : rp                                #FilterRp
        | rp '=' rp                         #FilterEqual
        | rp 'eq' rp                        #FilterEqual
        | rp '==' rp                        #FilterSame
        | rp 'is' rp                        #FilterSame
        | rp '=' StringConstant             #FilterString
        | '(' filter ')'                    #FilterParentheses
        | filter 'and' filter               #FilterAnd
        | filter 'or' filter                #FilterOr
        | 'not' filter                      #FilterNot;


/*Tokens*/
ID : [a-zA-Z][a-zA-Z_0-9]*;
WS: [ \t\n\r]+ -> skip;
StringConstant: '"'[a-zA-Z0-9_ ,.!?;'"-]+'"';