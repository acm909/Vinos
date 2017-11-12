package vinos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vinos.dao.Dao;
import vinos.model.Bodega;
import vinos.model.Ficha;
@Service
public class BodegaImpServ implements InterfaceBodegasServicios {
	@Autowired
	@Qualifier("bodegas")
	private Dao dao;

	@Override
	public List<Bodega> bodegas() {
		List<Bodega> bodegas=dao.findAll();
		return bodegas;
	}

	@Override
	public void persist(Bodega bodega) {
		dao.persist(bodega);
		
	}
	public Bodega buscarBodega(int id){
		Bodega bodega=(Bodega)dao.findById(id);
		return bodega;
	}

	@Override
	public List<Ficha> fichasPorBodega(String bodega) {
		return (List<Ficha>) dao.findby(bodega);
	}

}
