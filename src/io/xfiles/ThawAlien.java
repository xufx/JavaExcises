package io.xfiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 * Created by xufuxiu on 2017/7/4.
 */
public class ThawAlien
{
    public static void main(String[] args)throws Exception
    {
        ObjectInputStream in=new ObjectInputStream(
                new FileInputStream(new File("X.file"))
        );
        Object mystery=in.readObject();
        System.out.println(mystery.getClass());
    }
}
