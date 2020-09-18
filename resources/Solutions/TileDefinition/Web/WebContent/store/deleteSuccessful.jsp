<!-- convert to use layout. Requires Tiles taglib. -->

<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<!-- use definition -->
<%@ include file="/store/triveraTunesDefinition.jsp"  %> 

<tiles:insertDefinition name="triveraTunesLayout" >
    <tiles:putAttribute name="title" type="string" 
                        value="Delete Successful" />
</tiles:insertDefinition>
