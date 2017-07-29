import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Hello extends HttpServlet {

        private ServletConfig servletConfig;
        private String username;
        private String data="tran";

    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        this.servletConfig=servletConfig;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        username=req.getParameter("username");
        resp.getWriter().println(username);
        String string = servletConfig.getInitParameter("test");
        resp.getWriter().println(string);
        Enumeration enumeratio = servletConfig.getInitParameterNames();
        while (enumeratio.hasMoreElements())
        {
            String name = enumeratio.nextElement().toString();
            String value = servletConfig.getInitParameter(name);
            resp.getWriter().println(name+value);
        }
        ServletContext servletContext = servletConfig.getServletContext();
        servletContext.setAttribute("data",data);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doGet(req, resp);
    }

}