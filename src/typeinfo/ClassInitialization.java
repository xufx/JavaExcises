package typeinfo;
import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import java.util.Random;
import java.util.concurrent.ExecutionException;
/**
 * Created by Administrator on 2017/6/18.
 */
class Initable
{
    static final int staticFinal1=47;
    //staticFinal2不是编译期常量，，访问时将强制进行初始化
    static final int staticFinal2=ClassInitialization.rand.nextInt(1000);
    static
    {
        System.out.println("Initializing Initable");
    };
}
class Initable2
{
    static int staticNonFinal=147;
    static {System.out.println("Initializing Initable2");}
}
class Initable3
{
    static int staticNonFinal=74;
    static {System.out.println("Initializing Initable3");}
}
public class ClassInitialization
{
   public static Random rand=new Random();
    public static void main(String[] args)throws Exception
    {
        Class initable=Initable.class;
            System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal1);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3=Class.forName("typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
