<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.carbecho.beans.VehicleVO"%>
<%@page import="java.util.List"%>
<%@page import="java.beans.Beans"%>
<%@page import="com.sun.javafx.fxml.BeanAdapter"%>
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
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="myStyle.css">
</head>


<body>
<%@include file="header.jsp" %>

<div class="container">
  <h2>Car List</h2>
  <p>List of all available Car : </p>
  <table class="table">
    <thead>
      <tr>
        <th>Made By</th>
        <th>Model</th>
        <th> Operation </th>
      </tr>
    </thead>
    <tbody>
    <%
    	List<VehicleVO> vehicleVOList = (List<VehicleVO>)(request.getAttribute("vehicleVOList"));
     
      for(VehicleVO vehicleVO : vehicleVOList){
    	  
   	%> 	
   	  
      <tr>
        <td><%= vehicleVO.getMake() %></td>
        <td><%= vehicleVO.getModel() %></td>
        <td><a href="CarController?job=view&vehicle_ID=<%=vehicleVO.getVehicleVO_ID()%>">Detail View</a></td>
        <td><a href="CarController?job=delete&vehicle_ID=<%=vehicleVO.getVehicleVO_ID()%>">Delete Car</a></td>
        <td><a href="CarController?job=update&vehicle_ID=<%=vehicleVO.getVehicleVO_ID()%>">Update Car</a></td>
      </tr>
    <%
    }
    %> 
    </tbody>
  </table>
</div>

</body>
</html>