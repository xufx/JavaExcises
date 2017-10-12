package arrays;
import static util.Common.sw;
/**
 * Created by xufuxiu on 2017/9/23.
 */
public class OverloadingVarargs
{
    static void  f(Character ... args)
    {
        sw("first:");
        for(Character c:args)
        {
            sw(""+c);
        }
    }
    static void  f(Integer ... args)
    {sw("\n");
        sw("second:");
        for(Integer c:args)
        {
            sw(" "+c);
        }
    }
    static void  f(Long ... args)
    {System.out.println();
        sw("third:");
        for(Long c:args)
        {
            sw(" "+c);
        }
    }
    public static void main(String[] args)
    {
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
    }
}
