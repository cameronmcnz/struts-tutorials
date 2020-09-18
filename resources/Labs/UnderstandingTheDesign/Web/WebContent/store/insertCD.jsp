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
    
    <%-- TODO Create a form that will forward to "insertCD" --%> 

      <div style="text-align:center;">

        <TABLE style="background-color:#FFFF99">

          <TR valign="middle">
            <TD> <%-- TODO Create a text field labeled ID and named "cd.id" --%>  
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- TODO Create a text field labeled Name and named "cd.name" --%> 
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- TODO Create a text field for Artist --%> 
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- TODO Create a text field for Release Date --%> 
            </TD>
          </TR>
          
          <TR valign="middle">
            <TD> <%-- TODO Create a text field for Price --%> 
            </TD>
          </TR>

          <TR valign="middle">
            <TD> <%-- TODO Create a text field for List Price --%> 
            </TD>
          </TR>
          
        </TABLE>

        <TABLE style="width:30%">
          <TR valign="middle">
            <TD align="Right"> <s:submit value="Submit" /> </TD>
          </TR>
        </TABLE>
        
      </div>

    <%-- TODO End of form --%> 

</BODY>
</HTML>
