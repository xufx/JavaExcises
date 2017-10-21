package main.java.excises;
import java.util.*;

import static main.java.print.*;
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
       System.out.println(s.length());
       if (s.length()<=1000&&s.matches("[a-zA-Z]*"));
       {
           /*return s.replace(" ","%20");*/
           return s.replaceAll("\\s","%20");
       }
   }
    public static String replace2(String s)
    {
        if (s==null||"".equals(s)||s.length()<=0) return "源数组为空";
        else
        {
            StringBuffer sb=new StringBuffer("");
            for (int i = 0; i <s.length() ; i++)
            {
                if (s.charAt(i)==' ')sb.append("20%");
                else{sb.append(s.charAt(i));}
            }
            return sb.toString();
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

   /*确定一个字符串的所有字符是否全都不同*/
    public static void checkDifferent(String s)
    {
        int flag=0;
        char[] c=s.toCharArray();
       List<String> list=new ArrayList();
        for (int i = 0; i <c.length-1 ; i++)
        {
            for (int j = i+1; j <c.length ; j++)
            {
                if (c[i]==c[j])
                {
                    flag=1;
                    if (!list.contains("\""+c[i]+"\""))
                        list.add("\""+c[i]+"\"");
                }
            }
        }
        if (flag==1)
        {
            System.out.println("字符串"+s+"包含相同字符:");
        }
        else System.out.println("字符串"+s+"不包含相同字符");

    }
    /*翻转一个给定的字符串*/
    public static void reverseString(String s)
    {
        System.out.println(s);
        char[] c=s.toCharArray();
        int i=0;
        for (int j =s.length()-1 ; j >i ; j--)
            {
                char d=c[i];
                c[i]=c[j];
                c[j]=d;
                ++i;
            }
        printCharToString(c);
    }
    /*给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串,
    "This is nowcoder","is This nowcoder"
    返回：true
    "Here you are","Are you here"
    返回：false*/
    public static void checkSam(String s1,String s2)
    {
        String[] ss1=s1.split(" ");
        String[] ss2=s2.split(" ");
        int l1=ss1.length;
        int l2=ss2.length;
        //如果数组ss1中包含数组ss2中的元素，f对应的下标的值为1
        int[] f=new int[l1];
        if (l1==l2)
        {
            for (int i = 0; i <l1 ; i++)
            {
                for (int j = 0; j <l1 ; j++)
                {
                    if (ss1[i].equals(ss2[j]))
                    {
                        f[i]=1;
                        /*删除数组ss2中与数组ss1[i]相等的值*/
                        break;
                    }
                }
            }
        }
        /*if (flag==1) System.out.println("两个字符串可以互相组合");
        else{ System.out.println("两个字符串不能相互组合");}*/
    }
    /*删除字符串数组中下标为i处的值,返回删除元素后的数组*/
    public static String[] deleteArray(int i,String[] s)
    {
        //System.out.print("删除之前的数组：");
        //printStringArray(s);
        List<Object>list=new ArrayList<>();
        for (int j = 0; j <s.length ; j++)
        {
            if (j!=i)
            {
                list.add(s[j]);
            }
        }
        String[] b=new String[list.size()];
        for (int j = 0; j <list.size() ; j++)
        {
            b[j]=(String)list.get(j);
        }
        //System.out.println();
        //System.out.print("删除之后的数组:");
        //printStringArray(b);
        return b;
    }
    /*移除数组下标在b中的元素*/
    public static void removeItemsFromArray(String[] s,int[] c)
    {
        printStringArray(s);
        List<Object>list=new ArrayList<>();
        /*i:遍历数组s，将下标不在b数组中的项添加到列表list中*/
        if (s.length>0 && c.length>0)
        {
            for (int j = 0; j <s.length ; j++)
            {
                if(c[j]>=0&&c[j]<s.length&&c[j]!=j)
                {/*有问题*/
                    list.add(s[j]);
                }
            }
        }
        String[] b=new String[list.size()];
        for (int j = 0; j <list.size() ; j++)
        {
            b[j]=(String)list.get(j);
        }
        printStringArray(b);
    }
    /*利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。*/
    public static void zipString(String iniString)
    {
       StringBuffer sb = new StringBuffer();
        int k = 1;
        for(int i = 0; i < iniString.length() - 1; i++)
        {
            if(iniString.charAt(i) == iniString.charAt(i+1))k++;
            else
            {
                sb.append(iniString.charAt(i));
                sb.append(k);
                k = 1;
            }
        }
        /*当遍历到最后两个元素时*/
        sb.append(iniString.charAt(iniString.length() - 1));
        sb.append(k);
        if(sb.length() >= iniString.length())System.out.println(sb.toString());

    }
    public static void main(String[] args)
    {
        /*String s="we are happy";
        System.out.println(replace2(s));
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("are");
        printList(list);*/

        /*int[] a={1,2,3,4,5};
        rotateArray(a);*/

        String s1="Here you are";
        String s2="aabbccddefggd";
        String[] s3={"Here","you","are"};
        int[] b={0,1};
        //checkDifferent(s);
        //reverseString(s);
        //checkSam(s1,s2);
        //deleteArray(2,s3);
        //removeItemsFromArray(s3,b);
        zipString(s2);
    }
}
