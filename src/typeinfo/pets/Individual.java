package typeinfo.pets;
/**
 * Created by Administrator on 2017/6/18.
 */
public class Individual implements Comparable<Individual>
{
    private static long counter=0;
    private static long id=counter++;
    private String name;
    public Individual(String name)
    {
        this.name = name;
    }
    public Individual(){}
    @Override
    public String toString()
    {//若name==null,return "" 否则返回“ ”+name
        return getClass().getSimpleName()+(name==null ?"":" "+name);
    }
    public Long id(){return id;}
    public boolean equals(Object o)
    {
        return o instanceof Individual && id==((Individual)o).id;
    }
    public int hashCode()
    {
        int result=17;
        if(name!=null)
        {
            result=37*result+name.hashCode();
            result=37*result+(int)id;
        }
        return result;
    }
    @Override
    public int compareTo(Individual arg)
    {
        String first=getClass().getSimpleName();
        String argFirst=arg.getClass().getSimpleName();
        int firstCompare=first.compareTo(argFirst);
        if(firstCompare!=0)return firstCompare;
        if(name!=null&&arg.name!=null)
        {
            int secondCompare=name.compareTo(arg.name);
            if(secondCompare!=0)return secondCompare;
            return secondCompare;
        }
        return (arg.id<id?-1:(arg.id==id?0:1));
    }
}
