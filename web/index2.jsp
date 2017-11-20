<%@ page import="java.util.ResourceBundle" %>
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


  <jsp:forward page="viewParams.jsp">
      <%--<jsp:param name="another" value="dfdfdf"/>--%>
  </jsp:forward>

  <p>
      <a href="/lena/changeServlet">To change servlet</a>
  </p>


      Lena's body
      <p>
        <a href="/lena/lenaTest?someParam=SomeValue">lenaTest777777</a>
      </p>
      <p>
        <a href="FromLena.jsp">To From Lena jsp</a>
      </p>
      <p>
        <a href="someFormForIncl.jsp">To Some Fomr For Incl</a>
      </p>
      <p>
        <a href="/lena/myController">to my controller</a>
      </p>
      <p>
          <a href="dima.jsp">to Lena html</a>
      </p>
      <p>
          <c:out value="${date}"/>
      </p>
      <%--<%@include file="WEB-INF/IncludedJsp.jsp" %>--%>
  <form action="dima.jsp" method="get">
      <table>
          <%--<tr>--%>
              <%--<td>--%>
                  <%--Name:--%>
              <%--</td>--%>
              <%--<td>--%>
                  <%--<input type="text" name="myCookie">--%>
              <%--</td>--%>
          <%--</tr>--%>
          <tr>
              <td>
                  Name:
              </td>
              <td>
                  <input type="text" name="hisName">
              </td>
          </tr>
          <tr>
              <td>
                  Surname:
              </td>
              <td>
                  <input type="text" name="hisSurName">
              </td>
          </tr>
      </table>
      <input type="submit" value="Send name and surname">
  </form>
  <%--<jsp:include page="WEB-INF/IncludedJsp.jsp" />--%>
    <%--<c:import url="https://sportarena.com/football/upl/paulino-pokinet-zaryu-v-kontse-goda-na-pravah/" />--%>

  <%
      ResourceBundle bundle = ResourceBundle.getBundle("com.lena.servlets.include");
      String fileName2 = bundle.getString("fileName");
  %>

      <%=fileName2%>
    <%--<jsp:include page="<%=fileName2%>"/>--%>
    <%--<jsp:include page='<%=application.getInitParameter("fileName")%>'/>--%>

  </body>
</html>
