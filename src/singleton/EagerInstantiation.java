package singleton;

public class EagerInstantiation
{

    public static void main(String[] args) {

        Sai s1=Sai.getInstance();

        Sai s2=Sai.getInstance();

    }
}

class Sai
{
    static private Sai obj=new Sai();

    private Sai()
    {
        System.out.println("Instance");
    }

    public static Sai getInstance()
    {
        return obj;
    }
}
