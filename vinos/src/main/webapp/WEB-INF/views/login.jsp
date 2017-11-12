<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<spring:url value="static/css/font-awesome.min.css" var="font" />
<!--  <link href="${font}" rel="stylesheet" />-->
<spring:url value="static/css/auth.css" var="auth" />
<!--<link href="${auth}" rel="stylesheet" />-->
<link href="static/css/auth.css" type="text/css" rel="stylesheet" />
<link href="static/css/font-awesome.min.css" type="text/css" rel="stylesheet" />

<title>Login</title>
</head>
<body>
<body class="home flow-body">
    <main role="main" class="main">
        <div class="flow">
            <div class="flow-content-wrap">
                <section class="flow-content">
                    <a class="signin-logo" href="#" tabindex="5"></a>
                    <form:form action="comprobarUsuario" class="signin" method="POST" modelAttribute="usuario">
                        <div class="signin-email form-group">
                            <div class="input-icon input-icon-email">
                                <i class="fa fa-envelope-o"></i>
                                <label for="signin-input-email">Correo Electrónico:</label>
                                <form:input id="signin-input-email" class="input" type="email" autofocus="" placeholder="Correo Electrónico" path="email" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                            </div>
                        </div>
                        <div class="forgotten-password form-group">
                            <div class="input-icon input-icon-lock">
                                <!-- <i class="fa fa-key"></i> -->
                                <i class="fa fa-lock"></i>
                                <label for="signin-input-password">Contraseña:</label>
                                <form:input id="signin-input-password" class="signin-password input" type="password" placeholder="Contraseña" path="clave" tabindex="2" autocorrect="off" />
                                <button type="submit" name="forgot" class="forgotten-password-link js-spinner-btn" tabindex="4" value="true">La olvidaste?</button>
                            </div>
                        </div>
                        <div class="submit-signup form-group">
                            <button type="submit" value="Sign in" class="btn btn-blue btn-block" tabindex="3"><span>Entrar</span></button>
                        </div>
                        <p class="error-message"></p>
                    </form:form>
                    <div class="signin-signup">
                        <a href="registrar" tabindex="4">¿Aún no tienes cuenta?, Regístrate!</a>
                    </div>
                </section>
            </div>
        </div>

    </main>
    <script type="text/javascript" src="public/js/jquery.js"></script>

</body>
</html>