<%--
  Created by IntelliJ IDEA.
  User: dmitry
  Date: 11.10.17
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<jsp:useBean id="date" class="java.util.Date" />
<html>
  <head>
    <title>Lenaaa</title>
  </head>
  <body>
      Lena's body
      <p>
        <a href="/lena/lenaTest">lenaTest</a>
      </p>
      <p>
          <a href="lenaaa.html">to normal Lena html</a>
      </p>
      <p>
          <c:out value="${date}"/>
      </p>

  <form action="/lena/lenaTest" method="post">
      <table>
          <tr>
              <td>
                  Name:
              </td>
              <td>
                  <input type="text" name="myCookie">
              </td>
          </tr>
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
                  <input type="text" name="surNameKey">
              </td>
          </tr>
      </table>
      <input type="submit" value="Send name and surname">
  </form>


  </body>
</html>
