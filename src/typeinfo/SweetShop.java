package typeinfo;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
/**
 * Created by Administrator on 2017/6/18.
 */
class Candy
{
    static {System.out.println("Loading Candy");}
}
class Gum
{
    static {System.out.println("Loading Gum");}
}
class Cookie
{
    static {System.out.println("Loading Cookie");}
}
public class SweetShop
{
    public static void main(String[] args)
    {
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating Candy");
        try
        {
            Class.forName("Gum");//取得Gum对象的引用
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("couldn't find Gum");
        }
        System.out.println("after class.forName()(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");

    }
}
