package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
class Book
{
    boolean checkedOut=false;
    Book(boolean checkOut)
    {
        checkedOut=checkOut;
    }
    void checkIn()
    {
        checkedOut=false;
    }
    protected  void finalize()
    {
        if (checkedOut)
        {System.out.println("Error:checked out");}
    }
}
public class TerminationCondition
{
    public static void main(String[] args)
    {
        Book novel=new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc(); //强制进行终结动作
    }
}
