program ForContinueTest;
var
   a: real;

begin
   for a := 10.0 to 20.0 do
   begin
        if( a = 16.0 ) then
            begin
                Continue;
            end
        else
            begin
                writeln(a);
            end
   end;
end.