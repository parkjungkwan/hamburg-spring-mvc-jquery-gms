var mgr = mgr || {}
mgr.count = x => {$(`#stu-count`).text(x)}
mgr.list = x => {
	$(`<h3/>`)
	.attr({id: `title`})
	.text(`학생목록`)
	.appendTo(`#mgr-data-mgt-stu`)
	$(`<table/>`)
	.attr({id: `tab`})
	.css({width: `100%`})
	.appendTo(`#title`) 
	$(`<tr/>`).attr({id: `tr_1`}).appendTo(`#tab`)
	const arr = [`No`,`아이디`,`이름`,`생년월일`,`성별`,`등록일`,`전공과목`]
	$.each(arr, function(i,j){
		$(`<th>${j}</th>`).css({backgroundColor: `gray`})
		.appendTo(`#tr_1`)
	})
	$.each(x, function(i, j){
		$(`<tr><td>${j.stuNum}</td>
	   	    		<td>${j.userid}</td>
	   	    		<td>${j.name}</td>
					<td>${j.birthday}</td>
					<td>${j.gender}</td>
					<td>${j.regDate}</td>
					<td>${j.subject}</td></tr>`)
					.css({padding: `15px`, textAlign: `left`, fontSize: `medium`})
					.appendTo(`#tab`)
	})
	
	
	
}
/*
<style>
.sub-table {
  width:100%;
}
.sub-table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
.sub-table th, td {
  padding: 15px;
  text-align: left;
}
.sub-table#t01 tr:nth-child(even) {
  background-color: #eee;
}
.sub-table#t01 tr:nth-child(odd) {
 background-color: #fff;
}
.sub-table#t01 th {
  background-color: black;
  color: white;
}
</style>*/