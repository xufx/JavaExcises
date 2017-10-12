package basics;
import java.util.ArrayList;
import java.util.List;

import static util.Common.sw;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/21.
 */
public class PrintNumber
{
    public static void main(String[] args)
    {
        //DanForhan(1260);
        //DanForhan(1827);
        vampire();
    }
    public static int DanForhan(Integer n)
    {//吸血鬼数字，有四位数，由两对两位的数字相乘而得，乘数的数字各来自不同的四位数，最后两位不能同时为0，1620 1827
        //判断n是否是吸血鬼数字，如果是返回n，否则返回-1
        int ge=n%1000%100%10;
        int ten=n%1000%100/10;
        int bai=n%1000/100;
        int qian=n/1000;
        /*if (ten!=0&&ge!=0)
        {
            return -1;
        }*/
        if (ge!=ten && ge!=bai&&ge!=qian&&ten!=bai && ten!=qian&&bai!=qian)
            {
                    int[] a=new int[4];
                    a[0]=qian;a[1]=bai;a[2]=ten;a[3]=ge;
                    List<Integer> list=new ArrayList<>();
                    //将数组中的数字重新组合成一个两位数，其组成数字不同
                    for (int x:a)
                    {
                        for (int y:a)
                        {
                            if (x!=y)
                            {
                                int multiplier=x*10+y;
                                list.add(multiplier);
                            }
                        }
                    }
                    for(Integer i:list)
                    {
                        for (Integer j:list)
                        {
                            if (i!=j&&judgeTwo(i,j)&&i*j==n)
                            {
                                sy(n+"="+i+"*"+j+",是吸血鬼数字");
                                return n;
                            }
                        }
                    }
                }
        return -1;
    }
    public static void vampire()
    {//找出所有四位数的吸血鬼数字
        List<Integer>list=new ArrayList<>();
        for (int i = 1000; i <=9999 ; i++)
        {
            int j=DanForhan(i);
            if (j!=-1)
            {
                list.add(j);
            }
        }
        printList(list);
    }
    public static boolean judgeTwo(int n1,int n2)
    {//判断两个数n1,n2的组成数字是否有相同的
        int ge1=n1%10;
        int ten1=n1/10;
        int ge2=n2%10;
        int ten2=n2/10;
        if (ge1!=ten1 && ge2!=ten2&&ge1!=ge2&&ten1!=ten2 && ge1!=ten2&&ge2!=ten1)
        {
                 //sy(n1+"和"+n2+"的各位组成数字不同");
            return true;
        }else
        {
            return false;
            //sy(n1+"和"+n2+"的各位组成数字有些相同");
        }
    }
    public static int fibonacci(int n)
    {//获得第n个斐波那契数字，每个数字是前两项的和，1,1,2,3,5,8,11...
        if (n==1||n==2)
            {
                return 1;
            }
            else if (n>=3)
            {
                return fibonacci(n-1)+fibonacci(n-2);
            }
            return 0;
    }
    public static void print1()
    {//随机产生25个整数，比较相邻整数的大小
        int[] b=new int[25];
        for (int i = 0; i <25 ; i++)
        {
            int a= (int) (Math.random()*100);
            b[i]=a;
        }
        for (int i = 0; i <b.length-1 ; i++)
        {
            if (b[i]<b[i+1])
            {
                sw("b["+i+"]="+b[i]+"<"+"b["+(i+1)+"]="+b[i+1]+" ");
            }else if (b[i]>b[i+1])
            {
                sw("b["+i+"]="+b[i]+">"+"b["+(i+1)+"]="+b[i+1]+" ");
            }else
            {
                sw("b["+i+"]="+b[i]+"="+"b["+(i+1)+"]="+b[i+1]+" ");
            }
        }
    }
    public static void print2()
    {//向数组中添加数据直至键盘中断
        List<Integer> b=new ArrayList<>();
        while (true)
        {
            int a= (int) (Math.random()*100);
            b.add(a);
        }

    }
    public static void printPrime(Integer n)
    {//打印出n以内的所有素数
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);

        for (int i = 5; i <=n ; i++)
        {
            int flag=1;//若i是素数，flag会一直等于1
            for (int j = 2; j < i/2; j++)
            {
               if (i%j==0)
               {//只要发生一个整除的事例，flag都会变为0，
                   flag=0;
                   break;//跳到外循环i+1
               }
            }
            if (flag==1)list.add(i);
        }
        printList(list);
    }

    public static void printList(List<Integer> args)
    {//打印列表的值
        System.out.println("打印列表的值如下：");
        for (Object obj:args)
        {
            sw(obj+",");
        }

    }
    public static void printArray(int[] args)
    {//打印列表的值
        System.out.println("打印数组的值如下：");
        for (Object obj:args)
        {
            sw(obj+",");
        }

    }
    public static void switchTest(Integer i)
    {
        switch (i)
        {
            case 0:sy(0);
            case 1:sy(1);
            default:sy("default");
        }
    }
}
