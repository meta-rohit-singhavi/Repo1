function fnToggleClick() {
	var data = document.getElementById('data').style.display;
	if(data!="none") {
		fnHide();
	}
	else {
		fnShow();
	}
}

function fnSetBtn() {
	var data = document.getElementById('data').style.display;
	if(data!="none") {
		document.getElementById("toggle").innerHTML = "Hide";
	}
	else {
		document.getElementById("toggle").innerHTML = "Show";
	}	
}

function fnHide() {
	document.getElementById("data").style.display = "none";
	fnSetBtn();
}

function fnShow() {
	document.getElementById("data").style.display = "";
	fnSetBtn();
}