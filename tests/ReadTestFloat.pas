Program ReadTestFloat;

var
   val1, val2, result : real;
begin
    val1 := 5.0;
    readln(val2);
    result := val1 + val2;
    writeln(result);
end.
{Should return 5.0 + whatever user inputs}