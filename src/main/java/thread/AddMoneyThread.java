package thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**存钱线程
 * 演示了100个线程同时向一个银行账户中存入1元钱
 * Created by xufuxiu on 2017/9/18.
 */
public class AddMoneyThread implements Runnable
{
    private Account account;
    private double money;
    public AddMoneyThread(Account account, double money)
    {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run()
    {
        account.deposit(money);
    }
   /* @Override
    public void run()
    {
        synchronized (account)
        {
            account.deposit(money);
        }

    }*/
    public static void main(String[] args)
    {
        Account account=new Account();
        ExecutorService service= Executors.newFixedThreadPool(100);
        for (int i = 0; i <=100 ; i++)
        {
            service.execute(new AddMoneyThread(account,1));
        }
        service.shutdown();
        while (!service.isTerminated()){}
        System.out.println("账户余额："+account.getBalance());

    }
}
