package main.java.excises.yixun;
/**
 * Created by xufuxiu on 2017/10/24.
 */
public class SumBetweenTwo
{
    /*静态递归方法把两个整数（lo & hi）之间的数相加*/
    public static  int sum(int i,int j)
    {
        if (i<=j)
        {
            int temp=i+sum(i+1,j);
            return temp;
        }
        return 0;
    }
    public static void main(String[] args)
    {
       final StringBuffer a=new StringBuffer("immutable");
        //a=new StringBuffer("");有错
        a.append("");
        //System.out.println(sum(1,5));
    }
}
