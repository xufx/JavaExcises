package basics;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/22.
 */
public class TestThis
{
    public static final String s="123";
    public void f1()
    {
        sy("f1");
        f2();
        this.f2();
        sy(s);
    }
    public void f2()
    {
        sy("f2");
    }
    public static void main(String[] args)
    {
        sy(s);
    }
}
