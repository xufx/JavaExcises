package main.java.excises;
import java.util.ArrayList;
import java.util.List;

import static main.java.print.printList;
/**
 * Created by xufuxiu on 2017/10/18.
 */
public class ListExcise
{
   /*输入一个链表，输出该链表中倒数第k个结点。*/
    public static Object FindKthToTail(List head, int k)
    {
        Object o=null;
       if (k>=1&&k<=head.size())
       {
           o=head.get(head.size()-k);
           System.out.println(o);
       }
        return o;
    }
    /*实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true*/
    public static void removeNode(List p,int k)
    {
        printList(p);
        p.remove(k);
        printList(p);
    }
    /*检查链表是否为回文。给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
    测试样例：
    {1,2,3,2,1} 返回：true
    {1,2,3,2,3} 返回：false
    思路：如果两个下标处的值相等，将标记存到数组中，如果数组中的所有标记都为true，则是回文*/
    public static void isPalindrome(List p)
    {
        printList(p);
        int l=p.size();
        boolean[] b=new boolean[l/2];
        int flag=0;
        for (int i = 0; i <l/2 ; i++)
        {
            if (p.get(i)==p.get(l-i-1))
            {
               b[i]=true;
            }
        }
        for (int i = 0; i <b.length ; i++)
        {
            if (b[i]==false)
            {
                flag=1;
            }
        }
        if (flag==0)System.out.println("是回文");
        else System.out.println("不是回文");
    }
    public static void main(String[] args)
    {
        List<Object> list=new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(3);list.add(2);list.add(1);
        //FindKthToTail(list,3);
        //removeNode(list,1);
        isPalindrome(list);
    }
}
