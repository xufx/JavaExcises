package polymorphism;
/**
 * Created by Administrator on 2017/6/12.
 */
class Shared
{
    private int refcount=0;
    private static long counter=0;
    private final long id=counter++;
    public Shared()
    {
        System.out.println("creating  "+this);
    }
    public void addRef(){refcount++;}
    protected void dispose()
    {
        if (--refcount==0)
        {
            System.out.println("disposing  "+this);
        }
    }
    @Override
    public String toString()
    {
        return "shared"+id;
    }
}
class Composing
{
    private Shared shared;
    private static long counter=0;
    private final long id=counter++;
    public Composing(Shared shared)
    {
        System.out.println("creating  "+this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose()
    {
        System.out.println("disposing    "+this);
        shared.dispose();
    }
    public String toString()
    {
        return "composing"+id;
    }
}
public class ReferenceCounting
{
    public static void main(String[] args)
    {
        Shared shared=new Shared();
        Composing[] composing=
                {
                        new Composing(shared),
                        new Composing(shared),
                        new Composing(shared),
                        new Composing(shared),
                        new Composing(shared)
                };
                for (Composing c:composing)
                {
                    c.dispose();
                }
    }
}
