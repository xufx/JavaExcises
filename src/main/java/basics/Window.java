package basics;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/22.
 */
public class Window
{
    Window(int marker)
    {
        sy("window("+marker+")");
    }
    public static void main(String[] args)
    {
       House h=new House();
        h.f();
    }
}
class House
{
    static String s="123";
    Window w1=new Window(1);
    public House()
    {
        sy("House()");
        w3=new Window(33);
    }
    Window w2=new Window(2);
    void f(){sy("f()");}
    Window w3=new Window(3);

}
