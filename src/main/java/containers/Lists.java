package containers;
import arrays.ArrayOptions;
import net.mindview.util.Countries;

import java.util.*;
/**
 * Created by Administrator on 2017/6/27.
 */
public class Lists
{
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String>it;
    private static ListIterator<String>lit;
    public static void basicTest(List<String>a)
    {//List的方法
        a.add(1,"x");
        a.add("x");
        a.addAll(Countries.names(25));
        a.addAll(3,Countries.names(25));
        b=a.contains("1");
        b=a.containsAll(Countries.names(25));
        s=a.get(1);//获取元素
        i=a.indexOf("1");//获取下标
        b=a.isEmpty();
        it=a.iterator();
        lit=a.listIterator();
        lit=a.listIterator(3);
        i=a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1,"y");
        a.retainAll(Countries.names(25));
        a.removeAll(Countries.names(25));
        i=a.size();
        a.clear();

    }
    public static void iterMotion(List<String> a)
    {//使用Iterator遍历元素，Iterator的方法
        ListIterator<String>it=a.listIterator();
        b=it.hasNext();
        b=it.hasPrevious();
        s=it.next();
        i=it.nextIndex();
        s=it.previous();
        i=it.previousIndex();
    }
    public static void iterManipulation(List<String>a)
    {//使用Iterator修改元素
        ListIterator<String>it=a.listIterator();
        it.add("47");
        it.next();
        it.remove();
        it.next();
        it.set("47");
    }
    public static void testVisual(List<String> a)
    {//查看List的操作效果
        System.out.println(a);
        List<String>b=Countries.names(25);
        System.out.println("b="+b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);

        ListIterator<String>x=a.listIterator(a.size()/2);
        x.add("one");
        System.out.println(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(a);
        x=a.listIterator(a.size());
        while (x.hasPrevious())
        {
            System.out.println(x.previous()+" ");
        }
        System.out.println("testVisual finished");

    }
    public static void main(String[] args)
    {
        //basicTest(new LinkedList<>(Countries.names(25)));
        //basicTest(new ArrayList<>(Countries.names(25)));
        //iterMotion(new LinkedList<>(Countries.names(25)));
        //iterMotion(new ArrayList<>(Countries.names(25)));
        //iterManipulation(new ArrayList<>(Countries.names(25)));
        //iterManipulation(new LinkedList<>(Countries.names(25)));
        testVisual(new LinkedList<>(Countries.names(25)));
        //testLinkedList();
    }
}
