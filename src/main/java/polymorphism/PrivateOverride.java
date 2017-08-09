package polymorphism;
/**
 * Created by Administrator on 2017/6/12.
 */
public class PrivateOverride
{
    private void f()
    {
        System.out.println("private f()");
    }
    public static void main(String[] args)
    {
        PrivateOverride po=new PrivateOverride();
        po.f();
    }
}

class Derived extends PrivateOverride
{
    public  void f()
    {
        System.out.println("public f()");
    }
}