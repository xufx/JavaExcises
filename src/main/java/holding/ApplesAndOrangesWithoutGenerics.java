package holding;
import java.util.ArrayList;
/**
 * Created by Administrator on 2017/6/18.
 */
class Apple
{
    private static long counter;
    private final long id=counter++;
    public long counter(){return  counter;}
    public long id(){return  id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics
{
    public static void main(String[] args)
    {
        ArrayList apples=new ArrayList();
        for (int i = 0; i <3 ; i++)
        {
            apples.add(new Apple());
            System.out.println("counter="+((Apple)apples.get(i)).counter());
            System.out.println("id="+((Apple)apples.get(i)).id());
        }
            apples.add(new Orange());
        for (int i = 0; i <apples.size() ; i++)
        {
            ((Apple)apples.get(1)).id();//获得的是Object引用，必须将其转为Apple
        }

    }

}
