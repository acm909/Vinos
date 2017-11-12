<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Restaurante. Pedido</title>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="static/css/restaurante.css" var="restaurante" />
<link href="${restaurante}" rel="stylesheet" />
<spring:url value="static/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
        
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante V1</h1>
                <h2>Paso 03 - Detalle Pedido</h2>
            </div>
            <div id="main">

                <p>Gracias por utilizar nuestros servicios.</p>
                <p>Enseguida le llevamos su pedido.<br/></p>
					
                <h3><strong>Datos del cliente</strong></h3>
                
                <ul>
                    <li> Nombre del cliente: <strong>${cliente.nombre}</strong></li>
                    <li> Habitacion del cliente: <strong>${cliente.habitacion }</strong></li>
                </ul>   
                <h3><strong>Menu encargado para hoy</strong></h3>
                <ul>
                    <li> De Primero: <strong>${menu.primero}</strong></li>
                    <li> De Segundo: <strong>${menu.segundo}</strong></li>
                    <li> De Postre: <strong>${menu.postre}</strong></li>
                </ul>
                <p>
                    Si existe algun problema, envia un mensaje a <a href="#">${initParam.email}</a>
                </p>
                
            </div>
        </div>
    </body>
</html>