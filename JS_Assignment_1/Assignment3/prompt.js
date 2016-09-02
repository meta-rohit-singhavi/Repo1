function fnAddTen() {
	var num;
	
	while(isNaN(num)) {
	num = prompt("Enter no");
	}
	
	num = parseInt(num)+10;
	document.getElementById('result').innerHTML = "Result is = "+num;
	
}