<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 
<!-- Copied from updateSuccessful.jsp and edited -->
<HTML>
   <HEAD>
      <!-- Get title from title attribute -->
      <TITLE><tiles:getAsString name="title" /></TITLE>
   </HEAD>

   <BODY bgcolor="#FFFFCC">

   <!-- Insert the header attribute -->
   <tiles:insertAttribute name="header" />

   <br/>

   <!-- Get title from title attribute -->
   <div style="text-align:center;"><H1><tiles:getAsString name="title" /></H1></div>

   <!-- Insert the body attribute (may be absent) -->
   <tiles:insertAttribute name="body" ignore="true" />

</BODY>
</HTML>
