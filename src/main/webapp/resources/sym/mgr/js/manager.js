'use strict'
var manager = manager || {}
manager = (()=>{
	let _
	const init = ctx =>{
		_ = ctx
		siginup()
		login()
	}
	const siginup =()=>{
		$('#signupbtn').click(e => {
            e.preventDefault()
            $.ajax({
                url: `${_}/managers`,
                type: 'POST',
                data: JSON.stringify({
                    email: $('#email').val(),
                    password: $('#password').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: d => {
                   location.href='/transfer/sym/mgr/index'
                },
                error: e => {
                    console.log(`관리자등록 실패: ${e.responseText}`)
                    location.href = '/move/cmm/404'
                }
            })
        })
	}
	const login = () => {
			$(`#mgr-access-btn`).click(function(e){
				alert(`${_}`)
				e.preventDefault()
				$.ajax({
					url: `${_}/managers/access`,
					type: `post`,
					data: JSON.stringify({email: $(`#uid`).val(), password:$(`#pwd`).val()}),
					dataType: 'json',
					contentType: 'application/json',
					success: function(d){
						alert(d)
					},
					error: function(e){
						alert(`Fail`)
					}
				})
		})
	}
	return {init}
})()



//$('#home').click(e => { location.href = '/'})
//$('#facebook').click(e => {location.href = '/transfer/sym/mgr/index'})
        