package commonErrors;
import static util.Common.sy;
/**断言测试
 * Created by xufuxiu on 2017/9/18.
 */
public class AssertTest
{
    public static void main(String[] args)
    {
        int a=2;
        assert (a<0);
        sy("没有错");
    }
}
