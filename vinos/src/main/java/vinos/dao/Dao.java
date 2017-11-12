package vinos.dao;
import java.io.Serializable;
import java.util.List;

public interface Dao<T> {
	
	

	//CREATE
	public void persist(T entity);
	
	//READ
	public T findById(int id);
	public List<T> findAll();	
	
	//UPDATE
	//public void update(T entity);
	
	//DELETE
	//public void delete(T entity);
	public void deleteById(int id);	
	//public void deleteAll();
	public void delete(T entity);
	public T findby(T entity);
	
	
}