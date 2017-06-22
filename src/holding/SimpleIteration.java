package holding;
import typeinfo.pets.*;

import java.util.Iterator;
import java.util.List;
/**迭代器
 * Created by Administrator on 2017/6/18.
 */
public class SimpleIteration
{
    public static void main(String[] args)
    {
        List<Pet> pets=Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
        /*迭代显示1*/
        while (it.hasNext())//判断有值
        {
            Pet p=it.next();//取值
            System.out.println(p.id()+":"+p+" ");
        }
        /*迭代显示2，与1等价*/
        //for(Pet p:pets)System.out.println(p.id()+":"+p+" ");
        it=pets.iterator();
        for (int i = 0; i < 6; i++)
        {
            it.next();
            it.remove();//从后往前移除
        }
       // System.out.println(pets);
    }
}
