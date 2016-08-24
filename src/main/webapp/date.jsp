<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: stannisbaratheon
  Date: 24/08/16
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<h1>Dit is mijn eerste jsp pagina</h1>
<%
    out.println(java.time.LocalDateTime.now());
%>

</body>
</html>
