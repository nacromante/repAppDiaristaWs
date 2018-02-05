package com.appdiarista.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.appdiarista.service.HelloWorldResource;
import com.appdiarista.service.UsuarioService;

@ApplicationPath("rs")
public class ApplicationConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		addResourceClasses(resources);
		return resources;
	}

	private void addResourceClasses(Set<Class<?>> resources) {
		resources.add(HelloWorldResource.class);
		resources.add(UsuarioService.class);
		
	}

}
