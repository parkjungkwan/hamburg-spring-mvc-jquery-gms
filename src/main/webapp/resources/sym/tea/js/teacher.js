'use strict'


/*

const teaNum = localStorage.getItem(`searchTeacher`)
$.getJSON(`/teachers/${teaNum}`, d => {
	$(`#profileImage`).html(`<img src="${d.profileImage}" alt="${d.name}" class="img-fluid rounded-circle mb-2" width="128" height="128" />
							<h5 class="card-title mb-0">${d.name}</h5>
							<div class="text-muted mb-2">교사</div>

							<div>
								<a id="info-update" class="btn btn-primary btn-sm" href="#">정보수정</a>
								<a id="info-delete" class="btn btn-danger btn-sm" href="#"><span data-feather="message-square"></span> 정보삭제</a>
							</div>`)
	$(`#subject`).html(`<h5 class="h6 card-title">담당과목</h5>
							<span id="updateSubject"><a href="#" class="badge badge-primary mr-1 my-1">${d.subject}</a></span>
							`)
						
	$(`#about`).html(`<h5 class="h6 card-title">About</h5>
							<ul class="list-unstyled mb-0">
								<li class="mb-1"><span data-feather="home" class="feather-sm mr-1"></span> 교강사번호 : <a href="#">${d.teaNum}</a></li>

								<li id="updateEmail"  class="mb-1"><span data-feather="briefcase" class="feather-sm mr-1"></span> 이메일 : <a href="#">${d.email}</a></li>
								<li id="updateAddr" class="mb-1"><span data-feather="map-pin" class="feather-sm mr-1"></span> 주소 : <a href="#">서울</a></li>
							</ul>`)

	$(`#info-update`).click(e => {
		$(`#updateSubject`).html(`<input id="changeSubject" type="text" value="${d.subject}" placeholder="${d.subject}">`)
		$(`#updateEmail`).html(`<span data-feather="briefcase" class="feather-sm mr-1"></span> 이메일 : <input id="changeEmail" type="text" value="${d.email}"  placeholder="${d.email}">`)
		$(`#updateAddr`).html(`<span data-feather="map-pin" class="feather-sm mr-1"></span> 주소 : <input type="text" placeholder="서울"><br/>
		<button id="updateConfirm"> 수정확인 </button><button id="updateCancel"> 수정취소 </button>`)
		$(`#updateConfirm`).click(e => {
			alert(`수정확인`)
			$.ajax({
				url: `/teachers`,
				type: `PUT`,
				data: JSON.stringify({
					teaNum: d.teaNum,
					subject: $(`#changeSubject`).val(),
					email: $(`#changeEmail`).val()

				}),
				dataType: `json`,
				contentType: `application/json`,
				success: d2 => {
					if(d2.message === 'SUCCESS'){
						location.href= `/transfer/sym/tea/teacher`
						// 현재 나의 위치로 다시 부르는 것: 재귀호출
					}else{
						alert(`수정에 실패했습니다.`)
						location.href= `/transfer/sym/tea/teacher`
					}
				},
				error: e => { alert(`수정오류`)}
			})
		})
	})
	$(`#info-delete`).click(e => {
		$.ajax({
			url: `/teachers`,
			type: `DELETE`,
			data: JSON.stringify({
				teaNum: d.teaNum
			}),
			dataType: `json`,
			contentType: `application/json`,
			success: d2 => {
				if(d2.message === 'SUCCESS'){
					location.href = `/transfer/sym/mgr/index`
				}else{
					alert(`삭제 실패`)
				}
			},
			error: e => {
				alert(`AJAX 삭제 실패`)
				
			}
		})
	})						 
}) // getJSON 의 scope


*/
