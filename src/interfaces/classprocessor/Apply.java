package interfaces.classprocessor;
import java.util.Arrays;
/**策略设计模式
 * Created by Administrator on 2017/6/13.
 */
class Processor
{
    public String name()
    {
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}
class Upcase extends Processor
{
    @Override
    Object process(Object input)
    {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor
{
    Object process(Object input)
    {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor
{
    Object process(Object input)
    {
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply
{
    public  static void process(Processor p,Object s)
    {
        System.out.println("using processor"+p.name());
        System.out.println(p.process(s));
    }
    public static String s="Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args)
    {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
