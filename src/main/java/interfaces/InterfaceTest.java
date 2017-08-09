package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface A
{
    void fa();
    void ga();
}
interface B
{
    void fb();
    void gb();
}
interface CC
{
    void fc();
    void gc();
}
interface D extends A,B,CC
{
    void d();
}
class E
{
    void e(){}
}
class Fly extends E implements D
{
    @Override
    public void fa(){}
    public void ga()
    {
    }
    public void fb(){}
    @Override
    public void gb()
    {
    }
    @Override
    public void fc(){}
    public void gc()
    {
    }
    @Override
    public void d()
    {
    }
}
public class InterfaceTest
{
    void u(A a){a.fa();}
    void v(B a){a.fb();}
    void w(CC a){a.fc();}
    void x(D a){a.d();}
    void y(E a){a.e();}
    public static void main(String[] args)
    {
        InterfaceTest i=new InterfaceTest();
        Fly fly=new Fly();
        i.u(fly);
    }
}
