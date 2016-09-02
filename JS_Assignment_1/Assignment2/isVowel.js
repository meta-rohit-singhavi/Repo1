
function getType() {
	var ch = document.getElementById('ch').value;
	
	switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			document.getElementById('result').innerHTML = "Vowel ";
			break;
			
		default:
			document.getElementById('result').innerHTML = "Consonant ";
			break;
	}
	
}