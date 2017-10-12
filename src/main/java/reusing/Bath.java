package reusing;

/**
 * Created by Administrator on 2017/6/11.
 */
class Soap
{
    private  String s;
    Soap()
    {
        System.out.println("Soap()");
        s="Constructed";
    }
    public String toString(){return s;}
}
public class Bath
{
    private  String
                    s1="happy",
                    s2="HAPPY",
                    s3,s4;
    private Soap castile;
    private int i;
    private float toy;
    public Bath()
    {
        System.out.println("inside bath");
        s3="joy";
        toy=3.14f;
        castile=new Soap();
    }
        {i=47;}
        public String toString()
        {
            if(s4==null)s4="joy";
            return
                    "s1="+s1+"\n"+
                            "s2="+s2+"\n"+
                            "s3="+s3+"\n"+
                            "s4="+s4+"\n"+
                            "i="+i+"\n"+
                            "toy="+toy+"\n"+
                            "castille="+castile;
        }

    public static void main(String[] args)
    {
        Bath b=new Bath();
        System.out.println(b);
    }
}

