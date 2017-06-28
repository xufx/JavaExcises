package containers;
/**容器测试框架
 * Created by Administrator on 2017/6/28.
 */
public abstract class Test<C>
{
    String name;
    public Test(String name)
    {
        this.name = name;
    }
    abstract int test(C container,TestParam tp);
}
