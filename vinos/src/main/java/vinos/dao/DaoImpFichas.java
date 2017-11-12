package vinos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vinos.model.Ficha;


@Repository("fichas")
public class DaoImpFichas implements Dao{
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void persist(Object entity) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		tx.commit();
	}

	@Override
	public Ficha findById(int id) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Ficha ficha = (Ficha)sessionFactory.getCurrentSession().get(Ficha.class, id);
		tx.commit();
		return ficha;
	}

	@SuppressWarnings("unchecked")
	
	public List<Ficha> findAll() {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		List<Ficha> fichas = (List<Ficha>) sessionFactory.getCurrentSession().createQuery("from Ficha").list();
		tx.commit();
		return fichas;
	}

	@Override
	public void deleteById(int id) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Ficha ficha=findById(id);
		sessionFactory.getCurrentSession().delete(ficha);
		tx.commit();
		
	}
	public void delete(Object entity){
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().delete(entity);
		tx.commit();
	}


	
public List<Ficha> findby(Object entity) {
	
		
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Query consulta=sessionFactory.getCurrentSession().createQuery("FROM Ficha  WHERE nombre like '" +(String)entity +"%'");
		//consulta.setString("nombre",(String)entity);
		List<Ficha>fichas=(List<Ficha>) consulta.list();
		tx.commit();
		return fichas;
		
	}

}
