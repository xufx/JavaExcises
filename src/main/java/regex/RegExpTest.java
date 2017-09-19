package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by xufuxiu on 2017/9/19.
 */
public class RegExpTest
{
    public static void main(String[] args)
    {
        String str="北京市(朝阳区)(西城区)(海淀区)";
        //从字符串中截取第一个英文左括号之前的字符串
        Pattern p=Pattern.compile(".*?(?=\\()");
        Matcher m=p.matcher(str);
        if (m.find())System.out.println(m.group());
    }
}
