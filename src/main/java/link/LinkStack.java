package main.java.link;
/**用链表实现栈
 * Created by xufuxiu on 2017/10/24.
 */
public class LinkStack
{
    class Link
    {
        public  long dData;
        public Link next;
        public Link(long d)
        {
            dData=d;
        }
        public void displayLink()
        {
            System.out.print(dData+" ");
        }
    }
    class LinkList
    {
        private Link first;//第一个链节点的引用
        public void LinkList()
        {
            first = null;
        }
        public boolean isEmpty()
        {
            return (first == null);
        }
        public void insertFirst(long dd)
        {/*插入节点*/
            Link newLink = new Link(dd);
            newLink.next = first;//newLink-->old first,一个链节点连接了下一个链节点
            first = newLink;//first-->newLink
        }
        public Link deleteFirst()
        {/*删除节点*/
            Link temp = first;
            first = first.next;//first-->old next
            return temp;
        }
        public void displayList()
        {
            Link current = first;
            while (current != null)
            {
                current.displayLink();
                current = current.next;
            }
            System.out.println("");
        }
    }
    private LinkList theList;
    public LinkStack()
    {
        theList = new LinkList();
    }
    public void push(long j)
    {
        theList.insertFirst(j);
    }
    public Link  pop()
    {
        return theList.deleteFirst();
    }
    public boolean  isEmpty()
    {
        return(theList.isEmpty());
    }
    public void displayStack()
    {
        System.out.println("Stack (top-->bottom):");
        theList.displayList();
    }
    public static void main(String[] args)
    {
        LinkStack theStack=new LinkStack();
        theStack.push(20);
        theStack.push(40);
        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);
        theStack.displayStack();

        theStack.pop();
        theStack.pop();
        theStack.displayStack();
    }
}
