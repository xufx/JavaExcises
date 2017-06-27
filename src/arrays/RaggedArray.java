package arrays;
import java.util.Arrays;
import java.util.Random;
/**粗糙数组：数组中构成矩阵的每个向量都可以具有任意的长度
 * Created by Administrator on 2017/6/26.
 */
public class RaggedArray
{
    public static void main(String[] args)
    {
        Random rand=new Random(47);
        int[][][] a=new int[rand.nextInt(7)][][];
        for (int i = 0; i < a.length; i++)
        {
            a[i]=new int[rand.nextInt(5)][];
            for (int j = 0; j <a[i].length ; j++)
            {
                a[i][j]=new int[rand.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

}
