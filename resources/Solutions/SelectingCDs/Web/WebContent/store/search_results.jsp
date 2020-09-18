<%@ page contentType="text/html; charset=UTF-8"  %> 
<!-- Setup the struts tags using the taglib directive-->
<%@ taglib prefix="s" uri="/struts-tags"  %> 

<HTML>
   <HEAD>
      <TITLE>Search Results</TITLE>
   </HEAD>
   <BODY>
      <h1>Trivera Tunes</h1>
      <h2>Your music solution!</h2>
      <hr/>
      
      <BR>
      Search results for keyword <B><s:property value="keyword"/> </B>:
      <BR>
      
      
      <table border="1">
      
          <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Artist</th>
              <th>Release</th>
              <th>List Price</th>
              <th>Your Price</th>              
          </tr>

          <!-- Use the iterator tag to work through results -->
          <s:iterator value="results">
       
          <!-- Only display if price is under $13 -->
          <s:if test="%{price < 13.00}">

	          <tr>
	              <td>
	              <!-- Output id property of cd -->
	              <s:property value="ID" /> 
	              </td>
	              
	              <td>
	              <!-- Output name property of cd  -->
	              <s:property value="name" />
	              </td>  
	              
	              <td>
	              <!-- Output artist property of cd-->              
	              <s:property value="artist" />
	              </td>
	              
	              
	              <td>
	              <!-- Output releaseDate property of cd -->
	              <s:property value="releaseDateString"/> 
	              </td>
	              
	              <td>
	              <!-- Output List Price property of cd -->
	              <s:property value="listPrice" />
	              </td>
	              
	              <td>
	              <!-- Output Your Price property of cd-->
				  <s:property value="price" />           
	              </td>
	              
	
	          </tr>
	          
          </s:if>
          
          </s:iterator>
      

      
      </table>      

   </BODY>
</HTML>

