public class Value 
{
    //Value Class attributes
    String type;
    String name;
    float floatValue;
    boolean boolValue;

    
   public Float asFloat(){
       return floatValue;
   }

    public Value(String name)
    {
        this.name = name;
    }
    public Value(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    public Value(String name, String type, float floatValue)
    {
        this.name = name;
        this.type = type;
        this.floatValue = floatValue;
    }
    public Value(String name, String type, boolean boolValue)
    {
        this.name = name;
        this.type = type;
        this.boolValue = boolValue;
    }
   
}
