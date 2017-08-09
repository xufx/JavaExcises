package strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Administrator on 2017/6/25.
 */
public class TestRegularExpression
{
    public static void main(String[] args)
    {
        /*
        if (args.length<2)
        {
            System.out.println("Usage:\njava TestRegularExpression"+
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input:\""+args[0]+"\"");
        for (String arg:args)
        {
            System.out.println("Regular expression:\""+arg+"\"");
            Pattern p=Pattern.compile(arg);//编译后的正则表达式
            Matcher m=p.matcher(args[0]);
            while (m.find())
            {
                System.out.println
                        ("Match \""+m.group()+"\"at positions"+m.start()+"-"+(m.end()-1));
            }
        }
        */
        /*对字符串java now has regular expressions验证正则表达式*/
        String s="Java now has regular expressions";
        System.out.println(s.matches("^Java"));
        //System.out.println(s.matches("\Breg.*"));
        //System.out.println(s.matches("n.w\s+h(a|i)s"));
    }
}
