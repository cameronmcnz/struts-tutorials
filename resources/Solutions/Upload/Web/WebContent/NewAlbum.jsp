<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<html>
<head>
  <title>New Album</title>
  <link rel="stylesheet" href="main.css" type="text/css"/>
  <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>

  <p class="pageHeader" >New Album</p>

  <!-- Handle any errors (check for both field errors and 
                    action errors from the MPU wrapper-->
  <s:if test="%{fieldErrors.size > 0 || actionErrors.size > 0}" >

	<div style="text-align:center;">
	    <font size="5" color="#FF0000">
		  There was a problem with the input - please review the message(s) and select a different file.
	    </font>
	</div>

	<font size="4" color="#FF0000">
		<s:fielderror/>
		<s:actionerror/>
	</font>

  </s:if>

  <table>

    <!-- Make sure you set the appropriate enctype -->
    <s:form action="AddAlbum" method="post" 
  			enctype="multipart/form-data" >
      <tr>
        <td><s:textfield name="artist" label="Artist name" /></td>
      </tr>

      <tr>
        <td><s:textfield name="albumName" label="Album title" /></td>
      </tr>

      <tr>
        <td><s:textfield name="releaseYear" label="Release year" /></td>
      </tr>

      <tr>
        <td>
          <!-- Add the input field for the file for property cdimage -->
          <s:file name="cdimage"  label="CD Image" />
        </td>
      </tr>
      
      <tr>
        <td><s:submit /></td>
      </tr>
      
    </s:form>
    
  </table>

</body>
</html>