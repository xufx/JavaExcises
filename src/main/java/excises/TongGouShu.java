package main.java.excises;
/**
 * Created by xufuxiu on 2017/10/17.
 */
public class TongGouShu
{
    /*求1-1000之间同构数的个数n,同构数是：某数与其自身的平方数的后几位相同，如25*25=625*/
    public static int isomophyNum(int num1,int num2)
    {
        int temp=0;
        for (int i = num1; i <=num2 ; i++)
        {
           temp=i*i;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int result;
        result=isomophyNum(1,1000);
        System.out.println(result);
    }
}
