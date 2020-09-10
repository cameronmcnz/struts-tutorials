<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<s:url action="hello" var="helloLink">
	<s:param name="firstName">World</s:param>
</s:url>

<!-- Hello World in Struts index.html file -->
<html>
  <body>
    <s:form action="hello">
      <s:textfield name="firstName" label="Please tell me your name" value="World"/>
      <s:submit value="Submit" />
    </s:form>
    
    <p>
		<a href="${helloLink}">Do the Hello World!</a>
	</p>
    
    
  </body>
</html>