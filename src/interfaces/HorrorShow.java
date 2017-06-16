package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface Monster
{
    void menace();
}
interface DangerousMonster extends Monster
{
    void destroy();
}
interface Lethal
{
    void kill();
}
class DragonZilla  implements DangerousMonster
{
    @Override
    public void menace(){System.out.println(this+" menace");};
    @Override
    public void destroy(){System.out.println(this+" destroy");};
    public String toString()
    {
        return "DragonZilla";
    }
}
interface Vampire extends DangerousMonster,Lethal
{//仅适用于接口继承，只可以将extends用于单一类，但是可以引用多个基类接口
    void drinkBlood();
}
class VeryBadVampire implements Vampire
{
    @Override
    public void menace()
    {
        System.out.println(this+" menace");
    }
    @Override
    public void destroy()
    {
        System.out.println(this+" destroy");
    }
    @Override
    public void kill()
    {
        System.out.println(this+" kill");
    }
    @Override
    public void drinkBlood()
    {
        System.out.println(this+" drinkBlood");
    }
    @Override
    public String toString()
    {
        return "VeryBadVampire";
    }
}
public class HorrorShow
{
    static void u(Monster b)
    {
        b.menace();
    }
    static void v(DangerousMonster d)
    {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l)
    {
        l.kill();
    }
    public static void main(String[] args)
    {
        DangerousMonster barney=new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }

}
