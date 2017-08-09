package innerclasses;
/**
 * Created by Administrator on 2017/6/15.
 */
interface Counter
{
    int next();
}
public class LocalInnerClass
{
    private int count=0;
    Counter getCounter(final String name)
    {
        class LocalCounter implements Counter
        {
            public LocalCounter()
            {
                System.out.println("LocalCounter()");
            }
            @Override
            public int next()
            {

                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name)
    {
        class LocalCounter implements Counter
        {
            public LocalCounter()
            {
                System.out.println("Counter()");
            }
            @Override
            public int next()
            {

                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    public static void main(String[] args)
    {
        LocalInnerClass lic=new LocalInnerClass();
        Counter c1=lic.getCounter("local Inner"),
                c2=lic.getCounter2("Anomnymous inner");
        for (int i = 0; i <5 ; i++)
        {
            System.out.println(c1.next());
        }
        for (int i = 0; i <5 ; i++)
        {
            System.out.println(c1.next());
        }

    }
}
