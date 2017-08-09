package arrays;
import net.mindview.util.*;

import java.util.Arrays;
/**在已排序的数组中查找
 * Created by Administrator on 2017/6/27.
 */
public class ArraySearching
{
    public static void main(String[] args)
    {
        Generator<Integer> gen=new RandomGenerator.Integer(1000);
        int[] a= ConvertTo.primitive(Generated.array(new Integer[25],gen));
        Arrays.sort(a);
        System.out.println("Sorted arrays"+Arrays.toString(a));
        while (true)
        {
            int r=gen.next();
            int location=Arrays.binarySearch(a,r);
            if (location>=0)
            {
                System.out.println("Location of "+r+"is"+location+",a["+location+"]="+a[location]);
                break;
            }
        }
    }
}
