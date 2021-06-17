
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--session对象的使用-->
<%
    session = request.getSession();
    session.setAttribute("name","qaz");
    session.setAttribute("sex","女人");
%>

<!--在session_1.jsp中向session对象中写入内容，session_2.jsp中读取-->