package thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
/**
 * Created by xufuxiu on 2017/9/18.
 */
public class MyTask implements Callable<Integer>
{
    private int upperBounds;//截止日期
    public MyTask(int upperBounds)
    {
        this.upperBounds = upperBounds;
    }
    @Override
    public Integer call() throws Exception
    {
        int sum=0;
        for (int i = 1; i <=upperBounds ; i++)
        {
            sum+=i;
        }
        return sum;
    }
     public static void main(String[] args)throws  Exception
      {
          List<Future<Integer>>list=new ArrayList<>();
          //创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。线程池的大小一旦达到最大值就会保持不变，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
          ExecutorService service=Executors.newFixedThreadPool(10);
          for (int i = 0; i <10 ; i++)
          {
              MyTask my=new MyTask((int)(Math.random()*100));
              list.add(service.submit(my));
          }
          int sum=0;
          for ( Future<Integer> future:list)
          {
              sum+=future.get();
          }
        System.out.println(sum);
    }
}
