package basics;

/**
 * Created by Administrator on 2017/6/10.
 */
enum Money
{
    YIJIAO,WUJIAO,YIYUAN,WUYUAN,SHIYUAN,ERSHIYUAN,WUSHIYUAN,YIBAIYUAN
}
public class EnumTest
{
    static  Money e;
   EnumTest(Money e)
   {
       this.e=e;
   }
   void describe()
   {
       switch (e)
       {
           case YIJIAO:System.out.println("YIJIAO is the start money");break;
           case WUJIAO:System.out.println("WUJIAO is often being used");break;
           case YIYUAN:System.out.println("YIYUAN is 10 YIJIAO");break;
           case WUYUAN:System.out.println("WUYUAN is often being used as gift at the new year");break;
           case SHIYUAN:System.out.println("SHIYUAN can buy one rose");break;
           case ERSHIYUAN:System.out.println("ERSHIYUAN can buy two roses");break;
           case WUSHIYUAN:System.out.println("WUSHIYUAN can buy five roses");break;
           case YIBAIYUAN:System.out.println("YIBAIYUAN can buy TEN roses");break;
               default:System.out.println("THE END");
       }
   }
    public static void main(String[] args)
    {/*
        for(Money e:Money.values())
        {
            System.out.println(e+".ordinal="+e.ordinal());
        }*/
        EnumTest t=new EnumTest(Money.ERSHIYUAN);
        t.describe();
    }
}
