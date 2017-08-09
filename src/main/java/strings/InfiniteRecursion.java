package strings;
import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.ArrayList;
import java.util.List;
/**递归调用，Object.toString()打印出对象的内存地址
 * Created by Administrator on 2017/6/24.
 */
public class InfiniteRecursion
{
    @Override
    public String toString()
    {//InfiniteRecursion转为String类型，调用this的toString（）
        return super.toString();//打印出对象地址
        //return "InfiniteRecursion address:"+this+"\n";//打印出一串错误
    }
    public static void main(String[] args)
    {
        List<InfiniteRecursion>v=new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
        {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
