package interfaces.music4;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 * Created by Administrator on 2017/6/12.
 */
enum Note
{
    MIDDLE_C,MIDDLE_D
}
abstract class Instrument
{
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument";}
    public abstract void ajust();
}
class Wind extends Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println("Wind.play()"+n);
    }
    public String what(){return "Wind";}
    public  void ajust(){};
}
class Percussion extends Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println("Percussion.play()"+n);
    }
    public String what(){return "Percussion";}
    public  void ajust(){};
}
class Stringed extends Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println("Stringed.play()"+n);
    }
    public String what(){return "Stringed";}
    public  void ajust(){};
}
class Brass extends Wind
{
    @Override
    public void play(Note n)
    {
        System.out.println("Brass.play()"+n);
    }
    public String what(){return "Brass";}
    public  void ajust(){};
}
class Woodwind extends Wind
{
    @Override
    public void play(Note n)
    {
        System.out.println("Woodwind.play()"+n);
    }
    public String what(){return "Woodwind";}
    public  void ajust(){};
}
public class Music4
{
    static void tune(Instrument i)
    {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e)
    {
        for(Instrument i:e)
        {
            tune(i);
        }
    }
    public static void main(String[] args)
    {
        Instrument[] orchestra=
                {
                        new Wind(),
                        new Percussion(),
                        new Stringed(),
                        new Brass(),
                        new Woodwind()
                };
                tuneAll(orchestra);
    }
}

