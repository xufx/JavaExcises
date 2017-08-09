package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class StaticTest2
{
    static String s1="HELLO";
    static String s2;
    static
    {
        s2="HI";
    }
    void p()
    {
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
    }
}
public class StaticTest
{
    public static void main(String[] args)
    {
        StaticTest2 t=new StaticTest2();
        t.p();
    }
}
