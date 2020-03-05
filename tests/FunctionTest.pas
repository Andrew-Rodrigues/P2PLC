program FunctionTest;
var
   a, b, ret : real;

(*function definition *)
function max(num1, num2: real): real;
var
   (* local variable declaration *)
   result: real;

begin
   if (num1 > num2) then
      begin
         result := num1;
      end
   else
      begin
         result := num2;
      end
   max := result;
end;

begin
   a := 100.0;
   b := 200.0;
   (* calling a function to get max value *)
   ret := max(a, b);
   
   writeln(ret);
end.