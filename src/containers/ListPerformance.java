package containers;
import net.mindview.util.CountingIntegerList;

import java.util.*;
/**
 * Created by Administrator on 2017/6/29.
 */
public class ListPerformance
{
    static Random rand=new Random();
    static int reps=1000;
    static List<Test<List<Integer>>>tests=new ArrayList<>();
    static List<Test<LinkedList<Integer>>>qTests=new ArrayList<>();
    static
    {
        tests.add(new Test<List<Integer>>("add")
        {
           int test(List<Integer>list,TestParam tp)
           {
               int loops=tp.loops;
               int listSize=tp.size;
               for (int i = 0; i < loops; i++)
               {
                   list.clear();
                   for (int j = 0; j <listSize ; j++)
                   {
                       list.add(j);
                   }
               }
               return loops*listSize;
           }
        });
        tests.add(new Test<List<Integer>>("get")
        {
            int test(List<Integer>list,TestParam tp)
            {
                int loops=tp.loops*reps;
                int listSize=list.size();
                for (int i = 0; i < loops; i++)
                {
                    list.get(rand.nextInt(listSize));
                }
                return loops;
            }
        });
        tests.add(new Test<List<Integer>>("iteradd")
        {
            int test(List<Integer>list,TestParam tp)
            {
                final int LOOPS=1000000;
                int half=list.size()/2;
                ListIterator<Integer> it=list.listIterator(half);
                for (int i = 0; i < LOOPS; i++)
                {
                    it.add(47);
                }
                return LOOPS;
            }
        });
        tests.add(new Test<List<Integer>>("insert")
        {
            int test(List<Integer>list,TestParam tp)
            {
                int loops=tp.loops;
                int listSize=list.size();
                for (int i = 0; i < loops; i++)
                {
                    list.add(5,47);
                }
                return loops;
            }
        });
        tests.add(new Test<List<Integer>>("remove")
        {
            int test(List<Integer>list,TestParam tp)
            {
                int loops=tp.loops;
                int size=tp.size;
                for (int i = 0; i < loops; i++)
                {
                    list.clear();
                    list.addAll(new CountingIntegerList(size));
                    while (list.size()>5))list.remove(5);
                }
                return loops*size;
            }
        });
    }
}
