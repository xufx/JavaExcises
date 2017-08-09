package holding;
import java.util.*;
/**Foreach与迭代器
 * Created by Administrator on 2017/6/23.
 */
public class ForEachCollections
{
    public static void main(String[] args)
    {
        Collection<String>cs=new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for (String s:cs)
            System.out.println("'"+s+"'");
    }
}
