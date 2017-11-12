package vinos.service;

import java.util.List;

import vinos.model.Datospersonales;
import vinos.model.Ficha;
import vinos.model.Usuario;

public interface InterfaceServicios {
	public Usuario buscarUsuarioPorEmail(String email);
	public Usuario buscarpoid(int id);
	public void introUsuario(Usuario us);
	public void introDatosUsuario(Datospersonales dp);
	public List<Ficha> fichas();
	public List<Usuario> usuarios();
	
	

}