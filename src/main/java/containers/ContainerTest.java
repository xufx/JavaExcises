package containers;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Countries;

import java.util.*;
/**
 * Created by Administrator on 2017/6/27.
 */
public class ContainerTest
{
    public static void main(String[] args)
    {
        List<String> list1=new ArrayList<String>();
        List<String> list2=new LinkedList<String>();
        list1.addAll(Countries.names(10));
        list2.addAll(Countries.names(10));

        Iterator<String>it=list1.listIterator();
        for (int i = 0; i <list1.size() ; i++)
        {
            if(i%2==0)
            list1.add(i,Integer.toString(i));
        }

    }
}
