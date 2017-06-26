package strings;
import java.util.Arrays;
import java.util.regex.Pattern;
/**字符串转为数组
 * Created by Administrator on 2017/6/26.
 */
public class SplitDemo
{
    public static void main(String[] args)
    {
        String input="This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
