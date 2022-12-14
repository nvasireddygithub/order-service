package com.polarbookshop.orderservice.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {
	
	@Bean
	WebClient webClient( 
			ClientProperties clientProperties,
			WebClient.Builder webClientBuider
			) {
		return webClientBuider
				.baseUrl(clientProperties.catalogServiceUrl().toString())
				.build();
	}
}
