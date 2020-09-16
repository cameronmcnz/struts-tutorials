<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<s:head/></head>
<body>

Would you like to play a game?<br/>
<s:form action="rpsaction">
	<s:textfield name="clientGesture"  />
	<s:submit type="submit"/>
</s:form>

<s:if test='gameResult != null'>
The last game was a: <s:property value="gameResult"/><br/>
</s:if>
<s:if test='gameResult == null'>
Let's play!<br/>
</s:if>

<br/>

Wins: <s:property value="#session['wins']" default="0"/><br/>
Losses: <s:property value="losses" default="0"/><br/>
Ties: <s:property value="ties" default="0"/><br/>








<s:if test="#session['wins']==0">
	<p>Hint: Pick Paper</p>
</s:if>

<s:if test="#session['wins']==0">
	<p>Hint: Pick Paper</p>
</s:if>
<s:if test="#session['losses']==0">
	<p>You haven't lost a game yet! </p>
</s:if>
<s:if test="#session['ties']==0">
	<p>Thai curry is best. Try it!</p>
</s:if>


Here is your game history:<br/><br/>
<s:iterator value="#session['history']">
  You chose the: <s:property/><br/>
</s:iterator>

</body>


</html>