package innerclasses;
/**内部类
 * Created by Administrator on 2017/6/13.
 */
public class Parcel3
{
    class Contents
    {
        private int i=11;
        public int value(){return 1;}
    }
    class Destination
    {
        private String label;
        public Destination(String whereTo)
        {
            label = whereTo;
        }
        String readLabel(){return label;}
    }

    public static void main(String[] args)
    {
        Parcel3 p=new Parcel3();

        Parcel3.Contents c=p.new Contents();
        Parcel3.Destination d=p.new Destination("Borneo");
    }
}
