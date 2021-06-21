import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //此Servlet提供共享数据
        request.setAttribute("key1",30);
        request.setAttribute("key2",40);
        RequestDispatcher report = request.getRequestDispatcher("/index_1.jsp");
        report.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
