package generic;

import java.util.*;

/**
 * Created by Administrator on 2017/6/6.
 */
public class PairTest2
{
    public static void  main(String[] args)
    {
        GregorianCalendar[] birthdays=
                {
                        new GregorianCalendar(1906,Calendar.DECEMBER,9),
                        new GregorianCalendar(1815,Calendar.DECEMBER,10),
                        new GregorianCalendar(1903,Calendar.DECEMBER,3),
                        new GregorianCalendar(1910,Calendar.JUNE,22),
                };
        Pair<GregorianCalendar> mm=ArrayAlg.minmax(birthdays);
        System.out.println("min="+mm.getFirst().getTime());
        System.out.println("max="+mm.getSecond().getTime());

    }
}
class ArrayAlg
{
/*gets the minimum and maximum of an array of objects of type T.
a:an array of objects of type t
return a pair with the min and max value,
* extends：限定子类型
* 数组参数类型：T
* */
    public static <T extends  Comparable> Pair<T>minmax(T[] a)
    {
        if (a == null || a.length==0)return  null;
        T min=a[0];
        T max=a[0];
        for (int i = 1; i <a.length ; i++)
        {
            if (min.compareTo(a[i])>0) min=a[i];
            if (max.compareTo(a[i])<0) max=a[i];
        }
        return new Pair<>(min,max);
    }
}
class Pair<T>
{
    private T first;
    private T second;
    public Pair(){first=null;second=null;}
    public Pair(T first,T second){this.first=first;this.second=second;}

    public T getFirst(){return first;}
    public T getSecond(){return second;}

    public void setFirst(T newValue){ first=newValue;}
    public void setSecond(T newValue){ second=newValue;}
}


