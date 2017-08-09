package interfaces.filters;
/**
 * Created by Administrator on 2017/6/13.
 */
public class Waveform
{
    private static long counter;
    private final long id=counter++;
    @Override
    public String toString()
    {
        return "Waveform:"+id;
    }
}



