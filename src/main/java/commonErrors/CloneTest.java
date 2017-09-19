package commonErrors;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class CloneTest
{
    public static void main(String[] args) throws Exception
    {
        Person p1=new Person("xufuxiu",23,new Car("Benz",300));
        Person p2=MyUtil.clone(p1);//深度克隆
        p2.getCar().setBrand("BYD");
        sy(p1);
        sy(p2);
    }
}
