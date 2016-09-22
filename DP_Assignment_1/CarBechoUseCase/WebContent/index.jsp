<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarBecho</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="myStyle.css">
</head>


<body>
<%@include file="header.jsp" %>

<header>
<section id="header">
    <h4>Add Car!!!</h4>
</section>
    <section id="contact-form">
        <form method="post" action="CarFacade" >
        <div class="line">
            <div class="lab"><label>User Name</label></div>
            <span><i class="fa fa-user" aria-hidden="true"></i></span>
                <input type="text"  placeholder="User Name" id="createdBy" pattern="[a-zA-Z]{3,15}" required></div>




            <div class="line">
                <div class="lab"><label>Made By</label></div>
               <span><i class="fa fa-user" aria-hidden="true"></i></span>
                    <input type="text"  id="make" placeholder="Made By" pattern="[a-zA-Z]{3,15}" required></div>


            <div class="line">
                <div class="lab"><label>Model</label></div>
                <span><i class="fa fa-envelope" aria-hidden="true"></i></span>
                <input type="text"  id="model" placeholder="Model" pattern="[a-zA-Z]{3,15}" required></div>


            <div class="line">
                <div class="lab"><label>Engine (In CC)</label></div>
                <span><i class="fa fa-phone" aria-hidden="true"></i></span>
                <input type="number" id="engineInCC" step="0.01" placeholder="engine in cc"  required></div>
                
            <div class="line">
                <div class="lab"><label>Mileage</label></div>
                <span><i class="fa fa-phone" aria-hidden="true"></i></span>
                <input type="number" id="mileage" step="0.01" placeholder="mileage"  required></div>
                
            <div class="line">
                <div class="lab"><label>Fuel Capacity</label></div>
                <span><i class="fa fa-phone" aria-hidden="true"></i></span>
                <input type="number" id="fuelCapacity" step="0.01" placeholder="fuel capacity"  required></div>


           <div class="line">
                <div class="lab"><label>Price</label></div>
                <span><i class="fa fa-phone" aria-hidden="true"></i></span>
                <input type="number" id="price" step="0.01" placeholder="price"  required></div>

            

            <div class="line">
                <div class="lab"><label>AC</label></div>
                <input class="rb" type="radio" name="acValue" value="1" checked>Yes<br>
                <input class="rb" type="radio" name="acValue" value="0" value="false">No
            </div>

			 <div class="line">
                <div class="lab"><label>Power Steering</label></div>
                <input class="rb" type="radio" name="pstr" value="1" checked>Yes<br>
                <input class="rb" type="radio" name="pstr" value="0">No
            </div>
			
			 <div class="line">
                <div class="lab"><label>Accessory Kit</label></div>
                <input class="rb" type="radio" name="kit" value="1" checked>Yes<br>
                <input class="rb" type="radio" name="kit" value="0">No
            </div>
            
            
            <center><button type="submit">Send <span><i class="fa fa-paper-plane-o" aria-hidden="true"></i></span></button>
                </center>
        </form>
    </section>

</header>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>