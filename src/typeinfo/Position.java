package typeinfo;
/**有了position，就不需要创建空对象了
 * Created by Administrator on 2017/6/20.
 */
import typeinfo.*;
public class Position
{
    private String title;
    private Person person;
    /*职位（头衔，）*/
    public Position(String jobTitle, Person employee)
    {
        this.title = jobTitle;
        this.person = employee;
        if (person==null)person=Person.NULL;
    }
    public Position(String jobTitle)
    {
        this.title = jobTitle;
        this.person = Person.NULL;
    }
    public String getTitle()
    {
        return title;
    }
    public Person getPerson()
    {
        return person;
    }
    public void setPerson(Person newPerson)
    {
        this.person = newPerson;
        if(person==null)person=Person.NULL;
    }
    @Override
    public String toString()
    {
        return "Position:"+title+" "+person;
    }
}
