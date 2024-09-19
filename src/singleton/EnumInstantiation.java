package singleton;

public class EnumInstantiation
{

    public static void main(String[] args) {

        Soul s=Soul.INSTANCE;
        s.i=9;
        s.show();

        Soul s1=Soul.INSTANCE;
        s1.i=90;
        s.show();
    }
}

enum Soul
{
    INSTANCE;
    int i;
    public void show()
    {
        System.out.println(i);
    }
}