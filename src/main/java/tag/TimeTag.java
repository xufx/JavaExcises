/*
package tag;
import main.java.tag.TagSupport;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
*/
/**自定义jsp标签的源文件
 * Created by xufuxiu on 2017/9/20.
 *//*

public class TimeTag extends TagSupport
{
    private static final long serialVersionUID=1L;
    private String format="yyyy-MM-dd hh:mm:ss";
    private String foreColor="black";
    private String backColor="white";
    public int doStartTag()throws JspException
    {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        JspWriter writer=pageContext.getOut();
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("<span style='color:%s;background-color:%s'>%S</span>",foreColor,backColor,sdf.format(new Date())));
        try 
        {
            writer.println(sb.toString());
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    public void setFormat(String format)
    {
        this.format = format;
    }
    public String getForeColor()
    {
        return foreColor;
    }
    public void setForeColor(String foreColor)
    {
        this.foreColor = foreColor;
    }
    public String getBackColor()
    {
        return backColor;
    }
    public void setBackColor(String backColor)
    {
        this.backColor = backColor;
    }
}
*/
