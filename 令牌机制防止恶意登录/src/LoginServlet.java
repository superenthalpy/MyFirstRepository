import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name.equals("qaz") && password.equals("qaz")){
            HttpSession session = request.getSession();
            RequestDispatcher report = request.getRequestDispatcher("/OneServlet");
            report.forward(request,response);
        }else response.sendError(400);
    }
}
