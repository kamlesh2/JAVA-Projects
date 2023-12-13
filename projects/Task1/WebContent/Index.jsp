<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gold" font-color="red">
<form action="<%=request.getContextPath()%>/IndexControl">
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
   <td><h1>Registration Form</h1></td>
</tr><center>
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'>User Name:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>User Email:</td>
    <td><input type='text' name='email'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>User Phone:</td>
    <td><input type='text' name='phone'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>User Password:</td>
    <td><input type='text' name='passsword'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Confirm Password:</td>
    <td><input type='text' name='phone'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
<tr>
    <td align='center'><input type='submit' name='REGISTER' value="REGISTER"></td>
</tr>
</table>
</table>
 
</table>
</form>
</body>
</html>