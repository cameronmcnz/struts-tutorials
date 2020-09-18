<!-- Convert to use layout. Requires Tiles taglib. -->
<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 
<!-- Use definition -->
<%@ include file="/store/triveraTunesDefinition.jsp"  %> 

<tiles:insertDefinition name="triveraTunesLayout" >
    <tiles:putAttribute name="title" type="string" 
                        value="Update Successful" />
</tiles:insertDefinition>
