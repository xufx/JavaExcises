package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
public class ArrayInitTest
{
    ArrayInitTest(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        ArrayInitTest[] a=
                {
                        new ArrayInitTest("hi"),
                        new ArrayInitTest("hello")
                };
        System.out.println(a.length);
    }
}
