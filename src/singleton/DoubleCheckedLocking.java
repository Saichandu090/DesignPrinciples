package singleton;

public class DoubleCheckedLocking
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

class Abc1
{
    private static Abc1 obj;

    private Abc1()
    {
        System.out.println("New Object");
    }

    public static Abc1 getInstance()
    {
        if(obj==null)
        {
            synchronized (Abc1.class)
            {
                if(obj==null)
                   obj = new Abc1();
            }
        }

        return obj;
    }
}
