<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div>
<a href="inventory/products">All Products</a><br/>

<form method="post" action="inventory/save">
	<pre>
Product ID			<input type="text" name="prodId" id="prodId"/>
Product Name		<input type="text" name="prodName" id="prodName"/>
Unit Price			<input type="number" name="unitPrice" id="unitPrice"/>
Available  Quantity	<input type="number" name="availQty" id="availQty"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>

<form method="post" action="inventory/delete">
	<pre>
Product ID	<input type="text" name="prodId" id="prodId"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>
	
</div>
</body>
</html>