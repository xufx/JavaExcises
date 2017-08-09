package reusing;

/**
 * Created by Administrator on 2017/6/11.
 */
class Cleanser
{
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}
    public  String toString(){return s;}

    public static void main(String[] args)
    {
        Cleanser x=new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}
public class Detergent extends Cleanser
{
    public void scrub()
    {
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam()
    {
        append("foam()");
    }

    public static void main(String[] args)
    {
        Detergent2 x=new Detergent2();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("testing base class");
        Cleanser.main(args);
    }
}
class Detergent2 extends Detergent
{
    @Override
    public void scrub()
    {
        append("Detergent2.scrub()");
    }
    public void sterilize()
    {
        append("sterilize()");
    }
}