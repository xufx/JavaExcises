package arrays;
import net.mindview.util.CountingGenerator;

import java.util.Arrays;
import java.util.Random;
/**返回一个数组
 * Created by Administrator on 2017/6/26.
 */
public class IceCream
{
    private static Random rand=new Random(47);
    static  final  String[] FLAVORS=
            {
                    "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
                    "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
                    "Praline Cream", "Mud Pie"
            };
    public  static String[] flavorSet(int n)
            {
                if (n>FLAVORS.length)
                    throw new IllegalArgumentException("Set too big");
                String[] results=new String[n];
                boolean[] picked=new boolean[FLAVORS.length];
                for (int i = 0; i < n; i++)
                {
                    int t;
                    do
                    {
                        t=rand.nextInt(FLAVORS.length);
                    }
                    while (picked[t]);
                    results[i]=FLAVORS[t];
                    picked[t]=true;
                }
                return results;
            }
    public static void main(String[] args)
    {
        for (int i = 0; i <7 ; i++)
        {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }

}
