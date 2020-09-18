<!-- copied from updateSuccessful. -->

<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<!-- use definition -->
<!-- now using tiles-defs.xml - no longer need include directive. -->
<!-- @ include file="/store/triveraTunesDefinition.jsp"  -->

<tiles:insertDefinition name="triveraTunesLayout" >
    <tiles:putAttribute name="title" type="string" 
                        value="Insert Successful" />
</tiles:insertDefinition>
