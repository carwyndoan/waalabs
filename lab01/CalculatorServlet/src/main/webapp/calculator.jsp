<%--
  Created by IntelliJ IDEA.
  User: phuocdoan
  Date: 11/23/20
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>Calculate</title>
</head>
<body>
    <form action="calc2" method="post">
        <input type = "text" name = "add1" size = "2"  value = "" />+
        <input type = "text" name = "add2" value = "" size = "2"/>=<input type = "text" name = "sum" value = ""  size = "2" readonly/><br/>
        <input type = "text" name = "mult1" value = "" size = "2"/>*
        <input type = "text" name = "mult2" value = ""  size = "2"/>=<input type = "text" name = "product" value = ""   size = "2" readonly/><br/>
        <input type = "submit" value = "Submit"/>
    </form>
    <p>
        ${result.add1} + ${result.add2} = ${result.sum}<br>
        ${result.mult1} * ${result.mult2} = ${result.product}
    </p>
</body>
</html>
