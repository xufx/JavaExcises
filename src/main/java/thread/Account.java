package thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**银行账户
 * Created by xufuxiu on 2017/9/18.
 */
public class Account
{
    private double balance;//账户余额
    /*public void deposit(double money)
    {//存钱,不加同步
        double newBalance=balance+money;
        try
        {
            Thread.sleep(10);//模拟此业务需要一段处理时间
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        balance=newBalance;
    }*/
    /**
     * @param money 存入金额
     */
    /*public synchronized void deposit(double money)
    {//存钱,加同步
        double newBalance=balance+money;
        try
        {
            Thread.sleep(10);//模拟此业务需要一段处理时间
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        balance=newBalance;
    }*/

    /**为每个银行账户创建一个锁对象，在存款操作进行加锁和解锁的操作
     * Created by xufuxiu on 2017/9/18.
     */
    private Lock accountLock=new ReentrantLock();
    public void deposit(double money)
    {
        try
        {
            double newBalance=balance+money;
            try
            {
                Thread.sleep(10);//模拟此业务需要一段处理时间
            }catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            balance=newBalance;
        }finally{accountLock.unlock();}
    }
    public double getBalance()
    {
        return balance;
    }
}
