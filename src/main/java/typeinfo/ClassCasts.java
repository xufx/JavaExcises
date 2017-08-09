package typeinfo;
/**用于Class引用的转型语法
 * Created by Administrator on 2017/6/18.
 */
class Building{}
class House extends Building{}
public class ClassCasts
{
    public static void main(String[] args)
    {
        Building b=new House();
        Class <House>houseType=House.class;
        House h=houseType.cast(b);//将Building类型转型为House引用类型
    }
}
