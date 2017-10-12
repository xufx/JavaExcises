package proxy;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by xufuxiu on 2017/9/21.
 */
public class ProxyTest2
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        Class<?>clazz=list.getClass();
        ListProxy<String> myProxy=new ListProxy<String>(list);//创建代理对象
        List<String> newList=(List<String>) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),myProxy);
        newList.add("apple");//会调用ListProxy的invoke方法
        newList.add("banana");
        newList.add("orange");
        newList.add("banana");
    }
}
