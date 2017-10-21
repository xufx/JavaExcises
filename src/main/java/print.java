package main.java;
import java.util.List;
/**
 * Created by xufuxiu on 2017/10/12.
 */
public class print
{
    public static void printIntArray(int[] a)
    {/*打印整数数组*/
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void printCharArray(char[] a)
    {/*打印字符数组*/
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void printCharToString(char[] a)
    {/*打印字符数组*/
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void printStringArray(String[] a)
    {/*打印字符串数组*/
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
    public static void printObjectArray(Object[] a)
    {/*打印对象数组*/
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void printStringList(List<String> a)
    {/*打印列表的值*/
        System.out.println();
        for (int i = 0; i <a.size() ; i++)
        {
            System.out.print(a.get(i)+"\t");
        }
    }
    public static void printTwoDimensionalArray(int[][] mat)
    {
        System.out.println();
        for (int i = 0; i <mat.length ; i++)
        {
            for (int j = 0; j <mat[i].length ; j++)
            {
                System.out.print(mat[i][j]+"\t");
                if (j==mat[i].length-1)System.out.println();
            }
        }
    }
    public static void printList(List p)
    {
        System.out.println();
        for(Object o:p)
        {
            System.out.print(o+" ");
        }
        System.out.println();
    }
    /*将一个字符数组转化为一个字符串*/
    public static String charToString(char[] c)
    {
        String sb="";
        for (int i = 0; i <c.length ; i++)
        {
            sb+=c[i];
        }
        return sb;
    }
}
