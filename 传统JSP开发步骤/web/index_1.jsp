<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/18
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--这样取数据做输出很繁琐，不方便，所以使用EL-->
<%
    Integer sid = (Integer) application.getAttribute("sid");
    String sname = (String) session.getAttribute("sname");
    String shome = (String) request.getAttribute("shome");
%>

<%=sid%><br>
<%=sname%><br>
<%=shome%>
<!--以下是EL表达式使用方式-->
<hr>
${applicationScope.sid}<br>
${sessionScope.sname}<br>
${requestScope.shome}