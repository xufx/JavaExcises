package containers;
import java.util.*;
/**Collection方法
 * Created by Administrator on 2017/6/27.
 */
public class Unsupported
{
    static void test(String msg, List<String>list)
    {
        System.out.println("---"+msg+"---");
        Collection<String> c=list;//list和c指向同一个对象
        Collection<String> subList=list.subList(1,8);//subList与c2等价，内容相同
        Collection<String> c2=new ArrayList<String>(subList);
        //System.out.println(subList.equals(c2)); //true
        try
        {
            c.retainAll(c2);
        }catch (Exception e)
        {
            System.out.println("retain all():"+e);
        }
        try
        {
            c.removeAll(c2);
        }catch (Exception e)
        {
            System.out.println("remove all():"+e);
        }
        try
        {
            c.clear();
        }catch (Exception e)
        {
            System.out.println("clear():"+e);
        }
        try
        {
            c.add("x");
        }catch (Exception e)
        {
            System.out.println("add():"+e);
        }
        try
        {
            c.addAll(c2);
        }catch (Exception e)
        {
            System.out.println("addAll:"+e);
        }
        try
        {
            c.remove("C");
        }catch (Exception e)
        {
            System.out.println("remove():"+e);
        }
        try
        {
            list.set(0,"X");
        }catch (Exception e)
        {
            System.out.println("list.set():"+e);
        }
    }
    public static void main(String[] args)
    {
        List<String>list=Arrays.asList("A B C D E F G H I J K L ".split(" "));
        test("Modifiable Copy",new ArrayList<String>(list));
        //test("Arrays.asList()",list);
        //test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}
