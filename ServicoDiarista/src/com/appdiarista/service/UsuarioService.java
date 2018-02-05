package com.appdiarista.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.appdiarista.dao.JpaUtil;
import com.appdiarista.dao.UsuarioDao;
import com.appdiarista.model.Usuario;

@Path("/usuario")
public class UsuarioService {
	
	@GET
	@Path("logar/{login}/{senha}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario logar(@PathParam("login") String login, @PathParam("senha") String senha) {
		System.out.println("login: "+login);
		System.out.println("senha: "+senha);
		UsuarioDao dao = new UsuarioDao(new JpaUtil().getEntityManager());
		return dao.logar(login, senha);
	}

}
