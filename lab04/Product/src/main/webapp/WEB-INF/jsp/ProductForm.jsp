 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
    <form:form modelAttribute="newProduct">
        <form:label path="" for="category"/>
        <form:select id="category" path="category.id" items="${categories}" itemValue="id" itemLabel="name"/>
        <form:input path="name" id="name"/>
        <form:input path="description" id="description"/>
    </form:form>

<%--<form action="product" method="post">--%>
<%--    <fieldset>--%>
<%--        <legend>Add a product</legend>--%>
<%--        <p>--%>
<%--            <label for="category">Category </label>--%>
<%-- 		 	<select name="category.id">--%>
<%--		    	<option value="-">  --Select Category-- </option>--%>
<%--		--%>
<%--		  		<c:forEach var="category" items="${categories}">--%>
<%--		    		<option value="${category.id}" > ${category.name}</option>--%>
<%--				</c:forEach>--%>
<%--		    </select>--%>
<%--        </p>--%>
<%--         --%>
<%--        <p>--%>
<%--            <label for="name">Product Name: </label>--%>
<%--            <input type="text" id="name" name="name" --%>
<%--                tabindex="1">--%>
<%--        </p>--%>
<%--        <p>--%>
<%--            <label for="description">Description: </label>--%>
<%--            <input type="text" id="description" value= "${product.description}"--%>
<%--                name="description" tabindex="2">--%>
<%--        </p>--%>
<%--        <p>--%>
<%--            <label for="price">Price: </label>--%>
<%--            <input type="text" id="price" name="price" --%>
<%--                tabindex="3">--%>
<%--        </p>--%>
<%--        <p id="buttons">--%>
<%--            <input id="reset" type="reset" tabindex="4">--%>
<%--            <input id="submit" type="submit" tabindex="5" --%>
<%--                value="Add Product">--%>
<%--        </p>--%>
<%--    </fieldset>--%>
<%--</form>--%>
</div>
</body>
</html>
