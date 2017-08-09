package containers;
import java.lang.reflect.*;
import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
public class SpringDetector
{
    public static <T extends Groundhog> void detectSpring(Class<T> type)throws Exception
    {//使用反射机制来实例化及使用Groundhog类或任何从Groundhog派生出来的类
        Constructor<T> ghog=type.getConstructor(int.class);
        Map<Groundhog,Prediction>map=new HashMap<>();
        for (int i = 0; i < 10; i++)
        {//ghog.newInstance(i)的散列码是由Object.hashCode()产生的
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.println("map="+map);
        Groundhog gh=ghog.newInstance(3);//散列码是由Groundhog(3)生成
        System.out.println("Looking up prediction for"+gh);
        if (map.containsKey(gh))//false，
            System.out.println(map.get(gh));
        else
            System.out.println("key not found:"+gh);
    }
    public static void main(String[] args) throws  Exception
    {
        detectSpring(Groundhog.class);
    }
}
