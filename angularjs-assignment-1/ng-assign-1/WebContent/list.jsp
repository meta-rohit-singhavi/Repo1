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


<title>Insert title here</title>
</head>
<body>

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


	<section class="container ">
	<div class="centered">
		<div class="row clickable" data-toggle="modal" data-target="#myModal">
			<div class="card userCard" id="userCard">
				<div class="  card-header" id="customerName">Rohit
					Singhavi <button type="button" class="close" id="cardClose" data-dismiss="userCard" onclick='this.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode);return false;'>&times;</button></div>
				<div class="row card-block">
					<div class="col-sm-4">
						<img src="userIcon.png" alt="user" class="img-responsive userIcon"   id="userIcon" />
					</div>
					<div class="col-sm-8 card-blockquote">
						<p id="customerAddress">Vatika , jaipur</p>
						<p id="customerOrder">18</p>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row clickable" data-toggle="modal" data-target="#myModal">
			<div class="card userCard" id="userCard">
				<div class="  card-header" id="customerName">mohit
					Singhavi <button type="button" class="close" id="cardClose" data-dismiss="userCard" onclick='this.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode);return false;'>&times;</button></div>
				<div class="row card-block">
					<div class="col-sm-4">
						<img src="userIcon.png" alt="user" class="img-responsive userIcon"   id="userIcon" />
					</div>
					<div class="col-sm-8 card-blockquote">
						<p id="customerAddress">Vatika , jaipur</p>
						<p id="customerOrder">18</p>
					</div>
				</div>
			</div>
		</div>
		</div>
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


	<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
               <form>
                   <div class="form-group">
                   <label class="control-label">First Name:</label>
                   <input type="text" class="form-control">
                   </div>

                   <div class="form-group">
                       <label class="control-label">Last Name:</label>
                       <input type="text" class="form-control"/>
                   </div>

                   <div class="form-group">
                       <label class="control-label">Email:</label>
                        <input type="email" class="form-control"/>
                   </div>
                   
                   <div class="form-group">
                       <label class="control-label">Address:</label>
                       <textarea rows="10" class="form-control"></textarea>
                   </div>
                   
                   <div class="form-group">
                       <label class="control-label">Number Of Orders:</label>
                        <input type="number" class="form-control"/>
                   </div>
                   <hr>
                   <a href="javescript:void(0)" class="btn btn-success ">
                       <span class="fa fa-tags"></span> Save
                   </a>
               </form>
           
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
	<script
		src="jsfile.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>