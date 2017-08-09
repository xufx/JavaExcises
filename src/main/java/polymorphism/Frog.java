package polymorphism;
import reusing.Detergent;

import java.util.stream.Collector;
/**
 * Created by Administrator on 2017/6/12.
 */
class Characteristic
{
    private String s;
    public Characteristic(String s)
    {
        this.s = s;
        System.out.println("Creating Characteristic"+s);
    }
    protected void dispose()
    {
        System.out.println(" disposing Characteristic"+s);
    }
}
class Description
{
    private String s;
    public Description(String s)
    {
        this.s = s;
        System.out.println("Creating Description"+s);
    }
    protected void dispose()
    {
        System.out.println("disposing Description"+s);
    }
}
class LivingCreature
{
    private Characteristic p=new Characteristic(" is alive");
    private Description t=new Description(" Basic Living Creature");
    LivingCreature()
    {
        System.out.println("Living creature");
    }
    protected void dispose()
    {
        System.out.println("LivingCreature disposing");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature
{
    private Characteristic p=new Characteristic(" has heart");
    private Description t=new Description(" Animal  not vegetable");
    public Animal()
    {
        System.out.println("Animal");
    }
    protected void dispose()
    {
        System.out.println("Animal disposing");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal
{
    private Characteristic p=new Characteristic(" can live in water");
    private Description t=new Description(" both water and land");
    public Amphibian()
    {
        System.out.println("Amphibian");
    }
    protected void dispose()
    {
        System.out.println("Amphibian disposing");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian
{
    private Characteristic p=new Characteristic(" croaks");
    private Description t=new Description(" eats bugs");
    public Frog()
    {
        System.out.println("Frog");
    }
    protected void dispose()
    {
        System.out.println("Frog disposing");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args)
    {
        Frog frog=new Frog();
        System.out.println("Bye");
        frog.dispose();
    }
}
