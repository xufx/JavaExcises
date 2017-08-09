package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class  Tree
{
    int height;
    Tree()
    {
        System.out.println("planting a seeding");
        height=0;
    }
    Tree(int initialHeight)
    {
        height=initialHeight;
        System.out.println("creating new tree that is "+height+" feet tall");
    }
    void info()
    {
        System.out.println("tree is "+height+" feet tall");
    }
    void info(String s)
    {
        System.out.println(s+":tree is "+height+" feet tall");
    }
}
public class OverLoading
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            Tree t=new Tree(i);
            t.info();
            t.info("overloading method");
        }
    }
}
