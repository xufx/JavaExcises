package holding;
import net.mindview.util.CountingGenerator;

import java.util.*;
/**
 * Created by Administrator on 2017/6/22.
 */
public class QueueDemo
{
    public static void printQ(Queue queue)
    {//queue.peek()返回队头，queue.remove()移除队头元素
        while (queue.peek()!=null) System.out.println(queue.remove()+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random rand=new Random(47);
        for (int i = 0; i <10 ; i++)
        {//将int转型为Integer对象
            queue.offer(rand.nextInt(i+10));//将元素插入到队尾，或者返回false
        }
        System.out.println(queue);
        printQ(queue);
        Queue<Character>qc=new LinkedList<Character>();
        //将char转型为Chacracter对象
        for (char c:"Brontosaurus".toCharArray())qc.offer(c);
        System.out.println(qc);
        printQ(qc);
    }
}
