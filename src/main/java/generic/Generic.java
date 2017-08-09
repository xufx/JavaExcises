package generic;

import java.util.*;

/**
 * Created by Administrator on 2017/6/6.
 */
public class Generic
{
    public static void main(String[] args)
    {
        /*
        List <String> str=new ArrayList<String>();
        str.add("liu");
        str.add("xing");
        str.add("qi");
        for (Iterator<String> iter=str.iterator();iter.hasNext();)
        {
            String s=iter.next();
            System.out.println(s);
        }
        */
        List <Integer> ints=new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        int sum=0;
        for (int i :ints)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
/*泛型最主要的优点就是让编译器追踪参数类型
一个类或者接口是泛型的意味着它有一个或多个类型变量:
public interface List<T> extends Collection<T>{}
* */