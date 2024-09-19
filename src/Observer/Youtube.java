package Observer;

public class Youtube
{
    public static void main(String[] args) {

        Channel telusko=new Channel();

        Subscriber s1=new Subscriber("Chandu");
        Subscriber s2=new Subscriber("Sai");
        Subscriber s3=new Subscriber("deepak");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);

        telusko.upload("Design Patterns");

        telusko.unSubscribe(s3);
        System.out.println("================");

        telusko.upload("How to make Strings");
    }
}
