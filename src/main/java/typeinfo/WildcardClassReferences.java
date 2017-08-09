package typeinfo;
/**泛型、通配符？
 * Created by Administrator on 2017/6/18.
 */
public class WildcardClassReferences
{
    public static void main(String[] args)
    {
        Class<?>intClass=int.class;
        intClass=double.class;
    }
}
