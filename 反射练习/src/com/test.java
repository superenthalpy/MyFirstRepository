package com;

import com.service.HelloService;
import com.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //不使用反射
        HelloService hs = new HelloServiceImpl();
        hs.sayHello("张三");
        //使用反射执行 sayhello();
        Class hsclass = HelloServiceImpl.class;     //获得class的字节码文件
        Method sayHello = hsclass.getMethod("sayHello", String.class);      //通过字节码文件获取类中的 sayHello 方法
        sayHello.invoke(hsclass.newInstance(),"李四");    //执行sayhello方法：执行方法的类和方法参数传入 invoke 即可
        sayHello.invoke(hs,"王五");

    }
}
