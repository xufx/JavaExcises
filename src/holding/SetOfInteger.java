package holding;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * Created by Administrator on 2017/6/21.
 */
public class SetOfInteger
{
    public static void main(String[] args)
    {
        Random rand=new Random(47);
        Set<Integer>inset=new HashSet<Integer>();
        for (int i = 0; i <10 ; i++)
        {
            inset.add(rand.nextInt());
        }
        System.out.println(inset);
    }
}
