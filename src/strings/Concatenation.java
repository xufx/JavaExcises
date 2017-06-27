package strings;
/**
 * Created by Administrator on 2017/6/24.
 */
public class Concatenation
{
    public static void main(String[] args)
    {
        String mango="mango";
        String s="abc"+mango+"def"+47;//自动创建StringBuilder对象，调用append（）方法
        System.out.println(s);
    }
}
