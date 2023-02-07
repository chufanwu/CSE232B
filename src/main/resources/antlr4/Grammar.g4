grammar Grammar ;

@header {
package edu.ucsd.cse232b.parsers;
}

/*Rules*/
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