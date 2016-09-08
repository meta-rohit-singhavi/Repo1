$(document).ready(init);

function init(){
	
	$('button#foldButton').click(defineFolding);
}

function defineFolding(){
	
	var oriDomi = new OriDomi('div#myDiv');
	oriDomi.setRipple(10).curl(50).collapse().setSpeed(2000).foldUp().stairs(10);

}