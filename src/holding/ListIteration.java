package holding;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;
/**
 * Created by Administrator on 2017/6/21.
 */
public class ListIteration
{
    public static void main(String[] args)
    {
        List<Pet> pets= Pets.arrayList(8);
        ListIterator<Pet> it=pets.listIterator();//java.util.ArrayList$ListItr@xxx istItr是ArrayList的静态类
        System.out.println("it="+it);
        while (it.hasNext())
        {
            System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        }
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);//java.util.ArrayList$ListItr@XXX
        System.out.println("it="+it);
        while (it.hasNext())
        {
            it.next();
            //System.out.println(it.next());
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
