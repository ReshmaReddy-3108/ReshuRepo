<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample Page</title>
</head>
<body>
<h3>Details of the uses</h3>
<c:forEach var="user" items="${al}">
Id:<cout: value="${user.id}"/>
Name:<cout: value="${user.name}"/>
Pwd:<cout: value="${user.pwd}"/>
</c:forEach>

</body>
</html>