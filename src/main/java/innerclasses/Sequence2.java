/*
package innerclasses;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
*/
/**练习使用内部类
 * Created by Administrator on 2017/6/14.
 *//*

interface Selector2
{
    boolean end();
    Object current();
    void next();
}
public class Sequence2
{

    private int next=0;

    */
/*将x赋给items[next]*//*

    public void add(Object x)
    {
        if(next<items.length)
        {
            items[next++]=x;
        }
    }
    public static void display(Iterator<Integer> it)
    {
        while (it.hasNext())
        {
            Integer p=it.next();
            System.out.println(p);
        }
        System.out.println();

    }
    public  Object[] getItems()
    {
        return items;
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Sequence2 sequence=new Sequence2(10);
        for (int j = 0; j <10 ; j++)
        {
            sequence.add(Integer.toString(j));
        }
        ArrayList<Object> a=new ArrayList<Integer>(sequence.getItems());

    }
}
*/
