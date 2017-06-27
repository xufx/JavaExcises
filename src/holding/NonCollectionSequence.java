package holding;
import typeinfo.pets.*;

import java.util.*;

/**
 * Created by Administrator on 2017/6/23.
 */
class PetSequence
{
    protected Pet[] pets= Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence
{
    public Iterator<Pet> iterator()
    {
        return new Iterator<Pet>()
        {
            private int index=0;
            @Override
            public boolean hasNext()
            {//display方法中调用此方法
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
    public Iterable<Pet>reversed()
    {
        return new Iterable<Pet>()
        {
            public Iterator<Pet> iterator()
            {
                return new Iterator<Pet>()
                {
                    int current=pets.length-1;

                    @Override
                    public boolean hasNext()
                    {
                        return current>-1;
                    }

                    @Override
                    public Pet next()
                    {
                        return pets[current--];
                    }

                    @Override
                    public void remove()
                    {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
    public Iterable<Pet> randomized()
    {
        return new Iterable<Pet>()
        {
            public Iterator<Pet> iterator()
            {
                List<Pet> shuffled=new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled,new Random(47));
                return shuffled.iterator();

            }
        };

    }
    public static void main(Pet[] args)
    {
        NonCollectionSequence nc=new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
