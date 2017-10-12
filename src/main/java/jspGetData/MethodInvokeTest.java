package jspGetData;
import java.lang.reflect.Method;
/**通过反射调用对象的方法
 * Created by xufuxiu on 2017/9/19.
 */
public class MethodInvokeTest
{
    public static void main(String[] args)throws  Exception
     {
         String str="hello";
         Method m=str.getClass().getMethod("toUpperCase");
         System.out.println(m.invoke(str));
     }
}
