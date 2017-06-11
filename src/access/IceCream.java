package access;

import sun.security.provider.Sun;

/**
 * Created by Administrator on 2017/6/10.
 */
class Sundae
{
    private Sundae(){}
    static Sundae makeASundate()
    {
        return new Sundae();
    }
}
public class IceCream
{
    public static void main(String[] args)
    {
        //Sundae x=new Sundae();
       Sundae x=Sundae.makeASundate();
    }
}
