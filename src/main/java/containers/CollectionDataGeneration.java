package containers;
import net.mindview.util.*;

import java.util.*;
/**
 * Created by Administrator on 2017/6/27.
 */
public class CollectionDataGeneration
{
    public static void main(String[] args)
    {
        System.out.println(new ArrayList<String>
                (CollectionData.list(new RandomGenerator.String(9),10)));
        System.out.println(new HashSet<Integer>
                (CollectionData.list(new RandomGenerator.Integer(9),10)));
    }
}
