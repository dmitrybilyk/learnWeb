<%--
  Created by IntelliJ IDEA.
  User: dmitry
  Date: 28.10.17
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>From Lena</title>
    <%--From lena jsp--%>
  <%--<p>--%>
    <%--<%=request.getParameter("someParam")%>--%>
  <%--</p>--%>
</head>
<body>
<p>
   <%=session.getAttribute("name")%>
   <%=request.getAttribute("name")%>
   <%=request.getParameter("name")%>
</p>
</body>
</html>
