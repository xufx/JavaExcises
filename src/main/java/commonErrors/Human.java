package commonErrors;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/18.
 */
public class Human
{
    public static void main(String[] args)
            throws Exception//抛出一个方法，可能包含很多异常
    {
        try
        {
            try
            {
                throw new Sneeze();//抛出一个异常
            }catch (Annoyance e)
            {
                sy("Caught Annoyance");
                throw e;
            }
        }catch (Sneeze s)
        {
            sy("Caught Sneeze");
            return;
        }
        finally
        {
            sy("Hello");
        }
    }
    {
        /*输出结果：Caught Annoyance Caught Sneeze Hello*/
    }
}
