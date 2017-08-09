package polymorphism.music;
/**
 * Created by Administrator on 2017/6/12.
 */
enum Note
{
    MIDDLE_C,MIDDLE_D
}
class Instrument
{
    public void play(Note n)
    {
        System.out.println("Instrument.play()"+n);
    }
    String what(){return "Instrument";}
    void just(){System.out.println("adjusting Instrument");}
    @Override
    public String toString()
    {
        return what();
    }
}

class Percussion
{
    public void play(Note n)
    {
        System.out.println("Percussion.play()"+n);
    }
    String what(){return "Percussion";}
    void just(){System.out.println("adjusting Percussion");}
}
class Wind
{
        public static void tune(Instrument i)
        {
            i.play(Note.MIDDLE_C);
        }
        public static void main(String[] args)
        {
            Wind flute=new Wind();
            //tune(flute);
        }

}
class Woodwind extends Wind
{
    public void play(Note n)
    {
        System.out.println("Woodwind.play()"+n);
    }
    String what(){return "Woodwind";}
}
class Stringed
{

    public void play(Note n)
    {
        System.out.println("Stringed.play()"+n);
    }
    String what(){return "Stringed";}
    void just(){System.out.println("adjusting Stringed");}
}
class Brass
{

    public void play(Note n)
    {
    }
    String what()
    {
        return "Brass";
    }
    void just()
    {
        System.out.println("Brass Wind");
    }
}
public class Music3
{
    public static void tune(Instrument i)
    {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e)
    {
        for (Instrument i:e)tune(i);
    }

    public static void main(String[] args)
    {
        Instrument[] orchestra=
                {
                        /*new Wind(),
                        new Percussion(),
                        new Stringed(),
                        new Brass(),
                        new Woodwind()*/
                };
                tuneAll(orchestra);
        Instrument in=new Instrument();
        System.out.println(in);
    }
}
