package interfaces;
/**
 * Created by Administrator on 2017/6/13.
 */
abstract class Access
{
    public abstract void fa();
    public abstract void ga();
    public abstract void fb();
    public abstract void gb();
    public abstract void fc();
    public abstract void gc();
    public abstract void d();
}
public class AbstractTest extends Access
{
    public void fa(){}
    public void ga()
    {
    }
    public void fb(){}
    @Override
    public void gb()
    {
    }
    @Override
    public void fc(){}
    public void gc()
    {
    }
    @Override
    public void d()
    {
    }
    public static void main(String[] args)
    {

    }
}
