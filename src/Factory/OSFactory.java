package Factory;

public class OSFactory
{
    public OperatingSystem getInstance(String input)
    {
        if(input.equalsIgnoreCase("Open"))
            return new Android();
        if(input.equalsIgnoreCase("Closed"))
            return new Apple();
        else
            return new Windows();
    }
}
