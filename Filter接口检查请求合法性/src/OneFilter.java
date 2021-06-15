import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class OneFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //将请求拦截后，把请求对象servletRequest和相应对象servletResponse据为己有
        //在请求合法时，使用filterChain还给服务器


        //拦截参数信息，获取年龄
        String age = servletRequest.getParameter("age");
        if(Integer.valueOf(age)>=18){
            filterChain.doFilter(servletRequest,servletResponse);
            //这个doFilter方法和本方法没关系，将求对象servletRequest和相应对象servletResponse还给服务器
        }else {
            //拒绝请求
            servletResponse.setContentType("text/html;charset=utf-8");
           PrintWriter out = servletResponse.getWriter();
           out.print("<font size=500px>滚你🐎币sb<font>");
        }
    }

    @Override
    public void destroy() {

    }
}
