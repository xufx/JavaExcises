package reusing;

/**
 * Created by Administrator on 2017/6/11.
 */
class  Art
{
    Art(){System.out.println("Art constructor");}
}
class  Drawing extends Art
{
    Drawing(){System.out.println("Drawing constructor");}
}
public class Cartoon extends Drawing
{
    public Cartoon()
    {
        System.out.println("cartoon constructor");
    }

    public static void main(String[] args)
    {
        Cartoon x;
    }
}
