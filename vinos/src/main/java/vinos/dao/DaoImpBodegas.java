package vinos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import vinos.model.Bodega;
import vinos.model.Ficha;
import vinos.model.Usuario;
@Repository("bodegas")
public class DaoImpBodegas implements Dao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persist(Object entity) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		tx.commit();
	}

	@Override
	public Bodega findById(int id) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Bodega bodega = (Bodega) sessionFactory.getCurrentSession().get(Bodega.class,id);
		tx.commit();
		return bodega; 
	}

	@SuppressWarnings("unchecked")
	
	public List<Bodega> findAll() {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		List<Bodega> bodegas = (List<Bodega>) sessionFactory.getCurrentSession().createQuery("from Bodega").list();
		tx.commit();
		return bodegas;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
public List<Ficha> findby(Object entity) {
	
		
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Query query=sessionFactory.getCurrentSession().createQuery("from ficha");
		//Query consulta=sessionFactory.getCurrentSession().createQuery("select f from ficha f where f.bodega_idbodega=(select b.idbodega from bodega b where b.nombre like '" +(String) entity +"%')");
		//consulta.setString("nombre",(String)entity);
		List<Ficha>fichas=(List<Ficha>) query.list();
		tx.commit();
		return fichas;
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

}
