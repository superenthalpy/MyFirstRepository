import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext application = req.getServletContext();

        application.setAttribute("name","zhangsan");
        //请求转发，通过当前请求对象产生-->资源文件申请对象
        RequestDispatcher report = req.getRequestDispatcher("/TwoServlet");     //参数填写请求资源对象的uri（加/）
        //将申请提交
        report.forward(req,resp);

    }
}
