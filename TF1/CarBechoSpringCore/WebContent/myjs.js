/**
 * 
 */

$(document).ready(function(){
	
	$('.nav.navbar-nav > li').on('click', function(e) {
	    $('.nav.navbar-nav > li').removeClass('active');
	    $(this).addClass('active');
	}); 
});