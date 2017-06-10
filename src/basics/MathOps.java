package basics;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MathOps
{
    public static void main(String[] args)
    {
        Random rand=new Random(47);
        int i,j,k;
        j=rand.nextInt(100)+1;
        System.out.println("j="+j);
        k=rand.nextInt(100)+1;
        System.out.println("k="+k);
        i=j+k;
        System.out.println("i="+i);
        i=j-k;
        System.out.println("i="+i);
        i=j/k;
        System.out.println("i="+i);
        i=j%k;
        System.out.println("i="+i);
    }

}
