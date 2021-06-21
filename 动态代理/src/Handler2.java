import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler2 implements InvocationHandler {
    //代理对象要实现的功能（这是将代理对象的功能独立出来）

    //target是目标对象
    Object target = null;
    public Handler2(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        代理对象要实现的功能在这里实现
        Object res = method.invoke(target,args);
        Integer sum = (Integer) res;
        return sum+(Integer) args[0]*100;
    }
}
