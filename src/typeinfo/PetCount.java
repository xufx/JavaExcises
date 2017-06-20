package typeinfo;
import typeinfo.pets.*;

import java.util.*;
/**使用instanceof实现PetCount
 * Created by Administrator on 2017/6/19.
 */
public class PetCount
{
    static class PetCounter extends HashMap<String,Integer>
    {
        public void Count(String type)
        {
            //System.out.println("get(type)="+get(type));
            Integer quantity=get(type);
            if(quantity==null)
            {
                put(type,1);
                //System.out.printf("quantity==null,type="+type+"\n");
            }
            else
            {
                put(type,quantity+1);
                //System.out.printf("type="+type+"\n");
            }
        }
    }
    public static void countPets(PetCreator creator)
    {
        PetCounter counter=new PetCounter();
        Pet[] pets=creator.createArray(10);
        for(Pet pet:pets)//创建Pet数组，长度为10，添加到ForName序列之后，creator。size=18
        {
            System.out.printf(pet.getClass().getSimpleName()+"，");
            //instanceof限制：只能将其与命名类型比较，不能与Class对象比较
            if(pet instanceof Pet)
                counter.Count("Pet");
            if(pet instanceof Dog)
                counter.Count("Dog");
            if(pet instanceof Mutt)
                counter.Count("Mutt");
            if(pet instanceof Pug)
                counter.Count("Pug");
            if(pet instanceof Cat)
                counter.Count("Cat");
            if(pet instanceof Manx)
                counter.Count("Manx");
            if(pet instanceof EgyptianMau)
                counter.Count("EgyptianMau");
            if(pet instanceof Cymric)
                counter.Count("Cymric");
            if(pet instanceof Rodent)
                counter.Count("Rodent");
            if(pet instanceof Rat)
                counter.Count("Rat");
        }
        //System.out.printf(counter);

    }
    public static void main(String[] args)
    {
        countPets(new ForNameCreator());
    }
}

