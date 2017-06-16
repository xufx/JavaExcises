package interfaces;
import org.omg.CORBA.PUBLIC_MEMBER;
/**组合接口时的名字冲突
 * Created by Administrator on 2017/6/13.
 */
interface  I1{void  f();}
interface  I2{int f(int i);}
interface  I3{int f();}
class C
{
    public int f(int i)
    {
        return 1;
    }
}
class C2 implements I1,I2
{
    public void f(){}
    public int f(int i){return 1;}//overloaded
}
class C3 extends C implements I2
{
    public int f(int i){return 1;}//overloaded
}
class C4 extends C implements I3
{
    public int f(){return 1;}
}
public class InterfaceCollision
{

}
