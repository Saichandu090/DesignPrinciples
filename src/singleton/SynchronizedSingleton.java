package singleton;

public class SynchronizedSingleton
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Abc a=Abc.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Abc a=Abc.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class Abc
{
    private static Abc obj;

    private Abc()
    {
        System.out.println("New Object");
    }

    public static synchronized Abc getInstance()
    {
        if(obj==null)
        {
            obj=new Abc();
        }

        return obj;
    }
}