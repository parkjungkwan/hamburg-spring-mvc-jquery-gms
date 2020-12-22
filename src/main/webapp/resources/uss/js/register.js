/**
 * 
 */
 $('#home').click(e => { location.href = '/'})
        $('#facebook').click(e => {location.href = '/transfer/sym/tea/index'})
        $('#signupbtn').click(e => {
            e.preventDefault()
            $.ajax({
                url: `/students`,
                type: 'POST',
                data: JSON.stringify({
                    userid: $('#userid').val(), 
                    ssn: $('#ssn').val(), 
                    regDate: $('#regDate').val(), 
                    subject: $('#subject').val(), 
                    name: $('#name').val(),
                    password: $('#password').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: d => {
                   location.href='/move/uss/login'
                },
                error: e => {
                    console.log(`학습자등록 실패: ${e.responseText}`)
                    location.href = '/move/cmm/404'
                }
            })
        })