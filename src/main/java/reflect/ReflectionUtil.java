package reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/**反射工具类,获取或指定类的私有域
 * Created by xufuxiu on 2017/9/19.
 */
public class ReflectionUtil
{
    public ReflectionUtil()
    {
        throw new AssertionError();
    }
    public static void main(String[] args)
    {

    }
    /**
     * 通过反射获取对象私有字段的值
     * @param target 目标对象
     * @param fieldName 字段名字
     * @throws
     * @return 字段的值
     */
    public static Object getValue(Object target,String fieldName)
    {
        //获得类的类对象 class+包名+类名
        Class<?>clazz=target.getClass();
        //将字段数组用.分开为字符串数组，其中每个元素都是对象的字段
        String[] fs=fieldName.split("\\.");
        try
        {
            for (int i = 0; i <fs.length ; i++)
            {
                //获得字段 private+java.lang.String+包名+类名+字段名
                Field f=clazz.getDeclaredField(fs[i]);
                f.setAccessible(true);//将私有字段设置为可访问
                target=f.get(target);//获取字段的值
                clazz=target.getClass();
            }
            Field f=clazz.getDeclaredField(fs[fs.length-1]);
            f.setAccessible(true);
            return f.get(target);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    /**
     * 通过反射指定对象字段的值
     * @param target 目标对象
     * @param fieldName 字段名字
     * @value 字段的值
     * @return 字段的值
     */
    public static void setValue(Object target,String fieldName,Object value)
    {
        Class<?>clazz=target.getClass();//获得类的类对象
        String[] fs=fieldName.split("\\.");
        try
        {
            for (int i = 0; i <fs.length ; i++)
            {
                Field f=clazz.getDeclaredField(fs[i]);
                f.setAccessible(true);
                Object val=f.get(target);
                if (val==null)
                {
                    Constructor<?>c=f.getType().getDeclaredConstructor();
                    c.setAccessible(true);
                    val=c.newInstance();
                    f.set(target,val);
                }
                target=val;
                clazz=target.getClass();
            }
            Field f=clazz.getDeclaredField(fs[fs.length-1]);
           f.set(target,value);
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
