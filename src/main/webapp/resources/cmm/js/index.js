/**
var map = new HashMap<>();
var cmm = cmm || {}
 */
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		alert(`>>`)
		$('.move-home').click(e => {location.href = '/'})
		$('#manager_register').click(e => { location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e => {
			location.href = `${ctx}/home`
		})
		
	}
	
	return {init}
})()
