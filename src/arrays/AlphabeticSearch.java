package arrays;
import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/27.
 */
public class AlphabeticSearch
{
    public static void main(String[] args)
    {
        String[] sa= Generated.array(new String[30],new RandomGenerator.String(5));
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(sa));

        int index=Arrays.binarySearch(sa,sa[10],String.CASE_INSENSITIVE_ORDER);
        System.out.println("index:"+index+"\n"+sa[index]);

    }
}
