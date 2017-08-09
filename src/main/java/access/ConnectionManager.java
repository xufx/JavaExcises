package access;

/**
 * Created by Administrator on 2017/6/11.
 */
class Connection
{
    private Connection() { System.out.println("connection is created");}
    private static  Connection connection;
    public static Connection get()
    {
        return new Connection();
    }
}
public class ConnectionManager
{
    private static int count=0;
    private static Connection[] connections=new Connection[]
            {
                    Connection .get(),Connection.get(),Connection.get()
            };
            public static Connection getConnection()
            {
                if(count<3)
                {
                    ConnectionManager.count++;
                    return connections[count--];
                }
                else
                {
                    System.out.println("no more");
                    return null;
                }
            }
    public static void main(String[] args)
    {
        Connection connection=ConnectionManager.getConnection();
        Connection connection1=ConnectionManager.getConnection();
        Connection connection2=ConnectionManager.getConnection();
        Connection connection3=ConnectionManager.getConnection();
        Connection connection4=ConnectionManager.getConnection();
    }

}
