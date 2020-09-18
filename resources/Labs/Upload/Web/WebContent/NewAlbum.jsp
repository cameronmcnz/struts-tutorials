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

  <!-- TODO handle any errors (check for both field errors and 
                    action errors from the MPU wrapper-->















  <table>

    <!-- TODO Make sure you set the appropriate enctype -->
    <s:form action="AddAlbum" method="post" 
  			enctype="??????" >
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
          <!-- TODO Add the input field for the file for property cdimage -->

        </td>
      </tr>
      
      <tr>
        <td><s:submit /></td>
      </tr>
      
    </s:form>
    
  </table>

</body>
</html>