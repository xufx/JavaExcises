package arrays;
import static net.mindview.util.Print.*;

import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ArrayOptions
{
   public static void getValues(BerylliumSphere[] ab)
    {
        for (int i = 0; i <ab.length ; i++)
        {
            System.out.println(ab[i]);
        }
    }
    public static void main(String[] args)
    {
        BerylliumSphere[] a;//在初始化之前，编译器不允许此引用做任何事
        BerylliumSphere[] b=new BerylliumSphere[5];
        System.out.println("b:"+ Arrays.toString(b));
        /*数组对象在创建之后，随即将数组的各个位置都赋值为BerylliumSphere对象*/
        BerylliumSphere[] c=new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++)
        {
            if (c[i]==null)c[i]=new BerylliumSphere();
        }
        BerylliumSphere[] d=
                {//聚集初始化语法
                        new BerylliumSphere(),
                        new BerylliumSphere(),
                        new BerylliumSphere()
                };
        a=new BerylliumSphere[]{
                        new BerylliumSphere(),
                        new BerylliumSphere()
                };
        print("a.length="+a.length);//length:表示数组的大小，而不是实际存储元素的个数
        print("b.length="+b.length);
        print("c.length="+c.length);
        print("d.length="+d.length);
        a=d;
        print("a.length="+a.length);

        int[] e;
        int[] f=new int[5];
        print("f:"+Arrays.toString(f));
        int[] g=new int[4];
        for (int i = 0; i <g.length ; i++)
        {
            g[i]=i*i;
        }
        int[] h={11,47,93};
        //print("e.length="+e.length);
        print("f.length="+f.length);
        print("g.length="+g.length);
        print("h.length="+h.length);
        e=h;
        print("e.length="+e.length);
        e=new int[]{1,2};
        print("e.length="+e.length);

        ArrayOptions.getValues(
                new BerylliumSphere[]{
                        new BerylliumSphere(),
                        new BerylliumSphere()
                }
        );
    }
}
