<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>req5.jsp</h2>
    <c:forEach items="${req5List}" var="req5">
        ${req5.q1}, ${req5.q2}, ${req5.q3} <br>
    </c:forEach>

</body>
</html>
