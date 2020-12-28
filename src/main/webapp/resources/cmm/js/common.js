'use strict'
var common = common || {}
common = (()=>{
	const init = ctx => {
		alert(`TEST 15:15`)
		localStorage.setItem('ctx', ctx)
		$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => {location.href = `${ctx}/admin/tea/register`})
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
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="ul" role="menu" class="sub-menu"></ul>`)
		let arr = [{id:'a', val: 'a'}, {id:'b', val: 'b'},{id:'c', val: 'c'},{id:'d', val: 'd'},{id:'e', val: 'c'}]
		$.each(arr, (i, j) => {
			$(`<li/>`)
			.attr({id: `${j.id}`})
			.text(`${j.val}`)
			.appendTo(`#ul`)
			.click(e => {
				alert(`${j.id}`)
			})
		})
	}
	const goHome = () => {
		$(`#goHome`).click(e => {location.href = ` ${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()












