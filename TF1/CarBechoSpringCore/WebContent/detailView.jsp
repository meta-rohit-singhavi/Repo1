<%@page import="com.carbecho.beans.Car"%>
<%@page import="com.carbecho.beans.CarVO"%>
<%@page import="com.carbecho.beans.VehicleVO"%>
<%@page import="java.util.List"%>
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
  <div class="container">
  <h2>Car Details</h2>
  <p>List of all available Car : </p>
  <table class="table">
    <thead>
      <tr>
        <th>Property</th>
        <th>Value</th>
      </tr>
    </thead>
    <tbody>
	<%
    	VehicleVO vehicleVO = (VehicleVO)(request.getAttribute("vehicleVO"));
     	CarVO carVO = (CarVO)(request.getAttribute("carVO"));
     	Car car = (Car)(request.getAttribute("car"));
   	%> 	
   	<tr>
        <td>Make</td>
        <td><%= vehicleVO.getMake() %></td>
    </tr>
    <tr>
        <td>Model</td>
        <td><%= vehicleVO.getModel() %></td>
     </tr>
    <tr>
        <td>EngineInCC</td>
        <td><%= vehicleVO.getEngineInCC() %></td>
     </tr>
    <tr>
        <td>Fuel Capacity</td>
        <td><%= vehicleVO.getFuelCapacity() %></td>
      </tr>
    <tr>
        <td>Mileage</td>
        <td><%= vehicleVO.getMileage() %></td>
     </tr>
    <tr>
        <td>Price</td>
        <td><%= vehicleVO.getPrice() %></td>
     </tr>
    <tr>
        <td>Road Tax</td>
        <td><%= vehicleVO.getRoadTax() %></td>
    </tr>
    <tr>
        <td>Created By</td>
        <td><%= car.getCreated_By() %></td>
    </tr>
    <tr>
        <td>Created Time</td>
        <td><%= car.getCreated_Time() %></td>
    </tr>
    <tr>
        <td>Updated By</td>
        <td><%= car.getUpdated_By() %></td>
    </tr>
    <tr>
        <td>Updated Time</td>
        <td><%= car.getUpdted_Time()%></td>
     </tr>
    <tr>
        <td>AC</td>
        <td><%=(carVO.isAc()==1?"Yes":"No") %></td>
     </tr>
    <tr>
        <td>Power Steering</td>
        <td><%=(carVO.isPowerSteering()==1?"Yes":"No") %></td>
     </tr>
    <tr>
        <td>Accessory Kit</td>
        <td><%=(carVO.isAccessoryKit()==1?"Yes":"No") %></td>
    </tr>
    </tbody>
  </table>
</div>

</body>
</html>