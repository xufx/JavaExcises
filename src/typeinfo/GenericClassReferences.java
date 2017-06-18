package typeinfo;
/**泛化的Class引用
 * Created by Administrator on 2017/6/18.
 */
public class GenericClassReferences
{
    public static void main(String[] args)
    {
        Class intClass=int.class;
        intClass=double.class;
        Class<Integer>genericIntClass=int.class;
        genericIntClass=Integer.class;

    }
}
