package io;
import java.io.*;
/**
 * Created by xufuxiu on 2017/7/4.
 */
public class SerializableDemo
{
    public static void serialize()throws IOException
    {
        Tester tester=new Tester();
        tester.setTest("序列化测试");
        ObjectOutputStream oo=new ObjectOutputStream(
                new FileOutputStream(new File("Person.txt"))
        );
        oo.writeObject(tester);
        System.out.println("对象序列化成功");
        oo.close();
    }

    /*在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体（类）的serialVersionUID进行比较，
    如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常*/
    public static Tester deSerialize()throws IOException,ClassNotFoundException
    {

        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream(new File("Person.txt"))
        );
        Tester tester=(Tester)ois.readObject();
        System.out.println("Person对象反序列化成功");
        return tester;

    }
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
        serialize();
        Tester tester=deSerialize();
    }
}
