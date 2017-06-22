package innerclasses;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.ArrayList;
import java.util.Iterator;
/**练习使用内部类
 * Created by Administrator on 2017/6/14.
 */
interface Selector
{
    boolean end();
    Object current();
    void next();
}
public class Sequence
{
    private  Object[] items;
    private int next=0;
    public Sequence(int size)
    {
        items=new Object[size];
    }
    public void add(Object x)
    {
        if(next<items.length)
        {
            items[next++]=x;
        }
    }
    private class SequenceSelector implements Selector
    {
        private int i=0;
        public boolean end(){return i==items.length;}
        @Override
        public Object current()
        {
            return items[i];
        }
        @Override
        public void next()
        {
            if(i<items.length)i++;
        }
    }
    public Selector selector()
    {
        return new SequenceSelector();
    }


}
class Test
{
    public static void main(String[] args)
    {
        Sequence sequence=new Sequence(10);
        for (int j = 0; j <10 ; j++)
        {
            sequence.add(Integer.toString(j));
        }
        Selector selector=sequence.selector();
        while (!selector.end())
        {
            System.out.println(selector.current()+" ");
            selector.next();
        }

    }
}
