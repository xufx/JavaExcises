package holding;
import net.mindview.util.CountingGenerator;
import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;
/**列出SetOperations.java中的所有字符
 * Created by Administrator on 2017/6/21.
 */
public class UniqueWordsAlphabetic
{
    public static void main(String[] args)
    {
        Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
               words.addAll( new TextFile("F:\\xusoft\\intelliJ IDEA\\JavaExcises\\src\\holding\\SetOperations.java","\\w+"));

        System.out.println(words);
    }
}
