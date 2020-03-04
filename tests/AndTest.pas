Program AndTest;

var
   val1, val2, result : boolean;
begin
    val1 := false;
    val2 := true;
    result := val1 AND val2;
    writeln(result);
end.
{Should return false}