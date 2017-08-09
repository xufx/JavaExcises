package typeinfo;
import typeinfo.interfacea.A;
import typeinfo.packageacess.*;

import static net.mindview.util.Print.print;
/**将接口实现为一个私有内部类
 * Created by Administrator on 2017/6/21.
 */
class  InnerA
{
    private static class C implements A
    {
        public void f()
        {
            print("public C.f()");
        }
        public void g(){System.out.println("C.g()");}
        void u(){print("package C.u()");}
        protected void v(){print("protected C.v()");}
        protected void w(){print("private C.w()");}
    }
    public static A makeA(){return new C();}

}
public class InnerImplementation
{
    public static void main(String[] args)
    {
        A a=InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
    }
}
