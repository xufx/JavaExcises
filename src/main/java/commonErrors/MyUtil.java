package commonErrors;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**实现对象克隆、文件复制
 * Created by xufuxiu on 2017/9/17.
 */
public class MyUtil
{
    public MyUtil()
    {
        throw new AssertionError();
    }

    /**
     * 克隆对象obj
     * @param obj 要克隆的对象
     * @param <T> 对象类型
     */
    public static<T> T clone(T obj)throws Exception
    {
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bout);
        oos.writeObject(obj);//将obj写入对象输出流

        ByteArrayInputStream bin=new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bin);
        return (T)ois.readObject();
    }
    /**
     * 文件复制
     * @param source 要复制的文件路径
     * @param target 复制文件的目标路径
     */
    public static void fileCopy(String source,String target)throws IOException
    {
        try(InputStream in=new FileInputStream(source))
        {
            try(OutputStream out=new FileOutputStream(target))
            {
                byte[] buffer=new byte[4096];
                int bytesToRead;//要读取的字节流
                while ((bytesToRead=in.read(buffer))!=-1)
                {
                    out.write(buffer,0,bytesToRead);
                }
            }
        }
    }
    public static void fileCopyNIO(String source,String target)throws IOException
    {
        try(FileInputStream in=new FileInputStream(source))
        {
            try(FileOutputStream out=new FileOutputStream(target))
            {
                FileChannel inChannel=in.getChannel();
                FileChannel outChannel=out.getChannel();
                ByteBuffer buffer=ByteBuffer.allocate(4096);
                while(inChannel.read(buffer)!=-1)
                {
                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }
     public static void main(String[] args)throws  Exception
      {
          String source="F:\\02017徐富秀\\2017.4.9  徐富秀-周报.doc";
          String target="F:\\02017徐富秀\\hello.doc";//新建hello.doc文件，将上面的内容复制进去
          //fileCopyNIO(source,target);
          fileCopy(source,target);
          System.out.println(target);
      }
}
