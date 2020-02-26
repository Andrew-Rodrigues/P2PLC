Program elseTest;

var
   yeet : boolean;
   val :real;


begin
    a:= false;

procedure findMin(x, y, z: real; ); 
(* Finds the minimum of the 3 values *)

begin
   if x = y then
   begin
      m:= x;
    end
   else
   begin
      m:= y;
    end
   
   if z = m then
   begin
      m:= z;
    End
end; { end of procedure findMin }  



for i := 0.0 to 10.0 do 
    Begin
        if a then
        begin
            val := 5.0;
            if val = 5.0 then
            begin   
                val := 10.0;
            end
        end
         else
         begin
            val := 10.0;
        end

    while yeet = true do
    Begin
        if a then
        begin
            val := 5.0;
        end
        
         else
         begin
            val := 10.0;
         end
    End;


    End;

while yeet = true do
    Begin
        if a then
        begin
            val := 5.0;
        end
         else
         begin
            val := 10.0;
        end
    End;


    writeln(val); (*will print 10.0 at this point to prove else works*)
    
end. 