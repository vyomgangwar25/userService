package com.ics.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * SecurityConfig class
 **/
@Configuration
public class SecurityConfig {

	/**
	 * modelMapper bean
	 * 
	 * @author Vyom Gangwar
	 * 
	 */

	/**
	 * Rest Template is used for communication between various microservices
	 **/
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
