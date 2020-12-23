/**
var map = new HashMap<>();
var cmm = cmm || {}
 */
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		alert(`>>`)
		$('.move-home').click(e => {location.href = '/'})
		$('#manager_register').click(e => { location.href = `${ctx}/transfer/mgr/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/transfer/sym/tea/register`})
		$(`#linkedin`).click(e => {
			location.href = `${ctx}/home`
		})
		
	}
	
	return {init}
})()
