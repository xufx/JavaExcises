package typeinfo;
import typeinfo.interfacea.A;
/**
 * Created by Administrator on 2017/6/20.
 */
class B implements A
{
    @Override
    public void f()
    {
        System.out.println("B.f()");
    }
    public void g(){System.out.println("B.g()");}
}
public class InterfaceViolation
{
    public static void main(String[] args)
    {
        A a=new B();
        a.f();
        System.out.println(a.getClass().getName());
        if(a instanceof B)
        {
            B b=(B)a;
            b.g();
        }
    }
}
