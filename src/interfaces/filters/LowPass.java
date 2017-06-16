package interfaces.filters;
/**
 * Created by Administrator on 2017/6/13.
 */
public class LowPass extends Filter
{
    double cutoff;
    public LowPass(double cutoff)
    {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input)
    {
        return input;
    }
}
