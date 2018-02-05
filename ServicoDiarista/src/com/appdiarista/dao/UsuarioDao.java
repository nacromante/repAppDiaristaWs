package com.appdiarista.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.appdiarista.model.Usuario;

public class UsuarioDao {
	
private EntityManager em;
	
	public UsuarioDao(EntityManager em) {
		this.em = em;
	}
	
	public Usuario logar(String login, String senha) {
		Usuario usu = null;
		try{
			Query q = em.createQuery("from Usuario u where u.login = :login and u.senha = :senha");
			q.setParameter("login", login);
			q.setParameter("senha", senha);
			usu = (Usuario) q.getSingleResult();
		}catch(NoResultException nr){
			System.out.println("nao retornou nada");
		}
		System.out.println("logar: "+ usu);
		return  usu;
	}
	

}
