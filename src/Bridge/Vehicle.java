package Bridge;

abstract class Vehicle
{
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    Vehicle(WorkShop workShop1,WorkShop workShop2)
    {
        this.workShop1=workShop1;
        this.workShop2=workShop2;
    }

    abstract void manufacture();
}

class Bike extends Vehicle
{
    Bike(WorkShop workShop1,WorkShop workShop2)
    {
        super(workShop1,workShop2);
    }
    @Override
    void manufacture()
    {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
    }
}

class Car extends Vehicle
{
    Car(WorkShop workShop1,WorkShop workShop2)
    {
        super(workShop1,workShop2);
    }

    @Override
    void manufacture() {
        System.out.print("Car ");
        workShop1.work();
        workShop2.work();
    }
}


interface WorkShop
{
    void work();
}

class Produce implements WorkShop
{
    @Override
    public void work()
    {
        System.out.print("Manufactured");
    }
}

class Assemble implements WorkShop
{

    @Override
    public void work()
    {
        System.out.println(" And Assembled!!");
    }
}

class Main
{
    public static void main(String[] args) {

        Vehicle v1=new Car(new Produce(),new Assemble());
        v1.manufacture();
        System.out.println("==================");
        Vehicle v2=new Bike(new Produce(),new Assemble());
        v2.manufacture();
    }
}