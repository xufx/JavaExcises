package main.java.excises;
import static main.java.print.charToString;
import static main.java.print.printStringArray;
/**
 * Created by xufuxiu on 2017/10/13.
 */
public class StringReverse
{
    /*给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000。
    * 测试样例：
    "Hello world","worldhello "    返回：false
    "waterbottle","erbottlewat"    返回：true
    *
    * 思路：将s1移动可能组成的字符串都存入一个数组，再将s2与数组中的元素一一对比*/
    public static String checkReverseEqual(String s1, String s2)
    {
        char[] c1=s1.toCharArray();
        int l=c1.length;
        String[] c2=new String[l];
        c2[0]=s1;
        for (int j = 1; j <l ; j++)
        {
            char temp=c1[0];
            for (int i =1; i <l; i++)
            {
                if (i==l-1)
                {
                    c1[l-1]=temp;
                    break;
                }else
                {
                    c1[i-1]=c1[i];
                    c1[i]=c1[i+1];
                }
            }
            c2[j]=charToString(c1);
        }
        printStringArray(c2);
        for (int i = 0; i <c2.length ; i++)
        {
            if (c2[i].equals(s2))
            {
                return s2+"是由"+s1+"组成的";
            }
        }
        return "";
    }

    public static void checkReverseEqual2(String s1, String s2)
    {
        int size1=s1.length();
        int size2=s2.length();
        if (size1==0||size2==0)
        {
            System.out.println("出错了");
        }
        if (s1.contains(s2))
        {
            System.out.println( s1+"是由"+s2+"组成的");;
        }else System.out.println(s1+"不是由"+s2+"组成的");
    }
    public static boolean checkReverseEqual3(String s1, String s2)
    {
        return (s1.indexOf(s2)==-1?false:true);
    }

    public static void main(String[] args)
    {
        String s1="waterBootle",s2="eb";
        //String b=checkReverseEqual(s1,s2);
        //System.out.println(b);
        //checkReverseEqual2(s1,s2);
        System.out.println(checkReverseEqual3(s1,s2));
    }
}
