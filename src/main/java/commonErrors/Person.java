package commonErrors;
import java.io.Serializable;
/**克隆对象
 * Created by xufuxiu on 2017/9/17.
 */
public class Person implements Serializable
{
    private static final long serialVersionUID=-9102017020286042305L;
    private String name;
    private int age;
    private Car car;
    public Person(String name, int age, Car car)
    {
        this.name = name;
        this.age = age;
        this.car = car;
    }
    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public Car getCar()
    {
        return car;
    }
    public void setCar(Car car)
    {
        this.car = car;
    }
    @Override
    public String toString()
    {
        return "name="+name+",age="+age+","+car;
    }
}
