package main.java.thread;
/**
 * Created by xufuxiu on 2017/10/27.
 */
public class MultiThread
{
    public static void main(String[] args)
    {
        new Thread(new Thread1()).start();
        try 
        {
            Thread.sleep(10);
        }catch ( InterruptedException e)
        {
            e.printStackTrace();
        }
        new Thread(new Thread2()).start();
    }
    static class Thread1 implements Runnable
    {
        @Override
        public void run()
        {/*用MultiThread.class这个字节码对象，当前虚拟机里引用这个变量时，指向的都是同一个对象。*/
            synchronized (MultiThread.class)
            {
                System.out.println("enter thread1...");
                System.out.println("thread1 is waiting");
                try 
                {//释放锁有两种方式，第一种方式是程序自然离开监视器的范围，也就是离开了 synchronized关键字管辖的代码范围，另一种方式就是在synchronized关键字管辖的代码内部调用监视器对象的wait方法。这里，使用wait方法释放锁。
                    MultiThread.class.wait();
                }catch ( InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("thread1 is going on...");
                System.out.println("thread1 is being over...");
            }
        }
    }
    static class Thread2 implements Runnable
    {
        @Override
        public void run()
        {
            synchronized (MultiThread.class)
            {
                System.out.println("enter thread2...");
                System.out.println("thread2 notify other thread can  release wait status..");
                //由于notify方法并不释放锁， 即使thread2调用下面的sleep方法休息了10毫秒，但thread1仍然不会执行，因为thread2没有释放锁，所以Thread1无法得不到锁。
                MultiThread.class.notify();
                System.out.println("thread2 is sleeping ten millisecond...");
                try
                {
                    Thread.sleep(10);
                }catch ( InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("thread2 is going on...");
                System.out.println("thread2 is being over...");
            }
        }
    }
}

