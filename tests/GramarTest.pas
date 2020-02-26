Program elseTest;

var
   yeet : boolean;
   val :real;


begin
    a:= false;

for i := 0 to 10.0 do 
    Begin
    if a then
        val := 5.0;
        
    else
        val := 10.0;
    End;

    writeln(val); (*will print 10.0 at this point to prove else works*)
    
end. 