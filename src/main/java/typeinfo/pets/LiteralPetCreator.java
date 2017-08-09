package typeinfo.pets;
import java.util.*;
/**创建了两个序列，types是allTypes的子序列
 * Created by Administrator on 2017/6/19.
 */
public class LiteralPetCreator extends  PetCreator
{
    //@SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes=
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class,Dog.class,Cat.class,Rodent.class,
                    Mutt.class,Pug.class,EgyptianMau.class,
                    Manx.class,Cymric.class,Rat.class,
                    Mouse.class,Hamster.class
            ));
    /*获得子序列，从Mutt到最后*/
    public static final List<Class<? extends Pet>> types=
            allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    /*获取types的值*/
    public List<Class<? extends Pet>> types()
    {
        return types;
    }
    public static void main(String[] args)
    {
        System.out.println(allTypes);
        System.out.println(types);
    }
}

