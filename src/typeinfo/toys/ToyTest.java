package typeinfo.toys;
/**
 * Created by Administrator on 2017/6/18.
 */
interface HasBetteries{}
interface WaterProof{}
interface Shoots{}
interface Shockproof{}
class Toy
{
    /*public Toy()
    {
    }*/
    public Toy(int i)
    {
    }
}
class FancyToy extends Toy implements HasBetteries,WaterProof,Shoots,Shockproof
{
    public FancyToy()
    {
        super(1);
    }
}
public class ToyTest
{
    static void printInfo(Class cc)
    {//分别打印出类名，判断是否是接口，简单类名，完整路径
        System.out.println("class name:"+cc.getName()+" is interface ?["+cc.isInterface()+"]");
        System.out.println("Simple name:"+cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
    }

    public static void main(String[] args)
    {
            Class c=null;
            try
            {
                c=Class.forName("typeinfo.toys.FancyToy");//获得FancyToy类的引用
            }catch (ClassNotFoundException e)
            {
                System.out.println("cann't find FancyToy");
                System.exit(1);
            }
            printInfo(c);
            for(Class face:c.getInterfaces())//获得接口的的引用
            {
                printInfo(face);
            }
            Class up=c.getSuperclass();
            Object obj=null;
            try
            {
                obj=up.newInstance();
            }
            catch (InstantiationException e)
            {
                System.out.println("Cannot instantiate");
                System.exit(1);
            }catch (IllegalAccessException e)
            {
                System.out.println("Cannot access");
                System.exit(1);
            }
            printInfo(obj.getClass());

        }



}
