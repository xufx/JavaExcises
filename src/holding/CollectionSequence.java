package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Administrator on 2017/6/22.
 */
public class CollectionSequence extends AbstractCollection<Pet>
{
    private Pet[] pets=Pets.createArray(8);//随机创建Pet数组
    public int size(){return pets.length;}
    public Iterator<Pet>iterator()
    {
        return new Iterator<Pet>()
        {
            @Override
            public boolean hasNext()
            {
                return false;
            }
            @Override
            public Pet next()
            {
                return null;
            }
        };
    }
}
