package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
class Villain
{
    private String name;
    protected void set(String nm){name=nm;}
    public Villain(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "i am villian and my name is "+name;
    }
}
public class Orc extends Villain
{
    private int orcNumber;
    public Orc(String name,int orcNumber)
    {
        super(name);
        this.orcNumber=orcNumber;
    }
    public  void change(String name,int orcNumber)
    {
        set(name);
        this.orcNumber=orcNumber;
    }
    @Override
    public String toString()
    {
        return "Orc"+orcNumber+":"+super.toString();
    }
    public static void main(String[] args)
    {
        Orc orc=new Orc("limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }
}
