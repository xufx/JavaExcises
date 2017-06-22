package innerclasses.controller;
import java.util.*;
/**用来管理并触发事件的实际控制框架,使变化的事物与不变的事物相分离
 * Created by Administrator on 2017/6/15.
 */
public class Controller2
{
    private List<Event>eventList2=new LinkedList<Event>();
    public void addEvent(Event c)
    {
        eventList2.add(c);
    }
    public void run()
    {
        while (eventList2.size()>0)
        {

        }
    }
}
