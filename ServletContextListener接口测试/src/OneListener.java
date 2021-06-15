import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("全局作用域对象被初始化创建了");
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("全局作用域对象被销毁了");
    }
}
