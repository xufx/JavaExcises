package io;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
/**写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数。
 * Created by xufuxiu on 2017/9/18.
 */
public final class MyUtil
{
    // 工具类中的方法都是静态方式访问的因此将构造器私有不允许创建对象(绝对好习惯)
    private MyUtil()
    {
        throw new AssertionError();
    }
    /**
     * 统计文件中给定字符串的出现次数
     * @param filename 文件名
     * @param word 字符串
     * @return 字符串在文件中出现的次数
     */
    public static int countWordInFile(String filename,String word)
    {
        int counter=0;
        try(FileReader fr=new FileReader(filename))
        {
            try(BufferedReader br=new BufferedReader(fr))
            {
                String line=null;
                while ((line=br.readLine())!=null)
                {
                    int index=-1;
                    while (line.length()>=word.length()&&(index=line.indexOf(word))>=0)
                    {
                        counter ++;
                        line=line.substring(index+word.length());
                    }
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return counter;
    }

    public static void main(String[] args)throws  Exception
    {
        String source="F:\\02017徐富秀\\2017.4.9  徐富秀-周报.doc";
        System.out.println(countWordInFile(source,"hello"));

       /*列出目录下的所有目录和文件*/
        File f=new File("F:\\02017徐富秀");
        /*for (File temp:f.listFiles())
        {
            System.out.println(temp.getName());
        }*/
        //showDirectory(f);//列出f目录下的所有文件
        showDirectory2(source);

    }
    private static void showDirectory(File f)
    {/*列出f目录下的所有文件*/
        _walkDirectory(f,0);
    }
    private static void _walkDirectory(File f,int level)
    {
        if (f.isDirectory())
        {//如果f还是目录的话
            for (File temp:f.listFiles())
            {
                _walkDirectory(temp,level+1);
            }
        }
        else
        {//如果f是文件
           System.out.println(f.getName());
        }
    }

    private static void showDirectory2(String path) throws IOException
    {//列出path目录下的所有文件
        Path initPath= Paths.get(path);
        Files.walkFileTree(initPath,new SimpleFileVisitor<Path>()
        {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException
            {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }
        });
    }

}
