package main.java.excises;
import java.util.*;
/**
 * Created by xufuxiu on 2017/10/11.
 */

public class StringReplace
{
    public static void printArray(int[] a)
    {
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }

    }
    /*请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
   public static String replace(String s)
   {
       /*return s.replace(" ","%20");*/
       return s.replaceAll("\\s","%20");
   }
   /*输入一个链表，从尾到头打印链表每个节点的值。*/
   public static void printList(List<String> list)
   {
       for (int i=list.size()-1; i>=0;i--)
       {
           System.out.println(list.get(i));
       }
   }
   /*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1*/
    public static void rotateArray(int[] a)
   {
       int mid=a.length/2;
       int[] a2=new int[a.length];
        for (int i = 0; i <mid ; i++)
        {
            for (int j=a2.length-1; j>=mid;j--)
            {
                a2[j]=a[i];
                ++i;
            }
        }
       printArray(a2);
        /*找出数组当中的最小元素*/
        for (int i = 0; i <=a2.length-2 ; i++)
        {
            for (int j = i+1; j <a2.length-i ; j++)
            if (a2[i]>a2[j])
            {
                int temp=a2[i];
                a2[i]=a2[j];
                a2[j]=temp;
            }
        }
        System.out.println();
       printArray(a2);
   }
    public static void main(String[] args)
    {
        /*String s="we are happy";
        System.out.println(replace(s));

        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("are");
        printList(list);*/

        int[] a={1,2,3,4,5};
        rotateArray(a);
    }
}
