package commonErrors;
import java.util.Arrays;
import java.util.EmptyStackException;

import static util.Common.sy;
/**内存泄露
 * Created by xufuxiu on 2017/9/17.
 */
public class MyStack<T>
{
    private T[] elements;
    private int size=0;
    private static final int INIT_CAPACITY=16;
    public MyStack()
    {/*elements数组长度为16，存储数据的类型是T*/
       elements=(T[])new Object[INIT_CAPACITY];
    }
    public void push(T elem)
    {
        /*往数组elements中添加元素elem*/
        ensureCapacity();
        elements[size++]=elem;
    }
    public T top()
    {/*依次弹出数组中的元素,可能存在内存泄露*/
        if (size==0) throw new EmptyStackException();
        return elements[--size];
    }
    private void ensureCapacity()
    {
        if (elements.length==size)
        {/*复制elements数组的前2*size+1个元素，不够的用null补充*/
            elements= Arrays.copyOf(elements,2*size+1);
        }
    }
    public static void main(String[] args)
    {
        MyStack my = new MyStack();
        my.push(1);
        my.push("women");
        my.push(true);
        my.push(1.5);
        sy(my.top());
        sy(my.top());
        sy(my.top());
        sy(my.top());
        sy(my.elements[0]);
    }
}
