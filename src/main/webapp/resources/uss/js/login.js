/**
 * 
 */
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