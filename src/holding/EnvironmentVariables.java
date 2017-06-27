package holding;

import java.util.Map;

/**显示所有操作系统环境变量
 * Created by xufuxiu on 2017/6/23.
 */
public class EnvironmentVariables
{
    public static void main(String[] args)
    {
        for(Map.Entry entry:System.getenv().entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
