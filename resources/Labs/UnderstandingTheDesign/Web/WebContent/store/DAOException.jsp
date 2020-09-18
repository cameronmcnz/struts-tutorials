<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ page isErrorPage="true"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<HTML>
   <HEAD>
      <TITLE>Search Form</TITLE>
   </HEAD>
<BODY bgcolor="#FFFFCC">
<div style="text-align:center;">
  <p><font size="6" color="#FF0000">An Error Occured while accessing the database</font><br/>
    <font color="#FF0000">contact the System administrator </font></p>
<s:actionerror />
</div>
</BODY>
</HTML>
