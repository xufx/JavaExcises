package main.java.excises;
/**
 * Created by xufuxiu on 2017/10/17.
 */
public class subMaxtrix
{
    public static int intmaxMatrix(int[][] matrix,int n,int m)
    {
        int base_num=0;
        for (int i = 0; i <n ; i++)
        {
            for (int j = 0; j <m ; j++)
            {
                base_num+=matrix[i][j];
            }
        }
        int result=0;
        for (int i = 0; i <matrix.length ; i++)
        {
            if (i>0)
            {
                for (int y = 0; y <m ; y++)
                {
                    base_num+=matrix[i+n][y]-matrix[i-1][y];
                }
            }
        }
        int real_sum=base_num;
        if (real_sum>result)
        {
            result=real_sum;
        }
        for (int j = 0; j+m<matrix.length ; j++)
        {
            for (int x = 0; x <n ; x++)
            {
                real_sum+=matrix[x][j+m]-matrix[x][j-1];
            }
            if (real_sum>result)
            {
                result=real_sum;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[][] a={{1,2,3,4},{5,6,7,8},{10,11,12,13},{14,15,16,17}};
        intmaxMatrix(a,4,4);
    }
}
