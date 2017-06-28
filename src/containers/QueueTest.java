package containers;
import java.util.PriorityQueue;
import java.util.Random;
/**
 * Created by Administrator on 2017/6/28.
 */
public class QueueTest extends PriorityQueue<QueueTest>
        implements Comparable<Integer>
{
    Integer integer=new Random(47).nextInt(100);
    public QueueTest(Integer integer)
    {
        this.integer = integer;
    }
    @Override
    public int compareTo(Integer o)
    {
        return 0;
    }
    public void add(int in)
    {
        super.add(new QueueTest(in));
    }
    public static void main(String[] args)
    {
        QueueTest queueTest=new QueueTest(12);
        for (int i = 0; i <5 ; i++)
        {
            queueTest.add(i);
        }
        System.out.println(queueTest);
    }
}
