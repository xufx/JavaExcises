package polymorphism;
/**如果某个方法是静态的，它的行为就不具有多态性
 * Created by Administrator on 2017/6/12.
 */
class StaticSuper
{
    public static String staticGet()
    {
        return "Base staticGet()";
    }
    public static String dynamicGet()
    {
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper
{
    public static String staticGet()
    {
        return "Derived staticGet()";
    }
    public static String dynamicGet()
    {
        return "Derived dynamicGet()";
    }
}
public class StaticPolymorphic
{
    public static void main(String[] args)
    {
        StaticSuper sup=new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());

        StaticSub sub=new StaticSub();
        System.out.println(sub.staticGet());
        System.out.println(sub.dynamicGet());
    }
}
