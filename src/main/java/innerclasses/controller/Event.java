package innerclasses.controller;
/**接口描述了要控制的事件，使用抽象类代替实际的接口
 * Created by Administrator on 2017/6/15.
 */
public abstract class Event
{
    private long eventTime;//事件开始时间
    protected final long dayTime;//延迟时间
    public Event(long dayTime)
    {
        this.dayTime = dayTime;
        start();
    }
    public void start()
    {
        eventTime=System.nanoTime()+dayTime;
    }
    public boolean ready()
    {
        return System.nanoTime()>=eventTime;
    }
    public abstract void action();

}

