<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<section id="data-mgt">
    <table class="my-tab" id="mgr-tab">
    	<tr>
    		<th>관리 항목</th><th>관리 내용</th>
    	</tr>
    	<tr>
    		<td>학 생</td>
    		<td>
	    		<button id="">빅데이터생성</button>
	    		<button>조회</button>
	    		<button>수정</button>
	    		<button>삭제</button>
	    		<button id="mgr-truncate-stu">전체삭제</button>
    		</td>
    	</tr>
    	<tr>
    		<td>교강사</td>
    		<td>
    			<button>빅데이터생성</button>
	    		<button>조회</button>
	    		<button>수정</button>
	    		<button>삭제</button>
	    		<button>전체삭제</button>
    		</td>
    	</tr>
    	<tr>
    		<td>사 원 </td>
    		<td>
    			<button>빅데이터생성</button>
	    		<button>조회</button>
	    		<button>수정</button>
	    		<button>삭제</button>
	    		<button>전체삭제</button>
    		</td>
    	</tr>
    </table>
</section>
<script>
$(`#mgr-truncate-stu`).click(function(e){
	e.preventDefault()
	$.getJSON(`${ctx}/`, function(d){
		alert(d)
	})
})
</script>





