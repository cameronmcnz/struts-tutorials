<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>


<h2>Hey, why don't you register!</h2>

<s:form action="register">

<s:textfield name="personBean.firstName" label="First name" />
<s:textfield name="personBean.lastName" label="Last name" />
<s:textfield name="personBean.email" label="Email" />
<s:textfield name="personBean.age" label="Age" />
<s:submit/>

</s:form>

</body>
</html>







