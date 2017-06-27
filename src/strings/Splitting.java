package strings;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/25.
 */
public class Splitting
{
    public  static String knights=
            "Then,when you have found the shrubbery,you must "+
                    "cut down the mightiest tree in the forest..."+
                    "with ... a herring!";
    public static void split(String regex)
    {
        System.out.println(Arrays.toString(knights.split(regex)));//划分完字符串后，转化为数组
    }
    public static void main(String[] args)
    {
        split(" ");//按空格划分字符串
        split("\\W");//按非单词字符划分
        split("n\\W+");//根据字母n后面的非单词字符划分
        split("the|you");
       // System.out.println(knights.matches("^[A-Z] && $[!]"));
    }
}
