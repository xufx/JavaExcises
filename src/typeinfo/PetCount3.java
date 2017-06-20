package typeinfo;
import typeinfo.pets.*;
import net.mindview.util.*;
import java.util.*;
/**动态的instanceof
 * Created by Administrator on 2017/6/19.
 */
public class PetCount3
{
    /*PetCounter类继承自LinkedHashMap，key是Pet类型的序列，value是Integer类型*/
    static class PetCounter
    extends LinkedHashMap<Class<? extends Pet>,Integer>
    {
        public PetCounter()
        {//构造器
            super(MapData.map(LiteralPetCreator.allTypes,0));
        }
        public void count(Pet pet)
        {
            for(Map.Entry<Class<? extends  Pet>,Integer> pair:entrySet())
                if((pair.getKey().isInstance(pet)))
                    put(pair.getKey(),pair.getValue()+1);
        }
        @Override
        public String toString()
        {
            StringBuilder result=new StringBuilder("{");
            for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet())
            {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(",");
            }
            result.delete(result.length()-2,result.length());
            result.append("}");
           return result.toString();
        }
    }
    public static void main(String[] args)
    {
        PetCounter petCount=new PetCounter();
        for(Pet pet:Pets.createArray(20))
        {
            System.out.println(pet.getClass().getSimpleName()+" ");
            petCount.count(pet);
        }
        System.out.println(petCount);
    }
}
