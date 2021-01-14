<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <style>
      html, body {
      min-height: 100%;
      padding: 0;
      margin: 0;
      font-family: Roboto, Arial, sans-serif;
      font-size: 14px;
      color: #666;
      }
      h1 {
      margin: 0 0 20px;
      font-weight: 400;
      color: #1c87c9;
      }
      p {
      margin: 0 0 5px;
      }
      .main-block {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      background: #1c87c9;
      }
      form {
      padding: 25px;
      margin: 25px;
      box-shadow: 0 2px 5px #f5f5f5; 
      background: #f5f5f5; 
      }
      .fas {
      margin: 25px 10px 0;
      font-size: 72px;
      color: #fff;
      }
      .fa-envelope {
      transform: rotate(-20deg);
      }
      .fa-at , .fa-mail-bulk{
      transform: rotate(10deg);
      }
      input, textarea {
      width: calc(100% - 18px);
      padding: 8px;
      margin-bottom: 20px;
      border: 1px solid #1c87c9;
      outline: none;
      }
      input::placeholder {
      color: #666;
      }
      button {
      width: 30%;
      padding: 10px;
      border: none;
      background: #1c87c9; 
      font-size: 8px;
      font-weight: 200;
      color: #fff;
      }
      button:hover {
      background: #2371a0;
      }    
      @media (min-width: 568px) {
      .main-block {
      flex-direction: row;
      }
      .left-part, form {
      width: 50%;
      }
      .fa-envelope {
      margin-top: 0;
      margin-left: 20%;
      }
      .fa-at {
      margin-top: -10%;
      margin-left: 65%;
      }
      .fa-mail-bulk {
      margin-top: 2%;
      margin-left: 28%;
      }
      }
    </style>
<section id="data-mgt">
    <table class="my-tab" id="mgr-tab">
    	<tr>
    		<th style="width: 30%">통계 자료</th><th id="result-form">성적 리스트</th>
    	</tr>
    	<tr>
    		<td> 
	    		<table>
	    			<tr>
	    				<td>jQuery 점수의 합</td><!-- p.204 -->
	    				<td>10000 점</td>
	    			</tr>
	    			<tr>
	    				<td>최고 점수</td><!-- p.172 -->
	    				<td>100 점</td>
	    			</tr>
	    			<tr>
	    				<td>최하 점수</td><!-- p.172 -->
	    				<td>0 점</td>
	    			</tr>
	    			<tr>
	    				<td>평균 점수</td>
	    				<td>50 점</td>
	    			</tr>
	    			<tr>
	    				<td>노월황이 시험을 치렀는가?</td><!-- p.180 -->
	    				<td></td>
	    			</tr>
	    			<tr>
	    				<td>학생들 수강과목 중복없이 나열</td><!-- p.179 -->	
	    				<td>....</td>
	    			</tr>
	    			<tr>
	    				<td>점수별 내림차순 정렬</td><!-- p.179 -->
	    				<td>....</td>
	    			</tr>
	    			<tr>
	    				<td>이름별 오름차순 정렬</td><!-- p.180 -->
	    				<td>....</td>
	    			</tr>
	    			<tr>
	    				<td>과목별 평균점수</td><!-- p.199 -->
	    				<td> 
	    				<table>
	    					<tr>
	    						<td>Java</td>
	    						<td></td>
	    					</tr>
	    					<tr>
	    						<td>Spring</td>
	    						<td></td>
	    					</tr>
	    					<tr>
	    						<td>Python</td>
	    						<td></td>
	    					</tr>
	    					<tr>
	    						<td>jQuery</td>
	    						<td></td>
	    					</tr>
	    					<tr>
	    						<td>eGovframe</td>
	    						<td></td>
	    					</tr>
	    				</table> 
	    				</td>
	    			</tr>
	    			
	    		</table>
    		</td>
    		<td>
    			<div id="mgr-data-mgt-stu"></div>
    		</td>
    	</tr>
    	
    </table>
    
</section>
<script>
tea.grade_mgmt({ctx: `${ctx}`, 
	pageSize: `10`, 
	pageNum: `1`,
	subNum: `4`,
	examDate: `2020-11-30`
	})

</script>





