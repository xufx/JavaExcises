package interfaces.interfaceprocessor;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/6/13.
 */
public abstract class StringProcessor implements Processor
{

    public String name()
    {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s="if she weights the same as d duck,she's made of wood";
    public static void main(String[] args)
    {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }

}
class Upcase extends StringProcessor
{

    public String process(Object input)
    {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor
{
    public String process(Object input)
    {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor
{
    public String process(Object input)
    {
        return Arrays.toString(((String)input).split(" "));
    }
}
