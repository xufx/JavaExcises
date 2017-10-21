package main.java.excises;
import java.math.BigDecimal;
import java.util.Stack;

import static main.java.print.charToString;
import static main.java.print.printIntArray;
/**
 * Created by xufuxiu on 2017/10/14.
 */
enum weekday{monday,tuesday,wednesday,thursday}
public class Sorting
{
    /*冒泡排序,从小到大*/
    public static int[] bubbleSortUp(int[] args)
    {
        System.out.print("排序之前：");
        printIntArray(args);
        Long start=System.nanoTime();
        for (int i = 0; i <args.length-1; i++)
        {
            for (int j = i+1; j <args.length ; j++)
            {
               if (args[i]>args[j])
               {
                   int temp=args[i];
                   args[i]=args[j];
                   args[j]=temp;
               }
            }
        }
        Long end=System.nanoTime();
        System.out.println("运行时间："+(end-start)+"ns");
        System.out.print("希尔排序，从小到大排序之后：");
        printIntArray(args);
        return args;
    }
    /*冒泡排序,从大到小*/
    public static int[] bubbleSortDown(int[] args)
    {
        System.out.println();
        System.out.print("排序之前：");
        printIntArray(args);
        Long startTime=System.nanoTime();
        for (int i = 0; i <args.length-1; i++)
        {
            for (int j = i+1; j <args.length ; j++)
            {
                if (args[i]<args[j])
                {
                    int temp=args[i];
                    args[i]=args[j];
                    args[j]=temp;
                }
            }
        }
        Long endTime=System.nanoTime();
        System.out.println("运行时间："+(endTime-startTime)+"ns");
        System.out.print("希尔排序，从大到小排序之后：");
        printIntArray(args);
        return args;
    }
    /*插入排序,先排序，后插入，从头开始对比*/
    public static void sortUpInsert(int[] args,int number)
    {
        int[] a=bubbleSortUp(args);
        int[] b=new int[a.length+1];
        int k=0;
        for (int i = 0; i <a.length; i++)
        {
            if (number<=a[i])
            {
                b[i]=number;//在之前插入
                k=i;break;
            }
            else
            {
                b[i]=a[i];
            }
        }
        for (int i = k; i <b.length-1; i++)
        {
            b[i+1]=a[i];
        }
        printIntArray(b);
    }
    public static void sortDownInsert(int[] args,int number)
    {
        int[] a=bubbleSortDown(args);
        int[] b=new int[a.length+1];
        int k=0;
        for (int i = 0; i <a.length; i++)
        {
            if (number<a[i])
            {
                b[i]=a[i];
            }
            else
            {
                b[i]=number;//在之后插入
                k=i;break;
            }
        }
        for (int i = k; i <b.length-1; i++)
        {
            b[i+1]=a[i];
        }
        printIntArray(b);
    }
    /*快速排序：将序列划分为两个子序列，找出中间元素*/
    public static void sortInsert(int[] args,int number)
    {/*不能用*/
        int[] a=bubbleSortUp(args);
        int[] b=new int[a.length+1];
        int flag=0;
        int low=0;
        int high=a.length-1;

        for (int i = 0; i <a.length ; i++)
            {
                int mid=(high-low+1)/2;//中间那个数的坐标
                while ( low<mid&&mid<high)
                {
                    if (number==a[mid])
                    {
                        b[mid]=number;
                        flag=mid;break;
                    }
                    else if (number<a[mid])
                    {
                        high=mid;
                    }
                    else
                    {
                        low=mid;
                    }
                }
            }
        for (int j = flag; j <b.length-1 ; j++)
        {//后面的元素
            b[j+1]=a[j];
        }
        for (int j = 0; j < flag; j++)
        {//前面的元素
            b[j]=a[j];
        }
        printIntArray(b);
    }
    public static void sortInsert2(int[] array,int len)
    {/*快速排序*/
        printIntArray(array);
        qSort(array,0,len-1);
        printIntArray(array);
    }
    public static void qSort(int[] array,int low,int high)
    {
        if (low<high)
        {
            int pivot=partition(array,low,high);
        }
    }
    public static int  partition(int[] array,int low,int high)
    {
        int pv=array[low];
        while (low<high)
        {
            while ((low<high)&&array[high]>=pv)
            {
                high--;
            }
            swap(array,low,high);
            while (((low<high)&&(array[high]>=pv)))
            {
                low++;
            }
            swap(array,low,high);
        }
        return low;
    }
    public static void swap(int[] array,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    /*希尔排序:将待排序列话费为若干组，在每一个组内进行插入排序，以使整个序列基本有序，然后再对整个序列进行插入排序。*/
    public static void shellSort(int[] array, int len)
    {
        int i=0,j=0,k=-1,temp=-1,gap=len;
        do
        {
            gap=gap/3+1;
            for (i = gap; i <len ; i+=gap)
            {
                k=i;
                temp=array[k];
                for(j=i-gap;(j>=0)&&(array[j]>temp); j-=gap)
                {
                    array[j+gap]=array[j];
                    k=j;
                }
                array[k]=temp;
            }
        }while (gap>1);
    }
    /*不使用其他变量,交换两个整数的值*/
    public static void switchAB(int a,int b)
    {
        System.out.println("a="+a+",b="+b);
        a=b-a;//a成为两个坐标轴之间的距离
        b=b-a;//右边的坐标-距离=左边的坐标
        a=b+a;//左边的坐标+距离=右边的坐标
        System.out.println("a="+a+",b="+b);
    }
    public static void switchAB2(int a,int b)
    {//任意一个数与任意一个给定的值连续异或两次，值不变。
        System.out.println("a="+a+",b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+",b="+b);
    }
    public static void switchAB3(int a,int b)
    {//任意一个数与任意一个给定的值连续异或两次，值不变。
        System.out.println("a="+a+",b="+b);
        Stack st=new Stack();
        st.push(a);
        st.push(b);
        a=(int)st.pop();
        b=(int)st.pop();
        System.out.println("a="+a+",b="+b);
    }
    //两个数相乘，小数点后位数没有控制，请写一个高精度算法
    public static void multiplyAB(String a,String b)
    {
        System.out.println(Double.valueOf(a)* Double.valueOf(b));
        //计算小数位数有几位
        int lena=a.length()-a.indexOf(".")-1;
        int lenb=b.length()-1-b.indexOf(".");
        //对两个字符串转换为BigDecimal类型
        BigDecimal biga=new BigDecimal(a);
        BigDecimal bigb=new BigDecimal(b);
        BigDecimal bigc=biga.multiply(bigb);
        //保证精度，精度的位数=lena+lenb
        System.out.println(bigc.setScale(lena+lenb,BigDecimal.ROUND_HALF_EVEN));
    }
    /*有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,其中二进制的位数从低位数到高位且以0开始。
给定两个数int n和int m，同时给定int j和int i，意义如题所述，请返回操作后的数，保证n的第j到第i位均为零，且m的二进制位数小于等于i-j+1。
测试样例：1024，19，2，6 返回：1100*/
    /**
     *将m的二进制位数加入n的二进制位数的第k1位到第k2位之间
     * @param n 二进制位数比较多的数
     * @param m 二进制位数少的数
     * @param k1 起始位数
     * @param k2 结束位数
     */
    public static void  binInsert(int n, int m, int k1, int k2)
    {
        System.out.println(n);
        System.out.println(m);
        char[] n1=Integer.toBinaryString(n).toCharArray();
        char[] m1=Integer.toBinaryString(m).toCharArray();
        int j=0;
        if (m1.length<=n1.length&&k1<k2&&m1.length<=k2-k1+1)
        {
          for (int i = n1.length-k2-1; i <=n1.length-k1-1; i++)
          {
              n1[i]=m1[j];
              j++;
          }
        }
        String s=charToString(n1);
        Integer result=Integer.parseInt(s);
       System.out.println(result);
    }
    /*让字符数组前后交换*/
    public static  char[]  changeArray(char[] c)
    {
        char[] d=new char[c.length];
        int j=0;
        for (int i = c.length-1; i >=0 ; i--)
        {
            d[j]=c[i];
            j++;
        }
        return d;
    }

    public static void main(String[] args)
      {
          int score[]={90,87,9,94,1};
          //bubbleSortUp(score);
          //bubbleSortDown(score);
          //sortUpInsert(score,40);
          //sortDownInsert(score,40);
          //sortInsert(score,40);
          for (int i = 0,sum=0; i <10;++i)sum+=i;
          String a="3425.0800190",b="456.4198093";
          //switchAB3(a,b);

          //写出floatx与零值的比较
          //float x=0;
          //if (x>=0.000001&&x<=0.000001);
          //multiplyAB(a,b);
          //sortInsert2(score,5);
          int n=1024,m=19,i=2,j=6;
          binInsert(n,m,i,j);
      }
}
