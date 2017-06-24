package strings;
/**
 * Created by Administrator on 2017/6/24.
 */
public class WhitherStringBuilder
{
    String[] fields;
    public WhitherStringBuilder(String[] fields)
    {
        this.fields = fields;
    }
    public String implicit(String[] fields)
    {
        String result="";
        for (int i = 0; i < fields.length; i++)
        {
            result+=fields[i];//只生成一个StringBuilder对象
        }
        return result;
    }
    public String explicit(String[] fields)
    {
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < fields.length; i++)
        {
           result.append(fields[i]);//每次循环都生成一个StringBuilder对象
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        String[] s="we are chinese".split(" ");
        WhitherStringBuilder w=new WhitherStringBuilder(s);
        System.out.println(w.implicit(s));
        System.out.println(w.explicit(s));
    }
}
