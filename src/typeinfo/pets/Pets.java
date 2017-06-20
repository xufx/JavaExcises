package typeinfo.pets;
import typeinfo.*;
import java.util.*;
/**
 * Created by Administrator on 2017/6/19.
 */
public class Pets
{//覆盖的是PetCreator中的函数
    public static final PetCreator creator=
            new LiteralPetCreator();
    public static Pet randomPet()
    {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size)
    {
        return creator.createArray(size);
    }
    /*创建序列，添加数组到序列后面*/
    public static ArrayList<Pet> arrayList(int size)
    {
        return creator.arrayList(size);
    }
}
