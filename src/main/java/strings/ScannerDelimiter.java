package strings;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/6/26.
 */
public class ScannerDelimiter
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner("12,42,78,99,42");
        scanner.useDelimiter("\\s*,\\s*");//使用“，”作为界定符
        while (scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
