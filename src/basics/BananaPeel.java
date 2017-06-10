package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class Banana
{
    void peel(int i)
    {
        System.out.println(i);
    }
}
public class BananaPeel
{
    public static void main(String[] args)
    {
           Banana a=new Banana();
           Banana b=new Banana();
        a.peel(1);
        b.peel(2);
    }
}
