package strings;
/**
 * Created by Administrator on 2017/6/25.
 */
public class Rudolph
{
    public static void main(String[] args)
    {
        for (String pattern:new String[]
                {
                        "Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*","R.*"
                })
            System.out.println("Rudolph".matches(pattern));
    }
}
