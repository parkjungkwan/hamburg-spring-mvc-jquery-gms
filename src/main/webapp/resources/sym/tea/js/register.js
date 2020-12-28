/**
 * 
 */
$('#home').click(e => { location.href = '/'})
        $('#facebook').click(e => {location.href = '/transfer/sym/tea/index'})
        $('#signupbtn').click(e => {
            e.preventDefault()
            $.ajax({
                url: `/teachers`,
                type: 'POST',
                data: JSON.stringify({
                    name: $('#name').val(),
                    password: $('#password').val(),
                    subject: $('#subject').val()
                }),
                dataType: 'json',
                contentType: 'application/json',
                success: d => {
                   location.href='/transfer/sym/tea/index'
                },
                error: e => {
                    console.log(`교강사등록 실패: ${e.responseText}`)
                    location.href = '/move/cmm/404'
                }
            })
        })