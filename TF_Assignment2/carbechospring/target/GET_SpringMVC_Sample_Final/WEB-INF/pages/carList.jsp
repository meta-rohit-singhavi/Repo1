<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://localhost:8080/carbechospring/_ui/css/myStyle.css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" />


<!-- <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script> -->
<title>Insert title here</title>
</head>
<body data-ng-app="myApp" data-ng-controller="MainController">


	<nav class="navbar">
		<h1>
			<small> Cars</small>
		</h1>
		<div class=" navbar-default container-fluid">



			<div class="navbar-header">

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
					<button type="button" class="btn btn-default" ng-click="cardView()">
						<span class="glyphicon glyphicon-credit-card"> </span> Card View
					</button>
					<button type="button" class="btn btn-default" ng-click="listView()">
						<span class="glyphicon glyphicon-list"> </span> List View
					</button>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-plus"> </span> Add Car
					</button>
				</div>

				<form class="navbar-form navbar-right">
					<div class="form-group">
						<label for="filterBox" class="input-control">filter</label> <input
							type="text" class="form-control" name="filterBox" id="filterBox"
							placeholder="Search" ng-model="searchByName">
					</div>

				</form>

			</div>

		</div>

	</nav>


	<section class="container row">

		<div class="{{view}}" data-ng-repeat="car in carlist "
			style="margin-bottom: 5px" data-ng-click="showData($index)">
			<div class="card" id="userCard">
				<div class=" col-md-12 card-header" id="customerName"
					filter:searchByName>
					<span>{{car.Created_By}}</span>
					<button type="button" class="close" id="cardClose"
						data-dismiss="userCard" ng-click="deleteCustomer($index)">&times;
					</button>
				</div>
				<div class="row card-block " data-toggle="modal"
					data-target="#myModal">
					<div class="col-md-4">
						<img src="carIcon.png" alt="user" class="img-responsive userIcon"
							id="userIcon" />
					</div>
					<div class="col-md-8 card-blockquote">
						<p id="customerAddress">{{customer.address}}</p>
						<p id="customerOrder">{{customer.numOfOrders}}</p>
					</div>
				</div>
			</div>
		</div>
	</section>


	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<ul class="pagination">
					<li class="disabled"><a href="#"> First </a></li>
					<li class="disabled"><a href="#"> Previous </a></li>
					<li class="active"><a href="#"> 1 </a></li>
					<li><a href="#"> 2 </a></li>
					<li><a href="#"> 3 </a></li>
					<li><a href="#"> Next </a></li>
					<li><a href="#"> Last </a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Modal Header</h4>
				</div>
				<div class="modal-body">

					<form>
						<input type="hidden" name="id" ng-model="mycar.id">
						<div>
							<label> Company Name</label> <input type='text' name='make'
								ng-model="mycar.make" placeholder='Company Name' />
						</div>
						<div>
							<label> Model Number </label> <input type='text' name='model'
								ng-model='mycar.model' placeholder='Model Number' />
						</div>
						<div>
							<label> Engine CC </label> <input type="number" name='engineInCC'
								ng-model='mycar.engineInCC' placeholder='Engine cc' />
						</div>
						<div>
							<label> Fuel Capacity (in Litres) </label> <input type='number'
								name='fuelCapacity' ng-model='mycar.fuelCapacity'
								placeholder='Fuel Capacity' />
						</div>
						<div>
							<label> Milage </label> <input type='number' name='milage'
								ng-model='mycar.milage' placeholder='Milage' />
						</div>
						<div>
							<label> Price </label> <input type='number' name='price'
								ng-model="mycar.price" placeholder='Price' />
						</div>
						<div>
							<label> Road Tax </label> <input type='number' name='roadTax'
								ng-model="mycar.roadTax" placeholder='Road Tax' />
						</div>

						<div>
							<label> AC cost </label> <input type="number" name='ac'
								ng-model="mycar.ac" placeholder='cost' />
						</div>

						<div>
							<label> PowerSteering cost </label> <input type="number"
								name='powerSteering' ng-model="mycar.powerSteering"
								placeholder='powerSteering' />
						</div>

						<div>
							<label> AccessoryKit cost </label> <input type="number"
								name='accessoryKit' ng-model="mycar.accessoryKit"
								placeholder='accessoryKit' />
						</div>


						<div>
							<button id='updateButton' ng-click="updateData()">
								<h4 id='buttontext'>
									Update <i class="fa fa-paper-plane" aria-hidden="true"></i>
								</h4>
							</button>
						</div>
						<P>{{responsemessage}}</P>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://localhost:8080/carbechospring/_ui/js/angular.min.js"></script>
	<script src="http://localhost:8080/carbechospring/_ui/js/jsfile.js"></script>
</body>
</html>
