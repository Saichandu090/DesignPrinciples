package Factory;

public class FactoryMain
{
    public static void main(String[] args)
    {
       OSFactory of=new OSFactory();

       OperatingSystem os=of.getInstance("open");
       os.spec();

       OperatingSystem os2=of.getInstance("closed");
       os2.spec();

       OperatingSystem os3=of.getInstance("os");
       os3.spec();
    }
}
