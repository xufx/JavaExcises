package typeinfo.pets;
import java.util.*;
/**随机创建任意类型的宠物
 * Created by Administrator on 2017/6/18.
 */
public abstract class PetCreator
{
    private Random rand=new Random(47);
    //types()方法返回一个序列，序列里面的对象类型都继承自Pet
    public abstract  List<Class<? extends Pet>>types();

    /*创建一个宠物的具体对象*/
    public Pet randomPet()
    {//随机产生List的索引，创建任意宠物对象
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
    /*创建size个宠物对象，存到result数组中*/
    public Pet[] createArray(int size)
    {
        Pet[] result=new Pet[size];
        for (int i = 0; i <size ; i++)
        {
            result[i]=randomPet();

        }
        return result;
    }
    /*随机创建包含size个元素的序列，对象为Pet类型*/
    public ArrayList<Pet> arrayList(int size)
    {//arrayList方法返回ArrayList序列，序列里面的对象都是Pet类型
        ArrayList<Pet> result=new ArrayList<Pet>();//result序列存储的是Pet类型的对象
        Collections.addAll(result,createArray(size));//result列表添加元素
        return result;
    }
}
