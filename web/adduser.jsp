<%--
  Created by IntelliJ IDEA.
  User: dmitry
  Date: 25.10.17
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddUser</title>
</head>
<body>

<form action="/lena/addUserServlet" method="post">
  <input type="hidden" value="${editedUserId}" name="editedUserId">
  <table>
    <tr>
      <td>
        Name:
      </td>
      <td>
        <input type="text" name="name" value="${requestScope.editedUser.name}">
      </td>
    </tr>
    <tr>
      <td>
        Age:
      </td>
      <td>
        <input type="text" name="age" value="${requestScope.editedUser.age}">
      </td>
    </tr>
  </table>
  <input type="submit" value="Submit">
</form>

</body>
</html>
