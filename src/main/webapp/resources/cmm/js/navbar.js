var navbar = navbar || {}
navbar = (()=>{
	const init = () => {
		alert(`aa`)
		$(`#bbs`).html(`<a href="#">게시판<i class="fa fa-angle-down"></i></a>
						<ul id="ul" role="menu" class="sub-menu"></ul>`)
		let arr = [{id:'a', val: 'a'}, {id:'b', val: 'b'},{id:'c', val: 'c'}]
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
	return {init}
})()

