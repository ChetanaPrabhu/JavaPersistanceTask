<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<center>
			<h3>LOGIN FORM</h3>
			<br>
			<form action="Loginservlet" method="post">

				<label for="">Employeeid</label><br> <input type="text"
					name="empid" id="" required><br> 
					<label for="">Name</label><br>
				<input type="text" name="username" id="" required><br>
				<label for="">Date</label><br> <input type="date" name="date"
					id="" required><br>
				<br>
				<input type = "submit" value = "Login">
				<br>
				<br>
				<br>

			</form>
		</center>
	</div>

</body>
</html>