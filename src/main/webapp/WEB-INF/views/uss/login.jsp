<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/tags/form" %>   
   
    <link rel="shortcut icon" href="${cmm}/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${cmm}/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${cmm}/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${cmm}/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${cmm}/images/ico/apple-touch-icon-57-precomposed.png">
  <link rel="stylesheet" href="${stu}/css/login.css" />
</head><!--/head-->

<body>
    <div class="logo-image">                                
       <a id="home" href="#"><img class="img-responsive" src="${cmm}/images/logo.png" alt=""> </a> 
    </div>
     <section id="coming-soon">        
         <div class="container">
            <div class="row">
                
                <div class="col-sm-12">
                    <h1>학습자 로그인 화면</h1>
                    <div class="time-count">
                        <sec:form id="sec_form" commandName="student" action="${ctx}/auth/student/login">
                            <div class="container">
                              
                              <hr>
                              
                              <label for="name"><b>아이디</b></label>
                              <sec:input type="text" placeholder="아이디 등록" id="userid" path="" required></sec:input>
                             
                              <label for="password"><b>비밀번호</b></label>
                              <sec:input type="password" value="1" id="password" path="" required></sec:input>
                            
                          
                              <div class="clearfix">
                                <button type="button" class="cancelbtn">Cancel</button>
                                <button type="button" id="signin-btn" class="signupbtn">Sign In</button>
                              </div>
                            </div>
                          </sec:form>
                            
                    </div>
                </div>
            </div>
        </div>       
    </section>
    

    <section id="coming-soon-footer" class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="text-center">
                    <p>&copy; Your Company 2014. All Rights Reserved.</p>
                    <p>Designed by <a target="_blank" href="http://www.themeum.com">Themeum</a></p>
                </div>
            </div>
        </div>       
    </section>
    

    
