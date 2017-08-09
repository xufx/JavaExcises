package basics;

/**
 * Created by Administrator on 2017/6/10.
 */

public class IfElse
{
    static int result=0;
    static void test(int testval,int target)
    {
        if (testval>target)
        {
            result=1;
        }
        else if(testval<target)
        {
            result=-1;
        }
        else
        {
            result=0;
        }
    }
    public static void main(String[] args)
    {
            test(10,5);
        System.out.println(result);
    }
}
