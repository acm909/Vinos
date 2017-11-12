<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<!-- css -->
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/nprogress.css">
<link rel="stylesheet" href="static/css/green.css">
<link rel="stylesheet" href="static/css/bootstrap-progressbar-3.3.4.min.css">
<link rel="stylesheet" href="static/css/jqvmap.min.css">
<link rel="stylesheet" href="static/css/daterangepicker.css">
<link rel="stylesheet" href="static/css/custom.min.css">
<!-- js -->

<!-- fontawesome -->
<script src="https://use.fontawesome.com/2d4eb26c4d.js"></script>

<!-- meta -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Nueva Ficha</title>
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="#" class="site_title"><i class="fa fa-cog"
							aria-hidden="true"></i> <span>Zumos De Baco</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<!-- <img src="images/img.jpg" alt="..." class="img-circle profile_img"> -->
						</div>
						<div class="profile_info">
							<span>Bienvenido,</span>
							<h2>Admin</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">
							<h3>General</h3>
							<ul class="nav side-menu">
								<li><a><i class="fa fa-home"></i> Inicio </a></li>
								<li><a><i class="fa fa-edit"></i> Producto <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="verfichas">Consultar productos</a></li>
										<li><a href="nuevaficha">Nuevo producto</a></li>
										<li><a href="#">Modificar producto</a></li>
										<li><a href="#">Eliminar producto</a></li>
									</ul></li>
								<li><a><i class="fa fa-edit"></i> Usuario <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="verusuarios">Consultar usuarios</a></li>
										<li><a href="#">Modificar usuario</a></li>
										<li><a href="#">Eliminar usuario</a></li>
									</ul></li>
								<li><a><i class="fa fa-table"></i> Datos <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="#">Consultar zona</a></li>
										<li><a href="#">Modificar zona</a></li>
										<li><a href="#">Añadir zona</a></li>
										<li><a href="#">Consultar bodega</a></li>
										<li><a href="#">Modificar bodega</a></li>
										<li><a href="#">Añadir bodega</a></li>
									</ul></li>
								<li><a><i class="fa fa-table"></i> Almacén <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="#">Consultar existencias</a></li>
										<li><a href="#">Añadir existencias</a></li>
										<li><a href="#">Modificar existencias</a></li>
									</ul></li>
								<li><a><i class="fa fa-bar-chart-o"></i> Ventas <span
										class="fa fa-chevron-down"></span></a>
									<ul class="nav child_menu">
										<li><a href="#">Consultar ventas último mes</a></li>
										<li><a href="#">Consultar ventas último año</a></li>
									</ul></li>
							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
					<div class="nav toggle">
						<a id="menu_toggle"><i class="fa fa-bars"></i></a>
					</div>

					<ul class="nav navbar-nav navbar-right">
						<li class=""><a href="javascript:;"
							class="user-profile dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"> Admin <span class=" fa fa-angle-down"></span>
						</a>
							<ul class="dropdown-menu dropdown-usermenu pull-right">
								<li><a href="#"> Profile</a></li>
								<li><a href="#"> <span>Settings</span>
								</a></li>
								<li><a href="javascript:;">Help</a></li>
								<li><a href="login.html"><i
										class="fa fa-sign-out pull-right"></i> Log Out</a></li>
							</ul></li>
					</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
				<div class="clearfix"></div>
				<div class="">

					<div class="x_panel">
						<div class="x_title">
							<h2>
								Nueva Ficha <small>nuevo Vino :D</small>
							</h2>
							<ul class="nav navbar-right panel_toolbox">
								<li><a class="collapse-link"><i
										class="fa fa-chevron-up"></i></a></li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-expanded="false"><i
										class="fa fa-wrench"></i></a>
									<ul class="dropdown-menu" role="menu">
										<li><a href="#">Settings 1</a></li>
										<li><a href="#">Settings 2</a></li>
									</ul></li>
								<li><a class="close-link"><i class="fa fa-close"></i></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">
							<br />
							<form:form class="form-horizontal" modelAttribute="nuevaficha"  method="POST" action="crearficha" >
								<div class="form-group">
									<label for="nombre" class="control-label col-md-3 col-sm-3 col-xs-12">Nombre</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<form:input id="nombre" type="text" class="form-control" path="nombre" placeholder="Nombre" />
									</div>
								</div>
								<div class="form-group">
									<label for="year" class="control-label col-md-3 col-sm-3 col-xs-12">Año</label>
									<div class="col-md-9 col-sm-9 col-xs-12" >
										<form:input id="year" type="number" class="form-control" path="year" placeholder="Año" />
									</div>
								</div>
								<div class="form-group">
									<label for="precio" class="control-label col-md-3 col-sm-3 col-xs-12">Precio</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<form:input id="precio" type="number" class="form-control" path="precio" placeholder="0" />
									</div>
								</div>
								<div class="form-group">
									<label for="tipo" class="control-label col-md-3 col-sm-3 col-xs-12">Tipo</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<!--<form:input id="tipo" type="text" class="form-control" path="tipo" placeholder="Tipo" />-->
										<form:select id="tipo"  path="tipo" class="form-control">
											<form:option value="Tinto">Tinto</form:option>
											<form:option value="Blanco">Blanco</form:option>
											<form:option value="Rosado">Rosado</form:option>
											<form:option value="Espumoso">Espumoso</form:option>
											<form:option value="Otros">Otros</form:option>
										</form:select>
									</div>
								</div>
								<div class="form-group">
									<label for="descripcionenvejecimiento" class="control-label col-md-3 col-sm-3 col-xs-12">Descripción</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<form:input id="descripcionenvejecimiento" type="text" class="form-control" path="descripcionenvejecimiento" placeholder="Descripción" />
									</div>
								</div>
								<div class="form-group">
									<label for="maridaje" class="control-label col-md-3 col-sm-3 col-xs-12">Maridaje</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<form:input id="maridaje" type="text" class="form-control" path="maridaje" placeholder="Maridaje" />
									</div>
								</div>
								 <div class="form-group">
	                                <label for="bodega_idbodega" class="control-label col-md-3 col-sm-3 col-xs-12">Bodega</label>
	                                <div class="col-md-9 col-sm-9 col-xs-12">
	                                    
	                                    <form:select id="bodega_idbodega"  path="bodega" class="form-control">
	                                    
	                                    	<c:forEach var="b" items="${bodegas}">
	                                    		<form:option value="${b.idbodega}">${b.nombre}</form:option>
	                                    	</c:forEach>
	                                    	
	                                    </form:select>
	                                </div>
	                            </div>
	                            <div class="form-group">
									<label for="year" class="control-label col-md-3 col-sm-3 col-xs-12">Stock inicial</label>
									<div class="col-md-9 col-sm-9 col-xs-12" >
										<form:input id="year" type="number" class="form-control" path="stock" placeholder="Año" />
									</div>
								</div>
								<div class="form-group">
									<label for="urlfoto" class="control-label col-md-3 col-sm-3 col-xs-12">URL de la imagen</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
										<form:input id="urlfoto" type="text" class="form-control" path="urlfoto" placeholder="URL de la imagen" />
									</div>
								</div>
								<div class="ln_solid"></div>
								<div class="form-group">
									<div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
										<button type="button" class="btn btn-primary">Cancelar</button>
										<button type="reset" class="btn btn-primary">Limpiar</button>
										<button type="submit" class="btn btn-success">Enviar</button>
									</div>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>

			<!-- /page content -->

			<!-- FOOTER content -->
			<footer>
			<div class="pull-right">
				Zumos de Baco <a
					href="https://github.com/mikessoldier/zumos.de.baco">github</a>
			</div>
			<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>

	<!-- jQuery -->
    <script src="static/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="static/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="static/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="static/js/nprogress.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="static/js/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="static/js/icheck.min.js"></script>
    <!-- Chart.js -->
    <script src="static/js/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="static/js/gauge.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="static/js/moment.min.js"></script>
    <script src="static/js/daterangepicker.js"></script>
    <!-- bootstrap-wysiwyg -->
    <script src="static/js/bootstrap-wysiwyg.min.js"></script>
    <script src="static/js/jquery.hotkeys.js"></script>
    <script src="static/js/prettify.js"></script>
    <!-- jQuery Tags Input -->
    <script src="static/js/jquery.tagsinput.js"></script>
    <!-- Switchery -->
    <script src="static/js/switchery.min.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="static/js/custom.min.js"></script>
</body>
</html>
