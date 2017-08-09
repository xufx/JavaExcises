package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Compare
{
    static int test(int testVal,int begin,int end)
    {
        if (testVal<begin) return -1;
        else if (testVal>begin && testVal<end)return 0;
        else return 1;
    }
    public static void main(String[] args)
    {
        System.out.println(test(12,6,9));
    }
}
