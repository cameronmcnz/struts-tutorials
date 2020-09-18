<%@ taglib prefix="s" uri="/struts-tags"  %> 

<s:form action="search">
  <s:a href="index.jsp">TriveraTunes Home</s:a>
  <br/>
  <br/>
  <s:textfield label="Search" key="keyword" size="20" maxlength="30"/><s:submit value="Go!" />
</s:form>
<%= new java.util.Date()  %> 
