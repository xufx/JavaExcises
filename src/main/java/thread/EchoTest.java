package thread;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
/**
 * Created by xufuxiu on 2017/9/19.
 */
public class EchoTest
{
     public static void main(String[] args)throws  Exception
      {
          Socket client=new Socket("localhost",6789);
          Scanner sc=new Scanner(System.in);
          System.out.println("请输入内容");
          String msg=sc.nextLine();
          sc.close();
          PrintWriter pw=new PrintWriter(client.getOutputStream());
          pw.println(msg);
          pw.flush();
          BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
          System.out.println(br.readLine());
          client.close();
      }
}
