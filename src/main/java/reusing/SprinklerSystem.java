package reusing;

/**
 * Created by Administrator on 2017/6/11.
 */
class WaterSource
{
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

    public static void main(String[] args)
    {
        SprinklerSystem sprinklers=new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
