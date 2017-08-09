package innerclasses;
/**内部类想要使用其定义外部的对象，编译器要求其参数引用是final的
 * Created by Administrator on 2017/6/13.
 */
public class Parcel9
{
    public Destination destination(final String dest)
    {
        return new Destination()
        {
            private String label=dest;
            public String readLabel(){return label;}
        };
    }
    public static void main(String[] args)
    {
        Parcel9 p=new Parcel9();
        Destination d=p.destination("Tasmania");
    }
}
