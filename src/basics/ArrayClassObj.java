package basics;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2017/6/10.
 */
public class ArrayClassObj
{
    public static void main(String[] args)
    {
        //数组初始化1
        /*
        Random rand=new Random(47);
        Integer[] a=new Integer[rand.nextInt(20)];
        System.out.println("length of a="+a.length);
        for (int i = 0; i <a.length ; i++)
        {
            a[i]=rand.nextInt(500);
            System.out.println(Arrays.toString(a));
        }*/

        //数组初始化2
        /*Integer[] a=
                {
                        new Integer(1),
                        new Integer(2)
                };
        Integer[] b=
                {
                        new Integer(1),
                        new Integer(2)
                };*/

        //数组初始化3
        Other.main(new String[]{"fiddle","de","dum"});

    }
}
class Other
{
    public static void main(String[] args)
    {
        for (String s:args)
        {
            System.out.println(s);
        }
    }
}
