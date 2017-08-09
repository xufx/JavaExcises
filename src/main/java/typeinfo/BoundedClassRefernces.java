package typeinfo;
/**泛型、通配符？
 * Created by Administrator on 2017/6/18.
 */
public class BoundedClassRefernces
{
    public static void main(String[] args)
    {
        Class<? extends Number>bounded=int.class;
        bounded=double.class;
        bounded=Number.class;
    }
}
