<%@ page import="java.util.Enumeration" %>
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
    <title>Dima.jsp</title>
  </head>
  <body>
  <jsp:useBean id="ruslanObject" class="com.lena.model.Ruslan">
      <jsp:setProperty name="ruslanObject" property="*"/>
  </jsp:useBean>
      <%--<c:forEach var="parameter" items="${param}">--%>
          <%--<c:out value="${parameter.value}"/><br>--%>
      <%--</c:forEach>--%>

  <br>
  name <c:out value="${ruslanObject.hisName}"/> <br>
  surname <c:out value="${ruslanObject.hisSurName}"/>

  <c:set var="isValueValid" value="${ruslanObject.valid}"/>
  <c:out value="${ruslanObject.valid}"/>
  <c:if test="${isValueValid}">
      <c:set var="name" value="${ruslanObject.hisName}" scope="session"/>
      <c:set var="surName" value="${ruslanObject.hisSurName}" scope="session"/>
  </c:if>
  <br><br>
  <a href="FromLena.jsp"> To From Lena jsp</a>
  <%--<%--%>
      <%--while(request.getParameterNames().hasMoreElements()) {--%>
          <%--String value = request.getParameterNames().nextElement();--%>
          <%--%>--%>
      <%--<p>'<%=value%>'</p> <br>--%>
      <%--<%--%>
      <%--}--%>

  <%--%>--%>
  <%--<c:out value="${param.nameKey}"/>--%>
  </body>
</html>
