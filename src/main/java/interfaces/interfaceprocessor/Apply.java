package interfaces.interfaceprocessor;
/**
 * Created by Administrator on 2017/6/13.
 */
public class Apply
{
    public  static void process(Processor p,Object s)
    {
        System.out.println("using processor"+p.name());
        System.out.println(p.process(s));
    }
}
