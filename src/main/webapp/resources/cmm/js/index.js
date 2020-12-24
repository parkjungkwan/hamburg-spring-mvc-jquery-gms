'use strict'
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => {location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		$(`#stu-join`).click(e => {location.href = `${ctx}/user/register`})
		$(`#stu-login`).click(e => {location.href = `${ctx}/user/login`})
		$(`#blog_default`).click(e => {location.href = `${ctx}/content/bbs/index`})
		
	}
	const goHome = () => {
		$(`#goHome`).click(e => {location.href = ` ${localStorage.getItem('ctx')}/`})
	}
	return {init, goHome}
})()
