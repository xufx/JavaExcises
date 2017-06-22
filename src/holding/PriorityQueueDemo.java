package holding;
import net.mindview.util.CountingGenerator;

import java.util.*;
/**
 * Created by Administrator on 2017/6/22.
 */
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<Integer>();
        Random rand=new Random(47);
        for (int i = 0; i <10 ; i++)
        {
            priorityQueue.offer(rand.nextInt(i+10));
        }
        System.out.println(priorityQueue);
       // QueueDemo.printQ(priorityQueue);

        List<Integer>ints= Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue=new PriorityQueue(ints);
        System.out.println(priorityQueue);
        //QueueDemo.printQ(priorityQueue);

        priorityQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);
        System.out.println(priorityQueue);
        //QueueDemo.printQ(priorityQueue);

        String fact="EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String>strings=Arrays.asList(fact.split(""));
        PriorityQueue<String>stringPQ=new PriorityQueue<String>(strings);
        System.out.println(priorityQueue);
        //QueueDemo.printQ(stringPQ);

        stringPQ=new PriorityQueue<String>(
                strings.size(),Collections.reverseOrder()
        );
        stringPQ.addAll(strings);
        System.out.println(priorityQueue);
        //QueueDemo.printQ(stringPQ);

        Set<Character> charSet=new HashSet<Character>();
        for(char c:fact.toCharArray())charSet.add(c);
        PriorityQueue<Character>charactePQ=new PriorityQueue<Character>(charSet);
        System.out.println(priorityQueue);
        //QueueDemo.printQ(charactePQ);

        Random rand2=new Random(47);
        PriorityQueue<Double>dus=new PriorityQueue<Double>();
        for(Double d=1.3;d<9.3;d++)
        {
            dus.offer(rand2.nextDouble());
        }
        System.out.println(dus);
        System.out.println(dus.poll());
    }
}
