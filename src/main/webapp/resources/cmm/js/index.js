/**
 * 
 */
$('.move-home').click(e => {location.href = '/'})
$('#manager_register').click(e => { location.href = '<%=application.getContextPath()%>/transfer/sym/mgr/register'})
$('#teacher_register').click(e => { location.href = '/transfer/sym/tea/register'})