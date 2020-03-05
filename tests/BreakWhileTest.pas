program BreakTest;
var
   a : real;

begin
   a := 10.0;

   while  a < 20.0  do
   begin
        if( a = 16.0 ) then
            begin
                Break;
            end
        else
            begin
                writeln(a);
            end
        
        a := a + 1.0;
   end;

end.