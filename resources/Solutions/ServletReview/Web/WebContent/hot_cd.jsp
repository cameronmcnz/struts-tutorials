<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hot CD!</title>
</head>

<body>
<b>Hi <%= request.getAttribute("name")  %> !</b>
Your hot CD choice is number <%= request.getAttribute("cdNumber")  %> .
</body>
</html>