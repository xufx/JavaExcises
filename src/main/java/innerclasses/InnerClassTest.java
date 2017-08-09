package innerclasses;
/**
 * Created by Administrator on 2017/6/14.
 */

public class InnerClassTest
{
    class Inner
    {
        String s;

        public void toString(String s)
        {
            this.s=s;
            System.out.println(s);
        }
    }
    class Sqeuence
    {
        Inner i=new Inner();
        InnerClassTest it=new InnerClassTest();

    }
    public static void main(String[] args)
    {
        //System.out.println(Sequence.i);
    }
}
