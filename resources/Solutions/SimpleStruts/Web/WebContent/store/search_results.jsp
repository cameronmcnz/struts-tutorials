<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 

<HTML>
   <HEAD>
      <TITLE>Search Results</TITLE>
   </HEAD>
   <BODY>
	Search Results for keyword
		<!-- Extract keyword -->
	  -<b><s:property value="keyword"/></b>-
	go here!
	<br/>
	Artist was:
		<!-- Extract the search results -->
	  -<b><s:property value="searchArtist"/></b>-
   </BODY>
</HTML>
