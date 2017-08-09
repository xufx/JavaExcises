package typeinfo;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.txw2.output.StaxSerializer;

import java.util.*;
/**查询空对象
 * Created by Administrator on 2017/6/20.
 */
public class Staff extends ArrayList<Position>
{
    /*添加职位和Person信息*/
    public void add(String title,Person person)
    {
        add(new Position(title,person));
    }
    /*添加一组职位信息*/
    public void add(String... titles)//String... titles等价于String[] titles
    {
        for(String title:titles)
        add(new Position(title));
    }
    /*构造器*/
    public Staff(String... titles){add(titles);}
    /*判断某个职位信息是否真的存在*/
    public boolean positionAvailable(String title)
    {
        for(Position position:this)//this：当前对象，职位的数组
        {/*如果给定的职位姿女子与数组中的相同*/
            if(position.getTitle().equals(title) && position.getPerson()==Person.NULL)
                return true;
        }
        return false;
    }
    /*根据已有的职位信息填充职工姓、名和地址信息*/
    public void fillPosition(String title,Person hire)
    {
        for(Position position:this)
            if (position.getTitle().equals(title) && position.getPerson()==Person.NULL)
            {
                position.setPerson(hire);
                return;
            }
            throw new RuntimeException("Position"+title+"not available");
    }
    public static void main(String[] args)
    {
        Staff staff=new Staff("President","CTO","Marketing Manager","Product Manager",
                "Project Lead","Software Engineer","Software Engineer",
                "Software Engineer","Software Engineer","Test Engineer","Technical Writer");
        System.out.println(staff);
        staff.fillPosition("President",new Person("Me","Last","The Top,Lonely At"));

        staff.fillPosition("Project Lead",new Person("Janet","Planner","The Burbs"));

        if(staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer",new Person("Bob","Coder","Bright Light City"));
        System.out.println(staff);
    }
}
