package strings;
import net.mindview.util.TextFile;

import java.util.regex.*;
/**字符串替换
 * Created by Administrator on 2017/6/26.
 */
public class TheReplacements
{
    public static void main(String[] args)
    {
        String s= TextFile.read("F:\\xusoft\\intelliJ IDEA\\JavaExcises\\src\\strings\\TheReplaceMents.java");
        //mInput用于匹配/*！和！*/之间的所有文字
        Matcher mInput= Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
        if (mInput.find())
            s=mInput.group(1);

        s=s.replaceAll(" {2,}"," ");//将存在两个或两个以上的空格的地方缩减为一个
        /*删除每行开头部分的所有空格，*/
        s=s.replaceAll("(?m)^+","");
        System.out.println(s);

        s=s.replaceFirst("[aeiou]","(VOWEL1)");
        StringBuffer sbuf=new StringBuffer();
        Pattern p=Pattern.compile("[aeiou]");
        Matcher m=p.matcher(s);
        while (m.find())
            m.appendReplacement(sbuf,m.group().toUpperCase());
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
