package innerclasses;
/**接口内部的类，都默认是public和static的
 * Created by Administrator on 2017/6/15.
 */
public interface ClassInInterface
{
    void howdy();
    class Test implements ClassInInterface
    {
        @Override
        public void howdy()
        {
            System.out.println("HowDy!");
        }
        public static void main(String[] args)
        {
            new Test().howdy();
        }
    }
}
