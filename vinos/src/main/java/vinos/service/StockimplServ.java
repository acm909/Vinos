package vinos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vinos.dao.Dao;
import vinos.model.Stock;
@Service
public class StockimplServ implements InterfaceStockServicios {
	@Autowired
	@Qualifier("stock")
	private Dao dao;
	
	@Override
	public void guardar(Stock stock) {
		dao.persist(stock);
		
	}

	@Override
	public void borrar(int id) {
		dao.deleteById(id);
		
	}
	

}
