package arrays;
import java.util.Arrays;
/**处理非基本类型的对象数组
 * Created by Administrator on 2017/6/26.
 */
public class MultidimensionalObjectArrays
{
    public static void main(String[] args)
    {
        BerylliumSphere[][]spheres=
                {
                        {new BerylliumSphere(),new BerylliumSphere()},
                        {new BerylliumSphere(),new BerylliumSphere(),
                                new BerylliumSphere(),new BerylliumSphere()},
                        {new BerylliumSphere(),new BerylliumSphere(),
                                new BerylliumSphere(),new BerylliumSphere(),
                                new BerylliumSphere(),new BerylliumSphere(),
                                new BerylliumSphere(),new BerylliumSphere(),}
                };
                System.out.println(Arrays.deepToString(spheres));
    }
}
