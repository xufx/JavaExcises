package containers;
import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.*;
/**
 * Created by Administrator on 2017/6/30.
 */
public class SetPerformance
{
    static List<Test<Set<Integer>>>tests=new ArrayList<>();
    static
    {
        tests.add(new Test<Set<Integer>>("add")
        {
            @Override
            int test(Set<Integer> set, TestParam tp)
            {
                int loops=tp.loops;
                int size=tp.size;
                for (int i = 0; i <loops ; i++)
                {
                    set.clear();
                    for (int j = 0; j < size; j++)
                    {
                        set.add(j);
                    }
                }
                return loops*size;
            }
        });
        tests.add(new Test<Set<Integer>>("contains")
        {
            @Override
            int test(Set<Integer> set, TestParam tp)
            {
                int loops=tp.loops;
                int size=tp.size*2;
                for (int i = 0; i <loops ; i++)
                {
                    set.clear();
                    for (int j = 0; j < size; j++)
                    {
                        set.contains(j);
                    }
                }
                return loops*size;
            }
        });
        tests.add(new Test<Set<Integer>>("iterate")
        {
            @Override
            int test(Set<Integer> set, TestParam tp)
            {
                int loops=tp.loops*10;
                for (int i = 0; i <loops ; i++)
                {
                    Iterator<Integer> it = set.iterator();
                    while (it.hasNext())it.next();
                }return loops*set.size();
            }
        });
    }
    public static void main(String[] args)
    {
        if (args.length>0)
        {
            Tester.defaultParams=TestParam.array(args);
        }
        Tester.fieldWidth=10;
        Tester.run(new TreeSet<Integer>(),tests);
    }
}
