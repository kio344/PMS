window.addEventListener("DOMContentLoaded", function() {

	let dupBtnEl = document.getElementById('dupBtn');
	let joinBtnEl = document.getElementById("joinBtn");
		
	dupBtnEl.addEventListener('click', function() {
		let formData = new FormData();
		let memId = document.getElementById('memId');
		formData.append('memId', memId.value);

		axios.post('http://localhost:3000/dup', formData)
			.then(function(response) {
				/** 사용 가능한 아이디일 때  */
				if (memId.value === '' || memId.value.length < 3 || memId.value.length > 12) {
					alert('아이디가 너무 짧거나 깁니다.');
				} else if(response.data === '중복된 아이디 입니다!'){
					alert(response.data);
				}else {
					alert(response.data);
					joinBtnEl.classList.toggle("dn");
					dupBtnEl.classList.toggle('dn');
				}

			})
			.catch(function(err) {
				/** 중복된 아이디일 때 */
				alert(err);
			})
	})
})