package arrays;
import java.util.Arrays;
/**二维数组
 * Created by Administrator on 2017/6/26.
 */
public class MultidimensionalPrimitiveArray
{
    public static void main(String[] args)
    {
        int[][] a=
                {
                        {1,2,3,},
                        {4,5,6,},
                };
                System.out.println(Arrays.deepToString(a));//将多维数组转换为多个String
    }
}
