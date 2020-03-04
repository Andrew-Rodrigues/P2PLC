Program EqualTest;

var
   val1, val2 : real;
   result: boolean;
begin
    val1 := 2.0;
    val2 := 2.0;
    result := val1 = val2;
    writeln(result);
end.
{Should return true}