package polymorphism;
/**练习复杂对象调用构造器的顺序
 * Created by Administrator on 2017/6/12.
 * 1）调用基类构造器
 * 2）按申明顺序调用成员的初始化方法
 * 3）调用导出类构造器的主体
 */
class Meal
{
    public Meal()
    {
        System.out.println("Meal()");
    }
}
class Bread
{
    public Bread()
    {
        System.out.println("Bread()");
    }
}
class Cheese
{
    public Cheese()
    {
        System.out.println("Cheese()");
    }
}
class Lettuce
{
    public Lettuce()
    {
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal
{
    public Lunch()
    {
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch
{
    public PortableLunch()
    {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch
{
    private Bread b=new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    public  Sandwich(){System.out.println("Sanwitch");}
    public static void main(String[] args)
    {
        new Sandwich();
    }
}
