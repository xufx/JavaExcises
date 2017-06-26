package strings;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ReplacingStringTokenizer
{
    public static void main(String[] args)
    {
        String input="But I'm not dead yet! I feel happy!";

        StringTokenizer stoke=new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.println(stoke.nextToken()+" ");
        System.out.println(Arrays.toString(input.split(" ")));

        Scanner scanner=new Scanner(input);
        while(scanner.hasNext())
            System.out.println(scanner.next()+" ");
    }
}
