<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/indexcontrol" method="post">
 <table>
<tr>
    <td align='center'>Name:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Email:</td>
    <td><input type='text' name='email'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Password:</td>
    <td><input type='text' name='password'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<table>
<tr>
    <td align='center'><input type='submit' name='SUBMIT' value="SUBMIT"></td>
</tr>
</table>
</table>

 

</form>

</body>
</html>