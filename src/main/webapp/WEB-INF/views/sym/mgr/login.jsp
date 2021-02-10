<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/tags/form" %> 
<h1 style="width:300px;margin: 0 auto;padding-bottom: 50px;">관리자 접속화면</h1>
<link rel="stylesheet" href="${stu}/css/login.css" />

<div>
  <div class="imgcontainer">
    <img style="width:100px;height:100px" src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
  </div>
<sec:form id="sec_form" commandName="student" action="${ctx}/auth/manager/login">
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <sec:input type="text" path="" placeholder="ID 입력" id="mgrNum" required></sec:input>
    <label for="psw"><b>Password</b></label>
    <sec:input type="password" path=""  id="password" placeholder="비번 입력"  required></sec:input>
    <button id="mgr-access-btn">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</sec:form>|
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</div>
<script>
$(`#mgr-access-btn`).click(function() {mgr.access(`${ctx}`)})
</script>