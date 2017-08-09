package basics;

/**
 * Created by Administrator on 2017/6/9.
 */
class  Dog
{
    public void bark(){ System.out.println("hi");}
    public  void bark(String s)
    {
        System.out.println(s);
    }
}
public class Dog2
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.bark("barking");

    }
}
