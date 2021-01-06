<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<ul>
  <li><a class="active" href="#home">홈</a></li>
  <li><a href="#contact">학생</a></li>
  <li><a href="#contact">교강사</a></li>
  <li style="float:right"><a href="#about">관리자</a></li>
</ul>
<script>
common.goHome()
common.init()
</script>