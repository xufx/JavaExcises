package strings;
import java.util.regex.*;
import static  net.mindview.util.Print.*;
/**获取每行的最后三个词
 * Created by Administrator on 2017/6/26.
 */
public class Groups
{
    static  public final String POEM=
            "Twas brilling.and the slithy toves\n"+
            "Did gyre and gimble in the wabe.\n"+
            "All mimsy were the borogoves.\n"+
            "And the mome raths outgrabe.\n\n"+
            "Beware the Jabberwock.my son.\n"+
                    "The jaws that bite.the claws that catch.\n"+
                    "Beware the Jubjub bird.and shun\n"+
                    "The frumious Bandersnatch.";
    public static void main(String[] args)
    {
        Matcher m= Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        System.out.println("m.find():"+m.find());
        System.out.println("m.groupCount():"+m.groupCount());
        while (m.find())
        {
            for (int i = 0; i < m.groupCount(); i++)
            {
                printnb("["+m.group(i)+"]");
               //System.out.println("["+m.group(i)+"]");
            }
        }
    }
}
