package vinos.service;
import java.util.List;

import vinos.model.Ficha;

public interface InterfaceVinosServicios {
	
	public List<Ficha> fichas();
	public Ficha buscarFicha(int id);
	public void guardar(Ficha f);
	public void borrar(int id);
	public void eliminar(Ficha ficha);
	public List<Ficha> buscarpornombre(String nombre);
}
