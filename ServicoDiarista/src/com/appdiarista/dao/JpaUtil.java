package com.appdiarista.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SeriveDiarista");

	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}


}
