package typeinfo;
import net.mindview.util.Null;
/**空对象 NULL
 * Created by Administrator on 2017/6/20.
 */
public class Person
{
    public final String first;
    public final String last;
    public final String address;
    public Person(String first, String last, String address)
    {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person:"+first+" "+last+" "+address;
    }
    public static class NullPerson extends Person implements Null
    {
        private NullPerson(String first, String last, String address)
        {
            super("NONE","NONE","NONE");
        }
        @Override
        public String toString()
        {
            return "Null Person";
        }
    }
    public static final Person NULL=new NullPerson("NONE","NONE","NONE");
}
