<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--上面已将相关包导入-->
<!--使用jsp进行导包创建Student类对象-->
<%
    Student stu1 = new Student();
    Student stu2 = new Student(12);
    List<Integer> list = new ArrayList<>();
%>
<!--输出id-->
<%=stu2.getId()%>
