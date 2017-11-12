<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="static/css/restaurante.css" var="restaurante" />
<link href="${restaurante}" rel="stylesheet" />
<spring:url value="static/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />

<title>Mostrar Menu</title>
</head>
<body>
	<div id="wrapper">

		action="pedidoRealizado">
		<div id="header">
			<h1>Restaurante V1</h1>
			<h2>Paso 02 - Elige menu</h2>
		</div>
		<div id="main">
			<form:form modelAttribute="menu" method="POST" action="pedidoRealizado">
				<fieldset>
					<legend>Menú del día (Lunes)</legend>
					<p>Elige un primero, un segundo y un postre.</p>
					<p />

					<label>Primeros platos:</label> <br />

					<form:radiobuttons path="primero" items="${primeros}"
						required="true" />
					<br /> <label>Segundos platos:</label> <br />

					<form:radiobuttons path="segundo" items="${segundos}"
						required="true" />
					<br /> <label>Postres:</label> <br />

					<form:radiobuttons path="postre" items="${postres}" required="true" />

					<br /> <input type="submit" value="Aceptar" />
				</fieldset>
			</form:form>
		</div>
	</div>


</body>
</html>