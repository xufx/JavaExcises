package typeinfo.pets;
import java.util.*;
/**
 * Created by Administrator on 2017/6/18.
 */
public abstract class PetCreator
{
    private Random rand=new Random(47);
    public abstract  List<Class<? extends Pet>>types();

    public Pet randomPet()
    {//随机产生List的索引
        int n=rand.nextInt(types().size());
        try
        {
            return types().get(n).newInstance();
        }catch (InstantiationException e)
        {
            throw new RuntimeException(e);
        }catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
    public Pet[] createArray(int size)
    {
        Pet[] result=new Pet[size];
        for (int i = 0; i <size ; i++)
        {
            result[i]=randomPet();

        }
        return result;
    }
    public ArrayList<Pet> arrayList(int size)
    {
        ArrayList<Pet> result=new ArrayList<Pet>();
        Collections.addAll(result,createArray(size));
        return result;
    }
}
