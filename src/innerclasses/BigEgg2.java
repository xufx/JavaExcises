package innerclasses;
class Egg2
{

    protected class Yolk
    {
        public Yolk()
        {
            System.out.println("Egg2.Yolk() constructor");
        }
        public void f()
        {
            System.out.println("Egg2.Yolk().f()");
        }
    }
    private Yolk y=new Yolk();

    public Egg2()
    {
        System.out.println("new Egg2()");
        y=new Yolk();
    }
    public void insertWork(Yolk yy)
    {
        y=yy;
    }
    public void g()
    {
        y.f();
    }
}
public class BigEgg2 extends Egg2
{
    public class Yolk extends Egg2.Yolk
    {
        public Yolk()
        {
            System.out.println("BigEgg2.Yolk() constructor");
        }
        @Override
        public void f()
        {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2()
    {
        insertWork(new Yolk());
    }
    public static void main(String[] args)
    {
        Egg2 e2=new BigEgg2();
        e2.g();
    }
}
