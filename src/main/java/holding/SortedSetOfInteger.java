package holding;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
/**对结果排序用TreeSet
 * Created by Administrator on 2017/6/21.
 */
public class SortedSetOfInteger
{
    public static void main(String[] args)
    {
        Random rand=new Random(47);
        SortedSet<Integer> inset=new TreeSet<Integer>();
        for (int i = 0; i <10 ; i++)
        {
            inset.add(rand.nextInt(30));
        }
        System.out.println(inset);
    }
}
