Program ReadTestBoolean;

var
   val1, val2, result : boolean;
begin
    val1 := true;
    readln(val2);
    result := val1 AND val2;
    writeln(result);
end.
{Should return true && whatever user inputs}