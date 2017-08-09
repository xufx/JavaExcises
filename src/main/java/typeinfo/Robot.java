package typeinfo;
import java.util.*;
/**通过调用operations()访问Robot服务
 * Created by Administrator on 2017/6/20.
 */
import net.mindview.util.*;
public interface Robot
{
    String name();
    String model();
    List<Operation>operations();
    class Test
    {
        public static void test(Robot r)
        {
            if(r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Robot name:"+r.name());
            System.out.println("Robot model:"+r.model());
            System.out.println(r);//typeinfo.SnowRemovalRobot@69222c14,一个对象
            System.out.println(r.operations());//[typeinfo.SnowRemovalRobot$1@, XXX,XXX]，三个对象
            for (Operation operation:r.operations())
            {//分别调用序列中每个对象的方法，每个对象具有不同的方法
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
