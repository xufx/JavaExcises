package containers;
import java.util.*;
/**两种用对单个对象的引用来填充Collection的方式
 * Created by Administrator on 2017/6/27.
 */
class StringAddress
{
    private String s;
    public StringAddress(String s)
    {
        this.s=s;
    }
    @Override
    public String toString()
    {
        return super.toString()+" "+s;
    }
}
public class FillingLists
{
    public static void main(String[] args)
    {
        List<StringAddress> list=new ArrayList<>(
                Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);

        Collections.fill(list,new StringAddress("World"));
        System.out.println(list);
    }
}
