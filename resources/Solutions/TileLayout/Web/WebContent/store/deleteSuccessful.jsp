<!-- Convert to use layout. Requires Tiles taglib. -->

<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<tiles:insertTemplate template="triveraTunesLayout.jsp" >
    <tiles:putAttribute name="title" type="string" value="Delete Successful" />
    <tiles:putAttribute name="header" value="/store/search_form.jsp" />
</tiles:insertTemplate>
