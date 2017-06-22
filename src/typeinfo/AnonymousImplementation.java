package typeinfo;
import typeinfo.interfacea.A;

import static net.mindview.util.Print.print;
/**匿名类实现接口
 * Created by Administrator on 2017/6/21.
 */
class AnonymousA
{
    public static A makeA()
    {
        return new A()
        {
            public void f()
            {
                print("public C.f()");
            }
            public void g(){System.out.println("C.g()");}
            void u(){print("package C.u()");}
            protected void v(){print("protected C.v()");}
            protected void w(){print("private C.w()");}
        };
    }
}
public class AnonymousImplementation
{
    public static void main(String[] args)
    {
        A a=AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
    }
}
