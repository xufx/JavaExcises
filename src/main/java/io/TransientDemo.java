package io;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 * Created by xufuxiu on 2017/7/4.
 */
public class TransientDemo implements Serializable
{
    private static final long serialVersionUID=397689623972578855L;
    private Date date=new Date();
    private String username;
    private transient String password;
    public TransientDemo(String name,String pwd)
    {
        username=name;
        password=pwd;
    }
    @Override
    public String toString()
    {
        return "logan info:\n username:"+username+"\n date:"+date+"\n password:"+password;
    }
    public static void main(String[] args)throws Exception
    {
        TransientDemo t=new TransientDemo("Hulk","myLittlePony");
        System.out.println("TransientDemo t="+t);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("TransientDemo.out"));
        o.writeObject(t);
        o.close();
        TimeUnit.SECONDS.sleep(1);
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("TransientDemo.out"));
        System.out.println("recovering object t"+new Date());
        t=(TransientDemo)in.readObject();
        System.out.println("TransientDemo t="+t);
        in.close();
    }
}
