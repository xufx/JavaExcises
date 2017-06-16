package innerclasses;
/**通过实例初始化，为匿名内部类创建一个构造器
 * Created by Administrator on 2017/6/14.
 */
abstract class Base
{
    public Base(int i)
    {
        System.out.println("Base constructor.i="+i);
    }
    public abstract void f();
}
public class AnonymousConstructor
{
    public static Base getBase(int i)
    {
        return new Base(i)
        {
            {System.out.println("inside instance initializer");}
            public void f()
            {
                System.out.println("in anonymous f()");
            }
        };
    }
    public static void main(String[] args)
    {
        Base base=getBase(47);
        base.f();
    }
}
