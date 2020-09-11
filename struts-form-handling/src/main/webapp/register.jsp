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

<s:text name="package.greeting" /><br/>
<s:text name="global.greeting" /><br/><br/>

<s:url action="display"  var="displayPageLink"/>
<s:a href="%{displayPageLink}">
Display properties properly 
</s:a>
 || 
<s:url action="display"  var="displayFrenchPageLink">
  <s:param name="request_locale">fr</s:param>
</s:url>

<s:a href="%{displayFrenchPageLink}">Display French properties properly</s:a>
<br/><br/>



</body>
</html>







