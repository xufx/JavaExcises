package basics;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2017/6/10.
 */
public class ArraysOfPrimitives
{
    public static void main(String[] args)
    {
        /*
        int[] a1={1,2,3,4,5};
        int[] a2;
        a2=a1;
        for (int i = 0; i < a2.length; i++)
            a2[i]=a2[i]+1;
        for (int j = 0; j <a1.length ; j++)
            {
                System.out.println("a1["+j+"]"+a1[j]);
            }
*/
        int[] a;
        Random rand=new Random(47);
        a=new int[rand.nextInt(20)];
        System.out.println("length of a="+a.length);
        System.out.println(Arrays.toString(a));
    }
}
