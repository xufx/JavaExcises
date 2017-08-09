package holding;
import net.mindview.util.CountingGenerator;

import java.util.*;
/**
 * Created by Administrator on 2017/6/18.
 */
public class Gerbil2
{
    int gerbiNumber;
    String name;
    public Gerbil2(int gerbiNumber)
    {
        this.gerbiNumber = gerbiNumber;
    }
   public void hop()
   {
       System.out.format("Gerbil is %d hopping %n",+gerbiNumber);
   }
    public static void main(String[] args)
    {
       Map<String,Gerbil2>gerbil2=new HashMap<String,Gerbil2>();
        gerbil2.put("Fuzzy",new Gerbil2(1));
        gerbil2.put("Spot",new Gerbil2(2));
        Iterator<Map.Entry<String,Gerbil2>>iterator=gerbil2.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<java.lang.String,holding.Gerbil2>entry=
                    (Map.Entry<java.lang.String,holding.Gerbil2>)iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());//获得键和值的引用
            entry.getValue().hop();
        }
    }
}
