$(document).ready(function(){

	$('span.message').css('background-color','#aba');
	$('div.box').first().css('background-color','#abc');
	$('button').css('background-color','#fca');
	$('img[alt= "hello"]').css('width','40%');
	$('#myDiv input[type="text"]').css('background-color','black');
	$('input[name^=txt]').css('background-color','yellow');
	$('p:not(.box)').css('background-color','teal');
	$('div.box, div.error').css('color','red');
	$('div.box.error').css('color','blue');
	$('#myDiv span.info').css('background-color','green');
})
