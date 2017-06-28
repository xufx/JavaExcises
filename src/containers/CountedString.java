package containers;
import net.mindview.util.Countries;

import java.util.*;
/**
 * Created by Administrator on 2017/6/28.
 */
public class CountedString
{//id:包含相同String的CountiedString对象的编号
    private static List<String>created=new ArrayList<>();
    private String s;
    private int id=0;
    public CountedString(String s)
    {
        this.s = s;
        created.add(s);
        for (String s2:created)
            if (s2.equals(s))id++;
    }
    @Override
    public String toString()
    {
        return "string:"+s+" id:"+id+" hashcode():"+hashCode();
    }
    public int hashCode()
    {
        int result=17;
        result=37*result+s.hashCode();
        result=37*result+id;
        return result;
    }
    public boolean equals(Object o)
    {
        return o instanceof CountedString && s.equals(((CountedString)o).s)&&
                id==(((CountedString)o).id);

    }
    public static void main(String[] args)
    {
        Map<CountedString,Integer>map=
                new HashMap<>();
        CountedString[] cs=new CountedString[5];
        for (int i = 0; i < cs.length; i++)
        {
            cs[i]=new CountedString("hi");
            map.put(cs[i],i);
        }
        System.out.println(map);
        for (CountedString cstring:cs)
        {
            System.out.println("Looking up "+cstring);
            System.out.println(map.get(cstring));
        }
    }
}
