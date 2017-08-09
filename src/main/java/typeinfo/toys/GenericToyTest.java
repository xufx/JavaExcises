package typeinfo.toys;
/**
 * Created by Administrator on 2017/6/19.
 */
public class GenericToyTest
{
    public static void main(String[] args) throws Exception
    {
        Class<FancyToy>ftClass=FancyToy.class;//typeinfo.toys.FancyToy
        FancyToy fancyToy=ftClass.newInstance();//FancyToy@
        Class<? super FancyToy>up=ftClass.getSuperclass();//typeinfo.toys.Toy
        Object obj=up.newInstance();//Toy@xxx,up.newInstance()返回的是Object类型
    }
}
