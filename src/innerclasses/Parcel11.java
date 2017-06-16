package innerclasses;
/**基类需要有参数的构造器
 * Created by Administrator on 2017/6/13.
 */
public class Parcel11
{
    private static class ParcelContents implements Contents
    {
        private int i = 11;
        public int value()
        {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination
    {
        private String label;
        private ParcelDestination(String whereTo)
        {
            label = whereTo;
        }
        @Override
        public String readLabel()
        {
            return label;
        }
        public void f()
        {
        }
        static int x = 10;
    }
    public static Destination destination(String s)
    {
        return new ParcelDestination(s);
    }
    public static Contents contents()
    {
        return new ParcelContents();
    }
    public static void main(String[] args)
    {
        Contents c=contents();
        Destination d=destination("Tasmania");
    }
}

