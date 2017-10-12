/*
package servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
*/
/**
 * Created by xufuxiu on 2017/9/20.
 *//*

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // 可以用request.getPart()方法获得名为photo的上传附件
        // 也可以用request.getParts()获得所有上传附件（多文件上传）
        // 然后通过循环分别处理每一个上传的文件
       Part part=request.getPart("photo");
        if (part!=null&&part.getSubmittedFileName().length()>0)
        { // 获得项目所在的绝对路径
            String savePath=request.getServletContext().getRealPath("");
            //将文件存储到项目所在的路径中，可在out/artifacts/JavaExcises_war_exploded目录下查看
            part.write(savePath+"/"+part.getSubmittedFileName());
            request.setAttribute("hint","Upload Successfully!");
        }else
        {
            request.setAttribute("hint","Upload failed");
        }
        // 跳转回到上传页面
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
*/
