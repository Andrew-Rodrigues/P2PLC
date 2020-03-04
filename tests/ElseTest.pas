program ElseTest;
var
   { local variable definition }
   a, ifVal, elseVal: real;

begin
   a := 100.0;
   ifVal := 1.0;
   elseVal := -1.0;

   (* check the boolean condition *)
   if( a < 20.0 ) then
      begin
         writeln(ifVal);
      end
   else
      begin
         writeln(elseVal);
      end
      
end.