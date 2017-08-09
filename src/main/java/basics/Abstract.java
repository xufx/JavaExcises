package basics;
/**
 * Created by Administrator on 2017/6/13.
 */
abstract class Base
{
    abstract void print();
    public Base()
    {
        print();
    }
}
abstract class BaseA
{

}
class BaseB extends BaseA
{
    void f()
    {
        System.out.println("f()");
    }
    static void g( BaseA b)
    {
        //BaseB b1=b;
       System.out.println("g()");
    }
}
public class Abstract extends Base
{
    int j=9;
    @Override
    void print()
    {
        System.out.println(j);

    }
    public static void main(String[] args)
    {
        Abstract a=new Abstract();
        a.print();
    }
}
