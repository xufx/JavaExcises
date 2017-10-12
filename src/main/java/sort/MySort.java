package sort;
import java.util.Scanner;

import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/19.
 */
public class MySort
{
    private static final int LENGTH=10;
    public static void main(String[] args)
    {
        //int[] array=inputArray(LENGTH);
        //int[] array={1,44,23,22,12,3,5,7,33};
        int[] array={1,4,5,2,8};
        sy("排序前:");
        printArray(array);
        sy("排序后:");
        sortArray(array);
        printArray(array);

        sy("请输入要查找的值：");
        int value=inputInt();
        int index=binarySearch(array,value);
        if (index==-1)sy("没有找到"+value);
        else
        {
            sy(String.format("%d在数组的第%d个位置",value,index));
        }
    }
    //排序
    private static void sortArray(int[] array)
    {
        int temp;
        /*for (int i = 0; i <array.length ; i++)
        {
            for (int j = array.length-1; j >i ; j--)
            {sy("i="+i+",j="+j);
                if (array[j-1]>array[j])
                {
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }*/
        for (int i = 1; i <array.length ; i++)
        {
            for (int j = 0; j <array.length-i ; j++)
            {
                if (array[j]>array[j+1])
                {
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    /**
     * 二分查找
     * @param array 要查找的数组
     * @param value 要查找的整数
     * @return 整数在array中的索引
     */
    private static int binarySearch(int[] array,int value)
    {
        int left=0;
        int right=array.length-1;
        while (left<=right)
        {
            int mid=(left+right)/2;
            if (value==array[mid])
            {
                return mid;
            }else if (value>array[mid])
            {
                left=mid+1;
            }else
            {
                right=mid-1;
            }
        }
        return -1;
    }
    //输入整数保存到数组中
    private static int[] inputArray(int length)
    {
        int[] array=new int[length];
        sy(String.format("请输入%d个整数：",length));
        for (int i = 0; i <length ; i++)
        {
            sy(String.format("%d",i+1));
            array[i]=inputInt();
        }
        return array;
    }
    //输入单个整数
    private static int inputInt()
    {
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            try
            {
                int result=scanner.nextInt();
                return result;
            }catch (Exception e)
            {
                scanner.nextLine();//忽略错误的一行
                sy("输入有误，请重新输入一个整数：");
            }
        }
    }
    //打印数组
    private static void printArray(int[] array)
    {
        for (int node:array)
        {
            System.out.print(node+",");
        }

    }

}
