<%--
  Created by IntelliJ IDEA.
  User: zzz
  Date: 2018-09-11
  Time: 오후 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <ul>
      <c:set var="total" value="${0}" />
      <c:forEach items="${orderList}" var="order">
          <c:set var="menu" value="${menuMap.get(order.mno)}" />
      <li>${order}  ${menuMap.get(order.mno).name }
              ${menu.price * order.qty }
      </li>
          <c:set var="total" value="${(menu.price * order.qty) + total}" />
      </c:forEach>
  </ul>


<h2>${total}</h2>
</body>
</html>
