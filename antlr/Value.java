public class Value 
{
    //Value Class attributes
    String type;
    String name;
    float realValue;
    boolean boolValue;
   

    public Value(String name)
    {
        this.name = name;
    }
    public Value(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    public Value(String name, String type, float realValue)
    {
        this.name = name;
        this.type = type;
        this.realValue = realValue;
    }
    public Value(String name, String type, boolean boolValue)
    {
        this.name = name;
        this.type = type;
        this.boolValue = boolValue;
    }
   
}
