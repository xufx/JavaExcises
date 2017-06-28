package containers;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

import java.util.LinkedList;
import java.util.Queue;
/**Queue精确地按照元素添加的顺序保存元素
 * Created by Administrator on 2017/6/28.
 */
public class QueueBehavior
{
    private static int count=10;
    static <T> void test(Queue<T> queue, Generator<T>gen)
    {
        for (int i = 0; i < count; i++)
        {//队列添加元素
            queue.offer(gen.next());
        }
        while (queue.peek()!=null)System.out.println(queue.remove()+" ");
    }
    static class Gen implements Generator<String>
    {
        String[] s=("one two three for five six seven "+"eight nine ten").split(" ");
        int i;
        public String next()
        {//返回一个数组中的元素
            return s[i++];
        }
    }
    public static void main(String[] args)
    {
        test(new LinkedList<String>(),new Gen());
    }
}
