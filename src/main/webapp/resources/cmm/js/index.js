'use strict'
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		$('.move-home').click(e => {location.href = '/'})
		$('#manager_register').click(e => { 
			alert(`매니저 클릭 `)
			location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {
			location.href = `${ctx}/home`
		})
		
	}
	
	return {init}
})()
