package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */

public class Amphibian
{
    void breathe(Amphibian ap)
    {
        System.out.println(ap);
    }
}
class Frog extends Amphibian
{
    @Override
    void breathe(Amphibian ap)
    {
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
        Frog f=new Frog();
        f.breathe(f);
    }
}