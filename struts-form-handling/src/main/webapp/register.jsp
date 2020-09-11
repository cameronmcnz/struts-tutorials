<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<s:head />
</head>
<body>


<h2>Hey, why don't you register!</h2>

<s:form action="register">

<s:textfield key="personBean.firstName"  />
<s:textfield key="personBean.lastName"  />
<s:textfield key="personBean.email"  />
<s:textfield key="personBean.age" />
<s:submit/>

</s:form>

<s:url action="display"  var="displayPageLink"/>
<p><s:a href="%{displayPageLink}">Please display.</s:a></p>

</body>
</html>







