package vinos.controller;


import vinos.model.Usuario;
import vinos.service.InterfaceServicios;

import vinos.service.UsuariosImp;
import vinos.dao.Dao;
import vinos.dao.DaoImplUsuarios;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@SessionAttributes("usuario")

public class ControladorLogin {
	
	@Autowired
	private InterfaceServicios servicios;
	


	
	
	

	@ModelAttribute("usuario")
	public Usuario getUsuarioObject() {
		System.out.println("-- devuelvo un usuario");
		return new Usuario();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		System.out.println("--- enviando un model vacio ");
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);

		return "login";
	}

	@RequestMapping(value = "/comprobarUsuario", method = RequestMethod.POST)
	public String guardarMenu(ModelMap model, @ModelAttribute("usuario") Usuario usuario) {
		System.out.println(usuario.getEmail());
		Usuario us1 = servicios.buscarUsuarioPorEmail(usuario.getEmail());
		if (us1 == null) {
			System.out.println("usuario nulo");
			return "noAccess";
		}
		System.out.println(us1.getEmail());

		if (usuario.getEmail().equals(us1.getEmail()) && usuario.getClave().equals(us1.getClave())) {
			if (us1.getRol().equals("admin")) {
				return "dashboard";
			} else {
				return "redirect:tienda";
			}

		} else {
			return "noAccess";
		}

	}
	

}