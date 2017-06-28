package containers;

import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
public class SortedSetDemo
{
    public static void main(String[] args)
    {
        SortedSet<String> sortedSet=new TreeSet<String>();
        Collections.addAll(sortedSet,"one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low=sortedSet.first();
        String high=sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String>it=sortedSet.iterator();
        for (int i = 0; i <=6 ; i++)
        {//System.out.println(it.next());
            if(i==3)low=it.next();
            if (i==6)high=it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(high);
        /*SortedSet:按对象的比较函数对元素排序*/
        System.out.println(sortedSet.subSet(low,high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));

    }
}
