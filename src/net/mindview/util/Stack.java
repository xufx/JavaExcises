//: net/mindview/util/Stack.java
// Making a stack from a LinkedList.
package net.mindview.util;
import java.util.LinkedList;
/*栈Stack，持有T类型的对象，使用LinkedLis实现的*/
public class Stack<T>
{
  private LinkedList<T> storage = new LinkedList<T>();
  public void push(T v) { storage.addFirst(v); }//接受T类型对象
  public T peek() { return storage.getFirst(); }//返回栈顶元素
  public T pop() { return storage.removeFirst(); }//弹出T类型对象
  public boolean empty() { return storage.isEmpty(); }
  public String toString() { return storage.toString(); }
} ///:~
