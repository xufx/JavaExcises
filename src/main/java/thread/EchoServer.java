package thread;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**用Java的套接字编程实现一个多线程的回显（Echo）服务器
 * Created by xufuxiu on 2017/9/19.
 */
public class EchoServer
{
    private static final int ECHO_SERVER_PORT=6789;
    public static void main(String[] args)
    {
        try(ServerSocket server=new ServerSocket(ECHO_SERVER_PORT))
        {
            System.out.println("服务器已经启动。。。");
            while (true)
            {
                Socket client=server.accept();
                new Thread(new ClientHandler(client)).start();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable
    {//用一个静态内部类实现线程的功能
        private Socket client;
        public ClientHandler(Socket client)
        {
            this.client = client;
        }
        @Override
        public void run()
        {
            try(BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));PrintWriter pw=new PrintWriter(client.getOutputStream()))
            {
                String msg=br.readLine();
                System.out.println("收到"+client.getInetAddress()+"发送的"+msg);
                pw.println();
                pw.flush();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }finally
            {
                try
                {
                    client.close();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
