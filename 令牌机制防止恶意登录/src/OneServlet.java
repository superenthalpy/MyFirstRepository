import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        System.out.println("执行了post");
        if (session==null){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.print("禁止翻墙访问");
        }else System.out.println("合法登录");
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        System.out.println("执行了get");
        if (session==null){
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.print("禁止翻墙访问");
        }else System.out.println("合法登录");
    }
}
