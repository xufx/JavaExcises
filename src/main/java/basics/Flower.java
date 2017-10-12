package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Flower
{
    int petalCount=0;
    String s="initial value";
    Flower(int petals)
    {
        petalCount=petals;
        System.out.println("constructor w/ int arg only,s="+s);

    }
    Flower(String ss)
    {
        System.out.println("constructor w/ string arg only,s="+ss);
        s=ss;
    }
    Flower(String s,int petals)
    {
       this(petals);
       this.s=s;//this.s类的成员，s:传递过来的数
        System.out.println("String & int args");
    }
    Flower()
    {
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount()
    {
        System.out.println("petalCount="+petalCount+" s="+s);
    }

    public static void main(String[] args)
    {
        Flower x=new Flower();
        x.printPetalCount();
    }

}
