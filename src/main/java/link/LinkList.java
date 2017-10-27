package main.java.link;
/**插入或删除链表中的节点
 * Created by xufuxiu on 2017/10/23.
 */
public class LinkList
{
    private Link first;//第一个链节点的引用
    public void LinkList()
    {
        first=null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insertFirst(int id,double dd)
    {/*插入节点*/
        Link newLink=new Link(id,dd);
        newLink.next=first;//newLink-->old first,一个链节点连接了下一个链节点
        first=newLink;//first-->newLink
    }
    public Link deleteFirst()
    {/*删除节点*/
        Link temp=first;
        first=first.next;//first-->old next
        return temp;
    }
    public void displayList()
    {
        System.out.println("List(first-->last):");
        Link current=first;
        while (current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        LinkList theList=new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,8.99);
        //theList.displayList();

        System.out.print("Deleted:");
        while (!theList.isEmpty())
        {
            Link aLink=theList.deleteFirst();
            aLink.displayLink();
        }
        System.out.println();
        theList.displayList();
    }
}
