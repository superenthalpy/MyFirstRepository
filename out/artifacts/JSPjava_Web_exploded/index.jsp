<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--注释一定要这样想，不要用带%的否则会出错-->
<!--直接书写java命令不会被识别，只会被当作字符串，如以下命令不执行，只会是字符串-->
int a = 1;
int b = 2;
int c = a+b;

<!--使用特殊标记，才可以书写，在服务端执行java命令-->
<%
    //写在执行标记中才可以被识别为Java，执行标记只是符号
    //可以声明java变量
    int a = 100;
    int b = 300;
    //可以声明运算表达式
    int c = a+b;
    boolean e = true||false;
    e = a>b?true:false;
    //可以声明控制语句
    if (a>b){
      a=b;
    }
    while (a>b){
      break;
    }

%>
<br>
<!--将java变量值写入响应体-->
变量e的值为：<%=e%>
<br>
变量a的值为：<%=a%>
<br>
变量a+b的值为:<%=a+b%>