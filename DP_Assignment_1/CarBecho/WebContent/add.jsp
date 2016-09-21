<%@page import="Beans.Car"%>
<%@page import="Beans.CarVO"%>
<%@page import="Beans.VehicleVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarBecho</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="myStyle.css">
</head>


<body>
	<%@include file="header.jsp"%>

	<header>
		<section id="header">
			<h4><%if (((String) request.getAttribute("job")).equals("update")) {%>Update Car Details !!!<%}else {%>Add New Car!!!<%} %></h4>
		</section>
		<section id="contact-form">
			<%
				VehicleVO vehicleVO = null;
				CarVO carVO = null;
				Car car = null;

				if (((String) request.getAttribute("job")).trim().equals("update")) {
					vehicleVO = (VehicleVO) (request.getAttribute("vehicleVO"));
					carVO = (CarVO) (request.getAttribute("carVO"));
					car = (Car) (request.getAttribute("car"));
				%>
				
				<%
				}
			%>
			<form action="CarFacade"  method="post" >
				
				<div class="line">
					<div class="lab">
						<label>User Name</label>
					</div>
					<span><i class="fa fa-user" aria-hidden="true"></i></span> <input
						type="text" placeholder="User Name" name="createdBy"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {%><%=car.getCreated_By()%><%}%>"
						pattern="[a-zA-Z]{3,15}"
						<%if (((String) request.getAttribute("job")).equals("update")) {%>
						disabled <%}%> required>
				</div>


				<%
					if (((String) request.getAttribute("job")).equals("update")) {
				%>
				<div class="line">
					<div class="lab">
						<label>Updated User</label>
					</div>
					<span><i class="fa fa-user" aria-hidden="true"></i></span> <input
						type="text" placeholder="Updated User Name" name="updatedBy"
						value="<%if (car.getUpdated_By() != null) {%><%=car.getUpdated_By()%><%} else {%><%}%>"
						pattern="[a-zA-Z]{3,15}" required>
				</div>
				<%
					}
				%>

				<div class="line">
					<div class="lab">
						<label>Made By</label>
					</div>
					<span><i class="fa fa-user" aria-hidden="true"></i></span> <input
						type="text" name="make" placeholder="Made By"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (!vehicleVO.getMake().trim().isEmpty()) {%><%=vehicleVO.getMake().trim()%><%}
			}%>"
						pattern="[a-zA-Z]{3,15}" required>
				</div>


				<div class="line">
					<div class="lab">
						<label>Model</label>
					</div>
					<span><i class="fa fa-envelope" aria-hidden="true"></i></span> <input
						type="text" name="model" placeholder="Model"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (!vehicleVO.getModel().trim().isEmpty()) {%><%=vehicleVO.getModel().trim()%><%}
			}%>"
						pattern="[a-zA-Z]{3,15}" required>
				</div>


				<div class="line">
					<div class="lab">
						<label>Engine (In CC)</label>
					</div>
					<span><i class="fa fa-phone" aria-hidden="true"></i></span> <input
						type="text" name="engineInCC"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (vehicleVO.getEngineInCC() != -1) {%><%=vehicleVO.getEngineInCC()%><%}
			}%>"
						placeholder="engine in cc" required>
				</div>

				<div class="line">
					<div class="lab">
						<label>Mileage</label>
					</div>
					<span><i class="fa fa-phone" aria-hidden="true"></i></span> <input
						type="number" name="mileage" step="0.01"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (vehicleVO.getMileage() != -1) {%><%=vehicleVO.getMileage()%><%}
			}%>"
						placeholder="mileage" required>
				</div>

				<div class="line">
					<div class="lab">
						<label>Fuel Capacity</label>
					</div>
					<span><i class="fa fa-phone" aria-hidden="true"></i></span> <input
						type="number" name="fuelCapacity" step="0.01"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (vehicleVO.getFuelCapacity() != -1) {%><%=vehicleVO.getFuelCapacity()%><%}
			}%>"
						placeholder="fuel capacity" required>
				</div>


				<div class="line">
					<div class="lab">
						<label>Price</label>
					</div>
					<span><i class="fa fa-phone" aria-hidden="true"></i></span> <input
						type="number" name="price" step="0.01"
						value="<%if (((String) request.getAttribute("job")).equals("update")) {
				if (vehicleVO.getPrice() != -1) {%><%=vehicleVO.getPrice()%><%}
			}%>"
						placeholder="price" required>
				</div>



				<div class="line">
					<div class="lab">
						<label>AC</label>
					</div>

					<input class="rb" type="radio" name="acValue" value="1"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 1) {%>
						checked <%}
			}%> required>Yes<br> <input class="rb"
						type="radio" name="acValue" value="0"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 0) {%>
						checked <%}
			}%> required>No
				</div>

				<div class="line">
					<div class="lab">
						<label>Power Steering</label>
					</div>
					<input class="rb" type="radio" name="pstr" value="1"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 1) {%>
						checked <%}
			}%> required>Yes<br> <input class="rb"
						type="radio" name="pstr" value="0"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 0) {%>
						checked <%}
			}%> required>No
				</div>

				<div class="line">
					<div class="lab">
						<label>Accessory Kit</label>
					</div>
					<input class="rb" type="radio" name="kit" value="1"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 1) {%>
						checked <%}
			}%> required>Yes<br> <input class="rb"
						type="radio" name="kit" value="0"
						<%if (((String) request.getAttribute("job")).equals("update")) {
				if (carVO.isAc() == 0) {%>
						checked <%}
			}%> required>No
				</div>
			<%if (((String) request.getAttribute("job")).equals("update")) {%><input type="hidden" name="job" value="update"><input type="hidden" name="vehicle_ID" value="<%=carVO.getVehicleVO_ID()%>"><%}else {%><input type="hidden" name="job" value="add"><%} %>
			
				<center>
					<button type="submit" class="btn btn-primary">
						<%if (((String) request.getAttribute("job")).equals("update")) {%>Update<%}else {%>Add<%} %> <span><i class="fa fa-paper-plane-o"
							aria-hidden="true"></i></span>
					</button>
				</center>
			</form>
		</section>

	</header>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>