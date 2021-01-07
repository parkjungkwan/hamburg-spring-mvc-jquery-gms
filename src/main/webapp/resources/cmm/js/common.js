'use strict'
var common = common || {}
common = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$('#home').click(e => { location.href = '/'})
		//$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		//$('#teacher_register').click(e => {location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		$(`#stu-join`).click(e => {location.href = `${ctx}/user/register`})
		$(`#stu-login`).click(e => {location.href = `${ctx}/user/login`})
		$(`#blog_default`).click(e => {location.href = `${ctx}/content/bbs/index`})
		$(`#icon1`).html(`<img src="https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="">`)
		$(`#icon2`).html(`<img src="http://lavinephotography.com.au/wp-content/uploads/2017/01/PROFILE-Photography-112.jpg" alt="">`)
		$(`#icon3`).html(`<img src="http://lavinephotography.com.au/wp-content/uploads/2017/01/PROFILE-Photography-107.jpg" alt="">`)
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`화상강의솔루션, 스카이프 등을 이용하여 필리핀등 원어민 강사와 \n
							한국 학생간에 회화 교육을 하는 사이트 구축.`)
		$('#facebook').click(e => {location.href = '/transfer/sym/tea/index'})
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="bbs-ul" role="menu" class="sub-menu"></ul>`)
		let bbs_arr = [{id:'write', val: '글쓰기'}, {id:'search', val: '조회'},{id:'c', val: 'c'},{id:'d', val: 'd'},{id:'e', val: 'c'}]
		$.each(bbs_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#bbs-ul`)
			.click(e => {
				alert(`${j.id}`)
			})
		})
		let mgr_arr = [{id:'sigin-up', val: '관리자등록', url:'/admin/mgr/register'}, 
		{id:'sign-in', val: '관리자접속', url: `${ctx}/admin/mgr/access`},
		{id:'c', val: 'c'},
		{id:'d', val: 'd'},
		{id:'e', val: 'c'}]
		$('#manager').html(`<a href="#">관리자<i class="fa fa-angle-down"></i></a>
						<ul id="mgr-ul" role="menu" class="sub-menu"></ul>`)
		
		$.each(mgr_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#mgr-ul`)
			.click(e => {
				location.href = j.url
			})
		})
		let tea_arr = [{id:'sigin-up', val: '교강사등록', url: '/admin/tea/register'}, 
		{id:'sign-in', val: '교강사접속', url: `${ctx}/admin/tea/access`},
		{id:'c', val: 'c'},
		{id:'d', val: 'd'},
		{id:'e', val: 'c'}]
		$('#teacher').html(`<a href="#">교강사<i class="fa fa-angle-down"></i></a>
						<ul id="tea-ul" role="menu" class="sub-menu"></ul>`)
		
		$.each(tea_arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#tea-ul`)
			.click(e => {
				location.href = j.url
			})
		})
		
		
	
	}
	const goHome = () => {
		$(`#goHome`).click(e => {
			location.href = ` ${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()











