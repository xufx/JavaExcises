package strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Administrator on 2017/6/26.
 */
public class Resetting
{
    public static void main(String[] args)throws Exception
    {/*输出三个字母*/
        Matcher m= Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find())
            System.out.println(m.group()+" ");
        m.reset("fix the rig with rags");
        while (m.find())System.out.println(m.group()+" ");
    }
}
