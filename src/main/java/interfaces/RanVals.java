package interfaces;
import java.util.Random;
/**接口中的域默认是static的
 * Created by Administrator on 2017/6/13.
 */
interface RanVals2
{
    Random RAND=new Random(47);
    int RANDOM_INT=RAND.nextInt(10);
    long RANDOM_LONG=RAND.nextLong()*10;
    float RANDOM_FLOAT=RAND.nextLong()*10;
    Double RANDOM_DOUBLE=RAND.nextDouble()*10;
}
public class RanVals
{

    public static void main(String[] args)
    {
        System.out.println(RanVals2.RAND);
        System.out.println(RanVals2.RANDOM_INT);
        System.out.println(RanVals2.RANDOM_LONG);
        System.out.println(RanVals2.RANDOM_FLOAT);
        System.out.println(RanVals2.RANDOM_DOUBLE);
    }
}
