package typeinfo;
/**动态代理,是基本的设计模式之一，中间人的角色
 * Created by Administrator on 2017/6/20.
 */
import static net.mindview.util.Print.*;
interface Interface
{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface
{
    @Override
    public void doSomething()
    {
        print("RealObject doSomething");
    }
    @Override
    public void somethingElse(String arg)
    {
        print("RealObject somethingElse:"+arg);
    }
}
 class SimpleProxy implements Interface
{
    private Interface proxied;
    public SimpleProxy(Interface proxied)
    {
        this.proxied = proxied;
    }
    public void doSomething()
    {
        print("SimpleProxy doSomething");
        proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg)
    {
        print("SimpleProxy somethingElse:"+arg);
        proxied.somethingElse(arg);
    }
}
public class SimpleProxyDemo
{
    public static void consumer(Interface iface)
    {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args)
    {
        //consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
