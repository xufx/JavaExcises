package arrays;
import net.mindview.util.*;

import java.util.Arrays;
import java.util.Random;
/**比较
 * Created by Administrator on 2017/6/27.
 */
public class CompType implements Comparable<CompType>
{
    int i;
    int j;
    private static int count=1;
    public CompType(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
    @Override
    public String toString()
    {
        String result="[i="+i+",j+"+j+"]";
        if (count++%3==0)result +="\n";
        return result;
    }
    @Override
    public int compareTo(CompType rv)
    {
        return (i<rv.i?-1:(i==rv.i?0:1));
    }
    private static Random r=new Random(47);

    public static Generator<CompType>generator()
    {//生成一个CompType对象
        return new Generator<CompType>()
        {
            @Override
            public CompType next()
            {
                return new CompType(r.nextInt(100),r.nextInt(100));
            }
        };
    }
    public static void main(String[] args)
    {
        /*使用生成器填充CompType的数组*/
        CompType[] a=Generated.array(new CompType[12],generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    }
}
