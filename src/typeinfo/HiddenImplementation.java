package typeinfo;
import typeinfo.packageacess.HiddenC;
/**
 * Created by Administrator on 2017/6/20.
 */
import typeinfo.interfacea.*;
import static net.mindview.util.Print.*;
import java.lang.reflect.*;
public class HiddenImplementation
{
    public static void main(String[] args)
    {
        A a= HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        //callHiddenMethod(a,"g");
    }
    static void callHiddenMethod(Object a,String methodName)throws Exception
    {
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
