package io;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
/**用于创建和序列化一个Alien对象
 * Created by xufuxiu on 2017/7/4.
 */
public class FreezeAlien
{
    public static void main(String[] args)throws Exception
    {
        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("x.file"));
        Alien quellek=new Alien();
        out.writeObject(quellek);
    }
}
