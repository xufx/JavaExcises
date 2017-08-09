package containers;
import net.mindview.util.Print;
/**
 * Created by Administrator on 2017/6/28.
 */
public class DequeTest
{
    static void fillTest(Deque<Integer>deque)
    {
        for (int i = 0; i <27 ; i++)
        {
            deque.addFirst(i);
        }
        for (int i = 0; i < 55; i++)
        {
            deque.addLast(i);
        }
    }
    public static void main(String[] args)
    {
        Deque<Integer> di=new Deque<Integer>();
        fillTest(di);
        System.out.println(di);
        while (di.size()!=0)System.out.println("di.removeFirst()"+di.removeFirst()+" ");
        fillTest(di);
        while (di.size()!=0)
            System.out.println("di.removeLast()"+di.removeLast()+" ");
    }
}
