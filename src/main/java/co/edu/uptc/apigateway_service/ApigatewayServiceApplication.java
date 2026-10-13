package co.edu.uptc.apigateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer 
@SpringBootApplication
public class ApigatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayServiceApplication.class, args);
	}

}
