<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo</title>
</head>
<body>
	<h1 style="text-align: center;">
		Profile Detail
	</h1>
	<hr>
	<br><br><br>
	<form style="text-align: left;" action="./Demo" method="get">
		<table style="margin: auto;">
			<tr>
				<th>Enter Name:-</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Enter Phone No.:-</th>
				<td><input type="number" name="phone"></td>
			</tr>
			<tr>
				<th>Enter Email id:-</th>
				<td><input type="Email" name="email"></td>
			</tr>
			<tr>
				<th>Enter DOB:-</th>
				<td><input type="Date" name="dob"></td>
			</tr>
			<tr>
				<th>Select Gender:-</th>
				<td><select name="gender">
					<option value="male">MALE</option>
					<option value="female">FEMALE</option>
				</select>
			</td>
			</tr>
			<tr>
				<th>Select Mother Language:-</th>
				<td><input type="radio" name="language" value="hindi">Hindi
					<input type="radio" name="language" value="gujrati">Gujrati
					<input type="radio"	name="language"	value="english">English
				</td>
			</tr>
			<tr>
				<th>Select Language</th>
				<td><input type="checkbox" name="program" value="java">JAVA
					<input type="checkbox" name="program" value="php">PHP
					<input type="checkbox" name="program" value=".net">.NET
				</td>
			</tr>
		</table>
		<input type="submit" name="submit" value="submit" style="display: block;margin: auto;">
	</form>
	<br><br><br>
	<hr>
	<footer style="text-align:center;">Created by KAMLESH</footer>
</body>
</html>