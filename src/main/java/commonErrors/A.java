package commonErrors;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class A extends Exception
{
    static
    {
        System.out.println("1");
    }
    public A()
    {
        System.out.println("2");
    }
}
