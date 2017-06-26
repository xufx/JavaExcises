package strings;
import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Administrator on 2017/6/26.
 */
public class JGrep
{
    public static void main(String[] args)throws Exception
    {
        if (args.length<2)
        {
            System.out.println("Usage:java JGrep file regex");
            System.exit(0);
        }
        Pattern p=Pattern.compile(args[1]);
        //通过行迭代
        int index=0;
        Matcher m=p.matcher("");
        for(String line:new TextFile(args[0]))
        {
            m.reset(line);
            while (m.find())
            {
                System.out.println(index++ +":"+m.group()+":"+m.start());
            }
        }
    }
}
