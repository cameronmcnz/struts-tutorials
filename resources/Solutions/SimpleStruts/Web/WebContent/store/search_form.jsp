<%@ page contentType="text/html; charset=UTF-8"  %> 
<!--Setup the struts tags using the taglib directive-->
<%@ taglib prefix="s" uri="/struts-tags"  %> 

<html>
<head>
    <title>Search Form</title>
</head>

<body>

	<!--Define form here -->
	<s:form action="search">
	
		<!-- Create link to TriveraTunes home -->
		<s:a href="../index.html">TriveraTunes Home</s:a>
		
		<br/>
		<br/>
		
		<!-- Define keyword field -->
		<s:textfield label="Search" key="keyword" size="20" maxlength="30"/>
		
		<!-- Define submit button Go -->
		<s:submit value="Go!" />
		
	<!--Close form here -->
	</s:form>
	
	<%= new java.util.Date()  %> 
	
</body>
</html>