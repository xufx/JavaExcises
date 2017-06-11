package reusing;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Administrator on 2017/6/11.
 */
class A
{
    public A(int i)
    {
        System.out.println("A");
    }
}
class B
{
    public B(int i)
    {
        System.out.println("B");
    }
}
public class C extends  A
{
    public C(int i)
    {
        super(i);
        System.out.println("C");
    }
    public static void main(String[] args)
    {
        C c=new C(1);
    }
}
