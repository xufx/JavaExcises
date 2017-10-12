package main.java.arrays;
/**
 * Created by xufuxiu on 2017/10/11.
 */
public class Solution
{
    /*在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/
    public static boolean Find(int target, int [][] array)
    {
        /*for(int i=0;i<array.length;i++)
        {
            int[] row=array[i];//获得每一行作为一维数组
            for (int j = 0; j <row.length ; j++)
            {//从头到尾一个一个进行比较
                if (target==array[i][j])return true;
            }
        }*/
        for (int[] a:array)
        {
           for(int i:a)
           {
               if (target==i)return true;
           }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[][] a={{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
        System.out.println(Find(45,a));
    }
}
