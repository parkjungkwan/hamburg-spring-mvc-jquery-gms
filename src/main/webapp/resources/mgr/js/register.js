'use strict'
$('#home').click(e => { location.href = '/'})
        $('#facebook').click(e => {location.href = '/transfer/sym/mgr/index'})
        $('#signupbtn').click(e => {
            e.preventDefault()
            $.ajax({
                url: `/managers`,
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