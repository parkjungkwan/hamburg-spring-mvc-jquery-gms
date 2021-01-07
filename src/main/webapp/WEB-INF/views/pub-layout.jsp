<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<%-- <tiles:insertAttribute name="head"/> --%>

<style>
body {
  margin: 0;
}

.my-ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 25%;
  background-color: #f1f1f1;
  position: fixed;
  height: 100%;
  overflow: auto;
}

.my-li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

.my-li a.active {
  background-color: #4CAF50;
  color: white;
}

.my-li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
</style>

</head>
<body>


<table id="layout-tab" style="border: 1px solid black; width: 100%; height: 900px; margin: 0 auto">
	<tr>
		<td style="border: 1px solid black; width: 5%;">
			
		</td>
		
		<td style="border: 1px solid black; width: 20%;">
			<article id="layout-gnb">
				<tiles:insertAttribute name="gnb"/>
			</article>
		</td>
		
		<td>
			<article id="layout-container">
				<tiles:insertAttribute name="container"/>
			</article>
		</td>
	</tr>
	

</table>

<footer id="layout-footer">
<tiles:insertAttribute name="footer"/>

</footer>

</body>
</html>