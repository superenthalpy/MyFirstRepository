import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name.equals("qaz") && password.equals("qaz")){
            //首先在这里创建令牌，禁止其他地方创建令牌，如果合法登录，在其他Servlet中就可以获取到此令牌，否则其余位置不可获取令牌
            HttpSession session = request.getSession();
            RequestDispatcher report = request.getRequestDispatcher("/OneServlet");
            report.forward(request,response);
        }else{
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("信息错误");
        }
    }
}
