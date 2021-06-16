<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--jsp中所有执行标记会作为一个整体来看待，自上而下执行-->
<%
    int a = 20;
    if (a>18){
%>
    <p>欢迎进入</p>
<%
    }else{
%>
    <p>滚出去</p>
<%
    }
%>
<!--对于for循环-->
<!--jsp中的代码执行顺序是由上到下，可以不用再使用java拼接字符串-->
<%
    Student stu1 = new Student(13);
    Student stu2 = new Student(14);
    Student stu3 = new Student(16);
    List<Student> list = new ArrayList<>();
    list.add(stu1);
    list.add(stu2);
    list.add(stu3);
%>
<table>
    <tr>
        <td>id</td>
    </tr>
<%
    for (Student stu:list) {
%>
    <tr>
        <td>
                <%=stu.getId()%>
        </td>
    </tr>
<%
    }
%>
</table>