<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roshambo App!</title>
</head>
<body>

  <form action="myhelloworld.action">
    May I ask your name? 
    <input type="text" name="firstName"/>
    <input type="submit" value="submit"/>
  </form>
  
  <a href="http://localhost:8080/roshambo/myhelloworld.action?firstName=Rachael">
  Call the action through a link with a parameter
  </a>




</body>
</html>