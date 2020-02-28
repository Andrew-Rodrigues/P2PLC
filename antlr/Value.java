public class Value 
{

    public static Value VOID = new Value(new Object());

    final Object value;
    
    public Value(Object value) 
    {
        this.value = value;
    }

    public Boolean asBoolean() 
    {
        return (Boolean)value;
    }

    public Float asFloat() 
    {
        return (Float)value;
    }

    public boolean isFloat() 
    {
        return value instanceof Float;
    }
}