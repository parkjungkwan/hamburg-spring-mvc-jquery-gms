<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"/>
<body>
<header id="layout-header">
	<tiles:insertAttribute name="header"/>
</header>
<section>
	<article id="layout-gnb">
		<tiles:insertAttribute name="gnb"/>
	</article>
	<article id="layout-container">
		<tiles:insertAttribute name="container"/>
	</article>
</section>
<footer id="layout-footer">
	<tiles:insertAttribute name="footer"/>
</footer>
<script></script>    
</body>
</html>