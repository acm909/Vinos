<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.List" %>
<%@ page import="vinos.model.Ficha" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
   
   <link rel="stylesheet" href="static/css/dataTables.bootstrap.min.css">
   <link rel="stylesheet" href="static/css/buttons.bootstrap.min.css">
   <link rel="stylesheet" href="static/css/fixedHeader.bootstrap.min.css">
   <link rel="stylesheet" href="static/css/responsive.bootstrap.min.css">
   <link rel="stylesheet" href="static/css/scroller.bootstrap.min.css">
   
   <!-- js -->
   
   <!-- fontawesome -->
   <script src="https://use.fontawesome.com/2d4eb26c4d.js"></script>
   
   <!-- meta -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Administración</title>
    <% 
    List<Ficha> fichas = (List<Ficha>) request.getAttribute("fichas");
    int itemCounter = 1;
    %>
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="#" class="site_title"><i class="fa fa-cog" aria-hidden="true"></i> <span>Zumos De Baco</span></a>
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
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li>
                      <a><i class="fa fa-home"></i> Inicio </a>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Producto <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="verfichas">Consultar productos</a></li>
                      <li><a href="nuevaficha">Nuevo producto</a></li>
                      <li><a href="#">Modificar producto</a></li>
                      <li><a href="#">Eliminar producto</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Usuario <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="verusuarios">Consultar usuarios</a></li>
                      <li><a href="#">Modificar usuario</a></li>
                      <li><a href="#">Eliminar usuario</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> Datos <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#">Consultar zona</a></li>
                      <li><a href="#">Modificar zona</a></li>
                      <li><a href="#">Añadir zona</a></li>
                      <li><a href="#">Consultar bodega</a></li>
                      <li><a href="#">Modificar bodega</a></li>
                      <li><a href="#">Añadir bodega</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> Almacén <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#">Consultar existencias</a></li>
                      <li><a href="#">Añadir existencias</a></li>
                      <li><a href="#">Modificar existencias</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i> Ventas <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="#">Consultar ventas último mes</a></li>
                      <li><a href="#">Consultar ventas último año</a></li>
                    </ul>
                  </li>                  
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
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    Admin
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="#"> Profile</a></li>
                    <li>
                      <a href="#">
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Vinos <small>Lista de Vinos</small></h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Buscar...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Ir</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>
            
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Fichas de producto</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">

                    <p>Tabla de fichas con opciones de administración</p>

                    <!-- start product list -->
                    
                    <table class="table table-striped projects">
                      <thead>
                      
                        <c:forEach var="f" items="${fichas}" varStatus="status">
                       
                        
                        <tr>
                          <td>
                          ${status.index +1 }
	                          
                          </td>
                          <td>
                            <a>${f.nombre}</a>
                            <br />
                            <small>...</small>
                          </td>
                          <td>
                            <div>${f.precio}€</div>
                          </td>
                          <td>
                            <div>${f.year}</div>
                          </td>
                          <td>
                            <strong>${f.stock.unidadesRestantes}</strong>
                          </td>
                          <td>
                            <a href="#" class="btn btn-primary btn-xs"><i class="fa fa-folder"></i> Ver Ficha </a>
                            <a href="editar?id=${f.idficha}" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> Editar </a>
                            <a href="borrar?borrar=${f.idficha}" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> Borrar </a>
                          </td>
                        </tr>
                  
                     </c:forEach>
                      </tbody>
                    </table>
                    
                    <!-- end product list -->

                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- FOOTER content -->
        <footer>
          <div class="pull-right">
            Zumos de Baco <a href="https://github.com/mikessoldier/zumos.de.baco">github</a>
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
    <!-- Skycons -->
    <script src="static/js/skycons.js"></script>
    <!-- DataTables -->
    <script src="static/js/jquery.dataTables.min.js"></script>
    <script src="static/js/dataTables.bootstrap.min.js"></script>
    <script src="static/js/dataTables.buttons.min.js"></script>
    <script src="static/js/buttons.bootstrap.min.js"></script>
    <script src="static/js/buttons.flash.min.js"></script>
    <script src="static/js/buttons.html5.min.js"></script>
    <script src="static/js/buttons.print.min.js"></script>
    <script src="static/js/dataTables.fixedHeader.min.js"></script>
    <script src="static/js/dataTables.keyTable.min.js"></script>
    <script src="static/js/dataTables.responsive.min.js"></script>
    <script src="static/js/responsive.bootstrap.js"></script>
    <script src="static/js/dataTables.scroller.min.js"></script>
    <script src="static/js/jszip.min.js"></script>
    <script src="static/js/pdfmake.min.js"></script>
    <script src="static/js/vfs_fonts.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="static/js/custom.min.js"></script>	
  </body>
</html>
