package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class Test
{
    public static void main(Integer...args)
    {
        for (Integer i:args)
        {
            System.out.println(i);
        }
    }
}
public class OverloadingVarargs
{
    static void f(Character ...args)
    {
        System.out.println("first");
        for(Character c:args)
        {
            System.out.println(c);
        }
    }
    static void f(Integer ...args)
    {
        System.out.println("second");
        for(Integer c:args)
        {
            System.out.println(c);
        }
    }
    static void f(Long ...args)
    {
        System.out.println("third");
        for(Long c:args)
        {
            System.out.println(c);
        }
    }

    public static void main(String[] args)
    {
        /*
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);*/
        new Test().main(1,2,3,4,5);
    }
}
