window.addEventListener("DOMContentLoaded", function(){
	
	let btnEl = document.getElementById("btn");
	let navEl = document.getElementById("slide_menu");
	
	btnEl.addEventListener("click", function(){
		
		navEl.classList.toggle('dn');
			
	});
	
});