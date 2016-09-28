<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="myStyle.css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" />

<script src="angular.min.js"></script>
<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> -->
<script src="jsfile.js"></script>
<title>Insert title here</title>
</head>
<body data-ng-app="myApp">

	<nav class="navbar">
		<h1>
			<small> Customers</small>
		</h1>
		<div class=" navbar-default container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->


			<div class="navbar-header">

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#"><i class="fa fa-square"
							aria-hidden="true"></i>Card View</a></li>
					<li><a href="#"><i class="fa fa-list-ul"
							aria-hidden="true"></i>List View</a></li>
					<li><a href="#"><i class="fa fa-plus" aria-hidden="true"></i>Add
							Customer</a></li>

				</ul>

				<form class="navbar-form navbar-right">
					<div class="form-group">
						<label for="filterBox" class="input-control">filter</label> <input
							type="text" class="form-control" name="filterBox" id="filterBox"
							placeholder="Search">
					</div>

				</form>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>


	<section class="container row" >

		<div  data-ng-controller='MyController'>
			<div class="col-md-3 clickable" data-toggle="modal"
				data-target="#myModal">
				<div class="card" id="userCard">
					<div class=" col-md-12 card-header" id="customerName">
						<ul>
							<li data-ng-repeat="customer in customers" >{{ customer.firstName }}</li>
						</ul>

						<button type="button" class="close" id="cardClose"
							data-dismiss="userCard"
							onclick='this.parentNode.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode.parentNode);return false;'>&times;</button>
					</div>
					<div class="row card-block">
						<div class="col-md-4">
							<img src="userIcon.png" alt="user"
								class="img-responsive userIcon" id="userIcon" />
						</div>
						<div class="col-md-8 card-blockquote">
							<p id="customerAddress">Vatika , jaipur</p>
							<p id="customerOrder">18</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- <div class="col-md-3">
			<div class="card" id="userCard" data-toggle="modal" data-target="#myModal">
				<div class=" col-md-12 card-header" id="customerName">Rohit
					Singhav <button type="button" class="close" id="cardClose" data-dismiss="userCard" onclick='this.parentNode.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode.parentNode);return false;'>&times;</button></div>
				<div class="row card-block">
					<div class="col-md-4">
						<img src="userIcon.png" alt="user" class="img-responsive userIcon"  id="userIcon" />
					</div>
					<div class="col-md-8 card-blockquote">
						<p id="customerAddress">Vatika , jaipur</p>
						<p id="customerOrder">18</p>
					</div>
				</div>
			</div>
		</div> -->
	</section>


	<section class="container row">

		<ul class="pager">
			<li><a href="#">First</a></li>
			<li><a href="#">Previous</a></li>

			<li><a href="#">Next</a></li>
			<li><a href="#">Last</a></li>
		</ul>

		<p id="result"></p>
	</section>

	<section>
		<p>
			Name : <input type="text" data-ng-model="name">
		</p>
		<h1 data-ng-bind="name">Hello</h1>
	</section>

	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Modal Header</h4>
				</div>
				<div class="modal-body">
					<p>Some text in the modal.</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>
	<!-- <script src="jsfile.js"></script> -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>