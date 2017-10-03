package br.com.udelblue.spring.boot.data.embedded.mongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class CustomizedRestMvcConfiguration extends RepositoryRestMvcConfiguration {

	@Override
	public RepositoryRestConfiguration config() {
		RepositoryRestConfiguration config = super.config();
		config.setBaseUri("/api");
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.setDefaultPageSize(5);
		return config;
	}
}