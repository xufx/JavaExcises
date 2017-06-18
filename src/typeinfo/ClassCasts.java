package typeinfo;
/**
 * Created by Administrator on 2017/6/18.
 */
class Building{}
class House extends Building{}
public class ClassCasts
{
    public static void main(String[] args)
    {
        Building b=new House();
        Class<House>houseType=House.class;
        House h=houseType.cast(b);
    }
}
