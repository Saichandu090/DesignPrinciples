package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel
{
    List<Subscriber> list=new ArrayList<>();

     String title;

    public void subscribe(Subscriber s)
    {
        list.add(s);
    }

    public void unSubscribe(Subscriber s)
    {
        list.remove(s);
    }

    public void notifyall()
    {
        for(Subscriber sub : list)
        {
            sub.update(title);
        }
    }

    public void upload(String title)
    {
        this.title=title;
        notifyall();
    }
}
