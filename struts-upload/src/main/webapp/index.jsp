<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<body>

  <s:form 
    action="fileupload" 
    method="post" 
    enctype="multipart/form-data">
    
      <s:file name="uploadedFile" label="File" />
      <s:submit />
    
    </s:form>

</body>
</html>