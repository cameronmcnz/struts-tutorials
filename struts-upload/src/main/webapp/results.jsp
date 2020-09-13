<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<body>

  <s:form action="fileupload" method="post" enctype="multipart/form-data">
    <s:file name="uploadedFile" label="File"/>
    <s:submit/>
  </s:form>

  <s:if test="%{uploadedFileName!=null}">
    <p><s:property value="uploadedFileName"/> was uploaded successfully.</p>
  </s:if>

  <h3>Directory listing</h3>

  <s:if test="%{fileList().isEmpty()}">
    <h3>No files in the directory</h3>
  </s:if>
  <s:else>
    <ul>
      <s:iterator value="fileList">
        <li><s:property /></li>
      </s:iterator>
    </ul>
  </s:else>

</body>
</html>