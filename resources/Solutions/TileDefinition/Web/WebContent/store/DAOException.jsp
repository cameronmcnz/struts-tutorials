<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ page isErrorPage="true"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<!-- convert to use layout. Requires Tiles taglib. -->
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"  %> 

<!-- use definition -->
<%@ include file="/store/triveraTunesDefinition.jsp"  %> 

<tiles:insertDefinition name="triveraTunesLayout" >
    <tiles:putAttribute name="title" type="string" 
                        value="Database Error" />
    <tiles:putAttribute name="body" type="string" >

      <CENTER>
        <p><font size="6" color="#FF0000">An Error Occured while accessing the database</font><br/>
        <font color="#FF0000">contact the System administrator </font></p>
        <s:actionerror />
      </CENTER>

  <!-- close body attribute -->
  </tiles:putAttribute>
	 
<!-- close insertDefinition -->
</tiles:insertDefinition>
