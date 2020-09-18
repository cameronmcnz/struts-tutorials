<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> 
<%@ page isErrorPage="true"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IO Exception</title>
</head>
<body>

<s:set name="myException" value="exception" scope="request" />

<%
    // Note: handle IOExceptions occurring within actions and corresponding views,
    //       i.e., within the scope of struts request processing. Other exceptions
    //       (or errors) should be handled by ServletError.jsp. 

    // default heading and message
    String pageHdr  = "Error";
    String pageMsg1 = "An Error occurred while processing your request.";
    String pageMsg2 = "No detailed error information is available.";
    String sysMsg   = "IOException.jsp: ";

    Throwable t = (Throwable) exception;
    
    if (t == null) {
        t = (Throwable) request.getAttribute("myException");
    }
  
    if (t != null) {

        sysMsg += "Exception was '" + t.getClass().getName() +
                  "', message='" + t.getMessage() + "'. ";

        pageHdr  = "Exception";
        pageMsg1 = "An Exception occurred while processing your request. ";
        pageMsg2 = "Exception: " + t.getClass().getName();

        if (t.getMessage() != null) {
            pageMsg2 += " Message='" + t.getMessage() + "'. ";
        } else {
            pageMsg2 += " No detailed error information is available. "; 
        }
        
    } else {
    
        sysMsg = "Exception was null. ";
    
        pageHdr  = "Error";
        pageMsg1 = "An Error occurred while processing your request. ";

        if(pageContext == null) {
            sysMsg = "pageContext was null. ";
        } else {
        
            // Get the ErrorData
            ErrorData ed = null;

            try {
                ed = pageContext.getErrorData();
            } catch (Exception e) {
                // can't use the ErrorData
                sysMsg += "pageContext.getErrorData() threw " + e.getClass().getName() + ". ";
            }

            // get error details for the user
            if(ed == null) {
                sysMsg += "ErrorData was null. ";
            } else {
    
                // get details about the HTTP error
                pageMsg2 = "ErrorCode: "       + ed.getStatusCode() + 
                          ", Requested URL: '" + ed.getRequestURI() + "'. ";
            }
        }
    }
    
    System.out.println(sysMsg + " PageHdr is '" + pageHdr + 
             "', pageMsg1='" + pageMsg1 + "', pageMsg2='" + pageMsg2 + "'.");

    //expose to page
    request.setAttribute("pageHdr", pageHdr);
    request.setAttribute("pageMsg1", pageMsg1);
    request.setAttribute("pageMsg2", pageMsg2);

 %>   

  <h1><s:property value="%{#request['pageHdr']}" /></h1>
  <p><s:property value="%{#request['pageMsg1']}" /></p>
  <p><s:property value="%{#request['pageMsg2']}" /></p>

</body>
</html>