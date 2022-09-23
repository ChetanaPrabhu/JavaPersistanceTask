<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register page</title>
</head>
<body>

<div> <center>
    <h2>Register Form</h2><br>
    <form action="Registerservlet" method = "post">
        
        <label for="">Employeeid</label><br>
        <input type="text" name="empid" id=""><br>
        <label for="">Name</label><br>
        <input type="text" name="username" id=""><br>
        <label for="">Contact Email</label><br>
        <input type="text" name="email" id=""><br><br>
        <button>Save</button><br><br><br>
        
    </form>
    </center></div>
	

</body>
</html>