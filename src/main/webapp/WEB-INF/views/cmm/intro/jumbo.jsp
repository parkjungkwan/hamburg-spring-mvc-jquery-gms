<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<div class="jumbotron text-center">
  <h1>Company</h1> 
  <p>We specialize in blablabla</p> 
  <form>
    <div class="input-group">
      <input type="email" class="form-control" size="50" placeholder="학생 아이디" required>
      <input type="email" class="form-control" size="50" placeholder="학생 비밀번호" required>
      <div class="input-group-btn">
        <button type="button" class="btn btn-danger" style="height:65px">로그인</button>
      </div>
    </div>
  </form>
</div>