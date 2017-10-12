package proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
/**使用动态代理为ArrayList编写一个代理，在添加和删除元素时，在控制台打印添加或删除的元素以及ArrayList的大小
 * Created by xufuxiu on 2017/9/20.
 */
public class ListProxy<T> implements InvocationHandler
{
    private List<T> target;
    public ListProxy(List<T> target)
    {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Object retVal=null;
        System.out.println("["+method.getName()+":"+args[0]+"]");
        retVal=method.invoke(target,args);
        System.out.println("[size="+target.size()+"]");
        return retVal;
    }
}
