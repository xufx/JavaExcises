package sort;
import java.util.Comparator;
/**
 * 排序器接口(策略模式: 将算法封装到具有共同接口的独立的类中使得它们可以相互替换)
 * Created by xufuxiu on 2017/9/19.
 */
public interface Sorter
{
    /**
     * 排序
     * @param list 待排序数组
     * @param <T> 数据的类型
     */
    <T extends Comparable<T>> void sort(T[] list);
    /**
     * 排序
     * @param list 待排序数组
     * @param comp 比较器，用于比较两个对象
     */
    <T> void sort(T[] list, Comparator<T> comp);

}
