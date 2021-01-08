var mgr = mgr || {}
mgr.access = x => {
	$.ajax({
		url: `${x}/managers/access`,
		type: `post`,
		data: JSON.stringify({email: $(`#uid`).val(), password:$(`#pwd`).val()}),
		dataType: 'json',
		contentType: 'application/json',
		success: d => {
			location.href = `${x}/mgr/index`
		},
		error: e => {
			alert(`Fail`)
		}
	})
}
