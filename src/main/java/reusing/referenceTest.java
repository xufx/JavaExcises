package reusing;
/**
 * Created by xufuxiu on 2017/9/23.
 */
class AA
{
    public AA()
    {
        System.out.println("AA");
    }
}
public class referenceTest
{

    public static void main(String[] args)
    {
        AA a;
        {a=new AA();}
    }
}
