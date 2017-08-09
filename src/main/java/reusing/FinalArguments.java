package reusing;
/**
 * Created by Administrator on 2017/6/11.
 */
class Gizmo
{
    public void spin(){}
    public Gizmo()
    {
        System.out.println("Gizmo");
    }
}
public class FinalArguments
{
    void with(final Gizmo g){}
    void without(Gizmo g)
    {
        g=new Gizmo();
        g.spin();
    }
    int g(final int i){ return i+1;}
    public static void main(String[] args)
    {
        FinalArguments bf=new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
