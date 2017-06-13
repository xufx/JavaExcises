package reusing;
/**
 * Created by Administrator on 2017/6/12.
 */
class WithFinals
{
    private final void f()
    {
        System.out.println("WithFinals.f()");
    }
    private void g()
    {
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends WithFinals
{
    private final void f()
    {
        System.out.println("OverridingPrivate.f()");
    }
    private void g()
    {
        System.out.println("OverridingPrivate.g()");
    }
    public final void  m()
    {
        System.out.println("OverridingPrivate.m()");
    }
}

class OverridingPrivate2 extends OverridingPrivate
{
    public final void f()
    {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g()
    {
        System.out.println("OverridingPrivate2.g()");
    }
    /*public final void m()
    {
        System.out.println("OverridingPrivate2.m()");
    }*/
}
public class FinalOverridingIllusion
{
    public static void main(String[] args)
    {
        OverridingPrivate2 op2=new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op=op2;
        /*op.f();
        op.g();
        WithFinals wf=op2;
        wf.f();
        wf.g();*/
    }
}
