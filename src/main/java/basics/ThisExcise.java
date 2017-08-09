package basics;

/**
 * Created by Administrator on 2017/6/10.
 */

public class ThisExcise
{
    void method2(){System.out.println("method2");}
    void method1()
    {
        System.out.println("method1");
    }
    public static void main(String[] args)
    {
          ThisExcise t=new ThisExcise();
          t.method1();
    }
}
