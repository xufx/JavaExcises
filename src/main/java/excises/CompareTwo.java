package main.java.excises;
/**
 * Created by xufuxiu on 2017/10/14.
 */
public class CompareTwo
{
    /*比较两个数a,b的大小，不能使用大于、小于、if语句*/
    public static void CompareInteger(int a,int b)
    {
        int c=Integer.compare(a,b);
        System.out.print(a+"与"+b+"相比：");
        System.out.print(c==-1?"小":c==0?"相等":"大");
    }
    /*计算a^b<<2*/
    public static void calcul()
    {
        int a=110,b=10;
        System.out.println((a^b)<<2);
    }

    public static void main(String[] args)
    {
        //CompareInteger(0,2);
        //calcul();
    }
}
