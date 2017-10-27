package main.java.link;
/**查找和删除链表中指定的链结点
 * Created by xufuxiu on 2017/10/24.
 */
public class LinkList2
{
    public Link first;
    public LinkList2()
    {
        first = null;//no links on list yet
    }
    public void insertFirst(int id,double dd)
    {
        Link newLink=new Link(id,dd);
        newLink.next=first;
        first=newLink;
    }
    public Link find(int key)
    {
        Link current=first;
        while (current!=null)
        {
            if (current.iData==key)
            {
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public Link find2(int key)
    {
        Link current=first;
        while (current.iData!=key)
        {
            if(current.next==null)return null;
            else current=current.next;
        }
        return current;
    }
    public void delete(int key)
    {
        if (first.iData==key)
        {
            first=first.next;
        }
        else
        {
            Link current=first;
            Link previous=first;
            while (current!=null)
            {
                if (current.iData!=key)
                {
                    previous=current;
                    current=current.next;
                }
                else if (current.iData==key)
                {
                    previous.next=current.next;
                    current=null;
                }
            }
        }

    }
    public Link delete2(int key)
    {
        Link current=first;
        Link previous=first;
        while (current.iData!=key)
        {
            if (current.next==null)return null;
            else
            {
                previous=current;
                current=current.next;
            }
        }
        if (current==first)first=first.next;
        else
            previous.next=current.next;
        return current;
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
        LinkList2 theList=new LinkList2();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);
        theList.displayList();

        //Link f=theList.find(22);
        //f.displayLink();
        //theList.delete(44);
        //theList.displayList();
        Link d=theList.delete2(44);
        if (d!=null)
        {
            System.out.println("Deleted link with key "+d.iData);
        }else
        {
            System.out.println("Can't delete link");
        }
        theList.displayList();
    }
}
