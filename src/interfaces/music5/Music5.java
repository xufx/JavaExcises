package interfaces.music5;
/**练习接口
 * Created by Administrator on 2017/6/13.
 */
enum Note
{
    MIDDLE_C,MIDDLE_D
}

interface Instrument
{
    int VALUE=5;//abstract & final
    void play(Note n);//automatically public
    void adjust();
}
class Wind implements Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println(this+".play()"+n);
    }
    @Override
    public String toString()
    {
        return "Wind";
    }
    @Override
    public void adjust()
    {
        System.out.println(this+".adjust()");
    }
}
class Percussion implements Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println(this+".play()"+n);
    }
    @Override
    public String toString()
    {
        return "Percussion";
    }
    @Override
    public void adjust()
    {
        System.out.println(this+".adjust()");
    }
}
class Stringed implements Instrument
{
    @Override
    public void play(Note n)
    {
        System.out.println(this+".play()"+n);
    }
    @Override
    public String toString()
    {
        return "Stringed";
    }
    @Override
    public void adjust()
    {
        System.out.println(this+".adjust()");
    }
}
class Brass extends Wind
{
    @Override
    public String toString()
    {
        return "Brass";
    }
}
class Woodwind extends Wind
{
    @Override
    public String toString()
    {
        return "Woodwind";
    }
}
public class Music5
{
    static void tune(Instrument i)
    {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e)
    {
        for(Instrument i:e)
            tune(i);
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
