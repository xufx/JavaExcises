package holding;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;
/**Iterator将遍历序列的操作与底层的结构分离
 * Created by Administrator on 2017/6/21.
 */
public class CrossContainerIteration
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
    public static void main(String[] args)
    {
        ArrayList<Pet> pets= Pets.arrayList(8);
        LinkedList<Pet> petsLL=new LinkedList<Pet>(pets);
        HashSet<Pet>petsHS=new HashSet<Pet>(pets);
        TreeSet<Pet>petsTS=new TreeSet<Pet>(pets);

        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
