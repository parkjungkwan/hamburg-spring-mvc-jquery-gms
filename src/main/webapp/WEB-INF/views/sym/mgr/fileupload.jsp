<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<script>

$(function(){
	var csrfParameter = $('meta[name="_csrf_parameter"]').attr('content')
	var csrfHeader = $('meta[name="_csrf_header"]').attr('content')
	var csrfToken = $('meta[name="_csrf"]').attr('content')
	
	$('#fileForm').submit(function(e){
		e.preventDefault()
		const formData = new FormData($('#fileForm')[0])
		if(csrfToken && csrfHeader) {
	        $(document).ajaxSend(function(event, xhr, options) {
	            xhr.setRequestHeader(header, token);
	        });
	    }
		
		$.ajax({ 
			type: "POST", 
			enctype: 'multipart/form-data', // 필수 
			url: '${ctx}/fileupload/image', 
			data: formData, // 필수 
			processData: false, // 필수 
			contentType: false, // 필수 
			cache: false, 
			success: function (d) {
				alert('SUCCESS')
			}, 
			error:function(status, request, error){
	               alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	       }
			});
	})
})
</script>
<h1>파일업로드</h1>

<form id="fileForm" method="post" enctype="multipart/form-data"> 
	<input type="file" name="file"> 
	<input type="submit" value="파일업로드"/>
</form>


