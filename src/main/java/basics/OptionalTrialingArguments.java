package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
public class OptionalTrialingArguments
{
    static  void f(int required,String[] trailing)
    {
        System.out.println(required);
        for(String s:trailing)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {//可变参数列表
        f(1,new String[]{"one","two"});
        f(1,new String[]{"one","two","three","four"});

    }

}
