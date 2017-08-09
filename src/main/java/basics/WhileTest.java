package basics;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/10.
 */
public class WhileTest
{
    static boolean condition()
    {
        boolean result=Math.random()<0.99;
        System.out.println(result+",");
        return result;
    }

    public static void main(String[] args)
    {/*
        while(condition())
        {
            System.out.println("inside while");
            System.out.println("exit while");
        }*/
/*

        for (int i = 0; i < 128; i++)
        {
            if (Character.isLowerCase(i))
                System.out.println("value:"+(int)i+"character:"+i);
        }
*/

        /*Random rand=new Random(10);
        System.out.println("rand="+rand);
        float f[]=new float[10];
        for (int i = 0; i <10 ; i++)
        {
            f[i]=rand.nextFloat();
            for (float x:f)
            {
                System.out.println(x);
            }
        }*/
        /*
        for (char c:"An African Swallow".toCharArray())
        {
            System.out.println(c);
        }*/

    }

}
