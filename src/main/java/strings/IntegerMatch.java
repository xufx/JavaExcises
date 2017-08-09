package strings;
/**正则表达式
 * Created by Administrator on 2017/6/25.
 */
public class IntegerMatch
{
    public static void main(String[] args)
    {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));//数字前面有一个“-”有一个或多个数字
        System.out.println("+911".matches("-|\\+?\\d+"));//有一个“-” 或“+” 开头，有一个或多个数字
    }
}
