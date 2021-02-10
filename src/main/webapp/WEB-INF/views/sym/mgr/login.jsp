<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<h1 style="width:300px;margin: 0 auto;padding-bottom: 50px;">관리자 접속화면</h1>
<link rel="stylesheet" href="${stu}/css/login.css" />
<sec:csrfMetaTags />
<script>
// $(`#mgr-access-btn`).click(function() {mgr.access(`${ctx}`)})
	var csrfParameter = $('meta[name="_csrf_parameter"]').attr('content')
	var csrfHeader = $('meta[name="_csrf_header"]').attr('content')
	var csrfToken = $('meta[name="_csrf"]').attr('content')   
	$(function(){ 
		$('#sec_form').submit(function(event){
			event.preventDefault(); 
			var params = "email=" + $('#email').val() + "&password=" + $('#password').val()
			 			+ "&remember-me=" +  $("#remember-me").prop("checked"); 
			 
 			$.ajaxSetup({ 
				beforeSend: function(xhr) { 
					xhr.setRequestHeader(csrfHeader, csrfToken); 
				}  
			})  
			
			$.ajax({
				url : "${ctx}/auth/manager/login",
				type : "post",
				dataType : "json", 
				data : params,
				success : function(response) { 
					alert(response);
					//location.href='${pageContext.request.contextPath}/'; 
				}, error : function(jqXHR, status, e) {
					console.error(status + " : " + e);
				}
		  
			});	   
		});   
	}); 
</script>
<div>
  <div class="imgcontainer">
    <img style="width:100px;height:100px" src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
  </div>
<form id="sec_form" action="${ctx}/auth/manager/login" method="POST">
  <div class="container">
  	<sec:csrfInput />
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="ID 입력" id="mgrNum"/>
    <label for="psw"><b>Password</b></label>
    <input type="password" id="password" placeholder="비번 입력" />
    <input type="submit" id="mgr-access-btn" value="로그인"/>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>|
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</div>
