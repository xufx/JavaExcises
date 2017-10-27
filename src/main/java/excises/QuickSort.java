package main.java.excises;
import static main.java.print.printIntArray;
/**
 * Created by xufuxiu on 2017/10/24.
 */
public class QuickSort
{
    public static void quickSort(int[] arr)
    {   printIntArray(arr);
        qSort(arr,4,arr.length-1);
        printIntArray(arr);
    }
    public static int qSort(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        while (low<high)
        {
            while (low<high&&arr[high]>=pivot)
            {
                --high;
            }
            arr[low]=arr[high];
            while (low<high&&arr[low]<=pivot)
            {
                ++low;
            }
            arr[high]=arr[low];
        }
        arr[low]=pivot;
        return low;
    }
    public static void quickSort2()
    {

    }
    public static void main(String[] args)
    {
        int[] a={1,20,7,12,9};
        quickSort(a);
        char c='我';
    }
}
