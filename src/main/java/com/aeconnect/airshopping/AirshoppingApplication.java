package com.aeconnect.airshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AirshoppingApplication {

	public static void main(String[] args) {

		SpringApplication.run(AirshoppingApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
	   // AEService aeService = new AEService();
	    //aeService.invokeAEService();
		return new RestTemplate();
	}

}
