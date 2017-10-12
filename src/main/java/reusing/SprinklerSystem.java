package reusing;
import static util.Common.sy;
/**
 * Created by Administrator on 2017/6/11.
 */
class WaterSource
{
    static final Integer b=2;
    private  String s;
    WaterSource()
    {
        System.out.println("WaterSource()");
        s="Constructed";
    }
    public String toString(){return s;}
}
public class SprinklerSystem
{
    static final Integer a=3;
    private String valvel1,valvel2,valvel3,valvel4;
    private WaterSource source=new WaterSource();
    private  int i;
    private float f;
    public String toString()
    {
        return
                "valvel1="+valvel1+" "+
                        "valvel2="+valvel2+" "+
                        "valvel3="+valvel3+" "+
                        "valvel4="+valvel4+"\n"+
                        "i="+i+" "+"f="+f+" "+"source="+source;
    }
    public SprinklerSystem()
    {
        sy("SpringkerSystem");
    }
    public static void main(String[] args)
    {
        SprinklerSystem sprinklers=new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
