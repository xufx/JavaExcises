package holding;
import java.util.*;
import typeinfo.pets.*;
/**如果实现Collection，就必须实现iterator()
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
            private int index=0;
            @Override
            public boolean hasNext()
            {
                return index<pets.length;
            }
            @Override
            public Pet next()
            {
                return pets[index++];
            }
            public void remove()
            {
                throw new   UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args)
    {
        CollectionSequence c=new CollectionSequence();
        System.out.println(c);//迭代器和pets一同初始化，调用父类的toString（）方法
        //System.out.println(c.iterator());
        /*InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());*/

    }
}
