package containers;
import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
class SetType
{
    int i;
    public SetType(int i)
    {
        this.i = i;
    }
    public boolean equals(Object o)
    {
        return o instanceof SetType && (i==((SetType)o).i);
    }
    @Override
    public String toString()
    {//产生i的值
        return Integer.toString(i);
    }
}
class HashType extends SetType
{
    public HashType(int i)
    {
        super(i);
    }
    public int hashCode(){return i;}
}
class TreeType extends SetType implements Comparable<TreeType>
{
    public TreeType(int i)
    {
        super(i);
    }
    @Override
    public int compareTo(TreeType arg)
    {
        return (arg.i<i?-1:(arg.i==i?0:1));
    }
}
public class TypesForSets
{
    static <T> Set<T> fill(Set<T> set,Class<T> type)
    {
        try
        {
            for (int i = 0; i <10 ; i++)
            {//获得类的构造函数并创建实例
                set.add(type.getConstructor(int.class).newInstance(i));
            }
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        return set;
    }
    static <T> void test(Set<T> set,Class<T> type)
    {
       fill(set,type);
        fill(set,type);
        fill(set,type);
        System.out.println(set);
    }
    public static void main(String[] args)
    {
        //test(new HashSet<HashType>(),HashType.class);
        //test(new LinkedHashSet<HashType>(),HashType.class);
        test(new LinkedHashSet<TreeType>(),TreeType.class);
    }
}
