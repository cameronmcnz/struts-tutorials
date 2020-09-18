<%@ page contentType="text/html; charset=UTF-8"  %> 
<!-- Note: replaces the version edited previously. -->
<!-- TODO Setup the struts tags using the taglib directive-->

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

         
          <!--TODO Use the iterator tag to work through results -->

          <tr>
              <td>
              <!--TODO Extract the id property of cd -->
               
              </td>
              
              <td>
              <!--TODO Extract the name property of cd  -->
              
              </td>  
              
              <td>
              <!--TODO Extract the artist property of cd-->              
              
              </td>
              
              
              <td>
              <!--TODO Extract the releaseDate -->
               
              </td>
              
              <td>
              <!--TODO Extract the List Price -->
              
              </td>
              
              <td>
              <!--TODO Extract the Your Price -->
                   
              </td>
              

          </tr>
          
      

      
      </table>      

   </BODY>
</HTML>

