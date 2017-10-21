package commonErrors;
import static util.Common.sy;
/**
 * Created by xufuxiu on 2017/9/17.
 */
public class SuchAs
{
    public static void main(String[] args) throws Exception
    {
        short s1=1;
        //s1=(short)s1+1;
        s1+=1;
       float f=3.4F;

        Integer a=new Integer(3);
        Integer b=3;
        int c=3;
        sy(a==b);//false,比较两个对象指向的地址
        sy(a==c);//true

        /*如果整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象*/
        Integer f1=100,f2=100,f3=150,f4=150;
        sy(f1==f2);//true
        sy(f3==f4);//false
        sy(f1.equals(f2));
        sy(f3.equals(f4));
        sy(f1.hashCode()+","+f2.hashCode()+","+f3.hashCode()+","+f4.hashCode());
        swap(f1,f3);
        sy("f1="+f1);
        sy("f3="+f3);

        sy(Math.round(11.5));//12
        sy(Math.round(-11.5));//-11

        sy(2<<3);//计算2*8

       Integer[] is={1,2,3,4};
        char[] cs={'1','2','3','4'};
        String[] ss={"1","2","3","4"};
        sy(is.length);
        sy(cs.length);
        sy(ss.length);

        StringEqualTest();

        String s="A B C D E";
        sy(s);
        //sy("Integer.valueOf:"+Integer.valueOf(s));
        sy("Boolean.parseBoolean:"+Boolean.parseBoolean(s));
        //sy("Float.valueOf:"+Float.valueOf(s));
        String[] st=s.split(" ");
        sy(st);

        String s2=new String(s.getBytes("GB2312"),"ISO-8859-1");
        sy(s2);
    }
    public static void swap(int x,int y)
    {
        int temp = x;
        x = y;
        y = temp;
        sy("x="+x);
        sy("y="+y);
    }
    public static void StringEqualTest()
    {
        String s1="Programming";
        String s2=new String("Programming");
        String s3="Program"+"ming";
        sy(s1==s2);//false
        sy(s1==s3);//true
        sy(s1==s1.intern());//trueString对象的intern方法会得到字符串对象在常量池中对应的版本的引用
    }

}
