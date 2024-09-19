package Observer;

public class Subscriber
{
    private String name;
    private Channel channel=new Channel();

    Subscriber(String name)
    {
        this.name=name;
    }
    public void update(String title)
    {
        System.out.println("Hey "+name+" video Uploaded : "+title);
    }

    public void subscribe(Channel ch)
    {
        this.channel=ch;
    }
}
