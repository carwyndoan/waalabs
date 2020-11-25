<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div id="global">
    <c:if test="${errors != null}">

        <p id="errors">
            Error(s)!
        <ul>
            <c:forEach var="error" items="${errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>
    </c:if>

    <form action="calculator_save" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <input type = "text" name = "add1" size = "2"  value = "${form.add1}" /> +
                <input type = "text" name = "add2" value = "${form.add12}" size = "2"/> =
                <input type = "text" name = "sum" value = "${form.sum}"  size = "2" readonly/>
            </p>
            <p>
                <input type = "text" name = "mult1" size = "2"  value = "${form.mult1}" /> +
                <input type = "text" name = "mult2" value = "${form.mult2}" size = "2"/> =
                <input type = "text" name = "product" value = "${form.product}"  size = "2" readonly/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset">
                <input id="submit" type="submit" value="Calculate">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
