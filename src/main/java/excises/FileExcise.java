package main.java.excises;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Created by xufuxiu on 2017/10/14.
 */
public class FileExcise
{
    /*如何输出源文件的标题和目前执行行的行数*/
    public static void printFileInfo() throws Exception
    {
        String path="F:\\02017徐富秀\\求职\\2017.10.11 徐富秀个人信息（全）.doc";
        //File f=new File(path);
        //System.out.println(f.getName());
        //这里定义一个字符流的输入流的节点流，用于读取文件（一个字符一个字符的读取）
        FileReader fr=new FileReader(path);
        // 在定义好的流基础上套接一个处理流，用于更加效率的读取文件（一行一行的读取）
        BufferedReader br=new BufferedReader(fr);
        int count=0;
        //readLine()方法是按行读的，返回值是这行的内容
        while (br.readLine()!=null)count++;
        System.out.println("文件一共有:"+count);
    }
    public static void main(String[] args) throws Exception
    {
        printFileInfo();
    }
}
