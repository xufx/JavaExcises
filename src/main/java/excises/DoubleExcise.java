package main.java.excises;
import java.util.Scanner;

import static main.java.print.printIntArray;
/**
 * Created by xufuxiu on 2017/10/19.
 */
public class DoubleExcise
{
    /*有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”。给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
测试样例：0.625  返回：0.101*/
    public static String printBin(double num)
    {
        System.out.println(num);
        StringBuffer sb=new StringBuffer("0.");
        int count=32;
        while (num!=0.0)
        {
            count--;
            if (count<0)return "Error";
            num=num*2;
            if (num>=1)
            {
                sb.append("1");
                num-=1;
            }else sb.append("0");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    /*有一个正整数，请找出其二进制表示中1的个数相同、且大小最接近的那两个数。(一个略大，一个略小)
给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。保证答案存在。
测试样例：2 返回：[1,4]*/
    public static void getCloseNumber(int x)
    {

    }
    /*让计算机随机读入 5 个数然后将这 5 个数从大到小输出？*/
    public static void getInteger()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入五个整数，以逗号隔开");
        String msg=sc.nextLine();
        sc.close();

        String[] a= msg.split(",");
        int[] b=new int[a.length];
        int temp=0;

        for (int i = 0; i <a.length ; i++)
        {
            b[i]=Integer.parseInt(a[i]);
        }
        printIntArray(b);
        for (int i = 0; i <b.length-2 ; i++)
        {
            for (int j = i+1; j <b.length ; j++)
            {
                if (b[i]<b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        printIntArray(b);
    }

    public static void main(String[] args)
    {
        double num=0.8125;
        //printBin(num);
        int x=2;
        //getCloseNumber(x);
        getInteger();
    }

}
