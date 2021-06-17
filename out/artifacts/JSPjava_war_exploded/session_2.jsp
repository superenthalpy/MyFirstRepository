
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--读取session_1中的内容-->
<!--读取时对于同一个用户而言-->
<%
    session = request.getSession();
    String name = session.getAttribute("name").toString();
    String sex = session.getAttribute("sex").toString();
%>

姓名是：<%=name%>
<br>
性别是：<%=sex%>