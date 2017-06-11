package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
class Component1
{
    int i;
    public Component1(int i)
    {
       this.i=i;
        System.out.println("Component1 constructor");
    }
}
class Component2
{
    int i;
    public Component2(int i)
    {
        this.i=i;
        System.out.println("Component2 constructor");
    }
}
class Component3
{
    int i;
    public Component3(int i)
    {
        this.i=i;
        System.out.println("Component3 constructor");
    }
}
class Root
{
    Component1 c1=new Component1(1);
    Component2 c2=new Component2(2);
    Component3 c3=new Component3(3);
}
public class Stem extends Root
{
    public Stem()
    {
        System.out.println("stem constructor");
    }
    public static void main(String[] args)
    {
        Stem s=new Stem();
        Component1 c1=new Component1(1);
        Component2 c2=new Component2(2);
        Component3 c3=new Component3(3);
    }

}
