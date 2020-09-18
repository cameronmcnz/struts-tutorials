<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<HTML>
  <HEAD>
    <TITLE>Update</TITLE>
  </HEAD>

  <BODY bgcolor="#FFFFCC">
  
<%@ include file="search_form.jsp"  %> 

    <br/>
    <div style="text-align:center;">
      <H1>Update CD Information</H1>
    </div>
    
    <%-- TODO Create a form that will forward to "updateCD" --%> 
    
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

          <TR valign="middle">
            <TD>
              <div align="right">Category </div>
            </TD>
            <TD>
              <%-- TODO Setup a selection based on the list of categories using the list value of name --%> 
            </TD>
          </TR>

          <TR valign="middle">
            <TD>
              <div align="right">Image : </div>
            </TD>
            <TD> <img src="../images/<s:property value="id" />.jpg">
            </TD>
          </TR>

        </TABLE>
        
        <TABLE style="width:30%">
          <TR>
            <TD align="Right"> <s:submit value="Submit" /> </TD>
          </TR>
        </TABLE>
        
      </div>

    <%-- TODO End of form --%> 

</BODY>
</HTML>
