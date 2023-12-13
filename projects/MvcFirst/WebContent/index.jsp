<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/indexControl" method="post">
	<input type="number" name="firstnumber" placeholder="Enter first number"><br><br>
	<input type="number" name="secondnumber" placeholder="Enter second number"><br><br>
	<input type="submit" value="ADD">
	
</form>

</body>
</html>