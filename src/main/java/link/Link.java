package main.java.link;
/**
 * Created by xufuxiu on 2017/10/23.
 */
public class Link
{
    public int iData;//data
    public double dData;//data
    public Link next;//reference to next link,next是对象的引用（对象的地址）而不是对象
    public Link(int id,double dd)
    {
        iData=id;
        dData=dd;
    }
    public void displayLink()
    {
        System.out.print("{"+iData+","+dData+"}");
    }
}
