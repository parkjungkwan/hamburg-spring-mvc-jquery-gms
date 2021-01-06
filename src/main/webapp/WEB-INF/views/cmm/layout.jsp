<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="head"/>
</head>
<body>
<article id="layout-gnb">
	<tiles:insertAttribute name="gnb"/>
</article>

<h1>The article and footer elements + CSS</h1>
<article id="layout-container">
	<tiles:insertAttribute name="container"/>
</article>


<footer id="layout-footer">
<tiles:insertAttribute name="footer"/>

</footer>

</body>
</html>