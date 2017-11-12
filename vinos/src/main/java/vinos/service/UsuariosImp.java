package vinos.service;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import vinos.dao.Dao;
import vinos.model.Datospersonales;
import vinos.model.Ficha;
import vinos.model.Usuario;

@Service

public class UsuariosImp implements InterfaceServicios {
		@Autowired
		@Qualifier("usuarios")
		private Dao dao;

		public Usuario buscarUsuarioPorEmail(String email){
			Usuario us=(Usuario)dao.findby(email);
			return us;
		}
		
		public Usuario buscarpoid(int id) {
			Usuario us=(Usuario) dao.findById(id);
			return us;
		}
		public void introUsuario(Usuario us){
			dao.persist(us);
		}

		public void introDatosUsuario( Datospersonales dp) {
			dao.persist(dp);
			
		}

		@Override
		public List<Ficha> fichas() {
			return dao.findAll();
			
		}

		@Override
		public List<Usuario> usuarios() {
			List<Usuario> usuarios=dao.findAll();
			return usuarios;
		}

		
		
	}


