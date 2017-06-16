package interfaces.filters;
/**
 * Created by Administrator on 2017/6/13.
 */
public class Filter
{
    public  String name()
    {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input)
    {
        return input;
    }
}
