
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--这里介绍jsp中内置的java对象-->
<!--request对象-->
<%
  String name = request.getParameter("name");
  String age = request.getParameter("age");
%>
来访者的姓名为：<%=name%>
<br>
来访者的年龄为：<%=age%>
