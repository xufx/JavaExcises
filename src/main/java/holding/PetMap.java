package holding;
import java.util.*;
import typeinfo.pets.*;
import static  net.mindview.util.Print.*;
/**
 * Created by Administrator on 2017/6/22.
 */
public class PetMap
{
    public static void main(String[] args)
    {
        Map<String,Pet>petMap=new HashMap<String,Pet>();
        petMap.put("My cat",new Cat("Molly"));
        petMap.put("My Dog",new Dog("Ginger"));
        petMap.put("My Hamster",new Hamster("bosco"));
        print(petMap);
        Pet dog=petMap.get("My Dog");//获得键‘My Dog'的值
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
}
