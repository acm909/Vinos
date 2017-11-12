package vinos.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vinos.model.Stock;
@Repository("stock")
public class DaoImplStock implements Dao{
	@Autowired 
	private SessionFactory sessionFactory;

	@Override
	public void persist(Object entity) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		tx.commit();
	}

	@Override
	public Object findById(int id) {
		
		Stock stock=(Stock)sessionFactory.getCurrentSession().get(Stock.class, id);
	
		return stock;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Stock stock=(Stock)findById(id);
		sessionFactory.getCurrentSession().delete(stock);
		tx.commit();
		
	}

	@Override
	public Object findby(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

}
