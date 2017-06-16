package innerclasses;
/**
 * Created by Administrator on 2017/6/15.
 */
class WithInner
{
    public WithInner()
    {
        System.out.println("WithInner constructor");
    }
    class Inner
    {
        public Inner()
        {
            System.out.println("Inner constructor");
        }
    }
}
public class InheritInner extends WithInner.Inner
{
    public InheritInner(WithInner wi)
    {
        wi.super();
        System.out.println("inhritInner constructor");
    }
    public static void main(String[] args)
    {
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner(wi);
    }
}
