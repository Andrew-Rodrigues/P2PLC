Program ModTest;

var
   val1, val2, result : real;
begin
    val1 := 5.0;
    val2 := 2.0;
    result := val1 mod val2;
    writeln(result);
end.
{Should return 1.0}