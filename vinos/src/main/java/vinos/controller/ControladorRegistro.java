package vinos.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vinos.model.Datospersonales;
import vinos.model.Usuario;
import vinos.model.UsuarioDatosPersonales;
import vinos.service.InterfaceServicios;
@Controller

public class ControladorRegistro {
	
	@Autowired
	private InterfaceServicios servicios;
	
	@ModelAttribute("usuarioregistro")
	public UsuarioDatosPersonales getUsuarioObject() {
		System.out.println("-- devuelvo un usuarioregistro");
		return new UsuarioDatosPersonales();
	}
	
	
	
	@RequestMapping(value = "/registrar", method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		UsuarioDatosPersonales usuarioregistro = new UsuarioDatosPersonales();
		model.addAttribute("usuarioregistro", usuarioregistro);
		System.out.println("enviando al formulario de registro");
		return "signupform";	
	}
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String guardarMenu(ModelMap model, @ModelAttribute("usuarioregistro") UsuarioDatosPersonales usuarioregistro) {
	Date fechaAlta=Date.valueOf(LocalDate.now());
	Usuario us=new Usuario(fechaAlta,usuarioregistro.getEmail(),usuarioregistro.getClave(),"user" );
	us.setActivo(true);
	Datospersonales dp=new Datospersonales(us, usuarioregistro.getNombre(), usuarioregistro.getApellido(), 
			usuarioregistro.getApellido2(),usuarioregistro.getTelefono(),usuarioregistro.getCodigoPostal(),
			usuarioregistro.getDireccion(), usuarioregistro.getFechaNacimiento());
	
	servicios.introUsuario(us);
	servicios.introDatosUsuario(dp); 
	
	
		
		
		
		
		return "redirect:/";
		

	}


}
