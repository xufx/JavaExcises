package arrays;
import net.mindview.util.*;

import java.util.Arrays;
import java.util.Collections;
/**
 * Created by Administrator on 2017/6/27.
 */
public class StringSorting
{
    public static void main(String[] args)
    {
        String[] sa= Generated.array(new String[20],new RandomGenerator.String(5));
        System.out.println("befrore sort:"+ Arrays.toString(sa));

        Arrays.sort(sa);
        System.out.println("after sort:"+Arrays.toString(sa));

        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println("reverse sort:"+Arrays.toString(sa));

        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("CASE_INSENSITIVE_ORDER sort:"+Arrays.toString(sa));
    }
}
