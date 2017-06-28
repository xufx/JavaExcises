package containers;
/**将土拨鼠对象与Prediction对象联系起来
 * Created by Administrator on 2017/6/28.
 */
public class Groundhog2 extends Groundhog
{
    public Groundhog2(int number)
    {
        super(number);
    }
    @Override
    public int hashCode()
    {
        return number;
    }
    @Override
    public boolean equals(Object o)
    {
        return o instanceof Groundhog2 && (number==((Groundhog2)o).number);
    }
}
