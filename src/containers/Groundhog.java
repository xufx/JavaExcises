package containers;
/**将土拨鼠对象与Prediction对象联系起来
 * Created by Administrator on 2017/6/28.
 */
public class Groundhog
{
    protected int number;
    public Groundhog(int number)
    {
        this.number = number;
    }
    @Override
    public String toString()
    {
        return "Groundhog #"+number;
    }
}
