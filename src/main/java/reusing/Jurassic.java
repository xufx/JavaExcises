package reusing;
import access.Dinner;
/**练习final类
 * Created by Administrator on 2017/6/12.
 */
class SmallBrain
{

}
final class Dinosar
{
    int i=7;
    int j=1;
    SmallBrain x=new SmallBrain();
    void f(){}
}
/*class A extends Dinosar
{

}*/
public class Jurassic
{
    public static void main(String[] args)
    {
        Dinosar n=new Dinosar();
        n.f();
        n.i=40;
        n.j++;
        System.out.println(n.i+","+n.j+",");
    }
}
