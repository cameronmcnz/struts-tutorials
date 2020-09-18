<%@ page contentType="text/html; charset=UTF-8"  %> 
<%@ taglib prefix="s" uri="/struts-tags"  %> 

<html>
<head>
    <title><s:text name="SetLanguage.message"/></title>
</head>

<body>
<h2><s:property value="message"/></h2>

<h3>Languages</h3>
<ul>
    <li>
	    <!-- Setup URL construction using "en" parameter -->
        <s:url id="url" action="SetLanguage">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English</s:a>
    </li>
    <li>
	    <!-- Setup URL construction using "nl" parameter -->
        <s:url id="url" action="SetLanguage">
            <s:param name="request_locale">nl</s:param>
        </s:url>
        <s:a href="%{url}">Dutch</s:a>
    </li>
</ul>

</body>
</html>
