package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class  Cup {
    Cup(int marker)
    {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker)
    {
        System.out.println("f("+marker+")");
    }
}
class Cups
{
    static Cup cup1;
    static Cup cup2;
    static
    {//静态对象初始化
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    Cups()
    {
        System.out.println("Cups()");
    }
}
public class ExplicitStatic
{
    public static void main(String[] args)
    {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}
