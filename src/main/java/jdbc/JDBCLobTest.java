package jdbc;
import java.io.*;
import java.sql.*;
/**
 * Created by xufuxiu on 2017/9/19.
 */
public class JDBCLobTest
{
    public static void main(String[] args)
    {
        Connection con=null;
        try
        {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            //3.创建语句对象
            PreparedStatement ps=con.prepareStatement("insert into tb_user values(DEFAULT ,?,?)");
            ps.setString(1,"徐富秀");//将SQL语句中第一个占位符换成字符串
            try(InputStream in=new FileInputStream("F:\\02017徐富秀\\照片\\01.jpg"))
            {
                ps.setBinaryStream(2,in);//将SQL语句中第二个占位符换成二进制流
                //若tb_user有一行受影响，输出”插入成功”
                System.out.println(ps.executeUpdate()==1?"插入成功":"插入失败");
            }catch (IOException e)
            {
                System.out.println("读取照片失败");
            }
        }catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if (con!=null&&!con.isClosed())
                {
                    con.close();//释放数据库连接
                    con=null;// 指示垃圾回收器可以回收该对象
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
