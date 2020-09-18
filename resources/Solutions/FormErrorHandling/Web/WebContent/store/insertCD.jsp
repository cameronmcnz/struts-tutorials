<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<HTML>
  <HEAD>
    <TITLE>Insert</TITLE>
  </HEAD>

  <BODY bgcolor="#FFFFCC">
	
<%@ include file="search_form.jsp"  %> 

    <br/>
    <div style="text-align:center;">
      <H1>Add CD to Database</H1>
    </div>

    <%-- If any field errors, add an advisory message --%> 
    <s:if test="%{fieldErrors.size > 0}" >
      <div style="text-align:center;">>
        <font size="5" color="#FF0000">
          There were errors - please review the list and correct the corresponding fields.
        </font>
      </div>
    </s:if>

    <%-- Display field errors (could move into if statement) --%> 
    <font size="4" color="#FF0000">
	    <s:fielderror/>
    </font>
    
    <%-- Create a form that will forward to "insertCD" --%> 
    <s:form action="insertCD">

	  <div style="text-align:center;">
	  
        <TABLE style="background-color:#FFFF99">
        
          <TR valign="middle">
            <TD> <%-- Create a text field labeled ID and named "cd.id" --%>  
              <s:textfield label="ID" name="cd.id" size="20" maxlength="30"/> 
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- Create a text field labeled Name and named "cd.name" --%> 
              <s:textfield label="Name" name="cd.name" size="20" maxlength="30"/>
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- Create a text field for Artist --%> 
              <s:textfield label="Artist" name="cd.artist" size="20" maxlength="30"/>
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- Create a text field for Release Date --%> 
              <s:textfield label="Release Date" name="cd.releaseDate" size="20" maxlength="30"/>
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- Create a text field for Price --%> 
              <s:textfield label="Price" name="cd.price" size="20" maxlength="30"/>
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- Create a text field for List Price --%> 
              <s:textfield label="List Price" name="cd.listPrice" size="20" maxlength="30"/>
            </TD>
          </TR>

	    </TABLE>

        <TABLE style="width:30%">
          <TR valign="middle">
            <TD align="Right"> <s:submit value="Submit" /> </TD>
          </TR>
          <%-- Exercise 10: Add a reset button --%> 
          <TR valign="middle">
            <TD align="Right"> <s:reset value="Reset" /> </TD>
          </TR>
        </TABLE>
      
      </div>
   
    <%-- End of form --%> 
    </s:form>

</BODY>
</HTML>
