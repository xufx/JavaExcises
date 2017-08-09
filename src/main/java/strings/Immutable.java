package strings;
/**不可变的String
 * Created by Administrator on 2017/6/24.
 */
public class Immutable
{
    public static String upcase(String s)
    {//局部变量只有在方法运行时才存在
        return s.toUpperCase();
    }
    public static void main(String[] args)
    {
        String q="howdy";
        System.out.println(q);
        String qq=upcase(q);//传递的是对象“howdy”的引用
        System.out.println(qq);
        System.out.println(q);
    }
}
