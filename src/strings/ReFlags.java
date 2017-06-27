package strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**Pattern和Matcher
 * Created by Administrator on 2017/6/26.
 */
public class ReFlags
{
    public static void main(String[] args)
    {
        /*编译你的正则表达式*/
        Pattern p=Pattern.compile("^java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        /*将要检索的字符串传到Matcher对象*/
        Matcher m=p.matcher(
                        "java has regex\nJava has regex\n"+
                                "JAVA has pretty good regular expressions\n"+
                                "Regular expresssions are in Java");
        while (m.find())System.out.println(m.group());//返回已经匹配的部分

    }
}
