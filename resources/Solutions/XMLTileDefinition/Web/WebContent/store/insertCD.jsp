<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<!-- convert to use layout. Requires Tiles taglib. -->
<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<!-- use definition -->
<!-- now using tiles-defs.xml - no longer need include directive. -->
<!-- @ include file="/store/triveraTunesDefinition.jsp"  -->

<tiles:insertDefinition name="triveraTunesLayout" >
    <tiles:putAttribute name="title" type="string" 
                        value="Insert" />
    <tiles:putAttribute name="body" type="string" >

    <!-- keep the original body content as value of body attribute -->
    <br/>
    <CENTER>
      <H1>Add CD to Database</H1>
    </CENTER>

    <%-- if any field errors, add an advisory message --%> 
    <s:if test="%{fieldErrors.size > 0}" >
      <div style="text-align:center;">
        <font size="5" color="#FF0000">
          There were errors - please review the list and correct the corresponding fields.
        </font>
      </div>
    </s:if>

    <%-- display field errors (could move into if statment) --%> 
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
          <%-- Add a reset button --%> 
          <TR valign="middle">
            <TD align="Right"> <s:reset value="Reset" /> </TD>
          </TR>
        </TABLE>
      
      </div>
   
    <%-- End of form --%> 
    </s:form>

  <!-- close body attribute -->
  </tiles:putAttribute>
	 
<!-- close insertDefinition -->
</tiles:insertDefinition>
