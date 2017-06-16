package innerclasses;
/**创建内部类对象
 * Created by Administrator on 2017/6/14.
 */
public class DotThis
{
    void f()
    {
        System.out.println("DotThis.f()");
    }
    public class Inner
    {
        public DotThis outer()
        {
            System.out.print(DotThis.this);
            return DotThis.this;//返回DotThis对象
        }
    }
    public Inner inner()
    {
        return new Inner();
    }
    public static void main(String[] args)
    {
        DotThis Dt=new DotThis();
        DotThis.Inner dti= Dt.inner();//内部类的对象
        dti.outer().f();
    }
}
class DotNew
{
    public class Inner
    { }
    public static void main(String[] args)
    {
        DotNew dn=new DotNew();
        DotNew.Inner dni=dn.new Inner();
    }
}
