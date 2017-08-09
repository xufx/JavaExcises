package arrays;
import net.mindview.util.Generated;

import java.util.*;
/**Collections.reverseOrder() Comparator
 * Created by Administrator on 2017/6/27.
 */
public class Reverse
{
    public static void main(String[] args)
    {
        CompType[] a= Generated.array(new CompType[12],CompType.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    }
}
