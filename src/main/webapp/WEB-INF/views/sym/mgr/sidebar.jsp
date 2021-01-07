<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<ul>
  <li><a class="active" href="#">관리자 홈</a></li>
  <li><a id="mgr-data-mgt" href="#">데이터관리</a></li>
  <li><a href="#">Contact</a></li>
  <li><a href="#">About</a></li>
</ul>
<script>
$(`#mgr-data-mgt`).click(function(e){
	e.preventDefault()
	location.href = `${ctx}/mgr/data_mgt`
})
</script>