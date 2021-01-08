var mgr = mgr || {}
mgr.count = x => {$(`#stu-count`).text(x)}
mgr.list = x => {
	let str = '<h3>학생 목록 </h3>'
	$.each(x, function(i, j){
		str += `<table><tr>
	   	    		<td>${j.stuNum}</td>
	   	    		<td>${j.userid}</td>
	   	    		<td>${j.name}</td>
					<td>${j.birthday}</td>
					<td>${j.gender}</td>
					<td>${j.regDate}</td>
					<td>${j.subject}</td></tr></table>`
	})
	$(str).appendTo(`#mgr-data-mgt-stu`) 
}

