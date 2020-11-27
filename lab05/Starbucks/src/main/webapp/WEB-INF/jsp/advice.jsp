<%--
  Created by IntelliJ IDEA.
  User: phuocdoan
  Date: 11/23/20
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Advice</title>
</head>
<body>
    <h2>Ask for advice about your favorite roast:</h2>
    <p />
    <form action = "get_advice" method="post">
        <select name="roast">
            <option value="-">--Choose Roast--</option>
            <option value="dark">Dark</option>
            <option value="medium">Medium</option>
            <option value="light">Light</option>
        </select>
        <br/><br/>
        <input type="submit" value = "Submit"/>
    </form>
    <div id='advice'>
        <c:forEach var="item" items="${roast}">
            <br><c:out value="${item}"></c:out>
        </c:forEach>
    </div>
</body>
</html>
