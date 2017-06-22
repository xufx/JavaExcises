package holding;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**键：由Random产生的数字，值：该数字出现的次数
 * Created by Administrator on 2017/6/22.
 */
public class Statistics
{
    public static void main(String[] args)
    {
        Random rand=new Random(47);
        Map<Integer,Integer>m=new HashMap<Integer,Integer>();
        for (int i = 0; i <10 ; i++)
        {
            int r=rand.nextInt(20);//键
            Integer freq=m.get(r);//值
            m.put(r,freq==null?1:freq+1);

        }
        System.out.println(m);
    }
}
