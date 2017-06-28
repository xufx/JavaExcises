package containers;
import java.util.Random;
/**predicting the weather with groundhogs
 * Created by Administrator on 2017/6/28.
 */
public class Prediction
{
    private  static Random rand=new Random(47);
    private  boolean shadow=rand.nextDouble()>0.5;
    @Override
    public String toString()
    {//解释结果
        if (shadow)
            return "Six more weeks of Winter!";
        else
            return "Early Spring!";
    }
}
