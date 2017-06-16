package innerclasses;
/**当继承了某个外围类的时候，内部类并没有发生变化，一下两个内部类相互独立
 * Created by Administrator on 2017/6/15.
 */
class Egg
{
    private Yolk y;
    protected class Yolk
    {
        public Yolk()
        {
            System.out.println("Egg.Yolk() constructor");
        }
    }
    public Egg()
    {
        System.out.println("new Egg()");
        y=new Yolk();
    }
}

public class BigEgg extends Egg
{
    public class Yolk
    {
        public Yolk()
        {
            System.out.println("BigEgg.Yolk() constructor");
        }

    }
    public static void main(String[] args)
    {
        new BigEgg();
    }
}
