<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<c:if test="${errors != null}">
    <p id="errors">
        Error(s)!
    <p>
        ${errors}
    </p>
</c:if>

<h2>Login</h2>
<form action = "authenticate" method = "post">
    Name: <input type = "text" name = "name" size = "9" value="${name}"/><br/>
    Password: <input type = "password" name = "password" size = "9" /><br/>
    <br/>
    <input type="submit" value = "Log In"/>
</form>
</body>
</html>
