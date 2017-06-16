package innerclasses;
/**在任意的作用域内嵌入一个内部类
 * Created by Administrator on 2017/6/13.
 */

public class Parcel6
{
    public void internalTracking(boolean b)
    {
        if(b)
        {
            class TrackingSlip
            {
                private String id;
                TrackingSlip(String s)
                {
                    id=s;
                }
                String getSlip(){return  id;}
            }
            TrackingSlip ts=new TrackingSlip("slip");
            String s=ts.getSlip();
        }
    }
    public void track()
    {
        internalTracking(true);
    }

    public static void main(String[] args)
    {
        Parcel6 p=new Parcel6();
        p.track();
    }
}
