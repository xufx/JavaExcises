package main.java.excises;
import java.util.HashSet;

import static main.java.print.printTwoDimensionalArray;
/**
 * Created by xufuxiu on 2017/10/13.
 */
public class Matrix
{
    /*给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。
    测试样例：[[1,2,3],[4,5,6],[7,8,9]],3
    返回：[[7,4,1],[8,5,2],[9,6,3]]*/
    /*思路：行-》列-》列逆序*/
    public static int[][] transformImage(int[][] mat, int n)
    {
        //1:将行转变为列
        int l=mat.length;
        int c=mat[0].length;
        int[][] b=new int[l][c];
        if (l<=500)
        {
            for (int i = 0; i <mat.length ; i++)
            {
                for (int j = 0; j <mat[i].length ; j++)
                {
                    if (mat[i][j]<=256&&mat[i][j]>=-256)
                    {
                        if(i!=j)
                        {
                            b[i][j]=mat[j][i];
                        }
                        else
                            b[i][i]=mat[i][i];
                    }
                }
            }
        }
        else
        {
            System.out.println("请确保输入的矩阵不为空，且是n*n方阵");
            return null;
        }
        printTwoDimensionalArray(b);
        //2：将列逆序
        int[][] cc=new int[l][l];
        for (int i = 0; i <b.length ; i++)
        {
            for (int j = 0 ; j <b[i].length ; j++)
            {
                int h=b[i].length-1;
                cc[i][j]=b[i][h-j];
            }
        }
        return cc;
    }
    /*若N阶方阵中某个元素为0，则将其所在的行与列清零*/
    public static int[][] clearZero(int[][] mat, int n)
    {
        int l=mat.length;
        int[][] b=new int[l][l];
        if (checkArray(mat,n))
        {
            for (int i = 0; i <l ; i++)
            {
                for (int j = 0; j <l ; j++)
                {
                    if (mat[i][j]==0)
                    {
                        b= setToZero(mat,i,j);
                    }
                }
            }
        }
        return b;
    }
    //将一个下标处的某一行和某一列都置为0
    public static int[][] setToZero(int[][] a,int row,int column)
    {
        int l=a.length;
        for (int i = 0; i <l ; i++)
        {//将某一列都置为0
            a[i][row]=0;
        }
        for (int j = 0; j <l ; j++)
            {//将某一行都置为0
                a[column][j]=0;
            }
        return a;
    }
    /*思路：将0所在的行的下标和列的下标都记录下来*/
    public static void setZeroes(int[][] matrix)
    {
        printTwoDimensionalArray(matrix);
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer>setM=new HashSet<>();
        HashSet<Integer>setN=new HashSet<>();
        for (int i = 0; i <m ; i++)
        {
            for (int j = 0; j <n ; j++)
            {
                if (matrix[i][j]==0)
                {
                    setM.add(i);
                    setN.add(j);
                }
            }
        }
        for(int row:setM)
        {
            //将行设置为0
            for (int col = 0; col <n ; col++)
            {
                matrix[row][col]=0;
            }
        }
        for(int col:setN)
        {
            for (int row = 0; row < m; row++)
            {
                matrix[row][col]=0;
            }
        }
        printTwoDimensionalArray(matrix);

    }
    /*校验二维数组是否满足条件：保证阶数小于等于300，矩阵中的元素为int范围内*/
    public static boolean checkArray(int[][] mat, int n)
    {
        for (int i = 0; i <mat.length ; i++)
        {
            for (int j = 0; j <mat[i].length ; j++)
            {/*如果行数==列数==阶数*/
                   if (mat.length==mat[i].length&&mat.length==n&&n<=300)
                   {
                       return true;
                   }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[][] a={{0,2,3},{-4,0,6},{7,-8,0}};
        printTwoDimensionalArray(a);
        //printTwoDimensionalArray(transformImage(a, 3));
        setZeroes(a);
    }
}
