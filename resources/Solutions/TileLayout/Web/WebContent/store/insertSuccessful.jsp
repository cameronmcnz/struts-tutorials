<!-- Copied from updateSuccessful. -->

<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<tiles:insertTemplate template="triveraTunesLayout.jsp" >
    <tiles:putAttribute name="title" type="string" value="Insert Successful" />
    <tiles:putAttribute name="header" value="/store/search_form.jsp" />
</tiles:insertTemplate>
