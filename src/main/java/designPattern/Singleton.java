package designPattern;
/**单例模式
 * Created by xufuxiu on 2017/9/19.
 */
public class Singleton
{
    /*//饿汉式单例
    private Singleton(){}
    private static Singleton instance=new Singleton();
    public static Singleton getInstance()
    {
        return instance;
    }*/

    //懒汉式单例
    private static Singleton instance=null;
    private Singleton(){}
    public static synchronized Singleton getInstance()
    {
        if (instance==null)instance=new Singleton();
        return instance;
    }

    public static void main(String[] args)
    {
        System.out.println(getInstance());
    }
}
/*注意：实现一个单例有两点注意事项，①将构造器私有，不允许外界通过构造器创建对象；②通过公开的静态方法向外界返回类的唯一实例。这里有一个问题可以思考：Spring的IoC容器可以为普通的类创建单例，它是怎么做到的呢？*/