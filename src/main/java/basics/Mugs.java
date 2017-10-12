package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class Mug
{
    Mug(int marker)
    {
        System.out.println("Mug("+marker+")");
    }
    void f(int marker)
    {
        System.out.println("f("+marker+")");
    }
}
public class Mugs
{
    Mug mug1;
    Mug mug2;
    {
        mug1=new Mug(1);//每次new时都会被初始化
        mug2=new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mugs()
    {
        System.out.println("Mugs");
    }
    Mugs(int i)
    {
        System.out.println("Mugs(int)");
    }
    public static void main(String[] args)
    {
        System.out.println("inside main");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1)completed");
    }
}
