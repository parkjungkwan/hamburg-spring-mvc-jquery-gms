'use strict'
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$('.move-home').click(e => {location.href = '/'})
		$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {location.href = `${ctx}/`})
		
	}
	const goHome = () => {
		$(`#goHome`).click(e => {
			alert(`고홈 !! ${localStorage.getItem('ctx')}`)
			location.href = ` ${localStorage.getItem('ctx')}/`
		})
	}
	return {init, goHome}
})()
