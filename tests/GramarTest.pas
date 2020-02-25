Program elseTest;

var
   a : boolean;
   val :real;
   var : real = 6.0;

begin
    a:= false;

    if a then
        val := 5.0;
    else
        val := 10.0;
    writeln(val); (*will print 10.0 at this point to prove else works*)
    
end. 