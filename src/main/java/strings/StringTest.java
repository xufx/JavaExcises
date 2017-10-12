package strings;
import static util.Common.sy;
/**数组初始化的练习
 * Created by xufuxiu on 2017/9/22.
 */
public class StringTest
{
    int[] a;
    StringTest(String s)
    {
       sy("string");
    }
    StringTest(int[] a)
    {
        sy("int[]");
        /*this.a = a;
        for (int i = 0; i <a.length ; i++)
        {
           sw(this.a[i]+",");
        }*/

    }
    StringTest(String ... a)
    {
        sy("String[]");
    }
    public static void main(String[] args)
    {
       StringTest at=new StringTest("HELLO");
        StringTest st=new StringTest(new int[]{1,2,3,4,5});
        StringTest st2=new StringTest(new String[]{"1","2"});
        StringTest st3=new StringTest();
    }

}
