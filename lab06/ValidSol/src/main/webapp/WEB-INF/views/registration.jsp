<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration Form</h1><br />
<frm:form modelAttribute="student" action="registration">
    <p>
        <frm:errors path="*" cssStyle="color : red;" />
    </p>
    <frm:label path="firstName">Firstname</frm:label>
    <frm:input path="firstName" id="firstName"/>
    <frm:errors path="firstName" cssStyle="color : red;" /><br/>
    <frm:label path="lastName">Lastname</frm:label>
    <frm:input path="lastName" id="lastName"/>
    <frm:errors path="lastName" cssStyle="color : red;" />
<%--    <frm:label path="area">area</frm:label>--%>
    <frm:input path="phone.area" id="area"/>-
    <frm:input path="phone.prefix" id="prefix"/>-
    <frm:input path="phone.number" id="number"/>
    <p>
        <input type="submit" value = "Submit"/>
    </p>
</frm:form>
</body>
</html>