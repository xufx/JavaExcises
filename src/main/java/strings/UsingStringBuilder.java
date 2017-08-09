package strings;
import java.util.Random;
/**
 * Created by Administrator on 2017/6/24.
 */
public class UsingStringBuilder
{
    public static Random rand=new Random(47);
    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder(("["));
        for (int i = 0; i < 25; i++)
        {
            result.append(rand.nextInt(100));
            result.append(",");
        }
        result.delete(result.length()-2,result.length());//删除最后一个“，”
        result.append("]");
        return result.toString();
    }
    public static void main(String[] args)
    {
        UsingStringBuilder usb=new UsingStringBuilder();
        System.out.println(usb);
    }
}
