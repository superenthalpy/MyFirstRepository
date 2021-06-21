<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/20
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--读取作用域对象的共享数据然后将结果相加，将和写入响应体-->
<%
    Integer key1 = (Integer) request.getAttribute("key1");
    Integer key2 = (Integer) request.getAttribute("key2");
    Integer sum = key1+key2;
%>
传统方式得到的和<%=sum%>
<br>
EL表达式得到的和${key1+key2}
<br>
关系运算${key1>key2}
<br>
逻辑运算${key1>key2?"可以的":"不可以"}