<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %> 
<%@ page errorPage="IOException.jsp"  %> 
<%@ page import="java.io.File, java.io.IOException"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 
<s:set name="destFile" value="cdimage"			scope="request" />
<s:set name="fileName" value="cdimageFileName"  scope="request" />

<%
	// AddAlbumAction will have set the filename and the File object 
	// where we can find the image
	File   destFile = (File)   request.getAttribute("destFile");
	String fileName = (String) request.getAttribute("fileName");
	
	// check the uploaded file
	try {
		// see if it exists and is not emppty
		if (destFile == null || !(destFile.exists()) || destFile.length() == 0) {
			throw new IOException ("displayImage: file '"+fileName+"' not found or empty.");
		}
	} catch (Exception e) {
		throw new IOException ("displayImage: Error processing '"+fileName+"': " +
		 	e.getMessage() + "'. ");
	}

	// arbitrary test - if the filename is "throwExceptionFromJSP.gif",
	// throw an exception. This serves to demonstrate that exceptions
	// thrown by JSPs are outside the scope of Struts 2 exception
	// mapping and global results - these apply only to Actions.
	if (destFile.getName().equalsIgnoreCase("throwExceptionFromJSP.gif")) {
		throw new IOException ("displayImage: testing exception mapping with '"+fileName+"'.");
	}
 %> 

<html>
<head>
    <title>Display Uploaded Image</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="GENERATOR" content="Rational Application Developer">
</head>
<body>

<table class="wwFormTable">

    <tr>
        <td colspan="2">
            <h1>Display Uploaded Image File</h1>
        </td>
    </tr>

    <tr>
        <td class="tdLabel">
            <label for="AddAlbum_cdimage" class="label">
                Content Type:
            </label>
        </td>
        <td>
            <s:property value="cdimageContentType" />
        </td>
    </tr>

    <tr>
        <td class="tdLabel">
            <label for="AddAlbum_cdimage" class="label">
                File Name:    
            </label>
        </td>
        <td >
            <s:property value="cdimageFileName" />
        </td>
    </tr>

    <tr>
        <td class="tdLabel">
            <label for="AddAlbum_cdimage" class="label">
                Image File:
            </label>
        </td>
        <td>
            <img src='<s:property value="cdimageFileName" />' />
        </td>
    </tr>

</table>

</body>
</html>
