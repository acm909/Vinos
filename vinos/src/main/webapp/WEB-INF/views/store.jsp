
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html lang="en">
<head>

<!-- css -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/font-awesome.min.css" rel="stylesheet">
<link href="static/css/prettyPhoto.css" rel="stylesheet">
<link href="static/css/price-range.css" rel="stylesheet">
<link href="static/css/animate.css" rel="stylesheet">
<link href="static/css/main.css" rel="stylesheet">
<link href="static/css/responsive.css" rel="stylesheet">
<!-- fontawesome -->
<!-- js -->
<!-- meta -->
<meta charset="utf-8">
<title>ZDB | Tienda</title>

</head>
<!--/head-->

<body>
	<header id="header">
		<!--header-->
		<div class="header-middle">
			<!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="store"><img src="images/home/logo.png" alt="" /></a>
						</div>
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="profile"><i class="fa fa-user"></i> Cuenta</a></li>
								<li><a href="cart"><i class="fa fa-shopping-cart"></i>
										Carrito</a></li>
								<li><a href="logout"><i class="fa fa-lock"></i> Salir</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/header-middle-->

		<div class="header-bottom">
			<!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-3 col-sm-offset-9">
						<form action="categorias" method="get">
							<div  data-toggle="buttons">
								<label > <input type="radio"
									name="categoria" value="ficha" checked>Vino
								</label>
								<label> <input type="radio"
									name="categoria" value="bodega">Bodega
								</label>
							</div>
							<div class="form-group">
								<label for="busqueda">Buscar <input id="busqueda"
									type="text" class="form-control" name="categorias"
									placeholder="Buscar">
								</label>
							</div>
							<button type="submit" class="btn btn-default">Buscar</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!--/header-bottom-->

	<section id="slider">
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"
								class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						<!-- attention here /  -->
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>Nombre de vino A</h1>
									<h2>Alguna cosilla importante</h2>
									<p>En general chachara y prosa sin sentido para poner por
										los cielos el vino en cuestiÃ³n</p>
									<button type="button" class="btn btn-default get">Ver</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl1.jpg" class="girl img-responsive"
										alt="" />

								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1>Nombre de vino B</h1>
									<h2>Alguna cosilla importante</h2>
									<p>En general chachara y prosa sin sentido para poner por
										los cielos el vino en cuestiÃ³n</p>
									<button type="button" class="btn btn-default get">Ver</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl2.jpg" class="girl img-responsive"
										alt="" />

								</div>
							</div>

							<div class="item">
								<div class="col-sm-6">
									<h1>Nombre de vino C</h1>
									<h2>Alguna cosilla importante</h2>
									<p>En general chachara y prosa sin sentido para poner por
										los cielos el vino en cuestiÃ³n</p>
									<button type="button" class="btn btn-default get">Ver</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl3.jpg" class="girl img-responsive"
										alt="" />

								</div>
							</div>

						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section>
	<!--/slider-->

	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Categorías</h2>
						<div class="panel-group category-products" id="accordian">
							<!--category-productsr-->

							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a href="categorias?categoria=Tinto&categorias=0">Tintos</a>
									</h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a href="categorias?categoria=Blanco&categorias=0">Blancos</a>
									</h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a href="categorias?categoria=Rosado&categorias=0">Rosados</a>
									</h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a href="categorias?categoria=Espumoso&categorias=0">Espumosos</a>
									</h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a href="categorias?categoria=Otros&categorias=0">Otros</a>
									</h4>
								</div>
							</div>

						</div>
						<!--/category-products-->

					</div>
				</div>

				<div class="col-sm-9 padding-right">
					<div class="features_items">
						<!--features_items-->
						<h2 class="title text-center">${categoria}</h2>

						<!-- plantilla de ficha -->


						<c:forEach var="ficha" items="${fichas}">

							<div class="col-sm-4">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">

											<img
												src="https://assets.personalwine.com/assets/frontend/examples/redwine_etch_wishyougifts-218dd5aa2a1b93f86118482808c49497.png"
												alt="no se ha podido cargar la imagen" />
											<h2>${ficha.precio}€</h2>
											<p>${ficha.nombre}</p>
											<i>Ver Ficha</i>
										</div>
										<div class="product-overlay">
											<div class="overlay-content">
												<h2>${ficha.precio}€</h2>
												<p>
													<a class="white white-anchor"
														href="montarFicha?id=${ficha.idficha}">${ficha.nombre}</a>
												</p>
												<a href="montarFicha?id=${ficha.idficha}"
													class="btn btn-default add-to-cart"><i
													class="fa fa-shopping-cart"></i>Ver Ficha</a>

											</div>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>

						<!-- plantilla de ficha/ -->

					</div>


				</div>
			</div>
		</div>
	</section>

	<footer id="footer">
		<!--Footer-->

		<div class="footer-widget">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Service</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Online Help</a></li>
								<li><a href="#">Contact Us</a></li>
								<li><a href="#">Order Status</a></li>
								<li><a href="#">Change Location</a></li>
								<li><a href="#">FAQâs</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">

							<h2>Policies</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Terms of Use</a></li>
								<li><a href="#">Privecy Policy</a></li>
								<li><a href="#">Refund Policy</a></li>
								<li><a href="#">Billing System</a></li>
								<li><a href="#">Ticket System</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Company Information</a></li>
								<li><a href="#">Careers</a></li>
								<li><a href="#">Store Location</a></li>
								<li><a href="#">Affillate Program</a></li>
								<li><a href="#">Copyright</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-1 pull-right">
						<div class="companyinfo">
							<h2>
								ZD<span>B</span>
							</h2>
							<p>Chachara sobre zumos de baco</p>
						</div>
					</div>

				</div>
			</div>
		</div>

	</footer>
	<!--/Footer-->




	<script src="static/js/jquery.js" type="text/javascript"></script>
	<script src="static/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="static/js/jquery.scrollUp.min.js" type="text/javascript"></script>
	<script src="static/js/price-range.js" type="text/javascript"></script>
	<script src="static/js/jquery.prettyPhoto.js" type="text/javascript"></script>
	<script src="static/js/main.js" type="text/javascript"></script>

</body>
</html>
