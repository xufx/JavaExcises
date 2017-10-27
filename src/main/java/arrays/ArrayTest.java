package arrays;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ArrayTest
{
    public static int staticVar;
    public int instanceVar;
    public void  VariantTest()
    {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar="+staticVar+",instanceVar="+instanceVar);
    }
    //int i;
    //public ArrayTest(int i)
    //{
    //    this.i = i;
    //}
    public static boolean test()
    {
        int x=1;
        return x==1?true:false;
    }
    public static void main(String[] args)
    {
        //ArrayTest[] a1=new ArrayTest[3];
        //ArrayTest[] a2=
        //        {
        //                new ArrayTest(6),
        //                new ArrayTest(6),
        //                new ArrayTest(6),
        //        };
        //Arrays.fill(a1,new ArrayTest(6));
        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));
        //System.out.println(Arrays.equals(a1,a2));

        //ArrayTest a=new ArrayTest();
        //ArrayTest b=new ArrayTest();
        //a.VariantTest();
        //a.VariantTest();
        //b.VariantTest();
        //System.out.println(ArrayTest.staticVar);

       System.out.println(test());
    }
}
