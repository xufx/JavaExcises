package strings;
import net.mindview.util.Print;
/**
 * Created by Administrator on 2017/6/25.
 */
public class Replacing
{
    static String s=Splitting.knights;
    public static void main(String[] args)
    {
        System.out.println(s);
        //以字母f开头，后面有一个或多个字符单词的替换成located，只替换第一次遇到的
        System.out.println(s.replaceFirst("f\\w+","located"));
        //将shrubbery|tree|herring中的任意一个替换成banana
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
        System.out.println(s.replaceAll("[aeiou]","_"));

    }
}
