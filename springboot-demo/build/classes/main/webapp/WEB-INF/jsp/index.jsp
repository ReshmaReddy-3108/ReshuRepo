<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>
</head>
<body>
<form action="add" modelAttribute="use">
ID:<input type="number" name="id"/> <br>
Name:<input type="text" name="name"/> <br>
password:<input type="password" name="pwd"/> <br>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>