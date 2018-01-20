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

<%! private int r = 10;

    public void setS() {

    }
%>

<html>
  <head>
      <script src="js/lena.js" ></script>
      <jsp:include page="jspWithJavaScript.jsp" />
    <title>Lenaaa</title>
  </head>
  <>

  <c:choose>
      <c:when test="${empty cookie}">
          <h2>No cookies</h2>
      </c:when>
      <c:otherwise>
          <c:forEach var="oneCookie" items="${cookie}" >
              ${oneCookie.key}
              ${oneCookie.value.value}
          </c:forEach>
      </c:otherwise>
  </c:choose>

  <c:if test="${param.paramm}">
      <%
          response.sendError(401, "401 errrrror");
      %>
  </c:if>
  <%--<jsp:forward page="viewParams.jsp">--%>
      <%--&lt;%&ndash;<jsp:param name="another" value="dfdfdf"/>&ndash;%&gt;--%>
  <%--</jsp:forward>--%>

  <p>
      <a href="/lena/changeServlet">To change servlet</a>
  </p>

<c:url var="myCurl" value="/cookieTest?par=papar"/>
      Lena's body
      <p>
        <a href="${myCurl}">To cookie</a>
        <%--<a href="/lena/cookieTest?par=paparrrrr">To cookie</a>--%>
      </p>
  <p>
      <a href="${myCurl}">To cookie</a>
      <%--<a href="/lena/cookieTest?par=paparrrrr">To cookie</a>--%>
  </p>
      <p>
        <a href="/lena/downloadFile">Download file</a>
      </p>
  <%--<script>--%>
      <%--function myFunction(p1, p2) {--%>
          <%--return p1 * p2;--%>
      <%--}--%>
      <%--document.getElementById("lenaTestId").innerHTML = myFunction(4, 3);--%>
  <%--</script>--%>
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
  <form action="dima.jsp" method="get" onsubmit="return validateForm(this)">
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

  <form enctype="multipart/form-data" action="/lena/uploadFile" method="post">
      <input name="file" type="file">
      <input type="submit" value="Uppload"/>
  </form>

  <% if (Math.random() < 0.5) { %>
  <B>Удачного</B> Вам дня!
  <% } else { %>
  <B>Не удачного</B> Вам дня!
  <% } %>

  <%--<%--%>
      <%--ResourceBundle bundle = ResourceBundle.getBundle("com.lena.servlets.include");--%>
      <%--String fileName2 = bundle.getString("fileName");--%>
  <%--%>--%>

      <%--<%=fileName2%>--%>
      <%out.append("dfdfd");%>
    <%--<jsp:include page="<%=fileName2%>"/>--%>
    <%--<jsp:include page='<%=application.getInitParameter("fileName")%>'/>--%>

  </body>
</html>
