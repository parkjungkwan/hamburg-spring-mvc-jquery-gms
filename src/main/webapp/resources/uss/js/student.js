'use strict'





const userid = localStorage.getItem('searchId')
$.getJSON(`/students/${userid}`, d => {
	$('#profileImage').html(`<img src="${d.profileImage}" alt="${d.name}" class="img-fluid rounded-circle mb-2" width="128" height="128" />
							<h5 class="card-title mb-0">${d.name}</h5>
							<div class="text-muted mb-2">Lead Developer</div>

							<div>
								<a class="btn btn-primary btn-sm" href="#">Follow</a>
								<a class="btn btn-primary btn-sm" href="#"><span data-feather="message-square"></span> Message</a>
							</div>`)		
	$(`#subject`).html(`<h5 class="h6 card-title">수강과목</h5>
							<a href="#" class="badge badge-primary mr-1 my-1">${d.subject}</a>
							`)
							//stuNum, userid, password, name, ssn, regDate, subject, profileImage
	$(`#about`).html(`<h5 class="h6 card-title">About</h5>
							<ul class="list-unstyled mb-0">
								<li class="mb-1"><span data-feather="home" class="feather-sm mr-1"></span> 학생번호 : <a href="#">${d.stuNum}</a></li>

								<li class="mb-1"><span data-feather="briefcase" class="feather-sm mr-1"></span> 생년월일 : <a href="#">${d.ssn}</a></li>
								<li class="mb-1"><span data-feather="map-pin" class="feather-sm mr-1"></span> 주소 : <a href="#">서울</a></li>
							</ul>`)
})

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

const userid = sessionStorage.getItem('userid')
		$.getJSON(`/students/${userid}`, d => {
			$('#profileImage').html(`<img src="${d.profileImage}" alt="${d.name}" class="img-fluid rounded-circle mb-2" width="128" height="128" />
									<h5 class="card-title mb-0">${d.name}</h5>
									<div class="text-muted mb-2">Lead Developer</div>

									<div>
										<a class="btn btn-primary btn-sm" href="#">Follow</a>
										<a class="btn btn-primary btn-sm" href="#"><span data-feather="message-square"></span> Message</a>
									</div>`)		
			$(`#subject`).html(`<h5 class="h6 card-title">수강과목</h5>
									<a href="#" class="badge badge-primary mr-1 my-1">${d.subject}</a>
									`)
									//stuNum, userid, password, name, ssn, regDate, subject, profileImage
			$(`#about`).html(`<h5 class="h6 card-title">About</h5>
									<ul class="list-unstyled mb-0">
										<li class="mb-1"><span data-feather="home" class="feather-sm mr-1"></span> 학생번호 : <a href="#">${d.stuNum}</a></li>

										<li class="mb-1"><span data-feather="briefcase" class="feather-sm mr-1"></span> 생년월일 : <a href="#">${d.ssn}</a></li>
										<li class="mb-1"><span data-feather="map-pin" class="feather-sm mr-1"></span> 주소 : <a href="#">서울</a></li>
									</ul>`)
		})