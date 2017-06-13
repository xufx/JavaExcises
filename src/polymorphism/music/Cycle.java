package polymorphism.music;
/**
 * Created by Administrator on 2017/6/12.
 */
public class Cycle
{
    private int n;
    public void ride()
    {
        System.out.println("Cycle.ride()");
        System.out.println("the number of wheels are:"+wheels());
    }
    public void seat(Cycle c)
    {
        System.out.println("Cycle.ride()");
    }
    public int  wheels()
    {
        return n;
    }
    public Cycle(int n)
    {
        this.n=n;
    }

    public static void main(String[] args)
    {
        Unicycle u=new Unicycle(4);

        u.ride();
    }
}
class Unicycle extends Cycle
{
    public Unicycle(int n)
    {
        super(n);
    }
    public void ride(Cycle c)
    {
        System.out.println("UniCycle.ride()");
    }
}
class Bicycle extends Cycle
{
    public Bicycle(int n)
    {
        super(n);
    }
    public void ride(Cycle c)
    {
        System.out.println("Bicycle.ride()");
    }
}
class Tricycle extends Cycle
{
    public Tricycle(int n)
    {
        super(n);
    }
    public void ride(Cycle c)
    {
        System.out.println("TriCycle.ride()");
    }
}