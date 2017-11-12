<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html>

<head>
   
   <!-- css -->
   <link href="static/css/auth.css" rel="stylesheet">
   <link href="static/css/font-awesome.min.css" rel="stylesheet">

   <!-- js -->
   
   <!-- fontawesome -->
   <script src="https://use.fontawesome.com/2d4eb26c4d.js"></script>
   
   <!-- meta -->
    <meta charset="UTF-8">
    <title>Signup</title>
    
</head>
<body class="home flow-body">
        <main role="main" class="main">
            <div class="flow">
                <div class="flow-content-wrap">
                    <section class="flow-content">
                        
                        <a class="signin-logo" href="#" tabindex="5"></a>
                        
                        <form:form action="reg" class="signin" method="POST" modelAttribute="usuarioregistro" id="signup-form" novalidate="novalidate">
                            <div class="name form-group">
                                <label for="signup-name">Nombre</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-user-o signup-icon" aria-hidden="true"></i>
                                    <form:input id="name" required="true" class="input" type="text" autofocus="" placeholder="Nombre" path="nombre" name="name" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>                            
                            <div class="form-group">
                                <label for="lastname1">Primer Apellido</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-user signup-icon" aria-hidden="true"></i>
                                    <form:input id="lastname1" required="true"  class="input" type="text" path="apellido" autofocus="" placeholder="Primer Apellido"  autocapitalize="off" autocorrect="off" tabindex="1"  />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="lastname2">Segundo Apellido</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-user signup-icon" aria-hidden="true"></i>
                                    <form:input id="lastname2" required="true"  class="input" type="text" autofocus="" placeholder="Segundo Apellido" path="apellido2" name="lastname2" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="birthdate">Fecha de Nacimiento</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-calendar-o signup-icon" aria-hidden="true"></i>
                                    <form:input id="birthdate" class="input" required="true"  type="date" path="fechaNacimiento" autofocus="" name="birthdate" placeholder="Fecha de Nacimiento" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="address">Dirección</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-address-card signup-icon" aria-hidden="true"></i>
                                    <form:input id="address" path="direccion" required="true"  class="input" type="text" autofocus="" placeholder="Dirección" name="address" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="cp">Código Postal</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-address-card-o signup-icon" aria-hidden="true"></i>
                                    <form:input id="cp" class="input" required="true"  path="codigoPostal" type="text" autofocus="" placeholder="Código Postal" name="cp" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="phonenumber">Teléfono</label>
                                <div class="input-icon input-icon-name">
                                    <i class="fa fa-phone signup-icon" aria-hidden="true"></i>
                                    <form:input id="phonenumber" path="telefono" required="true"  class="input" type="text" autofocus="" placeholder="Número de teléfono" name="phonenumber" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            
                            <div class="signup-email form-group">
                                <label for="signup-email">Correo Electrónico</label>
                                <div class="input-icon input-icon-email">
                                    <i class="fa fa-envelope-o signup-icon"></i>
                                    <form:input id="signup-email" path="email" class="input" required="true"  type="email" autofocus="" placeholder="Correo electrónico" name="email" autocapitalize="off" autocorrect="off" tabindex="1" value="" />
                                </div>
                            </div>
                            <div class="password form-group">
                                <label for="signup-password">Contraseña</label>
                                <div class="input-icon input-icon-lock">
                                    <i class="fa fa-lock signup-icon"></i>
                                    <form:input id="signup-password" path="clave"  required="true" class="signin-password input" type="password" placeholder="Contraseña" name="password" tabindex="2" autocorrect="off" value="" />
                                    <div class="pw-strength">
                                        <div class="pw-strength-dot"></div>
                                        <div class="pw-strength-dot"></div>
                                        <div class="pw-strength-dot"></div>
                                        <div class="pw-strength-dot"></div>
                                        <div class="pw-strength-dot"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="submit-signup form-group">
                                <button type="submit" value="Registrar" class="btn btn-blue btn-block" tabindex="3"><span>Register</span></button>
                            </div>
                            <p class="error-message"></p>
                        </form:form>
                        
                    </section>
                </div>
            </div>

        </main>
        <script type="text/javascript" src="static/js/jquery.js"></script>
        <script type="text/javascript" src="static/js/signup.js"></script>

</body>

</html>
