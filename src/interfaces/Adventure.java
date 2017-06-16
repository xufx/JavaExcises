package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface CanFight
{
    void fight();
}
interface CanSwim
{
     void swim();
}
interface CanFly
{
    void fly();
}

class ActionCharacter
{
    public void fight(){System.out.println("ActionCharacter.fight()");}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly
{//当通过这种方式将一个具体类和多个接口组合到一起时，这个具体类必须放在前面，后面跟着的才是接口
    @Override
    public void swim()
    {
        System.out.println("swim");
    }
    @Override
    public void fly()
    {
        System.out.println("fly");
    }
}
public class Adventure
{
    public static void t(CanFight x){x.fight();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void w(ActionCharacter x){x.fight();}
    public static void main(String[] args)
    {
        Hero h=new Hero();
       Adventure a=new Adventure();
        a.t(h);
        a.u(h);
        a.v(h);
        a.w(h);


    }
}
