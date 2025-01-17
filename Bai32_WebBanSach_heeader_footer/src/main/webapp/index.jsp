<%@page import="model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BookStrore</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
</script>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	<div id="container" class="container" style="width: 100%">
	<!-- Page content -->
		<div class="row">
			<!-- Menu left -->
			<div class="col-lg-3" style="padding-top: 16px">
				<div class="list-group">
				  <a href="#" class="list-group-item list-group-item-action" aria-current="true">Thời trang nam</a>
				  <a href="#" class="list-group-item list-group-item-action">Thời trang nữ</a>
				  <a href="#" class="list-group-item list-group-item-action">Thời trang dành cho bé</a>
				</div>
			</div>
			<!-- End Menu left -->
			
			<!-- Slider and product -->
			<div class="col-lg-9 pt-16" style="padding-top: 16px ">
				<!-- Slider -->
					<div id="carouselExampleIndicators" class="carousel slide">
					  <div class="carousel-indicators">
					    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
					    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
					    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
					  </div>
					  <div class="carousel-inner">
					    <div class="carousel-item active">
					      <img src="img/slider/slider_1.png" class="d-block w-100" alt="...">
					    </div>
					    <div class="carousel-item">
					      <img src="img/slider/slider_2.png" class="d-block w-100" alt="...">
					    </div>
					    <div class="carousel-item">
					      <img src="img/slider/slider_3.png" class="d-block w-100" alt="...">
					    </div>
					  </div>
					  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
					    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
					    <span class="visually-hidden">Previous</span>
					  </button>
					  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
					    <span class="carousel-control-next-icon" aria-hidden="true"></span>
					    <span class="visually-hidden">Next</span>
					  </button>
					</div>
				<!-- End Slider -->
				<!-- Product -->
				<div class="row">
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro1.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro3.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro2.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro3.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro2.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro2.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro2.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 mb-3" style="margin-top: 12px">
						<div class="card" style="width: 100%;">
						  <img src="img/product/pro2.png" class="card-img-top">
						  <div class="card-body">
						    <h5 class="card-title">Áo Sơ Mi</h5>
						    <h5 class="card-title">50.000 VNĐ</h5>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="btn btn-primary">Mua ngay</a>
						  </div>
						</div>					
					</div>
				</div>
				<!-- End Product -->
			</div>
			<!-- End Slider and product -->
		</div>
	</div>
	<!-- End Page content -->
	<%@include file= "footer.jsp" %>
</body>
</html>