import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        Cookie cookie1 = new Cookie("name","zhangsan");     //key（name）不能是中文
        Cookie cookie2 = new Cookie("age","19");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.sendRedirect("/Cookie_war_exploded/TwoServlet");
        cookie1.setMaxAge(60);          //是cookie在浏览器硬盘存活60s
    }
//又更改了一次
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
