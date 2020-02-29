grammar P2;

startProgram: programBlocks END '.' EOF;

programBlocks: start varDef* function* BEGIN statements (statements)*;


statements:
instVar
| instBool
| procedure
| function
| forInst
| ifBlock
| elseBlock
| whileBlock
| forBlock
| read
| write
;

function: FUNCTION expr '('variableDec')' ':' expr ';' varDef? BEGIN statements (statements)* END ';';

procedure: PROCEDURE expr '(' variableDec* ')' ';' BEGIN statements (statements)* END ';' ;

start: PROGRAM VARNAME ';';

varDef: (VAR (variableInst?  variableDec?));

variableInst: inst+;
inst: (VARNAME (',' VARNAME)* ':' expr '=' expr ';');

variableDec: dec+;
dec: (VARNAME (',' VARNAME)* ':' expr ';'?);

<<<<<<< HEAD
instVar: VARNAME ':=' expr;
=======
instVar: VARNAME ':=' expr ';';
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18

forInst: VARNAME ':=' expr TO expr DO;

<<<<<<< HEAD
instBool: VARNAME ':=' expr ';'; // might not need this
=======
instBool: VARNAME ':=' expr ';';
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18

ifBlock: IF expr THEN BEGIN statements* END;

elseBlock: ELSE BEGIN statements* END;

whileBlock: WHILE expr DO BEGIN statements (statements)* END ';' ;

forBlock: FOR forInst BEGIN statements (statements)* END ';';

read: READ  expr  ';';

write: WRITE  expr   ';'; //may need more definitions for write 

expr: 
op='-' expr  #negateExpr
| expr op=EXPO expr #expoExpr
| NOT expr          #notExpr
| op=SQUAREROOT expr #sqrtExpr
| op=NATLOG expr   #natlogExpr
| op=SINE expr    #sinExpr
| op=COSINE expr   #cosineExpr
| expr op= ':=' expr #assign
| expr op=('*' | '/' | '%' ) expr #mulDicModExpr
| expr op=(PLUS | MINUS) expr  #addSubExpr
| expr op='=' expr  #equalsExpr
| expr op='<' expr  #lessExpr
| expr op='>' expr  #greaterExpr
| expr op='<=' expr #lessEqExpr
| expr op='>=' expr #greaterEqExpr
| expr op=AND expr  #andExpr
| expr op=OR expr   #orExpr
| atom  #atomExpr
;

atom:   
<<<<<<< HEAD
'(' expr ')'        #parenExpr
| NUM               #numExpr
| REAL              #realExpr
| BOOL              #boolExpr
| (TRUE | FALSE)    #booleanValExpr
| VARNAME           #varName
=======
'(' expr ')'        #parenAtom
| NUM               #numAtom
| DO                #doAtom
| TO                #toAtom
| REAL              #realAtom
| BOOL              #boolAtom
| (TRUE | FALSE)    #booleanValAtom
| VARNAME           #varnameAtom
>>>>>>> edf0638abd67ed2c12cf04ae90b4d5124130fb18
;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

DIV : D I V ;
PROCEDURE: P R O C E D U R E;
FUNCTION: F U N C T I O N;
REAL: R E A L;
BOOL: B O O L E A N;
OR  : O R ;
AND : A N D ;
NOT : N O T ;
IF  : I F ;
THEN : T H E N ;
ELSE : E L S E ;
BEGIN : B E G I N ;
END : E N D ;
READ : R E A D L N;
WRITE : W R I T E L N;
VAR : V A R ;
ARRAY : A R R A Y;
PROGRAM : P R O G R A M ;
TRUE : T R U E ;
FALSE : F A L S E ;
SINE : S I N ;
COSINE : C O S ;
SQUAREROOT: S Q R T ;
NATLOG : L N;
EXPO : E X P;
CASE : C A S E;
OF : O F ;
CONST : C O N S T;
WHILE : W H I L E;
FOR : F O R;
DO : D O ;
TO : T O ;
PLUS : '+';
MINUS : '-';




VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: ('0' .. '9')+ (('.'('0' .. '9')+)); 
COMMENtLine : '(*' .*? '*)' -> skip; 
CommentChunk: '{' .*? '}' -> skip;
WS : [ \t\r\n]+ -> skip ;