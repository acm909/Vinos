package vinos.dao;
import java.io.Serializable;
import java.util.List;



import org.hibernate.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import vinos.model.Ficha;
import vinos.model.Usuario;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

@Component("usuarios")
public class DaoImplUsuarios implements Dao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public DaoImplUsuarios(){
		
	}
	public DaoImplUsuarios(SessionFactory sesion){
		this.sessionFactory=sesion;
	}
	
	

	
	
	
	public void deleteById(int id) {
		Usuario us=new Usuario();
		us.setIdusuario(id);
		sessionFactory.getCurrentSession().delete(us);
		
	}
	

	public Usuario findById(int id) {
		Usuario usuario = (Usuario) sessionFactory.getCurrentSession().get(Usuario.class,id);
		return usuario; 
	}

	
	
	public void delete(Usuario usuario) {
		sessionFactory.getCurrentSession().delete(usuario);
	}

	@SuppressWarnings("unchecked")
	
	public List<Usuario> findAll() {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		List<Usuario> usuarios = (List<Usuario>) sessionFactory.getCurrentSession().createQuery("from Usuario").list();
		tx.commit();
		return usuarios;
	}
	
	/*public void deleteAll() {
		List<Usuario> usuarios = findAll();
		for (Usuario us : usuarios) {
			delete(us);
		}
	}*/
	
	public Usuario buscarUsuarioporEmail(String email){
		Query consulta=sessionFactory.getCurrentSession().getNamedQuery("Usuario.findByEmail");
		consulta.setString("email",email);
		
		Usuario us=(Usuario) consulta.uniqueResult();
		return us;
		
	}
	/*public SessionFactory getSesion() {
		return sessionFactory;
	}
	public void setSesion(SessionFactory sesion) {
		this.sessionFactory = sesion;
	}*/
	
	public Usuario findby(Object entity) {
	
		
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		Query consulta=sessionFactory.getCurrentSession().createQuery("SELECT u FROM Usuario u WHERE u.email = :email");
		consulta.setString("email",(String)entity);
		Usuario us=(Usuario) consulta.uniqueResult();
		tx.commit();
		return us;
		
	}
	public void persist(Object entity) {
		Transaction tx=sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		tx.commit();
	}
	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	
	


	



}
