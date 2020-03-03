public class Wrapper 
{
    //Wrapper Class attributes
    String type;
    String name;
    float floatValue;
    boolean boolValue;

    
    public Float asFloat(){
        return floatValue;
    }

    public Wrapper()
    {
        this.name = "";
        this.name = "";
        this.floatValue = 0.0f;
        this.boolValue = false;
    }

    public Wrapper(String name)
    {
        this.name = name;
    }
    public Wrapper(float floatValue)
    {
        this.floatValue = floatValue;
    }
    public Wrapper(boolean boolValue)
    {
        this.boolValue = boolValue;
    }
    public Wrapper(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    public Wrapper(String type, float floatValue)
    {
        this.type = type;
        this.floatValue = floatValue;
    }
    public Wrapper(String type, boolean boolValue)
    {
        this.type = type;
        this.boolValue = boolValue;
    }
    public Wrapper(String name, String type, float floatValue)
    {
        this.name = name;
        this.type = type;
        this.floatValue = floatValue;
    }
    public Wrapper(String name, String type, boolean boolValue)
    {
        this.name = name;
        this.type = type;
        this.boolValue = boolValue;
    }
   
}
