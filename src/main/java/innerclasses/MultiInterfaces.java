package innerclasses;
/**必须在一个类中以某种方式实现两个接口，使用单一类或内部类
 * Created by Administrator on 2017/6/15.
 */
interface A{}
interface B{}
class X implements A,B{}
class Y implements A
{
    B makeB()
    {
        return new B(){};
    }
}
public class MultiInterfaces
{
    static void takesA(A a){}
    static void takesB(B b){}
    public static void main(String[] args)
    {
        X x=new X();
        Y y=new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
