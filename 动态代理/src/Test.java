import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //在这里创建代理对象做测试

        //获得目标类，以便获得目标类的类加载器
        Class target = Class.forName("Factory");
        Sell o = (Sell) target.newInstance();
        //创建InvocationHandler对象，该对象实现了代理对象应该具有的功能
        InvocationHandler handler = new Handler(o);
        InvocationHandler handler2 = new Handler2(o);

        //Factory.class.getInterfaces()获得目标对象的实现接口，一定是目标对象的实现接口，而不是直接的接口
        Sell pro = (Sell) Proxy.newProxyInstance(target.getClassLoader(),Factory.class.getInterfaces(),handler);
        int total = pro.sell(100);
        System.out.println(total);
        String s = pro.doSome("1");
        System.out.println(s);
        System.out.println();
        //
        Sell pro2 = (Sell) Proxy.newProxyInstance(target.getClassLoader(), Factory.class.getInterfaces(), handler2);
        int sell = pro2.sell(50);
        System.out.println(sell);
    }
}
