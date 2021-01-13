var tea = tea || {}

tea.register = x => {
	$.ajax({
          url: `${x}/teachers`,
          type: 'POST',
          data: JSON.stringify({
              email: $('#email').val(),
              password: $('#password').val()
          }),
          dataType: 'json',
          contentType: 'application/json',
          success: d => {
             location.href='${x}/transfer/sym/tea/index'
          },
          error: e => {
              console.log(`교강사등록 실패: ${e.responseText}`)
              location.href = '/move/cmm/404'
          }
      })
}

tea.access = x => {
	$.ajax({
		url: `${x}/teachers/access`,
		type: `post`,
		data: JSON.stringify({teaNum: $(`#teaNum`).val(), password:$(`#password`).val()}),
		dataType: 'json',
		contentType: `application/json`,
		success: d => {
			alert(`접속 성공`)
			location.href = `${x}/tea/index`
		},
		error: e => {
			alert(`Fail`)
		}
	})
	
}
