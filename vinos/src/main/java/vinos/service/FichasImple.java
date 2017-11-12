package vinos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vinos.dao.Dao;
import vinos.dao.DaoImpFichas;
import vinos.model.Ficha;
@Service
public class FichasImple implements InterfaceVinosServicios {
	@Autowired
	@Qualifier("fichas")
	private Dao dao;
	
	
	@Override
	public List<Ficha> fichas() {
		List<Ficha> fichas=dao.findAll();
		return fichas;
	}


	@Override
	public Ficha buscarFicha(int id) {
		Ficha ficha=(Ficha)dao.findById(id);
		return ficha;
	}


	@Override
	public void guardar(Ficha f) {
		dao.persist(f);
		
	}


	@Override
	public void borrar(int id) {
		dao.deleteById(id);
		
	}


	@Override
	public void eliminar(Ficha ficha) {
		dao.delete(ficha);
		
	}
	@Override
	public List<Ficha> buscarpornombre(String nombre) {
		
		 return(List<Ficha>) dao.findby(nombre);
	}

}
