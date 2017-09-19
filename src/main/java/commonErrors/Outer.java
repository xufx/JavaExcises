package commonErrors;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class Outer
{
    class Inner{}//非静态内部类对象
    //public static void foo(){new Inner();}
    public static void foo(){new Outer().new Inner();}
    public void bar(){new Inner();}
    /*public static void main(String[] args)
    {
        new Inner();
    }*/
    public static void main(String[] args)
    {
       new Outer().new Inner();
    }
}
