package innerclasses;
/**基类需要有参数的构造器
 * Created by Administrator on 2017/6/13.
 */
public class Parcel8
{
    public Wrapping wrapping(int x)
    {
        return new Wrapping(x)
        {
            public int value()
            {
                return super.value()*47;
            }
        };
    }


    public static void main(String[] args)
    {
        Parcel8 p=new Parcel8();
        Wrapping w=p.wrapping(10);
    }
}
