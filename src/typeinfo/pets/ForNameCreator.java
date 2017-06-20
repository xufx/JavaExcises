package typeinfo.pets;
import java.util.*;
/**创建一个Pet序列数组，序列的值如下
 * Created by Administrator on 2017/6/19.
 */
public class ForNameCreator extends PetCreator
{
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames =
            {
                    "typeinfo.pets.Mutt",
                    "typeinfo.pets.Pug",
                    "typeinfo.pets.EgyptianMau",
                    "typeinfo.pets.Manx",
                    "typeinfo.pets.Cymric",
                    "typeinfo.pets.Rat",
                    "typeinfo.pets.Mouse",
                    "typeinfo.pets.Hamster"
            };
    private static void loader()
    {
        try
        {/*用Class.forName(name)创建Class对象的List*/
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    static
    {
        loader();
    }
    public  List<Class<? extends Pet>> types()
    {
        return types;
    }
    public static void main(String[] args)
    {
        ForNameCreator f=new ForNameCreator();
        System.out.println(f.types());
    }
}
