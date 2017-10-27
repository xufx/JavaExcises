package main.java.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by xufuxiu on 2017/10/27.
 */
public class CreateThread
{
    public static void main(String[] args)
    {
        new Thread(){}.start();
        new Thread()
        {
            @Override
            public void run()
            {

            }
        }.start();
        new Thread(new Runnable(){
            @Override
            public void run()
            {
            }
        }).start();
        ExecutorService pool= Executors.newFixedThreadPool(3);
        for (int i = 0; i <10 ; i++)
        {
            pool.execute(new Runnable()
            {
                @Override
                public void run()
                {
                }
            });
            Executors.newCachedThreadPool().execute(new Runnable()
            { @Override public void run(){}
            });
            Executors.newSingleThreadExecutor().execute(new Runnable()
            {
                @Override
                public void run()
                {
                }
            });
        }

    }

}
