package arrays;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ArrayTest
{
    int i;
    public ArrayTest(int i)
    {
        this.i = i;
    }
    public static void main(String[] args)
    {
        ArrayTest[] a1=new ArrayTest[3];
        ArrayTest[] a2=
                {
                        new ArrayTest(6),
                        new ArrayTest(6),
                        new ArrayTest(6),
                };
        Arrays.fill(a1,new ArrayTest(6));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.equals(a1,a2));
    }
}
