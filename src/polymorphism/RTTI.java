package polymorphism;
import javax.jws.soap.SOAPBinding;
/**练习向下转型，运行时类型识别,容易出现ClassCastException
 * Created by Administrator on 2017/6/12.
 */
class Useful
{
    public void f(){System.out.println("Useful.f()");}
    public void g(){System.out.println("Useful.g()");}
}
class MoreUseful extends Useful
{
    public void f(){System.out.println("MoreUseful.f()");}
    public void g(){System.out.println("MoreUseful.g()");}
    public void u(){}
    public void v(){}
    public void w(){}
}
public class RTTI
{
    public static void main(String[] args)
    {
        Useful[] x=
                {
                        new Useful(),
                        new MoreUseful()
                };
        x[0].f();
        x[1].g();
        //x[0].u();
    }
}
