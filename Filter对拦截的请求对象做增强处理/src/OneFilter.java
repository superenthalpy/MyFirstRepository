import javax.servlet.*;
import java.io.IOException;

public class OneFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //如果服务器中有许多servlet，每个servlet接收post方法时都会更改字符编码才能从中读取数据
        // 为了更加方便，在过滤器中提前对请求设置编码方式
        System.out.println("执行了OneFilter");
        servletRequest.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("OneFilter执行完毕");
    }

    @Override
    public void destroy() {

    }
}
