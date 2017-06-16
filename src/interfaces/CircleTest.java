package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
interface Cycle
{
    void f();
}
interface CycleFactory
{
    Cycle getCycle();
}
class Unicycle implements Cycle
{
    @Override
    public void f()
    {
        System.out.println("Unicycle.f()");
    }
}
class UnicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Unicycle();
    }
}
class Bicycle implements Cycle
{
    @Override
    public void f()
    {
        System.out.println("Bicycle.f()");
    }
}
class BicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Bicycle();
    }
}
class Tricycle implements Cycle
{
    @Override
    public void f()
    {
        System.out.println("Tricycle.f()");
    }
}
class TricycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Tricycle();
    }
}

public class CircleTest
{
    public static void throwCoin(CycleFactory factory)
    {
        Cycle c=factory.getCycle();
        c.f();
    }
    public static void main(String[] args)
    {
        CircleTest.throwCoin(new BicycleFactory());
    }
}
