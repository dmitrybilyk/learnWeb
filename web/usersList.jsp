<%--
  Created by IntelliJ IDEA.
  User: dmitry
  Date: 29.12.17
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
  <tr>
    <td>Name</td>
    <td>Age</td>
  </tr>
  <c:forEach items="${usersList}" var="item">
    <tr>
      <td><c:out value="${item.name}" /></td>
      <td><c:out value="${item.age}" /></td>
      <td><a href="/lena/addUserServlet?id=${item.id}">Edit</a></td>
      <td><a href="/lena/removeUser?id=${item.id}">Remove</a> </td>
    </tr>
  </c:forEach>
</table>
<a href="/lena/addUserServlet">Add User</a>

</body>
</html>
