<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Coming Soon | Triangle</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet"> 
    <link href="/resources/css/main.css" rel="stylesheet">
    <link href="/resources/css/responsive.css" rel="stylesheet">

    <!--[if lt IE 9]>
        <script src="/resources/js/html5shiv.js"></script>
        <script src="/resources/js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="/resources/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/images/ico/apple-touch-icon-57-precomposed.png">
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}
        
        /* Full-width input fields */
        input[type=text], input[type=password] {
          width: 100%;
          padding: 15px;
          margin: 5px 0 22px 0;
          display: inline-block;
          border: none;
          background: #f1f1f1;
        }
        
        input[type=text]:focus, input[type=password]:focus {
          background-color: #ddd;
          outline: none;
        }
        
        hr {
          border: 1px solid #f1f1f1;
          margin-bottom: 25px;
        }
        
        /* Set a style for all buttons */
        button {
          background-color: #4CAF50;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          cursor: pointer;
          width: 100%;
          opacity: 0.9;
        }
        
        button:hover {
          opacity:1;
        }
        
        /* Extra styles for the cancel button */
        .cancelbtn {
          padding: 14px 20px;
          background-color: #f44336;
        }
        
        /* Float cancel and signup buttons and add an equal width */
        .cancelbtn, .signupbtn {
          float: left;
          width: 50%;
        }
        
        /* Add padding to container elements */
        .container {
          padding: 16px;
        }
        
        /* Clear floats */
        .clearfix::after {
          content: "";
          clear: both;
          display: table;
        }
        
        /* Change styles for cancel button and signup button on extra small screens */
        @media screen and (max-width: 300px) {
          .cancelbtn, .signupbtn {
             width: 100%;
          }
        }
    </style>
</head><!--/head-->

<body>
    <div class="logo-image">                                
       <a id="home" href="#"><img class="img-responsive" src="/resources/images/logo.png" alt=""> </a> 
    </div>
     <section id="coming-soon">        
         <div class="container">
            <div class="row">
                
                <div class="col-sm-12">
                    <h1>학습자 로그인 화면</h1>
                    <div class="time-count">
                        <form style="border:1px solid #ccc">
                            <div class="container">
                              
                              <hr>
                              
                              <label for="name"><b>아이디</b></label>
                              <input type="text" placeholder="아이디 등록" id="userid" required>
                             
                              <label for="password"><b>비밀번호</b></label>
                              <input type="password" value="1" id="password" required>
                            
                          
                              <div class="clearfix">
                                <button type="button" class="cancelbtn">Cancel</button>
                                <button type="button" id="signin-btn" class="signupbtn">Sign In</button>
                              </div>
                            </div>
                          </form>
                            
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
    

    <script type="text/javascript" src="/resources/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/resources/js/wow.min.js"></script>
    <script type="text/javascript" src="/resources/js/coundown-timer.js"></script>
    <script type="text/javascript" src="/resources/js/main.js"></script>
    <script>
        $('#home').click(e => { location.href = '/'})
        $('#signin-btn').click(e => {
            e.preventDefault()
            $.ajax({
                url: '/students/login',
                type: 'POST',
                data: JSON.stringify({
                    userid: $('#userid').val(),
                    password: $('#password').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: d => {
                    if(d.message === 'SUCCESS'){
                        sessionStorage.setItem('userid', d.sessionUser.userid)
                        location.href = '/move/uss/profile'
                    }else{
                        alert('로그인 실패, 다시 시도해 주세요')
                        location.href = '/move/uss/login'
                    }
                    
                    
                },
                error: e => {
                    console.log(`학습자 로그인 실패: ${e.responseText}`)
                    location.href = '/move/cmm/404'
                }
            })
        })
        
    </script>
    
</body>
</html>