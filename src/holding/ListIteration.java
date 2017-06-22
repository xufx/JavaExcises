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
        ListIterator<Pet> it=pets.listIterator();//it存储类的引用
        System.out.println("it="+it);
        while (it.hasNext()) //判断类的引用数组不为空
        {//获得类名，下一个类的索引，当前类的索引
            System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        }
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);//获得第三个类的引用
        System.out.println("it="+it);
        while (it.hasNext())
        {
            it.next();
            //System.out.println(it.next());
            it.set(Pets.randomPet());//改变第三个引用
        }
        System.out.println(pets);
    }
}
