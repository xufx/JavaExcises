package innerclasses;
/**匿名内部类
 * Created by Administrator on 2017/6/13.
 */

public class Parcel7
{
    public Contents contents()
    {
        return
                new Contents()
        {//insert a class definition
            private int i=11;
            public int value(){return i;};
        };
    }

    public static void main(String[] args)
    {
        Parcel7 p=new Parcel7();
        Contents c=p.contents();
    }
}
