package typeinfo;
import net.mindview.util.Print;
import net.mindview.util.Print.*;

import java.lang.reflect.*;

import static net.mindview.util.Print.print;
/**
 * Created by Administrator on 2017/6/20.
 */
class DynamicProxyHandler implements InvocationHandler
{
    private Object proxied;
    public DynamicProxyHandler(Object proxied)
    {
        this.proxied = proxied;
    }
    /*对接口的调用被重定向到invoke的调用，将请求转给被代理的对象*/
    public Object invoke(Object proxy,Method method,Object[] args)throws Throwable
    {
        System.out.println("...proxy:"+proxy.getClass()+"\n method:"+method+"\nargs:"+args);
        if(args!=null)
        {
            for(Object arg:args)
                System.out.println(" "+args);
        }
        return method.invoke(proxied,args);
    }
}

public class SimpleDynamicProxy
{
    public static void consumer(Interface iface)
    {
        iface.doSomething();
        //iface.somethingElse("bonobo");
    }
    public static void main(String[] args)
    {
        RealObject real=new RealObject();
        consumer(real);

        /*创建动态代理*/
        Interface proxy=(Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real)
        );
        print(proxy);
        consumer(proxy);
    }
}
