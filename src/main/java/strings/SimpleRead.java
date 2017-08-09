package strings;
import net.mindview.util.CountingGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
/**扫描输入
 * Created by Administrator on 2017/6/26.
 */
public class SimpleRead
{
    public static BufferedReader input=new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803")
    );
    public static void main(String[] args)
    {
        try{
            System.out.println(input);
            System.out.println("what is your name");
            String name=input.readLine();//读取第一行

            System.out.println(name);
            System.out.println("How old are you?what is your favorite double2");
            System.out.println("(input<age><double>)");

            String numbers=input.readLine();//读取第二行
            System.out.println(numbers);

            String[] numArray=numbers.split(" ");//字符串=》字符串数组
            int age=Integer.parseInt(numArray[0]);//字符串转为整数
            double favorite= Double.parseDouble(numArray[1]);//字符串转为双精度数

            System.out.format("Hi %s.\n",name);
            System.out.format("In 5 years you will be %d.\n",age+5);
            System.out.format("My favorite double is %f.",favorite/2);
        }catch (IOException e)
        {
            System.err.println("I/O exception");
        }
    }
}
