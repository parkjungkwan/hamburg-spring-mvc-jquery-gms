<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/tags/form" %> 
<link rel="stylesheet" href="${stu}/css/login.css" />
<h1 style="width:300px;margin: 0 auto;padding-bottom: 50px;">교강사 접속화면</h1>


  <div class="imgcontainer">
    <img style="width:100px;height:100px" src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>교강사번호</b></label>
    <input type="text" placeholder="Enter Username" id="teaNum" required>

    <label for="psw"><b>비밀번호</b></label>
    <input type="password" placeholder="Enter Password" id="password" required>
        
    <button id="tea-login-btn">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
  <script>
$(`#tea-login-btn`).click(function() {tea.access(`${ctx}`)})

  </script>
