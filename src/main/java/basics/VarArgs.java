package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class A{}

public class VarArgs
{
    static void printArray(Object[] args)
    {
        for (Object obj:args)
        {
            System.out.println(obj);
        }
    }
    static void printArray2(Object ... args)
    {
        for (Object obj:args)
        {
            System.out.println(obj);
        }
    }
    public static void main(String[] args)
    {
        printArray2(new Object[]{new Integer(47),new Float(3.14),new Double(11.11)});
        printArray2(new Object[]{"one","two","three"});
        printArray2(new Object[]{new A(),new A(),new A()});
        printArray2();
        printArray2((Object[])new Integer[]{4,5,6});
        printArray(new Integer[]{1,2,3,4});
    }
}
