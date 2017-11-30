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

<form action="/lena/adduserform" method="post">
  <table>
    <tr>
      <td>
        Name:
      </td>
      <td>
        <input type="text" name="nameKey">
      </td>
    </tr>
    <tr>
      <td>
        Surname:
      </td>
      <td>
        <input type="text" name="ageKey">
      </td>
    </tr>
  </table>
  <input type="submit" value="Add new user">
</form>

</body>
</html>
