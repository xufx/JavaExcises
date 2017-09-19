package jspGetData;
/**
 * Created by xufuxiu on 2017/8/9.
 */
public class Student implements Comparable<Student>
{
    private Integer id;
    private String name;
    private Integer age;
    public Student(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "name="+name+",age="+age;
    }

    @Override
    public int compareTo(Student o)
    {
        return this.age-o.age;//比较年龄（年龄的升序）
    }

}
