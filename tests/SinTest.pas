Program SinTest;

var
   val1, result : real;
begin
    val1 := 45.0; {in radians}
    result := sin(val1);
    writeln(result);
end.
{Should return 0.85}