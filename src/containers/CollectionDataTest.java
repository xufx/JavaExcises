package containers;
import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

import java.util.*;
/**
 * Created by Administrator on 2017/6/27.
 */
class Government implements Generator<String>
{
    String[] foundation=("strange women lying in ponds"+
            "distributing swords is no basis for a system of"+
            "government").split(" ");
    private  int index;
    @Override
    public String next()
    {
        return foundation[index++];
    }
}
public class CollectionDataTest
{
    public static void main(String[] args)
    {
        Set<String> set=new LinkedHashSet<String>
                (
                new CollectionData<String>(new Government(),15)
        );
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
