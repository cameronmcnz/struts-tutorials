<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ page isErrorPage="true"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<!-- Convert to use layout. Requires Tiles taglib. -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"  %> 

<tiles:insertTemplate template="triveraTunesLayout.jsp" >
    <tiles:putAttribute name="title" type="string" 
                        value="Database Error" />
    <tiles:putAttribute name="header" value="/store/search_form.jsp" />
    <tiles:putAttribute name="body" type="string" >

      <CENTER>
        <p><font size="6" color="#FF0000">An Error Occured while accessing the database</font><br/>
        <font color="#FF0000">contact the System administrator </font></p>
        <s:actionerror />
      </CENTER>

  <!-- Exercise 13: close body attribute and insertTemplate -->
  </tiles:putAttribute>
	 
</tiles:insertTemplate>
