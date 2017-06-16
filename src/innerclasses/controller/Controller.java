package innerclasses.controller;

import java.util.*;
/**用来管理并触发事件的实际控制框架,使变化的事物与不变的事物相分离
 * Created by Administrator on 2017/6/15.
 */
public class Controller
{
    private List<Event>eventList=new ArrayList<Event>();
    public void addEvent(Event c)
    {
        eventList.add(c);
    }
    public void run()
    {
        while (eventList.size()>0)
        {
            for (Event e:new ArrayList<Event>(eventList))

            {
                if(e.ready())
                {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

}
