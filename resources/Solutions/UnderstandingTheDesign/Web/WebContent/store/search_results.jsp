<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<HTML>
<HEAD>
  <TITLE>Search Results</TITLE>
</HEAD>

<BODY bgcolor="FFFFCC">

<%@ include file="search_form.jsp"  %> 

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
                <!-- TODO output name property of cd -->
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
                <!-- TODO output artist property of cd -->
              <td style="width:43px"></td>
              
              <td style="width:49px">
                <font size="2"> 
                  <!-- TODO Use delete CD link above as basis for editCD -->
                </font>
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right">Release Date : </div>
              </td>
              
              <td style="width:370px">
                <!-- TODO output releaseDate -->
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right">List Price $ </div>
              </td>
              
              <td style="width:370px">
                <!-- TODO output List Price-->
              </td>
            </tr>
            <tr>
              <td style="width:131px">
                <div align="right"><font color="#FF0000"> Your Price $ </font> </div>
              </td>
              
              <td style="width:370px">
                <font color="#FF0000">
                  <!-- TODO output Your Price-->
                </font>
              </td>
            </tr>
          </table>
        </td>
      </tr>
    </table>
  <hr/>
  </s:iterator>

  </BODY>
</HTML>
