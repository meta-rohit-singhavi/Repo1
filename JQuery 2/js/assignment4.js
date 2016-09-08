$(document).ready(function(){
    $("#name").change(fnShowName);
    $("#age").change(fnShowAge);
    $("#address").change(fnShowAddress);
});

function fnShowName() {
    var ans = $('#name').val();
	 $('#name').animate({backgroundColor: "#ddffdd"}, 500);
    $('#result').append("Name : " + ans+"<br/>");
    $('#name').animate({backgroundColor: "white"}, 700);
}

function fnShowAge() {
    var ans = $('#age').val();
	$('#age').animate({backgroundColor: "#ddffdd"}, 500);
    $('#result').append("Age : " +ans+"<br/>");
    $('#age').animate({backgroundColor: "white"}, 700);
}

function fnShowAddress() {
    var ans = $('#address').val();
	$('#address').animate({backgroundColor: "#ddffdd"}, 500);
    $('#result').append("Address : " +ans+"<br/>");
    $('#address').animate({backgroundColor: "white"}, 700);
}
