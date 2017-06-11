package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
public class OverloadTest
{
    void test(int i)
    {
        System.out.println("test int");
        System.out.println(i);
    }
    void test(float i)
    {
        System.out.println("test float");
        System.out.println(i);
    }
    void test(String i)
    {
        System.out.println("test string");
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        OverloadTest2 o=new OverloadTest2();
        o.test(20);
    }
}
class OverloadTest2 extends OverloadTest
{
    void test(char i)
    {
        System.out.println("test char");
        System.out.println(i);
    }
}
