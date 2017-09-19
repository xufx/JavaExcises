package commonErrors;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class B extends A
{
    String b="";
    static
    {
        System.out.println("a");
    }
    public B()
    {
        System.out.println("b");
    }
    public B(String b)
    {
        this.b = b;
    }
}
