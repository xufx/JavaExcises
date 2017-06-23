package holding;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
/**如果实现Collection，就必须实现iterator()
 * Created by Administrator on 2017/6/22.
 */
public class CollectionSequence2 implements Collection<Pet>
{
    private Pet[] pets=Pets.createArray(8);//随机创建Pet数组
    public int size(){return pets.length;}
    @Override
    public Pet[] toArray()
    {
        return pets;
    }
    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }
    @Override
    public boolean add(Pet pet)
    {
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c)
    {
        return false;
    }
    @Override
    public boolean isEmpty()
    {
        return false;
    }
    @Override
    public boolean remove(Object o)
    {
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c)
    {
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends Pet> c)
    {
        return false;
    }
    @Override
    public boolean removeIf(Predicate<? super Pet> filter)
    {
        return false;
    }
    @Override
    public Spliterator<Pet> spliterator()
    {
        return null;
    }
    @Override
    public Stream<Pet> stream()
    {
        return null;
    }
    @Override
    public Stream<Pet> parallelStream()
    {
        return null;
    }
    @Override
    public void forEach(Consumer<? super Pet> action)
    {
    }
    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
    }
    @Override
    public Iterator<Pet> iterator()
    {
        return null;
    }
    @Override
    public void clear()
    {
    }
    @Override
    public boolean contains(Object o)
    {
        return false;
    }
    public static void main(String[] args)
    {
        CollectionSequence2 c=new CollectionSequence2();
        System.out.println(c);//迭代器和pets一同初始化，调用父类的toString（）方法
        //System.out.println(c.iterator());
        /*InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());*/

    }
}
