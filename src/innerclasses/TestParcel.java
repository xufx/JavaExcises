package innerclasses;
import com.sun.org.apache.bcel.internal.generic.DSTORE;
/**
 * Created by Administrator on 2017/6/14.
 */


class Parcel4
{
    private class PContents implements Contents
    {
        private int i=11;
        @Override
        public int value()
        {
            return i;
        }
    }
    protected class PDestination implements Destination
    {
        private String label;
        public PDestination(String whereTo)
        {
            label = whereTo;
        }
        @Override
        public String readLabel()
        {
            return label;
        }
    }
    public Destination destination(String s)
    {
        return new PDestination(s);
    }
    public PContents contents()
    {
        return new PContents();
    }
}
public class TestParcel
{
    public static void main(String[] args)
    {
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("Tasmia");
    }
}
