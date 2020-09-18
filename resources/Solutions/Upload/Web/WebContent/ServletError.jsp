<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %> 
<%@ page isErrorPage="true"  %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servlet Error</title>
</head>
<body>

<%
    // Note: this contains a workaround for a WAS 6.1 error for which you may not have
    //       the required fix pack. Symptoms in the logs are:
    //
    //           WARNING: Cannot set status. Response already committed.
    //           WARNING: Cannot set header. Response already committed.
    //           ServletError.jsp: Exception was 'java.io.FileNotFoundException', message='/AddAlbum.action'.
    //
    //       The causes is a bug in WAS filter processing, in which it fails to detect
    //       that Struts has handled the request. WAS then looks for a file with the
    //       name of the form's action attribute, which the form tag has translated, for
    //       example, to "/AddAlbum.action", which of couse does not exist. Without this 
    //       error page, you would then get a 500 error due to an unhandled exception.
    //
    //       Finally, since this page may handle conditions outside of the context
    //       provided by the struts filter, we will not use the struts tags here.

    // default heading and message
    String pageHdr  = "Error";
    String pageMsg1 = "An Error occurred while processing your request.";
    String pageMsg2 = "No detailed error information is available.";
    String sysMsg   = "ServletError.jsp: ";
    
    Throwable t = (Throwable) exception;
    
    if (t == null) {
       if (pageContext != null) {
           t = pageContext.getException();
       }
    }
    
    // check for WAS bug:
    if (t != null && t.getClass().getName().equals("java.io.FileNotFoundException") && 
        t.getMessage().endsWith(".action")) {
        return;
    }
    
    // otherwise, handle like usual.
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

    // expose to page
    request.setAttribute("pageHdr", pageHdr);
    request.setAttribute("pageMsg1", pageMsg1);
    request.setAttribute("pageMsg2", pageMsg2);

    // Note: do not use struts tags in page body
 %>   

  <h1><%= request.getAttribute("pageHdr")  %> </h1>
  <p><%= request.getAttribute("pageMsg1")  %> </p>
  <p><%= request.getAttribute("pageMsg2")  %> </p>

</body>
</html>