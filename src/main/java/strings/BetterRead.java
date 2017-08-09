package strings;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/6/26.
 */
public class BetterRead
{
    public static void main(String[] args)
    {
        Scanner stdin=new Scanner(SimpleRead.input);
        System.out.println("what is your name?");
        String name=stdin.nextLine();//读取第一行

        System.out.println(name);
        System.out.println("how old are you?what is your favorite double?");
        System.out.println("(input:<age><double>");
        int age=stdin.nextInt();//读取整数
        double favorite=stdin.nextDouble();//读取双精度浮点数

        System.out.println(age);
        System.out.println(favorite);

        System.out.format("Hi %s.\n",name);
        System.out.format("In 5 years you will be %d.\n",age+5);
        System.out.format("My favorite double is %f.",favorite/2);
    }
}
