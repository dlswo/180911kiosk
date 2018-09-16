<%--
  Created by IntelliJ IDEA.
  User: hb2005
  Date: 2018-09-12
  Time: 오후 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie cookie = new Cookie("items","");

    cookie.setMaxAge(60*3); //가지고있을 시간 설정.

    response.addCookie(cookie); //이걸 해야지 새쿠키가 동작
%>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
