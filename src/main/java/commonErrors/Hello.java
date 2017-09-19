package commonErrors;
import static util.Common.sy;
/**测试变量的初始化顺序
 * Created by xufuxiu on 2017/9/17.
 */
public class Hello
{
    public static void main(String[] args)
    {
        /*A ab=new B();
        ab=new B();*/
        try
        {
            throw new B("b");
        }catch (A e)
        {
            sy("A");
        }catch (Exception e)
        {
            sy("Exception");
        }
    }
}
