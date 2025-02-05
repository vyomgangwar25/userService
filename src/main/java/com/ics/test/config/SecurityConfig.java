package com.ics.test.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
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
	 * @since 04 feb 2025
	 */
	@Bean
	ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

	/**
	 * Rest Template is used for communication between various microservices
	 **/
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
