/*
package listener;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
*/
/**会话监听器，在用户会话创建和销毁的时候根据情况修改onLineCount和maxOnLineCount的值
 * Created by xufuxiu on 2017/9/20.
 *//*

@WebListener//配置监听器
public class MaxCountListener implements HttpSessionListener
{
    @Override
    public void sessionCreated(HttpSessionEvent event)
    {
        ServletContext ctx=event.getSession().getServletContext();
        int count=Integer.parseInt(ctx.getAttribute("onLineCount").toString());
        count++;
        ctx.setAttribute("onLineCount",count);
        int maxOnlineCount=Integer.parseInt(ctx.getAttribute("maxOnlineCount").toString());
        if (count>maxOnlineCount)
        {
            ctx.setAttribute("maxOnLineCount",count);
            DateFormat df=new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
            ctx.setAttribute("date",df.format(new Date()));
        }
    }
    @Override
    public void sessionDestroyed(HttpSessionEvent event)
    {
        ServletContext app=event.getSession().getServletContext();
        int count=Integer.parseInt(app.getAttribute("onLineCount").toString());
        count--;
        app.setAttribute("onLineCount",count);
    }
}
*/
