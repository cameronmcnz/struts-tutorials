<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<s:head />
</head>
<body>

<h4>Exception Name: <s:property value="exception" /> </h4>

<p>Exception Details: <s:property value="exceptionStack" /><p>

<p>Sorry, there was an error. Try again later.</p>

<script>
console.log("<s:property value="exception"/>");
</script>

</body>
</html>