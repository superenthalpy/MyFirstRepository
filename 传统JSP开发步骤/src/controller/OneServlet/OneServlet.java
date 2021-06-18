package controller.OneServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //分别将共享数据添加到作用域对象（全局，会话，请求）
        ServletContext application = request.getServletContext();
        HttpSession session = request.getSession();

        application.setAttribute("sid",10);
        session.setAttribute("sname","mike");
        request.setAttribute("shome","北京");

        //通过请求转发方式，向Tomcat调用index_1.jsp,将作用域对象读取写入相应对象，交给浏览器
        RequestDispatcher report = request.getRequestDispatcher("/index_1.jsp");
        report.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
