<%@ taglib prefix="s" uri="/struts-tags"  %> 
<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 
<!-- Created new definition. Load first time only. -->
<s:if test="%{triveraTunesLayout == null}" >
  <tiles:definition name="triveraTunesLayout"
                    template="/store/triveraTunesLayout.jsp">
    <tiles:putAttribute name="title"  value="Get your tunes"/>
    <tiles:putAttribute name="header" value="/store/search_form.jsp"/>
  </tiles:definition>
</s:if>
