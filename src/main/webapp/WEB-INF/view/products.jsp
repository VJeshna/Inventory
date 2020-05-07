<%@page import="com.mastek.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductDetails</title>
</head>
<body>
	<table>
		<c:forEach var="product" items="${products}">
			<tr>
				<td><a href="product/${product.getProdId()}">${product.getProdId()} </a></td>
				<td>${product.getProdName()}</td>
				<td>${product.getUnitPrice()}</td>
				<td>${product.getAvailQty()}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>