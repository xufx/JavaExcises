package basics;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/6/9.
 */
public class StringOperators
{
    public static void main(String[] args)
    {
        /*int x=0,y=1,z=2;
        String s="x,y,z";
        System.out.println(s+x+y+z);//
        System.out.println(x+" "+s);//
        s+="(summed)=";
        System.out.println(s);
        System.out.println(s+(x+y+z));
        System.out.println(" "+x);*/

        int big=Integer.MAX_VALUE;
        System.out.println("big="+big);
        int bigger=big*4;
        System.out.println("bigger="+bigger);

        String s1="abc", s2="ABC";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1=s2);


    }
}
