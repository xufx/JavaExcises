package holding;
import java.util.*;
/**
 * Created by Administrator on 2017/6/21.
 */

public class ListTest
{
    public static void main(String[] args)
    {
        List<Integer> integers=new ArrayList<Integer>();
        ListIterator<Integer> in=integers.listIterator();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        List<Integer> copys=new ArrayList<Integer>();
        while (in.hasNext())
        {
            copys.add(in.next());
        }
        System.out.println(copys);
    }
}
