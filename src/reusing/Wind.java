package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
class Instrument
{
    public void play(){}
    static void tune(Instrument i){}
}
public class Wind extends Instrument
{
    public static void main(String[] args)
    {
        Wind flute=new Wind();
        Instrument.tune(flute);
    }
}
