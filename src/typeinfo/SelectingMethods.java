package typeinfo;
import java.lang.reflect.*;
/**动态代理
 * Created by Administrator on 2017/6/20.
 */
import static net.mindview.util.Print.*;
class MethodSelector implements InvocationHandler
{
    private Object proxied;
    public MethodSelector(Object proxied)
    {
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        if(method.getName().equals("interesting"))
            print("Proxy detected the interesting method");
        print("method.invoke(proxied,args):"+method.invoke(proxied,args));
        return method.invoke(proxied,args);
    }
}
interface SomeMethods
{
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}
class Implementation implements SomeMethods
{
    public void boring1(){print("boring1");}
    public void boring2(){print("boring2");}
    public void interesting(String arg){print("intersting"+arg);}
    public void boring3(){print("boring3");}
}
public class SelectingMethods
{
    public static void main(String[] args)
    {
        /*ClassLoader loader, Class<?>[] interfaces,InvocationHandler h*/
        SomeMethods proxy=(SomeMethods)Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
                new Class[]{SomeMethods.class},
                new MethodSelector(new Implementation())//要代理的对象是Implementation
        );
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }
}
