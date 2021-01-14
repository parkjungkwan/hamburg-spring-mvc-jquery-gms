<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="head"/> 
<style>
body {
  margin: 0;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 10%;
  background-color: #f1f1f1;
  position: fixed;
  height: 100%;
  overflow: auto;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
.my-tab {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid black
}

.my-tab th, td {
  text-align: left;
  padding: 8px;
  border: 1px solid black;
  text-align:center;
}

.my-tab tr:nth-child(even){background-color: #f2f2f2}

.my-tab th {
  background-color: #4CAF50;
  color: white;
  text-align:center;
  border: 1px solid black
}

.pagination {
  display: inline-block;
}

.pagination a {
  color: black;
  float: left;
  padding: 8px 16px;
  text-decoration: none;
  transition: background-color .3s;
  border: 1px solid #ddd;
}

.pagination a.active {
  background-color: #4CAF50;
  color: white;
  border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {background-color: #ddd;}

</style>
</head>
<body>

<div>
	<tiles:insertAttribute name="sidebar"/>
</div>



<div style="margin-left:10%;padding:1px 5px;height:1000px;">
		<article id="layout-container">
			<tiles:insertAttribute name="container"/>
		</article>
</div>

<footer id="layout-footer">
	<tiles:insertAttribute name="footer"/>
</footer>
</body>
</html>
