package holding;
import java.util.*;

import typeinfo.pets.*;
/**容器和迭代器
 * Created by Administrator on 2017/6/22.
 */
public class InterfaceVsIterator
{
    public static void display(Iterator<Pet> it)
    {
        while (it.hasNext())
        {
            Pet p=it.next();
            System.out.println(p.id()+":"+p);
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets)
    {
        for(Pet p:pets)
            System.out.println(p.id()+":"+p);
        System.out.println();
    }
    public static void main(String[] args)
    {
        List<Pet>petList= Pets.arrayList(8);
        Set<Pet>petSet=new HashSet<Pet>(petList);
        Map<String,Pet>petMap=new LinkedHashMap<String,Pet>();

        String[] names=("Ralph,Eric,Robin,Lacey,"+"Britney,Sam,Spot,Fluffy,").split(",");
        for (int i = 0; i <names.length ; i++)
        {
            petMap.put(names[i],petList.get(i));
        }
        /*
        System.out.println(petList);//[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
        System.out.println(petSet);//[Rat]
        System.out.println(petMap);//{Ralph=Rat, Eric=Manx, Robin=Cymric, Lacey=Mutt, Britney=Pug, Sam=Cymric, Spot=Pug, Fluffy=Manx}
        System.out.println(petList.iterator());//java.util.ArrayList$Itr@4554617c
        System.out.println(petSet.iterator());//java.util.HashMap$KeyIterator@74a14482
        System.out.println(petMap.keySet());//[Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy]
        System.out.println(petMap.values());//[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
        System.out.println(petMap.values().iterator());//java.util.LinkedHashMap$LinkedValueIterator@1540e19d
        System.out.println(petMap.keySet().iterator());//java.util.LinkedHashMap$LinkedKeyIterator@677327b6
        */

        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}
