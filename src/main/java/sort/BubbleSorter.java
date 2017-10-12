package sort;
import java.util.Comparator;
/**冒泡排序
 * Created by xufuxiu on 2017/9/19.
 */
public class BubbleSorter implements Sorter
{
    public static void main(String[] args)
    {
        Integer[] a={1,4,5,2,8};
        BubbleSorter b=new BubbleSorter();
        b.sort(a);
    }
    public <T extends Comparable<T>> void sort(T[] list)
    {
        boolean swapped=true;
        for (int i = 1,len=list.length; i <len && swapped ; ++i)
        {
            swapped=false;
            for (int j = 0; j <len-i ; ++j)
            {//list[j]>list[j+1],调换位置
                //System.out.println("i="+i+",j="+j);
                if (list[j].compareTo(list[j+1])>0)
                {
                    T temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    swapped=true;
                }
                System.out.println();
                for (int k = 0; k <list.length ; k++)
                {
                    System.out.print(list[k]+",");
                }

            }

        }

    }
    public <T> void sort(T[] list, Comparator<T> comp)
    {
        boolean swapped=true;
        for (int i = 0,len=list.length; i <len && swapped ; i++)
        {
            swapped=false;
            for (int j = 0; j <len ; j++)
            {
                if (comp.compare(list[j],list[j+1])>0)
                {
                    T temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    swapped=true;
                }
            }

        }

    }

    /*public static <T extends Comparable<T>> int binarySearch(T[] x, T key) {
        return binarySearch(x, 0, x.length- 1, key);
    }*/
    /**
     * 使用循环实现二分查找
     * @param x 数组
     * @param key 要查找的元素
     * @param comp 比较器
     * @return
     */
    static <T> int binarySearch(T[] x,T key,Comparator<T>comp)
    {//使用循环实现二分查找
        int low=0;
        int high=x.length-1;
        while (low<=high)
        {
            int mid=(low+high)>>>1;//带符号位右移2
            //比较想x[mid]和key
            int cmp=comp.compare(x[mid],key);
            if (cmp<0)
            {//x[mid]<key
                low=mid+1;
            }
            else if(cmp>0)
            {//key<x[mid]
                high=mid-1;
            }
            else return mid;
        }
        return -1;
    }
    /**
     * 使用递归实现的二分查找
     * @param x 数组
     * @param low 左边索引，初值为0
     * @param high 右边索引，初值为length-1
     * @param key 要查找的元素
     * @param <T>
     * @return
     */
    private static <T extends Comparable<T>>int binarySearch(T[] x, int low, int high, T key)
    {// 使用递归实现的二分查找
        if (low<high)
        {
            int mid=low+((high-low)>>1);
            if (key.compareTo(x[mid])==0)
            {
                return mid;
            }
            else if(key.compareTo(x[mid])<0)
            {
                return binarySearch(x,low,mid-1,key);
            }else
            {
                return binarySearch(x,mid+1,high,key);
            }
        }
        return -1;
    }

}
/*计算中间位置时不应该使用(high+ low)/2的方式，因为加法运算可能导致整数越界，这里应该使用以下三种方式之一：low + (high - low)/2或low + (high – low)>>1或(low + high)>>>1（>>>是逻辑右移，是不带符号位的右移）*/