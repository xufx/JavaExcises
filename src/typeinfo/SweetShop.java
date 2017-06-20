package typeinfo;
import java.util.Arrays;
import java.util.List;
/**Class 对象引用
 * Created by Administrator on 2017/6/18.
 */
class Candy
{//static子句在类第一次被加载时执行，Class对象在执行时才被加载
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
