package arrays;

import net.mindview.util.Generator;

/**测试Generator的任何集合
 * Created by xufuxiu on 2017/6/26.
 */
public class GeneratorsTest
{
    public static int size=10;
    public static void test(Class<?>surroundingClass)
    {
        for (Class<?>type:surroundingClass.getClasses())
        {
            System.out.println(type.getSimpleName()+":");
            try
            {//创建类的实例，调用10次实例的next（）方法
                Generator<?> g=(Generator<?>)type.newInstance();
                for (int i = 0; i < size; i++)
                {
                    System.out.println(g.next()+" ");
                }
            }catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args)
    {
        /*获得CountinhGenerator的类*/
        test(CountingGenerator.class);
    }
}
