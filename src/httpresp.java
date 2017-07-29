import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public  class  httpresp extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
/*        *//**
         * 设置content-disposition响应头，让浏览器下载文件
         *//*
        resp.setHeader("content-disposition", "attachment;filename=xxx.jpg");
        InputStream in = this.getServletContext().getResourceAsStream("/img/img1.jpg");
        byte buffer[] = new byte[1024];
        int len = 0;
        OutputStream out = resp.getOutputStream();
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }*/
        ServletContext servletContext = this.getServletConfig().getServletContext();
        String string = String.valueOf(servletContext.getAttribute("data"));
        resp.getWriter().println(string);
        ServletContext servletContext1 = this.getServletContext();
        resp.getWriter().println(servletContext.getInitParameter("url"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doPost(req, resp);
    }
}