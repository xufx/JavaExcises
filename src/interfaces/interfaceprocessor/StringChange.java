package interfaces.interfaceprocessor;

/**
 * Created by Administrator on 2017/6/13.
 */
public class StringChange
{
    public String name()
    {
        return getClass().getSimpleName();
    }
    public String change(String str)
    {
        char[] chars = str.toCharArray();
        int length = chars.length - 1;
        for (int i = 0; i < length / 2; i++)
        {
            char a = chars[i];
            chars[i] = chars[length - i];
            chars[length - i] = a;
        }
        StringBuilder builder = new StringBuilder();
        for (char a : chars)
        {
            //builder.append();
        }
        return builder.toString();
    }
    public static void main(String[] args)
    {
        String str = "abcdef";
        Apply.process(new StringAdapter(new StringChange()), str);
    }
}
class StringAdapter implements Processor
{
    StringChange sc;
    public StringAdapter(StringChange stringChange)
    {
        sc = stringChange;
    }
    @Override
    public String name()
    {
        return sc.name();
    }
    @Override
    public Object process(Object input)
    {
        return sc.change((String)input);
    }
}