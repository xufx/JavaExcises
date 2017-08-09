package io;
import java.io.*;
import java.util.Random;

import static net.mindview.util.Print.print;
/**
 * Created by xufuxiu on 2017/7/3.
 */
class Data implements Serializable
{
    private int n;
    public Data(int n)
    {
        this.n = n;
    }
    @Override
    public String toString()
    {
        return Integer.toString(n);
    }
}
public class Worm implements Serializable
{
    private static Random rand=new Random(47);
    private Data[] d=
            {
                    new Data(rand.nextInt(10)),
                    new Data(rand.nextInt(10)),
                    new Data(rand.nextInt(10))

            };
    private Worm next;
    private char c;
    //将i的值逐渐递减，x的hash值逐渐递增赋给worm构造函数
    public Worm(int i,char x)
    {
        print("Worm constructor "+i);
        c=x;
        if (--i>0)next=new Worm(i,(char)(x+1));
    }
    public Worm()
    {
        print("Worm constructor");
    }
    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data dat:d)
            result.append(dat);
        result.append(")");
        if (next!=null)
            result.append(next);
        return result.toString();
    }
    public static void main(String[] args)throws ClassNotFoundException,IOException
    {
        Worm w=new Worm(6,'a');
        print("w= "+w);

        /*对象的序列化处理就会非常简单。要序列化一个对象，首先要创建OutputStream对象，
        然后将其封装在一个ObjectOutputStream对象内，再调用writeObject（）方法即可对象序列化*/
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("worm.out"));
        out.writeObject("worm statorage\n");
        out.writeObject(w);
        out.close();

        /*反之，需要将一个InputStream封装在ObjectInputStream内，然后调用readObject（）方法反序列化*/
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("worm.out"));
        String s=(String)in.readObject();
        Worm w2=(Worm)in.readObject();
        print(s+"w2= "+w2);
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        ObjectOutputStream out2=new ObjectOutputStream(bout);
        out2.writeObject("worm storage\n");
        out2.writeObject(w);
        out2.flush();
        ObjectInputStream in2=new ObjectInputStream(
                new ByteArrayInputStream(bout.toByteArray())
        );
        s=(String)in2.readObject();
        Worm w3=(Worm)in2.readObject();
        print(s+"w3= "+w3);
    }
}
