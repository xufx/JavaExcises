package arrays;
import java.util.Arrays;
/**逐个地、部分地构建一个非基本类型的对象数组
 * Created by Administrator on 2017/6/26.
 */
public class AssemblingMultidimensionalArrays
{
    public static void main(String[] args)
    {
        Integer[][]a;
        a=new Integer[3][];
        for (int i = 0; i <a.length ; i++)
        {
            a[i]=new Integer[3];
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j]=i*j; //自动装箱
            }

        }
        System.out.println(Arrays.deepToString(a));
    }
}
