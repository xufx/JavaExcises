package holding;
import typeinfo.Operation;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by Administrator on 2017/6/22.
 */
class Command
{
    String s;
    String Operation()
    {
        return s;
    }
}
public class Command2
{
    Queue<Command>qs=new LinkedList<Command>();
    Queue getS()
    {
        return qs;
    }

}

