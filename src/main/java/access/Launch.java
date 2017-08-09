package access;

/**
 * Created by Administrator on 2017/6/11.
 */
class Soup1
{
    private Soup1(){ }
    public static Soup1 makeSoup()
    {
        return new Soup1();
    }
}
class Soup2
{
    private Soup2(){}
    private static Soup2 ps2=new Soup2();
    public static Soup2 access()
    {
        return ps2;
    }
    public  void f(){}
}
public class Launch
{
    void testPrivate()
    {
        //Soup1 soup=new Soup1();
    }
    void testStatic()
    {
        Soup1 soup=Soup1.makeSoup();
    }
    void testSingleton()
    {
        Soup2.access().f();
    }
}
