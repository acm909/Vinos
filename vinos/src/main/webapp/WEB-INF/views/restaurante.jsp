<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="static/css/restaurante.css" var="restaurante" />
<link href="${restaurante}" rel="stylesheet" />
<spring:url value="static/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<title>Restaurante </title>
             
    </head>
</head>
 <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante V1</h1>
                <h2>Paso 01 - Identificación</h2>
            </div>
            <div id="main">
                <form:form  modelAttribute="usuario" method="POST" action="mostrarMenu">
                    <fieldset>
                        <legend>Datos del cliente</legend>
                        <p>
                            <label for="nombre">Indique su nombre:</label>
                            <form:input type="text" path="nombre" id="nombre" />
                            
                        </p>
                        <p>
                            <label for="habitacion">Indique el número de habitación:</label>
                            <form:input type="text" path="habitacion" id="habitacion"/>
                        </p>
                        <p>
                            <input type="submit" value="Realizar pedido" />
                            
                        </p>
                    </fieldset>
                   
                </form:form>
            </div>
        </div>
    </body>
</html>