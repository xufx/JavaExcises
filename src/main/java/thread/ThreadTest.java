package main.java.thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * Created by xufuxiu on 2017/10/27.
 */
public class ThreadTest
{
    private int j;
    private Lock lock=new ReentrantLock();
    public static void main(String[] args)
    {
        ThreadTest tt=new ThreadTest();
        for (int i = 0; i <2 ; i++)
        {
            new Thread(tt.new Adder()).start();//调用线程的start方法后线程进入就绪状态
            new Thread(tt.new Subtractor()).start();
        }

    }
    private class Subtractor implements Runnable
    {
        @Override
        public void run()
        {
            while (true)
            {
               lock.lock();
                try 
                {
                    System.out.println("j--="+j--);;
                }finally
                {
                    lock.unlock();
                }

            }
        }
    }
    private class Adder implements Runnable
    {
        @Override
        public void run()
        {
            while (true)
            {
                lock.lock();
                try
                {
                    System.out.println("j++="+j++);;
                }finally
                {
                    lock.unlock();
                }

            }
        }
    }
}
/*
调用线程的start方法后线程进入就绪状态，线程调度系统将就绪状态的线程转为运行状态，遇到synchronized语句时，由运行状态转为阻塞，当synchronized获得锁后，由阻塞转为运行，在这种情况可以调用wait方法转为挂起状态，当线程关联的代码执行完后，线程变为结束状态

主要相同点：Lock能完成synchronized所实现的所有功能   主要不同点：Lock有比synchronized更精确的线程语义和更好的性能。synchronized会自动释放锁，而Lock一定要求程序员手工释放，并且必须在finally从句中释放。Lock还有更强大的功能，例如，它的tryLock方法可以非阻塞方式去拿锁*/
