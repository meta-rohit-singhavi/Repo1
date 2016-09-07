
function fnHide() {
	$('#data').hide();
	fnSetBtn();
}

function fnShow() {
	$('#data').show();
	fnSetBtn();
}

$(document).ready(function(){
	fnSetBtn();
	$('#toggle').click(fnToggle);
	$('#show').click(fnShow);
	$('#hide').click(fnHide);
});

function fnToggle() {
	$('#data').toggle();
	fnSetBtn();
}

function fnSetBtn() {
	if($('#data').css('display')!="none") {
		$('#toggle').html("Hide");
	}
	else {
		$('#toggle').html("Show");
	}
}
