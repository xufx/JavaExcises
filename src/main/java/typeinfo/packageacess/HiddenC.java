package typeinfo.packageacess;
/**
 * Created by Administrator on 2017/6/20.
 */
import typeinfo.interfacea.*;
import static net.mindview.util.Print.*;
class C implements A
{
    @Override
    public void f()
    {
        print("public C.f()");
    }
    public void g(){System.out.println("C.g()");}
    void u(){print("package C.u()");}
    protected void v(){print("package C.v()");}
    protected void w(){print("package C.w()");}
}

public class HiddenC
{
    public static A makeA(){return new C();}
}
