Program CosTest;

var
   val1, result : real;
begin
    val1 := 20.0; {in radians}
    result := cos(val1);
    writeln(result);
end.
{Should return 0.408}