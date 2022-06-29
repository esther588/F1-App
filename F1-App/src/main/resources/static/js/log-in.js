console.clear();

const loginBtn = document.getElementById('login');
const signupBtn = document.getElementById('signup');

loginBtn.addEventListener('click', (e) => {
	let parent = e.target.parentNode.parentNode;
	Array.from(e.target.parentNode.parentNode.classList).find((element) => {
		if(element !== "slide-up") {
			parent.classList.add('slide-up')
		} else {
         	parent.classList.remove('slide-up')
   		}
	});
});

signupBtn.addEventListener('click', (e) => {
	location.assign("http://localhost:8080/sign-up");
});