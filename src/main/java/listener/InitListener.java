/*
package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
*/
/**上下文监听器，在服务器启动时初始化onLineCount和maxOnLineCount两个变量
 并将其置于服务器上下文（ServletContext）中，其初始值都是0
 * Created by xufuxiu on 2017/9/20.
 *//*

@WebListener //配置监听器
public class InitListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        event.getServletContext().setAttribute("onLineCount",0);
        event.getServletContext().setAttribute("maxOnlineCount",0);
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
    }
}
*/
