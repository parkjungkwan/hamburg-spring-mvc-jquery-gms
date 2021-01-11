<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<section id="data-mgt">
    <table class="my-tab" id="mgr-tab">
    	<tr>
    		<th style="width: 30%">관리 항목</th><th>조회결과</th>
    	</tr>
    	<tr>
    		<td>학 생 (총 <span id="stu-count"></span> 명) <br/><br/>
    			<input type="text" id="stu-data-count"/><button id="mgr-insert-many-stu">생성</button><br/><br/>
	    		<input type="radio" name="stu-data-gender" value="M" checked="checked"/>남성
	    		<input type="radio" name="stu-data-gender" value="F" style="margin-left:20px"/>여성<button style="margin-left:38px">성별조회</button><br/><br/>
	    		<input type="text" id="stu-data-update"/><button>수정</button><br/><br/>
	    		<input type="text" id="stu-data-delete"/><button>삭제</button><br/><br/>
	    		<button id="mgr-truncate-stu">전체삭제</button>
    		
    		</td>
    		<td>
    			<div id="mgr-data-mgt-stu"></div>
    		</td>
    	</tr>
    	<tr>
    		<td>교강사
    		
    			<input type="text" id="tea-data-count"/>
    			<button id="mgr-insert-many-tea">건의 더미 데이터생성</button>
	    		<button>조회</button>
	    		<button>수정</button>
	    		<button>삭제</button>
	    		<button>전체삭제</button>
    		</td>
    		<td>
	    		<div id="mgr-data-mgt-tea"></div>
    		</td>
    	</tr>
    	<tr>
    		<td>사 원 
    			<button>조회</button>
	    		<button>수정</button>
	    		<button>삭제</button>
	    		<button>전체삭제</button>
    		
    		</td>
    		<td>
	    		<div id="mgr-data-mgt-emp"></div>
    		</td>
    	</tr>
    </table>
    
</section>
<script>
stu.count(`${ctx}`)
stu.list({ctx: `${ctx}`, pageSize: `10`, pageNum: `1`})
$(`#mgr-truncate-stu`).click(function(){stu.truncate(`${ctx}`)})
$(`#mgr-insert-many-stu`).click(function(){ stu.insertMany(`${ctx}`)})
</script>





