<%--
  Created by IntelliJ IDEA.
  User: zzz
  Date: 2018-09-11
  Time: 오전 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Hello.jsp Page</h1>
  <h1>${msg}</h1>
  <h1>${tName}</h1>
  <h1>${list}</h1>
  <h1>${password}</h1>
<c:forEach items="${list}" var="str">
    <h2>${str}</h2>
</c:forEach>

</body>
</html>
