package thread;
import java.util.*;
/**模拟实现一个ThreadLocal类,为每一个线程维护一份独立的变量副本
 * Created by xufuxiu on 2017/9/20.
 */
public class MyThreadLocal<T>
{    //键为线程对象，值是其线程对应的变量的副本
    private Map<Thread,T> map= Collections.synchronizedMap(new HashMap<Thread, T>());
    public void set(T newValue)
    {
        map.put(Thread.currentThread(),newValue);
    }
    public T get()
    {
        return map.get(Thread.currentThread());
    }
    public void remove()
    {
        map.remove(Thread.currentThread());
    }
}
