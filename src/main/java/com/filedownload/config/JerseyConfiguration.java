package com.filedownload.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig {
	/** note that the ApplicationPath will determine what the application will accept **/
	public JerseyConfiguration() {
	}

	@PostConstruct
	public void setUp() {
		//register(BookController.class);
		//register(GenericExceptionMapper.class);
	}
}
