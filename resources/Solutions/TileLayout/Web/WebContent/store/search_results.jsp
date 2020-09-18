<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<!-- Convert to use layout. Requires Tiles taglib. -->
<%@ taglib prefix="tiles" 
           uri="http://tiles.apache.org/tags-tiles"  %> 

<tiles:insertTemplate template="triveraTunesLayout.jsp" >
    <tiles:putAttribute name="title" type="string" 
                        value="Search Results" />
    <tiles:putAttribute name="header" value="/store/search_form.jsp" />
    <tiles:putAttribute name="body" type="string" >

  <hr/>
  <a href="<s:url action="forwardToInsertCD"></s:url>">Insert New CD into database</a>
  <HR/>

  <BR/>
  Search results for keyword <B><s:property value="keyword"/> </B>:
  <BR/>
    
  <s:iterator value="results">
   
    <table style="width:655px">
      <tr>
        <td>
          <img src="../images/<s:property value="id" />.jpg">
        </td>
        <td>
          <table>
            <tr>
              <td style="width:131px">
                <div align="right">Title : </div>
              </td>
              
              <td style="width:370px">
                <!-- Output name property of cd -->
                <s:property value="name" /> 
              </td>
              
              <td style="width:43px"></td>
              
              <td style="width:49px">
                <font size="2"> 
                  <a href="<s:url action="deleteCD"><s:param name="id" value="id"/></s:url>">Delete</a>
                </font>
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right">Artist : </div>
              </td>
              
              <td style="width:370px">
                <!-- Output artist property of cd -->
                <s:property value="artist"/> </td>
              <td style="width:43px"></td>
              
              <td style="width:49px">
                <font size="2"> 
                  <!-- Use delete CD link above as basis for editCD -->
                  <a href="<s:url action="editCD"><s:param name="id" value="id"/></s:url>">Edit CD</a>
                </font>
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right">Release Date : </div>
              </td>
              
              <td style="width:370px">
                <!-- Output releaseDate -->
                <s:property value="releaseDateString"/>
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right">List Price $ </div>
              </td>
              
              <td style="width:370px">
                <!-- Output List Price-->
                <s:property value="price"/>
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right"><font color="#FF0000"> Your Price $ </font> </div>
              </td>
              
              <td style="width:370px">
                <font color="#FF0000">
                  <!-- Output Your Price-->
                  <s:property value="listPrice"/>
                </font>
              </td>
            </tr>
          </table>
        </td>
      </tr>
    </table>
  <hr/>
  </s:iterator>

  <!-- Close body attribute and insertTemplate -->
  </tiles:putAttribute>
	 
</tiles:insertTemplate>
