package singleton;

public class LazyInstantiation
{
    public static void main(String[] args) {

        Chandu c2=Chandu.getInstance();
        c2.i=12;
        c2.show();
        Chandu c1=Chandu.getInstance();
        c1.i=100;
        c2.show();
    }
}

class Chandu
{
    static private Chandu obj;

    int i;
    public void show()
    {
        System.out.println(i);
    }
    private Chandu()
    {
        System.out.println("Instance Created!!");
    }

    public static Chandu getInstance()
    {
        if(obj==null)
        {
            obj=new Chandu();
        }
        return obj;
    }
}
