program WhileTest;
var
   a : real;

begin
   a := 10.0;

   while  a < 20.0  do
   begin
      writeln(a);
      a := a + 1.0;
   end;

end.